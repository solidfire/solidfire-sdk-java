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
 * The object returned by the "TestConnectEnsemble" API Service call.
 **/
public class TestConnectEnsembleResult  implements Serializable  {

    private static final long serialVersionUID = -653594735L;

    @SerializedName("details") private TestConnectEnsembleDetails details;
    @SerializedName("duration") private String duration;
    @SerializedName("result") private String result;

    /**
     * The object returned by the "TestConnectEnsemble" API Service call.
     * @param details [required] 
     * @param duration [required] The length of time required to run the test.
     * @param result [required] The results of the entire test
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectEnsembleResult(TestConnectEnsembleDetails details, String duration, String result) {
        this.details = details;
        this.duration = duration;
        this.result = result;
    }

    
    /**
     * The object returned by the "TestConnectEnsemble" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectEnsembleResult() {}

    public TestConnectEnsembleDetails getDetails() {
        return this.details;
    }

    public void setDetails(TestConnectEnsembleDetails details) {
        this.details = details;
    }

    /**
     * The length of time required to run the test.
     **/
    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * The results of the entire test
     **/
    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectEnsembleResult that = (TestConnectEnsembleResult) o;
        

        return Objects.equals( details , that.details )
            && Objects.equals( duration , that.duration )
            && Objects.equals( result , that.result );
    }

    @Override
    public int hashCode() {
        return Objects.hash( details, duration, result );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" details : ").append(details).append(",");
        sb.append(" duration : ").append(duration).append(",");
        sb.append(" result : ").append(result);
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
        private TestConnectEnsembleDetails details;
        private String duration;
        private String result;

        private Builder() { }

        public TestConnectEnsembleResult build() {
            return new TestConnectEnsembleResult (
                         this.details,
                         this.duration,
                         this.result            );
        }

        private TestConnectEnsembleResult.Builder buildFrom(final TestConnectEnsembleResult req) {
            this.details = req.details;
            this.duration = req.duration;
            this.result = req.result;

            return this;
        }

        public TestConnectEnsembleResult.Builder details(final TestConnectEnsembleDetails details) {
            this.details = details;
            return this;
        }

        public TestConnectEnsembleResult.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

        public TestConnectEnsembleResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

    }

}
