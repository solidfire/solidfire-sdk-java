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
 * The Request object for the "ResetDrives" API Service call.
 **/
public class ResetDrivesRequest implements Serializable {

    private static final long serialVersionUID = -1664586088L;

    @SerializedName("drives") private final String drives;
    @SerializedName("force") private final boolean force;

    /**
     * The Request object for the "ResetDrives" API Service call.
     * @param drives [required] List of device names (not driveIDs) to reset.
     * @param force [required] The "force" parameter must be included on this method to successfully reset a drive.
     * @since 7.0
     **/
    @Since("7.0")
    public ResetDrivesRequest(String drives, boolean force) {
        this.drives = drives;
        this.force = force;
    }


    /**
     * List of device names (not driveIDs) to reset.
     **/
    public String getDrives() {
        return this.drives;
    }

    /**
     * The "force" parameter must be included on this method to successfully reset a drive.
     **/
    public boolean getForce() {
        return this.force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetDrivesRequest that = (ResetDrivesRequest) o;
        

        return Objects.equals( drives , that.drives )
            && Objects.equals( force , that.force );
    }

    @Override
    public int hashCode() {
        return Objects.hash( drives, force );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(drives).append(",");
        sb.append(" force : ").append(force);
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
        private String drives;
        private boolean force;

        private Builder() { }

        public ResetDrivesRequest build() {
            return new ResetDrivesRequest (
                         this.drives,
                         this.force            );
        }

        private ResetDrivesRequest.Builder buildFrom(final ResetDrivesRequest req) {
            this.drives = req.drives;
            this.force = req.force;

            return this;
        }

        public ResetDrivesRequest.Builder drives(final String drives) {
            this.drives = drives;
            return this;
        }

        public ResetDrivesRequest.Builder force(final boolean force) {
            this.force = force;
            return this;
        }

    }

}
