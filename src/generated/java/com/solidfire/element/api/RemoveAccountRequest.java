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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class RemoveAccountRequest implements Serializable {

    public static final long serialVersionUID = -6926282083277233060L;
    @SerializedName("accountID") private Long accountID;

    // empty constructor
    @Since("7.0")
    public RemoveAccountRequest() {}

    // parameterized constructor
    @Since("7.0")
    public RemoveAccountRequest(
        Long accountID
    )
    {
        this.accountID = accountID;
    }

    /** 
     * AccountID for the account to remove.
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveAccountRequest that = (RemoveAccountRequest) o;

        return 
            Objects.equals(accountID, that.accountID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
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
        private Long accountID;

        private Builder() { }

        public RemoveAccountRequest build() {
            return new RemoveAccountRequest (
                         this.accountID);
        }

        private RemoveAccountRequest.Builder buildFrom(final RemoveAccountRequest req) {
            this.accountID = req.accountID;

            return this;
        }

        public RemoveAccountRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

    }
}
