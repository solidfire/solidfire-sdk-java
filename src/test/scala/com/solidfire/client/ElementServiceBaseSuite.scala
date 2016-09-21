package com.solidfire.client

import com.solidfire.adaptor.ScheduleAdaptor.{DAYS_OF_MONTH, DAYS_OF_WEEK, FREQUENCY, TIME_INTERVAL}
import com.solidfire.element.api._
import com.solidfire.element.apiactual.ApiModifyScheduleRequest
import com.solidfire.jsvcgen.client.RequestDispatcher
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

import scala.collection.JavaConverters._
import scala.util.Random.alphanumeric

/**
  * Created by Jason Ryan Womack on 5/31/16.
  */
class ElementServiceBaseSuite extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val Host               = "localhost"
  val Path               = "/rpc-json/8.0"
  val _requestDispatcher = mock[RequestDispatcher]
  val _element           = new ElementServiceBase( _requestDispatcher )

  var modifyAccountRequest : ModifyAccountRequest     = null
  var modifyScheduleRequest: ApiModifyScheduleRequest = null

  when( _requestDispatcher.getVersion ).thenReturn( "8.0" )

  "encodeRequest with CHAPSecret modifications" should {
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

    "encode optionalInitiatorSecret of autoGenerate CHAPSecret as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalInitiatorSecret( CHAPSecret.autoGenerate( ) ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(""""initiatorSecret":null""" )
    }

    "encode optionalTargetSecret of autoGenerate CHAPSecret as null" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalTargetSecret( CHAPSecret.autoGenerate( ) ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(""""targetSecret":null""" )
    }

    "encode optionalInitiatorSecret" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalInitiatorSecret( new CHAPSecret( alphanumeric.take( 16 ).mkString ) ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should
        include(s""""initiatorSecret":"${modifyAccountRequest.getInitiatorSecret.get.getSecret}"""" )
    }

    "encode optionalTargetSecret" in {
      modifyAccountRequest = ModifyAccountRequest.builder( ).accountID( 1L ).optionalTargetSecret( new CHAPSecret( alphanumeric.take( 16 ).mkString ) ).build( )
      _element.encodeRequest( "ModifyAccount", modifyAccountRequest, classOf[ModifyAccountRequest] ) should include(s""""targetSecret":"${modifyAccountRequest.getTargetSecret.get.getSecret}"""" )
    }
  }

  "encodeRequest with ModifySchedule" should {
    "not change anything when no attributes of frequency type are contained" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should not include "monthdays"
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should not include "weekdays"
    }

    "set monthdays to null and weekdays to null when frequency type is Time Interval" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).optionalAttributes( Map( FREQUENCY -> TIME_INTERVAL.asInstanceOf[AnyRef] ).asJava ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should include(""""params":{"monthdays":null,"weekdays":null""" )
    }

    "set monthdays to null when frequency type is Days Of Week" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).optionalAttributes( Map( FREQUENCY -> DAYS_OF_WEEK.asInstanceOf[AnyRef] ).asJava ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should include(""""params":{"monthdays":null,""" )
    }

    "not set weekdays to null when frequency type is Days Of Week" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).optionalAttributes( Map( FREQUENCY -> DAYS_OF_WEEK.asInstanceOf[AnyRef] ).asJava ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should not include "weekdays"
    }

    "set weekdays to null when frequency type is Days of Monty" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).optionalAttributes( Map( FREQUENCY -> DAYS_OF_MONTH.asInstanceOf[AnyRef] ).asJava ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should include(""""params":{"weekdays":null,""" )
    }

    "not set monthdays to null and weekdays to null when frequency type is Time Interval" in {
      modifyScheduleRequest = ApiModifyScheduleRequest.builder( ).scheduleID( 1l ).optionalAttributes( Map( FREQUENCY -> DAYS_OF_MONTH.asInstanceOf[AnyRef] ).asJava ).build( )
      _element.encodeRequest( "ModifySchedule", modifyScheduleRequest, classOf[ApiModifyScheduleRequest] ) should not include "monthdays"
    }


  }
}