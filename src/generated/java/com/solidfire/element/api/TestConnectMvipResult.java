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
 * TestConnectMvipResult  
 **/

public class TestConnectMvipResult implements Serializable {

    public static final long serialVersionUID = -5737922408999251346L;
    @SerializedName("details") private TestConnectMvipDetails details;
    @SerializedName("duration") private String duration;
    @SerializedName("result") private String result;
    // empty constructor
    @Since("7.0")
    public TestConnectMvipResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestConnectMvipResult(
        TestConnectMvipDetails details,
        String duration,
        String result
    )
    {
        this.details = details;
        this.duration = duration;
        this.result = result;
    }

    /** 
     * Information about the test operation
     **/
    public TestConnectMvipDetails getDetails() { return this.details; }
    public void setDetails(TestConnectMvipDetails details) { 
        this.details = details;
    }
    /** 
     * The length of time required to run the test.
     **/
    public String getDuration() { return this.duration; }
    public void setDuration(String duration) { 
        this.duration = duration;
    }
    /** 
     * The results of the entire test
     **/
    public String getResult() { return this.result; }
    public void setResult(String result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectMvipResult that = (TestConnectMvipResult) o;

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

        sb.append(" details : ").append(details).append(",");
        sb.append(" duration : ").append(duration).append(",");
        sb.append(" result : ").append(result).append(",");
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
        private TestConnectMvipDetails details;
        private String duration;
        private String result;

        private Builder() { }

        public TestConnectMvipResult build() {
            return new TestConnectMvipResult (
                         this.details,
                         this.duration,
                         this.result);
        }

        private TestConnectMvipResult.Builder buildFrom(final TestConnectMvipResult req) {
            this.details = req.details;
            this.duration = req.duration;
            this.result = req.result;

            return this;
        }

        public TestConnectMvipResult.Builder details(final TestConnectMvipDetails details) {
            this.details = details;
            return this;
        }

        public TestConnectMvipResult.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

        public TestConnectMvipResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

    }
}
