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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * StartBulkVolumeReadRequest  
 * StartBulkVolumeRead enables you to initialize a bulk volume read session on a specified volume. Only two bulk volume processes
 * can run simultaneously on a volume. When you initialize the session, data is read from a SolidFire storage volume for the purposes
 * of storing the data on an external backup source. The external data is accessed by a web server running on an SF-series node.
 * Communications and server interaction information for external data access is passed by a script running on the storage system.
 * At the start of a bulk volume read operation, a snapshot of the volume is made and the snapshot is deleted when the read is complete. You can also read a snapshot of the volume by entering the ID of the snapshot as a parameter. When you read a
 * previous snapshot, the system does not create a new snapshot of the volume or delete the previous snapshot when the
 * read completes.
 * Note: This process creates a new snapshot if the ID of an existing snapshot is not provided. Snapshots can be created if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
 **/

public class StartBulkVolumeReadRequest implements Serializable {

    public static final long serialVersionUID = 371997972445094346L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("format") private String format;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("script") private Optional<String> script;
    @SerializedName("scriptParameters") private Optional<Attributes> scriptParameters;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public StartBulkVolumeReadRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public StartBulkVolumeReadRequest(
        Long volumeID,
        String format,
        Optional<Long> snapshotID,
        Optional<String> script,
        Optional<Attributes> scriptParameters,
        Optional<Attributes> attributes
    )
    {
        this.volumeID = volumeID;
        this.format = format;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.script = (script == null) ? Optional.<String>empty() : script;
        this.scriptParameters = (scriptParameters == null) ? Optional.<Attributes>empty() : scriptParameters;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The ID of the volume to be read.
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
     * The ID of a previously created snapshot used for bulk volume
     * reads. If no ID is entered, a snapshot of the current active
     * volume image is made.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * The executable name of a script. If unspecified, the key and URL is necessary to access SF-series nodes. The script is run on the primary node and the key
     * and URL is returned to the script so the local web server
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

        StartBulkVolumeReadRequest that = (StartBulkVolumeReadRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(format, that.format) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(script, that.script) && 
            Objects.equals(scriptParameters, that.scriptParameters) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,format,snapshotID,script,scriptParameters,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("format", format);
        map.put("snapshotID", snapshotID);
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
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(snapshotID).append(",");
        }
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
        private Long volumeID;
        private String format;
        private Optional<Long> snapshotID;
        private Optional<String> script;
        private Optional<Attributes> scriptParameters;
        private Optional<Attributes> attributes;

        private Builder() { }

        public StartBulkVolumeReadRequest build() {
            return new StartBulkVolumeReadRequest (
                         this.volumeID,
                         this.format,
                         this.snapshotID,
                         this.script,
                         this.scriptParameters,
                         this.attributes);
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

        public StartBulkVolumeReadRequest.Builder optionalScriptParameters(final Attributes scriptParameters) {
            this.scriptParameters = (scriptParameters == null) ? Optional.<Attributes>empty() : Optional.of(scriptParameters);
            return this;
        }

        public StartBulkVolumeReadRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
