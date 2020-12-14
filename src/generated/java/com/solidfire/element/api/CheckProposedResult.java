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
 * CheckProposedResult  
 **/

public class CheckProposedResult implements Serializable {

    public static final long serialVersionUID = 7751194702425070260L;
    @SerializedName("proposedClusterValid") private Boolean proposedClusterValid;
    @SerializedName("proposedClusterErrors") private ProposedClusterError[] proposedClusterErrors;
    // empty constructor
    @Since("7.0")
    public CheckProposedResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CheckProposedResult(
        Boolean proposedClusterValid,
        ProposedClusterError[] proposedClusterErrors
    )
    {
        this.proposedClusterValid = proposedClusterValid;
        this.proposedClusterErrors = proposedClusterErrors;
    }

    /** 
     * True if there were no errors found with the proposed cluster, false otherwise
     **/
    public Boolean getProposedClusterValid() { return this.proposedClusterValid; }
   
    public void setProposedClusterValid(Boolean proposedClusterValid) { 
        this.proposedClusterValid = proposedClusterValid;
    }
    /** 
     * The errors associated with the proposed cluster.
     **/
    public ProposedClusterError[] getProposedClusterErrors() { return this.proposedClusterErrors; }
   
    public void setProposedClusterErrors(ProposedClusterError[] proposedClusterErrors) { 
        this.proposedClusterErrors = proposedClusterErrors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckProposedResult that = (CheckProposedResult) o;

        return 
            Objects.equals(proposedClusterValid, that.proposedClusterValid) && 
            Arrays.equals(proposedClusterErrors, that.proposedClusterErrors);
    }

    @Override
    public int hashCode() {
        return Objects.hash( proposedClusterValid,(Object[])proposedClusterErrors );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("proposedClusterValid", proposedClusterValid);
        map.put("proposedClusterErrors", proposedClusterErrors);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" proposedClusterValid : ").append(gson.toJson(proposedClusterValid)).append(",");
        sb.append(" proposedClusterErrors : ").append(gson.toJson(Arrays.toString(proposedClusterErrors))).append(",");
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
        private Boolean proposedClusterValid;
        private ProposedClusterError[] proposedClusterErrors;

        private Builder() { }

        public CheckProposedResult build() {
            return new CheckProposedResult (
                         this.proposedClusterValid,
                         this.proposedClusterErrors);
        }

        private CheckProposedResult.Builder buildFrom(final CheckProposedResult req) {
            this.proposedClusterValid = req.proposedClusterValid;
            this.proposedClusterErrors = req.proposedClusterErrors;

            return this;
        }

        public CheckProposedResult.Builder proposedClusterValid(final Boolean proposedClusterValid) {
            this.proposedClusterValid = proposedClusterValid;
            return this;
        }

        public CheckProposedResult.Builder proposedClusterErrors(final ProposedClusterError[] proposedClusterErrors) {
            this.proposedClusterErrors = proposedClusterErrors;
            return this;
        }

    }
}
