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
 * The object returned by the "GetHardwareConfig" API Service call.
 **/
public class GetHardwareConfigResult  implements Serializable  {

    private static final long serialVersionUID = -1197898847L;

    @SerializedName("hardwareConfig") private HardwareConfig hardwareConfig;

    /**
     * The object returned by the "GetHardwareConfig" API Service call.
     * @param hardwareConfig [required] List of hardware information and current settings.
     * @since 7.0
     **/
    @Since("7.0")
    public GetHardwareConfigResult(HardwareConfig hardwareConfig) {
        this.hardwareConfig = hardwareConfig;
    }

    
    /**
     * The object returned by the "GetHardwareConfig" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public GetHardwareConfigResult() {}


    /**
     * List of hardware information and current settings.
     **/
    public HardwareConfig getHardwareConfig() {
        return this.hardwareConfig;
    }

    public void setHardwareConfig(HardwareConfig hardwareConfig) {
        this.hardwareConfig = hardwareConfig;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetHardwareConfigResult that = (GetHardwareConfigResult) o;
        

        return Objects.equals( hardwareConfig , that.hardwareConfig );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) hardwareConfig );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" hardwareConfig : ").append(hardwareConfig);
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
        private HardwareConfig hardwareConfig;

        private Builder() { }

        public GetHardwareConfigResult build() {
            return new GetHardwareConfigResult (
                         this.hardwareConfig            );
        }

        private GetHardwareConfigResult.Builder buildFrom(final GetHardwareConfigResult req) {
            this.hardwareConfig = req.hardwareConfig;

            return this;
        }

        public GetHardwareConfigResult.Builder hardwareConfig(final HardwareConfig hardwareConfig) {
            this.hardwareConfig = hardwareConfig;
            return this;
        }

    }

}