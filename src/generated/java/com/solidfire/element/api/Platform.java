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
public class Platform implements Serializable {

    private static final long serialVersionUID = -101533838L;

    private final String nodeType;
    private final String chassisType;
    private final String cpuModel;
    private final Long nodeMemoryGB;

    /**
     * 
     * @param nodeType [required] SolidFire&#39;s name for this platform.
     * @param chassisType [required] Name of the chassis (example: &quot;R620&quot;).
     * @param cpuModel [required] The model of CPU used on this platform.
     * @param nodeMemoryGB [required] The amount of memory on this platform in GiB.
     * @since 7.0
     **/
    @Since("7.0")
    public Platform(String nodeType, String chassisType, String cpuModel, Long nodeMemoryGB) {
        this.nodeType = nodeType;
        this.chassisType = chassisType;
        this.cpuModel = cpuModel;
        this.nodeMemoryGB = nodeMemoryGB;
    }


    /**
     * SolidFire&#39;s name for this platform.
     **/
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * Name of the chassis (example: &quot;R620&quot;).
     **/
    public String getChassisType() {
        return this.chassisType;
    }

    /**
     * The model of CPU used on this platform.
     **/
    public String getCpuModel() {
        return this.cpuModel;
    }

    /**
     * The amount of memory on this platform in GiB.
     **/
    public Long getNodeMemoryGB() {
        return this.nodeMemoryGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Platform that = (Platform) o;
        

        return Objects.equals( nodeType , that.nodeType )
            && Objects.equals( chassisType , that.chassisType )
            && Objects.equals( cpuModel , that.cpuModel )
            && Objects.equals( nodeMemoryGB , that.nodeMemoryGB );
    }

    @Override
    public int hashCode() {

        return Objects.hash( nodeType, chassisType, cpuModel, nodeMemoryGB );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeType : ").append(nodeType).append(",");
        sb.append(" chassisType : ").append(chassisType).append(",");
        sb.append(" cpuModel : ").append(cpuModel).append(",");
        sb.append(" nodeMemoryGB : ").append(nodeMemoryGB);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
