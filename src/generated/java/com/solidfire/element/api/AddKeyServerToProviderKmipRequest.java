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
 * AddKeyServerToProviderKmipRequest  
 * Adds (assigns) the specified KMIP (Key Management Interoperability Protocol) Key Server to the specified Key Provider.  This will result in contacting the server to verify it's functional, as well as to synchronize keys in the event that there are multiple key servers assigned to the provider.  This synchronization may result in conflicts which could cause this to fail.  If the specified KMIP Key Server is already assigned to the specified Key Provider, this is a no-op and no error will be returned.  The assignment can be removed (unassigned) using RemoveKeyServerFromProviderKmip.
 **/

public class AddKeyServerToProviderKmipRequest implements Serializable {

    public static final long serialVersionUID = 8145798172550605840L;
    @SerializedName("keyProviderID") private Long keyProviderID;
    @SerializedName("keyServerID") private Long keyServerID;
    // empty constructor
    @Since("7.0")
    public AddKeyServerToProviderKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddKeyServerToProviderKmipRequest(
        Long keyProviderID,
        Long keyServerID
    )
    {
        this.keyProviderID = keyProviderID;
        this.keyServerID = keyServerID;
    }

    /** 
     * The ID of the Key Provider to assign the KMIP Key Server to.
     **/
    public Long getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Long keyProviderID) { 
        this.keyProviderID = keyProviderID;
    }
    /** 
     * The ID of the KMIP Key Server to assign.
     **/
    public Long getKeyServerID() { return this.keyServerID; }
   
    public void setKeyServerID(Long keyServerID) { 
        this.keyServerID = keyServerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddKeyServerToProviderKmipRequest that = (AddKeyServerToProviderKmipRequest) o;

        return 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(keyServerID, that.keyServerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderID,keyServerID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderID", keyProviderID);
        map.put("keyServerID", keyServerID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
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
        private Long keyProviderID;
        private Long keyServerID;

        private Builder() { }

        public AddKeyServerToProviderKmipRequest build() {
            return new AddKeyServerToProviderKmipRequest (
                         this.keyProviderID,
                         this.keyServerID);
        }

        private AddKeyServerToProviderKmipRequest.Builder buildFrom(final AddKeyServerToProviderKmipRequest req) {
            this.keyProviderID = req.keyProviderID;
            this.keyServerID = req.keyServerID;

            return this;
        }

        public AddKeyServerToProviderKmipRequest.Builder keyProviderID(final Long keyProviderID) {
            this.keyProviderID = keyProviderID;
            return this;
        }

        public AddKeyServerToProviderKmipRequest.Builder keyServerID(final Long keyServerID) {
            this.keyServerID = keyServerID;
            return this;
        }

    }
}
