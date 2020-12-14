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
 * ListSnapMirrorVserversResult  
 **/

public class ListSnapMirrorVserversResult implements Serializable {

    public static final long serialVersionUID = 457025094819510072L;
    @SerializedName("snapMirrorVservers") private SnapMirrorVserver[] snapMirrorVservers;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorVserversResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorVserversResult(
        SnapMirrorVserver[] snapMirrorVservers
    )
    {
        this.snapMirrorVservers = snapMirrorVservers;
    }

    /** 
     * A list of the SnapMirror Vservers available on the ONTAP storage system.
     **/
    public SnapMirrorVserver[] getSnapMirrorVservers() { return this.snapMirrorVservers; }
   
    public void setSnapMirrorVservers(SnapMirrorVserver[] snapMirrorVservers) { 
        this.snapMirrorVservers = snapMirrorVservers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorVserversResult that = (ListSnapMirrorVserversResult) o;

        return 
            Arrays.equals(snapMirrorVservers, that.snapMirrorVservers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorVservers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorVservers", snapMirrorVservers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorVservers : ").append(gson.toJson(Arrays.toString(snapMirrorVservers))).append(",");
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
        private SnapMirrorVserver[] snapMirrorVservers;

        private Builder() { }

        public ListSnapMirrorVserversResult build() {
            return new ListSnapMirrorVserversResult (
                         this.snapMirrorVservers);
        }

        private ListSnapMirrorVserversResult.Builder buildFrom(final ListSnapMirrorVserversResult req) {
            this.snapMirrorVservers = req.snapMirrorVservers;

            return this;
        }

        public ListSnapMirrorVserversResult.Builder snapMirrorVservers(final SnapMirrorVserver[] snapMirrorVservers) {
            this.snapMirrorVservers = snapMirrorVservers;
            return this;
        }

    }
}
