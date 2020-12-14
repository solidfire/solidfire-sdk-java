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
 * ListSnapMirrorNetworkInterfacesResult  
 **/

public class ListSnapMirrorNetworkInterfacesResult implements Serializable {

    public static final long serialVersionUID = -8917882481530496827L;
    @SerializedName("snapMirrorNetworkInterfaces") private SnapMirrorNetworkInterface[] snapMirrorNetworkInterfaces;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorNetworkInterfacesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorNetworkInterfacesResult(
        SnapMirrorNetworkInterface[] snapMirrorNetworkInterfaces
    )
    {
        this.snapMirrorNetworkInterfaces = snapMirrorNetworkInterfaces;
    }

    /** 
     * A list of the SnapMirror network interfaces available on the remote ONTAP storage system.
     **/
    public SnapMirrorNetworkInterface[] getSnapMirrorNetworkInterfaces() { return this.snapMirrorNetworkInterfaces; }
   
    public void setSnapMirrorNetworkInterfaces(SnapMirrorNetworkInterface[] snapMirrorNetworkInterfaces) { 
        this.snapMirrorNetworkInterfaces = snapMirrorNetworkInterfaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorNetworkInterfacesResult that = (ListSnapMirrorNetworkInterfacesResult) o;

        return 
            Arrays.equals(snapMirrorNetworkInterfaces, that.snapMirrorNetworkInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorNetworkInterfaces );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorNetworkInterfaces", snapMirrorNetworkInterfaces);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorNetworkInterfaces : ").append(gson.toJson(Arrays.toString(snapMirrorNetworkInterfaces))).append(",");
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
        private SnapMirrorNetworkInterface[] snapMirrorNetworkInterfaces;

        private Builder() { }

        public ListSnapMirrorNetworkInterfacesResult build() {
            return new ListSnapMirrorNetworkInterfacesResult (
                         this.snapMirrorNetworkInterfaces);
        }

        private ListSnapMirrorNetworkInterfacesResult.Builder buildFrom(final ListSnapMirrorNetworkInterfacesResult req) {
            this.snapMirrorNetworkInterfaces = req.snapMirrorNetworkInterfaces;

            return this;
        }

        public ListSnapMirrorNetworkInterfacesResult.Builder snapMirrorNetworkInterfaces(final SnapMirrorNetworkInterface[] snapMirrorNetworkInterfaces) {
            this.snapMirrorNetworkInterfaces = snapMirrorNetworkInterfaces;
            return this;
        }

    }
}
