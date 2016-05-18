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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * 
 **/
public class SoftwareVersionInfo implements Serializable {

    private static final long serialVersionUID = 394663535L;

    @SerializedName("currentVersion") private final String currentVersion;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("packageName") private final String packageName;
    @SerializedName("pendingVersion") private final String pendingVersion;
    @SerializedName("startTime") private final String startTime;

    /**
     * 
     * @param currentVersion [required] 
     * @param nodeID [required] 
     * @param packageName [required] 
     * @param pendingVersion [required] 
     * @param startTime [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public SoftwareVersionInfo(String currentVersion, Long nodeID, String packageName, String pendingVersion, String startTime) {
        this.startTime = startTime;
        this.pendingVersion = pendingVersion;
        this.packageName = packageName;
        this.nodeID = nodeID;
        this.currentVersion = currentVersion;
    }

    public String getCurrentVersion() {
        return this.currentVersion;
    }
    public Long getNodeID() {
        return this.nodeID;
    }
    public String getPackageName() {
        return this.packageName;
    }
    public String getPendingVersion() {
        return this.pendingVersion;
    }
    public String getStartTime() {
        return this.startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SoftwareVersionInfo that = (SoftwareVersionInfo) o;
        

        return Objects.equals( currentVersion , that.currentVersion )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( packageName , that.packageName )
            && Objects.equals( pendingVersion , that.pendingVersion )
            && Objects.equals( startTime , that.startTime );
    }

    @Override
    public int hashCode() {
        return Objects.hash( currentVersion, nodeID, packageName, pendingVersion, startTime );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" currentVersion : ").append(currentVersion).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" packageName : ").append(packageName).append(",");
        sb.append(" pendingVersion : ").append(pendingVersion).append(",");
        sb.append(" startTime : ").append(startTime);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
