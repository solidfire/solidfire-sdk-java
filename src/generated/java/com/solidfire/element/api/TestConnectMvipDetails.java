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
 * TestConnectMvipDetails  
 **/

public class TestConnectMvipDetails implements Serializable {

    public static final long serialVersionUID = 1785024082551022081L;
    @SerializedName("pingBytes") private Attributes pingBytes;
    @SerializedName("mvip") private String mvip;
    @SerializedName("connected") private Boolean connected;
    // empty constructor
    @Since("7.0")
    public TestConnectMvipDetails() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestConnectMvipDetails(
        Attributes pingBytes,
        String mvip,
        Boolean connected
    )
    {
        this.pingBytes = pingBytes;
        this.mvip = mvip;
        this.connected = connected;
    }

    /** 
     * Details of the ping tests with 56 Bytes and 1500 Bytes.
     **/
    public Attributes getPingBytes() { return this.pingBytes; }
   
    public void setPingBytes(Attributes pingBytes) { 
        this.pingBytes = pingBytes;
    }
    /** 
     * The MVIP tested against.
     **/
    public String getMvip() { return this.mvip; }
   
    public void setMvip(String mvip) { 
        this.mvip = mvip;
    }
    /** 
     * Whether the test could connect to the MVIP.
     **/
    public Boolean getConnected() { return this.connected; }
   
    public void setConnected(Boolean connected) { 
        this.connected = connected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectMvipDetails that = (TestConnectMvipDetails) o;

        return 
            Objects.equals(pingBytes, that.pingBytes) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(connected, that.connected);
    }

    @Override
    public int hashCode() {
        return Objects.hash( pingBytes,mvip,connected );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pingBytes", pingBytes);
        map.put("mvip", mvip);
        map.put("connected", connected);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" pingBytes : ").append(gson.toJson(pingBytes)).append(",");
        sb.append(" mvip : ").append(gson.toJson(mvip)).append(",");
        sb.append(" connected : ").append(gson.toJson(connected)).append(",");
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
        private Attributes pingBytes;
        private String mvip;
        private Boolean connected;

        private Builder() { }

        public TestConnectMvipDetails build() {
            return new TestConnectMvipDetails (
                         this.pingBytes,
                         this.mvip,
                         this.connected);
        }

        private TestConnectMvipDetails.Builder buildFrom(final TestConnectMvipDetails req) {
            this.pingBytes = req.pingBytes;
            this.mvip = req.mvip;
            this.connected = req.connected;

            return this;
        }

        public TestConnectMvipDetails.Builder pingBytes(final Attributes pingBytes) {
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
