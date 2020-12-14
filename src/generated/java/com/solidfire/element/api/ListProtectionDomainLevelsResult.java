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
 * ListProtectionDomainLevelsResult  
 **/

public class ListProtectionDomainLevelsResult implements Serializable {

    public static final long serialVersionUID = -3266579975441127444L;
    @SerializedName("protectionDomainLevels") private ProtectionDomainLevel[] protectionDomainLevels;
    // empty constructor
    @Since("7.0")
    public ListProtectionDomainLevelsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListProtectionDomainLevelsResult(
        ProtectionDomainLevel[] protectionDomainLevels
    )
    {
        this.protectionDomainLevels = protectionDomainLevels;
    }

    /** 
     * A list of the different Protection Domain Levels, where each supplies the
     * cluster's Tolerance and Resiliency information from its own perspective.
     * This will include an element for each of the defined Protection Domain Types.
     **/
    public ProtectionDomainLevel[] getProtectionDomainLevels() { return this.protectionDomainLevels; }
   
    public void setProtectionDomainLevels(ProtectionDomainLevel[] protectionDomainLevels) { 
        this.protectionDomainLevels = protectionDomainLevels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListProtectionDomainLevelsResult that = (ListProtectionDomainLevelsResult) o;

        return 
            Arrays.equals(protectionDomainLevels, that.protectionDomainLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])protectionDomainLevels );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionDomainLevels", protectionDomainLevels);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionDomainLevels : ").append(gson.toJson(Arrays.toString(protectionDomainLevels))).append(",");
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
        private ProtectionDomainLevel[] protectionDomainLevels;

        private Builder() { }

        public ListProtectionDomainLevelsResult build() {
            return new ListProtectionDomainLevelsResult (
                         this.protectionDomainLevels);
        }

        private ListProtectionDomainLevelsResult.Builder buildFrom(final ListProtectionDomainLevelsResult req) {
            this.protectionDomainLevels = req.protectionDomainLevels;

            return this;
        }

        public ListProtectionDomainLevelsResult.Builder protectionDomainLevels(final ProtectionDomainLevel[] protectionDomainLevels) {
            this.protectionDomainLevels = protectionDomainLevels;
            return this;
        }

    }
}
