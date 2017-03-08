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
 * ListInitiatorsRequest  
 * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
 **/

public class ListInitiatorsRequest implements Serializable {

    public static final long serialVersionUID = -4434314446707155324L;
    @SerializedName("startInitiatorID") private Optional<Long> startInitiatorID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("initiators") private Optional<Long[]> initiators;

    // empty constructor
    @Since("7.0")
    public ListInitiatorsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListInitiatorsRequest(
        Optional<Long> startInitiatorID,
        Optional<Long> limit,
        Optional<Long[]> initiators
    )
    {
        this.startInitiatorID = (startInitiatorID == null) ? Optional.<Long>empty() : startInitiatorID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.initiators = (initiators == null) ? Optional.<Long[]>empty() : initiators;
    }

    /** 
     * The initiator ID at which to begin the listing. You can supply this parameter or the "initiators" parameter, but not both.
     **/
    public Optional<Long> getStartInitiatorID() { return this.startInitiatorID; }
    public void setStartInitiatorID(Optional<Long> startInitiatorID) { 
        this.startInitiatorID = (startInitiatorID == null) ? Optional.<Long>empty() : startInitiatorID;
    }
    /** 
     * The maximum number of initiator objects to return.
     **/
    public Optional<Long> getLimit() { return this.limit; }
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * A list of initiator IDs to retrieve. You can supply this parameter or the "startInitiatorID" parameter, but not both.
     **/
    public Optional<Long[]> getInitiators() { return this.initiators; }
    public void setInitiators(Optional<Long[]> initiators) { 
        this.initiators = (initiators == null) ? Optional.<Long[]>empty() : initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListInitiatorsRequest that = (ListInitiatorsRequest) o;

        return 
            Objects.equals(startInitiatorID, that.startInitiatorID) && 
            Objects.equals(limit, that.limit) && 
            Objects.equals(initiators, that.initiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startInitiatorID,limit,initiators );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startInitiatorID", startInitiatorID);
        map.put("limit", limit);
        map.put("initiators", initiators);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startInitiatorID && startInitiatorID.isPresent()){
            sb.append(" startInitiatorID : ").append(startInitiatorID).append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(limit).append(",");
        }
        if(null != initiators && initiators.isPresent()){
            sb.append(" initiators : ").append(initiators).append(",");
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
        private Optional<Long> startInitiatorID;
        private Optional<Long> limit;
        private Optional<Long[]> initiators;

        private Builder() { }

        public ListInitiatorsRequest build() {
            return new ListInitiatorsRequest (
                         this.startInitiatorID,
                         this.limit,
                         this.initiators);
        }

        private ListInitiatorsRequest.Builder buildFrom(final ListInitiatorsRequest req) {
            this.startInitiatorID = req.startInitiatorID;
            this.limit = req.limit;
            this.initiators = req.initiators;

            return this;
        }

        public ListInitiatorsRequest.Builder optionalStartInitiatorID(final Long startInitiatorID) {
            this.startInitiatorID = (startInitiatorID == null) ? Optional.<Long>empty() : Optional.of(startInitiatorID);
            return this;
        }

        public ListInitiatorsRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

        public ListInitiatorsRequest.Builder optionalInitiators(final Long[] initiators) {
            this.initiators = (initiators == null) ? Optional.<Long[]>empty() : Optional.of(initiators);
            return this;
        }

    }
}
