package com.solidfire.adaptor;

import com.solidfire.element.api.*;

/**
 * Created by Jason Ryan Womack on 7/14/16.
 */
public class ElementServiceAdaptor {

    public static GetNodeStatsResult getNodeStats(GetNodeStatsRequest request, GetNodeStatsResult result) {

        NodeStatsInfo nodeStatsInfo = result.getNodeStats().asBuilder().nodeID(request.getNodeID()).build();

        return result.asBuilder().nodeStats(nodeStatsInfo).build();
    }

    public static GetDriveStatsResult getDriveStats(GetDriveStatsRequest request, GetDriveStatsResult result) {

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
