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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * SecureEraseDrivesRequest  
 * SecureEraseDrives is used to remove any residual data from drives that have a status of "available." For example, when replacing a drive at its end-of-life that contained sensitive data.
 * It uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. The method may take up to two minutes to complete, so it is an asynchronous method.
 * The GetAsyncResult method can be used to check on the status of the secure erase operation.
 * 
 * Use the "ListDrives" method to obtain the driveIDs for the drives you want to secure erase.
 **/

public class SecureEraseDrivesRequest implements Serializable {

    public static final long serialVersionUID = -8066722262216785695L;
    @SerializedName("drives") private Long[] drives;

    // empty constructor
    @Since("7.0")
    public SecureEraseDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SecureEraseDrivesRequest(
        Long[] drives
    )
    {
        this.drives = drives;
    }

    /** 
     * List of driveIDs to secure erase.
     **/
    public Long[] getDrives() { return this.drives; }
    public void setDrives(Long[] drives) { 
        this.drives = drives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecureEraseDrivesRequest that = (SecureEraseDrivesRequest) o;

        return 
            Arrays.equals(drives, that.drives);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])drives );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(Arrays.toString(drives)).append(",");
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
        private Long[] drives;

        private Builder() { }

        public SecureEraseDrivesRequest build() {
            return new SecureEraseDrivesRequest (
                         this.drives);
        }

        private SecureEraseDrivesRequest.Builder buildFrom(final SecureEraseDrivesRequest req) {
            this.drives = req.drives;

            return this;
        }

        public SecureEraseDrivesRequest.Builder drives(final Long[] drives) {
            this.drives = drives;
            return this;
        }

    }
}
