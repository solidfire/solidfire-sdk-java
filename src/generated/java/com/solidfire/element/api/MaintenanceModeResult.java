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
 * MaintenanceModeResult  
 * 
 **/

public class MaintenanceModeResult implements Serializable {

    public static final long serialVersionUID = -7107861362732184434L;
    @SerializedName("asyncHandle") private Long asyncHandle;
    @SerializedName("currentMode") private String currentMode;
    @SerializedName("requestedMode") private String requestedMode;
    // empty constructor
    @Since("7.0")
    public MaintenanceModeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public MaintenanceModeResult(
        Long asyncHandle,
        String currentMode,
        String requestedMode
    )
    {
        this.asyncHandle = asyncHandle;
        this.currentMode = currentMode;
        this.requestedMode = requestedMode;
    }

    /** 
     * This asyncHandle should be retrieved with GetAsyncResult to determine when the maintenance mode transition is complete.
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
   
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }
    /** 
     * The current maintenance mode of the node.
     **/
    public String getCurrentMode() { return this.currentMode; }
   
    public void setCurrentMode(String currentMode) { 
        this.currentMode = currentMode;
    }
    /** 
     * The requested maintenance mode of the node.
     **/
    public String getRequestedMode() { return this.requestedMode; }
   
    public void setRequestedMode(String requestedMode) { 
        this.requestedMode = requestedMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaintenanceModeResult that = (MaintenanceModeResult) o;

        return 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(currentMode, that.currentMode) && 
            Objects.equals(requestedMode, that.requestedMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncHandle,currentMode,requestedMode );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncHandle", asyncHandle);
        map.put("currentMode", currentMode);
        map.put("requestedMode", requestedMode);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(gson.toJson(asyncHandle)).append(",");
        sb.append(" currentMode : ").append(gson.toJson(currentMode)).append(",");
        sb.append(" requestedMode : ").append(gson.toJson(requestedMode)).append(",");
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
        private Long asyncHandle;
        private String currentMode;
        private String requestedMode;

        private Builder() { }

        public MaintenanceModeResult build() {
            return new MaintenanceModeResult (
                         this.asyncHandle,
                         this.currentMode,
                         this.requestedMode);
        }

        private MaintenanceModeResult.Builder buildFrom(final MaintenanceModeResult req) {
            this.asyncHandle = req.asyncHandle;
            this.currentMode = req.currentMode;
            this.requestedMode = req.requestedMode;

            return this;
        }

        public MaintenanceModeResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

        public MaintenanceModeResult.Builder currentMode(final String currentMode) {
            this.currentMode = currentMode;
            return this;
        }

        public MaintenanceModeResult.Builder requestedMode(final String requestedMode) {
            this.requestedMode = requestedMode;
            return this;
        }

    }
}
