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
 * ListProtocolEndpointsRequest  
 * Gets protocol endpoints in the system
 * If protocolEndpointIDs isn't specified all protocol endpoints
 * are returned. Else the supplied protocolEndpointIDs are.
 **/

public class ListProtocolEndpointsRequest implements Serializable {

    public static final long serialVersionUID = -3085332745445238309L;
    @SerializedName("protocolEndpointIDs") private Optional<java.util.UUID[]> protocolEndpointIDs;

    // empty constructor
    @Since("7.0")
    public ListProtocolEndpointsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListProtocolEndpointsRequest(
        Optional<java.util.UUID[]> protocolEndpointIDs
    )
    {
        this.protocolEndpointIDs = (protocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : protocolEndpointIDs;
    }

    /** 
     * 
     **/
    public Optional<java.util.UUID[]> getProtocolEndpointIDs() { return this.protocolEndpointIDs; }
    public void setProtocolEndpointIDs(Optional<java.util.UUID[]> protocolEndpointIDs) { 
        this.protocolEndpointIDs = (protocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : protocolEndpointIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListProtocolEndpointsRequest that = (ListProtocolEndpointsRequest) o;

        return 
            Objects.equals(protocolEndpointIDs, that.protocolEndpointIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protocolEndpointIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protocolEndpointIDs", protocolEndpointIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != protocolEndpointIDs && protocolEndpointIDs.isPresent()){
            sb.append(" protocolEndpointIDs : ").append(protocolEndpointIDs).append(",");
        }
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
        private Optional<java.util.UUID[]> protocolEndpointIDs;

        private Builder() { }

        public ListProtocolEndpointsRequest build() {
            return new ListProtocolEndpointsRequest (
                         this.protocolEndpointIDs);
        }

        private ListProtocolEndpointsRequest.Builder buildFrom(final ListProtocolEndpointsRequest req) {
            this.protocolEndpointIDs = req.protocolEndpointIDs;

            return this;
        }

        public ListProtocolEndpointsRequest.Builder optionalProtocolEndpointIDs(final java.util.UUID[] protocolEndpointIDs) {
            this.protocolEndpointIDs = (protocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(protocolEndpointIDs);
            return this;
        }

    }
}
