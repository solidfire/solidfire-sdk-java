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
 * The object returned by the "TestPing" API Service call.
 **/
public class TestPingResult  implements Serializable  {

    private static final long serialVersionUID = 2036029079L;

    @SerializedName("result") private final String result;
    @SerializedName("duration") private final String duration;
    @SerializedName("details") private final Object details;

    /**
     * The object returned by the "TestPing" API Service call.
     * @param result [required] Result of the ping test.
     * @param duration [required] The total duration of the ping test.
     * @param details [required] List of each IP the node was able to communicate with.
     * @since 7.0
     **/
    @Since("7.0")
    public TestPingResult(String result, String duration, Object details) {
        this.result = result;
        this.duration = duration;
        this.details = details;
    }


    /**
     * Result of the ping test.
     **/
    public String getResult() {
        return this.result;
    }

    /**
     * The total duration of the ping test.
     **/
    public String getDuration() {
        return this.duration;
    }

    /**
     * List of each IP the node was able to communicate with.
     **/
    public Object getDetails() {
        return this.details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestPingResult that = (TestPingResult) o;
        

        return Objects.equals( result , that.result )
            && Objects.equals( duration , that.duration )
            && Objects.equals( details , that.details );
    }

    @Override
    public int hashCode() {
        return Objects.hash( result, duration, details );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" result : ").append(result).append(",");
        sb.append(" duration : ").append(duration).append(",");
        sb.append(" details : ").append(details);
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
        private Object details;

        private Builder() { }

        public TestPingResult build() {
            return new TestPingResult (
                         this.result,
                         this.duration,
                         this.details            );
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

        public TestPingResult.Builder details(final Object details) {
            this.details = details;
            return this;
        }

    }

}
