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
 * GetSshInfoResult  
 **/

public class GetSshInfoResult implements Serializable {

    public static final long serialVersionUID = -9010863769555169375L;
    @SerializedName("enabled") private Boolean enabled;

    
    // parameterized constructor
    @Since("7.0")
    public GetSshInfoResult(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public GetSshInfoResult(
        Boolean enabled
    )
    {
        this.enabled = enabled;
    }

    /** 
     * Node SSH status.
     **/
    public Boolean getEnabled() { return this.enabled; }
   
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSshInfoResult that = (GetSshInfoResult) o;

        return 
            Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enabled", enabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
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
        private Boolean enabled;

        private Builder() { }

        public GetSshInfoResult build() {
            return new GetSshInfoResult (
                         this.enabled);
        }

        private GetSshInfoResult.Builder buildFrom(final GetSshInfoResult req) {
            this.enabled = req.enabled;

            return this;
        }

        public GetSshInfoResult.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

    }
}
