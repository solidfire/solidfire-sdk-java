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
 * StartBulkVolumeWriteRequest  
 **/

public class StartBulkVolumeWriteRequest implements Serializable {

    public static final long serialVersionUID = -7266294121919800595L;
    @SerializedName("volumeID") private VolumeID volumeID;
    @SerializedName("format") private String format;
    @SerializedName("script") private Optional<String> script;
    @SerializedName("scriptParameters") private Optional<Object> scriptParameters;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public StartBulkVolumeWriteRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public StartBulkVolumeWriteRequest(
        VolumeID volumeID,
        String format,
        Optional<String> script,
        Optional<Object> scriptParameters,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.format = format;
        this.script = (script == null) ? Optional.<String>empty() : script;
        this.scriptParameters = (scriptParameters == null) ? Optional.<Object>empty() : scriptParameters;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * ID of the volume to be written to.
     **/
    public VolumeID getVolumeID() { return this.volumeID; }
    public void setVolumeID(VolumeID volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The format of the volume data. Can be either:
     * <br/><b>uncompressed</b>: every byte of the volume is returned without any compression.
     * <br/><b>native</b>: opaque data is returned that is smaller and more efficiently stored and written on a subsequent bulk volume write
     **/
    public String getFormat() { return this.format; }
    public void setFormat(String format) { 
        this.format = format;
    }
    /** 
     * Executable name of a script.
     * If no script name is given then the key and URL are necessary to access SolidFire nodes.
     * The script runs on the primary node and the key and URL is returned to the script so the local web server can be contacted.
     **/
    public Optional<String> getScript() { return this.script; }
    public void setScript(Optional<String> script) { 
        this.script = (script == null) ? Optional.<String>empty() : script;
    }
    /** 
     * JSON parameters to pass to the script.
     **/
    public Optional<Object> getScriptParameters() { return this.scriptParameters; }
    public void setScriptParameters(Optional<Object> scriptParameters) { 
        this.scriptParameters = (scriptParameters == null) ? Optional.<Object>empty() : scriptParameters;
    }
    /** 
     * JSON attributes for the bulk volume job.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartBulkVolumeWriteRequest that = (StartBulkVolumeWriteRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(format, that.format) && 
            Objects.equals(script, that.script) && 
            Objects.equals(scriptParameters, that.scriptParameters) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,format,script,scriptParameters,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("format", format);
        map.put("script", script);
        map.put("scriptParameters", scriptParameters);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" format : ").append(format).append(",");
        if(null != script && script.isPresent()){
            sb.append(" script : ").append(script).append(",");
        }
        if(null != scriptParameters && scriptParameters.isPresent()){
            sb.append(" scriptParameters : ").append(scriptParameters).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private VolumeID volumeID;
        private String format;
        private Optional<String> script;
        private Optional<Object> scriptParameters;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public StartBulkVolumeWriteRequest build() {
            return new StartBulkVolumeWriteRequest (
                         this.volumeID,
                         this.format,
                         this.script,
                         this.scriptParameters,
                         this.attributes);
        }

        private StartBulkVolumeWriteRequest.Builder buildFrom(final StartBulkVolumeWriteRequest req) {
            this.volumeID = req.volumeID;
            this.format = req.format;
            this.script = req.script;
            this.scriptParameters = req.scriptParameters;
            this.attributes = req.attributes;

            return this;
        }

        public StartBulkVolumeWriteRequest.Builder volumeID(final VolumeID volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public StartBulkVolumeWriteRequest.Builder format(final String format) {
            this.format = format;
            return this;
        }

        public StartBulkVolumeWriteRequest.Builder optionalScript(final String script) {
            this.script = (script == null) ? Optional.<String>empty() : Optional.of(script);
            return this;
        }

        public StartBulkVolumeWriteRequest.Builder optionalScriptParameters(final Object scriptParameters) {
            this.scriptParameters = (scriptParameters == null) ? Optional.<Object>empty() : Optional.of(scriptParameters);
            return this;
        }

        public StartBulkVolumeWriteRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
