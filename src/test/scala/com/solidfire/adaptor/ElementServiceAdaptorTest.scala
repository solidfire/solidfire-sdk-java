package com.solidfire.adaptor

import com.solidfire.element.api._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{Matchers, BeforeAndAfterAll, WordSpec}
import com.solidfire.adaptor.ElementServiceAdaptor._

import scala.util.Random

/**
  * Created by Jason Ryan Womack on 7/15/16.
  */
class ElementServiceAdaptorTest extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  "getNodeStats" should {
    "throw IllegalArgumentException when request is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( null, null )
      } should have message "GetNodeStatsRequest was null"
    }
    "throw IllegalArgumentException when request node ID is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( GetNodeStatsRequest.builder().build(), null )
      } should have message "GetNodeStatsRequest.getNodeID() was null"
    }
    "throw IllegalArgumentException when response is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( new GetNodeStatsRequest(1L), null )
      } should have message "GetNodeStatsResult was null"
    }
    "throw IllegalArgumentException when response node stats is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( new GetNodeStatsRequest(1L), GetNodeStatsResult.builder().build() )
      } should have message "GetNodeStatsResult.getNodeStats() was null"
    }

    "map the request node id to the result node stats node id" in {
      val request:GetNodeStatsRequest = new GetNodeStatsRequest(Random.nextLong())
      val result = GetNodeStatsResult.builder().nodeStats(NodeStatsInfo.builder().build()).build()

      getNodeStats( request, result ).getNodeStats.getNodeID should be (request.getNodeID)
    }
  }

  "getDriveStats" should {
    "throw IllegalArgumentException when response is null" in {
      the[IllegalArgumentException] thrownBy {
        getDriveStats( null, null )
      } should have message "GetDriveStatsResult was null"
    }
    "throw IllegalArgumentException when response node stats is null" in {
      the[IllegalArgumentException] thrownBy {
        getDriveStats( null, GetDriveStatsResult.builder().build() )
      } should have message "GetDriveStatsResult.getDriveStats() was null"
    }

    "map the request node id to the result node stats node id" in {
      val result = getDriveStats( null, GetDriveStatsResult.builder().driveStats(DriveStats.builder().build()).build() )
      result.getDriveStats.getReadBytes should be (0L)
      result.getDriveStats.getWriteBytes should be (0L)
      result.getDriveStats.getReadOps should be (0L)
      result.getDriveStats.getWriteOps should be (0L)
    }
  }
}
