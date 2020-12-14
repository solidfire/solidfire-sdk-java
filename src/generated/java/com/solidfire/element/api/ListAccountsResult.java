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
 * ListAccountsResult  
 **/

public class ListAccountsResult implements Serializable {

    public static final long serialVersionUID = 1413819465882734555L;
    @SerializedName("accounts") private Account[] accounts;
    // empty constructor
    @Since("7.0")
    public ListAccountsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListAccountsResult(
        Account[] accounts
    )
    {
        this.accounts = accounts;
    }

    /** 
     * List of accounts.
     **/
    public Account[] getAccounts() { return this.accounts; }
   
    public void setAccounts(Account[] accounts) { 
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAccountsResult that = (ListAccountsResult) o;

        return 
            Arrays.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])accounts );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accounts", accounts);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accounts : ").append(gson.toJson(Arrays.toString(accounts))).append(",");
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
        private Account[] accounts;

        private Builder() { }

        public ListAccountsResult build() {
            return new ListAccountsResult (
                         this.accounts);
        }

        private ListAccountsResult.Builder buildFrom(final ListAccountsResult req) {
            this.accounts = req.accounts;

            return this;
        }

        public ListAccountsResult.Builder accounts(final Account[] accounts) {
            this.accounts = accounts;
            return this;
        }

    }
}
