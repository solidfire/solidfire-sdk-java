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
 * The object returned by the "GetAPI" API Service call.
 **/
public class GetAPIResult  implements Serializable  {

    private static final long serialVersionUID = 478491697L;

    @SerializedName("currentVersion") private final Double currentVersion;
    @SerializedName("supportedVersions") private final Double[] supportedVersions;

    /**
     * The object returned by the "GetAPI" API Service call.
     * @param currentVersion [required] 
     * @param supportedVersions [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public GetAPIResult(Double currentVersion, Double[] supportedVersions) {
        this.currentVersion = currentVersion;
        this.supportedVersions = supportedVersions;
    }

    public Double getCurrentVersion() {
        return this.currentVersion;
    }
    public Double[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAPIResult that = (GetAPIResult) o;
        

        return Objects.equals( currentVersion , that.currentVersion )
            && Objects.deepEquals( supportedVersions , that.supportedVersions );
    }

    @Override
    public int hashCode() {
        return Objects.hash( currentVersion, supportedVersions );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" currentVersion : ").append(currentVersion).append(",");
        sb.append(" supportedVersions : ").append(Arrays.toString(supportedVersions));
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
        private Double currentVersion;
        private Double[] supportedVersions;

        private Builder() { }

        public GetAPIResult build() {
            return new GetAPIResult (
                         this.currentVersion,
                         this.supportedVersions            );
        }

        private GetAPIResult.Builder buildFrom(final GetAPIResult req) {
            this.currentVersion = req.currentVersion;
            this.supportedVersions = req.supportedVersions;

            return this;
        }

        public GetAPIResult.Builder currentVersion(final Double currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public GetAPIResult.Builder supportedVersions(final Double[] supportedVersions) {
            this.supportedVersions = supportedVersions;
            return this;
        }

    }

}
