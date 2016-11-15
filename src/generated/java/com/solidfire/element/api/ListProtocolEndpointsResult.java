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

public class ListProtocolEndpointsResult implements Serializable {

    public static final long serialVersionUID = -170373092149743734L;
    @SerializedName("protocolEndpoints") private ProtocolEndpoint[] protocolEndpoints;

    // empty constructor
    @Since("7.0")
    public ListProtocolEndpointsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListProtocolEndpointsResult(
        ProtocolEndpoint[] protocolEndpoints
    )
    {
        this.protocolEndpoints = protocolEndpoints;
    }

    /** 
     **/
    public ProtocolEndpoint[] getProtocolEndpoints() { return this.protocolEndpoints; }
    public void setProtocolEndpoints(ProtocolEndpoint[] protocolEndpoints) { 
        this.protocolEndpoints = protocolEndpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListProtocolEndpointsResult that = (ListProtocolEndpointsResult) o;
        return 
            Objects.equals(protocolEndpoints, that.protocolEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])protocolEndpoints );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protocolEndpoints", protocolEndpoints);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" protocolEndpoints : ").append(Arrays.toString(protocolEndpoints)).append(",");
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
        private ProtocolEndpoint[] protocolEndpoints;

        private Builder() { }

        public ListProtocolEndpointsResult build() {
            return new ListProtocolEndpointsResult (
                         this.protocolEndpoints);
        }

        private ListProtocolEndpointsResult.Builder buildFrom(final ListProtocolEndpointsResult req) {
            this.protocolEndpoints = req.protocolEndpoints;

            return this;
        }

        public ListProtocolEndpointsResult.Builder protocolEndpoints(final ProtocolEndpoint[] protocolEndpoints) {
            this.protocolEndpoints = protocolEndpoints;
            return this;
        }

    }
}
