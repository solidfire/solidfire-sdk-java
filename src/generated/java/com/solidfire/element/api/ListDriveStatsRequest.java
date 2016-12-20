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
 **/

public class ListDriveStatsRequest implements Serializable {

    public static final long serialVersionUID = -6463847803564234079L;
    @SerializedName("drives") private Optional<Long[]> drives;

    // empty constructor
    @Since("7.0")
    public ListDriveStatsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListDriveStatsRequest(
        Optional<Long[]> drives
    )
    {
        this.drives = (drives == null) ? Optional.<Long[]>empty() : drives;
    }

    /** 
     * Optional list of DriveIDs for which to return drive statistics. If you omit this parameter, measurements for all drives are returned.
     **/
    public Optional<Long[]> getDrives() { return this.drives; }
    public void setDrives(Optional<Long[]> drives) { 
        this.drives = (drives == null) ? Optional.<Long[]>empty() : drives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListDriveStatsRequest that = (ListDriveStatsRequest) o;

        return 
            Objects.equals(drives, that.drives);
    }

    @Override
    public int hashCode() {
        return Objects.hash( drives );
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

        if(null != drives && drives.isPresent()){
            sb.append(" drives : ").append(drives).append(",");
        }
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
        private Optional<Long[]> drives;

        private Builder() { }

        public ListDriveStatsRequest build() {
            return new ListDriveStatsRequest (
                         this.drives);
        }

        private ListDriveStatsRequest.Builder buildFrom(final ListDriveStatsRequest req) {
            this.drives = req.drives;

            return this;
        }

        public ListDriveStatsRequest.Builder optionalDrives(final Long[] drives) {
            this.drives = (drives == null) ? Optional.<Long[]>empty() : Optional.of(drives);
            return this;
        }

    }
}
