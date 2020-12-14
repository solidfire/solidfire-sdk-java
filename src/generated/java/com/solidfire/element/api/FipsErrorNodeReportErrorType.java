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
 * FipsErrorNodeReportErrorType  
 **/

public class FipsErrorNodeReportErrorType implements Serializable {

    public static final long serialVersionUID = 1554896078110629160L;
    @SerializedName("message") private String message;
    @SerializedName("name") private String name;
    // empty constructor
    @Since("7.0")
    public FipsErrorNodeReportErrorType() {}

    
    // parameterized constructor
    @Since("7.0")
    public FipsErrorNodeReportErrorType(
        String message,
        String name
    )
    {
        this.message = message;
        this.name = name;
    }

    /** 
     * Error message.
     **/
    public String getMessage() { return this.message; }
   
    public void setMessage(String message) { 
        this.message = message;
    }
    /** 
     * Error name.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FipsErrorNodeReportErrorType that = (FipsErrorNodeReportErrorType) o;

        return 
            Objects.equals(message, that.message) && 
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( message,name );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("name", name);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" message : ").append(gson.toJson(message)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
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
        private String message;
        private String name;

        private Builder() { }

        public FipsErrorNodeReportErrorType build() {
            return new FipsErrorNodeReportErrorType (
                         this.message,
                         this.name);
        }

        private FipsErrorNodeReportErrorType.Builder buildFrom(final FipsErrorNodeReportErrorType req) {
            this.message = req.message;
            this.name = req.name;

            return this;
        }

        public FipsErrorNodeReportErrorType.Builder message(final String message) {
            this.message = message;
            return this;
        }

        public FipsErrorNodeReportErrorType.Builder name(final String name) {
            this.name = name;
            return this;
        }

    }
}
