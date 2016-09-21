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
 * The Request object for the "TestConnectSvip" API Service call.
 **/
public class TestConnectSvipRequest  implements Serializable  {

    private static final long serialVersionUID = 345898496L;

    @SerializedName("svip") private final Optional<String> svip;

    /**
     * The Request object for the "TestConnectSvip" API Service call.
     * @param svip (optional) Optionally, use to test the storage connection of a different SVIP. This is not needed to test the connection to the target cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectSvipRequest(Optional<String> svip) {
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
    }


    /**
     * Optionally, use to test the storage connection of a different SVIP. This is not needed to test the connection to the target cluster.
     **/
    public Optional<String> getSvip() {
        return this.svip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectSvipRequest that = (TestConnectSvipRequest) o;
        

        return Objects.equals( svip , that.svip );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) svip );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != svip && svip.isPresent())
            sb.append(" svip : ").append(svip.get());
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
                         this.svip            );
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
