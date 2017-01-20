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
 * CompleteClusterPairingRequest  
 **/

public class CompleteClusterPairingRequest implements Serializable {

    public static final long serialVersionUID = -8106961721004963027L;
    @SerializedName("clusterPairingKey") private String clusterPairingKey;

    // empty constructor
    @Since("7.0")
    public CompleteClusterPairingRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CompleteClusterPairingRequest(
        String clusterPairingKey
    )
    {
        this.clusterPairingKey = clusterPairingKey;
    }

    /** 
     * A string of characters that is returned from the "StartClusterPairing" API method.
     **/
    public String getClusterPairingKey() { return this.clusterPairingKey; }
    public void setClusterPairingKey(String clusterPairingKey) { 
        this.clusterPairingKey = clusterPairingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompleteClusterPairingRequest that = (CompleteClusterPairingRequest) o;

        return 
            Objects.equals(clusterPairingKey, that.clusterPairingKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterPairingKey );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterPairingKey", clusterPairingKey);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairingKey : ").append(clusterPairingKey).append(",");
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

        private Builder() { }

        public CompleteClusterPairingRequest build() {
            return new CompleteClusterPairingRequest (
                         this.clusterPairingKey);
        }

        private CompleteClusterPairingRequest.Builder buildFrom(final CompleteClusterPairingRequest req) {
            this.clusterPairingKey = req.clusterPairingKey;

            return this;
        }

        public CompleteClusterPairingRequest.Builder clusterPairingKey(final String clusterPairingKey) {
            this.clusterPairingKey = clusterPairingKey;
            return this;
        }

    }
}
