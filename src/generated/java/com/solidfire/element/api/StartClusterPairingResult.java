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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * StartClusterPairingResult  
 **/

public class StartClusterPairingResult implements Serializable {

    public static final long serialVersionUID = 2209743353678285185L;
    @SerializedName("clusterPairingKey") private String clusterPairingKey;
    @SerializedName("clusterPairID") private Long clusterPairID;
    // empty constructor
    @Since("7.0")
    public StartClusterPairingResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public StartClusterPairingResult(
        String clusterPairingKey,
        Long clusterPairID
    )
    {
        this.clusterPairingKey = clusterPairingKey;
        this.clusterPairID = clusterPairID;
    }

    /** 
     * A string of characters that is used by the "CompleteClusterPairing" API method.
     **/
    public String getClusterPairingKey() { return this.clusterPairingKey; }
   
    public void setClusterPairingKey(String clusterPairingKey) { 
        this.clusterPairingKey = clusterPairingKey;
    }
    /** 
     * Unique identifier for the cluster pair.
     **/
    public Long getClusterPairID() { return this.clusterPairID; }
   
    public void setClusterPairID(Long clusterPairID) { 
        this.clusterPairID = clusterPairID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartClusterPairingResult that = (StartClusterPairingResult) o;

        return 
            Objects.equals(clusterPairingKey, that.clusterPairingKey) && 
            Objects.equals(clusterPairID, that.clusterPairID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterPairingKey,clusterPairID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterPairingKey", clusterPairingKey);
        map.put("clusterPairID", clusterPairID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterPairingKey : ").append(gson.toJson(clusterPairingKey)).append(",");
        sb.append(" clusterPairID : ").append(gson.toJson(clusterPairID)).append(",");
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
        private String clusterPairingKey;
        private Long clusterPairID;

        private Builder() { }

        public StartClusterPairingResult build() {
            return new StartClusterPairingResult (
                         this.clusterPairingKey,
                         this.clusterPairID);
        }

        private StartClusterPairingResult.Builder buildFrom(final StartClusterPairingResult req) {
            this.clusterPairingKey = req.clusterPairingKey;
            this.clusterPairID = req.clusterPairID;

            return this;
        }

        public StartClusterPairingResult.Builder clusterPairingKey(final String clusterPairingKey) {
            this.clusterPairingKey = clusterPairingKey;
            return this;
        }

        public StartClusterPairingResult.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

    }
}
