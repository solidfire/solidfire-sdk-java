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
 * SoftwareVersionInfo  
 **/

public class SoftwareVersionInfo implements Serializable {

    public static final long serialVersionUID = -4210356135559607214L;
    @SerializedName("currentVersion") private String currentVersion;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("packageName") private String packageName;
    @SerializedName("pendingVersion") private String pendingVersion;
    @SerializedName("startTime") private String startTime;

    // empty constructor
    @Since("7.0")
    public SoftwareVersionInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public SoftwareVersionInfo(
        String currentVersion,
        Long nodeID,
        String packageName,
        String pendingVersion,
        String startTime
    )
    {
        this.currentVersion = currentVersion;
        this.nodeID = nodeID;
        this.packageName = packageName;
        this.pendingVersion = pendingVersion;
        this.startTime = startTime;
    }

    /** 
     **/
    public String getCurrentVersion() { return this.currentVersion; }
    public void setCurrentVersion(String currentVersion) { 
        this.currentVersion = currentVersion;
    }
    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public String getPackageName() { return this.packageName; }
    public void setPackageName(String packageName) { 
        this.packageName = packageName;
    }
    /** 
     **/
    public String getPendingVersion() { return this.pendingVersion; }
    public void setPendingVersion(String pendingVersion) { 
        this.pendingVersion = pendingVersion;
    }
    /** 
     **/
    public String getStartTime() { return this.startTime; }
    public void setStartTime(String startTime) { 
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SoftwareVersionInfo that = (SoftwareVersionInfo) o;

        return 
            Objects.equals(currentVersion, that.currentVersion) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(packageName, that.packageName) && 
            Objects.equals(pendingVersion, that.pendingVersion) && 
            Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash( currentVersion,nodeID,packageName,pendingVersion,startTime );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("currentVersion", currentVersion);
        map.put("nodeID", nodeID);
        map.put("packageName", packageName);
        map.put("pendingVersion", pendingVersion);
        map.put("startTime", startTime);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" currentVersion : ").append(currentVersion).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" packageName : ").append(packageName).append(",");
        sb.append(" pendingVersion : ").append(pendingVersion).append(",");
        sb.append(" startTime : ").append(startTime).append(",");
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
        private String currentVersion;
        private Long nodeID;
        private String packageName;
        private String pendingVersion;
        private String startTime;

        private Builder() { }

        public SoftwareVersionInfo build() {
            return new SoftwareVersionInfo (
                         this.currentVersion,
                         this.nodeID,
                         this.packageName,
                         this.pendingVersion,
                         this.startTime);
        }

        private SoftwareVersionInfo.Builder buildFrom(final SoftwareVersionInfo req) {
            this.currentVersion = req.currentVersion;
            this.nodeID = req.nodeID;
            this.packageName = req.packageName;
            this.pendingVersion = req.pendingVersion;
            this.startTime = req.startTime;

            return this;
        }

        public SoftwareVersionInfo.Builder currentVersion(final String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public SoftwareVersionInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public SoftwareVersionInfo.Builder packageName(final String packageName) {
            this.packageName = packageName;
            return this;
        }

        public SoftwareVersionInfo.Builder pendingVersion(final String pendingVersion) {
            this.pendingVersion = pendingVersion;
            return this;
        }

        public SoftwareVersionInfo.Builder startTime(final String startTime) {
            this.startTime = startTime;
            return this;
        }

    }
}
