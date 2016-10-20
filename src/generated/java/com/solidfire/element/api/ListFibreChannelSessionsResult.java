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
 * Used to return information about the Fibre Channel sessions.
 **/
public class ListFibreChannelSessionsResult  implements Serializable  {

    private static final long serialVersionUID = 1385337796L;

    @SerializedName("sessions") private FibreChannelSession[] sessions;

    /**
     * Used to return information about the Fibre Channel sessions.
     * @param sessions [required] A list of FibreChannelSession objects with information about the Fibre Channel session.
     * @since 7.0
     **/
    @Since("7.0")
    public ListFibreChannelSessionsResult(FibreChannelSession[] sessions) {
        this.sessions = sessions;
    }

    
    /**
     * Used to return information about the Fibre Channel sessions.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListFibreChannelSessionsResult() {}


    /**
     * A list of FibreChannelSession objects with information about the Fibre Channel session.
     **/
    public FibreChannelSession[] getSessions() {
        return this.sessions;
    }

    public void setSessions(FibreChannelSession[] sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListFibreChannelSessionsResult that = (ListFibreChannelSessionsResult) o;
        

        return Objects.deepEquals( sessions , that.sessions );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) sessions );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" sessions : ").append(Arrays.toString(sessions));
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
        private FibreChannelSession[] sessions;

        private Builder() { }

        public ListFibreChannelSessionsResult build() {
            return new ListFibreChannelSessionsResult (
                         this.sessions            );
        }

        private ListFibreChannelSessionsResult.Builder buildFrom(final ListFibreChannelSessionsResult req) {
            this.sessions = req.sessions;

            return this;
        }

        public ListFibreChannelSessionsResult.Builder sessions(final FibreChannelSession[] sessions) {
            this.sessions = sessions;
            return this;
        }

    }

}
