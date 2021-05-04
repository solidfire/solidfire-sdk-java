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
 * ListSnapMirrorVolumesResult  
 **/

public class ListSnapMirrorVolumesResult implements Serializable {

    public static final long serialVersionUID = -5417058660360984854L;
    @SerializedName("snapMirrorVolumes") private SnapMirrorVolume[] snapMirrorVolumes;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorVolumesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorVolumesResult(
        SnapMirrorVolume[] snapMirrorVolumes
    )
    {
        this.snapMirrorVolumes = snapMirrorVolumes;
    }

    /** 
     * A list of the SnapMirror volumes available on the ONTAP storage system.
     **/
    public SnapMirrorVolume[] getSnapMirrorVolumes() { return this.snapMirrorVolumes; }
   
    public void setSnapMirrorVolumes(SnapMirrorVolume[] snapMirrorVolumes) { 
        this.snapMirrorVolumes = snapMirrorVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorVolumesResult that = (ListSnapMirrorVolumesResult) o;

        return 
            Arrays.equals(snapMirrorVolumes, that.snapMirrorVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorVolumes", snapMirrorVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorVolumes : ").append(gson.toJson(Arrays.toString(snapMirrorVolumes))).append(",");
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
        private SnapMirrorVolume[] snapMirrorVolumes;

        private Builder() { }

        public ListSnapMirrorVolumesResult build() {
            return new ListSnapMirrorVolumesResult (
                         this.snapMirrorVolumes);
        }

        private ListSnapMirrorVolumesResult.Builder buildFrom(final ListSnapMirrorVolumesResult req) {
            this.snapMirrorVolumes = req.snapMirrorVolumes;

            return this;
        }

        public ListSnapMirrorVolumesResult.Builder snapMirrorVolumes(final SnapMirrorVolume[] snapMirrorVolumes) {
            this.snapMirrorVolumes = snapMirrorVolumes;
            return this;
        }

    }
}
