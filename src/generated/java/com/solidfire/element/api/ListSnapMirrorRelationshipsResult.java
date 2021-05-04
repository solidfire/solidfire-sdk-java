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
 * ListSnapMirrorRelationshipsResult  
 **/

public class ListSnapMirrorRelationshipsResult implements Serializable {

    public static final long serialVersionUID = 1715325150858121616L;
    @SerializedName("snapMirrorRelationships") private SnapMirrorRelationship[] snapMirrorRelationships;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorRelationshipsResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorRelationshipsResult(
        SnapMirrorRelationship[] snapMirrorRelationships
    )
    {
        this.snapMirrorRelationships = snapMirrorRelationships;
    }

    /** 
     * A list of objects containing information about SnapMirror relationships.
     **/
    public SnapMirrorRelationship[] getSnapMirrorRelationships() { return this.snapMirrorRelationships; }
   
    public void setSnapMirrorRelationships(SnapMirrorRelationship[] snapMirrorRelationships) { 
        this.snapMirrorRelationships = snapMirrorRelationships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorRelationshipsResult that = (ListSnapMirrorRelationshipsResult) o;

        return 
            Arrays.equals(snapMirrorRelationships, that.snapMirrorRelationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorRelationships );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorRelationships", snapMirrorRelationships);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorRelationships : ").append(gson.toJson(Arrays.toString(snapMirrorRelationships))).append(",");
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
        private SnapMirrorRelationship[] snapMirrorRelationships;

        private Builder() { }

        public ListSnapMirrorRelationshipsResult build() {
            return new ListSnapMirrorRelationshipsResult (
                         this.snapMirrorRelationships);
        }

        private ListSnapMirrorRelationshipsResult.Builder buildFrom(final ListSnapMirrorRelationshipsResult req) {
            this.snapMirrorRelationships = req.snapMirrorRelationships;

            return this;
        }

        public ListSnapMirrorRelationshipsResult.Builder snapMirrorRelationships(final SnapMirrorRelationship[] snapMirrorRelationships) {
            this.snapMirrorRelationships = snapMirrorRelationships;
            return this;
        }

    }
}
