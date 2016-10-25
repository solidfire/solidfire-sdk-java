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
 * The Request object for the "GetStorageContainerEfficiency" API Service call.
 **/
public class GetStorageContainerEfficiencyRequest  implements Serializable  {

    private static final long serialVersionUID = -937151738L;

    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;

    /**
     * The Request object for the "GetStorageContainerEfficiency" API Service call.
     * @param storageContainerID [required] The ID of the storage container for which to retrieve efficiency information.
     * @since 9.0
     **/
    @Since("9.0")
    public GetStorageContainerEfficiencyRequest(java.util.UUID storageContainerID) {
        this.storageContainerID = storageContainerID;
    }

    
    /**
     * The Request object for the "GetStorageContainerEfficiency" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public GetStorageContainerEfficiencyRequest() {}


    /**
     * The ID of the storage container for which to retrieve efficiency information.
     **/
    public java.util.UUID getStorageContainerID() {
        return this.storageContainerID;
    }

    public void setStorageContainerID(java.util.UUID storageContainerID) {
        this.storageContainerID = storageContainerID;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetStorageContainerEfficiencyRequest that = (GetStorageContainerEfficiencyRequest) o;
        

        return Objects.equals( storageContainerID , that.storageContainerID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) storageContainerID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" storageContainerID : ").append(storageContainerID);
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
        private java.util.UUID storageContainerID;

        private Builder() { }

        public GetStorageContainerEfficiencyRequest build() {
            return new GetStorageContainerEfficiencyRequest (
                         this.storageContainerID            );
        }

        private GetStorageContainerEfficiencyRequest.Builder buildFrom(final GetStorageContainerEfficiencyRequest req) {
            this.storageContainerID = req.storageContainerID;

            return this;
        }

        public GetStorageContainerEfficiencyRequest.Builder storageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

    }

}
