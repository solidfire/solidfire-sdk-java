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
 * The object returned by the "GetClusterVersionInfo" API Service call.
 **/
public class GetClusterVersionInfoResult implements Serializable {

    private static final long serialVersionUID = -1298741947L;

    private final String clusterAPIVersion;
    private final String clusterVersion;
    private final ClusterVersionInfo[] clusterVersionInfo;
    private final SoftwareVersionInfo softwareVersionInfo;

    /**
     * The object returned by the "GetClusterVersionInfo" API Service call.
     * @param clusterAPIVersion [required] 
     * @param clusterVersion [required] 
     * @param clusterVersionInfo [required] 
     * @param softwareVersionInfo [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public GetClusterVersionInfoResult(String clusterAPIVersion, String clusterVersion, ClusterVersionInfo[] clusterVersionInfo, SoftwareVersionInfo softwareVersionInfo) {
        this.clusterAPIVersion = clusterAPIVersion;
        this.clusterVersion = clusterVersion;
        this.clusterVersionInfo = clusterVersionInfo;
        this.softwareVersionInfo = softwareVersionInfo;
    }

    public String getClusterAPIVersion() {
        return this.clusterAPIVersion;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }
    public ClusterVersionInfo[] getClusterVersionInfo() {
        return this.clusterVersionInfo;
    }
    public SoftwareVersionInfo getSoftwareVersionInfo() {
        return this.softwareVersionInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterVersionInfoResult that = (GetClusterVersionInfoResult) o;
        

        return Objects.equals( clusterAPIVersion , that.clusterAPIVersion )
            && Objects.equals( clusterVersion , that.clusterVersion )
            && Objects.deepEquals( clusterVersionInfo , that.clusterVersionInfo )
            && Objects.equals( softwareVersionInfo , that.softwareVersionInfo );
    }

    @Override
    public int hashCode() {

        return Objects.hash( clusterAPIVersion, clusterVersion, clusterVersionInfo, softwareVersionInfo );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterAPIVersion : ").append(clusterAPIVersion).append(",");
        sb.append(" clusterVersion : ").append(clusterVersion).append(",");
        sb.append(" clusterVersionInfo : ").append(Arrays.toString(clusterVersionInfo)).append(",");
        sb.append(" softwareVersionInfo : ").append(softwareVersionInfo);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
