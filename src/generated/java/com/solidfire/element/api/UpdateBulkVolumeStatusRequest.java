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
 * UpdateBulkVolumeStatusRequest  
 * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
 * StartBulkVolumeRead or StartBulkVolumeWrite methods.
 **/

public class UpdateBulkVolumeStatusRequest implements Serializable {

    public static final long serialVersionUID = -5019666125146818914L;
    @SerializedName("key") private String key;
    @SerializedName("status") private String status;
    @SerializedName("percentComplete") private Optional<String> percentComplete;
    @SerializedName("message") private Optional<String> message;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public UpdateBulkVolumeStatusRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public UpdateBulkVolumeStatusRequest(
        String key,
        String status,
        Optional<String> percentComplete,
        Optional<String> message,
        Optional<Attributes> attributes
    )
    {
        this.key = key;
        this.status = status;
        this.percentComplete = (percentComplete == null) ? Optional.<String>empty() : percentComplete;
        this.message = (message == null) ? Optional.<String>empty() : message;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The key assigned during initialization of a
     * StartBulkVolumeRead or StartBulkVolumeWrite session.
     **/
    public String getKey() { return this.key; }
   
    public void setKey(String key) { 
        this.key = key;
    }
    /** 
     * The status of the given bulk volume job. The system sets the status. Possible values are: 
     * running: Jobs that are still active.
     * complete: Jobs that are done.
     * failed: Jobs that failed.
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * The completed progress of the bulk volume job as a
     * percentage value.
     **/
    public Optional<String> getPercentComplete() { return this.percentComplete; }
   
    public void setPercentComplete(Optional<String> percentComplete) { 
        this.percentComplete = (percentComplete == null) ? Optional.<String>empty() : percentComplete;
    }
    /** 
     * The message returned indicating the status of the bulk volume job after the job is complete.
     **/
    public Optional<String> getMessage() { return this.message; }
   
    public void setMessage(Optional<String> message) { 
        this.message = (message == null) ? Optional.<String>empty() : message;
    }
    /** 
     * JSON attributes; updates what is on the bulk volume job.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateBulkVolumeStatusRequest that = (UpdateBulkVolumeStatusRequest) o;

        return 
            Objects.equals(key, that.key) && 
            Objects.equals(status, that.status) && 
            Objects.equals(percentComplete, that.percentComplete) && 
            Objects.equals(message, that.message) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( key,status,percentComplete,message,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("key", key);
        map.put("status", status);
        map.put("percentComplete", percentComplete);
        map.put("message", message);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" key : ").append(gson.toJson(key)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        if(null != percentComplete && percentComplete.isPresent()){
            sb.append(" percentComplete : ").append(gson.toJson(percentComplete)).append(",");
        }
        else{
            sb.append(" percentComplete : ").append("null").append(",");
        }
        if(null != message && message.isPresent()){
            sb.append(" message : ").append(gson.toJson(message)).append(",");
        }
        else{
            sb.append(" message : ").append("null").append(",");
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
        private String key;
        private String status;
        private Optional<String> percentComplete;
        private Optional<String> message;
        private Optional<Attributes> attributes;

        private Builder() { }

        public UpdateBulkVolumeStatusRequest build() {
            return new UpdateBulkVolumeStatusRequest (
                         this.key,
                         this.status,
                         this.percentComplete,
                         this.message,
                         this.attributes);
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

        public UpdateBulkVolumeStatusRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
