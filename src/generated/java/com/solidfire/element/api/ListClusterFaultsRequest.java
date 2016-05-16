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
 * The Request object for the "ListClusterFaults" API Service call.
 **/
public class ListClusterFaultsRequest implements Serializable {

    private static final long serialVersionUID = 412506169L;

    private final Optional<Boolean> exceptions;
    private final Optional<Boolean> bestPractices;
    private final Optional<Boolean> update;
    private final Optional<String> faultTypes;

    /**
     * The Request object for the "ListClusterFaults" API Service call.
     * @param exceptions (optional) 
     * @param bestPractices (optional) 
     * @param update (optional) 
     * @param faultTypes (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public ListClusterFaultsRequest(Optional<Boolean> exceptions, Optional<Boolean> bestPractices, Optional<Boolean> update, Optional<String> faultTypes) {
        this.exceptions = (exceptions == null) ? Optional.<Boolean>empty() : exceptions;
        this.bestPractices = (bestPractices == null) ? Optional.<Boolean>empty() : bestPractices;
        this.update = (update == null) ? Optional.<Boolean>empty() : update;
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }

    public Optional<Boolean> getExceptions() {
        return this.exceptions;
    }
    public Optional<Boolean> getBestPractices() {
        return this.bestPractices;
    }
    public Optional<Boolean> getUpdate() {
        return this.update;
    }
    public Optional<String> getFaultTypes() {
        return this.faultTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterFaultsRequest that = (ListClusterFaultsRequest) o;
        

        return Objects.equals( exceptions , that.exceptions )
            && Objects.equals( bestPractices , that.bestPractices )
            && Objects.equals( update , that.update )
            && Objects.equals( faultTypes , that.faultTypes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( exceptions, bestPractices, update, faultTypes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != exceptions && exceptions.isPresent())
            sb.append(" exceptions : ").append(exceptions.get()).append(",");
        if(null != bestPractices && bestPractices.isPresent())
            sb.append(" bestPractices : ").append(bestPractices.get()).append(",");
        if(null != update && update.isPresent())
            sb.append(" update : ").append(update.get()).append(",");
        if(null != faultTypes && faultTypes.isPresent())
            sb.append(" faultTypes : ").append(faultTypes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Optional<Boolean> exceptions;
        private Optional<Boolean> bestPractices;
        private Optional<Boolean> update;
        private Optional<String> faultTypes;

        private Builder() { }

        public ListClusterFaultsRequest build() {
            return new ListClusterFaultsRequest (
                         this.exceptions,
                         this.bestPractices,
                         this.update,
                         this.faultTypes            );
        }

        private ListClusterFaultsRequest.Builder buildFrom(final ListClusterFaultsRequest req) {
            this.exceptions = req.exceptions;
            this.bestPractices = req.bestPractices;
            this.update = req.update;
            this.faultTypes = req.faultTypes;

            return this;
        }

        public ListClusterFaultsRequest.Builder optionalExceptions(final Boolean exceptions) {
            this.exceptions = (exceptions == null) ? Optional.<Boolean>empty() : Optional.of(exceptions);
            return this;
        }

        public ListClusterFaultsRequest.Builder optionalBestPractices(final Boolean bestPractices) {
            this.bestPractices = (bestPractices == null) ? Optional.<Boolean>empty() : Optional.of(bestPractices);
            return this;
        }

        public ListClusterFaultsRequest.Builder optionalUpdate(final Boolean update) {
            this.update = (update == null) ? Optional.<Boolean>empty() : Optional.of(update);
            return this;
        }

        public ListClusterFaultsRequest.Builder optionalFaultTypes(final String faultTypes) {
            this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : Optional.of(faultTypes);
            return this;
        }

    }

}
