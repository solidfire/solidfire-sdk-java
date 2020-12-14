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
 * GetOntapVersionInfoResult  
 **/

public class GetOntapVersionInfoResult implements Serializable {

    public static final long serialVersionUID = -5362486907432056452L;
    @SerializedName("ontapVersionInfo") private OntapVersionInfo[] ontapVersionInfo;

    
    // parameterized constructor
    @Since("7.0")
    public GetOntapVersionInfoResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetOntapVersionInfoResult(
        OntapVersionInfo[] ontapVersionInfo
    )
    {
        this.ontapVersionInfo = ontapVersionInfo;
    }

    /** 
     * The software version information of the ONTAP endpoint.
     **/
    public OntapVersionInfo[] getOntapVersionInfo() { return this.ontapVersionInfo; }
   
    public void setOntapVersionInfo(OntapVersionInfo[] ontapVersionInfo) { 
        this.ontapVersionInfo = ontapVersionInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetOntapVersionInfoResult that = (GetOntapVersionInfoResult) o;

        return 
            Arrays.equals(ontapVersionInfo, that.ontapVersionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])ontapVersionInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("ontapVersionInfo", ontapVersionInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" ontapVersionInfo : ").append(gson.toJson(Arrays.toString(ontapVersionInfo))).append(",");
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
        private OntapVersionInfo[] ontapVersionInfo;

        private Builder() { }

        public GetOntapVersionInfoResult build() {
            return new GetOntapVersionInfoResult (
                         this.ontapVersionInfo);
        }

        private GetOntapVersionInfoResult.Builder buildFrom(final GetOntapVersionInfoResult req) {
            this.ontapVersionInfo = req.ontapVersionInfo;

            return this;
        }

        public GetOntapVersionInfoResult.Builder ontapVersionInfo(final OntapVersionInfo[] ontapVersionInfo) {
            this.ontapVersionInfo = ontapVersionInfo;
            return this;
        }

    }
}
