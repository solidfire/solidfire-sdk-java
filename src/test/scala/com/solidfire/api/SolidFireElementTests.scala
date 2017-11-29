package com.solidfire.api

import java.util

import com.solidfire.core.client.Attributes
import com.solidfire.core.javautil.Optional
import com.solidfire.element.api._
import com.solidfire.util.Utility
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito.when
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class SolidFireElementTests extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val sfe = mock[SolidFireElement]

  "ListAllNodes" should {
    "Deserialize mock results properly" in {
      val returned = Utility.getResultFromResource[ListAllNodesResult]("ListAllNodes.json")

      when( sfe.listAllNodes()).thenReturn( returned )

      val result = sfe.listAllNodes()

      val thing = 1
    }
  }

  "Attributes property" should {
    "accept an Attributes" in {
      val attributes = new Attributes()
      attributes.put("this", "that")

      val request = CreateVolumeRequest.builder()
        .accountID(1l)
        .enable512e(true)
        .name("name")
        .totalSize(10l)
        .optionalAttributes(attributes)
        .build()
      assert(request.getAttributes.get().get("this") == "that")
    }
  }
  "Attributes class" should {
    "created by HashMap" in {
      val hashmap = new util.HashMap[String, Object]()
      hashmap.put("this", "that")
      val attributes = new Attributes(hashmap)

      val request = CreateVolumeRequest.builder()
        .accountID(1l)
        .enable512e(true)
        .name("name")
        .totalSize(10l)
        .optionalAttributes(attributes)
        .build()
      assert(request.getAttributes.get().get("this") == "that")
    }
  }
  "Attributes class" should {
    "created by TreeMap" in {
      val treemap = new util.TreeMap[String, Object]()
      treemap.put("this", "that")
      val attributes = new Attributes(treemap)

      val request = CreateVolumeRequest.builder()
        .accountID(1l)
        .enable512e(true)
        .name("name")
        .totalSize(10l)
        .optionalAttributes(attributes)
        .build()

      assert(request.getAttributes.get().get("this") == "that")
    }
  }

}
