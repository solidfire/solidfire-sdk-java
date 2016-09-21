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

import com.google.gson.annotations.SerializedName;
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
 * The Request object for the "CompleteVolumePairing" API Service call.
 **/
public class CompleteVolumePairingRequest  implements Serializable  {

    private static final long serialVersionUID = -978139400L;

    @SerializedName("volumePairingKey") private final String volumePairingKey;
    @SerializedName("volumeID") private final Long volumeID;

    /**
     * The Request object for the "CompleteVolumePairing" API Service call.
     * @param volumePairingKey [required] The key returned from the "StartVolumePairing" API method.
     * @param volumeID [required] The ID of volume on which to complete the pairing process.
     * @since 7.0
     **/
    @Since("7.0")
    public CompleteVolumePairingRequest(String volumePairingKey, Long volumeID) {
        this.volumePairingKey = volumePairingKey;
        this.volumeID = volumeID;
    }


    /**
     * The key returned from the "StartVolumePairing" API method.
     **/
    public String getVolumePairingKey() {
        return this.volumePairingKey;
    }

    /**
     * The ID of volume on which to complete the pairing process.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompleteVolumePairingRequest that = (CompleteVolumePairingRequest) o;
        

        return Objects.equals( volumePairingKey , that.volumePairingKey )
            && Objects.equals( volumeID , that.volumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumePairingKey, volumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumePairingKey : ").append(volumePairingKey).append(",");
        sb.append(" volumeID : ").append(volumeID);
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
                         this.volumeID            );
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
