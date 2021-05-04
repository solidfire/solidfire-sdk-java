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
 * RemoveKeyServerFromProviderKmipRequest  
 * Remove (unassign) the specified KMIP (Key Management Interoperability Protocol) Key Server from the provider it was assigned to via AddKeyServerToProviderKmip (if any).  A KMIP Key Server can be unassigned from its provider unless it's the last one and that provider is active (providing keys which are currently in use).  If the specified KMIP Key Server is not assigned to a provider, this is a no-op and no error will be returned.
 **/

public class RemoveKeyServerFromProviderKmipRequest implements Serializable {

    public static final long serialVersionUID = 6981751463720330997L;
    @SerializedName("keyServerID") private Long keyServerID;
    // empty constructor
    @Since("7.0")
    public RemoveKeyServerFromProviderKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveKeyServerFromProviderKmipRequest(
        Long keyServerID
    )
    {
        this.keyServerID = keyServerID;
    }

    /** 
     * The ID of the KMIP Key Server to unassign.
     **/
    public Long getKeyServerID() { return this.keyServerID; }
   
    public void setKeyServerID(Long keyServerID) { 
        this.keyServerID = keyServerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveKeyServerFromProviderKmipRequest that = (RemoveKeyServerFromProviderKmipRequest) o;

        return 
            Objects.equals(keyServerID, that.keyServerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyServerID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyServerID", keyServerID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" keyServerID : ").append(gson.toJson(keyServerID)).append(",");
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
        private Long keyServerID;

        private Builder() { }

        public RemoveKeyServerFromProviderKmipRequest build() {
            return new RemoveKeyServerFromProviderKmipRequest (
                         this.keyServerID);
        }

        private RemoveKeyServerFromProviderKmipRequest.Builder buildFrom(final RemoveKeyServerFromProviderKmipRequest req) {
            this.keyServerID = req.keyServerID;

            return this;
        }

        public RemoveKeyServerFromProviderKmipRequest.Builder keyServerID(final Long keyServerID) {
            this.keyServerID = keyServerID;
            return this;
        }

    }
}
