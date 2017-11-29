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
 * DeleteStorageContainersRequest  
 * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
 * The storage containers you remove must not contain any VVols.
 **/

public class DeleteStorageContainersRequest implements Serializable {

    public static final long serialVersionUID = -6842793456686063781L;
    @SerializedName("storageContainerIDs") private java.util.UUID[] storageContainerIDs;
    // empty constructor
    @Since("7.0")
    public DeleteStorageContainersRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteStorageContainersRequest(
        java.util.UUID[] storageContainerIDs
    )
    {
        this.storageContainerIDs = storageContainerIDs;
    }

    /** 
     * A list of IDs of the storage containers to delete. You can specify up to 2000 IDs in the list.
     **/
    public java.util.UUID[] getStorageContainerIDs() { return this.storageContainerIDs; }
   
    public void setStorageContainerIDs(java.util.UUID[] storageContainerIDs) { 
        this.storageContainerIDs = storageContainerIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteStorageContainersRequest that = (DeleteStorageContainersRequest) o;

        return 
            Arrays.equals(storageContainerIDs, that.storageContainerIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])storageContainerIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("storageContainerIDs", storageContainerIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" storageContainerIDs : ").append(gson.toJson(Arrays.toString(storageContainerIDs))).append(",");
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
        private java.util.UUID[] storageContainerIDs;

        private Builder() { }

        public DeleteStorageContainersRequest build() {
            return new DeleteStorageContainersRequest (
                         this.storageContainerIDs);
        }

        private DeleteStorageContainersRequest.Builder buildFrom(final DeleteStorageContainersRequest req) {
            this.storageContainerIDs = req.storageContainerIDs;

            return this;
        }

        public DeleteStorageContainersRequest.Builder storageContainerIDs(final java.util.UUID[] storageContainerIDs) {
            this.storageContainerIDs = storageContainerIDs;
            return this;
        }

    }
}
