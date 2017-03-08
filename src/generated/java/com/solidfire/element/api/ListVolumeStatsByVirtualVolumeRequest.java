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
 * ListVolumeStatsByVirtualVolumeRequest  
 * ListVolumeStatsByVirtualVolume enables you to list statistics for volumes, sorted by virtual volumes.
 **/

public class ListVolumeStatsByVirtualVolumeRequest implements Serializable {

    public static final long serialVersionUID = -3973380068564934287L;
    @SerializedName("virtualVolumeIDs") private Optional<java.util.UUID[]> virtualVolumeIDs;

    // empty constructor
    @Since("7.0")
    public ListVolumeStatsByVirtualVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsByVirtualVolumeRequest(
        Optional<java.util.UUID[]> virtualVolumeIDs
    )
    {
        this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeIDs;
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
            Objects.equals(virtualVolumeIDs, that.virtualVolumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeIDs", virtualVolumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualVolumeIDs && virtualVolumeIDs.isPresent()){
            sb.append(" virtualVolumeIDs : ").append(virtualVolumeIDs).append(",");
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
        private Optional<java.util.UUID[]> virtualVolumeIDs;

        private Builder() { }

        public ListVolumeStatsByVirtualVolumeRequest build() {
            return new ListVolumeStatsByVirtualVolumeRequest (
                         this.virtualVolumeIDs);
        }

        private ListVolumeStatsByVirtualVolumeRequest.Builder buildFrom(final ListVolumeStatsByVirtualVolumeRequest req) {
            this.virtualVolumeIDs = req.virtualVolumeIDs;

            return this;
        }

        public ListVolumeStatsByVirtualVolumeRequest.Builder optional(final java.util.UUID[] virtualVolumeIDs) {
            this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(virtualVolumeIDs);
            return this;
        }

    }
}
