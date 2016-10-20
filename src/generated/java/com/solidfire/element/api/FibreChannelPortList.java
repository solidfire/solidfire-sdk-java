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
 * List of all Fibre Channel ports.
 **/
public class FibreChannelPortList  implements Serializable  {

    private static final long serialVersionUID = -1944190359L;

    @SerializedName("fibreChannelPorts") private FibreChannelPortInfo[] fibreChannelPorts;

    /**
     * List of all Fibre Channel ports.
     * @param fibreChannelPorts [required] List of all physical Fibre Channel ports.
     * @since 7.0
     **/
    @Since("7.0")
    public FibreChannelPortList(FibreChannelPortInfo[] fibreChannelPorts) {
        this.fibreChannelPorts = fibreChannelPorts;
    }

    
    /**
     * List of all Fibre Channel ports.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public FibreChannelPortList() {}


    /**
     * List of all physical Fibre Channel ports.
     **/
    public FibreChannelPortInfo[] getFibreChannelPorts() {
        return this.fibreChannelPorts;
    }

    public void setFibreChannelPorts(FibreChannelPortInfo[] fibreChannelPorts) {
        this.fibreChannelPorts = fibreChannelPorts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FibreChannelPortList that = (FibreChannelPortList) o;
        

        return Objects.deepEquals( fibreChannelPorts , that.fibreChannelPorts );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) fibreChannelPorts );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" fibreChannelPorts : ").append(Arrays.toString(fibreChannelPorts));
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
        private FibreChannelPortInfo[] fibreChannelPorts;

        private Builder() { }

        public FibreChannelPortList build() {
            return new FibreChannelPortList (
                         this.fibreChannelPorts            );
        }

        private FibreChannelPortList.Builder buildFrom(final FibreChannelPortList req) {
            this.fibreChannelPorts = req.fibreChannelPorts;

            return this;
        }

        public FibreChannelPortList.Builder fibreChannelPorts(final FibreChannelPortInfo[] fibreChannelPorts) {
            this.fibreChannelPorts = fibreChannelPorts;
            return this;
        }

    }

}
