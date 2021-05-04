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
 * AddAccountResult  
 **/

public class AddAccountResult implements Serializable {

    public static final long serialVersionUID = -597799281071522878L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("account") private Optional<Account> account;
    // empty constructor
    @Since("7.0")
    public AddAccountResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddAccountResult(
        Long accountID,
        Optional<Account> account
    )
    {
        this.accountID = accountID;
        this.account = (account == null) ? Optional.<Account>empty() : account;
    }

    /** 
     * AccountID for the newly created Account.
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * The full account object
     **/
    public Optional<Account> getAccount() { return this.account; }
   
    public void setAccount(Optional<Account> account) { 
        this.account = (account == null) ? Optional.<Account>empty() : account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddAccountResult that = (AddAccountResult) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,account );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("account", account);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
        if(null != account && account.isPresent()){
            sb.append(" account : ").append(gson.toJson(account)).append(",");
        }
        else{
            sb.append(" account : ").append("null").append(",");
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
        private Long accountID;
        private Optional<Account> account;

        private Builder() { }

        public AddAccountResult build() {
            return new AddAccountResult (
                         this.accountID,
                         this.account);
        }

        private AddAccountResult.Builder buildFrom(final AddAccountResult req) {
            this.accountID = req.accountID;
            this.account = req.account;

            return this;
        }

        public AddAccountResult.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public AddAccountResult.Builder optionalAccount(final Account account) {
            this.account = (account == null) ? Optional.<Account>empty() : Optional.of(account);
            return this;
        }

    }
}
