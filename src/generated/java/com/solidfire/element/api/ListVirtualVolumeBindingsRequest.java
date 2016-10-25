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
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ListVirtualVolumeBindings" API Service call.
 **/
public class ListVirtualVolumeBindingsRequest  implements Serializable  {

    private static final long serialVersionUID = 1967617285L;

    @SerializedName("virtualVolumeBindingIDs") private Optional<Long[]> virtualVolumeBindingIDs;
    @SerializedName("callingVirtualVolumeHostID") private Optional<java.util.UUID> callingVirtualVolumeHostID;

    /**
     * The Request object for the "ListVirtualVolumeBindings" API Service call.
     * @param virtualVolumeBindingIDs (optional) 
     * @param callingVirtualVolumeHostID (optional) 
     * @since 9.0
     **/
    @Since("9.0")
    public ListVirtualVolumeBindingsRequest(Optional<Long[]> virtualVolumeBindingIDs, Optional<java.util.UUID> callingVirtualVolumeHostID) {
        this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : virtualVolumeBindingIDs;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    
    /**
     * The Request object for the "ListVirtualVolumeBindings" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public ListVirtualVolumeBindingsRequest() {}

    public Optional<Long[]> getVirtualVolumeBindingIDs() {
        return this.virtualVolumeBindingIDs;
    }

    public void setVirtualVolumeBindingIDs(Long[] virtualVolumeBindingIDs) {
        this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : Optional.of(virtualVolumeBindingIDs);
    }


    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() {
        return this.callingVirtualVolumeHostID;
    }

    public void setCallingVirtualVolumeHostID(java.util.UUID callingVirtualVolumeHostID) {
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeBindingsRequest that = (ListVirtualVolumeBindingsRequest) o;
        

        return Objects.deepEquals( virtualVolumeBindingIDs , that.virtualVolumeBindingIDs )
            && Objects.equals( callingVirtualVolumeHostID , that.callingVirtualVolumeHostID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeBindingIDs, callingVirtualVolumeHostID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualVolumeBindingIDs && virtualVolumeBindingIDs.isPresent())
            sb.append(" virtualVolumeBindingIDs : ").append(Arrays.toString(virtualVolumeBindingIDs.get())).append(",");
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent())
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID.get());
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
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public ListVirtualVolumeBindingsRequest build() {
            return new ListVirtualVolumeBindingsRequest (
                         this.virtualVolumeBindingIDs,
                         this.callingVirtualVolumeHostID            );
        }

        private ListVirtualVolumeBindingsRequest.Builder buildFrom(final ListVirtualVolumeBindingsRequest req) {
            this.virtualVolumeBindingIDs = req.virtualVolumeBindingIDs;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public ListVirtualVolumeBindingsRequest.Builder optionalVirtualVolumeBindingIDs(final Long[] virtualVolumeBindingIDs) {
            this.virtualVolumeBindingIDs = (virtualVolumeBindingIDs == null) ? Optional.<Long[]>empty() : Optional.of(virtualVolumeBindingIDs);
            return this;
        }

        public ListVirtualVolumeBindingsRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }

}
