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

public class DeleteStorageContainersRequest implements Serializable {

    public static final long serialVersionUID = 655860174858501057L;
    @SerializedName("storageContainerIDs") private UUIDNullable[] storageContainerIDs;
    @SerializedName("callingHostID") private Optional<UUIDNullable> callingHostID;

    // empty constructor
    @Since("7.0")
    public DeleteStorageContainersRequest() {}

    // parameterized constructor
    @Since("7.0")
    public DeleteStorageContainersRequest(
        UUIDNullable[] storageContainerIDs,
        Optional<UUIDNullable> callingHostID
    )
    {
        this.storageContainerIDs = storageContainerIDs;
        this.callingHostID = (callingHostID == null) ? Optional.<UUIDNullable>empty() : callingHostID;
    }

    /** 
     * list of storageContainerID of the storage container to delete.
     **/
    public UUIDNullable[] getStorageContainerIDs() { return this.storageContainerIDs; }
    public void setStorageContainerIDs(UUIDNullable[] storageContainerIDs) { 
        this.storageContainerIDs = storageContainerIDs;
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

        DeleteStorageContainersRequest that = (DeleteStorageContainersRequest) o;
        return 
            Objects.equals(storageContainerIDs, that.storageContainerIDs) &&
            Objects.equals(callingHostID, that.callingHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])storageContainerIDs, callingHostID );
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

        sb.append(" storageContainerIDs : ").append(Arrays.toString(storageContainerIDs)).append(",");
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
        private UUIDNullable[] storageContainerIDs;
        private Optional<UUIDNullable> callingHostID;

        private Builder() { }

        public DeleteStorageContainersRequest build() {
            return new DeleteStorageContainersRequest (
                         this.storageContainerIDs,
                         this.callingHostID);
        }

        private DeleteStorageContainersRequest.Builder buildFrom(final DeleteStorageContainersRequest req) {
            this.storageContainerIDs = req.storageContainerIDs;
            this.callingHostID = req.callingHostID;

            return this;
        }

        public DeleteStorageContainersRequest.Builder storageContainerIDs(final UUIDNullable[] storageContainerIDs) {
            this.storageContainerIDs = storageContainerIDs;
            return this;
        }

        public DeleteStorageContainersRequest.Builder optionalCallingHostID(final UUIDNullable callingHostID) {
            this.callingHostID = (callingHostID == null) ? Optional.<UUIDNullable>empty() : Optional.of(callingHostID);
            return this;
        }

    }
}
