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
 * CopyVolumeResult  
 **/

public class CopyVolumeResult implements Serializable {

    public static final long serialVersionUID = 837371064447947130L;
    @SerializedName("cloneID") private Long cloneID;
    @SerializedName("asyncHandle") private Long asyncHandle;

    // empty constructor
    @Since("7.0")
    public CopyVolumeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CopyVolumeResult(
        Long cloneID,
        Long asyncHandle
    )
    {
        this.cloneID = cloneID;
        this.asyncHandle = asyncHandle;
    }

    /** 
     * 
     **/
    public Long getCloneID() { return this.cloneID; }
    public void setCloneID(Long cloneID) { 
        this.cloneID = cloneID;
    }
    /** 
     * Handle value used to track the progress of the volume copy.
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CopyVolumeResult that = (CopyVolumeResult) o;

        return 
            Objects.equals(cloneID, that.cloneID) && 
            Objects.equals(asyncHandle, that.asyncHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cloneID,asyncHandle );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cloneID", cloneID);
        map.put("asyncHandle", asyncHandle);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cloneID : ").append(cloneID).append(",");
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
        private Long asyncHandle;

        private Builder() { }

        public CopyVolumeResult build() {
            return new CopyVolumeResult (
                         this.cloneID,
                         this.asyncHandle);
        }

        private CopyVolumeResult.Builder buildFrom(final CopyVolumeResult req) {
            this.cloneID = req.cloneID;
            this.asyncHandle = req.asyncHandle;

            return this;
        }

        public CopyVolumeResult.Builder cloneID(final Long cloneID) {
            this.cloneID = cloneID;
            return this;
        }

        public CopyVolumeResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

    }
}
