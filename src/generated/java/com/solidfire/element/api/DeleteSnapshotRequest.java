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
 * The Request object for the "DeleteSnapshot" API Service call.
 **/
public class DeleteSnapshotRequest  implements Serializable  {

    private static final long serialVersionUID = 1151190076L;

    @SerializedName("snapshotID") private final Long snapshotID;

    /**
     * The Request object for the "DeleteSnapshot" API Service call.
     * @param snapshotID [required] The ID of the snapshot to delete.
     * @since 7.0
     **/
    @Since("7.0")
    public DeleteSnapshotRequest(Long snapshotID) {
        this.snapshotID = snapshotID;
    }


    /**
     * The ID of the snapshot to delete.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteSnapshotRequest that = (DeleteSnapshotRequest) o;
        

        return Objects.equals( snapshotID , that.snapshotID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) snapshotID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(snapshotID);
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

        private Builder() { }

        public DeleteSnapshotRequest build() {
            return new DeleteSnapshotRequest (
                         this.snapshotID            );
        }

        private DeleteSnapshotRequest.Builder buildFrom(final DeleteSnapshotRequest req) {
            this.snapshotID = req.snapshotID;

            return this;
        }

        public DeleteSnapshotRequest.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

    }

}
