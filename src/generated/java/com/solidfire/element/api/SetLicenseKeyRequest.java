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
 * SetLicenseKeyRequest  
 * You can use the SetLicenseKey method to set the SerialNumber And OrderNumber for the cluster.
 **/

public class SetLicenseKeyRequest implements Serializable {

    public static final long serialVersionUID = -3469730414175973035L;
    @SerializedName("serialNumber") private String serialNumber;
    @SerializedName("orderNumber") private String orderNumber;
    // empty constructor
    @Since("7.0")
    public SetLicenseKeyRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetLicenseKeyRequest(
        String serialNumber,
        String orderNumber
    )
    {
        this.serialNumber = serialNumber;
        this.orderNumber = orderNumber;
    }

    /** 
     * The new Serial Number for this cluster.
     **/
    public String getSerialNumber() { return this.serialNumber; }
   
    public void setSerialNumber(String serialNumber) { 
        this.serialNumber = serialNumber;
    }
    /** 
     * The new sales order number for this cluster.
     **/
    public String getOrderNumber() { return this.orderNumber; }
   
    public void setOrderNumber(String orderNumber) { 
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetLicenseKeyRequest that = (SetLicenseKeyRequest) o;

        return 
            Objects.equals(serialNumber, that.serialNumber) && 
            Objects.equals(orderNumber, that.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash( serialNumber,orderNumber );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("serialNumber", serialNumber);
        map.put("orderNumber", orderNumber);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" serialNumber : ").append(gson.toJson(serialNumber)).append(",");
        sb.append(" orderNumber : ").append(gson.toJson(orderNumber)).append(",");
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
        private String serialNumber;
        private String orderNumber;

        private Builder() { }

        public SetLicenseKeyRequest build() {
            return new SetLicenseKeyRequest (
                         this.serialNumber,
                         this.orderNumber);
        }

        private SetLicenseKeyRequest.Builder buildFrom(final SetLicenseKeyRequest req) {
            this.serialNumber = req.serialNumber;
            this.orderNumber = req.orderNumber;

            return this;
        }

        public SetLicenseKeyRequest.Builder serialNumber(final String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SetLicenseKeyRequest.Builder orderNumber(final String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

    }
}
