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
 * GetPendingOperationResult  
 **/

public class GetPendingOperationResult implements Serializable {

    public static final long serialVersionUID = -8676903301719004010L;
    @SerializedName("pendingOperation") private PendingOperation pendingOperation;

    // empty constructor
    @Since("7.0")
    public GetPendingOperationResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetPendingOperationResult(
        PendingOperation pendingOperation
    )
    {
        this.pendingOperation = pendingOperation;
    }

    /** 
     * 
     **/
    public PendingOperation getPendingOperation() { return this.pendingOperation; }
    public void setPendingOperation(PendingOperation pendingOperation) { 
        this.pendingOperation = pendingOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetPendingOperationResult that = (GetPendingOperationResult) o;

        return 
            Objects.equals(pendingOperation, that.pendingOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash( pendingOperation );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pendingOperation", pendingOperation);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pendingOperation : ").append(pendingOperation).append(",");
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
        private PendingOperation pendingOperation;

        private Builder() { }

        public GetPendingOperationResult build() {
            return new GetPendingOperationResult (
                         this.pendingOperation);
        }

        private GetPendingOperationResult.Builder buildFrom(final GetPendingOperationResult req) {
            this.pendingOperation = req.pendingOperation;

            return this;
        }

        public GetPendingOperationResult.Builder pendingOperation(final PendingOperation pendingOperation) {
            this.pendingOperation = pendingOperation;
            return this;
        }

    }
}
