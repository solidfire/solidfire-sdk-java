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

import com.google.gson.annotations.SerializedName;
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
 * The object returned by the "SnmpSendTestTraps" API Service call.
 **/
public class SnmpSendTestTrapsResult implements Serializable {

    private static final long serialVersionUID = -612076391L;

    @SerializedName("status") private final String status;

    /**
     * The object returned by the "SnmpSendTestTraps" API Service call.
     * @param status [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public SnmpSendTestTrapsResult(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpSendTestTrapsResult that = (SnmpSendTestTrapsResult) o;
        

        return Objects.equals( status , that.status );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) status );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" status : ").append(status);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private String status;

        private Builder() { }

        public SnmpSendTestTrapsResult build() {
            return new SnmpSendTestTrapsResult (
                         this.status            );
        }

        private SnmpSendTestTrapsResult.Builder buildFrom(final SnmpSendTestTrapsResult req) {
            this.status = req.status;

            return this;
        }

        public SnmpSendTestTrapsResult.Builder status(final String status) {
            this.status = status;
            return this;
        }

    }

}
