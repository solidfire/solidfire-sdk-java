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
 * LldpConfig  
 * LLDP configuration items
 **/

public class LldpConfig implements Serializable {

    public static final long serialVersionUID = -5854894670303090655L;
    @SerializedName("enableLldp") private Optional<Boolean> enableLldp;
    @SerializedName("enableMed") private Optional<Boolean> enableMed;
    @SerializedName("enableOtherProtocols") private Optional<Boolean> enableOtherProtocols;

    
    // parameterized constructor
    @Since("7.0")
    public LldpConfig(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public LldpConfig(
        Optional<Boolean> enableLldp,
        Optional<Boolean> enableMed,
        Optional<Boolean> enableOtherProtocols
    )
    {
        this.enableLldp = (enableLldp == null) ? Optional.<Boolean>empty() : enableLldp;
        this.enableMed = (enableMed == null) ? Optional.<Boolean>empty() : enableMed;
        this.enableOtherProtocols = (enableOtherProtocols == null) ? Optional.<Boolean>empty() : enableOtherProtocols;
    }

    /** 
     * Enable the LLDP service
     **/
    public Optional<Boolean> getEnableLldp() { return this.enableLldp; }
   
    public void setEnableLldp(Optional<Boolean> enableLldp) { 
        this.enableLldp = (enableLldp == null) ? Optional.<Boolean>empty() : enableLldp;
    }
    /** 
     * Enable MED, an extension to LLDP that provides inventory information
     **/
    public Optional<Boolean> getEnableMed() { return this.enableMed; }
   
    public void setEnableMed(Optional<Boolean> enableMed) { 
        this.enableMed = (enableMed == null) ? Optional.<Boolean>empty() : enableMed;
    }
    /** 
     * Enable other discovery protocols: CDP, FDP, EDP, and SONMP.
     **/
    public Optional<Boolean> getEnableOtherProtocols() { return this.enableOtherProtocols; }
   
    public void setEnableOtherProtocols(Optional<Boolean> enableOtherProtocols) { 
        this.enableOtherProtocols = (enableOtherProtocols == null) ? Optional.<Boolean>empty() : enableOtherProtocols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LldpConfig that = (LldpConfig) o;

        return 
            Objects.equals(enableLldp, that.enableLldp) && 
            Objects.equals(enableMed, that.enableMed) && 
            Objects.equals(enableOtherProtocols, that.enableOtherProtocols);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enableLldp,enableMed,enableOtherProtocols );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enableLldp", enableLldp);
        map.put("enableMed", enableMed);
        map.put("enableOtherProtocols", enableOtherProtocols);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != enableLldp && enableLldp.isPresent()){
            sb.append(" enableLldp : ").append(gson.toJson(enableLldp)).append(",");
        }
        else{
            sb.append(" enableLldp : ").append("null").append(",");
        }
        if(null != enableMed && enableMed.isPresent()){
            sb.append(" enableMed : ").append(gson.toJson(enableMed)).append(",");
        }
        else{
            sb.append(" enableMed : ").append("null").append(",");
        }
        if(null != enableOtherProtocols && enableOtherProtocols.isPresent()){
            sb.append(" enableOtherProtocols : ").append(gson.toJson(enableOtherProtocols)).append(",");
        }
        else{
            sb.append(" enableOtherProtocols : ").append("null").append(",");
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
        private Optional<Boolean> enableLldp;
        private Optional<Boolean> enableMed;
        private Optional<Boolean> enableOtherProtocols;

        private Builder() { }

        public LldpConfig build() {
            return new LldpConfig (
                         this.enableLldp,
                         this.enableMed,
                         this.enableOtherProtocols);
        }

        private LldpConfig.Builder buildFrom(final LldpConfig req) {
            this.enableLldp = req.enableLldp;
            this.enableMed = req.enableMed;
            this.enableOtherProtocols = req.enableOtherProtocols;

            return this;
        }

        public LldpConfig.Builder optionalEnableLldp(final Boolean enableLldp) {
            this.enableLldp = (enableLldp == null) ? Optional.<Boolean>empty() : Optional.of(enableLldp);
            return this;
        }

        public LldpConfig.Builder optionalEnableMed(final Boolean enableMed) {
            this.enableMed = (enableMed == null) ? Optional.<Boolean>empty() : Optional.of(enableMed);
            return this;
        }

        public LldpConfig.Builder optionalEnableOtherProtocols(final Boolean enableOtherProtocols) {
            this.enableOtherProtocols = (enableOtherProtocols == null) ? Optional.<Boolean>empty() : Optional.of(enableOtherProtocols);
            return this;
        }

    }
}
