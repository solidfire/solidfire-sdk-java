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
 * The Request object for the "GetVolumeStats" API Service call.
 **/
public class GetVolumeStatsRequest implements Serializable {

    private static final long serialVersionUID = -886640137L;

    private final Long volumeID;

    /**
     * The Request object for the "GetVolumeStats" API Service call.
     * @param volumeID [required] Specifies the volume for which statistics is gathered.
     * @since 7.0
     **/
    @Since("7.0")
    public GetVolumeStatsRequest(Long volumeID) {
        this.volumeID = volumeID;
    }


    /**
     * Specifies the volume for which statistics is gathered.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeStatsRequest that = (GetVolumeStatsRequest) o;
        

        return Objects.equals( volumeID , that.volumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long volumeID;

        private Builder() { }

        public GetVolumeStatsRequest toRequest() {
            return new GetVolumeStatsRequest (
                         this.volumeID            );
        }

        private GetVolumeStatsRequest.Builder fromRequest(final GetVolumeStatsRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public GetVolumeStatsRequest.Builder withVolumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }

}
