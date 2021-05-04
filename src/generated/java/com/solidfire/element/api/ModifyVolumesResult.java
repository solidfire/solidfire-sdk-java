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
 * ModifyVolumesResult  
 **/

public class ModifyVolumesResult implements Serializable {

    public static final long serialVersionUID = -2828386920106926667L;
    @SerializedName("volumes") private Volume[] volumes;
    @SerializedName("qos") private Optional<QoS> qos;
    // empty constructor
    @Since("7.0")
    public ModifyVolumesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumesResult(
        Volume[] volumes,
        Optional<QoS> qos
    )
    {
        this.volumes = volumes;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }

    /** 
     * 
     **/
    public Volume[] getVolumes() { return this.volumes; }
   
    public void setVolumes(Volume[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     * 
     **/
    public Optional<QoS> getQos() { return this.qos; }
   
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumesResult that = (ModifyVolumesResult) o;

        return 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumes,qos );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
        map.put("qos", qos);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumes : ").append(gson.toJson(Arrays.toString(volumes))).append(",");
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(gson.toJson(qos)).append(",");
        }
        else{
            sb.append(" qos : ").append("null").append(",");
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
        private Volume[] volumes;
        private Optional<QoS> qos;

        private Builder() { }

        public ModifyVolumesResult build() {
            return new ModifyVolumesResult (
                         this.volumes,
                         this.qos);
        }

        private ModifyVolumesResult.Builder buildFrom(final ModifyVolumesResult req) {
            this.volumes = req.volumes;
            this.qos = req.qos;

            return this;
        }

        public ModifyVolumesResult.Builder volumes(final Volume[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public ModifyVolumesResult.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

    }
}
