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
 * GetNodeSupportedTlsCiphersResult  
 **/

public class GetNodeSupportedTlsCiphersResult implements Serializable {

    public static final long serialVersionUID = -4796531900323427258L;
    @SerializedName("mandatoryCiphers") private String[] mandatoryCiphers;
    @SerializedName("defaultSupplementalCiphers") private String[] defaultSupplementalCiphers;
    @SerializedName("supportedSupplementalCiphers") private String[] supportedSupplementalCiphers;
    // empty constructor
    @Since("7.0")
    public GetNodeSupportedTlsCiphersResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetNodeSupportedTlsCiphersResult(
        String[] mandatoryCiphers,
        String[] defaultSupplementalCiphers,
        String[] supportedSupplementalCiphers
    )
    {
        this.mandatoryCiphers = mandatoryCiphers;
        this.defaultSupplementalCiphers = defaultSupplementalCiphers;
        this.supportedSupplementalCiphers = supportedSupplementalCiphers;
    }

    /** 
     * List of mandatory TLS cipher suites for the node.
     * Mandatory ciphers are those ciphers which will always be active on the node.
     **/
    public String[] getMandatoryCiphers() { return this.mandatoryCiphers; }
   
    public void setMandatoryCiphers(String[] mandatoryCiphers) { 
        this.mandatoryCiphers = mandatoryCiphers;
    }
    /** 
     * List of default supplemental TLS cipher suites for the node.
     * The supplemental ciphers will be restored to this list when the ResetNodeSupplementalTlsCiphers command is run.
     **/
    public String[] getDefaultSupplementalCiphers() { return this.defaultSupplementalCiphers; }
   
    public void setDefaultSupplementalCiphers(String[] defaultSupplementalCiphers) { 
        this.defaultSupplementalCiphers = defaultSupplementalCiphers;
    }
    /** 
     * List of available supplemental TLS cipher suites which can be configured with the SetNodeSupplementalTlsCiphers command.
     **/
    public String[] getSupportedSupplementalCiphers() { return this.supportedSupplementalCiphers; }
   
    public void setSupportedSupplementalCiphers(String[] supportedSupplementalCiphers) { 
        this.supportedSupplementalCiphers = supportedSupplementalCiphers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeSupportedTlsCiphersResult that = (GetNodeSupportedTlsCiphersResult) o;

        return 
            Arrays.equals(mandatoryCiphers, that.mandatoryCiphers) && 
            Arrays.equals(defaultSupplementalCiphers, that.defaultSupplementalCiphers) && 
            Arrays.equals(supportedSupplementalCiphers, that.supportedSupplementalCiphers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])mandatoryCiphers,(Object[])defaultSupplementalCiphers,(Object[])supportedSupplementalCiphers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("mandatoryCiphers", mandatoryCiphers);
        map.put("defaultSupplementalCiphers", defaultSupplementalCiphers);
        map.put("supportedSupplementalCiphers", supportedSupplementalCiphers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" mandatoryCiphers : ").append(gson.toJson(Arrays.toString(mandatoryCiphers))).append(",");
        sb.append(" defaultSupplementalCiphers : ").append(gson.toJson(Arrays.toString(defaultSupplementalCiphers))).append(",");
        sb.append(" supportedSupplementalCiphers : ").append(gson.toJson(Arrays.toString(supportedSupplementalCiphers))).append(",");
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
        private String[] mandatoryCiphers;
        private String[] defaultSupplementalCiphers;
        private String[] supportedSupplementalCiphers;

        private Builder() { }

        public GetNodeSupportedTlsCiphersResult build() {
            return new GetNodeSupportedTlsCiphersResult (
                         this.mandatoryCiphers,
                         this.defaultSupplementalCiphers,
                         this.supportedSupplementalCiphers);
        }

        private GetNodeSupportedTlsCiphersResult.Builder buildFrom(final GetNodeSupportedTlsCiphersResult req) {
            this.mandatoryCiphers = req.mandatoryCiphers;
            this.defaultSupplementalCiphers = req.defaultSupplementalCiphers;
            this.supportedSupplementalCiphers = req.supportedSupplementalCiphers;

            return this;
        }

        public GetNodeSupportedTlsCiphersResult.Builder mandatoryCiphers(final String[] mandatoryCiphers) {
            this.mandatoryCiphers = mandatoryCiphers;
            return this;
        }

        public GetNodeSupportedTlsCiphersResult.Builder defaultSupplementalCiphers(final String[] defaultSupplementalCiphers) {
            this.defaultSupplementalCiphers = defaultSupplementalCiphers;
            return this;
        }

        public GetNodeSupportedTlsCiphersResult.Builder supportedSupplementalCiphers(final String[] supportedSupplementalCiphers) {
            this.supportedSupplementalCiphers = supportedSupplementalCiphers;
            return this;
        }

    }
}
