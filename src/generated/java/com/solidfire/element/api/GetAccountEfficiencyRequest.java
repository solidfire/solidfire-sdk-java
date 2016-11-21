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

public class GetAccountEfficiencyRequest implements Serializable {

    public static final long serialVersionUID = 843992046L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("force") private Optional<Boolean> force;

    // empty constructor
    @Since("7.0")
    public GetAccountEfficiencyRequest() {}

    // parameterized constructor
    @Since("7.0")
    public GetAccountEfficiencyRequest(
        Long accountID,
        Optional<Boolean> force
    )
    {
        this.accountID = accountID;
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    /** 
     * Specifies the volume account for which capacity is computed.
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     **/
    public Optional<Boolean> getForce() { return this.force; }
    public void setForce(Optional<Boolean> force) { 
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAccountEfficiencyRequest that = (GetAccountEfficiencyRequest) o;
        return 
            Objects.equals(accountID, that.accountID) &&
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        if(null != force && force.isPresent()){
            sb.append(" force : ").append(force.get()).append(",");
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
        private Optional<Boolean> force;

        private Builder() { }

        public GetAccountEfficiencyRequest build() {
            return new GetAccountEfficiencyRequest (
                         this.accountID,
                         this.force);
        }

        private GetAccountEfficiencyRequest.Builder buildFrom(final GetAccountEfficiencyRequest req) {
            this.accountID = req.accountID;
            this.force = req.force;

            return this;
        }

        public GetAccountEfficiencyRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public GetAccountEfficiencyRequest.Builder optionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }
}
