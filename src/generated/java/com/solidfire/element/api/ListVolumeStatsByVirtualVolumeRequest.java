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

public class ListVolumeStatsByVirtualVolumeRequest implements Serializable {

    public static final long serialVersionUID = -860366117L;
    @SerializedName("startVirtualVolumeID") private Optional<java.util.UUID> startVirtualVolumeID;
    @SerializedName("virtualVolumeIDs") private Optional<java.util.UUID[]> virtualVolumeIDs;

    // empty constructor
    @Since("7.0")
    public ListVolumeStatsByVirtualVolumeRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsByVirtualVolumeRequest(
        Optional<java.util.UUID> startVirtualVolumeID,
        Optional<java.util.UUID[]> virtualVolumeIDs
    )
    {
        this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : startVirtualVolumeID;
        this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeIDs;
    }

    /** 
     * The ID of the virtual volume at which to begin the list.
     **/
    public Optional<java.util.UUID> getStartVirtualVolumeID() { return this.startVirtualVolumeID; }
    public void setStartVirtualVolumeID(Optional<java.util.UUID> startVirtualVolumeID) { 
        this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : startVirtualVolumeID;
    }
    /** 
     * A list of virtual volume  IDs for which to retrieve information. If you specify this parameter, the method returns information about only these virtual volumes.
     **/
    public Optional<java.util.UUID[]> getVirtualVolumeIDs() { return this.virtualVolumeIDs; }
    public void setVirtualVolumeIDs(Optional<java.util.UUID[]> virtualVolumeIDs) { 
        this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsByVirtualVolumeRequest that = (ListVolumeStatsByVirtualVolumeRequest) o;
        return 
            Objects.equals(startVirtualVolumeID, that.startVirtualVolumeID) &&
            Arrays.equals(virtualVolumeIDs, that.virtualVolumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVirtualVolumeID, virtualVolumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startVirtualVolumeID", startVirtualVolumeID);
        map.put("virtualVolumeIDs", virtualVolumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startVirtualVolumeID && startVirtualVolumeID.isPresent()){
            sb.append(" startVirtualVolumeID : ").append(startVirtualVolumeID.get()).append(",");
        }
        if(null != virtualVolumeIDs && virtualVolumeIDs.isPresent()){
            sb.append(" virtualVolumeIDs : ").append(virtualVolumeIDs.get()).append(",");
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
        private Optional<java.util.UUID> startVirtualVolumeID;
        private Optional<java.util.UUID[]> virtualVolumeIDs;

        private Builder() { }

        public ListVolumeStatsByVirtualVolumeRequest build() {
            return new ListVolumeStatsByVirtualVolumeRequest (
                         this.startVirtualVolumeID,
                         this.virtualVolumeIDs);
        }

        private ListVolumeStatsByVirtualVolumeRequest.Builder buildFrom(final ListVolumeStatsByVirtualVolumeRequest req) {
            this.startVirtualVolumeID = req.startVirtualVolumeID;
            this.virtualVolumeIDs = req.virtualVolumeIDs;

            return this;
        }

        public ListVolumeStatsByVirtualVolumeRequest.Builder optionalStartVirtualVolumeID(final java.util.UUID startVirtualVolumeID) {
            this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : Optional.of(startVirtualVolumeID);
            return this;
        }

        public ListVolumeStatsByVirtualVolumeRequest.Builder optionalVirtualVolumeIDs(final java.util.UUID[] virtualVolumeIDs) {
            this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(virtualVolumeIDs);
            return this;
        }

    }
}
