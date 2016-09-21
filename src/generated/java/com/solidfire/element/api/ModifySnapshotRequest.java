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

import com.google.gson.annotations.SerializedName;
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
 * The Request object for the "ModifySnapshot" API Service call.
 **/
public class ModifySnapshotRequest  implements Serializable  {

    private static final long serialVersionUID = -398415602L;

    @SerializedName("snapshotID") private final Long snapshotID;
    @SerializedName("expirationTime") private final Optional<String> expirationTime;
    @SerializedName("enableRemoteReplication") private final Optional<Boolean> enableRemoteReplication;

    /**
     * The Request object for the "ModifySnapshot" API Service call.
     * @param snapshotID [required] ID of the snapshot.
     * @param expirationTime (optional) Use to set the time when the snapshot should be removed.
     * @param enableRemoteReplication (optional) Use to enable the snapshot created to be replicated to a remote SolidFire cluster.
     * @since 8.0
     **/
    @Since("8.0")
    public ModifySnapshotRequest(Long snapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication) {
        this.snapshotID = snapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }


    /**
     * ID of the snapshot.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * Use to set the time when the snapshot should be removed.
     **/
    public Optional<String> getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Use to enable the snapshot created to be replicated to a remote SolidFire cluster.
     * Possible values:
     * <br/><b>true</b>: the snapshot will be replicated to remote storage.
     * <br/><b>false</b>: Default. No replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() {
        return this.enableRemoteReplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapshotRequest that = (ModifySnapshotRequest) o;
        

        return Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( expirationTime , that.expirationTime )
            && Objects.equals( enableRemoteReplication , that.enableRemoteReplication );
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID, expirationTime, enableRemoteReplication );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(snapshotID).append(",");
        if(null != expirationTime && expirationTime.isPresent())
            sb.append(" expirationTime : ").append(expirationTime.get()).append(",");
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent())
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication.get());
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
        private Optional<String> expirationTime;
        private Optional<Boolean> enableRemoteReplication;

        private Builder() { }

        public ModifySnapshotRequest build() {
            return new ModifySnapshotRequest (
                         this.snapshotID,
                         this.expirationTime,
                         this.enableRemoteReplication            );
        }

        private ModifySnapshotRequest.Builder buildFrom(final ModifySnapshotRequest req) {
            this.snapshotID = req.snapshotID;
            this.expirationTime = req.expirationTime;
            this.enableRemoteReplication = req.enableRemoteReplication;

            return this;
        }

        public ModifySnapshotRequest.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public ModifySnapshotRequest.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public ModifySnapshotRequest.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

    }

}
