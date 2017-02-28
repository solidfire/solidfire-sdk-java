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
 * ListUtilitiesResult  
 **/

public class ListUtilitiesResult implements Serializable {

    public static final long serialVersionUID = 7811487745346679708L;
    @SerializedName("utilities") private java.util.Map<String, Object> utilities;

    // empty constructor
    @Since("7.0")
    public ListUtilitiesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListUtilitiesResult(
        java.util.Map<String, Object> utilities
    )
    {
        this.utilities = utilities;
    }

    /** 
     * List of utilities currently available to run on the node.
     **/
    public java.util.Map<String, Object> getUtilities() { return this.utilities; }
    public void setUtilities(java.util.Map<String, Object> utilities) { 
        this.utilities = utilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListUtilitiesResult that = (ListUtilitiesResult) o;

        return 
            Objects.equals(utilities, that.utilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash( utilities );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("utilities", utilities);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" utilities : ").append(utilities).append(",");
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
        private java.util.Map<String, Object> utilities;

        private Builder() { }

        public ListUtilitiesResult build() {
            return new ListUtilitiesResult (
                         this.utilities);
        }

        private ListUtilitiesResult.Builder buildFrom(final ListUtilitiesResult req) {
            this.utilities = req.utilities;

            return this;
        }

        public ListUtilitiesResult.Builder utilities(final java.util.Map<String, Object> utilities) {
            this.utilities = utilities;
            return this;
        }

    }
}
