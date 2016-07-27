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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ModifyBackupTarget" API Service call.
 **/
public class ModifyBackupTargetRequest  implements Serializable  {

    private static final long serialVersionUID = -288893260L;

    @SerializedName("backupTargetID") private final Long backupTargetID;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "ModifyBackupTarget" API Service call.
     * @param backupTargetID [required] Unique identifier assigned to the backup target.
     * @param name (optional) Name for the backup target.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyBackupTargetRequest(Long backupTargetID, Optional<String> name, Optional<java.util.Map<String, Object>> attributes) {
        this.backupTargetID = backupTargetID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }


    /**
     * Unique identifier assigned to the backup target.
     **/
    public Long getBackupTargetID() {
        return this.backupTargetID;
    }

    /**
     * Name for the backup target.
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyBackupTargetRequest that = (ModifyBackupTargetRequest) o;
        

        return Objects.equals( backupTargetID , that.backupTargetID )
            && Objects.equals( name , that.name )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( backupTargetID, name, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" backupTargetID : ").append(backupTargetID).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long backupTargetID;
        private Optional<String> name;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyBackupTargetRequest build() {
            return new ModifyBackupTargetRequest (
                         this.backupTargetID,
                         this.name,
                         this.attributes            );
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

        public ModifyBackupTargetRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
