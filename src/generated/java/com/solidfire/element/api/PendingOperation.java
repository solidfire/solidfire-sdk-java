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
 * PendingOperation  
 **/

public class PendingOperation implements Serializable {

    public static final long serialVersionUID = -5193813814227585742L;
    @SerializedName("pending") private Boolean pending;
    @SerializedName("operation") private String operation;
    // empty constructor
    @Since("7.0")
    public PendingOperation() {}

    
    // parameterized constructor
    @Since("7.0")
    public PendingOperation(
        Boolean pending,
        String operation
    )
    {
        this.pending = pending;
        this.operation = operation;
    }

    /** 
     * true: operation is still in progress.
     * false: operation is no integerer in progress.
     **/
    public Boolean getPending() { return this.pending; }
    public void setPending(Boolean pending) { 
        this.pending = pending;
    }
    /** 
     * Name of operation that is in progress or has completed.
     **/
    public String getOperation() { return this.operation; }
    public void setOperation(String operation) { 
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingOperation that = (PendingOperation) o;

        return 
            Objects.equals(pending, that.pending) && 
            Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash( pending,operation );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pending", pending);
        map.put("operation", operation);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pending : ").append(pending).append(",");
        sb.append(" operation : ").append(operation).append(",");
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
        private Boolean pending;
        private String operation;

        private Builder() { }

        public PendingOperation build() {
            return new PendingOperation (
                         this.pending,
                         this.operation);
        }

        private PendingOperation.Builder buildFrom(final PendingOperation req) {
            this.pending = req.pending;
            this.operation = req.operation;

            return this;
        }

        public PendingOperation.Builder pending(final Boolean pending) {
            this.pending = pending;
            return this;
        }

        public PendingOperation.Builder operation(final String operation) {
            this.operation = operation;
            return this;
        }

    }
}
