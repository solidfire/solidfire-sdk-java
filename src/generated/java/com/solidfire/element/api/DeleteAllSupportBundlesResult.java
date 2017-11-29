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
 * DeleteAllSupportBundlesResult  
 **/

public class DeleteAllSupportBundlesResult implements Serializable {

    public static final long serialVersionUID = 7732374151828081164L;
    @SerializedName("duration") private String duration;
    @SerializedName("details") private Attributes details;
    @SerializedName("result") private String result;
    // empty constructor
    @Since("7.0")
    public DeleteAllSupportBundlesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteAllSupportBundlesResult(
        String duration,
        Attributes details,
        String result
    )
    {
        this.duration = duration;
        this.details = details;
        this.result = result;
    }

    /** 
     * 
     **/
    public String getDuration() { return this.duration; }
   
    public void setDuration(String duration) { 
        this.duration = duration;
    }
    /** 
     * 
     **/
    public Attributes getDetails() { return this.details; }
   
    public void setDetails(Attributes details) { 
        this.details = details;
    }
    /** 
     * 
     **/
    public String getResult() { return this.result; }
   
    public void setResult(String result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteAllSupportBundlesResult that = (DeleteAllSupportBundlesResult) o;

        return 
            Objects.equals(duration, that.duration) && 
            Objects.equals(details, that.details) && 
            Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash( duration,details,result );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("duration", duration);
        map.put("details", details);
        map.put("result", result);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" duration : ").append(gson.toJson(duration)).append(",");
        sb.append(" details : ").append(gson.toJson(details)).append(",");
        sb.append(" result : ").append(gson.toJson(result)).append(",");
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
        private String duration;
        private Attributes details;
        private String result;

        private Builder() { }

        public DeleteAllSupportBundlesResult build() {
            return new DeleteAllSupportBundlesResult (
                         this.duration,
                         this.details,
                         this.result);
        }

        private DeleteAllSupportBundlesResult.Builder buildFrom(final DeleteAllSupportBundlesResult req) {
            this.duration = req.duration;
            this.details = req.details;
            this.result = req.result;

            return this;
        }

        public DeleteAllSupportBundlesResult.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

        public DeleteAllSupportBundlesResult.Builder details(final Attributes details) {
            this.details = details;
            return this;
        }

        public DeleteAllSupportBundlesResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

    }
}
