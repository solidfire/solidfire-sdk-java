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
/*
 * DO NOT EDIT THIS CODE BY HAND! It has been generated with jsvcgen.
 */
package com.solidfire.element.api;

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class RemoveClusterPairRequest implements Serializable {

    public static final long serialVersionUID = -6696513351448610827L;
    @SerializedName("clusterPairID") private Long clusterPairID;

    // empty constructor
    @Since("7.0")
    public RemoveClusterPairRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveClusterPairRequest(
        Long clusterPairID
    )
    {
        this.clusterPairID = clusterPairID;
    }

    /** 
     * Unique identifier used to pair two clusters.
     **/
    public Long getClusterPairID() { return this.clusterPairID; }
    public void setClusterPairID(Long clusterPairID) { 
        this.clusterPairID = clusterPairID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveClusterPairRequest that = (RemoveClusterPairRequest) o;

        return 
            Objects.equals(clusterPairID, that.clusterPairID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterPairID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterPairID", clusterPairID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairID : ").append(clusterPairID).append(",");
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long clusterPairID;

        private Builder() { }

        public RemoveClusterPairRequest build() {
            return new RemoveClusterPairRequest (
                         this.clusterPairID);
        }

        private RemoveClusterPairRequest.Builder buildFrom(final RemoveClusterPairRequest req) {
            this.clusterPairID = req.clusterPairID;

            return this;
        }

        public RemoveClusterPairRequest.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

    }
}
