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
public class SnmpNetwork implements Serializable {

    private static final long serialVersionUID = -901085912L;

    @SerializedName("access") private final String access;
    @SerializedName("cidr") private final Long cidr;
    @SerializedName("community") private final String community;
    @SerializedName("network") private final String network;

    /**
     * 
     * @param access [required] 
     * @param cidr [required] 
     * @param community [required] 
     * @param network [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public SnmpNetwork(String access, Long cidr, String community, String network) {
        this.access = access;
        this.cidr = cidr;
        this.community = community;
        this.network = network;
    }

    public String getAccess() {
        return this.access;
    }
    public Long getCidr() {
        return this.cidr;
    }
    public String getCommunity() {
        return this.community;
    }
    public String getNetwork() {
        return this.network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpNetwork that = (SnmpNetwork) o;
        

        return Objects.equals( access , that.access )
            && Objects.equals( cidr , that.cidr )
            && Objects.equals( community , that.community )
            && Objects.equals( network , that.network );
    }

    @Override
    public int hashCode() {
        return Objects.hash( access, cidr, community, network );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" access : ").append(access).append(",");
        sb.append(" cidr : ").append(cidr).append(",");
        sb.append(" community : ").append(community).append(",");
        sb.append(" network : ").append(network);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
