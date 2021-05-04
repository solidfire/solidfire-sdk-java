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
 * KeyProviderKmip  
 * A Key Provider describes both a mechanism and a location for retrieving authentication keys for use with cluster features such as Encryption At Rest.  Some Key Providers may imply that there can only be one Key Provider of that type, while others may allow multiple Key Providers of the same type but retrieving authentication keys from different locations for different purposes.
 * A KMIP (Key Management Interoperability Protocol) Key Provider can represent a single KMIP server, a logical cluster of KMIP servers which should be kept in sync, or an actual cluster which we treat as a single server.  There can be multiple KMIP Key Providers but they must contain mutually-exclusive sets of servers.  Key UUID's will only be considered as unique within a Key Provider so there could be collisions (and resulting errors) otherwise.
 **/

public class KeyProviderKmip implements Serializable {

    public static final long serialVersionUID = -4829359360075555512L;
    @SerializedName("keyProviderName") private String keyProviderName;
    @SerializedName("keyProviderID") private Long keyProviderID;
    @SerializedName("keyProviderIsActive") private Boolean keyProviderIsActive;
    @SerializedName("keyServerIDs") private Long[] keyServerIDs;
    @SerializedName("kmipCapabilities") private String kmipCapabilities;
    // empty constructor
    @Since("7.0")
    public KeyProviderKmip() {}

    
    // parameterized constructor
    @Since("7.0")
    public KeyProviderKmip(
        String keyProviderName,
        Long keyProviderID,
        Boolean keyProviderIsActive,
        Long[] keyServerIDs,
        String kmipCapabilities
    )
    {
        this.keyProviderName = keyProviderName;
        this.keyProviderID = keyProviderID;
        this.keyProviderIsActive = keyProviderIsActive;
        this.keyServerIDs = keyServerIDs;
        this.kmipCapabilities = kmipCapabilities;
    }

    /** 
     * The name of the KMIP Key Provider.
     **/
    public String getKeyProviderName() { return this.keyProviderName; }
   
    public void setKeyProviderName(String keyProviderName) { 
        this.keyProviderName = keyProviderName;
    }
    /** 
     * The ID of the KMIP Key Provider.  This is a unique value assigned by the cluster during CreateKeyProviderKmip which cannot be changed.
     **/
    public Long getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Long keyProviderID) { 
        this.keyProviderID = keyProviderID;
    }
    /** 
     * True if the KMIP Key Provider is active.  A provider is considered active if are still outstanding keys which were created but not yet deleted and therefore assumed to still be in use.
     **/
    public Boolean getKeyProviderIsActive() { return this.keyProviderIsActive; }
   
    public void setKeyProviderIsActive(Boolean keyProviderIsActive) { 
        this.keyProviderIsActive = keyProviderIsActive;
    }
    /** 
     * A list of keyServerIDs which are grouped together within this provider.  At least one server must be added via AddKeyServerToProviderKmip before this provider can become active.  The last server cannot be removed via RemoveKeyServerFromProviderKmip or DeleteKeyServerKmip while this provider is active.
     **/
    public Long[] getKeyServerIDs() { return this.keyServerIDs; }
   
    public void setKeyServerIDs(Long[] keyServerIDs) { 
        this.keyServerIDs = keyServerIDs;
    }
    /** 
     * The capabilities of this KMIP Key Provider including details about the underlying library, FIPS compliance, SSL provider, etc.
     **/
    public String getKmipCapabilities() { return this.kmipCapabilities; }
   
    public void setKmipCapabilities(String kmipCapabilities) { 
        this.kmipCapabilities = kmipCapabilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyProviderKmip that = (KeyProviderKmip) o;

        return 
            Objects.equals(keyProviderName, that.keyProviderName) && 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(keyProviderIsActive, that.keyProviderIsActive) && 
            Arrays.equals(keyServerIDs, that.keyServerIDs) && 
            Objects.equals(kmipCapabilities, that.kmipCapabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderName,keyProviderID,keyProviderIsActive,(Object[])keyServerIDs,kmipCapabilities );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderName", keyProviderName);
        map.put("keyProviderID", keyProviderID);
        map.put("keyProviderIsActive", keyProviderIsActive);
        map.put("keyServerIDs", keyServerIDs);
        map.put("kmipCapabilities", kmipCapabilities);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" keyProviderName : ").append(gson.toJson(keyProviderName)).append(",");
        sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        sb.append(" keyProviderIsActive : ").append(gson.toJson(keyProviderIsActive)).append(",");
        sb.append(" keyServerIDs : ").append(gson.toJson(Arrays.toString(keyServerIDs))).append(",");
        sb.append(" kmipCapabilities : ").append(gson.toJson(kmipCapabilities)).append(",");
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
        private String keyProviderName;
        private Long keyProviderID;
        private Boolean keyProviderIsActive;
        private Long[] keyServerIDs;
        private String kmipCapabilities;

        private Builder() { }

        public KeyProviderKmip build() {
            return new KeyProviderKmip (
                         this.keyProviderName,
                         this.keyProviderID,
                         this.keyProviderIsActive,
                         this.keyServerIDs,
                         this.kmipCapabilities);
        }

        private KeyProviderKmip.Builder buildFrom(final KeyProviderKmip req) {
            this.keyProviderName = req.keyProviderName;
            this.keyProviderID = req.keyProviderID;
            this.keyProviderIsActive = req.keyProviderIsActive;
            this.keyServerIDs = req.keyServerIDs;
            this.kmipCapabilities = req.kmipCapabilities;

            return this;
        }

        public KeyProviderKmip.Builder keyProviderName(final String keyProviderName) {
            this.keyProviderName = keyProviderName;
            return this;
        }

        public KeyProviderKmip.Builder keyProviderID(final Long keyProviderID) {
            this.keyProviderID = keyProviderID;
            return this;
        }

        public KeyProviderKmip.Builder keyProviderIsActive(final Boolean keyProviderIsActive) {
            this.keyProviderIsActive = keyProviderIsActive;
            return this;
        }

        public KeyProviderKmip.Builder keyServerIDs(final Long[] keyServerIDs) {
            this.keyServerIDs = keyServerIDs;
            return this;
        }

        public KeyProviderKmip.Builder kmipCapabilities(final String kmipCapabilities) {
            this.kmipCapabilities = kmipCapabilities;
            return this;
        }

    }
}
