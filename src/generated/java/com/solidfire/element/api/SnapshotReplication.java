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
 * 
 **/

public class SnapshotReplication implements Serializable {

    public static final long serialVersionUID = -500419435L;
    @SerializedName("state") private String state;
    @SerializedName("stateDetails") private String stateDetails;

    // empty constructor
    @Since("7.0")
    public SnapshotReplication() {}

    // parameterized constructor
    @Since("7.0")
    public SnapshotReplication(
        String state,
        String stateDetails
    )
    {
        this.state = state;
        this.stateDetails = stateDetails;
    }

    /** 
     * The state of the snapshot replication.
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

        SnapshotReplication that = (SnapshotReplication) o;
        return 
            Objects.equals(state, that.state) &&
            Objects.equals(stateDetails, that.stateDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash( state, stateDetails );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("state", state);
        map.put("stateDetails", stateDetails);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

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
        private String state;
        private String stateDetails;

        private Builder() { }

        public SnapshotReplication build() {
            return new SnapshotReplication (
                         this.state,
                         this.stateDetails);
        }

        private SnapshotReplication.Builder buildFrom(final SnapshotReplication req) {
            this.state = req.state;
            this.stateDetails = req.stateDetails;

            return this;
        }

        public SnapshotReplication.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public SnapshotReplication.Builder stateDetails(final String stateDetails) {
            this.stateDetails = stateDetails;
            return this;
        }

    }
}
