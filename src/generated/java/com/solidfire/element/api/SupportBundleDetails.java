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
 **/

public class SupportBundleDetails implements Serializable {

    public static final long serialVersionUID = 1248942884663418761L;
    @SerializedName("bundleName") private String bundleName;
    @SerializedName("extraArgs") private String extraArgs;
    @SerializedName("files") private String[] files;
    @SerializedName("url") private String[] url;
    @SerializedName("output") private String output;
    @SerializedName("timeoutSec") private Long timeoutSec;

    // empty constructor
    @Since("7.0")
    public SupportBundleDetails() {}

    
    // parameterized constructor
    @Since("7.0")
    public SupportBundleDetails(
        String bundleName,
        String extraArgs,
        String[] files,
        String[] url,
        String output,
        Long timeoutSec
    )
    {
        this.bundleName = bundleName;
        this.extraArgs = extraArgs;
        this.files = files;
        this.url = url;
        this.output = output;
        this.timeoutSec = timeoutSec;
    }

    /** 
     * The name specified in the 'CreateSupportBundle API method. If no name was specified, 'supportbundle' will be used.
     **/
    public String getBundleName() { return this.bundleName; }
    public void setBundleName(String bundleName) { 
        this.bundleName = bundleName;
    }
    /** 
     * The arguments passed with this method.
     **/
    public String getExtraArgs() { return this.extraArgs; }
    public void setExtraArgs(String extraArgs) { 
        this.extraArgs = extraArgs;
    }
    /** 
     * A list of the support bundle files that were created.
     **/
    public String[] getFiles() { return this.files; }
    public void setFiles(String[] files) { 
        this.files = files;
    }
    /** 
     * The URL that you can use to download the bundle file(s). Should correspond 1:1 with files list.
     **/
    public String[] getUrl() { return this.url; }
    public void setUrl(String[] url) { 
        this.url = url;
    }
    /** 
     * The commands that were run and their output, with newlines replaced by HTML <br> elements.
     **/
    public String getOutput() { return this.output; }
    public void setOutput(String output) { 
        this.output = output;
    }
    /** 
     * The timeout specified for the support bundle creation process.
     **/
    public Long getTimeoutSec() { return this.timeoutSec; }
    public void setTimeoutSec(Long timeoutSec) { 
        this.timeoutSec = timeoutSec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupportBundleDetails that = (SupportBundleDetails) o;

        return 
            Objects.equals(bundleName, that.bundleName) && 
            Objects.equals(extraArgs, that.extraArgs) && 
            Arrays.equals(files, that.files) && 
            Arrays.equals(url, that.url) && 
            Objects.equals(output, that.output) && 
            Objects.equals(timeoutSec, that.timeoutSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bundleName,extraArgs,(Object[])files,(Object[])url,output,timeoutSec );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bundleName", bundleName);
        map.put("extraArgs", extraArgs);
        map.put("files", files);
        map.put("url", url);
        map.put("output", output);
        map.put("timeoutSec", timeoutSec);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" bundleName : ").append(bundleName).append(",");
        sb.append(" extraArgs : ").append(extraArgs).append(",");
        sb.append(" files : ").append(Arrays.toString(files)).append(",");
        sb.append(" url : ").append(Arrays.toString(url)).append(",");
        sb.append(" output : ").append(output).append(",");
        sb.append(" timeoutSec : ").append(timeoutSec).append(",");
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
        private String bundleName;
        private String extraArgs;
        private String[] files;
        private String[] url;
        private String output;
        private Long timeoutSec;

        private Builder() { }

        public SupportBundleDetails build() {
            return new SupportBundleDetails (
                         this.bundleName,
                         this.extraArgs,
                         this.files,
                         this.url,
                         this.output,
                         this.timeoutSec);
        }

        private SupportBundleDetails.Builder buildFrom(final SupportBundleDetails req) {
            this.bundleName = req.bundleName;
            this.extraArgs = req.extraArgs;
            this.files = req.files;
            this.url = req.url;
            this.output = req.output;
            this.timeoutSec = req.timeoutSec;

            return this;
        }

        public SupportBundleDetails.Builder bundleName(final String bundleName) {
            this.bundleName = bundleName;
            return this;
        }

        public SupportBundleDetails.Builder extraArgs(final String extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }

        public SupportBundleDetails.Builder files(final String[] files) {
            this.files = files;
            return this;
        }

        public SupportBundleDetails.Builder url(final String[] url) {
            this.url = url;
            return this;
        }

        public SupportBundleDetails.Builder output(final String output) {
            this.output = output;
            return this;
        }

        public SupportBundleDetails.Builder timeoutSec(final Long timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }

    }
}
