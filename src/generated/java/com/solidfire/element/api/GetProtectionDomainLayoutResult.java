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
 * GetProtectionDomainLayoutResult  
 **/

public class GetProtectionDomainLayoutResult implements Serializable {

    public static final long serialVersionUID = 4124296422813379606L;
    @SerializedName("protectionDomainLayout") private NodeProtectionDomains[] protectionDomainLayout;
    // empty constructor
    @Since("7.0")
    public GetProtectionDomainLayoutResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetProtectionDomainLayoutResult(
        NodeProtectionDomains[] protectionDomainLayout
    )
    {
        this.protectionDomainLayout = protectionDomainLayout;
    }

    /** 
     * How all of the nodes are grouped into different ProtectionDomains.
     **/
    public NodeProtectionDomains[] getProtectionDomainLayout() { return this.protectionDomainLayout; }
   
    public void setProtectionDomainLayout(NodeProtectionDomains[] protectionDomainLayout) { 
        this.protectionDomainLayout = protectionDomainLayout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetProtectionDomainLayoutResult that = (GetProtectionDomainLayoutResult) o;

        return 
            Arrays.equals(protectionDomainLayout, that.protectionDomainLayout);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])protectionDomainLayout );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionDomainLayout", protectionDomainLayout);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionDomainLayout : ").append(gson.toJson(Arrays.toString(protectionDomainLayout))).append(",");
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
        private NodeProtectionDomains[] protectionDomainLayout;

        private Builder() { }

        public GetProtectionDomainLayoutResult build() {
            return new GetProtectionDomainLayoutResult (
                         this.protectionDomainLayout);
        }

        private GetProtectionDomainLayoutResult.Builder buildFrom(final GetProtectionDomainLayoutResult req) {
            this.protectionDomainLayout = req.protectionDomainLayout;

            return this;
        }

        public GetProtectionDomainLayoutResult.Builder protectionDomainLayout(final NodeProtectionDomains[] protectionDomainLayout) {
            this.protectionDomainLayout = protectionDomainLayout;
            return this;
        }

    }
}
