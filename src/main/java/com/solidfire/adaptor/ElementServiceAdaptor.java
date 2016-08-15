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

import com.solidfire.element.api.*;

/**
 * Created by Jason Ryan Womack on 7/14/16.
 */
public class ElementServiceAdaptor {

    /**
     *  This adaptor includes the original Node ID from the request in the response object.
     *  It is returned as null from the original API call.
     *
     * @param request The original request object.
     * @param result The result object from the api call.
     * @return a GetNodeStatsResult object with the nodeID matching the original request, instead of null.
     */
    public static GetNodeStatsResult getNodeStats(GetNodeStatsRequest request, GetNodeStatsResult result) {
        if(request == null) throw new IllegalArgumentException("GetNodeStatsRequest was null");
        if(request.getNodeID() == null) throw new IllegalArgumentException("GetNodeStatsRequest.getNodeID() was null");

        if(result == null) throw new IllegalArgumentException("GetNodeStatsResult was null");
        if(result.getNodeStats() == null) throw new IllegalArgumentException("GetNodeStatsResult.getNodeStats() was null");

        NodeStatsInfo nodeStatsInfo = result.getNodeStats().asBuilder().nodeID(request.getNodeID()).build();

        return result.asBuilder().nodeStats(nodeStatsInfo).build();
    }


    /**
     *  This adaptor sets the default values of Read/Write Ops/Bytes to zero, instead of null.  These values are used
     *  heavily in calculations and guaranteeing they will be a default value, lessens the burden for developers when
     *  performing these calculations.
     *
     * @param request The original request object.
     * @param result The result object from the api call.
     * @return a GetDriveStatsResult with Read/Write Opts/Bytes set to 0L when they were null.
     */
<<<<<<< Updated upstream
    public static GetDriveStatsResult getDriveStats(GetDriveStatsRequest request, GetDriveStatsResult result) {
=======
    public static GetDriveStatsResult getDriveStats(final SolidFireElement sfe, final GetDriveStatsRequest request) {
        if (sfe == null) throw new IllegalArgumentException("SolidFireElement was null");

        if (request == null) throw new IllegalArgumentException("GetDriveStatsRequest was null");
>>>>>>> Stashed changes

        if(result == null) throw new IllegalArgumentException("GetDriveStatsResult was null");
        if(result.getDriveStats() == null) throw new IllegalArgumentException("GetDriveStatsResult.getDriveStats() was null");

        final DriveStats driveStats = result.getDriveStats();
        final DriveStats.Builder builder = driveStats.asBuilder();

        if(driveStats.getReadBytes() == null) {
            builder.readBytes(0L);
        }

        if(driveStats.getWriteBytes() == null) {
            builder.writeBytes(0L);
        }

        if(driveStats.getReadOps() == null) {
            builder.readOps(0L);
        }

        if(driveStats.getWriteOps() == null) {
            builder.writeOps(0L);
        }

        return result.asBuilder().driveStats(builder.build()).build();
    }
}
