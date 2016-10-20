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
 * The object returned by the "ResetDrives" API Service call.
 **/
public class ResetDrivesResult  implements Serializable  {

    private static final long serialVersionUID = -1738633984L;

    @SerializedName("details") private ResetDrivesDetails details;

    /**
     * The object returned by the "ResetDrives" API Service call.
     * @param details [required] Details of drives that are being reset.
     * @since 7.0
     **/
    @Since("7.0")
    public ResetDrivesResult(ResetDrivesDetails details) {
        this.details = details;
    }

    
    /**
     * The object returned by the "ResetDrives" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ResetDrivesResult() {}


    /**
     * Details of drives that are being reset.
     **/
    public ResetDrivesDetails getDetails() {
        return this.details;
    }

    public void setDetails(ResetDrivesDetails details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetDrivesResult that = (ResetDrivesResult) o;
        

        return Objects.equals( details , that.details );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) details );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" details : ").append(details);
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
        private ResetDrivesDetails details;

        private Builder() { }

        public ResetDrivesResult build() {
            return new ResetDrivesResult (
                         this.details            );
        }

        private ResetDrivesResult.Builder buildFrom(final ResetDrivesResult req) {
            this.details = req.details;

            return this;
        }

        public ResetDrivesResult.Builder details(final ResetDrivesDetails details) {
            this.details = details;
            return this;
        }

    }

}
