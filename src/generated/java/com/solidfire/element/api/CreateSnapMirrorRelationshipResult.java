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
 * CreateSnapMirrorRelationshipResult  
 **/

public class CreateSnapMirrorRelationshipResult implements Serializable {

    public static final long serialVersionUID = -4700987819279428720L;
    @SerializedName("snapMirrorRelationship") private SnapMirrorRelationship snapMirrorRelationship;

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapMirrorRelationshipResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapMirrorRelationshipResult(
        SnapMirrorRelationship snapMirrorRelationship
    )
    {
        this.snapMirrorRelationship = snapMirrorRelationship;
    }

    /** 
     * Information about the newly created SnapMirror relationship.
     **/
    public SnapMirrorRelationship getSnapMirrorRelationship() { return this.snapMirrorRelationship; }
   
    public void setSnapMirrorRelationship(SnapMirrorRelationship snapMirrorRelationship) { 
        this.snapMirrorRelationship = snapMirrorRelationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapMirrorRelationshipResult that = (CreateSnapMirrorRelationshipResult) o;

        return 
            Objects.equals(snapMirrorRelationship, that.snapMirrorRelationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorRelationship );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorRelationship", snapMirrorRelationship);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorRelationship : ").append(gson.toJson(snapMirrorRelationship)).append(",");
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
        private SnapMirrorRelationship snapMirrorRelationship;

        private Builder() { }

        public CreateSnapMirrorRelationshipResult build() {
            return new CreateSnapMirrorRelationshipResult (
                         this.snapMirrorRelationship);
        }

        private CreateSnapMirrorRelationshipResult.Builder buildFrom(final CreateSnapMirrorRelationshipResult req) {
            this.snapMirrorRelationship = req.snapMirrorRelationship;

            return this;
        }

        public CreateSnapMirrorRelationshipResult.Builder snapMirrorRelationship(final SnapMirrorRelationship snapMirrorRelationship) {
            this.snapMirrorRelationship = snapMirrorRelationship;
            return this;
        }

    }
}
