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
 * The Request object for the "TestConnectEnsemble" API Service call.
 **/
public class TestConnectEnsembleRequest  implements Serializable  {

    private static final long serialVersionUID = -1350494679L;

    @SerializedName("ensemble") private Optional<String> ensemble;

    /**
     * The Request object for the "TestConnectEnsemble" API Service call.
     * @param ensemble (optional) A comma-separated list of ensemble node CIPs for connectivity testing
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectEnsembleRequest(Optional<String> ensemble) {
        this.ensemble = (ensemble == null) ? Optional.<String>empty() : ensemble;
    }

    
    /**
     * The Request object for the "TestConnectEnsemble" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectEnsembleRequest() {}


    /**
     * A comma-separated list of ensemble node CIPs for connectivity testing
     **/
    public Optional<String> getEnsemble() {
        return this.ensemble;
    }

    public void setEnsemble(String ensemble) {
        this.ensemble = (ensemble == null) ? Optional.<String>empty() : Optional.of(ensemble);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectEnsembleRequest that = (TestConnectEnsembleRequest) o;
        

        return Objects.equals( ensemble , that.ensemble );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) ensemble );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != ensemble && ensemble.isPresent())
            sb.append(" ensemble : ").append(ensemble.get());
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
        private Optional<String> ensemble;

        private Builder() { }

        public TestConnectEnsembleRequest build() {
            return new TestConnectEnsembleRequest (
                         this.ensemble            );
        }

        private TestConnectEnsembleRequest.Builder buildFrom(final TestConnectEnsembleRequest req) {
            this.ensemble = req.ensemble;

            return this;
        }

        public TestConnectEnsembleRequest.Builder optionalEnsemble(final String ensemble) {
            this.ensemble = (ensemble == null) ? Optional.<String>empty() : Optional.of(ensemble);
            return this;
        }

    }

}
