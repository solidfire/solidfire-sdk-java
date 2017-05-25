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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetDriveConfigResult  
 **/

public class GetDriveConfigResult implements Serializable {

    public static final long serialVersionUID = -2575844990744405221L;
    @SerializedName("driveConfig") private DrivesConfigInfo driveConfig;
    // empty constructor
    @Since("7.0")
    public GetDriveConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetDriveConfigResult(
        DrivesConfigInfo driveConfig
    )
    {
        this.driveConfig = driveConfig;
    }

    /** 
     * Configuration information for the drives that are connected to the cluster
     **/
    public DrivesConfigInfo getDriveConfig() { return this.driveConfig; }
    public void setDriveConfig(DrivesConfigInfo driveConfig) { 
        this.driveConfig = driveConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetDriveConfigResult that = (GetDriveConfigResult) o;

        return 
            Objects.equals(driveConfig, that.driveConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash( driveConfig );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("driveConfig", driveConfig);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" driveConfig : ").append(driveConfig).append(",");
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
        private DrivesConfigInfo driveConfig;

        private Builder() { }

        public GetDriveConfigResult build() {
            return new GetDriveConfigResult (
                         this.driveConfig);
        }

        private GetDriveConfigResult.Builder buildFrom(final GetDriveConfigResult req) {
            this.driveConfig = req.driveConfig;

            return this;
        }

        public GetDriveConfigResult.Builder driveConfig(final DrivesConfigInfo driveConfig) {
            this.driveConfig = driveConfig;
            return this;
        }

    }
}
