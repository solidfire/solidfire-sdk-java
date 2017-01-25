package com.solidfire.util

import com.solidfire.core.serialization
import com.solidfire.core.serialization.OptionalAdaptorUtils
import com.solidfire.gson.{Gson, GsonBuilder, JsonObject}
import com.solidfire.core.serialization.{ArrayAdaptorUtils, GsonUtil}

import scala.io.Source
import scala.reflect.ClassTag

object Utility {
  private val gsonBuilder: GsonBuilder = serialization.GsonUtil.getDefaultBuilder
  val gson: Gson = gsonBuilder.create

  def getResultFromResource[T](resourceName: String)(implicit ct: ClassTag[T]): T = {
    val reader = Source.fromURL(getClass.getResource(s"/$resourceName")).mkString
    val json = gson.fromJson(reader, classOf[JsonObject])
    val result = gson.fromJson[T](json.get("result"), ct.runtimeClass)
    OptionalAdaptorUtils.initializeAllNullOptionalFieldsAsEmpty(result)
    serialization.ArrayAdaptorUtils.convertAllArrayListsToArrays(result)
    result
  }

}