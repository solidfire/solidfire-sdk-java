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
 * 
 **/
public class TestConnectMvipDetails  implements Serializable  {

    private static final long serialVersionUID = 1934079889L;

    @SerializedName("pingBytes") private final Object pingBytes;
    @SerializedName("mvip") private final String mvip;
    @SerializedName("connected") private final Boolean connected;

    /**
     * 
     * @param pingBytes [required] Details of the ping tests with 56 Bytes and 1500 Bytes.
     * @param mvip [required] The MVIP tested against.
     * @param connected [required] Whether the test could connect to the MVIP.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectMvipDetails(Object pingBytes, String mvip, Boolean connected) {
        this.pingBytes = pingBytes;
        this.mvip = mvip;
        this.connected = connected;
    }


    /**
     * Details of the ping tests with 56 Bytes and 1500 Bytes.
     **/
    public Object getPingBytes() {
        return this.pingBytes;
    }

    /**
     * The MVIP tested against.
     **/
    public String getMvip() {
        return this.mvip;
    }

    /**
     * Whether the test could connect to the MVIP.
     **/
    public Boolean getConnected() {
        return this.connected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectMvipDetails that = (TestConnectMvipDetails) o;
        

        return Objects.equals( pingBytes , that.pingBytes )
            && Objects.equals( mvip , that.mvip )
            && Objects.equals( connected , that.connected );
    }

    @Override
    public int hashCode() {
        return Objects.hash( pingBytes, mvip, connected );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pingBytes : ").append(pingBytes).append(",");
        sb.append(" mvip : ").append(mvip).append(",");
        sb.append(" connected : ").append(connected);
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
        private Object pingBytes;
        private String mvip;
        private Boolean connected;

        private Builder() { }

        public TestConnectMvipDetails build() {
            return new TestConnectMvipDetails (
                         this.pingBytes,
                         this.mvip,
                         this.connected            );
        }

        private TestConnectMvipDetails.Builder buildFrom(final TestConnectMvipDetails req) {
            this.pingBytes = req.pingBytes;
            this.mvip = req.mvip;
            this.connected = req.connected;

            return this;
        }

        public TestConnectMvipDetails.Builder pingBytes(final Object pingBytes) {
            this.pingBytes = pingBytes;
            return this;
        }

        public TestConnectMvipDetails.Builder mvip(final String mvip) {
            this.mvip = mvip;
            return this;
        }

        public TestConnectMvipDetails.Builder connected(final Boolean connected) {
            this.connected = connected;
            return this;
        }

    }

}
