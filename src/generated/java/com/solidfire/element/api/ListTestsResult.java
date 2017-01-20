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
 * ListTestsResult  
 **/

public class ListTestsResult implements Serializable {

    public static final long serialVersionUID = -2994508350210224364L;
    @SerializedName("tests") private String[] tests;

    // empty constructor
    @Since("7.0")
    public ListTestsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListTestsResult(
        String[] tests
    )
    {
        this.tests = tests;
    }

    /** 
     * List of tests that can be performed on the node.
     **/
    public String[] getTests() { return this.tests; }
    public void setTests(String[] tests) { 
        this.tests = tests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListTestsResult that = (ListTestsResult) o;

        return 
            Arrays.equals(tests, that.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])tests );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("tests", tests);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" tests : ").append(Arrays.toString(tests)).append(",");
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
        private String[] tests;

        private Builder() { }

        public ListTestsResult build() {
            return new ListTestsResult (
                         this.tests);
        }

        private ListTestsResult.Builder buildFrom(final ListTestsResult req) {
            this.tests = req.tests;

            return this;
        }

        public ListTestsResult.Builder tests(final String[] tests) {
            this.tests = tests;
            return this;
        }

    }
}
