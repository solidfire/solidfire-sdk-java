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

import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ListAccounts" API Service call.
 **/
public class ListAccountsRequest implements Serializable {

    private static final long serialVersionUID = 1697174122L;

    private final Optional<Long> startAccountID;
    private final Optional<Long> limit;

    /**
     * The Request object for the "ListAccounts" API Service call.
     * @param startAccountID (optional) Starting AccountID to return.
     * @param limit (optional) Maximum number of AccountInfo objects to return.
     * @since 7.0
     **/
    @Since("7.0")
    public ListAccountsRequest(Optional<Long> startAccountID, Optional<Long> limit) {
        this.startAccountID = (startAccountID == null) ? Optional.<Long>empty() : startAccountID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }


    /**
     * Starting AccountID to return.
     * If no Account exists with this AccountID,
     * the next Account by AccountID order is used as the start of the list.
     * To page through the list, pass the AccountID of the last Account in the previous response + 1
     **/
    public Optional<Long> getStartAccountID() {
        return this.startAccountID;
    }

    /**
     * Maximum number of AccountInfo objects to return.
     **/
    public Optional<Long> getLimit() {
        return this.limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAccountsRequest that = (ListAccountsRequest) o;
        

        return Objects.equals( startAccountID , that.startAccountID )
            && Objects.equals( limit , that.limit );
    }

    @Override
    public int hashCode() {

        return Objects.hash( startAccountID, limit );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startAccountID && startAccountID.isPresent())
            sb.append(" startAccountID : ").append(startAccountID.get()).append(",");
        if(null != limit && limit.isPresent())
            sb.append(" limit : ").append(limit.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Optional<Long> startAccountID;
        private Optional<Long> limit;

        private Builder() { }

        public ListAccountsRequest toRequest() {
            return new ListAccountsRequest (
                         this.startAccountID,
                         this.limit            );
        }

        private ListAccountsRequest.Builder fromRequest(final ListAccountsRequest req) {
            this.startAccountID = req.startAccountID;
            this.limit = req.limit;

            return this;
        }

        public ListAccountsRequest.Builder withOptionalStartAccountID(final Long startAccountID) {
            this.startAccountID = (startAccountID == null) ? Optional.<Long>empty() : Optional.of(startAccountID);
            return this;
        }

        public ListAccountsRequest.Builder withOptionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

    }

}
