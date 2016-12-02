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
 * 
 **/

public class RemoveBackupTargetRequest implements Serializable {

    public static final long serialVersionUID = -1520692591750398943L;
    @SerializedName("backupTargetID") private Long backupTargetID;

    // empty constructor
    @Since("7.0")
    public RemoveBackupTargetRequest() {}

    // parameterized constructor
    @Since("7.0")
    public RemoveBackupTargetRequest(
        Long backupTargetID
    )
    {
        this.backupTargetID = backupTargetID;
    }

    /** 
     * Unique target ID of the target to remove.
     **/
    public Long getBackupTargetID() { return this.backupTargetID; }
    public void setBackupTargetID(Long backupTargetID) { 
        this.backupTargetID = backupTargetID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveBackupTargetRequest that = (RemoveBackupTargetRequest) o;

        return 
            Objects.equals(backupTargetID, that.backupTargetID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( backupTargetID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("backupTargetID", backupTargetID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" backupTargetID : ").append(backupTargetID).append(",");
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

        private Builder() { }

        public RemoveBackupTargetRequest build() {
            return new RemoveBackupTargetRequest (
                         this.backupTargetID);
        }

        private RemoveBackupTargetRequest.Builder buildFrom(final RemoveBackupTargetRequest req) {
            this.backupTargetID = req.backupTargetID;

            return this;
        }

        public RemoveBackupTargetRequest.Builder backupTargetID(final Long backupTargetID) {
            this.backupTargetID = backupTargetID;
            return this;
        }

    }
}
