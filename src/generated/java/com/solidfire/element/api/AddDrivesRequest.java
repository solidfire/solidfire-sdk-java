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
 * AddDrivesRequest  
 * AddDrives enables you to add one or more available drives to the cluster, enabling the drives to host a portion of the cluster's data.
 * When you add a node to the cluster or install new drives in an existing node, the new drives are marked as "available" and must be
 * added via AddDrives before they can be utilized. Use the ListDrives method to display drives that are "available" to be added. When
 * you add multiple drives, it is more efficient to add them in a single AddDrives method call rather than multiple individual methods
 * with a single drive each. This reduces the amount of data balancing that must occur to stabilize the storage load on the cluster.
 * When you add a drive, the system automatically determines the "type" of drive it should be.
 * The method is asynchronous and returns immediately. However, it can take some time for the data in the cluster to be rebalanced
 * using the newly added drives. As the new drives are syncing on the system, you can use the ListSyncJobs method to see how the
 * drives are being rebalanced and the progress of adding the new drive. You can also use the GetAsyncResult method to query the
 * method's returned asyncHandle.
 **/

public class AddDrivesRequest implements Serializable {

    public static final long serialVersionUID = -3122822977530475421L;
    @SerializedName("drives") private NewDrive[] drives;
    @SerializedName("forceDuringUpgrade") private Optional<Boolean> forceDuringUpgrade;
    @SerializedName("forceDuringBinSync") private Optional<Boolean> forceDuringBinSync;
    // empty constructor
    @Since("7.0")
    public AddDrivesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddDrivesRequest(
        NewDrive[] drives,
        Optional<Boolean> forceDuringUpgrade
    )
    {
        this.drives = drives;
        this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : forceDuringUpgrade;
    }
    // parameterized constructor
    @Since("10.0")
    public AddDrivesRequest(
        NewDrive[] drives,
        Optional<Boolean> forceDuringUpgrade,
        Optional<Boolean> forceDuringBinSync
    )
    {
        this.drives = drives;
        this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : forceDuringUpgrade;
        this.forceDuringBinSync = (forceDuringBinSync == null) ? Optional.<Boolean>empty() : forceDuringBinSync;
    }

    /** 
     * Returns information about each drive to be added to the
     * cluster. Possible values are:
     * driveID: The ID of the drive to
     * add. (Integer)
     * type: (Optional) The type of drive
     * to add. Valid values are "slice" or "block". If
     * omitted, the system assigns the correct
     * type. (String)
     **/
    public NewDrive[] getDrives() { return this.drives; }
   
    public void setDrives(NewDrive[] drives) { 
        this.drives = drives;
    }
    /** 
     * Allows the user to force the addition of drives during an upgrade.
     **/
    public Optional<Boolean> getForceDuringUpgrade() { return this.forceDuringUpgrade; }
   
    public void setForceDuringUpgrade(Optional<Boolean> forceDuringUpgrade) { 
        this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : forceDuringUpgrade;
    }
    /** 
     * Allows the user to force the addition of drives during a bin sync operation.
     **/
    public Optional<Boolean> getForceDuringBinSync() { return this.forceDuringBinSync; }
   
    public void setForceDuringBinSync(Optional<Boolean> forceDuringBinSync) { 
        this.forceDuringBinSync = (forceDuringBinSync == null) ? Optional.<Boolean>empty() : forceDuringBinSync;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddDrivesRequest that = (AddDrivesRequest) o;

        return 
            Arrays.equals(drives, that.drives) && 
            Objects.equals(forceDuringUpgrade, that.forceDuringUpgrade) && 
            Objects.equals(forceDuringBinSync, that.forceDuringBinSync);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])drives,forceDuringUpgrade,forceDuringBinSync );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        map.put("forceDuringUpgrade", forceDuringUpgrade);
        map.put("forceDuringBinSync", forceDuringBinSync);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" drives : ").append(gson.toJson(Arrays.toString(drives))).append(",");
        if(null != forceDuringUpgrade && forceDuringUpgrade.isPresent()){
            sb.append(" forceDuringUpgrade : ").append(gson.toJson(forceDuringUpgrade)).append(",");
        }
        else{
            sb.append(" forceDuringUpgrade : ").append("null").append(",");
        }
        if(null != forceDuringBinSync && forceDuringBinSync.isPresent()){
            sb.append(" forceDuringBinSync : ").append(gson.toJson(forceDuringBinSync)).append(",");
        }
        else{
            sb.append(" forceDuringBinSync : ").append("null").append(",");
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
        private NewDrive[] drives;
        private Optional<Boolean> forceDuringUpgrade;
        private Optional<Boolean> forceDuringBinSync;

        private Builder() { }

        public AddDrivesRequest build() {
            return new AddDrivesRequest (
                         this.drives,
                         this.forceDuringUpgrade,
                         this.forceDuringBinSync);
        }

        private AddDrivesRequest.Builder buildFrom(final AddDrivesRequest req) {
            this.drives = req.drives;
            this.forceDuringUpgrade = req.forceDuringUpgrade;
            this.forceDuringBinSync = req.forceDuringBinSync;

            return this;
        }

        public AddDrivesRequest.Builder drives(final NewDrive[] drives) {
            this.drives = drives;
            return this;
        }

        public AddDrivesRequest.Builder optionalForceDuringUpgrade(final Boolean forceDuringUpgrade) {
            this.forceDuringUpgrade = (forceDuringUpgrade == null) ? Optional.<Boolean>empty() : Optional.of(forceDuringUpgrade);
            return this;
        }

        public AddDrivesRequest.Builder optionalForceDuringBinSync(final Boolean forceDuringBinSync) {
            this.forceDuringBinSync = (forceDuringBinSync == null) ? Optional.<Boolean>empty() : Optional.of(forceDuringBinSync);
            return this;
        }

    }
}
