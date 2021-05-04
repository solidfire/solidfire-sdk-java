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
 * GetLoginBannerResult  
 **/

public class GetLoginBannerResult implements Serializable {

    public static final long serialVersionUID = -1840316825626662985L;
    @SerializedName("loginBanner") private LoginBanner loginBanner;

    
    // parameterized constructor
    @Since("7.0")
    public GetLoginBannerResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetLoginBannerResult(
        LoginBanner loginBanner
    )
    {
        this.loginBanner = loginBanner;
    }

    /** 
     **/
    public LoginBanner getLoginBanner() { return this.loginBanner; }
   
    public void setLoginBanner(LoginBanner loginBanner) { 
        this.loginBanner = loginBanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLoginBannerResult that = (GetLoginBannerResult) o;

        return 
            Objects.equals(loginBanner, that.loginBanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash( loginBanner );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("loginBanner", loginBanner);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" loginBanner : ").append(gson.toJson(loginBanner)).append(",");
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
        private LoginBanner loginBanner;

        private Builder() { }

        public GetLoginBannerResult build() {
            return new GetLoginBannerResult (
                         this.loginBanner);
        }

        private GetLoginBannerResult.Builder buildFrom(final GetLoginBannerResult req) {
            this.loginBanner = req.loginBanner;

            return this;
        }

        public GetLoginBannerResult.Builder loginBanner(final LoginBanner loginBanner) {
            this.loginBanner = loginBanner;
            return this;
        }

    }
}
