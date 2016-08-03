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
 * 
 **/
public class BulkVolumeJob  implements Serializable  {

    private static final long serialVersionUID = 1916802850L;

    @SerializedName("bulkVolumeID") private final Long bulkVolumeID;
    @SerializedName("createTime") private final String createTime;
    @SerializedName("elapsedTime") private final Long elapsedTime;
    @SerializedName("format") private final String format;
    @SerializedName("key") private final String key;
    @SerializedName("percentComplete") private final Long percentComplete;
    @SerializedName("remainingTime") private final Long remainingTime;
    @SerializedName("srcVolumeID") private final Long srcVolumeID;
    @SerializedName("status") private final String status;
    @SerializedName("script") private final String script;
    @SerializedName("snapshotID") private final Long snapshotID;
    @SerializedName("type") private final String type;
    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;

    /**
     * 
     * @param bulkVolumeID [required] The internal bulk volume job ID.
     * @param createTime [required] Timestamp created for the bulk volume job.
     * @param format [required] Format is either &quot;compressed&quot; or &quot;native&quot;.
     * @param key [required] The unique key created by the bulk volume session.
     * @param percentComplete [required] The completed percentage reported by the operation.
     * @param remainingTime [required] The estimated time remaining in seconds.
     * @param srcVolumeID [required] The source volume ID.
     * @param status [required] Can be one of the following:
     * @param script [required] The name of the script if one is provided.
     * @param snapshotID [required] ID of the snapshot if a snapshot is in the source of the bulk volume job.
     * @param type [required] Can be one of the following:
     * @param attributes [required] JSON attributes on the bulk volume job.
     * @since 7.0
     **/
    @Since("7.0")
    public BulkVolumeJob(Long bulkVolumeID, String createTime, String format, String key, Long percentComplete, Long remainingTime, Long srcVolumeID, String status, String script, Long snapshotID, String type, java.util.Map<String, Object> attributes) {
        this.format = format;
        this.createTime = createTime;
        this.percentComplete = percentComplete;
        this.remainingTime = remainingTime;
        this.attributes = attributes;
        this.srcVolumeID = srcVolumeID;
        this.key = key;
        this.elapsedTime = null;
        this.status = status;
        this.script = script;
        this.type = type;
        this.bulkVolumeID = bulkVolumeID;
        this.snapshotID = snapshotID;
    }

    /**
     * 
     * @param bulkVolumeID [required] The internal bulk volume job ID.
     * @param createTime [required] Timestamp created for the bulk volume job.
     * @param elapsedTime [required] The number of seconds since the job began.
     * @param format [required] Format is either &quot;compressed&quot; or &quot;native&quot;.
     * @param key [required] The unique key created by the bulk volume session.
     * @param percentComplete [required] The completed percentage reported by the operation.
     * @param remainingTime [required] The estimated time remaining in seconds.
     * @param srcVolumeID [required] The source volume ID.
     * @param status [required] Can be one of the following:
     * @param script [required] The name of the script if one is provided.
     * @param snapshotID [required] ID of the snapshot if a snapshot is in the source of the bulk volume job.
     * @param type [required] Can be one of the following:
     * @param attributes [required] JSON attributes on the bulk volume job.
     * @since 8.0
     **/
    @Since("8.0")
    public BulkVolumeJob(Long bulkVolumeID, String createTime, Long elapsedTime, String format, String key, Long percentComplete, Long remainingTime, Long srcVolumeID, String status, String script, Long snapshotID, String type, java.util.Map<String, Object> attributes) {
        this.format = format;
        this.createTime = createTime;
        this.percentComplete = percentComplete;
        this.remainingTime = remainingTime;
        this.attributes = attributes;
        this.srcVolumeID = srcVolumeID;
        this.key = key;
        this.elapsedTime = elapsedTime;
        this.status = status;
        this.script = script;
        this.type = type;
        this.bulkVolumeID = bulkVolumeID;
        this.snapshotID = snapshotID;
    }


    /**
     * The internal bulk volume job ID.
     **/
    public Long getBulkVolumeID() {
        return this.bulkVolumeID;
    }

    /**
     * Timestamp created for the bulk volume job.
     **/
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The number of seconds since the job began.
     * @since 8.0 
     **/

    @Since("8.0")
    public Long getElapsedTime() {
        return this.elapsedTime;
    }

    /**
     * Format is either &quot;compressed&quot; or &quot;native&quot;.
     **/
    public String getFormat() {
        return this.format;
    }

    /**
     * The unique key created by the bulk volume session.
     **/
    public String getKey() {
        return this.key;
    }

