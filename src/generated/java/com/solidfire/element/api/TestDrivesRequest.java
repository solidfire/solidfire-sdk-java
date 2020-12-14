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
 * TestDrivesRequest  
 * You can use the TestDrives API method to run a hardware validation on all drives on the node. This method detects hardware
 * failures on the drives (if present) and reports them in the results of the validation tests.
 * You can only use the TestDrives method on nodes that are not "active" in a cluster.
 * Note: This test takes approximately 10 minutes.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class TestDrivesRequest implements Serializable {

    public static final long serialVersionUID = 2203956291459143361L;
    @SerializedName("minutes") private Optional<Long> minutes;
    @SerializedName("force") private Optional<Boolean> force;
    // empty constructor
    @Since("7.0")
    public TestDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestDrivesRequest(
        Optional<Long> minutes,
        Optional<Boolean> force
    )
    {
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    /** 
     * Specifies the number of minutes to run the test.
     **/
    public Optional<Long> getMinutes() { return this.minutes; }
   
    public void setMinutes(Optional<Long> minutes) { 
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
    }
    /** 
     * Required parameter to successfully test the drives on the node.
     **/
    public Optional<Boolean> getForce() { return this.force; }
   
    public void setForce(Optional<Boolean> force) { 
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDrivesRequest that = (TestDrivesRequest) o;

        return 
            Objects.equals(minutes, that.minutes) && 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( minutes,force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("minutes", minutes);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != minutes && minutes.isPresent()){
            sb.append(" minutes : ").append(gson.toJson(minutes)).append(",");
        }
        else{
            sb.append(" minutes : ").append("null").append(",");
        }
        if(null != force && force.isPresent()){
            sb.append(" force : ").append(gson.toJson(force)).append(",");
        }
        else{
            sb.append(" force : ").append("null").append(",");
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
        private Optional<Boolean> force;

        private Builder() { }

        public TestDrivesRequest build() {
            return new TestDrivesRequest (
                         this.minutes,
                         this.force);
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

        public TestDrivesRequest.Builder optionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }
}
