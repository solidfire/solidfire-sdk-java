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
 * The Request object for the "ListNodeFibreChannelPortInfo" API Service call.
 **/
public class ListNodeFibreChannelPortInfoRequest  implements Serializable  {

    private static final long serialVersionUID = -1861342635L;

    @SerializedName("force") private Optional<Boolean> force;

    /**
     * The Request object for the "ListNodeFibreChannelPortInfo" API Service call.
     * @param force (optional) Specify force=true to call method on all member nodes of the cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public ListNodeFibreChannelPortInfoRequest(Optional<Boolean> force) {
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    
    /**
     * The Request object for the "ListNodeFibreChannelPortInfo" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListNodeFibreChannelPortInfoRequest() {}


    /**
     * Specify force=true to call method on all member nodes of the cluster.
     **/
    public Optional<Boolean> getForce() {
        return this.force;
    }

    public void setForce(Boolean force) {
        this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNodeFibreChannelPortInfoRequest that = (ListNodeFibreChannelPortInfoRequest) o;
        

        return Objects.equals( force , that.force );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) force );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != force && force.isPresent())
            sb.append(" force : ").append(force.get());
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
        private Optional<Boolean> force;

        private Builder() { }

        public ListNodeFibreChannelPortInfoRequest build() {
            return new ListNodeFibreChannelPortInfoRequest (
                         this.force            );
        }

        private ListNodeFibreChannelPortInfoRequest.Builder buildFrom(final ListNodeFibreChannelPortInfoRequest req) {
            this.force = req.force;

            return this;
        }

        public ListNodeFibreChannelPortInfoRequest.Builder optionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }

}
