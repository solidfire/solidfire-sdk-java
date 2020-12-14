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
 * ListSnapMirrorPoliciesResult  
 **/

public class ListSnapMirrorPoliciesResult implements Serializable {

    public static final long serialVersionUID = 8488131874044322969L;
    @SerializedName("snapMirrorPolicies") private SnapMirrorPolicy[] snapMirrorPolicies;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorPoliciesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorPoliciesResult(
        SnapMirrorPolicy[] snapMirrorPolicies
    )
    {
        this.snapMirrorPolicies = snapMirrorPolicies;
    }

    /** 
     * A list of the SnapMirror policies on the ONTAP storage system.
     **/
    public SnapMirrorPolicy[] getSnapMirrorPolicies() { return this.snapMirrorPolicies; }
   
    public void setSnapMirrorPolicies(SnapMirrorPolicy[] snapMirrorPolicies) { 
        this.snapMirrorPolicies = snapMirrorPolicies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorPoliciesResult that = (ListSnapMirrorPoliciesResult) o;

        return 
            Arrays.equals(snapMirrorPolicies, that.snapMirrorPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorPolicies );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorPolicies", snapMirrorPolicies);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorPolicies : ").append(gson.toJson(Arrays.toString(snapMirrorPolicies))).append(",");
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
        private SnapMirrorPolicy[] snapMirrorPolicies;

        private Builder() { }

        public ListSnapMirrorPoliciesResult build() {
            return new ListSnapMirrorPoliciesResult (
                         this.snapMirrorPolicies);
        }

        private ListSnapMirrorPoliciesResult.Builder buildFrom(final ListSnapMirrorPoliciesResult req) {
            this.snapMirrorPolicies = req.snapMirrorPolicies;

            return this;
        }

        public ListSnapMirrorPoliciesResult.Builder snapMirrorPolicies(final SnapMirrorPolicy[] snapMirrorPolicies) {
            this.snapMirrorPolicies = snapMirrorPolicies;
            return this;
        }

    }
}
