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

public class StartVolumePairingResult implements Serializable {

    public static final long serialVersionUID = 273092657L;
    @SerializedName("volumePairingKey") private String volumePairingKey;

    // empty constructor
    @Since("7.0")
    public StartVolumePairingResult() {}

    // parameterized constructor
    @Since("7.0")
    public StartVolumePairingResult(
        String volumePairingKey
    )
    {
        this.volumePairingKey = volumePairingKey;
    }

    /** 
     * A string of characters that is used by the "CompleteVolumePairing" API method.
     **/
    public String getVolumePairingKey() { return this.volumePairingKey; }
    public void setVolumePairingKey(String volumePairingKey) { 
        this.volumePairingKey = volumePairingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartVolumePairingResult that = (StartVolumePairingResult) o;
        return 
            Objects.equals(volumePairingKey, that.volumePairingKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumePairingKey );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumePairingKey", volumePairingKey);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumePairingKey : ").append(volumePairingKey).append(",");
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
        private String volumePairingKey;

        private Builder() { }

        public StartVolumePairingResult build() {
            return new StartVolumePairingResult (
                         this.volumePairingKey);
        }

        private StartVolumePairingResult.Builder buildFrom(final StartVolumePairingResult req) {
            this.volumePairingKey = req.volumePairingKey;

            return this;
        }

        public StartVolumePairingResult.Builder volumePairingKey(final String volumePairingKey) {
            this.volumePairingKey = volumePairingKey;
            return this;
        }

    }
}
