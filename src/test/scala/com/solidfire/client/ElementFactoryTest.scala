package com.solidfire.client

import com.solidfire.core.client
import com.solidfire.core.client.{ApiConnectionException, ApiException}
import com.solidfire.core.javautil.Optional.{empty => Empty, of => Of}
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
      the[client.ApiException] thrownBy {
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

  val mockDispatcher = mock[client.HttpsRequestDispatcherWithoutSSLVerification]
  val testFactory    = new TestFactory( mockDispatcher )

  "buildRequestDispatcher" should {
    "return correct dispatcher with only hostname and verifySSL=true" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Empty[String], true ) shouldBe a[client.HttpsRequestDispatcher]
    }
    "return correct dispatcher with only hostname and verifySSL=false" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Empty[String], false ) shouldBe a[client.HttpsRequestDispatcherWithoutSSLVerification]
    }
    "return correct dispatcher with hostname, username, password and verifySSL=true" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Empty[String], true ) shouldBe a[client.HttpsRequestDispatcher]
    }
    "return correct dispatcher with hostname, username, password and verifySSL=false" in {
      testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Empty[String], false ) shouldBe a[client.HttpsRequestDispatcherWithoutSSLVerification]
    }
    "return dispatcher with the correct api version when supplied" in {
      val dispatcher = testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Of( "6.0" ), true ).asInstanceOf[client.HttpsRequestDispatcher]
      dispatcher.getEndpoint.toString should endWith( "/json-rpc/6.0" )
    }
    "return dispatcher with the minimum api version when api version is not given" in {
      val dispatcher = testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Empty[String], true ).asInstanceOf[client.HttpsRequestDispatcher]
      dispatcher.getEndpoint.toString should endWith( "/json-rpc/5.0" )
    }
    "throw exception when version supplied does not parse to a double" in {
      the[client.ApiException] thrownBy {
        testFactory.buildRequestDispatcher( "hostname", Empty[Integer], "username", "password", Of( "fivedotzero" ), true )
      } should have message "Unable to determine version to connect from value: fivedotzero"
    }

  }

  "checkVersion" should {
    when( mockDispatcher.dispatchRequest( any[String] ) )
      .thenReturn("""{"id":1,"result":{"currentVersion":"11.0","supportedVersions":["1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0","9.0","10.0","11.0","12.0"]}}""" )

    def getEndpoint( serviceBase: client.ServiceBase ): String = serviceBase.getRequestDispatcher.asInstanceOf[client.HttpsRequestDispatcher].getEndpoint.toString
    "assign max version when version is not passed and current version is greater" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Empty[String], false ) ) should endWith( "/json-rpc/10.0" )
    }
    "assign greater then max version when valid version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "12.0" ), false ) ) should endWith( "/json-rpc/12.0" )
    }
    "assign lower then max version when valid version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "8.0" ), false ) ) should endWith( "/json-rpc/8.0" )
    }
    "assign the min version when min version is supplied" in {
      getEndpoint( testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "5.0" ), false ) ) should endWith( "/json-rpc/5.0" )
    }
    "throw exception when version supplied does not parse to a double" in {
      testFactory.resetFirstPass( )
      the[client.ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "fivedotzero" ), false )
      } should have message "Unable to determine version to connect from value: fivedotzero"
    }
    "throw exception when version supplied is less then the minimum version" in {
      testFactory.resetFirstPass( )
      the[client.ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "4.0" ), false )
      } should have message "Cannot connect to a version lower than supported by the SDK. Connect at 5.0 or higher."
    }
    "throw exception when version supplied is not a valid version" in {
      testFactory.resetFirstPass( )
      the[client.ApiException] thrownBy {
        testFactory.checkVersion( "127.0.0.1", Empty[Integer], "username", "password", Of( "8.1" ), false )
      } should have message "Invalid version to connect on this cluster. Valid versions are: 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, or 12.0"
    }
  }

}

//Tests were written with hardcoded IPs for specific responses. If these are to be used in the future new IP/Hosts most likely need found.
class ElementFactorySuite extends WordSpec with BeforeAndAfterAll with Matchers {
  "create" should {
    "throw a null pointer exception but catch and throw a API instead." ignore { //an host that cant even response to the request
      val thrown = intercept[ApiException] {
        val sf = ElementFactory.create("10.117.60.10", "admin", "admin")
      }
      assert(thrown.getMessage === "400 Bad Request")
    }
    "throw a API exception for bad IP." ignore { //Something thats not an IP
      val thrown = intercept[ApiException] {
        val sf = ElementFactory.create("fdsgt43fdsgfds","admin","admin")
      }
      assert(thrown.getMessage === "Unknown host based on target.")
    }
    "throw a API exception for ok IP but not SF node or cluster(timeout)." ignore { //An IP that does not have a node/cluster, timeout case
      val thrown = intercept[ApiException] {
        val sf = ElementFactory.create("10.117.61.132","admin","admin")
      }
      assert(thrown.getMessage === "Connection timed out. ")
    }
    "throw a API exception for ok IP but not SF node or cluster(connection refused)." ignore { //An IP that does not have a node/cluster, refused connect case
      val thrown = intercept[ApiException] {
        val sf = ElementFactory.create("10.117.61.133","admin","admin")
      }
      assert(thrown.getMessage === "Connection refused. Confirm your target is a SolidFire cluster or node.")
    }
    "throw a API exception for bad credentials." ignore { //Good host with cluster/node, bad credentials
      val thrown = intercept[ApiConnectionException] {
        val sf = ElementFactory.create("10.117.61.129","adn","admin")
      }
      assert(thrown.getMessage === "Bad Credentials.")
    }
    "API should work ok" ignore {
      noException should be thrownBy {
        val sf = ElementFactory.create("10.117.61.129", "admin", "admin", "9.0")
      }

    }
  }
}

class TestElement( requestDispatcher: client.RequestDispatcher ) extends client.ServiceBase( requestDispatcher ) {}

abstract class AbstractTestFactory extends AbstractFactory[TestElement] {
  override protected def getMinApiVersion: Double = 5.0

}

class TestFactory( mockRequestDispatcher: client.RequestDispatcher ) extends AbstractTestFactory {
  var isFirstPass = true

  def resetFirstPass( ) = isFirstPass = true

  override protected def toServiceBase( requestDispatcher: client.RequestDispatcher ): TestElement = {
    if (isFirstPass) {
      isFirstPass = false
      new TestElement( mockRequestDispatcher )
    } else {
      isFirstPass = true
      new TestElement( requestDispatcher )
    }
  }
}

