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
 * ListVolumeStatsByAccountRequest  
 * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
 **/

public class ListVolumeStatsByAccountRequest implements Serializable {

    public static final long serialVersionUID = -8376215761264401129L;
    @SerializedName("accounts") private Optional<Long[]> accounts;
    @SerializedName("includeVirtualVolumes") private Optional<Boolean> includeVirtualVolumes;
    // empty constructor
    @Since("7.0")
    public ListVolumeStatsByAccountRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsByAccountRequest(
        Optional<Long[]> accounts
    )
    {
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
    }
    // parameterized constructor
    @Since("9.0")
    public ListVolumeStatsByAccountRequest(
        Optional<Long[]> accounts,
        Optional<Boolean> includeVirtualVolumes
    )
    {
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    /** 
     * One or more account ids by which to filter the result.
     **/
    public Optional<Long[]> getAccounts() { return this.accounts; }
    public void setAccounts(Optional<Long[]> accounts) { 
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
    }
    /** 
     * Includes virtual volumes in the response by default. To exclude virtual volumes, set to false.
     **/
    public Optional<Boolean> getIncludeVirtualVolumes() { return this.includeVirtualVolumes; }
    public void setIncludeVirtualVolumes(Optional<Boolean> includeVirtualVolumes) { 
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsByAccountRequest that = (ListVolumeStatsByAccountRequest) o;

        return 
            Objects.equals(accounts, that.accounts) && 
            Objects.equals(includeVirtualVolumes, that.includeVirtualVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accounts,includeVirtualVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accounts", accounts);
        map.put("includeVirtualVolumes", includeVirtualVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != accounts && accounts.isPresent()){
            sb.append(" accounts : ").append(accounts).append(",");
        }
        if(null != includeVirtualVolumes && includeVirtualVolumes.isPresent()){
            sb.append(" includeVirtualVolumes : ").append(includeVirtualVolumes).append(",");
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
        private Optional<Long[]> accounts;
        private Optional<Boolean> includeVirtualVolumes;

        private Builder() { }

        public ListVolumeStatsByAccountRequest build() {
            return new ListVolumeStatsByAccountRequest (
                         this.accounts,
                         this.includeVirtualVolumes);
        }

        private ListVolumeStatsByAccountRequest.Builder buildFrom(final ListVolumeStatsByAccountRequest req) {
            this.accounts = req.accounts;
            this.includeVirtualVolumes = req.includeVirtualVolumes;

            return this;
        }

        public ListVolumeStatsByAccountRequest.Builder optionalAccounts(final Long[] accounts) {
            this.accounts = (accounts == null) ? Optional.<Long[]>empty() : Optional.of(accounts);
            return this;
        }

        public ListVolumeStatsByAccountRequest.Builder optionalIncludeVirtualVolumes(final Boolean includeVirtualVolumes) {
            this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : Optional.of(includeVirtualVolumes);
            return this;
        }

    }
}
