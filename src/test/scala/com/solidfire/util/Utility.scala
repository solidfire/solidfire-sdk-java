package com.solidfire.util

import com.solidfire.gson.{Gson, GsonBuilder, JsonObject}
import com.solidfire.jsvcgen.serialization.{ArrayAdaptorUtils, GsonUtil, OptionalAdaptorUtils}

import scala.io.Source

object Utility {
  private val gsonBuilder: GsonBuilder = GsonUtil.getDefaultBuilder
  val gson: Gson = gsonBuilder.create

  def getResultFromResource(resourceName: String): Object = {
    val reader = Source.fromURL(getClass.getResource(s"/$resourceName")).mkString
    val json = gson.fromJson(reader, classOf[JsonObject]);
    var result = gson.fromJson(json.get("result"), classOf[Object])
    OptionalAdaptorUtils.initializeAllNullOptionalFieldsAsEmpty(result)
    ArrayAdaptorUtils.convertAllArrayListsToArrays(result)
    result
  }

}