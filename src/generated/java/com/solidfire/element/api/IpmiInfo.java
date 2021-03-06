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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * IpmiInfo  
 **/

public class IpmiInfo implements Serializable {

    public static final long serialVersionUID = 2521421710751029473L;
    @SerializedName("sensors") private Attributes[] sensors;
    // empty constructor
    @Since("7.0")
    public IpmiInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public IpmiInfo(
        Attributes[] sensors
    )
    {
        this.sensors = sensors;
    }

    /** 
     * 
     **/
    public Attributes[] getSensors() { return this.sensors; }
   
    public void setSensors(Attributes[] sensors) { 
        this.sensors = sensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpmiInfo that = (IpmiInfo) o;

        return 
            Arrays.equals(sensors, that.sensors);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])sensors );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sensors", sensors);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" sensors : ").append(gson.toJson(Arrays.toString(sensors))).append(",");
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
        private Attributes[] sensors;

        private Builder() { }

        public IpmiInfo build() {
            return new IpmiInfo (
                         this.sensors);
        }

        private IpmiInfo.Builder buildFrom(final IpmiInfo req) {
            this.sensors = req.sensors;

            return this;
        }

        public IpmiInfo.Builder sensors(final Attributes[] sensors) {
            this.sensors = sensors;
            return this;
        }

    }
}
