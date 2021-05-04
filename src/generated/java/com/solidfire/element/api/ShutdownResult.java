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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ShutdownResult  
 **/

public class ShutdownResult implements Serializable {

    public static final long serialVersionUID = -1967511696948674145L;
    @SerializedName("failed") private Long[] failed;
    @SerializedName("successful") private Long[] successful;
    // empty constructor
    @Since("7.0")
    public ShutdownResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ShutdownResult(
        Long[] failed,
        Long[] successful
    )
    {
        this.failed = failed;
        this.successful = successful;
    }

    /** 
     * 
     **/
    public Long[] getFailed() { return this.failed; }
   
    public void setFailed(Long[] failed) { 
        this.failed = failed;
    }
    /** 
     * 
     **/
    public Long[] getSuccessful() { return this.successful; }
   
    public void setSuccessful(Long[] successful) { 
        this.successful = successful;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShutdownResult that = (ShutdownResult) o;

        return 
            Arrays.equals(failed, that.failed) && 
            Arrays.equals(successful, that.successful);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])failed,(Object[])successful );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("failed", failed);
        map.put("successful", successful);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" failed : ").append(gson.toJson(Arrays.toString(failed))).append(",");
        sb.append(" successful : ").append(gson.toJson(Arrays.toString(successful))).append(",");
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
        private Long[] failed;
        private Long[] successful;

        private Builder() { }

        public ShutdownResult build() {
            return new ShutdownResult (
                         this.failed,
                         this.successful);
        }

        private ShutdownResult.Builder buildFrom(final ShutdownResult req) {
            this.failed = req.failed;
            this.successful = req.successful;

            return this;
        }

        public ShutdownResult.Builder failed(final Long[] failed) {
            this.failed = failed;
            return this;
        }

        public ShutdownResult.Builder successful(final Long[] successful) {
            this.successful = successful;
            return this;
        }

    }
}
