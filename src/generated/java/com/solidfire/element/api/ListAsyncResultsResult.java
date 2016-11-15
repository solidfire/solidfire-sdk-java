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
 * 
 **/

public class ListAsyncResultsResult implements Serializable {

    public static final long serialVersionUID = 6710724792487524511L;
    @SerializedName("asyncHandles") private AsyncHandle[] asyncHandles;

    // empty constructor
    @Since("7.0")
    public ListAsyncResultsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListAsyncResultsResult(
        AsyncHandle[] asyncHandles
    )
    {
        this.asyncHandles = asyncHandles;
    }

    /** 
     * An array of serialized asynchronous method results.
     **/
    public AsyncHandle[] getAsyncHandles() { return this.asyncHandles; }
    public void setAsyncHandles(AsyncHandle[] asyncHandles) { 
        this.asyncHandles = asyncHandles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAsyncResultsResult that = (ListAsyncResultsResult) o;
        return 
            Objects.equals(asyncHandles, that.asyncHandles);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])asyncHandles );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncHandles", asyncHandles);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" asyncHandles : ").append(Arrays.toString(asyncHandles)).append(",");
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
        private AsyncHandle[] asyncHandles;

        private Builder() { }

        public ListAsyncResultsResult build() {
            return new ListAsyncResultsResult (
                         this.asyncHandles);
        }

        private ListAsyncResultsResult.Builder buildFrom(final ListAsyncResultsResult req) {
            this.asyncHandles = req.asyncHandles;

            return this;
        }

        public ListAsyncResultsResult.Builder asyncHandles(final AsyncHandle[] asyncHandles) {
            this.asyncHandles = asyncHandles;
            return this;
        }

    }
}
