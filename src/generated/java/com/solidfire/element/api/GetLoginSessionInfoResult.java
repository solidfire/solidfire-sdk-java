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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetLoginSessionInfoResult  
 **/

public class GetLoginSessionInfoResult implements Serializable {

    public static final long serialVersionUID = -6655572921788426733L;
    @SerializedName("loginSessionInfo") private LoginSessionInfo loginSessionInfo;

    // empty constructor
    @Since("7.0")
    public GetLoginSessionInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetLoginSessionInfoResult(
        LoginSessionInfo loginSessionInfo
    )
    {
        this.loginSessionInfo = loginSessionInfo;
    }

    /** 
     * The authentication expiration period. Formatted in H:mm:ss. For example: 1:30:00, 20:00, 5:00. All leading zeros and colons are removed regardless of the format the timeout was entered.
     * Objects returned are:
     * timeout - The time, in minutes, when this session will timeout and expire.
     **/
    public LoginSessionInfo getLoginSessionInfo() { return this.loginSessionInfo; }
    public void setLoginSessionInfo(LoginSessionInfo loginSessionInfo) { 
        this.loginSessionInfo = loginSessionInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLoginSessionInfoResult that = (GetLoginSessionInfoResult) o;

        return 
            Objects.equals(loginSessionInfo, that.loginSessionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( loginSessionInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("loginSessionInfo", loginSessionInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" loginSessionInfo : ").append(loginSessionInfo).append(",");
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
        private LoginSessionInfo loginSessionInfo;

        private Builder() { }

        public GetLoginSessionInfoResult build() {
            return new GetLoginSessionInfoResult (
                         this.loginSessionInfo);
        }

        private GetLoginSessionInfoResult.Builder buildFrom(final GetLoginSessionInfoResult req) {
            this.loginSessionInfo = req.loginSessionInfo;

            return this;
        }

        public GetLoginSessionInfoResult.Builder loginSessionInfo(final LoginSessionInfo loginSessionInfo) {
            this.loginSessionInfo = loginSessionInfo;
            return this;
        }

    }
}
