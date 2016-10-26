package com.solidfire.api

import com.solidfire.element.api._
import com.solidfire.jsvcgen.javautil.Optional
import com.solidfire.util.Utility
import org.mockito.Mockito.when
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class SolidFireElementTests extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val sfe = mock[SolidFireElement]

  "GetClusterHardwareInfo" should {
    "Deserialize mock results properly" in {
      val returned = Utility.getResultFromResource[GetClusterHardwareInfoResult]("GetClusterHardwareInfo_v9.json")
      val request = new GetClusterHardwareInfoRequest(Optional.EMPTY_STRING)

      when( sfe.getClusterHardwareInfo(request)).thenReturn( returned )

      val result = sfe.getClusterHardwareInfo(request);
      result.getClusterHardwareInfo.getDrives.size() should be (2);
      result.getClusterHardwareInfo.getNodes.size() should be (1);
      result.getClusterHardwareInfo.getNodes.get("1")
        .get("bus").asInstanceOf[java.util.Map[String, Object]]
        .get("core_DMI:0002").asInstanceOf[java.util.Map[String, Object]]
        .get("description") should be ("Motherboard")

    }
  }
}
