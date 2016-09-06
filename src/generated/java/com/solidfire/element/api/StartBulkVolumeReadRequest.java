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
 * The Request object for the "StartBulkVolumeRead" API Service call.
 **/
public class StartBulkVolumeReadRequest  implements Serializable  {

    private static final long serialVersionUID = -953327189L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("format") private final String format;
    @SerializedName("snapshotID") private final Optional<Long> snapshotID;
    @SerializedName("script") private final Optional<String> script;
    @SerializedName("scriptParameters") private final Optional<Object> scriptParameters;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "StartBulkVolumeRead" API Service call.
     * @param volumeID [required] ID of the volume to be read.
     * @param format [required] The format of the volume data. Can be either:
     * @param snapshotID (optional) ID of a previously created snapshot used for bulk volume reads.
     * @param script (optional) Executable name of a script.
     * @param scriptParameters (optional) JSON parameters to pass to the script.
     * @param attributes (optional) JSON attributes for the bulk volume job.
     * @since 7.0
     **/
    @Since("7.0")
    public StartBulkVolumeReadRequest(Long volumeID, String format, Optional<Long> snapshotID, Optional<String> script, Optional<Object> scriptParameters, Optional<java.util.Map<String, Object>> attributes) {
        this.format = format;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.volumeID = volumeID;
        this.script = (script == null) ? Optional.<String>empty() : script;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.scriptParameters = (scriptParameters == null) ? Optional.<Object>empty() : scriptParameters;
    }


    /**
     * ID of the volume to be read.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * The format of the volume data. Can be either:
     * <br/><b>uncompressed</b>: every byte of the volume is returned without any compression.
     * <br/><b>native</b>: opaque data is returned that is smaller and more efficiently stored and written on a subsequent bulk volume write.
     **/
    public String getFormat() {
        return this.format;
    }

    /**
     * ID of a previously created snapshot used for bulk volume reads.
     * If no ID is entered, a snapshot of the current active volume image is made.
     **/
    public Optional<Long> getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * Executable name of a script.
     * If no script name is given then the key and URL is necessary to access SolidFire nodes.
     * The script is run on the primary node and the key and URL is returned to the script so the local web server can be contacted.
     **/
    public Optional<String> getScript() {
        return this.script;
    }

    /**
     * JSON parameters to pass to the script.
     **/
    public Optional<Object> getScriptParameters() {
        return this.scriptParameters;
    }

    /**
     * JSON attributes for the bulk volume job.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartBulkVolumeReadRequest that = (StartBulkVolumeReadRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( format , that.format )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( script , that.script )
            && Objects.equals( scriptParameters , that.scriptParameters )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, format, snapshotID, script, scriptParameters, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" format : ").append(format).append(",");
        if(null != snapshotID && snapshotID.isPresent())
            sb.append(" snapshotID : ").append(snapshotID.get()).append(",");
        if(null != script && script.isPresent())
            sb.append(" script : ").append(script.get()).append(",");
        if(null != scriptParameters && scriptParameters.isPresent())
            sb.append(" scriptParameters : ").append(scriptParameters.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private Optional<Long> snapshotID;
        private Optional<String> script;
        private Optional<Object> scriptParameters;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public StartBulkVolumeReadRequest build() {
            return new StartBulkVolumeReadRequest (
                         this.volumeID,
                         this.format,
                         this.snapshotID,
                         this.script,
                         this.scriptParameters,
                         this.attributes            );
        }

        private StartBulkVolumeReadRequest.Builder buildFrom(final StartBulkVolumeReadRequest req) {
            this.volumeID = req.volumeID;
            this.format = req.format;
            this.snapshotID = req.snapshotID;
            this.script = req.script;
            this.scriptParameters = req.scriptParameters;
            this.attributes = req.attributes;

            return this;
        }

        public StartBulkVolumeReadRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public StartBulkVolumeReadRequest.Builder format(final String format) {
            this.format = format;
            return this;
        }

        public StartBulkVolumeReadRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

        public StartBulkVolumeReadRequest.Builder optionalScript(final String script) {
            this.script = (script == null) ? Optional.<String>empty() : Optional.of(script);
            return this;
        }

        public StartBulkVolumeReadRequest.Builder optionalScriptParameters(final Object scriptParameters) {
            this.scriptParameters = (scriptParameters == null) ? Optional.<Object>empty() : Optional.of(scriptParameters);
            return this;
        }

        public StartBulkVolumeReadRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
