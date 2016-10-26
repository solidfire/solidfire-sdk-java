package com.solidfire.util

import com.solidfire.gson.{Gson, GsonBuilder, JsonObject}
import com.solidfire.jsvcgen.serialization.{ArrayAdaptorUtils, GsonUtil, OptionalAdaptorUtils}

import scala.io.Source
import scala.reflect.ClassTag

object Utility {
  private val gsonBuilder: GsonBuilder = GsonUtil.getDefaultBuilder
  val gson: Gson = gsonBuilder.create

  def getResultFromResource[T](resourceName: String)(implicit ct: ClassTag[T]): T = {
    val reader = Source.fromURL(getClass.getResource(s"/$resourceName")).mkString
    val json = gson.fromJson(reader, classOf[JsonObject])
    val result = gson.fromJson[T](json.get("result"), ct.runtimeClass)
    OptionalAdaptorUtils.initializeAllNullOptionalFieldsAsEmpty(result)
    ArrayAdaptorUtils.convertAllArrayListsToArrays(result)
    result
  }

}