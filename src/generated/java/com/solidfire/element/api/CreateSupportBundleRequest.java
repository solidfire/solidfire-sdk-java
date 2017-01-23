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
 * CreateSupportBundleRequest  
 **/

public class CreateSupportBundleRequest implements Serializable {

    public static final long serialVersionUID = 196790633413215638L;
    @SerializedName("bundleName") private Optional<String> bundleName;
    @SerializedName("extraArgs") private Optional<String> extraArgs;
    @SerializedName("timeoutSec") private Optional<Long> timeoutSec;

    // empty constructor
    @Since("7.0")
    public CreateSupportBundleRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateSupportBundleRequest(
        Optional<String> bundleName,
        Optional<String> extraArgs,
        Optional<Long> timeoutSec
    )
    {
        this.bundleName = (bundleName == null) ? Optional.<String>empty() : bundleName;
        this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : extraArgs;
        this.timeoutSec = (timeoutSec == null) ? Optional.<Long>empty() : timeoutSec;
    }

    /** 
     * Unique name for each support bundle created. If no name is provided, then 'supportbundle' and the node name is used as a file name.
     **/
    public Optional<String> getBundleName() { return this.bundleName; }
    public void setBundleName(Optional<String> bundleName) { 
        this.bundleName = (bundleName == null) ? Optional.<String>empty() : bundleName;
    }
    /** 
     * This parameter is fed to the sf_make_support_bundle script. Should be used only at the request of SolidFire Support.
     **/
    public Optional<String> getExtraArgs() { return this.extraArgs; }
    public void setExtraArgs(Optional<String> extraArgs) { 
        this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : extraArgs;
    }
    /** 
     * The number of seconds to let the support bundle script run before timing out and stopping. Default is 1500 seconds.
     **/
    public Optional<Long> getTimeoutSec() { return this.timeoutSec; }
    public void setTimeoutSec(Optional<Long> timeoutSec) { 
        this.timeoutSec = (timeoutSec == null) ? Optional.<Long>empty() : timeoutSec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSupportBundleRequest that = (CreateSupportBundleRequest) o;

        return 
            Objects.equals(bundleName, that.bundleName) && 
            Objects.equals(extraArgs, that.extraArgs) && 
            Objects.equals(timeoutSec, that.timeoutSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bundleName,extraArgs,timeoutSec );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bundleName", bundleName);
        map.put("extraArgs", extraArgs);
        map.put("timeoutSec", timeoutSec);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != bundleName && bundleName.isPresent()){
            sb.append(" bundleName : ").append(bundleName).append(",");
        }
        if(null != extraArgs && extraArgs.isPresent()){
            sb.append(" extraArgs : ").append(extraArgs).append(",");
        }
        if(null != timeoutSec && timeoutSec.isPresent()){
            sb.append(" timeoutSec : ").append(timeoutSec).append(",");
        }
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
        private Optional<String> bundleName;
        private Optional<String> extraArgs;
        private Optional<Long> timeoutSec;

        private Builder() { }

        public CreateSupportBundleRequest build() {
            return new CreateSupportBundleRequest (
                         this.bundleName,
                         this.extraArgs,
                         this.timeoutSec);
        }

        private CreateSupportBundleRequest.Builder buildFrom(final CreateSupportBundleRequest req) {
            this.bundleName = req.bundleName;
            this.extraArgs = req.extraArgs;
            this.timeoutSec = req.timeoutSec;

            return this;
        }

        public CreateSupportBundleRequest.Builder optionalBundleName(final String bundleName) {
            this.bundleName = (bundleName == null) ? Optional.<String>empty() : Optional.of(bundleName);
            return this;
        }

        public CreateSupportBundleRequest.Builder optionalExtraArgs(final String extraArgs) {
            this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : Optional.of(extraArgs);
            return this;
        }

        public CreateSupportBundleRequest.Builder optionalTimeoutSec(final Long timeoutSec) {
            this.timeoutSec = (timeoutSec == null) ? Optional.<Long>empty() : Optional.of(timeoutSec);
            return this;
        }

    }
}
