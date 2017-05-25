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
 * ResetNodeRequest  
 * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
 * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
 * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
 * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
 * cluster, or in a "Pending" state.
 * Caution: This method clears any data that is on the node. Exercise caution when using this method.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class ResetNodeRequest implements Serializable {

    public static final long serialVersionUID = 7128536831319380737L;
    @SerializedName("build") private String build;
    @SerializedName("force") private Boolean force;
    // empty constructor
    @Since("7.0")
    public ResetNodeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeRequest(
        String build,
        Boolean force
    )
    {
        this.build = build;
        this.force = force;
    }

    /** 
     * Specifies the URL to a remote Element software image to which the node will
     * be reset.
     **/
    public String getBuild() { return this.build; }
    public void setBuild(String build) { 
        this.build = build;
    }
    /** 
     * Required parameter to successfully reset the node.
     **/
    public Boolean getForce() { return this.force; }
    public void setForce(Boolean force) { 
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeRequest that = (ResetNodeRequest) o;

        return 
            Objects.equals(build, that.build) && 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( build,force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("build", build);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" build : ").append(build).append(",");
        sb.append(" force : ").append(force).append(",");
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
        private String build;
        private Boolean force;

        private Builder() { }

        public ResetNodeRequest build() {
            return new ResetNodeRequest (
                         this.build,
                         this.force);
        }

        private ResetNodeRequest.Builder buildFrom(final ResetNodeRequest req) {
            this.build = req.build;
            this.force = req.force;

            return this;
        }

        public ResetNodeRequest.Builder build(final String build) {
            this.build = build;
            return this;
        }

        public ResetNodeRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

    }
}
