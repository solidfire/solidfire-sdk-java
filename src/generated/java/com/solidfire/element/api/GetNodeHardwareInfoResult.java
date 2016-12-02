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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetNodeHardwareInfoResult implements Serializable {

    public static final long serialVersionUID = -3553623158556209250L;
    @SerializedName("nodeHardwareInfo") private LinkedTreeMap<String, Object> nodeHardwareInfo;

    // empty constructor
    @Since("7.0")
    public GetNodeHardwareInfoResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetNodeHardwareInfoResult(
        LinkedTreeMap<String, Object> nodeHardwareInfo
    )
    {
        this.nodeHardwareInfo = nodeHardwareInfo;
    }

    /** 
     * Hardware information for the specified nodeID.
     **/
    public LinkedTreeMap<String, Object> getNodeHardwareInfo() { return this.nodeHardwareInfo; }
    public void setNodeHardwareInfo(LinkedTreeMap<String, Object> nodeHardwareInfo) { 
        this.nodeHardwareInfo = nodeHardwareInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeHardwareInfoResult that = (GetNodeHardwareInfoResult) o;

        return 
            Objects.equals(nodeHardwareInfo, that.nodeHardwareInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeHardwareInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeHardwareInfo", nodeHardwareInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeHardwareInfo : ").append(nodeHardwareInfo).append(",");
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
        private LinkedTreeMap<String, Object> nodeHardwareInfo;

        private Builder() { }

        public GetNodeHardwareInfoResult build() {
            return new GetNodeHardwareInfoResult (
                         this.nodeHardwareInfo);
        }

        private GetNodeHardwareInfoResult.Builder buildFrom(final GetNodeHardwareInfoResult req) {
            this.nodeHardwareInfo = req.nodeHardwareInfo;

            return this;
        }

        public GetNodeHardwareInfoResult.Builder nodeHardwareInfo(final LinkedTreeMap<String, Object> nodeHardwareInfo) {
            this.nodeHardwareInfo = nodeHardwareInfo;
            return this;
        }

    }
}
