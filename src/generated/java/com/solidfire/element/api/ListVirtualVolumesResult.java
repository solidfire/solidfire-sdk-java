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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ListVirtualVolumesResult  
 **/

public class ListVirtualVolumesResult implements Serializable {

    public static final long serialVersionUID = -1184247087884110714L;
    @SerializedName("virtualVolumes") private VirtualVolumeInfo[] virtualVolumes;
    @SerializedName("nextVirtualVolumeID") private Optional<java.util.UUID> nextVirtualVolumeID;
    // empty constructor
    @Since("7.0")
    public ListVirtualVolumesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumesResult(
        VirtualVolumeInfo[] virtualVolumes,
        Optional<java.util.UUID> nextVirtualVolumeID
    )
    {
        this.virtualVolumes = virtualVolumes;
        this.nextVirtualVolumeID = (nextVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : nextVirtualVolumeID;
    }

    /** 
     * 
     **/
    public VirtualVolumeInfo[] getVirtualVolumes() { return this.virtualVolumes; }
   
    public void setVirtualVolumes(VirtualVolumeInfo[] virtualVolumes) { 
        this.virtualVolumes = virtualVolumes;
    }
    /** 
     * 
     **/
    public Optional<java.util.UUID> getNextVirtualVolumeID() { return this.nextVirtualVolumeID; }
   
    public void setNextVirtualVolumeID(Optional<java.util.UUID> nextVirtualVolumeID) { 
        this.nextVirtualVolumeID = (nextVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : nextVirtualVolumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumesResult that = (ListVirtualVolumesResult) o;

        return 
            Arrays.equals(virtualVolumes, that.virtualVolumes) && 
            Objects.equals(nextVirtualVolumeID, that.nextVirtualVolumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])virtualVolumes,nextVirtualVolumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumes", virtualVolumes);
        map.put("nextVirtualVolumeID", nextVirtualVolumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" virtualVolumes : ").append(gson.toJson(Arrays.toString(virtualVolumes))).append(",");
        if(null != nextVirtualVolumeID && nextVirtualVolumeID.isPresent()){
            sb.append(" nextVirtualVolumeID : ").append(gson.toJson(nextVirtualVolumeID)).append(",");
        }
        else{
            sb.append(" nextVirtualVolumeID : ").append("null").append(",");
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
        private VirtualVolumeInfo[] virtualVolumes;
        private Optional<java.util.UUID> nextVirtualVolumeID;

        private Builder() { }

        public ListVirtualVolumesResult build() {
            return new ListVirtualVolumesResult (
                         this.virtualVolumes,
                         this.nextVirtualVolumeID);
        }

        private ListVirtualVolumesResult.Builder buildFrom(final ListVirtualVolumesResult req) {
            this.virtualVolumes = req.virtualVolumes;
            this.nextVirtualVolumeID = req.nextVirtualVolumeID;

            return this;
        }

        public ListVirtualVolumesResult.Builder virtualVolumes(final VirtualVolumeInfo[] virtualVolumes) {
            this.virtualVolumes = virtualVolumes;
            return this;
        }

        public ListVirtualVolumesResult.Builder optionalNextVirtualVolumeID(final java.util.UUID nextVirtualVolumeID) {
            this.nextVirtualVolumeID = (nextVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : Optional.of(nextVirtualVolumeID);
            return this;
        }

    }
}
