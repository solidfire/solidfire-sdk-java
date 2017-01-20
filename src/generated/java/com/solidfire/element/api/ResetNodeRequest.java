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
 * ResetNodeRequest  
 **/

public class ResetNodeRequest implements Serializable {

    public static final long serialVersionUID = -3281362872931300381L;
    @SerializedName("build") private String build;
    @SerializedName("force") private Boolean force;
    @SerializedName("option") private String option;

    // empty constructor
    @Since("7.0")
    public ResetNodeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeRequest(
        String build,
        Boolean force,
        String option
    )
    {
        this.build = build;
        this.force = force;
        this.option = option;
    }

    /** 
     * Used to specify the URL to a remote Element software image to which the node will be reset.
     **/
    public String getBuild() { return this.build; }
    public void setBuild(String build) { 
        this.build = build;
    }
    /** 
     * The force parameter must be included in order to successfully reset the node.
     **/
    public Boolean getForce() { return this.force; }
    public void setForce(Boolean force) { 
        this.force = force;
    }
    /** 
     * Used to enter specifications for running the reset operation.
     **/
    public String getOption() { return this.option; }
    public void setOption(String option) { 
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeRequest that = (ResetNodeRequest) o;

        return 
            Objects.equals(build, that.build) && 
            Objects.equals(force, that.force) && 
            Objects.equals(option, that.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash( build,force,option );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("build", build);
        map.put("force", force);
        map.put("option", option);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" build : ").append(build).append(",");
        sb.append(" force : ").append(force).append(",");
        sb.append(" option : ").append(option).append(",");
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
        private String option;

        private Builder() { }

        public ResetNodeRequest build() {
            return new ResetNodeRequest (
                         this.build,
                         this.force,
                         this.option);
        }

        private ResetNodeRequest.Builder buildFrom(final ResetNodeRequest req) {
            this.build = req.build;
            this.force = req.force;
            this.option = req.option;

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

        public ResetNodeRequest.Builder option(final String option) {
            this.option = option;
            return this;
        }

    }
}
