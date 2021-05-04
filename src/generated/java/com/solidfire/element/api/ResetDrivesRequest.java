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
 * ResetDrivesRequest  
 * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
 * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
 **/

public class ResetDrivesRequest implements Serializable {

    public static final long serialVersionUID = 563715124487865807L;
    @SerializedName("drives") private String drives;
    @SerializedName("force") private Boolean force;
    // empty constructor
    @Since("7.0")
    public ResetDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetDrivesRequest(
        String drives,
        Boolean force
    )
    {
        this.drives = drives;
        this.force = force;
    }

    /** 
     * List of device names (not driveIDs) to reset.
     **/
    public String getDrives() { return this.drives; }
   
    public void setDrives(String drives) { 
        this.drives = drives;
    }
    /** 
     * Required parameter to successfully reset a drive.
     **/
    public Boolean getForce() { return this.force; }
   
    public void setForce(Boolean force) { 
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetDrivesRequest that = (ResetDrivesRequest) o;

        return 
            Objects.equals(drives, that.drives) && 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( drives,force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" drives : ").append(gson.toJson(drives)).append(",");
        sb.append(" force : ").append(gson.toJson(force)).append(",");
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
        private String drives;
        private Boolean force;

        private Builder() { }

        public ResetDrivesRequest build() {
            return new ResetDrivesRequest (
                         this.drives,
                         this.force);
        }

        private ResetDrivesRequest.Builder buildFrom(final ResetDrivesRequest req) {
            this.drives = req.drives;
            this.force = req.force;

            return this;
        }

        public ResetDrivesRequest.Builder drives(final String drives) {
            this.drives = drives;
            return this;
        }

        public ResetDrivesRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

    }
}
