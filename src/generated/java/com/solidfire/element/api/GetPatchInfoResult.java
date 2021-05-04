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
 * GetPatchInfoResult  
 **/

public class GetPatchInfoResult implements Serializable {

    public static final long serialVersionUID = -1535785717292862487L;
    @SerializedName("patches") private Attributes patches;
    // empty constructor
    @Since("7.0")
    public GetPatchInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetPatchInfoResult(
        Attributes patches
    )
    {
        this.patches = patches;
    }

    /** 
     * GetPatchInfo enables you to display the details of D-patch information for the given node.
     **/
    public Attributes getPatches() { return this.patches; }
   
    public void setPatches(Attributes patches) { 
        this.patches = patches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetPatchInfoResult that = (GetPatchInfoResult) o;

        return 
            Objects.equals(patches, that.patches);
    }

    @Override
    public int hashCode() {
        return Objects.hash( patches );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("patches", patches);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" patches : ").append(gson.toJson(patches)).append(",");
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
        private Attributes patches;

        private Builder() { }

        public GetPatchInfoResult build() {
            return new GetPatchInfoResult (
                         this.patches);
        }

        private GetPatchInfoResult.Builder buildFrom(final GetPatchInfoResult req) {
            this.patches = req.patches;

            return this;
        }

        public GetPatchInfoResult.Builder patches(final Attributes patches) {
            this.patches = patches;
            return this;
        }

    }
}
