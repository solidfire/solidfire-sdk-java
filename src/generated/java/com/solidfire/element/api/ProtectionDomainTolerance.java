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
 * ProtectionDomainTolerance  
 * ProtectionDomainTolerance is the ability of the cluster to continue reading and writing data
 * through one or more ProtectionDomain failures of the associated ProtectionDomainType.
 **/

public class ProtectionDomainTolerance implements Serializable {

    public static final long serialVersionUID = 7983987138611646911L;
    @SerializedName("sustainableFailuresForEnsemble") private Long sustainableFailuresForEnsemble;
    @SerializedName("protectionSchemeTolerances") private ProtectionSchemeTolerance[] protectionSchemeTolerances;
    // empty constructor
    @Since("7.0")
    public ProtectionDomainTolerance() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionDomainTolerance(
        Long sustainableFailuresForEnsemble,
        ProtectionSchemeTolerance[] protectionSchemeTolerances
    )
    {
        this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
        this.protectionSchemeTolerances = protectionSchemeTolerances;
    }

    /** 
     * The number of simultaneous failures of the associated ProtectionDomainType which
     * can occur without losing the ensemble quorum.
     **/
    public Long getSustainableFailuresForEnsemble() { return this.sustainableFailuresForEnsemble; }
   
    public void setSustainableFailuresForEnsemble(Long sustainableFailuresForEnsemble) { 
        this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
    }
    /** 
     * List of objects detailing failure tolerance information for the associated
     * ProtectionDomainType, one for each Protection Scheme.
     **/
    public ProtectionSchemeTolerance[] getProtectionSchemeTolerances() { return this.protectionSchemeTolerances; }
   
    public void setProtectionSchemeTolerances(ProtectionSchemeTolerance[] protectionSchemeTolerances) { 
        this.protectionSchemeTolerances = protectionSchemeTolerances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionDomainTolerance that = (ProtectionDomainTolerance) o;

        return 
            Objects.equals(sustainableFailuresForEnsemble, that.sustainableFailuresForEnsemble) && 
            Arrays.equals(protectionSchemeTolerances, that.protectionSchemeTolerances);
    }

    @Override
    public int hashCode() {
        return Objects.hash( sustainableFailuresForEnsemble,(Object[])protectionSchemeTolerances );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sustainableFailuresForEnsemble", sustainableFailuresForEnsemble);
        map.put("protectionSchemeTolerances", protectionSchemeTolerances);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" sustainableFailuresForEnsemble : ").append(gson.toJson(sustainableFailuresForEnsemble)).append(",");
        sb.append(" protectionSchemeTolerances : ").append(gson.toJson(Arrays.toString(protectionSchemeTolerances))).append(",");
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
        private Long sustainableFailuresForEnsemble;
        private ProtectionSchemeTolerance[] protectionSchemeTolerances;

        private Builder() { }

        public ProtectionDomainTolerance build() {
            return new ProtectionDomainTolerance (
                         this.sustainableFailuresForEnsemble,
                         this.protectionSchemeTolerances);
        }

        private ProtectionDomainTolerance.Builder buildFrom(final ProtectionDomainTolerance req) {
            this.sustainableFailuresForEnsemble = req.sustainableFailuresForEnsemble;
            this.protectionSchemeTolerances = req.protectionSchemeTolerances;

            return this;
        }

        public ProtectionDomainTolerance.Builder sustainableFailuresForEnsemble(final Long sustainableFailuresForEnsemble) {
            this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
            return this;
        }

        public ProtectionDomainTolerance.Builder protectionSchemeTolerances(final ProtectionSchemeTolerance[] protectionSchemeTolerances) {
            this.protectionSchemeTolerances = protectionSchemeTolerances;
            return this;
        }

    }
}
