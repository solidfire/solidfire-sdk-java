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
 * AddDrivesRequest  
 **/

public class AddDrivesRequest implements Serializable {

    public static final long serialVersionUID = 7529442292047223482L;
    @SerializedName("drives") private NewDrive[] drives;

    // empty constructor
    @Since("7.0")
    public AddDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddDrivesRequest(
        NewDrive[] drives
    )
    {
        this.drives = drives;
    }

    /** 
     * List of drives to add to the cluster.
     **/
    public NewDrive[] getDrives() { return this.drives; }
    public void setDrives(NewDrive[] drives) { 
        this.drives = drives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddDrivesRequest that = (AddDrivesRequest) o;

        return 
            Arrays.equals(drives, that.drives);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])drives );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(Arrays.toString(drives)).append(",");
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
        private NewDrive[] drives;

        private Builder() { }

        public AddDrivesRequest build() {
            return new AddDrivesRequest (
                         this.drives);
        }

        private AddDrivesRequest.Builder buildFrom(final AddDrivesRequest req) {
            this.drives = req.drives;

            return this;
        }

        public AddDrivesRequest.Builder drives(final NewDrive[] drives) {
            this.drives = drives;
            return this;
        }

    }
}
