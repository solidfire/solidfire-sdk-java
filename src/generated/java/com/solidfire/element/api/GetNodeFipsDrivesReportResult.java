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
 * GetNodeFipsDrivesReportResult  
 * This specifies a node's FIPS 140-2 drive capability status
 **/

public class GetNodeFipsDrivesReportResult implements Serializable {

    public static final long serialVersionUID = -208176515481816790L;
    @SerializedName("fipsDrives") private String fipsDrives;

    
    // parameterized constructor
    @Since("7.0")
    public GetNodeFipsDrivesReportResult(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public GetNodeFipsDrivesReportResult(
        String fipsDrives
    )
    {
        this.fipsDrives = fipsDrives;
    }

    /** 
     * Node's FipsDrives capability status.
     **/
    public String getFipsDrives() { return this.fipsDrives; }
   
    public void setFipsDrives(String fipsDrives) { 
        this.fipsDrives = fipsDrives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeFipsDrivesReportResult that = (GetNodeFipsDrivesReportResult) o;

        return 
            Objects.equals(fipsDrives, that.fipsDrives);
    }

    @Override
    public int hashCode() {
        return Objects.hash( fipsDrives );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("fipsDrives", fipsDrives);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" fipsDrives : ").append(gson.toJson(fipsDrives)).append(",");
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
        private String fipsDrives;

        private Builder() { }

        public GetNodeFipsDrivesReportResult build() {
            return new GetNodeFipsDrivesReportResult (
                         this.fipsDrives);
        }

        private GetNodeFipsDrivesReportResult.Builder buildFrom(final GetNodeFipsDrivesReportResult req) {
            this.fipsDrives = req.fipsDrives;

            return this;
        }

        public GetNodeFipsDrivesReportResult.Builder fipsDrives(final String fipsDrives) {
            this.fipsDrives = fipsDrives;
            return this;
        }

    }
}
