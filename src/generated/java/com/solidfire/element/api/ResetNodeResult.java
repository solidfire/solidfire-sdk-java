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
 * ResetNodeResult  
 **/

public class ResetNodeResult implements Serializable {

    public static final long serialVersionUID = 1393122486488072595L;
    @SerializedName("details") private Optional<ResetNodeDetails> details;
    @SerializedName("duration") private Optional<String> duration;
    @SerializedName("result") private Optional<String> result;
    // empty constructor
    @Since("7.0")
    public ResetNodeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeResult(
        Optional<ResetNodeDetails> details,
        Optional<String> duration,
        Optional<String> result
    )
    {
        this.details = (details == null) ? Optional.<ResetNodeDetails>empty() : details;
        this.duration = (duration == null) ? Optional.<String>empty() : duration;
        this.result = (result == null) ? Optional.<String>empty() : result;
    }

    /** 
     * 
     **/
    public Optional<ResetNodeDetails> getDetails() { return this.details; }
    public void setDetails(Optional<ResetNodeDetails> details) { 
        this.details = (details == null) ? Optional.<ResetNodeDetails>empty() : details;
    }
    /** 
     * 
     **/
    public Optional<String> getDuration() { return this.duration; }
    public void setDuration(Optional<String> duration) { 
        this.duration = (duration == null) ? Optional.<String>empty() : duration;
    }
    /** 
     * 
     **/
    public Optional<String> getResult() { return this.result; }
    public void setResult(Optional<String> result) { 
        this.result = (result == null) ? Optional.<String>empty() : result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeResult that = (ResetNodeResult) o;

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

        if(null != details && details.isPresent()){
            sb.append(" details : ").append(details).append(",");
        }
        if(null != duration && duration.isPresent()){
            sb.append(" duration : ").append(duration).append(",");
        }
        if(null != result && result.isPresent()){
            sb.append(" result : ").append(result).append(",");
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
        private Optional<ResetNodeDetails> details;
        private Optional<String> duration;
        private Optional<String> result;

        private Builder() { }

        public ResetNodeResult build() {
            return new ResetNodeResult (
                         this.details,
                         this.duration,
                         this.result);
        }

        private ResetNodeResult.Builder buildFrom(final ResetNodeResult req) {
            this.details = req.details;
            this.duration = req.duration;
            this.result = req.result;

            return this;
        }

        public ResetNodeResult.Builder optionalDetails(final ResetNodeDetails details) {
            this.details = (details == null) ? Optional.<ResetNodeDetails>empty() : Optional.of(details);
            return this;
        }

        public ResetNodeResult.Builder optionalDuration(final String duration) {
            this.duration = (duration == null) ? Optional.<String>empty() : Optional.of(duration);
            return this;
        }

        public ResetNodeResult.Builder optionalResult(final String result) {
            this.result = (result == null) ? Optional.<String>empty() : Optional.of(result);
            return this;
        }

    }
}
