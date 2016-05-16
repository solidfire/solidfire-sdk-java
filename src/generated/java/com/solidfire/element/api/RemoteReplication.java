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

import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * Details on the volume replication.
 **/
public class RemoteReplication implements Serializable {

    private static final long serialVersionUID = -1757227169L;

    private final String mode;
    private final Long pauseLimit;
    private final Long remoteServiceID;
    private final String resumeDetails;
    private final SnapshotReplication snapshotReplication;
    private final String state;
    private final String stateDetails;

    /**
     * Details on the volume replication.
     * @param mode [required] Volume replication mode.<br/>
     * @param pauseLimit [required] The number of occurring write ops before auto-pausing, on a per volume pair level.
     * @param remoteServiceID [required] The remote slice service ID.
     * @param resumeDetails [required] Reserved for future use.
     * @param snapshotReplication [required] The details of snapshot replication.
     * @param state [required] The state of the volume replication.
     * @param stateDetails [required] Reserved for future use.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoteReplication(String mode, Long pauseLimit, Long remoteServiceID, String resumeDetails, SnapshotReplication snapshotReplication, String state, String stateDetails) {
        this.snapshotReplication = snapshotReplication;
        this.state = state;
        this.stateDetails = stateDetails;
        this.remoteServiceID = remoteServiceID;
        this.resumeDetails = resumeDetails;
        this.mode = mode;
        this.pauseLimit = pauseLimit;
    }


    /**
     * Volume replication mode.<br/>
     * Possible values:<br/>
     * <b>Async</b>: Writes are acknowledged when they complete locally. The cluster does not wait for writes to be replicated to the target cluster.<br/>
     * <b>Sync</b>: Source acknowledges write when the data is stored locally and on the remote cluster.<br/>
     * <b>SnapshotsOnly</b>: Only snapshots created on the source cluster will be replicated. Active writes from the source volume will not be replicated.<br/>
     **/
    public String getMode() {
        return this.mode;
    }

    /**
     * The number of occurring write ops before auto-pausing, on a per volume pair level.
     **/
    public Long getPauseLimit() {
        return this.pauseLimit;
    }

    /**
     * The remote slice service ID.
     **/
    public Long getRemoteServiceID() {
        return this.remoteServiceID;
    }

    /**
     * Reserved for future use.
     **/
    public String getResumeDetails() {
        return this.resumeDetails;
    }

    /**
     * The details of snapshot replication.
     **/
    public SnapshotReplication getSnapshotReplication() {
        return this.snapshotReplication;
    }

    /**
     * The state of the volume replication.
     **/
    public String getState() {
        return this.state;
    }

    /**
     * Reserved for future use.
     **/
    public String getStateDetails() {
        return this.stateDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoteReplication that = (RemoteReplication) o;
        

        return Objects.equals( mode , that.mode )
            && Objects.equals( pauseLimit , that.pauseLimit )
            && Objects.equals( remoteServiceID , that.remoteServiceID )
            && Objects.equals( resumeDetails , that.resumeDetails )
            && Objects.equals( snapshotReplication , that.snapshotReplication )
            && Objects.equals( state , that.state )
            && Objects.equals( stateDetails , that.stateDetails );
    }

    @Override
    public int hashCode() {
        return Objects.hash( mode, pauseLimit, remoteServiceID, resumeDetails, snapshotReplication, state, stateDetails );
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
        sb.append(" stateDetails : ").append(stateDetails);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
