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
 **/

public class ResetNodeResult implements Serializable {

    public static final long serialVersionUID = 1741204150018515933L;
    @SerializedName("rtfiInfo") private java.util.Map<String, Object> rtfiInfo;

    // empty constructor
    @Since("7.0")
    public ResetNodeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeResult(
        java.util.Map<String, Object> rtfiInfo
    )
    {
        this.rtfiInfo = rtfiInfo;
    }

    /** 
     * Details of nodes that are being reset.
     **/
    public java.util.Map<String, Object> getRtfiInfo() { return this.rtfiInfo; }
    public void setRtfiInfo(java.util.Map<String, Object> rtfiInfo) { 
        this.rtfiInfo = rtfiInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeResult that = (ResetNodeResult) o;

        return 
            Objects.equals(rtfiInfo, that.rtfiInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( rtfiInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("rtfiInfo", rtfiInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" rtfiInfo : ").append(rtfiInfo).append(",");
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
        private java.util.Map<String, Object> rtfiInfo;

        private Builder() { }

        public ResetNodeResult build() {
            return new ResetNodeResult (
                         this.rtfiInfo);
        }

        private ResetNodeResult.Builder buildFrom(final ResetNodeResult req) {
            this.rtfiInfo = req.rtfiInfo;

            return this;
        }

        public ResetNodeResult.Builder rtfiInfo(final java.util.Map<String, Object> rtfiInfo) {
            this.rtfiInfo = rtfiInfo;
            return this;
        }

    }
}
