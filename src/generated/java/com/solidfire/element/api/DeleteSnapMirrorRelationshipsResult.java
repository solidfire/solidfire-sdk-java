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
 * DeleteSnapMirrorRelationshipsResult  
 **/

public class DeleteSnapMirrorRelationshipsResult implements Serializable {

    public static final long serialVersionUID = 794043075758401397L;
    @SerializedName("result") private String result;

    
    // parameterized constructor
    @Since("7.0")
    public DeleteSnapMirrorRelationshipsResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public DeleteSnapMirrorRelationshipsResult(
        String result
    )
    {
        this.result = result;
    }

    /** 
     * If the delete action succeeded, this object
     * contains a success message. If the action failed,
     * it contains an error message.
     **/
    public String getResult() { return this.result; }
   
    public void setResult(String result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteSnapMirrorRelationshipsResult that = (DeleteSnapMirrorRelationshipsResult) o;

        return 
            Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash( result );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("result", result);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" result : ").append(gson.toJson(result)).append(",");
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
        private String result;

        private Builder() { }

        public DeleteSnapMirrorRelationshipsResult build() {
            return new DeleteSnapMirrorRelationshipsResult (
                         this.result);
        }

        private DeleteSnapMirrorRelationshipsResult.Builder buildFrom(final DeleteSnapMirrorRelationshipsResult req) {
            this.result = req.result;

            return this;
        }

        public DeleteSnapMirrorRelationshipsResult.Builder result(final String result) {
            this.result = result;
            return this;
        }

    }
}