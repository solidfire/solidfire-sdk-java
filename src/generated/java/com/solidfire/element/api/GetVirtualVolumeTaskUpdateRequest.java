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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetVirtualVolumeTaskUpdateRequest implements Serializable {

    public static final long serialVersionUID = -719216214284926469L;
    @SerializedName("virtualVolumeTaskID") private java.util.UUID virtualVolumeTaskID;
    @SerializedName("callingVirtualVolumeHostID") private Optional<java.util.UUID> callingVirtualVolumeHostID;

    // empty constructor
    @Since("7.0")
    public GetVirtualVolumeTaskUpdateRequest() {}

    // parameterized constructor
    @Since("7.0")
    public GetVirtualVolumeTaskUpdateRequest(
        java.util.UUID virtualVolumeTaskID,
        Optional<java.util.UUID> callingVirtualVolumeHostID
    )
    {
        this.virtualVolumeTaskID = virtualVolumeTaskID;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    /** 
     * The UUID of the VVol Task.
     **/
    public java.util.UUID getVirtualVolumeTaskID() { return this.virtualVolumeTaskID; }
    public void setVirtualVolumeTaskID(java.util.UUID virtualVolumeTaskID) { 
        this.virtualVolumeTaskID = virtualVolumeTaskID;
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

        GetVirtualVolumeTaskUpdateRequest that = (GetVirtualVolumeTaskUpdateRequest) o;

        return 
            Objects.equals(virtualVolumeTaskID, that.virtualVolumeTaskID) &&
            Objects.equals(callingVirtualVolumeHostID, that.callingVirtualVolumeHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeTaskID, callingVirtualVolumeHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeTaskID", virtualVolumeTaskID);
        map.put("callingVirtualVolumeHostID", callingVirtualVolumeHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeTaskID : ").append(virtualVolumeTaskID).append(",");
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent()){
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID).append(",");
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
        private java.util.UUID virtualVolumeTaskID;
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public GetVirtualVolumeTaskUpdateRequest build() {
            return new GetVirtualVolumeTaskUpdateRequest (
                         this.virtualVolumeTaskID,
                         this.callingVirtualVolumeHostID);
        }

        private GetVirtualVolumeTaskUpdateRequest.Builder buildFrom(final GetVirtualVolumeTaskUpdateRequest req) {
            this.virtualVolumeTaskID = req.virtualVolumeTaskID;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public GetVirtualVolumeTaskUpdateRequest.Builder virtualVolumeTaskID(final java.util.UUID virtualVolumeTaskID) {
            this.virtualVolumeTaskID = virtualVolumeTaskID;
            return this;
        }

        public GetVirtualVolumeTaskUpdateRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }
}
