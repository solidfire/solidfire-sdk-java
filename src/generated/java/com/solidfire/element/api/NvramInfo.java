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
 * NvramInfo  
 **/

public class NvramInfo implements Serializable {

    public static final long serialVersionUID = -4544302672724653100L;
    @SerializedName("details") private Attributes details;
    @SerializedName("status") private String status;
    @SerializedName("statusInfo") private Attributes statusInfo;
    @SerializedName("type") private String type;
    // empty constructor
    @Since("7.0")
    public NvramInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public NvramInfo(
        Attributes details,
        String status,
        Attributes statusInfo,
        String type
    )
    {
        this.details = details;
        this.status = status;
        this.statusInfo = statusInfo;
        this.type = type;
    }

    /** 
     * Detailed attributes of the NVRAM device.
     **/
    public Attributes getDetails() { return this.details; }
   
    public void setDetails(Attributes details) { 
        this.details = details;
    }
    /** 
     * Status of the NVRAM device.
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * Detailed status information if the NVRAM device status is not OK.
     **/
    public Attributes getStatusInfo() { return this.statusInfo; }
   
    public void setStatusInfo(Attributes statusInfo) { 
        this.statusInfo = statusInfo;
    }
    /** 
     * Model number of the NVRAM device.
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NvramInfo that = (NvramInfo) o;

        return 
            Objects.equals(details, that.details) && 
            Objects.equals(status, that.status) && 
            Objects.equals(statusInfo, that.statusInfo) && 
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash( details,status,statusInfo,type );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("details", details);
        map.put("status", status);
        map.put("statusInfo", statusInfo);
        map.put("type", type);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" details : ").append(gson.toJson(details)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" statusInfo : ").append(gson.toJson(statusInfo)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
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
        private Attributes details;
        private String status;
        private Attributes statusInfo;
        private String type;

        private Builder() { }

        public NvramInfo build() {
            return new NvramInfo (
                         this.details,
                         this.status,
                         this.statusInfo,
                         this.type);
        }

        private NvramInfo.Builder buildFrom(final NvramInfo req) {
            this.details = req.details;
            this.status = req.status;
            this.statusInfo = req.statusInfo;
            this.type = req.type;

            return this;
        }

        public NvramInfo.Builder details(final Attributes details) {
            this.details = details;
            return this;
        }

        public NvramInfo.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public NvramInfo.Builder statusInfo(final Attributes statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }

        public NvramInfo.Builder type(final String type) {
            this.type = type;
            return this;
        }

    }
}
