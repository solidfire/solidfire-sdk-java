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
 * ListFibreChannelPortInfoResult is used to return information about the Fibre Channel ports.
 **/
public class ListFibreChannelPortInfoResult  implements Serializable  {

    private static final long serialVersionUID = -201731339L;

    @SerializedName("fibreChannelPortInfo") private final java.util.Map<String,FibreChannelPortInfoResult> fibreChannelPortInfo;

    /**
     * ListFibreChannelPortInfoResult is used to return information about the Fibre Channel ports.
     * @param fibreChannelPortInfo [required] Used to return information about the Fibre Channel ports.
     * @since 7.0
     **/
    @Since("7.0")
    public ListFibreChannelPortInfoResult(java.util.Map<String,FibreChannelPortInfoResult> fibreChannelPortInfo) {
        this.fibreChannelPortInfo = fibreChannelPortInfo;
    }


    /**
     * Used to return information about the Fibre Channel ports.
     **/
    public java.util.Map<String,FibreChannelPortInfoResult> getFibreChannelPortInfo() {
        return this.fibreChannelPortInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListFibreChannelPortInfoResult that = (ListFibreChannelPortInfoResult) o;
        

        return Objects.equals( fibreChannelPortInfo , that.fibreChannelPortInfo );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) fibreChannelPortInfo );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" fibreChannelPortInfo : ").append(fibreChannelPortInfo);
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
        private java.util.Map<String,FibreChannelPortInfoResult> fibreChannelPortInfo;

        private Builder() { }

        public ListFibreChannelPortInfoResult build() {
            return new ListFibreChannelPortInfoResult (
                         this.fibreChannelPortInfo            );
        }

        private ListFibreChannelPortInfoResult.Builder buildFrom(final ListFibreChannelPortInfoResult req) {
            this.fibreChannelPortInfo = req.fibreChannelPortInfo;

            return this;
        }

        public ListFibreChannelPortInfoResult.Builder fibreChannelPortInfo(final java.util.Map<String,FibreChannelPortInfoResult> fibreChannelPortInfo) {
            this.fibreChannelPortInfo = fibreChannelPortInfo;
            return this;
        }

    }

}
