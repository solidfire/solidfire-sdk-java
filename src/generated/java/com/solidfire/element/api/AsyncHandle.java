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
 * AsyncHandle  
 **/

public class AsyncHandle implements Serializable {

    public static final long serialVersionUID = 7042464927905159715L;
    @SerializedName("asyncResultID") private Long asyncResultID;
    @SerializedName("completed") private Boolean completed;
    @SerializedName("createTime") private String createTime;
    @SerializedName("lastUpdateTime") private String lastUpdateTime;
    @SerializedName("resultType") private String resultType;
    @SerializedName("success") private Boolean success;
    @SerializedName("data") private Attributes data;
    // empty constructor
    @Since("7.0")
    public AsyncHandle() {}

    
    // parameterized constructor
    @Since("7.0")
    public AsyncHandle(
        Long asyncResultID,
        Boolean completed,
        String createTime,
        String lastUpdateTime,
        String resultType,
        Boolean success,
        Attributes data
    )
    {
        this.asyncResultID = asyncResultID;
        this.completed = completed;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
        this.resultType = resultType;
        this.success = success;
        this.data = data;
    }

    /** 
     * The ID of the result.
     **/
    public Long getAsyncResultID() { return this.asyncResultID; }
   
    public void setAsyncResultID(Long asyncResultID) { 
        this.asyncResultID = asyncResultID;
    }
    /** 
     * Returns true if it is completed and false if it isn't.
     **/
    public Boolean getCompleted() { return this.completed; }
   
    public void setCompleted(Boolean completed) { 
        this.completed = completed;
    }
    /** 
     * The time at which the asyncronous result was created
     **/
    public String getCreateTime() { return this.createTime; }
   
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     * Time at which the result was last updated
     **/
    public String getLastUpdateTime() { return this.lastUpdateTime; }
   
    public void setLastUpdateTime(String lastUpdateTime) { 
        this.lastUpdateTime = lastUpdateTime;
    }
    /** 
     * The type of result. Could be Clone, DriveAdd, etc.
     **/
    public String getResultType() { return this.resultType; }
   
    public void setResultType(String resultType) { 
        this.resultType = resultType;
    }
    /** 
     * Returns whether the result was a success or failure.
     **/
    public Boolean getSuccess() { return this.success; }
   
    public void setSuccess(Boolean success) { 
        this.success = success;
    }
    /** 
     * Attributes related to the result
     **/
    public Attributes getData() { return this.data; }
   
    public void setData(Attributes data) { 
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsyncHandle that = (AsyncHandle) o;

        return 
            Objects.equals(asyncResultID, that.asyncResultID) && 
            Objects.equals(completed, that.completed) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(lastUpdateTime, that.lastUpdateTime) && 
            Objects.equals(resultType, that.resultType) && 
            Objects.equals(success, that.success) && 
            Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncResultID,completed,createTime,lastUpdateTime,resultType,success,data );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncResultID", asyncResultID);
        map.put("completed", completed);
        map.put("createTime", createTime);
        map.put("lastUpdateTime", lastUpdateTime);
        map.put("resultType", resultType);
        map.put("success", success);
        map.put("data", data);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" asyncResultID : ").append(gson.toJson(asyncResultID)).append(",");
        sb.append(" completed : ").append(gson.toJson(completed)).append(",");
        sb.append(" createTime : ").append(gson.toJson(createTime)).append(",");
        sb.append(" lastUpdateTime : ").append(gson.toJson(lastUpdateTime)).append(",");
        sb.append(" resultType : ").append(gson.toJson(resultType)).append(",");
        sb.append(" success : ").append(gson.toJson(success)).append(",");
        sb.append(" data : ").append(gson.toJson(data)).append(",");
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
        private Long asyncResultID;
        private Boolean completed;
        private String createTime;
        private String lastUpdateTime;
        private String resultType;
        private Boolean success;
        private Attributes data;

        private Builder() { }

        public AsyncHandle build() {
            return new AsyncHandle (
                         this.asyncResultID,
                         this.completed,
                         this.createTime,
                         this.lastUpdateTime,
                         this.resultType,
                         this.success,
                         this.data);
        }

        private AsyncHandle.Builder buildFrom(final AsyncHandle req) {
            this.asyncResultID = req.asyncResultID;
            this.completed = req.completed;
            this.createTime = req.createTime;
            this.lastUpdateTime = req.lastUpdateTime;
            this.resultType = req.resultType;
            this.success = req.success;
            this.data = req.data;

            return this;
        }

        public AsyncHandle.Builder asyncResultID(final Long asyncResultID) {
            this.asyncResultID = asyncResultID;
            return this;
        }

        public AsyncHandle.Builder completed(final Boolean completed) {
            this.completed = completed;
            return this;
        }

        public AsyncHandle.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public AsyncHandle.Builder lastUpdateTime(final String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        public AsyncHandle.Builder resultType(final String resultType) {
            this.resultType = resultType;
            return this;
        }

        public AsyncHandle.Builder success(final Boolean success) {
            this.success = success;
            return this;
        }

        public AsyncHandle.Builder data(final Attributes data) {
            this.data = data;
            return this;
        }

    }
}
