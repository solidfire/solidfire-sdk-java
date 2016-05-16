package com.solidfire.element.api

import com.solidfire.jsvcgen.client.RequestDispatcher
import com.solidfire.jsvcgen.javautil.Optional
import org.mockito.Matchers._
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

/**
  * Created by Jason Ryan Womack on 5/16/16.
  */
class SolidFireElementSuite extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val Host               = "localhost"
  val Path               = "/rpc-json/8.0"
  val _requestDispatcher = mock[RequestDispatcher]
  val _element           = new SolidFireElement( _requestDispatcher )

  when( _requestDispatcher.getVersion ).thenReturn( "8.0" )

  "listVolumes" should {
    "deserialize volumes" in {
      when( _requestDispatcher.dispatchRequest( anyString ) )
        .thenReturn( """{"id":364,"result":{"volumes":[{"access":"readWrite","accountID":15791,"attributes":{},"createTime":"2016-05-16T16:37:59Z","deleteTime":"","enable512e":false,"iqn":"iqn.2010-01.com.solidfire:u7do.haxejavafodlnq26mixbggj6ukgpmjh2boiqvtpg1z8r7naebirvo3ad26njkxxl.14882","name":"haxejavafodlNq26MiXBggJ6UKGpMJh2bOiQVtPg1z8R7naebirVO3aD26NJkXXl","purgeTime":"","qos":{"burstIOPS":15000,"burstTime":60,"curve":{"1048576":15000,"131072":1950,"16384":270,"262144":3900,"32768":500,"4096":100,"524288":7600,"65536":1000,"8192":160},"maxIOPS":15000,"minIOPS":100},"scsiEUIDeviceID":"7537646f00003a22f47acc0100000000","scsiNAADeviceID":"6f47acc1000000007537646f00003a22","sliceCount":1,"status":"active","totalSize":1000341504,"volumeAccessGroups":[],"volumeID":14882,"volumePairs":[]}]}}""" )

      val responseObject = _element.listVolumes( ListVolumesRequest.builder.build )

      responseObject shouldBe a[ListVolumesResult]
      responseObject should not be null
      responseObject.getVolumes( )( 0 ).getDeleteTime should be( Optional.of("") )
      responseObject.getVolumes( )( 0 ).getPurgeTime should be( Optional.of("") )

    }
  }

}
