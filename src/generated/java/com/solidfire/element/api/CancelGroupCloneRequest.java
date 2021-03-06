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
 * CancelGroupCloneRequest  
 * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process occurring on a group of volumes. When you cancel
 * a group clone operation, the system completes and removes the operation's associated asyncHandle.
 **/

public class CancelGroupCloneRequest implements Serializable {

    public static final long serialVersionUID = 2418838872340488982L;
    @SerializedName("groupCloneID") private Long groupCloneID;
    // empty constructor
    @Since("7.0")
    public CancelGroupCloneRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CancelGroupCloneRequest(
        Long groupCloneID
    )
    {
        this.groupCloneID = groupCloneID;
    }

    /** 
     * The cloneID for the ongoing clone process.
     **/
    public Long getGroupCloneID() { return this.groupCloneID; }
   
    public void setGroupCloneID(Long groupCloneID) { 
        this.groupCloneID = groupCloneID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CancelGroupCloneRequest that = (CancelGroupCloneRequest) o;

        return 
            Objects.equals(groupCloneID, that.groupCloneID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupCloneID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupCloneID", groupCloneID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" groupCloneID : ").append(gson.toJson(groupCloneID)).append(",");
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
        private Long groupCloneID;

        private Builder() { }

        public CancelGroupCloneRequest build() {
            return new CancelGroupCloneRequest (
                         this.groupCloneID);
        }

        private CancelGroupCloneRequest.Builder buildFrom(final CancelGroupCloneRequest req) {
            this.groupCloneID = req.groupCloneID;

            return this;
        }

        public CancelGroupCloneRequest.Builder groupCloneID(final Long groupCloneID) {
            this.groupCloneID = groupCloneID;
            return this;
        }

    }
}
