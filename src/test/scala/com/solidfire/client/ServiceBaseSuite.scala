package com.solidfire.client

import java.io.StringReader

import com.google.gson.stream.JsonReader
import com.google.gson.{Gson, JsonObject}
import com.solidfire.serialization.GsonUtil
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}

/**
  * Created by Jason Ryan Womack on 9/16/15.
  */
class ServiceBaseSuite extends WordSpec with BeforeAndAfter with MockitoSugar with Matchers {

  var serviceBase: ServiceBase = null

  before {
    serviceBase = new ServiceBase( mock[RequestDispatcher] );
  }

  def convertResponseToJsonObject( response: String ): JsonObject = {
    val gson: Gson = GsonUtil.getDefaultBuilder.create
    val reader: JsonReader = new JsonReader( new StringReader( response ) )
    reader.setLenient( true )

    gson.fromJson( reader, classOf[JsonObject] )
  }

  "extractApiError" should {
    "always return a non null instance" in {
      serviceBase.extractApiError( convertResponseToJsonObject( "{}" ) ) should not be null
    }
    "map fields to exception" in {
      val error = serviceBase.extractApiError( convertResponseToJsonObject( "{\"name\":\"aName\", \"code\":\"aCode\", \"message\":\"aMessage\"}" ) )
      error.getName should be( "aName" )
      error.getCode should be( "aCode" )
      error.getMessage should be( "aMessage" )
    }

  }

  "decodeResponseJson" should {
    "throw apiException when the response is null" in {
      the[ApiException] thrownBy {
        serviceBase.decodeResponseJson( null, classOf[Any] )
      } should have message "There was a problem parsing the response from the server. ( response=null )"
    }
    "throw apiException when the response is empty" in {
      the[ApiException] thrownBy {
        serviceBase.decodeResponseJson( "", classOf[Any] )
      } should have message "There was a problem parsing the response from the server. ( response= )"
    }
    "throw apiException when the response is not json" in {
      the[ApiException] thrownBy {
        serviceBase.decodeResponseJson( "I Cause Errors", classOf[Any] )
      } should have message "There was a problem parsing the response from the server. ( response=I Cause Errors )"
    }
  }
}