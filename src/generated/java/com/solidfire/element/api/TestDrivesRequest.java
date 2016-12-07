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
 * 
 **/

public class TestDrivesRequest implements Serializable {

    public static final long serialVersionUID = -5757296498888204657L;
    @SerializedName("minutes") private Optional<Long> minutes;

    // empty constructor
    @Since("7.0")
    public TestDrivesRequest() {}

    // parameterized constructor
    @Since("7.0")
    public TestDrivesRequest(
        Optional<Long> minutes
    )
    {
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
    }

    /** 
     * The number of minutes to run the test can be specified.
     **/
    public Optional<Long> getMinutes() { return this.minutes; }
    public void setMinutes(Optional<Long> minutes) { 
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDrivesRequest that = (TestDrivesRequest) o;

        return 
            Objects.equals(minutes, that.minutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( minutes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("minutes", minutes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != minutes && minutes.isPresent()){
            sb.append(" minutes : ").append(minutes).append(",");
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
        private Optional<Long> minutes;

        private Builder() { }

        public TestDrivesRequest build() {
            return new TestDrivesRequest (
                         this.minutes);
        }

        private TestDrivesRequest.Builder buildFrom(final TestDrivesRequest req) {
            this.minutes = req.minutes;

            return this;
        }

        public TestDrivesRequest.Builder optionalMinutes(final Long minutes) {
            this.minutes = (minutes == null) ? Optional.<Long>empty() : Optional.of(minutes);
            return this;
        }

    }
}
