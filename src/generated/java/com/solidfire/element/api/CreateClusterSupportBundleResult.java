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

public class CreateClusterSupportBundleResult implements Serializable {

    public static final long serialVersionUID = -1623647234571017356L;
    @SerializedName("details") private java.util.Map<String, Object> details;
    @SerializedName("duration") private String duration;
    @SerializedName("result") private String result;

    // empty constructor
    @Since("7.0")
    public CreateClusterSupportBundleResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateClusterSupportBundleResult(
        java.util.Map<String, Object> details,
        String duration,
        String result
    )
    {
        this.details = details;
        this.duration = duration;
        this.result = result;
    }

    /** 
     * The details of the support bundle. Values returned in 'details':
     * <br/><b>bundleName</b>- The name specified in the 'CreateSupportBundle API method. If no name was specified, 'supportbundle' will be used.
     * <br/><b>extraArgs</b>- The arguments passed with this method.
     * <br/><b>files</b>- A list of the support bundle files that were created.
     * <br/><b>output</b>- The command line output from the script that creates the support bundle.
     * <br/><b>timeoutSec</b>- The timeout specified for the support bundle creation process.
     * <br/><b>url</b>- URL to the support bundle created.
     **/
    public java.util.Map<String, Object> getDetails() { return this.details; }
    public void setDetails(java.util.Map<String, Object> details) { 
        this.details = details;
    }
    /** 
     * The amount of time required to create the support bundle in the format HH:MM:SS.ssssss
     **/
    public String getDuration() { return this.duration; }
    public void setDuration(String duration) { 
        this.duration = duration;
    }
    /** 
     * Whether the support bundle creation passed of failed.
     **/
    public String getResult() { return this.result; }
    public void setResult(String result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateClusterSupportBundleResult that = (CreateClusterSupportBundleResult) o;

        return 
            Objects.equals(details, that.details) && 
            Objects.equals(duration, that.duration) && 
            Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash( details,duration,result );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("details", details);
        map.put("duration", duration);
        map.put("result", result);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" details : ").append(details).append(",");
        sb.append(" duration : ").append(duration).append(",");
        sb.append(" result : ").append(result).append(",");
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
        private java.util.Map<String, Object> details;
        private String duration;
        private String result;

        private Builder() { }

        public CreateClusterSupportBundleResult build() {
            return new CreateClusterSupportBundleResult (
                         this.details,
                         this.duration,
                         this.result);
        }

        private CreateClusterSupportBundleResult.Builder buildFrom(final CreateClusterSupportBundleResult req) {
            this.details = req.details;
            this.duration = req.duration;
            this.result = req.result;

            return this;
        }

        public CreateClusterSupportBundleResult.Builder details(final java.util.Map<String, Object> details) {
            this.details = details;
            return this;
        }

        public CreateClusterSupportBundleResult.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

        public CreateClusterSupportBundleResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

    }
}
