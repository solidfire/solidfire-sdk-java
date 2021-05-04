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
 * CompleteVolumePairingRequest  
 * You can use the CompleteVolumePairing method to complete the pairing of two volumes.
 **/

public class CompleteVolumePairingRequest implements Serializable {

    public static final long serialVersionUID = -7368306324358378292L;
    @SerializedName("volumePairingKey") private String volumePairingKey;
    @SerializedName("volumeID") private Long volumeID;
    // empty constructor
    @Since("7.0")
    public CompleteVolumePairingRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CompleteVolumePairingRequest(
        String volumePairingKey,
        Long volumeID
    )
    {
        this.volumePairingKey = volumePairingKey;
        this.volumeID = volumeID;
    }

    /** 
     * The key returned from the StartVolumePairing method.
     **/
    public String getVolumePairingKey() { return this.volumePairingKey; }
   
    public void setVolumePairingKey(String volumePairingKey) { 
        this.volumePairingKey = volumePairingKey;
    }
    /** 
     * The ID of the volume on which to complete the pairing process.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompleteVolumePairingRequest that = (CompleteVolumePairingRequest) o;

        return 
            Objects.equals(volumePairingKey, that.volumePairingKey) && 
            Objects.equals(volumeID, that.volumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumePairingKey,volumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumePairingKey", volumePairingKey);
        map.put("volumeID", volumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumePairingKey : ").append(gson.toJson(volumePairingKey)).append(",");
        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
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
        private String volumePairingKey;
        private Long volumeID;

        private Builder() { }

        public CompleteVolumePairingRequest build() {
            return new CompleteVolumePairingRequest (
                         this.volumePairingKey,
                         this.volumeID);
        }

        private CompleteVolumePairingRequest.Builder buildFrom(final CompleteVolumePairingRequest req) {
            this.volumePairingKey = req.volumePairingKey;
            this.volumeID = req.volumeID;

            return this;
        }

        public CompleteVolumePairingRequest.Builder volumePairingKey(final String volumePairingKey) {
            this.volumePairingKey = volumePairingKey;
            return this;
        }

        public CompleteVolumePairingRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
