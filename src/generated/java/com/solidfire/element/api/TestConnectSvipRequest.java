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
 * TestConnectSvipRequest  
 **/

public class TestConnectSvipRequest implements Serializable {

    public static final long serialVersionUID = 2243948957120107271L;
    @SerializedName("svip") private Optional<String> svip;

    // empty constructor
    @Since("7.0")
    public TestConnectSvipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestConnectSvipRequest(
        Optional<String> svip
    )
    {
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
    }

    /** 
     * Optionally, use to test the storage connection of a different SVIP. This is not needed to test the connection to the target cluster.
     **/
    public Optional<String> getSvip() { return this.svip; }
    public void setSvip(Optional<String> svip) { 
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectSvipRequest that = (TestConnectSvipRequest) o;

        return 
            Objects.equals(svip, that.svip);
    }

    @Override
    public int hashCode() {
        return Objects.hash( svip );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("svip", svip);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != svip && svip.isPresent()){
            sb.append(" svip : ").append(svip).append(",");
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
        private Optional<String> svip;

        private Builder() { }

        public TestConnectSvipRequest build() {
            return new TestConnectSvipRequest (
                         this.svip);
        }

        private TestConnectSvipRequest.Builder buildFrom(final TestConnectSvipRequest req) {
            this.svip = req.svip;

            return this;
        }

        public TestConnectSvipRequest.Builder optionalSvip(final String svip) {
            this.svip = (svip == null) ? Optional.<String>empty() : Optional.of(svip);
            return this;
        }

    }
}
