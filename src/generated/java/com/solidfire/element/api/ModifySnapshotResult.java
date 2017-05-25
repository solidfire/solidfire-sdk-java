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
 * ModifySnapshotResult  
 **/

public class ModifySnapshotResult implements Serializable {

    public static final long serialVersionUID = -7213033289510416808L;
    @SerializedName("snapshot") private Optional<Snapshot> snapshot;
    // empty constructor
    @Since("8.0")

    public ModifySnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapshotResult(
        Optional<Snapshot> snapshot
    )
    {
        this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : snapshot;
    }

    /** 
     * 
     **/
    public Optional<Snapshot> getSnapshot() { return this.snapshot; }
    public void setSnapshot(Optional<Snapshot> snapshot) { 
        this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : snapshot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapshotResult that = (ModifySnapshotResult) o;

        return 
            Objects.equals(snapshot, that.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshot );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapshot", snapshot);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != snapshot && snapshot.isPresent()){
            sb.append(" snapshot : ").append(snapshot).append(",");
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

        private Builder() { }

        public ModifySnapshotResult build() {
            return new ModifySnapshotResult (
                         this.snapshot);
        }

        private ModifySnapshotResult.Builder buildFrom(final ModifySnapshotResult req) {
            this.snapshot = req.snapshot;

            return this;
        }

        public ModifySnapshotResult.Builder optionalSnapshot(final Snapshot snapshot) {
            this.snapshot = (snapshot == null) ? Optional.<Snapshot>empty() : Optional.of(snapshot);
            return this;
        }

    }
}
