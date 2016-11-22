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

public class TestConnectMvipRequest implements Serializable {

    public static final long serialVersionUID = 918184488572641133L;
    @SerializedName("mvip") private Optional<String> mvip;

    // empty constructor
    @Since("7.0")
    public TestConnectMvipRequest() {}

    // parameterized constructor
    @Since("7.0")
    public TestConnectMvipRequest(
        Optional<String> mvip
    )
    {
        this.mvip = (mvip == null) ? Optional.<String>empty() : mvip;
    }

    /** 
     * Optionally, use to test the management connection of a different MVIP. This is not needed to test the connection to the target cluster.
     **/
    public Optional<String> getMvip() { return this.mvip; }
    public void setMvip(Optional<String> mvip) { 
        this.mvip = (mvip == null) ? Optional.<String>empty() : mvip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectMvipRequest that = (TestConnectMvipRequest) o;
        return 
            Objects.equals(mvip.orElse(null), that.mvip.orElse(null));
    }

    @Override
    public int hashCode() {
        return Objects.hash( mvip );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("mvip", mvip);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != mvip && mvip.isPresent()){
            sb.append(" mvip : ").append(mvip.orElse(null)).append(",");
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
        private Optional<String> mvip;

        private Builder() { }

        public TestConnectMvipRequest build() {
            return new TestConnectMvipRequest (
                         this.mvip);
        }

        private TestConnectMvipRequest.Builder buildFrom(final TestConnectMvipRequest req) {
            this.mvip = req.mvip;

            return this;
        }

        public TestConnectMvipRequest.Builder optionalMvip(final String mvip) {
            this.mvip = (mvip == null) ? Optional.<String>empty() : Optional.of(mvip);
            return this;
        }

    }
}
