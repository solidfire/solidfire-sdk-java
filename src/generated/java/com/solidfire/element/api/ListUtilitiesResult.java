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
 * The object returned by the "ListUtilities" API Service call.
 **/
public class ListUtilitiesResult  implements Serializable  {

    private static final long serialVersionUID = -1625897097L;

    @SerializedName("utilities") private String[] utilities;

    /**
     * The object returned by the "ListUtilities" API Service call.
     * @param utilities [required] List of utilities currently available to run on the node.
     * @since 7.0
     **/
    @Since("7.0")
    public ListUtilitiesResult(String[] utilities) {
        this.utilities = utilities;
    }

    
    /**
     * The object returned by the "ListUtilities" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListUtilitiesResult() {}


    /**
     * List of utilities currently available to run on the node.
     **/
    public String[] getUtilities() {
        return this.utilities;
    }

    public void setUtilities(String[] utilities) {
        this.utilities = utilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListUtilitiesResult that = (ListUtilitiesResult) o;
        

        return Objects.deepEquals( utilities , that.utilities );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) utilities );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" utilities : ").append(Arrays.toString(utilities));
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
        private String[] utilities;

        private Builder() { }

        public ListUtilitiesResult build() {
            return new ListUtilitiesResult (
                         this.utilities            );
        }

        private ListUtilitiesResult.Builder buildFrom(final ListUtilitiesResult req) {
            this.utilities = req.utilities;

            return this;
        }

        public ListUtilitiesResult.Builder utilities(final String[] utilities) {
            this.utilities = utilities;
            return this;
        }

    }

}
