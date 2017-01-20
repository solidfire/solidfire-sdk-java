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
 * TestDrivesResult  
 **/

public class TestDrivesResult implements Serializable {

    public static final long serialVersionUID = 7173335651099316228L;
    @SerializedName("details") private String details;

    // empty constructor
    @Since("7.0")
    public TestDrivesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestDrivesResult(
        String details
    )
    {
        this.details = details;
    }

    /** 
     **/
    public String getDetails() { return this.details; }
    public void setDetails(String details) { 
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDrivesResult that = (TestDrivesResult) o;

        return 
            Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash( details );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("details", details);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

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
        private String details;

        private Builder() { }

        public TestDrivesResult build() {
            return new TestDrivesResult (
                         this.details);
        }

        private TestDrivesResult.Builder buildFrom(final TestDrivesResult req) {
            this.details = req.details;

            return this;
        }

        public TestDrivesResult.Builder details(final String details) {
            this.details = details;
            return this;
        }

    }
}
