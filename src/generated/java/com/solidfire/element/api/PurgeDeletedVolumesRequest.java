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
 * PurgeDeletedVolumesRequest  
 * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted; you can use this method to purge up to 500 volumes at one time. You must delete volumes using DeleteVolumes before they can be purged. Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
 **/

public class PurgeDeletedVolumesRequest implements Serializable {

    public static final long serialVersionUID = -1606746892961402390L;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    @SerializedName("accountIDs") private Optional<Long[]> accountIDs;
    @SerializedName("volumeAccessGroupIDs") private Optional<Long[]> volumeAccessGroupIDs;

    // empty constructor
    @Since("7.0")
    public PurgeDeletedVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public PurgeDeletedVolumesRequest(
        Optional<Long[]> volumeIDs,
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs
    )
    {
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
        this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : accountIDs;
        this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : volumeAccessGroupIDs;
    }

    /** 
     * A list of volumeIDs of volumes to be purged from the system.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }
    /** 
     * A list of accountIDs. All of the volumes from all of the specified accounts are purged from the system.
     **/
    public Optional<Long[]> getAccountIDs() { return this.accountIDs; }
    public void setAccountIDs(Optional<Long[]> accountIDs) { 
        this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : accountIDs;
    }
    /** 
     * A list of volumeAccessGroupIDs. All of the volumes from all of the specified Volume Access Groups are purged from the system.
     **/
    public Optional<Long[]> getVolumeAccessGroupIDs() { return this.volumeAccessGroupIDs; }
    public void setVolumeAccessGroupIDs(Optional<Long[]> volumeAccessGroupIDs) { 
        this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : volumeAccessGroupIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurgeDeletedVolumesRequest that = (PurgeDeletedVolumesRequest) o;

        return 
            Objects.equals(volumeIDs, that.volumeIDs) && 
            Objects.equals(accountIDs, that.accountIDs) && 
            Objects.equals(volumeAccessGroupIDs, that.volumeAccessGroupIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeIDs,accountIDs,volumeAccessGroupIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeIDs", volumeIDs);
        map.put("accountIDs", accountIDs);
        map.put("volumeAccessGroupIDs", volumeAccessGroupIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(volumeIDs).append(",");
        }
        if(null != accountIDs && accountIDs.isPresent()){
            sb.append(" accountIDs : ").append(accountIDs).append(",");
        }
        if(null != volumeAccessGroupIDs && volumeAccessGroupIDs.isPresent()){
            sb.append(" volumeAccessGroupIDs : ").append(volumeAccessGroupIDs).append(",");
        }
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
        private Optional<Long[]> volumeIDs;
        private Optional<Long[]> accountIDs;
        private Optional<Long[]> volumeAccessGroupIDs;

        private Builder() { }

        public PurgeDeletedVolumesRequest build() {
            return new PurgeDeletedVolumesRequest (
                         this.volumeIDs,
                         this.accountIDs,
                         this.volumeAccessGroupIDs);
        }

        private PurgeDeletedVolumesRequest.Builder buildFrom(final PurgeDeletedVolumesRequest req) {
            this.volumeIDs = req.volumeIDs;
            this.accountIDs = req.accountIDs;
            this.volumeAccessGroupIDs = req.volumeAccessGroupIDs;

            return this;
        }

        public PurgeDeletedVolumesRequest.Builder optional(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

        public PurgeDeletedVolumesRequest.Builder optional(final Long[] accountIDs) {
            this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : Optional.of(accountIDs);
            return this;
        }

        public PurgeDeletedVolumesRequest.Builder optional(final Long[] volumeAccessGroupIDs) {
            this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeAccessGroupIDs);
            return this;
        }

    }
}
