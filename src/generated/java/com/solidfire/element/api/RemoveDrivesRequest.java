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
 * RemoveDrivesRequest  
 * You can use RemoveDrives to proactively remove drives that are part of the cluster.
 * You may want to use this method when reducing cluster capacity or preparing to replace drives nearing the end of their service life.
 * Any data on the drives is removed and migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method.
 * Depending on the total capacity of the drives being removed, it may take several minutes to migrate all of the data.
 * Use the "GetAsyncResult" method to check the status of the remove operation.
 * 
 * When removing multiple drives, use a single "RemoveDrives" method call rather than multiple individual methods with a single drive each.
 * This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
 * 
 * You can also remove drives with a "failed" status using "RemoveDrives".
 * When you remove a drive with a "failed" status it is not returned to an "available" or "active" status.
 * The drive is unavailable for use in the cluster.
 * 
 * Use the "ListDrives" method to obtain the driveIDs for the drives you want to remove.
 **/

public class RemoveDrivesRequest implements Serializable {

    public static final long serialVersionUID = 131252405671668047L;
    @SerializedName("drives") private Long[] drives;
    @SerializedName("forceDuringUpgrade") private Optional<Boolean> forceDuringUpgrade;

    // empty constructor
    @Since("7.0")
    public RemoveDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveDrivesRequest(
        Long[] drives,
        Optional<Boolean> forceDuringUpgrade
    )
    {
        this.drives = drives;
        this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : forceDuringUpgrade;
    }

    /** 
     * List of driveIDs to remove from the cluster.
     **/
    public Long[] getDrives() { return this.drives; }
    public void setDrives(Long[] drives) { 
        this.drives = drives;
    }
    /** 
     * If you want to remove a drive during upgrade, this must be set to true.
     **/
    public Optional<Boolean> getForceDuringUpgrade() { return this.forceDuringUpgrade; }
    public void setForceDuringUpgrade(Optional<Boolean> forceDuringUpgrade) { 
        this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : forceDuringUpgrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveDrivesRequest that = (RemoveDrivesRequest) o;

        return 
            Arrays.equals(drives, that.drives) && 
            Objects.equals(forceDuringUpgrade, that.forceDuringUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])drives,forceDuringUpgrade );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        map.put("forceDuringUpgrade", forceDuringUpgrade);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(Arrays.toString(drives)).append(",");
        if(null != forceDuringUpgrade && forceDuringUpgrade.isPresent()){
            sb.append(" forceDuringUpgrade : ").append(forceDuringUpgrade).append(",");
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
        private Long[] drives;
        private Optional<Boolean> forceDuringUpgrade;

        private Builder() { }

        public RemoveDrivesRequest build() {
            return new RemoveDrivesRequest (
                         this.drives,
                         this.forceDuringUpgrade);
        }

        private RemoveDrivesRequest.Builder buildFrom(final RemoveDrivesRequest req) {
            this.drives = req.drives;
            this.forceDuringUpgrade = req.forceDuringUpgrade;

            return this;
        }

        public RemoveDrivesRequest.Builder drives(final Long[] drives) {
            this.drives = drives;
            return this;
        }

        public RemoveDrivesRequest.Builder optional(final Boolean forceDuringUpgrade) {
            this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : Optional.of(forceDuringUpgrade);
            return this;
        }

    }
}