    /**
     * The completed percentage reported by the operation.
     **/
    public Long getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * The estimated time remaining in seconds.
     **/
    public Long getRemainingTime() {
        return this.remainingTime;
    }

    /**
     * The source volume ID.
     **/
    public Long getSrcVolumeID() {
        return this.srcVolumeID;
    }

    /**
     * Can be one of the following:
     * <br/><b>preparing</b>
     * <br/><b>active</b>
     * <br/><b>done</b>
     * <br/><b>failed</b>
     **/
    public String getStatus() {
        return this.status;
    }

    /**
     * The name of the script if one is provided.
     **/
    public String getScript() {
        return this.script;
    }

    /**
     * ID of the snapshot if a snapshot is in the source of the bulk volume job.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * Can be one of the following:
     * <br/><b>read</b>
     * <br/><b>write</b>
     **/
    public String getType() {
        return this.type;
    }

    /**
     * JSON attributes on the bulk volume job.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BulkVolumeJob that = (BulkVolumeJob) o;
        

        return Objects.equals( bulkVolumeID , that.bulkVolumeID )
            && Objects.equals( createTime , that.createTime )
            && Objects.equals( elapsedTime , that.elapsedTime )
            && Objects.equals( format , that.format )
            && Objects.equals( key , that.key )
            && Objects.equals( percentComplete , that.percentComplete )
            && Objects.equals( remainingTime , that.remainingTime )
            && Objects.equals( srcVolumeID , that.srcVolumeID )
            && Objects.equals( status , that.status )
            && Objects.equals( script , that.script )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( type , that.type )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( bulkVolumeID, createTime, elapsedTime, format, key, percentComplete, remainingTime, srcVolumeID, status, script, snapshotID, type, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" bulkVolumeID : ").append(bulkVolumeID).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" elapsedTime : ").append(elapsedTime).append(",");
        sb.append(" format : ").append(format).append(",");
        sb.append(" key : ").append(key).append(",");
        sb.append(" percentComplete : ").append(percentComplete).append(",");
        sb.append(" remainingTime : ").append(remainingTime).append(",");
        sb.append(" srcVolumeID : ").append(srcVolumeID).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" script : ").append(script).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" type : ").append(type).append(",");
        sb.append(" attributes : ").append(attributes);
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
        private Long bulkVolumeID;
        private String createTime;
        private Long elapsedTime;
        private String format;
        private String key;
        private Long percentComplete;
        private Long remainingTime;
        private Long srcVolumeID;
        private String status;
        private String script;
        private Long snapshotID;
        private String type;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public BulkVolumeJob build() {
            return new BulkVolumeJob (
                         this.bulkVolumeID,
                         this.createTime,
                         this.elapsedTime,
                         this.format,
                         this.key,
                         this.percentComplete,
                         this.remainingTime,
                         this.srcVolumeID,
                         this.status,
                         this.script,
                         this.snapshotID,
                         this.type,
                         this.attributes            );
        }

        private BulkVolumeJob.Builder buildFrom(final BulkVolumeJob req) {
            this.bulkVolumeID = req.bulkVolumeID;
            this.createTime = req.createTime;
            this.elapsedTime = req.elapsedTime;
            this.format = req.format;
            this.key = req.key;
            this.percentComplete = req.percentComplete;
            this.remainingTime = req.remainingTime;
            this.srcVolumeID = req.srcVolumeID;
            this.status = req.status;
            this.script = req.script;
            this.snapshotID = req.snapshotID;
            this.type = req.type;
            this.attributes = req.attributes;

            return this;
        }

        public BulkVolumeJob.Builder bulkVolumeID(final Long bulkVolumeID) {
            this.bulkVolumeID = bulkVolumeID;
            return this;
        }

        public BulkVolumeJob.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public BulkVolumeJob.Builder elapsedTime(final Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }

        public BulkVolumeJob.Builder format(final String format) {
            this.format = format;
            return this;
        }

        public BulkVolumeJob.Builder key(final String key) {
            this.key = key;
            return this;
        }

        public BulkVolumeJob.Builder percentComplete(final Long percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }

        public BulkVolumeJob.Builder remainingTime(final Long remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }

        public BulkVolumeJob.Builder srcVolumeID(final Long srcVolumeID) {
            this.srcVolumeID = srcVolumeID;
            return this;
        }

        public BulkVolumeJob.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public BulkVolumeJob.Builder script(final String script) {
            this.script = script;
            return this;
        }

        public BulkVolumeJob.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public BulkVolumeJob.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public BulkVolumeJob.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }

}
