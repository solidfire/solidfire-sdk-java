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
 * ProposedClusterError  
 * 
 **/

public class ProposedClusterError implements Serializable {

    public static final long serialVersionUID = 6601678009370265028L;
    @SerializedName("description") private String description;
    @SerializedName("errorCode") private String errorCode;
    @SerializedName("nodeIPs") private String[] nodeIPs;
    // empty constructor
    @Since("7.0")
    public ProposedClusterError() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProposedClusterError(
        String description,
        String errorCode,
        String[] nodeIPs
    )
    {
        this.description = description;
        this.errorCode = errorCode;
        this.nodeIPs = nodeIPs;
    }

    /** 
     * Human readable description of the error.
     **/
    public String getDescription() { return this.description; }
   
    public void setDescription(String description) { 
        this.description = description;
    }
    /** 
     * Unique error code for the error.
     **/
    public String getErrorCode() { return this.errorCode; }
   
    public void setErrorCode(String errorCode) { 
        this.errorCode = errorCode;
    }
    /** 
     * The IP addresses of the nodes associated with the error.
     **/
    public String[] getNodeIPs() { return this.nodeIPs; }
   
    public void setNodeIPs(String[] nodeIPs) { 
        this.nodeIPs = nodeIPs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProposedClusterError that = (ProposedClusterError) o;

        return 
            Objects.equals(description, that.description) && 
            Objects.equals(errorCode, that.errorCode) && 
            Arrays.equals(nodeIPs, that.nodeIPs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( description,errorCode,(Object[])nodeIPs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("description", description);
        map.put("errorCode", errorCode);
        map.put("nodeIPs", nodeIPs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" description : ").append(gson.toJson(description)).append(",");
        sb.append(" errorCode : ").append(gson.toJson(errorCode)).append(",");
        sb.append(" nodeIPs : ").append(gson.toJson(Arrays.toString(nodeIPs))).append(",");
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
        private String description;
        private String errorCode;
        private String[] nodeIPs;

        private Builder() { }

        public ProposedClusterError build() {
            return new ProposedClusterError (
                         this.description,
                         this.errorCode,
                         this.nodeIPs);
        }

        private ProposedClusterError.Builder buildFrom(final ProposedClusterError req) {
            this.description = req.description;
            this.errorCode = req.errorCode;
            this.nodeIPs = req.nodeIPs;

            return this;
        }

        public ProposedClusterError.Builder description(final String description) {
            this.description = description;
            return this;
        }

        public ProposedClusterError.Builder errorCode(final String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public ProposedClusterError.Builder nodeIPs(final String[] nodeIPs) {
            this.nodeIPs = nodeIPs;
            return this;
        }

    }
}
