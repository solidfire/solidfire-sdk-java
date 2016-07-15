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
    public static GetDriveStatsResult getDriveStats(GetDriveStatsRequest request, GetDriveStatsResult result) {

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
