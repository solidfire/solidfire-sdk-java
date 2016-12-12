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
 * 
 **/

public class IpmiConfig implements Serializable {

    public static final long serialVersionUID = 7651300091358178557L;
    @SerializedName("sensorName") private String sensorName;
    @SerializedName("uniqueSensorID") private String uniqueSensorID;

    // empty constructor
    @Since("7.0")
    public IpmiConfig() {}

    
    // parameterized constructor
    @Since("7.0")
    public IpmiConfig(
        String sensorName,
        String uniqueSensorID
    )
    {
        this.sensorName = sensorName;
        this.uniqueSensorID = uniqueSensorID;
    }

    /** 
     * Name of the sensor that has been found.
     **/
    public String getSensorName() { return this.sensorName; }
    public void setSensorName(String sensorName) { 
        this.sensorName = sensorName;
    }
    /** 
     * Unique identifier for the sensor.
     **/
    public String getUniqueSensorID() { return this.uniqueSensorID; }
    public void setUniqueSensorID(String uniqueSensorID) { 
        this.uniqueSensorID = uniqueSensorID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpmiConfig that = (IpmiConfig) o;

        return 
            Objects.equals(sensorName, that.sensorName) && 
            Objects.equals(uniqueSensorID, that.uniqueSensorID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( sensorName,uniqueSensorID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sensorName", sensorName);
        map.put("uniqueSensorID", uniqueSensorID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" sensorName : ").append(sensorName).append(",");
        sb.append(" uniqueSensorID : ").append(uniqueSensorID).append(",");
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
        private String sensorName;
        private String uniqueSensorID;

        private Builder() { }

        public IpmiConfig build() {
            return new IpmiConfig (
                         this.sensorName,
                         this.uniqueSensorID);
        }

        private IpmiConfig.Builder buildFrom(final IpmiConfig req) {
            this.sensorName = req.sensorName;
            this.uniqueSensorID = req.uniqueSensorID;

            return this;
        }

        public IpmiConfig.Builder sensorName(final String sensorName) {
            this.sensorName = sensorName;
            return this;
        }

        public IpmiConfig.Builder uniqueSensorID(final String uniqueSensorID) {
            this.uniqueSensorID = uniqueSensorID;
            return this;
        }

    }
}
