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
 * DeleteKeyProviderKmipRequest  
 * Delete the specified inactive Key Provider.
 **/

public class DeleteKeyProviderKmipRequest implements Serializable {

    public static final long serialVersionUID = 3261437507390893379L;
    @SerializedName("keyProviderID") private Long keyProviderID;
    // empty constructor
    @Since("7.0")
    public DeleteKeyProviderKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteKeyProviderKmipRequest(
        Long keyProviderID
    )
    {
        this.keyProviderID = keyProviderID;
    }

    /** 
     * The ID of the Key Provider to delete.
     **/
    public Long getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Long keyProviderID) { 
        this.keyProviderID = keyProviderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteKeyProviderKmipRequest that = (DeleteKeyProviderKmipRequest) o;

        return 
            Objects.equals(keyProviderID, that.keyProviderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderID", keyProviderID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
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
        private Long keyProviderID;

        private Builder() { }

        public DeleteKeyProviderKmipRequest build() {
            return new DeleteKeyProviderKmipRequest (
                         this.keyProviderID);
        }

        private DeleteKeyProviderKmipRequest.Builder buildFrom(final DeleteKeyProviderKmipRequest req) {
            this.keyProviderID = req.keyProviderID;

            return this;
        }

        public DeleteKeyProviderKmipRequest.Builder keyProviderID(final Long keyProviderID) {
            this.keyProviderID = keyProviderID;
            return this;
        }

    }
}
