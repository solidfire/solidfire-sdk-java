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
 * RemoteReplication  
 * Details on the volume replication.
 **/

public class RemoteReplication implements Serializable {

    public static final long serialVersionUID = 216340797577190625L;
    @SerializedName("mode") private String mode;
    @SerializedName("pauseLimit") private Long pauseLimit;
    @SerializedName("remoteServiceID") private Long remoteServiceID;
    @SerializedName("resumeDetails") private String resumeDetails;
    @SerializedName("snapshotReplication") private SnapshotReplication snapshotReplication;
    @SerializedName("state") private String state;
    @SerializedName("stateDetails") private String stateDetails;

    // empty constructor
    @Since("7.0")
    public RemoteReplication() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoteReplication(
        String mode,
        Long pauseLimit,
        Long remoteServiceID,
        String resumeDetails,
        SnapshotReplication snapshotReplication,
        String state,
        String stateDetails
    )
    {
        this.mode = mode;
        this.pauseLimit = pauseLimit;
        this.remoteServiceID = remoteServiceID;
        this.resumeDetails = resumeDetails;
        this.snapshotReplication = snapshotReplication;
        this.state = state;
        this.stateDetails = stateDetails;
    }

    /** 
     * Volume replication mode.
     * Possible values:
     * Async: Writes are acknowledged when they complete locally. The cluster does not wait for writes to be replicated to the target cluster.
     * Sync: Source acknowledges write when the data is stored locally and on the remote cluster.
     * SnapshotsOnly: Only snapshots created on the source cluster will be replicated. Active writes from the source volume will not be replicated.
     **/
    public String getMode() { return this.mode; }
    public void setMode(String mode) { 
        this.mode = mode;
    }
    /** 
     * The number of occurring write ops before auto-pausing, on a per volume pair level.
     **/
    public Long getPauseLimit() { return this.pauseLimit; }
    public void setPauseLimit(Long pauseLimit) { 
        this.pauseLimit = pauseLimit;
    }
    /** 
     * The remote slice service ID.
     **/
    public Long getRemoteServiceID() { return this.remoteServiceID; }
    public void setRemoteServiceID(Long remoteServiceID) { 
        this.remoteServiceID = remoteServiceID;
    }
    /** 
     * Reserved for future use.
     **/
    public String getResumeDetails() { return this.resumeDetails; }
    public void setResumeDetails(String resumeDetails) { 
        this.resumeDetails = resumeDetails;
    }
    /** 
     * The details of snapshot replication.
     **/
    public SnapshotReplication getSnapshotReplication() { return this.snapshotReplication; }
    public void setSnapshotReplication(SnapshotReplication snapshotReplication) { 
        this.snapshotReplication = snapshotReplication;
    }
    /** 
     * The state of the volume replication.
     **/
    public String getState() { return this.state; }
    public void setState(String state) { 
        this.state = state;
    }
    /** 
     * Reserved for future use.
     **/
    public String getStateDetails() { return this.stateDetails; }
    public void setStateDetails(String stateDetails) { 
        this.stateDetails = stateDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoteReplication that = (RemoteReplication) o;

        return 
            Objects.equals(mode, that.mode) && 
            Objects.equals(pauseLimit, that.pauseLimit) && 
            Objects.equals(remoteServiceID, that.remoteServiceID) && 
            Objects.equals(resumeDetails, that.resumeDetails) && 
            Objects.equals(snapshotReplication, that.snapshotReplication) && 
            Objects.equals(state, that.state) && 
            Objects.equals(stateDetails, that.stateDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash( mode,pauseLimit,remoteServiceID,resumeDetails,snapshotReplication,state,stateDetails );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("mode", mode);
        map.put("pauseLimit", pauseLimit);
        map.put("remoteServiceID", remoteServiceID);
        map.put("resumeDetails", resumeDetails);
        map.put("snapshotReplication", snapshotReplication);
        map.put("state", state);
        map.put("stateDetails", stateDetails);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" mode : ").append(mode).append(",");
        sb.append(" pauseLimit : ").append(pauseLimit).append(",");
        sb.append(" remoteServiceID : ").append(remoteServiceID).append(",");
        sb.append(" resumeDetails : ").append(resumeDetails).append(",");
        sb.append(" snapshotReplication : ").append(snapshotReplication).append(",");
        sb.append(" state : ").append(state).append(",");
        sb.append(" stateDetails : ").append(stateDetails).append(",");
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
        private String mode;
        private Long pauseLimit;
        private Long remoteServiceID;
        private String resumeDetails;
        private SnapshotReplication snapshotReplication;
        private String state;
        private String stateDetails;

        private Builder() { }

        public RemoteReplication build() {
            return new RemoteReplication (
                         this.mode,
                         this.pauseLimit,
                         this.remoteServiceID,
                         this.resumeDetails,
                         this.snapshotReplication,
                         this.state,
                         this.stateDetails);
        }

        private RemoteReplication.Builder buildFrom(final RemoteReplication req) {
            this.mode = req.mode;
            this.pauseLimit = req.pauseLimit;
            this.remoteServiceID = req.remoteServiceID;
            this.resumeDetails = req.resumeDetails;
            this.snapshotReplication = req.snapshotReplication;
            this.state = req.state;
            this.stateDetails = req.stateDetails;

            return this;
        }

        public RemoteReplication.Builder mode(final String mode) {
            this.mode = mode;
            return this;
        }

        public RemoteReplication.Builder pauseLimit(final Long pauseLimit) {
            this.pauseLimit = pauseLimit;
            return this;
        }

        public RemoteReplication.Builder remoteServiceID(final Long remoteServiceID) {
            this.remoteServiceID = remoteServiceID;
            return this;
        }

        public RemoteReplication.Builder resumeDetails(final String resumeDetails) {
            this.resumeDetails = resumeDetails;
            return this;
        }

        public RemoteReplication.Builder snapshotReplication(final SnapshotReplication snapshotReplication) {
            this.snapshotReplication = snapshotReplication;
            return this;
        }

        public RemoteReplication.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public RemoteReplication.Builder stateDetails(final String stateDetails) {
            this.stateDetails = stateDetails;
            return this;
        }

    }
}
