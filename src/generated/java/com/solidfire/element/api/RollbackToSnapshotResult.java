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
 * RollbackToSnapshotResult  
 **/

public class RollbackToSnapshotResult implements Serializable {

    public static final long serialVersionUID = -1146476107156315816L;
    @SerializedName("snapshot") private Optional<Snapshot> snapshot;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("checksum") private Optional<String> checksum;
    // empty constructor
    @Since("7.0")
    public RollbackToSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public RollbackToSnapshotResult(
        Optional<Snapshot> snapshot,
        Optional<Long> snapshotID,
        Optional<String> checksum
    )
    {
        this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : snapshot;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.checksum = (checksum == null) ? Optional.<String>empty() : checksum;
    }

    /** 
     * 
     **/
    public Optional<Snapshot> getSnapshot() { return this.snapshot; }
    public void setSnapshot(Optional<Snapshot> snapshot) { 
        this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : snapshot;
    }
    /** 
     * ID of the newly-created snapshot.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public Optional<String> getChecksum() { return this.checksum; }
    public void setChecksum(Optional<String> checksum) { 
        this.checksum = (checksum == null) ? Optional.<String>empty() : checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RollbackToSnapshotResult that = (RollbackToSnapshotResult) o;

        return 
            Objects.equals(snapshot, that.snapshot) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshot,snapshotID,checksum );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapshot", snapshot);
        map.put("snapshotID", snapshotID);
        map.put("checksum", checksum);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != snapshot && snapshot.isPresent()){
            sb.append(" snapshot : ").append(snapshot).append(",");
        }
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(snapshotID).append(",");
        }
        if(null != checksum && checksum.isPresent()){
            sb.append(" checksum : ").append(checksum).append(",");
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
        private Optional<Snapshot> snapshot;
        private Optional<Long> snapshotID;
        private Optional<String> checksum;

        private Builder() { }

        public RollbackToSnapshotResult build() {
            return new RollbackToSnapshotResult (
                         this.snapshot,
                         this.snapshotID,
                         this.checksum);
        }

        private RollbackToSnapshotResult.Builder buildFrom(final RollbackToSnapshotResult req) {
            this.snapshot = req.snapshot;
            this.snapshotID = req.snapshotID;
            this.checksum = req.checksum;

            return this;
        }

        public RollbackToSnapshotResult.Builder optionalSnapshot(final Snapshot snapshot) {
            this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : Optional.of(snapshot);
            return this;
        }

        public RollbackToSnapshotResult.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

        public RollbackToSnapshotResult.Builder optionalChecksum(final String checksum) {
            this.checksum = (checksum == null) ? Optional.<String>empty() : Optional.of(checksum);
            return this;
        }

    }
}
