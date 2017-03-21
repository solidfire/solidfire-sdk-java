package com.solidfire.api

import java.util

import com.solidfire.core.client.Attributes
import com.solidfire.element.api._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class SolidFireElementTests extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val sfe = mock[SolidFireElement]

  "GetClusterHardwareInfo" should {
    "Deserialize mock results properly" in {
      /*val returned = Utility.getResultFromResource[GetClusterHardwareInfoResult]("GetClusterHardwareInfo_v9.json")
      val request = new GetClusterHardwareInfoRequest(Optional.EMPTY_STRING)

      when( sfe.getClusterHardwareInfo(request)).thenReturn( returned )

      val result = sfe.getClusterHardwareInfo(request);
      result.getClusterHardwareInfo.getDrives.size() should be (2);
      result.getClusterHardwareInfo.getNodes.size() should be (1);
      result.getClusterHardwareInfo.getNodes.get("1")
        .get("bus").asInstanceOf[java.util.Map[String, Object]]
        .get("core_DMI:0002").asInstanceOf[java.util.Map[String, Object]]
        .get("description") should be ("Motherboard")
      */
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
