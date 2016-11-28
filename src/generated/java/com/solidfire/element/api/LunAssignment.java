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
 * VolumeID and Lun assignment.
 **/

public class LunAssignment implements Serializable {

    public static final long serialVersionUID = 4843157514928145383L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("lun") private Long lun;

    // empty constructor
    @Since("7.0")
    public LunAssignment() {}

    // parameterized constructor
    @Since("7.0")
    public LunAssignment(
        Long volumeID,
        Long lun
    )
    {
        this.volumeID = volumeID;
        this.lun = lun;
    }

    /** 
     * The volume ID assigned to the Lun.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Correct LUN values are 0 - 16383. An exception will be seen if an incorrect LUN value is passed.
     **/
    public Long getLun() { return this.lun; }
    public void setLun(Long lun) { 
        this.lun = lun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LunAssignment that = (LunAssignment) o;

        return 
            Objects.equals(volumeID, that.volumeID) &&
            Objects.equals(lun, that.lun);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, lun );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("lun", lun);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" lun : ").append(lun).append(",");
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
        private Long volumeID;
        private Long lun;

        private Builder() { }

        public LunAssignment build() {
            return new LunAssignment (
                         this.volumeID,
                         this.lun);
        }

        private LunAssignment.Builder buildFrom(final LunAssignment req) {
            this.volumeID = req.volumeID;
            this.lun = req.lun;

            return this;
        }

        public LunAssignment.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public LunAssignment.Builder lun(final Long lun) {
            this.lun = lun;
            return this;
        }

    }
}
