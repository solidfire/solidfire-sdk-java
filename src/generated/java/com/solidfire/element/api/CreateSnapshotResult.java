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
 * CreateSnapshotResult  
 **/

public class CreateSnapshotResult implements Serializable {

    public static final long serialVersionUID = -3886129135090734441L;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("checksum") private String checksum;

    // empty constructor
    @Since("7.0")
    public CreateSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapshotResult(
        Long snapshotID,
        String checksum
    )
    {
        this.snapshotID = snapshotID;
        this.checksum = checksum;
    }

    /** 
     * ID of the newly-created snapshot.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public String getChecksum() { return this.checksum; }
    public void setChecksum(String checksum) { 
        this.checksum = checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapshotResult that = (CreateSnapshotResult) o;

        return 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID,checksum );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapshotID", snapshotID);
        map.put("checksum", checksum);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" checksum : ").append(checksum).append(",");
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
        private Long snapshotID;
        private String checksum;

        private Builder() { }

        public CreateSnapshotResult build() {
            return new CreateSnapshotResult (
                         this.snapshotID,
                         this.checksum);
        }

        private CreateSnapshotResult.Builder buildFrom(final CreateSnapshotResult req) {
            this.snapshotID = req.snapshotID;
            this.checksum = req.checksum;

            return this;
        }

        public CreateSnapshotResult.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public CreateSnapshotResult.Builder checksum(final String checksum) {
            this.checksum = checksum;
            return this;
        }

    }
}
