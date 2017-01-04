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
 * GetDriveStatsRequest  
 **/

public class GetDriveStatsRequest implements Serializable {

    public static final long serialVersionUID = 1640028930156644564L;
    @SerializedName("driveID") private DriveID driveID;

    // empty constructor
    @Since("7.0")
    public GetDriveStatsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetDriveStatsRequest(
        DriveID driveID
    )
    {
        this.driveID = driveID;
    }

    /** 
     * Specifies the drive for which statistics are gathered.
     **/
    public DriveID getDriveID() { return this.driveID; }
    public void setDriveID(DriveID driveID) { 
        this.driveID = driveID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetDriveStatsRequest that = (GetDriveStatsRequest) o;

        return 
            Objects.equals(driveID, that.driveID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( driveID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("driveID", driveID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" driveID : ").append(driveID).append(",");
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
        private DriveID driveID;

        private Builder() { }

        public GetDriveStatsRequest build() {
            return new GetDriveStatsRequest (
                         this.driveID);
        }

        private GetDriveStatsRequest.Builder buildFrom(final GetDriveStatsRequest req) {
            this.driveID = req.driveID;

            return this;
        }

        public GetDriveStatsRequest.Builder driveID(final DriveID driveID) {
            this.driveID = driveID;
            return this;
        }

    }
}
