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
 * ListNetworkInterfacesResult  
 **/

public class ListNetworkInterfacesResult implements Serializable {

    public static final long serialVersionUID = 5596944528414361433L;
    @SerializedName("interfaces") private NetworkInterface[] interfaces;

    // empty constructor
    @Since("7.0")
    public ListNetworkInterfacesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListNetworkInterfacesResult(
        NetworkInterface[] interfaces
    )
    {
        this.interfaces = interfaces;
    }

    /** 
     **/
    public NetworkInterface[] getInterfaces() { return this.interfaces; }
    public void setInterfaces(NetworkInterface[] interfaces) { 
        this.interfaces = interfaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNetworkInterfacesResult that = (ListNetworkInterfacesResult) o;

        return 
            Arrays.equals(interfaces, that.interfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])interfaces );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("interfaces", interfaces);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" interfaces : ").append(Arrays.toString(interfaces)).append(",");
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
        private NetworkInterface[] interfaces;

        private Builder() { }

        public ListNetworkInterfacesResult build() {
            return new ListNetworkInterfacesResult (
                         this.interfaces);
        }

        private ListNetworkInterfacesResult.Builder buildFrom(final ListNetworkInterfacesResult req) {
            this.interfaces = req.interfaces;

            return this;
        }

        public ListNetworkInterfacesResult.Builder interfaces(final NetworkInterface[] interfaces) {
            this.interfaces = interfaces;
            return this;
        }

    }
}
