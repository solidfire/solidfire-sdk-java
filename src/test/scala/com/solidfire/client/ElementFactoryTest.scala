package com.solidfire.client

import com.solidfire.jsvcgen.client._
import com.solidfire.jsvcgen.javautil.Optional.{empty => Empty, of => Of}
import org.mockito.Matchers.{any, eq => EQ}
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

/**
  * Created by Jason Ryan Womack on 8/30/16.
  */
class AbstractFactorySuite extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {
  "testTargetFormat" should {
    "throw an ApiException when an IP address is used with verifySSL=true" in {
      the[ApiException] thrownBy {
        AbstractFactory.testTargetFormat( "127.0.0.1", true )
      } should have message "Cannot verify SSL when target is an IP address. Set verifySSL to false or use a fully qualified domain name."
    }
    "not throw an ApiException when target is not an IP address" in {
      AbstractFactory.testTargetFormat( "hostname", true ) should be( () )
    }
    "not throw an ApiException when target is an IP address and verifySSL=false" in {
      AbstractFactory.testTargetFormat( "127.0.0.1", false ) should be( () )
    }
  }

  "toEndpoint" should {
    "construct a valid URL object" in {
      AbstractFactory.toEndpoint( "hostname", Empty[Integer], 0.0 ).toExternalForm should be( "https://hostname/json-rpc/0.0" )
    }
    "construct a valid URL object, including port number when supplied" in {
      AbstractFactory.toEndpoint( "hostname", Of( 442 ), 0.0 ).toExternalForm should be( "https://hostname:442/json-rpc/0.0" )
    }
  }
}

class TestFactorySuite extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val mockDispatcher = mock[HttpsRequestDispatcherWithoutSSLVerification]
  val testFactory    = new TestFactory( mockDispatcher )

  "buildRequestDispatcher" should {
    "return correct dispatcher with only hostname and verifySSL=true" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Empty[String], Empty[String], Empty[String], true ) shouldBe a[HttpsRequestDispatcher]
    }
    "return correct dispatcher with only hostname and verifySSL=false" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Empty[String], Empty[String], Empty[String], false ) shouldBe a[HttpsRequestDispatcherWithoutSSLVerification]
    }
    "return correct dispatcher with hostname, username, password and verifySSL=true" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Of( "username" ), Of( "password" ), Empty[String], true ) shouldBe a[HttpsRequestDispatcher]
    }
    "return correct dispatcher with hostname, username, password and verifySSL=false" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Of( "username" ), Of( "password" ), Empty[String], false ) shouldBe a[HttpsRequestDispatcherWithoutSSLVerification]
    }
    "return dispatcher with the correct api version when supplied" in {
      val dispatcher = testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Empty[String], Empty[String], Of( "6.0" ), true ).asInstanceOf[HttpsRequestDispatcher]
      dispatcher.getEndpoint.toString should endWith( "/json-rpc/6.0" )
    }
    "return dispatcher with the minimum api version when api version is not given" in {
      val dispatcher = testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Empty[String], Empty[String], Empty[String], true ).asInstanceOf[HttpsRequestDispatcher]
      dispatcher.getEndpoint.toString should endWith( "/json-rpc/5.0" )
    }
    "throw exception when version supplied does not parse to a double" in {
      the[ApiException] thrownBy {
        testFactory.buildRequestDispatcher( "hostname", Empty[Integer], Empty[String], Empty[String], Of("fivedotzero"), true )
      } should have message "Unable to determine version to connect from value: fivedotzero"
    }

  }

  "checkVersion" should {
    when( mockDispatcher.dispatchRequest( any[String] ) )
      .thenReturn("""{"id":1,"result":{"currentVersion":"11.0","supportedVersions":["1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0","9.0","10.0","11.0","12.0"]}}""" )

    def getEndpoint( serviceBase: ServiceBase ): String = serviceBase.getRequestDispatcher.asInstanceOf[HttpsRequestDispatcher].getEndpoint.toString
    "assign max version when version is not passed and current version is greater" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Empty[String], false ) ) should endWith( "/json-rpc/10.0" )
    }
    "assign greater then max version when valid version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("12.0"), false ) ) should endWith( "/json-rpc/12.0" )
    }
    "assign lower then max version when valid version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("8.0"), false ) ) should endWith( "/json-rpc/8.0" )
    }
    "assign the min version when min version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("5.0"), false ) ) should endWith( "/json-rpc/5.0" )
    }
    "throw exception when version supplied does not parse to a double" in {
      testFactory.resetFirstPass()
      the[ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("fivedotzero"), false )
      } should have message "Unable to determine version to connect from value: fivedotzero"
    }
    "throw exception when version supplied is less then the minimum version" in {
      testFactory.resetFirstPass()
      the[ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("4.0"), false )
      } should have message "Cannot connect to a version lower than supported by the SDK. Connect at 5.0 or higher."
    }
    "throw exception when version supplied is not a valid version" in {
      testFactory.resetFirstPass()
      the[ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], Empty[String], Empty[String], Of("8.1"), false )
      } should have message "Invalid version to connect on this cluster. Valid versions are: 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, or 12.0"
    }
  }

}

class TestElement( requestDispatcher: RequestDispatcher ) extends ServiceBase( requestDispatcher ) {}

abstract class AbstractTestFactory extends AbstractFactory[TestElement] {
  override protected def getMinApiVersion: Double = 5.0

  override protected def getMaxApiVersion: Double = 10.0
}

class TestFactory( mockRequestDispatcher: RequestDispatcher ) extends AbstractTestFactory {
  var isFirstPass = true
  def resetFirstPass() = isFirstPass = true
  override protected def toServiceBase( requestDispatcher: RequestDispatcher ): TestElement = {
    if (isFirstPass) {
      isFirstPass = false
      new TestElement( mockRequestDispatcher )
    } else {
      isFirstPass = true
      new TestElement( requestDispatcher )
    }
  }
}

