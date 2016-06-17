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
 * The Request object for the "GetDriveHardwareInfo" API Service call.
 **/
public class GetDriveHardwareInfoRequest implements Serializable {

    private static final long serialVersionUID = -1595816663L;

    @SerializedName("driveID") private final long driveID;

    /**
     * The Request object for the "GetDriveHardwareInfo" API Service call.
     * @param driveID [required] DriveID for the drive information requested. DriveIDs can be obtained via the &quot;ListDrives&quot; method.
     * @since 7.0
     **/
    @Since("7.0")
    public GetDriveHardwareInfoRequest(long driveID) {
        this.driveID = driveID;
    }


    /**
     * DriveID for the drive information requested. DriveIDs can be obtained via the &quot;ListDrives&quot; method.
     **/
    public long getDriveID() {
        return this.driveID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetDriveHardwareInfoRequest that = (GetDriveHardwareInfoRequest) o;
        

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
        private long driveID;

        private Builder() { }

        public GetDriveHardwareInfoRequest build() {
            return new GetDriveHardwareInfoRequest (
                         this.driveID            );
        }

        private GetDriveHardwareInfoRequest.Builder buildFrom(final GetDriveHardwareInfoRequest req) {
            this.driveID = req.driveID;

            return this;
        }

        public GetDriveHardwareInfoRequest.Builder driveID(final long driveID) {
            this.driveID = driveID;
            return this;
        }

    }

}
