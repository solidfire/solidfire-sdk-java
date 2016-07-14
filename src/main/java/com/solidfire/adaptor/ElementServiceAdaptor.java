package com.solidfire.adaptor;

import com.solidfire.element.api.GetNodeStatsRequest;
import com.solidfire.element.api.GetNodeStatsResult;
import com.solidfire.element.api.NodeStatsInfo;

/**
 * Created by Jason Ryan Womack on 7/14/16.
 */
public class ElementServiceAdaptor {

    public static GetNodeStatsResult getNodeStats(GetNodeStatsRequest request, GetNodeStatsResult result) {

        NodeStatsInfo nodeStatsInfo = result.getNodeStats().asBuilder().nodeID(request.getNodeID()).build();

        return result.asBuilder().nodeStats(nodeStatsInfo).build();
    }
}
