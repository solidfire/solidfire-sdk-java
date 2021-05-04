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
 * ListVolumeStatsByVolumeRequest  
 * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
 * creation of the volume.
 **/

public class ListVolumeStatsByVolumeRequest implements Serializable {

    public static final long serialVersionUID = -5482950276246600445L;
    @SerializedName("includeVirtualVolumes") private Optional<Boolean> includeVirtualVolumes;

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsByVolumeRequest(
    )
    {
    }
    // parameterized constructor
    @Since("9.0")
    public ListVolumeStatsByVolumeRequest(
        Optional<Boolean> includeVirtualVolumes
    )
    {
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    /** 
     * Specifies that virtual volumes are included in the response by default.
     * To exclude virtual volumes, set to false.
     **/
    public Optional<Boolean> getIncludeVirtualVolumes() { return this.includeVirtualVolumes; }
   
    public void setIncludeVirtualVolumes(Optional<Boolean> includeVirtualVolumes) { 
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsByVolumeRequest that = (ListVolumeStatsByVolumeRequest) o;

        return 
            Objects.equals(includeVirtualVolumes, that.includeVirtualVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( includeVirtualVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("includeVirtualVolumes", includeVirtualVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != includeVirtualVolumes && includeVirtualVolumes.isPresent()){
            sb.append(" includeVirtualVolumes : ").append(gson.toJson(includeVirtualVolumes)).append(",");
        }
        else{
            sb.append(" includeVirtualVolumes : ").append("null").append(",");
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
        private Optional<Boolean> includeVirtualVolumes;

        private Builder() { }

        public ListVolumeStatsByVolumeRequest build() {
            return new ListVolumeStatsByVolumeRequest (
                         this.includeVirtualVolumes);
        }

        private ListVolumeStatsByVolumeRequest.Builder buildFrom(final ListVolumeStatsByVolumeRequest req) {
            this.includeVirtualVolumes = req.includeVirtualVolumes;

            return this;
        }

        public ListVolumeStatsByVolumeRequest.Builder optionalIncludeVirtualVolumes(final Boolean includeVirtualVolumes) {
            this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : Optional.of(includeVirtualVolumes);
            return this;
        }

    }
}
