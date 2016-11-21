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

public class ListVirtualVolumeHostsRequest implements Serializable {

    public static final long serialVersionUID = 1570771210L;
    @SerializedName("virtualVolumeHostIDs") private Optional<java.util.UUID[]> virtualVolumeHostIDs;
    @SerializedName("callingVirtualVolumeHostID") private Optional<java.util.UUID> callingVirtualVolumeHostID;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeHostsRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeHostsRequest(
        Optional<java.util.UUID[]> virtualVolumeHostIDs,
        Optional<java.util.UUID> callingVirtualVolumeHostID
    )
    {
        this.virtualVolumeHostIDs = (virtualVolumeHostIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeHostIDs;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    /** 
     **/
    public Optional<java.util.UUID[]> getVirtualVolumeHostIDs() { return this.virtualVolumeHostIDs; }
    public void setVirtualVolumeHostIDs(Optional<java.util.UUID[]> virtualVolumeHostIDs) { 
        this.virtualVolumeHostIDs = (virtualVolumeHostIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeHostIDs;
    }
    /** 
     **/
    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() { return this.callingVirtualVolumeHostID; }
    public void setCallingVirtualVolumeHostID(Optional<java.util.UUID> callingVirtualVolumeHostID) { 
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeHostsRequest that = (ListVirtualVolumeHostsRequest) o;
        return 
            Objects.equals(virtualVolumeHostIDs, that.virtualVolumeHostIDs) &&
            Objects.equals(callingVirtualVolumeHostID, that.callingVirtualVolumeHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeHostIDs, callingVirtualVolumeHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeHostIDs", virtualVolumeHostIDs);
        map.put("callingVirtualVolumeHostID", callingVirtualVolumeHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualVolumeHostIDs && virtualVolumeHostIDs.isPresent()){
            sb.append(" virtualVolumeHostIDs : ").append(virtualVolumeHostIDs.get()).append(",");
        }
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent()){
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID.get()).append(",");
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
        private Optional<java.util.UUID[]> virtualVolumeHostIDs;
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public ListVirtualVolumeHostsRequest build() {
            return new ListVirtualVolumeHostsRequest (
                         this.virtualVolumeHostIDs,
                         this.callingVirtualVolumeHostID);
        }

        private ListVirtualVolumeHostsRequest.Builder buildFrom(final ListVirtualVolumeHostsRequest req) {
            this.virtualVolumeHostIDs = req.virtualVolumeHostIDs;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public ListVirtualVolumeHostsRequest.Builder optionalVirtualVolumeHostIDs(final java.util.UUID[] virtualVolumeHostIDs) {
            this.virtualVolumeHostIDs = (virtualVolumeHostIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(virtualVolumeHostIDs);
            return this;
        }

        public ListVirtualVolumeHostsRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }
}
