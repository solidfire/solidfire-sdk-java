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

public class ListClusterFaultsResult implements Serializable {

    public static final long serialVersionUID = 8263283430508705045L;
    @SerializedName("faults") private ClusterFaultInfo[] faults;

    // empty constructor
    @Since("7.0")
    public ListClusterFaultsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListClusterFaultsResult(
        ClusterFaultInfo[] faults
    )
    {
        this.faults = faults;
    }

    /** 
     * The list of Cluster Fault objects.
     **/
    public ClusterFaultInfo[] getFaults() { return this.faults; }
    public void setFaults(ClusterFaultInfo[] faults) { 
        this.faults = faults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterFaultsResult that = (ListClusterFaultsResult) o;

        return 
            Arrays.equals(faults, that.faults);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])faults );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("faults", faults);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" faults : ").append(Arrays.toString(faults)).append(",");
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
        private ClusterFaultInfo[] faults;

        private Builder() { }

        public ListClusterFaultsResult build() {
            return new ListClusterFaultsResult (
                         this.faults);
        }

        private ListClusterFaultsResult.Builder buildFrom(final ListClusterFaultsResult req) {
            this.faults = req.faults;

            return this;
        }

        public ListClusterFaultsResult.Builder faults(final ClusterFaultInfo[] faults) {
            this.faults = faults;
            return this;
        }

    }
}
