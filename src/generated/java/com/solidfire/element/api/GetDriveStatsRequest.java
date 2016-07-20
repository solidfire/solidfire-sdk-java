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
 * The Request object for the "GetDriveStats" API Service call.
 **/
public class GetDriveStatsRequest implements Serializable {

    private static final long serialVersionUID = -1807299748L;

    @SerializedName("driveID") private final Long driveID;

    /**
     * The Request object for the "GetDriveStats" API Service call.
     * @param driveID [required] Specifies the drive for which statistics are gathered.
     * @since 7.0
     **/
    @Since("7.0")
    public GetDriveStatsRequest(Long driveID) {
        this.driveID = driveID;
    }


    /**
     * Specifies the drive for which statistics are gathered.
     **/
    public Long getDriveID() {
        return this.driveID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetDriveStatsRequest that = (GetDriveStatsRequest) o;
        

        return Objects.equals( driveID , that.driveID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) driveID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" driveID : ").append(driveID);
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
        private Long driveID;

        private Builder() { }

        public GetDriveStatsRequest build() {
            return new GetDriveStatsRequest (
                         this.driveID            );
        }

        private GetDriveStatsRequest.Builder buildFrom(final GetDriveStatsRequest req) {
            this.driveID = req.driveID;

            return this;
        }

        public GetDriveStatsRequest.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

    }

}
