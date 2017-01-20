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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * BackupTarget  
 * The object containing information about a backup target.
 **/

public class BackupTarget implements Serializable {

    public static final long serialVersionUID = -1717308354697246219L;
    @SerializedName("name") private String name;
    @SerializedName("backupTargetID") private Long backupTargetID;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public BackupTarget() {}

    
    // parameterized constructor
    @Since("7.0")
    public BackupTarget(
        String name,
        Long backupTargetID,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.name = name;
        this.backupTargetID = backupTargetID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * Name for the backup target.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Unique identifier assigned to the backup target.
     **/
    public Long getBackupTargetID() { return this.backupTargetID; }
    public void setBackupTargetID(Long backupTargetID) { 
        this.backupTargetID = backupTargetID;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BackupTarget that = (BackupTarget) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(backupTargetID, that.backupTargetID) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,backupTargetID,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("backupTargetID", backupTargetID);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        sb.append(" backupTargetID : ").append(backupTargetID).append(",");
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private String name;
        private Long backupTargetID;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public BackupTarget build() {
            return new BackupTarget (
                         this.name,
                         this.backupTargetID,
                         this.attributes);
        }

        private BackupTarget.Builder buildFrom(final BackupTarget req) {
            this.name = req.name;
            this.backupTargetID = req.backupTargetID;
            this.attributes = req.attributes;

            return this;
        }

        public BackupTarget.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public BackupTarget.Builder backupTargetID(final Long backupTargetID) {
            this.backupTargetID = backupTargetID;
            return this;
        }

        public BackupTarget.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
