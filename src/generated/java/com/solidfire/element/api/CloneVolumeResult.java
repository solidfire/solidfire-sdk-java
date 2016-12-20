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
 **/

public class CloneVolumeResult implements Serializable {

    public static final long serialVersionUID = 7651196543218505931L;
    @SerializedName("cloneID") private Long cloneID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("asyncHandle") private Long asyncHandle;

    // empty constructor
    @Since("7.0")
    public CloneVolumeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CloneVolumeResult(
        Long cloneID,
        Long volumeID,
        Long asyncHandle
    )
    {
        this.cloneID = cloneID;
        this.volumeID = volumeID;
        this.asyncHandle = asyncHandle;
    }

    /** 
     * The ID of the newly-created clone.
     **/
    public Long getCloneID() { return this.cloneID; }
    public void setCloneID(Long cloneID) { 
        this.cloneID = cloneID;
    }
    /** 
     * The volume ID of the newly-created clone.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Handle value used to track the progress of the clone.
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneVolumeResult that = (CloneVolumeResult) o;

        return 
            Objects.equals(cloneID, that.cloneID) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(asyncHandle, that.asyncHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cloneID,volumeID,asyncHandle );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cloneID", cloneID);
        map.put("volumeID", volumeID);
        map.put("asyncHandle", asyncHandle);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cloneID : ").append(cloneID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" asyncHandle : ").append(asyncHandle).append(",");
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
        private Long cloneID;
        private Long volumeID;
        private Long asyncHandle;

        private Builder() { }

        public CloneVolumeResult build() {
            return new CloneVolumeResult (
                         this.cloneID,
                         this.volumeID,
                         this.asyncHandle);
        }

        private CloneVolumeResult.Builder buildFrom(final CloneVolumeResult req) {
            this.cloneID = req.cloneID;
            this.volumeID = req.volumeID;
            this.asyncHandle = req.asyncHandle;

            return this;
        }

        public CloneVolumeResult.Builder cloneID(final Long cloneID) {
            this.cloneID = cloneID;
            return this;
        }

        public CloneVolumeResult.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CloneVolumeResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

    }
}
