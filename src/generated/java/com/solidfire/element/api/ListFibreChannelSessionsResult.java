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
 * ListFibreChannelSessionsResult  
 * Used to return information about the Fibre Channel sessions.
 **/

public class ListFibreChannelSessionsResult implements Serializable {

    public static final long serialVersionUID = -122152116909046325L;
    @SerializedName("sessions") private FibreChannelSession[] sessions;

    // empty constructor
    @Since("7.0")
    public ListFibreChannelSessionsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListFibreChannelSessionsResult(
        FibreChannelSession[] sessions
    )
    {
        this.sessions = sessions;
    }

    /** 
     * A list of FibreChannelSession objects with information about the Fibre Channel session.
     **/
    public FibreChannelSession[] getSessions() { return this.sessions; }
    public void setSessions(FibreChannelSession[] sessions) { 
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListFibreChannelSessionsResult that = (ListFibreChannelSessionsResult) o;

        return 
            Arrays.equals(sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])sessions );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sessions", sessions);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" sessions : ").append(Arrays.toString(sessions)).append(",");
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
                         this.sessions);
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
