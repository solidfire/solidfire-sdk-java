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
 * The object returned by the "ListSnapshots" API Service call.
 **/
public class ListSnapshotsResult implements Serializable {

    private static final long serialVersionUID = 2033086754L;

    @SerializedName("snapshots") private final Snapshot[] snapshots;

    /**
     * The object returned by the "ListSnapshots" API Service call.
     * @param snapshots [required] Information about each snapshot for each volume.
     * @since 7.0
     **/
    @Since("7.0")
    public ListSnapshotsResult(Snapshot[] snapshots) {
        this.snapshots = snapshots;
    }


    /**
     * Information about each snapshot for each volume.
     * If volumeID is not provided, all snapshots for all volumes is returned.
     * Snapshots that are in a group will be returned with a &quot;groupID&quot;.
     * Snapshots that are enabled for replication.
     **/
    public Snapshot[] getSnapshots() {
        return this.snapshots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapshotsResult that = (ListSnapshotsResult) o;
        

        return Objects.deepEquals( snapshots , that.snapshots );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) snapshots );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshots : ").append(Arrays.toString(snapshots));
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Snapshot[] snapshots;

        private Builder() { }

        public ListSnapshotsResult build() {
            return new ListSnapshotsResult (
                         this.snapshots            );
        }

        private ListSnapshotsResult.Builder buildFrom(final ListSnapshotsResult req) {
            this.snapshots = req.snapshots;

            return this;
        }

        public ListSnapshotsResult.Builder snapshots(final Snapshot[] snapshots) {
            this.snapshots = snapshots;
            return this;
        }

    }

}
