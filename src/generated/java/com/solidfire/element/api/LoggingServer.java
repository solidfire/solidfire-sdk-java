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
 * LoggingServer  
 **/

public class LoggingServer implements Serializable {

    public static final long serialVersionUID = 6380910181511442543L;
    @SerializedName("host") private String host;
    @SerializedName("port") private Long port;
    // empty constructor
    @Since("7.0")
    public LoggingServer() {}

    
    // parameterized constructor
    @Since("7.0")
    public LoggingServer(
        String host,
        Long port
    )
    {
        this.host = host;
        this.port = port;
    }

    /** 
     * Hostname or IP address of the log server.
     **/
    public String getHost() { return this.host; }
   
    public void setHost(String host) { 
        this.host = host;
    }
    /** 
     * Port number that the log server is listening on.
     **/
    public Long getPort() { return this.port; }
   
    public void setPort(Long port) { 
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoggingServer that = (LoggingServer) o;

        return 
            Objects.equals(host, that.host) && 
            Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash( host,port );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("host", host);
        map.put("port", port);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" host : ").append(gson.toJson(host)).append(",");
        sb.append(" port : ").append(gson.toJson(port)).append(",");
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
        private String host;
        private Long port;

        private Builder() { }

        public LoggingServer build() {
            return new LoggingServer (
                         this.host,
                         this.port);
        }

        private LoggingServer.Builder buildFrom(final LoggingServer req) {
            this.host = req.host;
            this.port = req.port;

            return this;
        }

        public LoggingServer.Builder host(final String host) {
            this.host = host;
            return this;
        }

        public LoggingServer.Builder port(final Long port) {
            this.port = port;
            return this;
        }

    }
}
