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

public class CreateStorageContainerResult implements Serializable {

    public static final long serialVersionUID = -3639316056822176673L;
    @SerializedName("storageContainer") private StorageContainer storageContainer;

    // empty constructor
    @Since("7.0")
    public CreateStorageContainerResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateStorageContainerResult(
        StorageContainer storageContainer
    )
    {
        this.storageContainer = storageContainer;
    }

    /** 
     **/
    public StorageContainer getStorageContainer() { return this.storageContainer; }
    public void setStorageContainer(StorageContainer storageContainer) { 
        this.storageContainer = storageContainer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateStorageContainerResult that = (CreateStorageContainerResult) o;

        return 
            Objects.equals(storageContainer, that.storageContainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash( storageContainer );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("storageContainer", storageContainer);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" storageContainer : ").append(storageContainer).append(",");
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
        private StorageContainer storageContainer;

        private Builder() { }

        public CreateStorageContainerResult build() {
            return new CreateStorageContainerResult (
                         this.storageContainer);
        }

        private CreateStorageContainerResult.Builder buildFrom(final CreateStorageContainerResult req) {
            this.storageContainer = req.storageContainer;

            return this;
        }

        public CreateStorageContainerResult.Builder storageContainer(final StorageContainer storageContainer) {
            this.storageContainer = storageContainer;
            return this;
        }

    }
}
