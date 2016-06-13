package com.solidfire.client

import com.solidfire.element.api.ModifyAccountRequest
import com.solidfire.jsvcgen.client.RequestDispatcher
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

import scala.util.Random.alphanumeric

/**
  * Created by Jason Ryan Womack on 5/31/16.
  */
class ElementServiceBaseSuite extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val Host               = "localhost"
  val Path               = "/rpc-json/8.0"
  val _requestDispatcher = mock[RequestDispatcher]
  val _element           = new ElementServiceBase( _requestDispatcher )

  var modifyAccountRequest: ModifyAccountRequest = null

  when( _requestDispatcher.getVersion ).thenReturn( "8.0" )

  "encodeRequest" should {
    "not encode optionalInitiatorSecret of Empty as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should not include """"initiatorSecret":"""
    }

    "not encode optionalTargetSecret of Empty as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should not include """"targetSecret":"""
    }

    "not encode optionalInitiatorSecret of null as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalInitiatorSecret( null ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should not include """"initiatorSecret""""
    }

    "not encode optionalTargetSecret of null as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalTargetSecret( null ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should not include """"targetSecret""""
    }

    "encode optionalInitiatorSecret of empty String as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalInitiatorSecret( "" ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(""""initiatorSecret":null""" )
    }

    "encode optionalTargetSecret of empty String as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalTargetSecret( "" ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(""""targetSecret":null""" )
    }

    "encode optionalInitiatorSecret" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalInitiatorSecret( alphanumeric.take( 16 ).mkString ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(s""""initiatorSecret":"${modifyAccountRequest.getInitiatorSecret.get}"""" )
    }

    "encode optionalTargetSecret" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalTargetSecret( alphanumeric.take( 16 ).mkString ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(s""""targetSecret":"${modifyAccountRequest.getTargetSecret.get}"""" )
    }

  }
}
