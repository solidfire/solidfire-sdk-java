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
 * GetIpmiInfoNodesResultObject  
 **/

public class GetIpmiInfoNodesResultObject implements Serializable {

    public static final long serialVersionUID = 4215854709734138346L;
    @SerializedName("ipmiInfo") private IpmiInfo ipmiInfo;

    // empty constructor
    @Since("7.0")
    public GetIpmiInfoNodesResultObject() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetIpmiInfoNodesResultObject(
        IpmiInfo ipmiInfo
    )
    {
        this.ipmiInfo = ipmiInfo;
    }

    /** 
     **/
    public IpmiInfo getIpmiInfo() { return this.ipmiInfo; }
    public void setIpmiInfo(IpmiInfo ipmiInfo) { 
        this.ipmiInfo = ipmiInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetIpmiInfoNodesResultObject that = (GetIpmiInfoNodesResultObject) o;

        return 
            Objects.equals(ipmiInfo, that.ipmiInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( ipmiInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("ipmiInfo", ipmiInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" ipmiInfo : ").append(ipmiInfo).append(",");
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
        private IpmiInfo ipmiInfo;

        private Builder() { }

        public GetIpmiInfoNodesResultObject build() {
            return new GetIpmiInfoNodesResultObject (
                         this.ipmiInfo);
        }

        private GetIpmiInfoNodesResultObject.Builder buildFrom(final GetIpmiInfoNodesResultObject req) {
            this.ipmiInfo = req.ipmiInfo;

            return this;
        }

        public GetIpmiInfoNodesResultObject.Builder ipmiInfo(final IpmiInfo ipmiInfo) {
            this.ipmiInfo = ipmiInfo;
            return this;
        }

    }
}
