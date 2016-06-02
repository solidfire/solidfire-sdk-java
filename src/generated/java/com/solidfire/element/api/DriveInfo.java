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
public class DriveInfo implements Serializable {

    private static final long serialVersionUID = 1437117328L;

    @SerializedName("capacity") private final Long capacity;
    @SerializedName("driveID") private final Long driveID;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("serial") private final String serial;
    @SerializedName("slot") private final Long slot;
    @SerializedName("status") private final String status;
    @SerializedName("type") private final String type;
    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;

    /**
     * 
     * @param capacity [required] Total capacity of the drive, in bytes.
     * @param driveID [required] DriveID for this drive.
     * @param nodeID [required] NodeID where this drive is located.
     * @param serial [required] Drive serial number.
     * @param slot [required] Slot number in the server chassis where this drive is located, or -1 if SATADimm used for internal metadata drive.
     * @param status [required] 
     * @param type [required] 
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public DriveInfo(Long capacity, Long driveID, Long nodeID, String serial, Long slot, String status, String type, java.util.Map<String, Object> attributes) {
        this.serial = serial;
        this.attributes = attributes;
        this.status = status;
        this.driveID = driveID;
        this.type = type;
        this.nodeID = nodeID;
        this.slot = slot;
        this.capacity = capacity;
    }


    /**
     * Total capacity of the drive, in bytes.
     **/
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * DriveID for this drive.
     **/
    public Long getDriveID() {
        return this.driveID;
    }

    /**
     * NodeID where this drive is located.
     **/
    public Long getNodeID() {
        return this.nodeID;
    }

    /**
     * Drive serial number.
     **/
    public String getSerial() {
        return this.serial;
    }

    /**
     * Slot number in the server chassis where this drive is located, or -1 if SATADimm used for internal metadata drive.
     **/
    public Long getSlot() {
        return this.slot;
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
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

        DriveInfo that = (DriveInfo) o;
        

        return Objects.equals( capacity , that.capacity )
            && Objects.equals( driveID , that.driveID )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( serial , that.serial )
            && Objects.equals( slot , that.slot )
            && Objects.equals( status , that.status )
            && Objects.equals( type , that.type )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( capacity, driveID, nodeID, serial, slot, status, type, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" capacity : ").append(capacity).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" slot : ").append(slot).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" type : ").append(type).append(",");
        sb.append(" attributes : ").append(attributes);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
