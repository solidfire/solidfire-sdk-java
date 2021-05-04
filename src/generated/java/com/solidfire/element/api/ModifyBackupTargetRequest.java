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
 * ModifyBackupTargetRequest  
 * ModifyBackupTarget enables you to change attributes of a backup target.
 **/

public class ModifyBackupTargetRequest implements Serializable {

    public static final long serialVersionUID = -3610428034193474151L;
    @SerializedName("backupTargetID") private Long backupTargetID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public ModifyBackupTargetRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyBackupTargetRequest(
        Long backupTargetID,
        Optional<String> name,
        Optional<Attributes> attributes
    )
    {
        this.backupTargetID = backupTargetID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The unique target ID for the target to modify.
     **/
    public Long getBackupTargetID() { return this.backupTargetID; }
   
    public void setBackupTargetID(Long backupTargetID) { 
        this.backupTargetID = backupTargetID;
    }
    /** 
     * The new name for the backup target.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyBackupTargetRequest that = (ModifyBackupTargetRequest) o;

        return 
            Objects.equals(backupTargetID, that.backupTargetID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( backupTargetID,name,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("backupTargetID", backupTargetID);
        map.put("name", name);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" backupTargetID : ").append(gson.toJson(backupTargetID)).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
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
        private Long backupTargetID;
        private Optional<String> name;
        private Optional<Attributes> attributes;

        private Builder() { }

        public ModifyBackupTargetRequest build() {
            return new ModifyBackupTargetRequest (
                         this.backupTargetID,
                         this.name,
                         this.attributes);
        }

        private ModifyBackupTargetRequest.Builder buildFrom(final ModifyBackupTargetRequest req) {
            this.backupTargetID = req.backupTargetID;
            this.name = req.name;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyBackupTargetRequest.Builder backupTargetID(final Long backupTargetID) {
            this.backupTargetID = backupTargetID;
            return this;
        }

        public ModifyBackupTargetRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ModifyBackupTargetRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
