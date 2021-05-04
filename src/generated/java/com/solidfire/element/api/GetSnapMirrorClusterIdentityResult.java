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
 * GetSnapMirrorClusterIdentityResult  
 **/

public class GetSnapMirrorClusterIdentityResult implements Serializable {

    public static final long serialVersionUID = 4007147254632303833L;
    @SerializedName("snapMirrorClusterIdentity") private SnapMirrorClusterIdentity[] snapMirrorClusterIdentity;

    
    // parameterized constructor
    @Since("7.0")
    public GetSnapMirrorClusterIdentityResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetSnapMirrorClusterIdentityResult(
        SnapMirrorClusterIdentity[] snapMirrorClusterIdentity
    )
    {
        this.snapMirrorClusterIdentity = snapMirrorClusterIdentity;
    }

    /** 
     * A list of cluster identities of SnapMirror endpoints.
     **/
    public SnapMirrorClusterIdentity[] getSnapMirrorClusterIdentity() { return this.snapMirrorClusterIdentity; }
   
    public void setSnapMirrorClusterIdentity(SnapMirrorClusterIdentity[] snapMirrorClusterIdentity) { 
        this.snapMirrorClusterIdentity = snapMirrorClusterIdentity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnapMirrorClusterIdentityResult that = (GetSnapMirrorClusterIdentityResult) o;

        return 
            Arrays.equals(snapMirrorClusterIdentity, that.snapMirrorClusterIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorClusterIdentity );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorClusterIdentity", snapMirrorClusterIdentity);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorClusterIdentity : ").append(gson.toJson(Arrays.toString(snapMirrorClusterIdentity))).append(",");
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
        private SnapMirrorClusterIdentity[] snapMirrorClusterIdentity;

        private Builder() { }

        public GetSnapMirrorClusterIdentityResult build() {
            return new GetSnapMirrorClusterIdentityResult (
                         this.snapMirrorClusterIdentity);
        }

        private GetSnapMirrorClusterIdentityResult.Builder buildFrom(final GetSnapMirrorClusterIdentityResult req) {
            this.snapMirrorClusterIdentity = req.snapMirrorClusterIdentity;

            return this;
        }

        public GetSnapMirrorClusterIdentityResult.Builder snapMirrorClusterIdentity(final SnapMirrorClusterIdentity[] snapMirrorClusterIdentity) {
            this.snapMirrorClusterIdentity = snapMirrorClusterIdentity;
            return this;
        }

    }
}
