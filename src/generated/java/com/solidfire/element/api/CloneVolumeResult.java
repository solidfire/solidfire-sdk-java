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
 * The object returned by the "CloneVolume" API Service call.
 **/
public class CloneVolumeResult implements Serializable {

    private static final long serialVersionUID = 1585488476L;

    @SerializedName("cloneID") private final Long cloneID;
    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("asyncHandle") private final Long asyncHandle;

    /**
     * The object returned by the "CloneVolume" API Service call.
     * @param cloneID [required] The ID of the newly-created clone.
     * @param volumeID [required] The volume ID of the newly-created clone.
     * @param asyncHandle [required] Handle value used to track the progress of the clone.
     * @since 7.0
     **/
    @Since("7.0")
    public CloneVolumeResult(Long cloneID, Long volumeID, Long asyncHandle) {
        this.cloneID = cloneID;
        this.volumeID = volumeID;
        this.asyncHandle = asyncHandle;
    }


    /**
     * The ID of the newly-created clone.
     **/
    public Long getCloneID() {
        return this.cloneID;
    }

    /**
     * The volume ID of the newly-created clone.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * Handle value used to track the progress of the clone.
     **/
    public Long getAsyncHandle() {
        return this.asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneVolumeResult that = (CloneVolumeResult) o;
        

        return Objects.equals( cloneID , that.cloneID )
            && Objects.equals( volumeID , that.volumeID )
            && Objects.equals( asyncHandle , that.asyncHandle );
    }

    @Override
    public int hashCode() {
        return Objects.hash( cloneID, volumeID, asyncHandle );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cloneID : ").append(cloneID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" asyncHandle : ").append(asyncHandle);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long cloneID;
        private Long volumeID;
        private Long asyncHandle;

        private Builder() { }

        public CloneVolumeResult build() {
            return new CloneVolumeResult (
                         this.cloneID,
                         this.volumeID,
                         this.asyncHandle            );
        }

        private CloneVolumeResult.Builder buildFrom(final CloneVolumeResult req) {
            this.cloneID = req.cloneID;
            this.volumeID = req.volumeID;
            this.asyncHandle = req.asyncHandle;

            return this;
        }

        public CloneVolumeResult.Builder cloneID(final Long cloneID) {
            this.cloneID = cloneID;
            return this;
        }

        public CloneVolumeResult.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CloneVolumeResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

    }

}
