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
 * SnmpSendTestTrapsResult  
 **/

public class SnmpSendTestTrapsResult implements Serializable {

    public static final long serialVersionUID = 7484589534069739264L;
    @SerializedName("status") private String status;
    // empty constructor
    @Since("7.0")
    public SnmpSendTestTrapsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public SnmpSendTestTrapsResult(
        String status
    )
    {
        this.status = status;
    }

    /** 
     * 
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpSendTestTrapsResult that = (SnmpSendTestTrapsResult) o;

        return 
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash( status );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("status", status);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" status : ").append(gson.toJson(status)).append(",");
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
        private String status;

        private Builder() { }

        public SnmpSendTestTrapsResult build() {
            return new SnmpSendTestTrapsResult (
                         this.status);
        }

        private SnmpSendTestTrapsResult.Builder buildFrom(final SnmpSendTestTrapsResult req) {
            this.status = req.status;

            return this;
        }

        public SnmpSendTestTrapsResult.Builder status(final String status) {
            this.status = status;
            return this;
        }

    }
}
