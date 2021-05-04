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
 * InvokeSFApiRequest  
 * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
 * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
 **/

public class InvokeSFApiRequest implements Serializable {

    public static final long serialVersionUID = -5127430428771206301L;
    @SerializedName("method") private String method;
    @SerializedName("parameters") private Optional<Object> parameters;
    // empty constructor
    @Since("7.0")
    public InvokeSFApiRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public InvokeSFApiRequest(
        String method,
        Optional<Object> parameters
    )
    {
        this.method = method;
        this.parameters = (parameters == null) ? Optional.<Object>empty() : parameters;
    }

    /** 
     * The name of the method to invoke. This is case sensitive.
     **/
    public String getMethod() { return this.method; }
   
    public void setMethod(String method) { 
        this.method = method;
    }
    /** 
     * An object, normally a dictionary or hashtable of the key/value pairs, to be passed as the params for the method being invoked.
     **/
    public Optional<Object> getParameters() { return this.parameters; }
   
    public void setParameters(Optional<Object> parameters) { 
        this.parameters = (parameters == null) ? Optional.<Object>empty() : parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvokeSFApiRequest that = (InvokeSFApiRequest) o;

        return 
            Objects.equals(method, that.method) && 
            Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash( method,parameters );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("method", method);
        map.put("parameters", parameters);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" method : ").append(gson.toJson(method)).append(",");
        if(null != parameters && parameters.isPresent()){
            sb.append(" parameters : ").append(gson.toJson(parameters)).append(",");
        }
        else{
            sb.append(" parameters : ").append("null").append(",");
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
        private String method;
        private Optional<Object> parameters;

        private Builder() { }

        public InvokeSFApiRequest build() {
            return new InvokeSFApiRequest (
                         this.method,
                         this.parameters);
        }

        private InvokeSFApiRequest.Builder buildFrom(final InvokeSFApiRequest req) {
            this.method = req.method;
            this.parameters = req.parameters;

            return this;
        }

        public InvokeSFApiRequest.Builder method(final String method) {
            this.method = method;
            return this;
        }

        public InvokeSFApiRequest.Builder optionalParameters(final Object parameters) {
            this.parameters = (parameters == null) ? Optional.<Object>empty() : Optional.of(parameters);
            return this;
        }

    }
}
