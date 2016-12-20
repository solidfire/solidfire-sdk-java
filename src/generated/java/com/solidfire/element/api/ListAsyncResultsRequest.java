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

public class ListAsyncResultsRequest implements Serializable {

    public static final long serialVersionUID = 3012226367212878738L;
    @SerializedName("asyncResultTypes") private Optional<String[]> asyncResultTypes;

    // empty constructor
    @Since("7.0")
    public ListAsyncResultsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListAsyncResultsRequest(
        Optional<String[]> asyncResultTypes
    )
    {
        this.asyncResultTypes = (asyncResultTypes == null) ? Optional.<String[]>empty() : asyncResultTypes;
    }

    /** 
     * An optional list of types of results. You can use this list to restrict the results to only these types of operations. Possible values:BulkVolume: Copy operations between volumes, such as backups or restores.Clone: Volume cloning operations.DriveRemoval: Operations involving the system copying data from a drive in preparation to remove it from the cluster.RtfiPendingNode: Operations involving the system installing compatible software on a node before adding it to the cluster.
     **/
    public Optional<String[]> getAsyncResultTypes() { return this.asyncResultTypes; }
    public void setAsyncResultTypes(Optional<String[]> asyncResultTypes) { 
        this.asyncResultTypes = (asyncResultTypes == null) ? Optional.<String[]>empty() : asyncResultTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAsyncResultsRequest that = (ListAsyncResultsRequest) o;

        return 
            Objects.equals(asyncResultTypes, that.asyncResultTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncResultTypes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncResultTypes", asyncResultTypes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != asyncResultTypes && asyncResultTypes.isPresent()){
            sb.append(" asyncResultTypes : ").append(asyncResultTypes).append(",");
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
        private Optional<String[]> asyncResultTypes;

        private Builder() { }

        public ListAsyncResultsRequest build() {
            return new ListAsyncResultsRequest (
                         this.asyncResultTypes);
        }

        private ListAsyncResultsRequest.Builder buildFrom(final ListAsyncResultsRequest req) {
            this.asyncResultTypes = req.asyncResultTypes;

            return this;
        }

        public ListAsyncResultsRequest.Builder optionalAsyncResultTypes(final String[] asyncResultTypes) {
            this.asyncResultTypes = (asyncResultTypes == null) ? Optional.<String[]>empty() : Optional.of(asyncResultTypes);
            return this;
        }

    }
}
