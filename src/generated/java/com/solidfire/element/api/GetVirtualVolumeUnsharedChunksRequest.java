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
 * The Request object for the "GetVirtualVolumeUnsharedChunks" API Service call.
 **/
public class GetVirtualVolumeUnsharedChunksRequest  implements Serializable  {

    private static final long serialVersionUID = -1493338607L;

    @SerializedName("virtualVolumeID") private final java.util.UUID virtualVolumeID;
    @SerializedName("baseVirtualVolumeID") private final java.util.UUID baseVirtualVolumeID;
    @SerializedName("segmentStart") private final Long segmentStart;
    @SerializedName("segmentLength") private final Long segmentLength;
    @SerializedName("chunkSize") private final Long chunkSize;
    @SerializedName("callingVirtualVolumeHostID") private final Optional<java.util.UUID> callingVirtualVolumeHostID;

    /**
     * The Request object for the "GetVirtualVolumeUnsharedChunks" API Service call.
     * @param virtualVolumeID [required] The ID of the Virtual Volume.
     * @param baseVirtualVolumeID [required] The ID of the Virtual Volume to compare against.
     * @param segmentStart [required] Start Byte offset.
     * @param segmentLength [required] Length of the scan segment in bytes.
     * @param chunkSize [required] Number of bytes represented by one bit in the bitmap.
     * @param callingVirtualVolumeHostID (optional) 
     * @since 9.0
     **/
    @Since("9.0")
    public GetVirtualVolumeUnsharedChunksRequest(java.util.UUID virtualVolumeID, java.util.UUID baseVirtualVolumeID, Long segmentStart, Long segmentLength, Long chunkSize, Optional<java.util.UUID> callingVirtualVolumeHostID) {
        this.chunkSize = chunkSize;
        this.virtualVolumeID = virtualVolumeID;
        this.baseVirtualVolumeID = baseVirtualVolumeID;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
        this.segmentStart = segmentStart;
        this.segmentLength = segmentLength;
    }


    /**
     * The ID of the Virtual Volume.
     **/
    public java.util.UUID getVirtualVolumeID() {
        return this.virtualVolumeID;
    }

    /**
     * The ID of the Virtual Volume to compare against.
     **/
    public java.util.UUID getBaseVirtualVolumeID() {
        return this.baseVirtualVolumeID;
    }

    /**
     * Start Byte offset.
     **/
    public Long getSegmentStart() {
        return this.segmentStart;
    }

    /**
     * Length of the scan segment in bytes.
     **/
    public Long getSegmentLength() {
        return this.segmentLength;
    }

    /**
     * Number of bytes represented by one bit in the bitmap.
     **/
    public Long getChunkSize() {
        return this.chunkSize;
    }
    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() {
        return this.callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVirtualVolumeUnsharedChunksRequest that = (GetVirtualVolumeUnsharedChunksRequest) o;
        

        return Objects.equals( virtualVolumeID , that.virtualVolumeID )
            && Objects.equals( baseVirtualVolumeID , that.baseVirtualVolumeID )
            && Objects.equals( segmentStart , that.segmentStart )
            && Objects.equals( segmentLength , that.segmentLength )
            && Objects.equals( chunkSize , that.chunkSize )
            && Objects.equals( callingVirtualVolumeHostID , that.callingVirtualVolumeHostID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeID, baseVirtualVolumeID, segmentStart, segmentLength, chunkSize, callingVirtualVolumeHostID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        sb.append(" baseVirtualVolumeID : ").append(baseVirtualVolumeID).append(",");
        sb.append(" segmentStart : ").append(segmentStart).append(",");
        sb.append(" segmentLength : ").append(segmentLength).append(",");
        sb.append(" chunkSize : ").append(chunkSize).append(",");
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent())
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID.get());
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
        private java.util.UUID virtualVolumeID;
        private java.util.UUID baseVirtualVolumeID;
        private Long segmentStart;
        private Long segmentLength;
        private Long chunkSize;
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public GetVirtualVolumeUnsharedChunksRequest build() {
            return new GetVirtualVolumeUnsharedChunksRequest (
                         this.virtualVolumeID,
                         this.baseVirtualVolumeID,
                         this.segmentStart,
                         this.segmentLength,
                         this.chunkSize,
                         this.callingVirtualVolumeHostID            );
        }

        private GetVirtualVolumeUnsharedChunksRequest.Builder buildFrom(final GetVirtualVolumeUnsharedChunksRequest req) {
            this.virtualVolumeID = req.virtualVolumeID;
            this.baseVirtualVolumeID = req.baseVirtualVolumeID;
            this.segmentStart = req.segmentStart;
            this.segmentLength = req.segmentLength;
            this.chunkSize = req.chunkSize;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder baseVirtualVolumeID(final java.util.UUID baseVirtualVolumeID) {
            this.baseVirtualVolumeID = baseVirtualVolumeID;
            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder segmentStart(final Long segmentStart) {
            this.segmentStart = segmentStart;
            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder segmentLength(final Long segmentLength) {
            this.segmentLength = segmentLength;
            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder chunkSize(final Long chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }

        public GetVirtualVolumeUnsharedChunksRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }

}
