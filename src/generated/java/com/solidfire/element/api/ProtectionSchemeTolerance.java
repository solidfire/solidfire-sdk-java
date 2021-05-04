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
 * ProtectionSchemeTolerance  
 * ProtectionSchemeTolerance is how many simultaneous failures, for a specific Protection Scheme,
 * can be sustained through which the cluster can continue to read and write data.
 **/

public class ProtectionSchemeTolerance implements Serializable {

    public static final long serialVersionUID = -8816411074182388291L;
    @SerializedName("protectionScheme") private String protectionScheme;
    @SerializedName("sustainableFailuresForBlockData") private Long sustainableFailuresForBlockData;
    @SerializedName("sustainableFailuresForMetadata") private Long sustainableFailuresForMetadata;
    // empty constructor
    @Since("7.0")
    public ProtectionSchemeTolerance() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionSchemeTolerance(
        String protectionScheme,
        Long sustainableFailuresForBlockData,
        Long sustainableFailuresForMetadata
    )
    {
        this.protectionScheme = protectionScheme;
        this.sustainableFailuresForBlockData = sustainableFailuresForBlockData;
        this.sustainableFailuresForMetadata = sustainableFailuresForMetadata;
    }

    /** 
     * The Protection Scheme.
     **/
    public String getProtectionScheme() { return this.protectionScheme; }
   
    public void setProtectionScheme(String protectionScheme) { 
        this.protectionScheme = protectionScheme;
    }
    /** 
     * The number of simultaneous failures which can occur without losing block data
     * availability for the Protection Scheme.
     **/
    public Long getSustainableFailuresForBlockData() { return this.sustainableFailuresForBlockData; }
   
    public void setSustainableFailuresForBlockData(Long sustainableFailuresForBlockData) { 
        this.sustainableFailuresForBlockData = sustainableFailuresForBlockData;
    }
    /** 
     * The number of simultaneous failures which can occur without losing metadata
     * or Vvol availability for the Protection Scheme.
     **/
    public Long getSustainableFailuresForMetadata() { return this.sustainableFailuresForMetadata; }
   
    public void setSustainableFailuresForMetadata(Long sustainableFailuresForMetadata) { 
        this.sustainableFailuresForMetadata = sustainableFailuresForMetadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionSchemeTolerance that = (ProtectionSchemeTolerance) o;

        return 
            Objects.equals(protectionScheme, that.protectionScheme) && 
            Objects.equals(sustainableFailuresForBlockData, that.sustainableFailuresForBlockData) && 
            Objects.equals(sustainableFailuresForMetadata, that.sustainableFailuresForMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protectionScheme,sustainableFailuresForBlockData,sustainableFailuresForMetadata );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionScheme", protectionScheme);
        map.put("sustainableFailuresForBlockData", sustainableFailuresForBlockData);
        map.put("sustainableFailuresForMetadata", sustainableFailuresForMetadata);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionScheme : ").append(gson.toJson(protectionScheme)).append(",");
        sb.append(" sustainableFailuresForBlockData : ").append(gson.toJson(sustainableFailuresForBlockData)).append(",");
        sb.append(" sustainableFailuresForMetadata : ").append(gson.toJson(sustainableFailuresForMetadata)).append(",");
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
        private String protectionScheme;
        private Long sustainableFailuresForBlockData;
        private Long sustainableFailuresForMetadata;

        private Builder() { }

        public ProtectionSchemeTolerance build() {
            return new ProtectionSchemeTolerance (
                         this.protectionScheme,
                         this.sustainableFailuresForBlockData,
                         this.sustainableFailuresForMetadata);
        }

        private ProtectionSchemeTolerance.Builder buildFrom(final ProtectionSchemeTolerance req) {
            this.protectionScheme = req.protectionScheme;
            this.sustainableFailuresForBlockData = req.sustainableFailuresForBlockData;
            this.sustainableFailuresForMetadata = req.sustainableFailuresForMetadata;

            return this;
        }

        public ProtectionSchemeTolerance.Builder protectionScheme(final String protectionScheme) {
            this.protectionScheme = protectionScheme;
            return this;
        }

        public ProtectionSchemeTolerance.Builder sustainableFailuresForBlockData(final Long sustainableFailuresForBlockData) {
            this.sustainableFailuresForBlockData = sustainableFailuresForBlockData;
            return this;
        }

        public ProtectionSchemeTolerance.Builder sustainableFailuresForMetadata(final Long sustainableFailuresForMetadata) {
            this.sustainableFailuresForMetadata = sustainableFailuresForMetadata;
            return this;
        }

    }
}
