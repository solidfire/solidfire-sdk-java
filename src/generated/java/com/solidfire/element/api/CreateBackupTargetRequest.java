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
 * CreateBackupTargetRequest  
 * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
 **/

public class CreateBackupTargetRequest implements Serializable {

    public static final long serialVersionUID = -2587880246546897186L;
    @SerializedName("name") private String name;
    @SerializedName("attributes") private Attributes attributes;
    // empty constructor
    @Since("7.0")
    public CreateBackupTargetRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateBackupTargetRequest(
        String name,
        Attributes attributes
    )
    {
        this.name = name;
        this.attributes = attributes;
    }

    /** 
     * The name of the backup target.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateBackupTargetRequest that = (CreateBackupTargetRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
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
        private String name;
        private Attributes attributes;

        private Builder() { }

        public CreateBackupTargetRequest build() {
            return new CreateBackupTargetRequest (
                         this.name,
                         this.attributes);
        }

        private CreateBackupTargetRequest.Builder buildFrom(final CreateBackupTargetRequest req) {
            this.name = req.name;
            this.attributes = req.attributes;

            return this;
        }

        public CreateBackupTargetRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateBackupTargetRequest.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
