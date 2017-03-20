/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.solidfire.adaptor;

import com.solidfire.core.client.Attributes;
import com.solidfire.element.api.*;

/**
 * Created by Jason Ryan Womack on 7/14/16.
 */
public class ElementServiceAdaptor {

    /**
     * This adaptor includes the original Node ID from the request in the response object.
     * It is returned as null from the original API call.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a GetNodeStatsResult object with the nodeID matching the original request, instead of null.
     */
    public static GetNodeStatsResult getNodeStats(final SolidFireElement sfe, final GetNodeStatsRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("GetNodeStatsRequest was null");
        if (request.getNodeID() == null) throw new IllegalArgumentException("GetNodeStatsRequest.getNodeID() was null");

        final GetNodeStatsResult result = sfe.sendRequest("GetNodeStats", request, GetNodeStatsRequest.class, GetNodeStatsResult.class);

        NodeStatsInfo nodeStatsInfo = result.getNodeStats().asBuilder().nodeID(request.getNodeID()).build();

        return result.asBuilder().nodeStats(nodeStatsInfo).build();
    }


    /**
     * This adaptor sets the default values of Read/Write Ops/Bytes to zero, instead of null.  These values are used
     * heavily in calculations and guaranteeing they will be a default value, lessens the burden for developers when
     * performing these calculations.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a GetDriveStatsResult with Read/Write Opts/Bytes set to 0L when they were null.
     */
    public static GetDriveStatsResult getDriveStats(final SolidFireElement sfe, final GetDriveStatsRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("GetDriveStatsRequest was null");

        final GetDriveStatsResult result = sfe.sendRequest("GetDriveStats", request, GetDriveStatsRequest.class, GetDriveStatsResult.class);

        final DriveStats driveStats = result.getDriveStats();
        final DriveStats.Builder builder = driveStats.asBuilder();

        if (driveStats.getReadBytes() == null) {
            builder.readBytes(0L);
        }

        if (driveStats.getWriteBytes() == null) {
            builder.writeBytes(0L);
        }

        if (driveStats.getReadOps() == null) {
            builder.readOps(0L);
        }

        if (driveStats.getWriteOps() == null) {
            builder.writeOps(0L);
        }

        return result.asBuilder().driveStats(builder.build()).build();
    }

    /**
     * This adaptor modifies the ApiSchedule object returned by the GetSchedule API call into a Simple Schedule
     * object using the Frequency classes that delineate different types of scheduling frequencies.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a GetScheduleResult with the modified simple schedule object
     * @see com.solidfire.element.api.Frequency
     */
    public static GetScheduleResult getSchedule(final SolidFireElement sfe, final GetScheduleRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("GetScheduleRequest was null");
        return ScheduleAdaptor.getSchedule(sfe, request);
    }

    /**
     * This adaptor modifies the ApiSchedule object returned by the ListSchedules API call into a Simple Schedule
     * object using the Frequency classes that delineate different types of scheduling frequencies.
     *
     * @param sfe     An instance of SolidFireElement
     * @return a ListScheduleResult with the modified simple schedule objects
     */
    public static ListSchedulesResult listSchedules(final SolidFireElement sfe) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        return ScheduleAdaptor.listSchedules(sfe);
    }

    /**
     * This adaptor modifies the Simple Schedule object, which uses the Frequency classes that delineate different types
     * of scheduling frequencies, into an ApiSchedule object. This API object is passed into the CreateSchedule API call.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a CreateScheduleResult
     */
    public static CreateScheduleResult createSchedule(final SolidFireElement sfe, final CreateScheduleRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("CreateScheduleRequest was null");
        return ScheduleAdaptor.createSchedule(sfe, request);
    }

    /**
     * This adaptor modifies the Simple Schedule object, which uses the Frequency classes that delineate different types
     * of scheduling frequencies, into an ApiSchedule object. This API object is passed into the CreateSchedule API call.
     * The result of the API call is then transformed back into a Simple Schedule object.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a ModifyScheduleResult with the modified simple schedule objects
     */
    public static ModifyScheduleResult modifySchedule(final SolidFireElement sfe, final ModifyScheduleRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("ModifyScheduleRequest was null");

        if (request.getSchedule().getScheduleID() == null) throw new IllegalArgumentException("ScheduleID is missing. Cannot modify a schedule without a ScheduleID");

        return ScheduleAdaptor.modifySchedule(sfe, request);
    }


    public static Attributes invokeSFApi(final SolidFireElement sfe, final InvokeSFApiRequest request){

        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("InvokeSFApiRequest was null");

        if (request.getMethod() == null) throw new IllegalArgumentException("InvokeSFApiRequest GetMethod was null");

        return sfe.sendRequest(request.getMethod(), request.getParameters(), Object.class, Attributes.class);

    }
}
