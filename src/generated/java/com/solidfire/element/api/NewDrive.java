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
 * NewDrive  
 **/

public class NewDrive implements Serializable {

    public static final long serialVersionUID = -7433047816469585014L;
    @SerializedName("driveID") private Long driveID;

    // empty constructor
    @Since("7.0")
    public NewDrive() {}

    
    // parameterized constructor
    @Since("7.0")
    public NewDrive(
        Long driveID
    )
    {
        this.driveID = driveID;
    }

    /** 
     * A unique identifier for this drive.
     **/
    public Long getDriveID() { return this.driveID; }
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewDrive that = (NewDrive) o;

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
        private Long driveID;

        private Builder() { }

        public NewDrive build() {
            return new NewDrive (
                         this.driveID);
        }

        private NewDrive.Builder buildFrom(final NewDrive req) {
            this.driveID = req.driveID;

            return this;
        }

        public NewDrive.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

    }
}
