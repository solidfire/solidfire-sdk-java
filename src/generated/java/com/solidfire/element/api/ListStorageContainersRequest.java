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

public class ListStorageContainersRequest implements Serializable {

    public static final long serialVersionUID = 6165115027762705922L;
    @SerializedName("storageContainerIDs") private Optional<UUIDNullable[]> storageContainerIDs;
    @SerializedName("callingHostID") private Optional<UUIDNullable> callingHostID;

    // empty constructor
    @Since("7.0")
    public ListStorageContainersRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListStorageContainersRequest(
        Optional<UUIDNullable[]> storageContainerIDs,
        Optional<UUIDNullable> callingHostID
    )
    {
        this.storageContainerIDs = (storageContainerIDs == null) ? Optional.<UUIDNullable[]>empty() : storageContainerIDs;
        this.callingHostID = (callingHostID == null) ? Optional.<UUIDNullable>empty() : callingHostID;
    }

    /** 
     * List of storage containers to get
     **/
    public Optional<UUIDNullable[]> getStorageContainerIDs() { return this.storageContainerIDs; }
    public void setStorageContainerIDs(Optional<UUIDNullable[]> storageContainerIDs) { 
        this.storageContainerIDs = (storageContainerIDs == null) ? Optional.<UUIDNullable[]>empty() : storageContainerIDs;
    }
    /** 
     **/
    public Optional<UUIDNullable> getCallingHostID() { return this.callingHostID; }
    public void setCallingHostID(Optional<UUIDNullable> callingHostID) { 
        this.callingHostID = (callingHostID == null) ? Optional.<UUIDNullable>empty() : callingHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListStorageContainersRequest that = (ListStorageContainersRequest) o;
        return 
            Objects.equals(storageContainerIDs, that.storageContainerIDs) &&
            Objects.equals(callingHostID, that.callingHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( storageContainerIDs, callingHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("storageContainerIDs", storageContainerIDs);
        map.put("callingHostID", callingHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != storageContainerIDs && storageContainerIDs.isPresent()){
            sb.append(" storageContainerIDs : ").append(storageContainerIDs.get()).append(",");
        }
        if(null != callingHostID && callingHostID.isPresent()){
            sb.append(" callingHostID : ").append(callingHostID.get()).append(",");
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
        private Optional<UUIDNullable[]> storageContainerIDs;
        private Optional<UUIDNullable> callingHostID;

        private Builder() { }

        public ListStorageContainersRequest build() {
            return new ListStorageContainersRequest (
                         this.storageContainerIDs,
                         this.callingHostID);
        }

        private ListStorageContainersRequest.Builder buildFrom(final ListStorageContainersRequest req) {
            this.storageContainerIDs = req.storageContainerIDs;
            this.callingHostID = req.callingHostID;

            return this;
        }

        public ListStorageContainersRequest.Builder optionalStorageContainerIDs(final UUIDNullable[] storageContainerIDs) {
            this.storageContainerIDs = (storageContainerIDs == null) ? Optional.<UUIDNullable[]>empty() : Optional.of(storageContainerIDs);
            return this;
        }

        public ListStorageContainersRequest.Builder optionalCallingHostID(final UUIDNullable callingHostID) {
            this.callingHostID = (callingHostID == null) ? Optional.<UUIDNullable>empty() : Optional.of(callingHostID);
            return this;
        }

    }
}
