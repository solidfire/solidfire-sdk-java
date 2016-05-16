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
 * 
 **/
public class ClusterAdmin implements Serializable {

    private static final long serialVersionUID = -1711157177L;

    private final String[] access;
    private final Long clusterAdminID;
    private final String username;
    private final java.util.Map<String, Object> attributes;

    /**
     * 
     * @param access [required] 
     * @param clusterAdminID [required] 
     * @param username [required] 
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterAdmin(String[] access, Long clusterAdminID, String username, java.util.Map<String, Object> attributes) {
        this.access = access;
        this.clusterAdminID = clusterAdminID;
        this.username = username;
        this.attributes = attributes;
    }

    public String[] getAccess() {
        return this.access;
    }
    public Long getClusterAdminID() {
        return this.clusterAdminID;
    }
    public String getUsername() {
        return this.username;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterAdmin that = (ClusterAdmin) o;
        

        return Objects.deepEquals( access , that.access )
            && Objects.equals( clusterAdminID , that.clusterAdminID )
            && Objects.equals( username , that.username )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( access, clusterAdminID, username, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" access : ").append(Arrays.toString(access)).append(",");
        sb.append(" clusterAdminID : ").append(clusterAdminID).append(",");
        sb.append(" username : ").append(username).append(",");
        sb.append(" attributes : ").append(attributes);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
