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
 * TestConnectEnsembleRequest  
 * The TestConnectEnsemble API method enables you to verify connectivity with a specified database ensemble. By default, it uses the ensemble for the cluster that the node is associated with. Alternatively, you can provide a different ensemble to test connectivity with.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class TestConnectEnsembleRequest implements Serializable {

    public static final long serialVersionUID = 7568368033329198895L;
    @SerializedName("ensemble") private Optional<String> ensemble;
    // empty constructor
    @Since("7.0")
    public TestConnectEnsembleRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestConnectEnsembleRequest(
        Optional<String> ensemble
    )
    {
        this.ensemble = (ensemble == null) ? Optional.<String>empty() : ensemble;
    }

    /** 
     * Uses a comma-separated list of ensemble node cluster IP addresses to test connectivity. This parameter is optional.
     **/
    public Optional<String> getEnsemble() { return this.ensemble; }
   
    public void setEnsemble(Optional<String> ensemble) { 
        this.ensemble = (ensemble == null) ? Optional.<String>empty() : ensemble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectEnsembleRequest that = (TestConnectEnsembleRequest) o;

        return 
            Objects.equals(ensemble, that.ensemble);
    }

    @Override
    public int hashCode() {
        return Objects.hash( ensemble );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("ensemble", ensemble);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != ensemble && ensemble.isPresent()){
            sb.append(" ensemble : ").append(gson.toJson(ensemble)).append(",");
        }
        else{
            sb.append(" ensemble : ").append("null").append(",");
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
        private Optional<String> ensemble;

        private Builder() { }

        public TestConnectEnsembleRequest build() {
            return new TestConnectEnsembleRequest (
                         this.ensemble);
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
