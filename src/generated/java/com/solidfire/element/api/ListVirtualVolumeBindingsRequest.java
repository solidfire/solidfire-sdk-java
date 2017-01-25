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
 * ListVirtualVolumeBindingsRequest  
 **/

public class ListVirtualVolumeBindingsRequest implements Serializable {

    public static final long serialVersionUID = 1543024419589101292L;
    @SerializedName("virtualVolumeBindingIDs") private Optional<Long[]> virtualVolumeBindingIDs;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeBindingsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeBindingsRequest(
        Optional<Long[]> virtualVolumeBindingIDs
    )
    {
        this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : virtualVolumeBindingIDs;
    }

    /** 
     **/
    public Optional<Long[]> getVirtualVolumeBindingIDs() { return this.virtualVolumeBindingIDs; }
    public void setVirtualVolumeBindingIDs(Optional<Long[]> virtualVolumeBindingIDs) { 
        this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : virtualVolumeBindingIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeBindingsRequest that = (ListVirtualVolumeBindingsRequest) o;

        return 
            Objects.equals(virtualVolumeBindingIDs, that.virtualVolumeBindingIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeBindingIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeBindingIDs", virtualVolumeBindingIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualVolumeBindingIDs && virtualVolumeBindingIDs.isPresent()){
            sb.append(" virtualVolumeBindingIDs : ").append(virtualVolumeBindingIDs).append(",");
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
        private Optional<Long[]> virtualVolumeBindingIDs;

        private Builder() { }

        public ListVirtualVolumeBindingsRequest build() {
            return new ListVirtualVolumeBindingsRequest (
                         this.virtualVolumeBindingIDs);
        }

        private ListVirtualVolumeBindingsRequest.Builder buildFrom(final ListVirtualVolumeBindingsRequest req) {
            this.virtualVolumeBindingIDs = req.virtualVolumeBindingIDs;

            return this;
        }

        public ListVirtualVolumeBindingsRequest.Builder optionalVirtualVolumeBindingIDs(final Long[] virtualVolumeBindingIDs) {
            this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : Optional.of(virtualVolumeBindingIDs);
            return this;
        }

    }
}
