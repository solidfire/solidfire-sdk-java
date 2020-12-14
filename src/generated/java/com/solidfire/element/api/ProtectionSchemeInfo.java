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
 * ProtectionSchemeInfo  
 **/

public class ProtectionSchemeInfo implements Serializable {

    public static final long serialVersionUID = -5172658612221780688L;
    @SerializedName("category") private String category;
    @SerializedName("repCount") private Long repCount;
    @SerializedName("visibility") private String visibility;
    // empty constructor
    @Since("7.0")
    public ProtectionSchemeInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionSchemeInfo(
        String category,
        Long repCount,
        String visibility
    )
    {
        this.category = category;
        this.repCount = repCount;
        this.visibility = visibility;
    }

    /** 
     * The category of the protection scheme.
     **/
    public String getCategory() { return this.category; }
   
    public void setCategory(String category) { 
        this.category = category;
    }
    /** 
     * The total number of replicas used by the protection scheme.
     **/
    public Long getRepCount() { return this.repCount; }
   
    public void setRepCount(Long repCount) { 
        this.repCount = repCount;
    }
    /** 
     * The public visibility of the scheme.
     **/
    public String getVisibility() { return this.visibility; }
   
    public void setVisibility(String visibility) { 
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionSchemeInfo that = (ProtectionSchemeInfo) o;

        return 
            Objects.equals(category, that.category) && 
            Objects.equals(repCount, that.repCount) && 
            Objects.equals(visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash( category,repCount,visibility );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("category", category);
        map.put("repCount", repCount);
        map.put("visibility", visibility);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" category : ").append(gson.toJson(category)).append(",");
        sb.append(" repCount : ").append(gson.toJson(repCount)).append(",");
        sb.append(" visibility : ").append(gson.toJson(visibility)).append(",");
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
        private String category;
        private Long repCount;
        private String visibility;

        private Builder() { }

        public ProtectionSchemeInfo build() {
            return new ProtectionSchemeInfo (
                         this.category,
                         this.repCount,
                         this.visibility);
        }

        private ProtectionSchemeInfo.Builder buildFrom(final ProtectionSchemeInfo req) {
            this.category = req.category;
            this.repCount = req.repCount;
            this.visibility = req.visibility;

            return this;
        }

        public ProtectionSchemeInfo.Builder category(final String category) {
            this.category = category;
            return this;
        }

        public ProtectionSchemeInfo.Builder repCount(final Long repCount) {
            this.repCount = repCount;
            return this;
        }

        public ProtectionSchemeInfo.Builder visibility(final String visibility) {
            this.visibility = visibility;
            return this;
        }

    }
}
