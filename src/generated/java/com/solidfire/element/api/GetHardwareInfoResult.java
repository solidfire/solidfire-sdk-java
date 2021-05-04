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
 * GetHardwareInfoResult  
 **/

public class GetHardwareInfoResult implements Serializable {

    public static final long serialVersionUID = -3439880054194836627L;
    @SerializedName("hardwareInfo") private Attributes hardwareInfo;
    // empty constructor
    @Since("7.0")
    public GetHardwareInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetHardwareInfoResult(
        Attributes hardwareInfo
    )
    {
        this.hardwareInfo = hardwareInfo;
    }

    /** 
     * Hardware information for this node. 
     **/
    public Attributes getHardwareInfo() { return this.hardwareInfo; }
   
    public void setHardwareInfo(Attributes hardwareInfo) { 
        this.hardwareInfo = hardwareInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetHardwareInfoResult that = (GetHardwareInfoResult) o;

        return 
            Objects.equals(hardwareInfo, that.hardwareInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( hardwareInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("hardwareInfo", hardwareInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" hardwareInfo : ").append(gson.toJson(hardwareInfo)).append(",");
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
        private Attributes hardwareInfo;

        private Builder() { }

        public GetHardwareInfoResult build() {
            return new GetHardwareInfoResult (
                         this.hardwareInfo);
        }

        private GetHardwareInfoResult.Builder buildFrom(final GetHardwareInfoResult req) {
            this.hardwareInfo = req.hardwareInfo;

            return this;
        }

        public GetHardwareInfoResult.Builder hardwareInfo(final Attributes hardwareInfo) {
            this.hardwareInfo = hardwareInfo;
            return this;
        }

    }
}
