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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * RestartServicesRequest  
 * The RestartServices API method is used to restart the  Element services on a node.Caution: This method causes temporary node services interruption. Exercise caution when using this method.
 **/

public class RestartServicesRequest implements Serializable {

    public static final long serialVersionUID = 1720460094482035026L;
    @SerializedName("force") private Boolean force;
    @SerializedName("service") private Optional<String> service;
    @SerializedName("action") private Optional<String> action;

    // empty constructor
    @Since("7.0")
    public RestartServicesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RestartServicesRequest(
        Boolean force,
        Optional<String> service,
        Optional<String> action
    )
    {
        this.force = force;
        this.service = (service == null) ? Optional.<String>empty() : service;
        this.action = (action == null) ? Optional.<String>empty() : action;
    }

    /** 
     * The "force" parameter must be included on this method to successfully restart services on a node.   
     **/
    public Boolean getForce() { return this.force; }
    public void setForce(Boolean force) { 
        this.force = force;
    }
    /** 
     * Service name to be restarted.
     **/
    public Optional<String> getService() { return this.service; }
    public void setService(Optional<String> service) { 
        this.service = (service == null) ? Optional.<String>empty() : service;
    }
    /** 
     * Action to perform on the service (start, stop, restart).
     **/
    public Optional<String> getAction() { return this.action; }
    public void setAction(Optional<String> action) { 
        this.action = (action == null) ? Optional.<String>empty() : action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestartServicesRequest that = (RestartServicesRequest) o;

        return 
            Objects.equals(force, that.force) && 
            Objects.equals(service, that.service) && 
            Objects.equals(action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash( force,service,action );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("force", force);
        map.put("service", service);
        map.put("action", action);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" force : ").append(force).append(",");
        if(null != service && service.isPresent()){
            sb.append(" service : ").append(service).append(",");
        }
        if(null != action && action.isPresent()){
            sb.append(" action : ").append(action).append(",");
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
        private Boolean force;
        private Optional<String> service;
        private Optional<String> action;

        private Builder() { }

        public RestartServicesRequest build() {
            return new RestartServicesRequest (
                         this.force,
                         this.service,
                         this.action);
        }

        private RestartServicesRequest.Builder buildFrom(final RestartServicesRequest req) {
            this.force = req.force;
            this.service = req.service;
            this.action = req.action;

            return this;
        }

        public RestartServicesRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

        public RestartServicesRequest.Builder optionalService(final String service) {
            this.service = (service == null) ? Optional.<String>empty() : Optional.of(service);
            return this;
        }

        public RestartServicesRequest.Builder optionalAction(final String action) {
            this.action = (action == null) ? Optional.<String>empty() : Optional.of(action);
            return this;
        }

    }
}
