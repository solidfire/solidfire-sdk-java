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
 * ListAccountsRequest  
 * Returns the entire list of accounts, with optional paging support.
 **/

public class ListAccountsRequest implements Serializable {

    public static final long serialVersionUID = 6374093142117098440L;
    @SerializedName("startAccountID") private Optional<Long> startAccountID;
    @SerializedName("limit") private Optional<Long> limit;

    // empty constructor
    @Since("7.0")
    public ListAccountsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListAccountsRequest(
        Optional<Long> startAccountID,
        Optional<Long> limit
    )
    {
        this.startAccountID = (startAccountID == null) ? Optional.<Long>empty() : startAccountID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }

    /** 
     * Starting AccountID to return.
     * If no Account exists with this AccountID,
     * the next Account by AccountID order is used as the start of the list.
     * To page through the list, pass the AccountID of the last Account in the previous response + 1
     **/
    public Optional<Long> getStartAccountID() { return this.startAccountID; }
    public void setStartAccountID(Optional<Long> startAccountID) { 
        this.startAccountID = (startAccountID == null) ? Optional.<Long>empty() : startAccountID;
    }
    /** 
     * Maximum number of AccountInfo objects to return.
     **/
    public Optional<Long> getLimit() { return this.limit; }
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAccountsRequest that = (ListAccountsRequest) o;

        return 
            Objects.equals(startAccountID, that.startAccountID) && 
            Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startAccountID,limit );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startAccountID", startAccountID);
        map.put("limit", limit);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startAccountID && startAccountID.isPresent()){
            sb.append(" startAccountID : ").append(startAccountID).append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(limit).append(",");
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
        private Optional<Long> startAccountID;
        private Optional<Long> limit;

        private Builder() { }

        public ListAccountsRequest build() {
            return new ListAccountsRequest (
                         this.startAccountID,
                         this.limit);
        }

        private ListAccountsRequest.Builder buildFrom(final ListAccountsRequest req) {
            this.startAccountID = req.startAccountID;
            this.limit = req.limit;

            return this;
        }

        public ListAccountsRequest.Builder optionalStartAccountID(final Long startAccountID) {
            this.startAccountID = (startAccountID == null) ? Optional.<Long>empty() : Optional.of(startAccountID);
            return this;
        }

        public ListAccountsRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

    }
}
