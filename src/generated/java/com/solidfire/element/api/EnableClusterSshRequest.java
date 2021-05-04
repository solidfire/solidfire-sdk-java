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
 * EnableClusterSshRequest  
 * Enables SSH on all nodes in the cluster.
 * Overwrites previous duration.
 **/

public class EnableClusterSshRequest implements Serializable {

    public static final long serialVersionUID = 189389526033822992L;
    @SerializedName("duration") private String duration;

    
    // parameterized constructor
    @Since("7.0")
    public EnableClusterSshRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public EnableClusterSshRequest(
        String duration
    )
    {
        this.duration = duration;
    }

    /** 
     * The duration on how long SSH will be enable on the cluster.
     * Follows format "HH:MM:SS.MS".
     **/
    public String getDuration() { return this.duration; }
   
    public void setDuration(String duration) { 
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableClusterSshRequest that = (EnableClusterSshRequest) o;

        return 
            Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash( duration );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("duration", duration);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" duration : ").append(gson.toJson(duration)).append(",");
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
        private String duration;

        private Builder() { }

        public EnableClusterSshRequest build() {
            return new EnableClusterSshRequest (
                         this.duration);
        }

        private EnableClusterSshRequest.Builder buildFrom(final EnableClusterSshRequest req) {
            this.duration = req.duration;

            return this;
        }

        public EnableClusterSshRequest.Builder duration(final String duration) {
            this.duration = duration;
            return this;
        }

    }
}
