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
 * CreateInitiatorsRequest  
 * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
 * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
 * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
 * any initiators (no partial completion is possible).
 **/

public class CreateInitiatorsRequest implements Serializable {

    public static final long serialVersionUID = 181854535168541170L;
    @SerializedName("initiators") private CreateInitiator[] initiators;
    // empty constructor
    @Since("7.0")
    public CreateInitiatorsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateInitiatorsRequest(
        CreateInitiator[] initiators
    )
    {
        this.initiators = initiators;
    }

    /** 
     * A list of objects containing characteristics of each new initiator. Values are:
     * name: (Required) The name of the initiator (IQN or WWPN) to create.
     * (String)
     * alias: (Optional) The friendly name to assign to this initiator. (String)
     * attributes: (Optional) A set of JSON attributes to assign to this initiator.
     * (JSON Object)
     * volumeAccessGroupID: (Optional) The ID of the volume access group
     * into to which this newly created initiator will be added. (Integer)
     **/
    public CreateInitiator[] getInitiators() { return this.initiators; }
    public void setInitiators(CreateInitiator[] initiators) { 
        this.initiators = initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateInitiatorsRequest that = (CreateInitiatorsRequest) o;

        return 
            Arrays.equals(initiators, that.initiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])initiators );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("initiators", initiators);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" initiators : ").append(Arrays.toString(initiators)).append(",");
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
        private CreateInitiator[] initiators;

        private Builder() { }

        public CreateInitiatorsRequest build() {
            return new CreateInitiatorsRequest (
                         this.initiators);
        }

        private CreateInitiatorsRequest.Builder buildFrom(final CreateInitiatorsRequest req) {
            this.initiators = req.initiators;

            return this;
        }

        public CreateInitiatorsRequest.Builder initiators(final CreateInitiator[] initiators) {
            this.initiators = initiators;
            return this;
        }

    }
}
