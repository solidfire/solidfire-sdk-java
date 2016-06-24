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
 * The Request object for the "TestDrives" API Service call.
 **/
public class TestDrivesRequest implements Serializable {

    private static final long serialVersionUID = -368803732L;

    @SerializedName("minutes") private final Optional<Long> minutes;
    @SerializedName("force") private final Boolean force;

    /**
     * The Request object for the "TestDrives" API Service call.
     * @param minutes (optional) The number of minutes to run the test can be specified.
     * @param force [required] The "force" parameter must be included on this method to successfully test the drives on the node.
     * @since 7.0
     **/
    @Since("7.0")
    public TestDrivesRequest(Optional<Long> minutes, Boolean force) {
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
        this.force = force;
    }


    /**
     * The number of minutes to run the test can be specified.
     **/
    public Optional<Long> getMinutes() {
        return this.minutes;
    }

    /**
     * The "force" parameter must be included on this method to successfully test the drives on the node.
     **/
    public Boolean getForce() {
        return this.force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDrivesRequest that = (TestDrivesRequest) o;
        

        return Objects.equals( minutes , that.minutes )
            && Objects.equals( force , that.force );
    }

    @Override
    public int hashCode() {
        return Objects.hash( minutes, force );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != minutes && minutes.isPresent())
            sb.append(" minutes : ").append(minutes.get()).append(",");
        sb.append(" force : ").append(force);
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
        private Optional<Long> minutes;
        private Boolean force;

        private Builder() { }

        public TestDrivesRequest build() {
            return new TestDrivesRequest (
                         this.minutes,
                         this.force            );
        }

        private TestDrivesRequest.Builder buildFrom(final TestDrivesRequest req) {
            this.minutes = req.minutes;
            this.force = req.force;

            return this;
        }

        public TestDrivesRequest.Builder optionalMinutes(final Long minutes) {
            this.minutes = (minutes == null) ? Optional.<Long>empty() : Optional.of(minutes);
            return this;
        }

        public TestDrivesRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

    }

}
