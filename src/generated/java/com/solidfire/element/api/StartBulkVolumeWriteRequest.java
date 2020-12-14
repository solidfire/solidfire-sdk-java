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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * StartBulkVolumeWriteRequest  
 * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
 * interaction information for external data access is passed by a script running on the storage system.
 **/

public class StartBulkVolumeWriteRequest implements Serializable {

    public static final long serialVersionUID = -2558952517001143025L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("format") private String format;
    @SerializedName("script") private Optional<String> script;
    @SerializedName("scriptParameters") private Optional<Attributes> scriptParameters;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public StartBulkVolumeWriteRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public StartBulkVolumeWriteRequest(
        Long volumeID,
        String format,
        Optional<String> script,
        Optional<Attributes> scriptParameters,
        Optional<Attributes> attributes
    )
    {
        this.volumeID = volumeID;
        this.format = format;
        this.script = (script == null) ? Optional.<String>empty() : script;
        this.scriptParameters = (scriptParameters == null) ? Optional.<Attributes>empty() : scriptParameters;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The ID of the volume to be written to.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The format of the volume data. It can be either of the following formats:
     * uncompressed: Every byte of the volume is returned without any compression.
     * native: Opaque data is returned that is smaller and more efficiently stored and written on a subsequent bulk
     * volume write.
     **/
    public String getFormat() { return this.format; }
   
    public void setFormat(String format) { 
        this.format = format;
    }
    /** 
     * The executable name of a script. If unspecified,
     * the key and URL are necessary to access SF-series
     * nodes. The script runs on the primary node and the key
     * and URL is returned to the script, so the local web server
     * can be contacted.
     **/
    public Optional<String> getScript() { return this.script; }
   
    public void setScript(Optional<String> script) { 
        this.script = (script == null) ? Optional.<String>empty() : script;
    }
    /** 
     * JSON parameters to pass to the script.
     **/
    public Optional<Attributes> getScriptParameters() { return this.scriptParameters; }
   
    public void setScriptParameters(Optional<Attributes> scriptParameters) { 
        this.scriptParameters = (scriptParameters == null) ? Optional.<Attributes>empty() : scriptParameters;
    }
    /** 
     * JSON attributes for the bulk volume job.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        sb.append(" format : ").append(gson.toJson(format)).append(",");
        if(null != script && script.isPresent()){
            sb.append(" script : ").append(gson.toJson(script)).append(",");
        }
        else{
            sb.append(" script : ").append("null").append(",");
        }
        if(null != scriptParameters && scriptParameters.isPresent()){
            sb.append(" scriptParameters : ").append(gson.toJson(scriptParameters)).append(",");
        }
        else{
            sb.append(" scriptParameters : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
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
        private Long volumeID;
        private String format;
        private Optional<String> script;
        private Optional<Attributes> scriptParameters;
        private Optional<Attributes> attributes;

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

        public StartBulkVolumeWriteRequest.Builder volumeID(final Long volumeID) {
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

        public StartBulkVolumeWriteRequest.Builder optionalScriptParameters(final Attributes scriptParameters) {
            this.scriptParameters = (scriptParameters == null) ? Optional.<Attributes>empty() : Optional.of(scriptParameters);
            return this;
        }

        public StartBulkVolumeWriteRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
