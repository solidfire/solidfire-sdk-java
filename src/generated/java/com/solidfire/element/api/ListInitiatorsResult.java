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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ListInitiatorsResult  
 **/

public class ListInitiatorsResult implements Serializable {

    public static final long serialVersionUID = -5386916742687098840L;
    @SerializedName("initiators") private Initiator[] initiators;

    // empty constructor
    @Since("7.0")
    public ListInitiatorsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListInitiatorsResult(
        Initiator[] initiators
    )
    {
        this.initiators = initiators;
    }

    /** 
     * List of the initiator information.
     **/
    public Initiator[] getInitiators() { return this.initiators; }
    public void setInitiators(Initiator[] initiators) { 
        this.initiators = initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListInitiatorsResult that = (ListInitiatorsResult) o;

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
        private Initiator[] initiators;

        private Builder() { }

        public ListInitiatorsResult build() {
            return new ListInitiatorsResult (
                         this.initiators);
        }

        private ListInitiatorsResult.Builder buildFrom(final ListInitiatorsResult req) {
            this.initiators = req.initiators;

            return this;
        }

        public ListInitiatorsResult.Builder initiators(final Initiator[] initiators) {
            this.initiators = initiators;
            return this;
        }

    }
}
