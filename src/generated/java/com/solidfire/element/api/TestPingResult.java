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
 * TestPingResult  
 **/

public class TestPingResult implements Serializable {

    public static final long serialVersionUID = -5573014009870116151L;
    @SerializedName("result") private String result;
    @SerializedName("duration") private String duration;
    @SerializedName("details") private java.util.Map<String, Object> details;

    // empty constructor
    @Since("7.0")
    public TestPingResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestPingResult(
        String result,
        String duration,
        java.util.Map<String, Object> details
    )
    {
        this.result = result;
        this.duration = duration;
        this.details = details;
    }

    /** 
     * Result of the ping test.
     **/
    public String getResult() { return this.result; }
    public void setResult(String result) { 
        this.result = result;
    }
    /** 
     * The total duration of the ping test.
     **/
    public String getDuration() { return this.duration; }
    public void setDuration(String duration) { 
        this.duration = duration;
    }
    /** 
     * List of each IP the node was able to communicate with.
     **/
    public java.util.Map<String, Object> getDetails() { return this.details; }
    public void setDetails(java.util.Map<String, Object> details) { 
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestPingResult that = (TestPingResult) o;

        return 
            Objects.equals(result, that.result) && 
            Objects.equals(duration, that.duration) && 
            Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash( result,duration,details );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("result", result);
        map.put("duration", duration);
        map.put("details", details);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" result : ").append(result).append(",");
        sb.append(" duration : ").append(duration).append(",");
        sb.append(" details : ").append(details).append(",");
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
        private String result;
        private String duration;
        private java.util.Map<String, Object> details;

        private Builder() { }

        public TestPingResult build() {
            return new TestPingResult (
                         this.result,
                         this.duration,
                         this.details);
        }

        private TestPingResult.Builder buildFrom(final TestPingResult req) {
            this.result = req.result;
            this.duration = req.duration;
            this.details = req.details;

            return this;
        }

        public TestPingResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

        public TestPingResult.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

        public TestPingResult.Builder details(final java.util.Map<String, Object> details) {
            this.details = details;
            return this;
        }

    }
}
