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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetAPIResult implements Serializable {

    public static final long serialVersionUID = -334735413474527149L;
    @SerializedName("currentVersion") private Double currentVersion;
    @SerializedName("supportedVersions") private Double[] supportedVersions;

    // empty constructor
    @Since("7.0")
    public GetAPIResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetAPIResult(
        Double currentVersion,
        Double[] supportedVersions
    )
    {
        this.currentVersion = currentVersion;
        this.supportedVersions = supportedVersions;
    }

    /** 
     **/
    public Double getCurrentVersion() { return this.currentVersion; }
    public void setCurrentVersion(Double currentVersion) { 
        this.currentVersion = currentVersion;
    }
    /** 
     **/
    public Double[] getSupportedVersions() { return this.supportedVersions; }
    public void setSupportedVersions(Double[] supportedVersions) { 
        this.supportedVersions = supportedVersions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAPIResult that = (GetAPIResult) o;
        return 
            Objects.equals(currentVersion, that.currentVersion) &&
            Arrays.equals(supportedVersions, that.supportedVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash( currentVersion, (Object[])supportedVersions );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("currentVersion", currentVersion);
        map.put("supportedVersions", supportedVersions);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" currentVersion : ").append(currentVersion).append(",");
        sb.append(" supportedVersions : ").append(Arrays.toString(supportedVersions)).append(",");
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
        private Double currentVersion;
        private Double[] supportedVersions;

        private Builder() { }

        public GetAPIResult build() {
            return new GetAPIResult (
                         this.currentVersion,
                         this.supportedVersions);
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
