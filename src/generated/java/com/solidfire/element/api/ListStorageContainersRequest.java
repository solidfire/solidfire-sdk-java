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
 * The Request object for the "ListStorageContainers" API Service call.
 **/
public class ListStorageContainersRequest  implements Serializable  {

    private static final long serialVersionUID = 66177806L;

    @SerializedName("storageContainerIDs") private Optional<java.util.UUID[]> storageContainerIDs;
    @SerializedName("callingHostID") private Optional<java.util.UUID> callingHostID;

    /**
     * The Request object for the "ListStorageContainers" API Service call.
     * @param storageContainerIDs (optional) List of storage containers to get
     * @param callingHostID (optional) 
     * @since 9.0
     **/
    @Since("9.0")
    public ListStorageContainersRequest(Optional<java.util.UUID[]> storageContainerIDs, Optional<java.util.UUID> callingHostID) {
        this.storageContainerIDs = (storageContainerIDs == null) ? Optional.<java.util.UUID[]>empty() : storageContainerIDs;
        this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : callingHostID;
    }

    
    /**
     * The Request object for the "ListStorageContainers" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public ListStorageContainersRequest() {}


    /**
     * List of storage containers to get
     **/
    public Optional<java.util.UUID[]> getStorageContainerIDs() {
        return this.storageContainerIDs;
    }

    public void setStorageContainerIDs(Optional<java.util.UUID[]> storageContainerIDs) {
        this.storageContainerIDs = storageContainerIDs;
    }
    public Optional<java.util.UUID> getCallingHostID() {
        return this.callingHostID;
    }

    public void setCallingHostID(Optional<java.util.UUID> callingHostID) {
        this.callingHostID = callingHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListStorageContainersRequest that = (ListStorageContainersRequest) o;
        

        return Objects.deepEquals( storageContainerIDs , that.storageContainerIDs )
            && Objects.equals( callingHostID , that.callingHostID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( storageContainerIDs, callingHostID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != storageContainerIDs && storageContainerIDs.isPresent())
            sb.append(" storageContainerIDs : ").append(Arrays.toString(storageContainerIDs.get())).append(",");
        if(null != callingHostID && callingHostID.isPresent())
            sb.append(" callingHostID : ").append(callingHostID.get());
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
        private Optional<java.util.UUID[]> storageContainerIDs;
        private Optional<java.util.UUID> callingHostID;

        private Builder() { }

        public ListStorageContainersRequest build() {
            return new ListStorageContainersRequest (
                         this.storageContainerIDs,
                         this.callingHostID            );
        }

        private ListStorageContainersRequest.Builder buildFrom(final ListStorageContainersRequest req) {
            this.storageContainerIDs = req.storageContainerIDs;
            this.callingHostID = req.callingHostID;

            return this;
        }

        public ListStorageContainersRequest.Builder optionalStorageContainerIDs(final java.util.UUID[] storageContainerIDs) {
            this.storageContainerIDs = (storageContainerIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(storageContainerIDs);
            return this;
        }

        public ListStorageContainersRequest.Builder optionalCallingHostID(final java.util.UUID callingHostID) {
            this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingHostID);
            return this;
        }

    }

}
