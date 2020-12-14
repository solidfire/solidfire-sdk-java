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
 * SetLoginBannerRequest  
 * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
 **/

public class SetLoginBannerRequest implements Serializable {

    public static final long serialVersionUID = -2973251334058156000L;
    @SerializedName("banner") private Optional<String> banner;
    @SerializedName("enabled") private Optional<Boolean> enabled;

    
    // parameterized constructor
    @Since("7.0")
    public SetLoginBannerRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SetLoginBannerRequest(
        Optional<String> banner,
        Optional<Boolean> enabled
    )
    {
        this.banner = (banner == null) ? Optional.<String>empty() : banner;
        this.enabled = (enabled == null) ? Optional.<Boolean>empty() : enabled;
    }

    /** 
     * The desired text of the Terms of Use banner.
     **/
    public Optional<String> getBanner() { return this.banner; }
   
    public void setBanner(Optional<String> banner) { 
        this.banner = (banner == null) ? Optional.<String>empty() : banner;
    }
    /** 
     * The status of the Terms of Use banner. Possible values:
     * true: The Terms of Use banner is displayed upon web interface login.
     * false: The Terms of Use banner is not displayed upon web interface login.
     **/
    public Optional<Boolean> getEnabled() { return this.enabled; }
   
    public void setEnabled(Optional<Boolean> enabled) { 
        this.enabled = (enabled == null) ? Optional.<Boolean>empty() : enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetLoginBannerRequest that = (SetLoginBannerRequest) o;

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

        if(null != banner && banner.isPresent()){
            sb.append(" banner : ").append(gson.toJson(banner)).append(",");
        }
        else{
            sb.append(" banner : ").append("null").append(",");
        }
        if(null != enabled && enabled.isPresent()){
            sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
        }
        else{
            sb.append(" enabled : ").append("null").append(",");
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
        private Optional<String> banner;
        private Optional<Boolean> enabled;

        private Builder() { }

        public SetLoginBannerRequest build() {
            return new SetLoginBannerRequest (
                         this.banner,
                         this.enabled);
        }

        private SetLoginBannerRequest.Builder buildFrom(final SetLoginBannerRequest req) {
            this.banner = req.banner;
            this.enabled = req.enabled;

            return this;
        }

        public SetLoginBannerRequest.Builder optionalBanner(final String banner) {
            this.banner = (banner == null) ? Optional.<String>empty() : Optional.of(banner);
            return this;
        }

        public SetLoginBannerRequest.Builder optionalEnabled(final Boolean enabled) {
            this.enabled = (enabled == null) ? Optional.<Boolean>empty() : Optional.of(enabled);
            return this;
        }

    }
}
