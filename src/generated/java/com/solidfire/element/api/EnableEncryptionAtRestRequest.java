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
 * EnableEncryptionAtRestRequest  
 * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
 * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
 * Note: This does not affect performance or efficiency.
 * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
 * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
 **/

public class EnableEncryptionAtRestRequest implements Serializable {

    public static final long serialVersionUID = -8962536496054813874L;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID = Optional.of(0L);

    
    // parameterized constructor
    @Since("7.0")
    public EnableEncryptionAtRestRequest(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public EnableEncryptionAtRestRequest(
        Optional<Long> keyProviderID
    )
    {
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    /** 
     * The ID of a Key Provider to use.  This is a unique value returned as part of one of the CreateKeyProvider* methods.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableEncryptionAtRestRequest that = (EnableEncryptionAtRestRequest) o;

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

        if(null != keyProviderID && keyProviderID.isPresent()){
            sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        }
        else{
            sb.append(" keyProviderID : ").append("null").append(",");
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
        private Optional<Long> keyProviderID;

        private Builder() { }

        public EnableEncryptionAtRestRequest build() {
            return new EnableEncryptionAtRestRequest (
                         this.keyProviderID);
        }

        private EnableEncryptionAtRestRequest.Builder buildFrom(final EnableEncryptionAtRestRequest req) {
            this.keyProviderID = req.keyProviderID;

            return this;
        }

        public EnableEncryptionAtRestRequest.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

    }
}
