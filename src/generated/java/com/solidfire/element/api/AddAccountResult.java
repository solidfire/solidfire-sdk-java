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
 * AddAccountResult  
 **/

public class AddAccountResult implements Serializable {

    public static final long serialVersionUID = 8785573545235280037L;
    @SerializedName("accountID") private AccountID accountID;

    // empty constructor
    @Since("7.0")
    public AddAccountResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddAccountResult(
        AccountID accountID
    )
    {
        this.accountID = accountID;
    }

    /** 
     * AccountID for the newly created Account.
     **/
    public AccountID getAccountID() { return this.accountID; }
    public void setAccountID(AccountID accountID) { 
        this.accountID = accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddAccountResult that = (AddAccountResult) o;

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
        private AccountID accountID;

        private Builder() { }

        public AddAccountResult build() {
            return new AddAccountResult (
                         this.accountID);
        }

        private AddAccountResult.Builder buildFrom(final AddAccountResult req) {
            this.accountID = req.accountID;

            return this;
        }

        public AddAccountResult.Builder accountID(final AccountID accountID) {
            this.accountID = accountID;
            return this;
        }

    }
}
