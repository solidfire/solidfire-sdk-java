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
 * The Request object for the "UpdateBulkVolumeStatus" API Service call.
 **/
public class UpdateBulkVolumeStatusRequest  implements Serializable  {

    private static final long serialVersionUID = 1489854499L;

    @SerializedName("key") private final String key;
    @SerializedName("status") private final String status;
    @SerializedName("percentComplete") private final Optional<String> percentComplete;
    @SerializedName("message") private final Optional<String> message;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "UpdateBulkVolumeStatus" API Service call.
     * @param key [required] The key assigned during initialization of a "StartBulkVolumeRead" or "StartBulkVolumeWrite" session.
     * @param status [required] The SolidFire system sets the status of the given bulk volume job.<br/>
     * @param percentComplete (optional) The completed progress of the bulk volume job as a percentage.
     * @param message (optional) Returns the status of the bulk volume job when the job has completed.
     * @param attributes (optional) JSON attributes  updates what is on the bulk volume job.
     * @since 7.0
     **/
    @Since("7.0")
    public UpdateBulkVolumeStatusRequest(String key, String status, Optional<String> percentComplete, Optional<String> message, Optional<java.util.Map<String, Object>> attributes) {
        this.percentComplete = (percentComplete == null) ? Optional.<String>empty() : percentComplete;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.key = key;
        this.status = status;
        this.message = (message == null) ? Optional.<String>empty() : message;
    }


    /**
     * The key assigned during initialization of a "StartBulkVolumeRead" or "StartBulkVolumeWrite" session.
     **/
    public String getKey() {
        return this.key;
    }

    /**
     * The SolidFire system sets the status of the given bulk volume job.<br/>
     * Possible values:<br/>
     * <b>running</b>: jobs that are still active.
     * <b>complete</b>: jobs that are done. failed - jobs that have failed.
     * <b>failed</b>: jobs that have failed.
     **/
    public String getStatus() {
        return this.status;
    }

    /**
     * The completed progress of the bulk volume job as a percentage.
     **/
    public Optional<String> getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * Returns the status of the bulk volume job when the job has completed.
     **/
    public Optional<String> getMessage() {
        return this.message;
    }

    /**
     * JSON attributes  updates what is on the bulk volume job.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateBulkVolumeStatusRequest that = (UpdateBulkVolumeStatusRequest) o;
        

        return Objects.equals( key , that.key )
            && Objects.equals( status , that.status )
            && Objects.equals( percentComplete , that.percentComplete )
            && Objects.equals( message , that.message )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( key, status, percentComplete, message, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" key : ").append(key).append(",");
        sb.append(" status : ").append(status).append(",");
        if(null != percentComplete && percentComplete.isPresent())
            sb.append(" percentComplete : ").append(percentComplete.get()).append(",");
        if(null != message && message.isPresent())
            sb.append(" message : ").append(message.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private String key;
        private String status;
        private Optional<String> percentComplete;
        private Optional<String> message;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public UpdateBulkVolumeStatusRequest build() {
            return new UpdateBulkVolumeStatusRequest (
                         this.key,
                         this.status,
                         this.percentComplete,
                         this.message,
                         this.attributes            );
        }

        private UpdateBulkVolumeStatusRequest.Builder buildFrom(final UpdateBulkVolumeStatusRequest req) {
            this.key = req.key;
            this.status = req.status;
            this.percentComplete = req.percentComplete;
            this.message = req.message;
            this.attributes = req.attributes;

            return this;
        }

        public UpdateBulkVolumeStatusRequest.Builder key(final String key) {
            this.key = key;
            return this;
        }

        public UpdateBulkVolumeStatusRequest.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public UpdateBulkVolumeStatusRequest.Builder optionalPercentComplete(final String percentComplete) {
            this.percentComplete = (percentComplete == null) ? Optional.<String>empty() : Optional.of(percentComplete);
            return this;
        }

        public UpdateBulkVolumeStatusRequest.Builder optionalMessage(final String message) {
            this.message = (message == null) ? Optional.<String>empty() : Optional.of(message);
            return this;
        }

        public UpdateBulkVolumeStatusRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
