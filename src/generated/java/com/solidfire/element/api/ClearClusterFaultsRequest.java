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
 * The Request object for the "ClearClusterFaults" API Service call.
 **/
public class ClearClusterFaultsRequest implements Serializable {

    private static final long serialVersionUID = -762867024L;

    @SerializedName("faultTypes") private final Optional<String> faultTypes;

    /**
     * The Request object for the "ClearClusterFaults" API Service call.
     * @param faultTypes (optional) Determines the types of faults cleared:<br/>
     * @since 7.0
     **/
    @Since("7.0")
    public ClearClusterFaultsRequest(Optional<String> faultTypes) {
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }


    /**
     * Determines the types of faults cleared:<br/>
     * <b>current</b>: Faults that are currently detected and have not been resolved.<br/>
     * <b>resolved</b>: Faults that were previously detected and resolved.<br/>
     * <b>all</b>: Both current and resolved faults are cleared. The fault status can be determined by the &quot;resolved&quot; field of the fault object.
     **/
    public Optional<String> getFaultTypes() {
        return this.faultTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClearClusterFaultsRequest that = (ClearClusterFaultsRequest) o;
        

        return Objects.equals( faultTypes , that.faultTypes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) faultTypes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != faultTypes && faultTypes.isPresent())
            sb.append(" faultTypes : ").append(faultTypes.get());
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
        private Optional<String> faultTypes;

        private Builder() { }

        public ClearClusterFaultsRequest build() {
            return new ClearClusterFaultsRequest (
                         this.faultTypes            );
        }

        private ClearClusterFaultsRequest.Builder buildFrom(final ClearClusterFaultsRequest req) {
            this.faultTypes = req.faultTypes;

            return this;
        }

        public ClearClusterFaultsRequest.Builder optionalFaultTypes(final String faultTypes) {
            this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : Optional.of(faultTypes);
            return this;
        }

    }

}
