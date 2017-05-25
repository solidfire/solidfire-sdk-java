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
 * ClusterHardwareInfo  
 **/

public class ClusterHardwareInfo implements Serializable {

    public static final long serialVersionUID = 60420060657659193L;
    @SerializedName("drives") private java.util.Map<String,DriveHardwareInfo> drives;
    @SerializedName("nodes") private java.util.Map<String,Attributes> nodes;
    // empty constructor
    @Since("7.0")
    public ClusterHardwareInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterHardwareInfo(
        java.util.Map<String,DriveHardwareInfo> drives,
        java.util.Map<String,Attributes> nodes
    )
    {
        this.drives = drives;
        this.nodes = nodes;
    }

    /** 
     * 
     **/
    public java.util.Map<String,DriveHardwareInfo> getDrives() { return this.drives; }
    public void setDrives(java.util.Map<String,DriveHardwareInfo> drives) { 
        this.drives = drives;
    }
    /** 
     * 
     **/
    public java.util.Map<String,Attributes> getNodes() { return this.nodes; }
    public void setNodes(java.util.Map<String,Attributes> nodes) { 
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterHardwareInfo that = (ClusterHardwareInfo) o;

        return 
            Objects.equals(drives, that.drives) && 
            Objects.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( drives,nodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        map.put("nodes", nodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(drives).append(",");
        sb.append(" nodes : ").append(nodes).append(",");
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
        private java.util.Map<String,DriveHardwareInfo> drives;
        private java.util.Map<String,Attributes> nodes;

        private Builder() { }

        public ClusterHardwareInfo build() {
            return new ClusterHardwareInfo (
                         this.drives,
                         this.nodes);
        }

        private ClusterHardwareInfo.Builder buildFrom(final ClusterHardwareInfo req) {
            this.drives = req.drives;
            this.nodes = req.nodes;

            return this;
        }

        public ClusterHardwareInfo.Builder drives(final java.util.Map<String,DriveHardwareInfo> drives) {
            this.drives = drives;
            return this;
        }

        public ClusterHardwareInfo.Builder nodes(final java.util.Map<String,Attributes> nodes) {
            this.nodes = nodes;
            return this;
        }

    }
}
