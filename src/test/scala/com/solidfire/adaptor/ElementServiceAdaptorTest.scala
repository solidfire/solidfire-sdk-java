package com.solidfire.adaptor

import com.solidfire.adaptor.ElementServiceAdaptor._
import com.solidfire.element.api._
import com.solidfire.jsvcgen.client.ApiException
import org.mockito.Mockito.when
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

import scala.util.Random

/**
  * Created by Jason Ryan Womack on 7/15/16.
  */
class ElementServiceAdaptorTest extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val sfe = mock[SolidFireElement]

  "getNodeStats" should {
    "throw IllegalArgumentException when SolidFireElement is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( null, null )
      } should have message "SolidFireElement was null"
    }
    "throw IllegalArgumentException when request is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( sfe, null )
      } should have message "GetNodeStatsRequest was null"
    }
    "throw IllegalArgumentException when request node ID is null" in {
      the[IllegalArgumentException] thrownBy {
        getNodeStats( sfe, GetNodeStatsRequest.builder( ).build( ) )
      } should have message "GetNodeStatsRequest.getNodeID() was null"
    }

    "map the request node id to the result node stats node id" in {
      val request: GetNodeStatsRequest = new GetNodeStatsRequest( Random.nextLong( ) )

      val result = new GetNodeStatsResult( NodeStatsInfo.builder( ).build( ) )

      when( sfe.sendRequest( "GetNodeStats", request, classOf[GetNodeStatsRequest], classOf[GetNodeStatsResult] ) ).thenReturn( result )

      getNodeStats( sfe, request ).getNodeStats.getNodeID should be( request.getNodeID )
    }
  }

  "getDriveStats" should {
    "throw IllegalArgumentException when SolidFireElement is null" in {
      the[IllegalArgumentException] thrownBy {
        getDriveStats( null, null )
      } should have message "SolidFireElement was null"
    }
    "throw IllegalArgumentException when request node stats is null" in {
      the[IllegalArgumentException] thrownBy {
        getDriveStats( sfe, null )
      } should have message "GetDriveStatsRequest was null"
    }

    "map the request node id to the result node stats node id" in {
      val request: GetDriveStatsRequest = new GetDriveStatsRequest( 1L )

      val grsResult = new GetDriveStatsResult( DriveStats.builder( ).build( ) )

      when( sfe.sendRequest( "GetDriveStats", request, classOf[GetDriveStatsRequest], classOf[GetDriveStatsResult] ) ).thenReturn( grsResult )

      val result = getDriveStats( sfe, request )
      result.getDriveStats.getReadBytes should be( 0L )
      result.getDriveStats.getWriteBytes should be( 0L )
      result.getDriveStats.getReadOps should be( 0L )
      result.getDriveStats.getWriteOps should be( 0L )
    }
  }

  "ModifySchedule" should {
    "throw ApiException when scheduleID is not present" in {

      val schedule = Schedule.builder().name("someName").build()
      schedule.setScheduleID(null)
      when (sfe.modifySchedule(schedule)).thenCallRealMethod()
      the [ApiException] thrownBy {
        sfe.modifySchedule(schedule)
      } should have message "ScheduleID is missing. Cannot modify a schedule without a ScheduleID"
    }
  }
}
