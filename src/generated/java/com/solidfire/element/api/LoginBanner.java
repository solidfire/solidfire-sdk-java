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
 * LoginBanner  
 **/

public class LoginBanner implements Serializable {

    public static final long serialVersionUID = -1535229664458416931L;
    @SerializedName("banner") private String banner;
    @SerializedName("enabled") private Boolean enabled;

    
    // parameterized constructor
    @Since("7.0")
    public LoginBanner(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public LoginBanner(
        String banner,
        Boolean enabled
    )
    {
        this.banner = banner;
        this.enabled = enabled;
    }

    /** 
     * The current text of the Terms of Use banner.
     * This value can contain text even when the banner is disabled.
     **/
    public String getBanner() { return this.banner; }
   
    public void setBanner(String banner) { 
        this.banner = banner;
    }
    /** 
     * The status of the Terms of Use banner. Possible values:
     * true: The Terms of Use banner is displayed upon web interface login.
     * false: The Terms of Use banner is not displayed upon web interface login.
     **/
    public Boolean getEnabled() { return this.enabled; }
   
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginBanner that = (LoginBanner) o;

        return 
            Objects.equals(banner, that.banner) && 
            Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( banner,enabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("banner", banner);
        map.put("enabled", enabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" banner : ").append(gson.toJson(banner)).append(",");
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
        private String banner;
        private Boolean enabled;

        private Builder() { }

        public LoginBanner build() {
            return new LoginBanner (
                         this.banner,
                         this.enabled);
        }

        private LoginBanner.Builder buildFrom(final LoginBanner req) {
            this.banner = req.banner;
            this.enabled = req.enabled;

            return this;
        }

        public LoginBanner.Builder banner(final String banner) {
            this.banner = banner;
            return this;
        }

        public LoginBanner.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

    }
}
