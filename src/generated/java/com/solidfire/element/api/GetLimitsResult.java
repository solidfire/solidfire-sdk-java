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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * Limits for the cluster
 **/
public class GetLimitsResult implements Serializable {

    private static final long serialVersionUID = 699867316L;

    @SerializedName("accountCountMax") private final long accountCountMax;
    @SerializedName("accountNameLengthMax") private final long accountNameLengthMax;
    @SerializedName("accountNameLengthMin") private final long accountNameLengthMin;
    @SerializedName("bulkVolumeJobsPerNodeMax") private final long bulkVolumeJobsPerNodeMax;
    @SerializedName("bulkVolumeJobsPerVolumeMax") private final long bulkVolumeJobsPerVolumeMax;
    @SerializedName("cloneJobsPerVolumeMax") private final long cloneJobsPerVolumeMax;
    @SerializedName("clusterPairsCountMax") private final long clusterPairsCountMax;
    @SerializedName("initiatorNameLengthMax") private final long initiatorNameLengthMax;
    @SerializedName("initiatorsPerVolumeAccessGroupCountMax") private final long initiatorsPerVolumeAccessGroupCountMax;
    @SerializedName("secretLengthMax") private final long secretLengthMax;
    @SerializedName("secretLengthMin") private final long secretLengthMin;
    @SerializedName("snapshotNameLengthMax") private final long snapshotNameLengthMax;
    @SerializedName("snapshotsPerVolumeMax") private final long snapshotsPerVolumeMax;
    @SerializedName("volumeAccessGroupCountMax") private final long volumeAccessGroupCountMax;
    @SerializedName("volumeAccessGroupLunMax") private final long volumeAccessGroupLunMax;
    @SerializedName("volumeAccessGroupNameLengthMax") private final long volumeAccessGroupNameLengthMax;
    @SerializedName("volumeAccessGroupNameLengthMin") private final long volumeAccessGroupNameLengthMin;
    @SerializedName("volumeAccessGroupsPerInitiatorCountMax") private final long volumeAccessGroupsPerInitiatorCountMax;
    @SerializedName("volumeAccessGroupsPerVolumeCountMax") private final long volumeAccessGroupsPerVolumeCountMax;
    @SerializedName("volumeBurstIOPSMax") private final long volumeBurstIOPSMax;
    @SerializedName("volumeBurstIOPSMin") private final long volumeBurstIOPSMin;
    @SerializedName("volumeCountMax") private final long volumeCountMax;
    @SerializedName("volumeMaxIOPSMax") private final long volumeMaxIOPSMax;
    @SerializedName("volumeMaxIOPSMin") private final long volumeMaxIOPSMin;
    @SerializedName("volumeMinIOPSMax") private final long volumeMinIOPSMax;
    @SerializedName("volumeMinIOPSMin") private final long volumeMinIOPSMin;
    @SerializedName("volumeNameLengthMax") private final long volumeNameLengthMax;
    @SerializedName("volumeNameLengthMin") private final long volumeNameLengthMin;
    @SerializedName("volumeSizeMax") private final long volumeSizeMax;
    @SerializedName("volumeSizeMin") private final long volumeSizeMin;
    @SerializedName("volumesPerAccountCountMax") private final long volumesPerAccountCountMax;
    @SerializedName("volumesPerGroupSnapshotMax") private final long volumesPerGroupSnapshotMax;
    @SerializedName("volumesPerVolumeAccessGroupCountMax") private final long volumesPerVolumeAccessGroupCountMax;

    /**
     * Limits for the cluster
     * @param accountCountMax [required] 
     * @param accountNameLengthMax [required] 
     * @param accountNameLengthMin [required] 
     * @param bulkVolumeJobsPerNodeMax [required] 
     * @param bulkVolumeJobsPerVolumeMax [required] 
     * @param cloneJobsPerVolumeMax [required] 
     * @param clusterPairsCountMax [required] 
     * @param initiatorNameLengthMax [required] 
     * @param initiatorsPerVolumeAccessGroupCountMax [required] 
     * @param secretLengthMax [required] 
     * @param secretLengthMin [required] 
     * @param snapshotNameLengthMax [required] 
     * @param snapshotsPerVolumeMax [required] 
     * @param volumeAccessGroupCountMax [required] 
     * @param volumeAccessGroupLunMax [required] 
     * @param volumeAccessGroupNameLengthMax [required] 
     * @param volumeAccessGroupNameLengthMin [required] 
     * @param volumeAccessGroupsPerInitiatorCountMax [required] 
     * @param volumeAccessGroupsPerVolumeCountMax [required] 
     * @param volumeBurstIOPSMax [required] 
     * @param volumeBurstIOPSMin [required] 
     * @param volumeCountMax [required] 
     * @param volumeMaxIOPSMax [required] 
     * @param volumeMaxIOPSMin [required] 
     * @param volumeMinIOPSMax [required] 
     * @param volumeMinIOPSMin [required] 
     * @param volumeNameLengthMax [required] 
     * @param volumeNameLengthMin [required] 
     * @param volumeSizeMax [required] 
     * @param volumeSizeMin [required] 
     * @param volumesPerAccountCountMax [required] 
     * @param volumesPerGroupSnapshotMax [required] 
     * @param volumesPerVolumeAccessGroupCountMax [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public GetLimitsResult(long accountCountMax, long accountNameLengthMax, long accountNameLengthMin, long bulkVolumeJobsPerNodeMax, long bulkVolumeJobsPerVolumeMax, long cloneJobsPerVolumeMax, long clusterPairsCountMax, long initiatorNameLengthMax, long initiatorsPerVolumeAccessGroupCountMax, long secretLengthMax, long secretLengthMin, long snapshotNameLengthMax, long snapshotsPerVolumeMax, long volumeAccessGroupCountMax, long volumeAccessGroupLunMax, long volumeAccessGroupNameLengthMax, long volumeAccessGroupNameLengthMin, long volumeAccessGroupsPerInitiatorCountMax, long volumeAccessGroupsPerVolumeCountMax, long volumeBurstIOPSMax, long volumeBurstIOPSMin, long volumeCountMax, long volumeMaxIOPSMax, long volumeMaxIOPSMin, long volumeMinIOPSMax, long volumeMinIOPSMin, long volumeNameLengthMax, long volumeNameLengthMin, long volumeSizeMax, long volumeSizeMin, long volumesPerAccountCountMax, long volumesPerGroupSnapshotMax, long volumesPerVolumeAccessGroupCountMax) {
        this.accountCountMax = accountCountMax;
        this.clusterPairsCountMax = clusterPairsCountMax;
        this.volumeAccessGroupLunMax = volumeAccessGroupLunMax;
        this.volumesPerGroupSnapshotMax = volumesPerGroupSnapshotMax;
        this.volumeCountMax = volumeCountMax;
        this.volumeNameLengthMin = volumeNameLengthMin;
        this.volumeMinIOPSMax = volumeMinIOPSMax;
        this.volumeMinIOPSMin = volumeMinIOPSMin;
        this.secretLengthMax = secretLengthMax;
        this.volumesPerVolumeAccessGroupCountMax = volumesPerVolumeAccessGroupCountMax;
        this.cloneJobsPerVolumeMax = cloneJobsPerVolumeMax;
        this.accountNameLengthMax = accountNameLengthMax;
        this.bulkVolumeJobsPerVolumeMax = bulkVolumeJobsPerVolumeMax;
        this.volumeBurstIOPSMin = volumeBurstIOPSMin;
        this.volumeMaxIOPSMax = volumeMaxIOPSMax;
        this.bulkVolumeJobsPerNodeMax = bulkVolumeJobsPerNodeMax;
        this.volumesPerAccountCountMax = volumesPerAccountCountMax;
        this.volumeAccessGroupsPerVolumeCountMax = volumeAccessGroupsPerVolumeCountMax;
        this.initiatorsPerVolumeAccessGroupCountMax = initiatorsPerVolumeAccessGroupCountMax;
        this.initiatorNameLengthMax = initiatorNameLengthMax;
        this.volumeAccessGroupNameLengthMax = volumeAccessGroupNameLengthMax;
        this.accountNameLengthMin = accountNameLengthMin;
        this.volumeAccessGroupsPerInitiatorCountMax = volumeAccessGroupsPerInitiatorCountMax;
        this.volumeAccessGroupNameLengthMin = volumeAccessGroupNameLengthMin;
        this.secretLengthMin = secretLengthMin;
        this.volumeSizeMin = volumeSizeMin;
        this.volumeBurstIOPSMax = volumeBurstIOPSMax;
        this.volumeAccessGroupCountMax = volumeAccessGroupCountMax;
        this.snapshotNameLengthMax = snapshotNameLengthMax;
        this.volumeSizeMax = volumeSizeMax;
        this.snapshotsPerVolumeMax = snapshotsPerVolumeMax;
        this.volumeMaxIOPSMin = volumeMaxIOPSMin;
        this.volumeNameLengthMax = volumeNameLengthMax;
    }

    public long getAccountCountMax() {
        return this.accountCountMax;
    }
    public long getAccountNameLengthMax() {
        return this.accountNameLengthMax;
    }
    public long getAccountNameLengthMin() {
        return this.accountNameLengthMin;
    }
    public long getBulkVolumeJobsPerNodeMax() {
        return this.bulkVolumeJobsPerNodeMax;
    }
    public long getBulkVolumeJobsPerVolumeMax() {
        return this.bulkVolumeJobsPerVolumeMax;
    }
    public long getCloneJobsPerVolumeMax() {
        return this.cloneJobsPerVolumeMax;
    }
    public long getClusterPairsCountMax() {
        return this.clusterPairsCountMax;
    }
    public long getInitiatorNameLengthMax() {
        return this.initiatorNameLengthMax;
    }
    public long getInitiatorsPerVolumeAccessGroupCountMax() {
        return this.initiatorsPerVolumeAccessGroupCountMax;
    }
    public long getSecretLengthMax() {
        return this.secretLengthMax;
    }
    public long getSecretLengthMin() {
        return this.secretLengthMin;
    }
    public long getSnapshotNameLengthMax() {
        return this.snapshotNameLengthMax;
    }
    public long getSnapshotsPerVolumeMax() {
        return this.snapshotsPerVolumeMax;
    }
    public long getVolumeAccessGroupCountMax() {
        return this.volumeAccessGroupCountMax;
    }
    public long getVolumeAccessGroupLunMax() {
        return this.volumeAccessGroupLunMax;
    }
    public long getVolumeAccessGroupNameLengthMax() {
        return this.volumeAccessGroupNameLengthMax;
    }
    public long getVolumeAccessGroupNameLengthMin() {
        return this.volumeAccessGroupNameLengthMin;
    }
    public long getVolumeAccessGroupsPerInitiatorCountMax() {
        return this.volumeAccessGroupsPerInitiatorCountMax;
    }
    public long getVolumeAccessGroupsPerVolumeCountMax() {
        return this.volumeAccessGroupsPerVolumeCountMax;
    }
    public long getVolumeBurstIOPSMax() {
        return this.volumeBurstIOPSMax;
    }
    public long getVolumeBurstIOPSMin() {
        return this.volumeBurstIOPSMin;
    }
    public long getVolumeCountMax() {
        return this.volumeCountMax;
    }
    public long getVolumeMaxIOPSMax() {
        return this.volumeMaxIOPSMax;
    }
    public long getVolumeMaxIOPSMin() {
        return this.volumeMaxIOPSMin;
    }
    public long getVolumeMinIOPSMax() {
        return this.volumeMinIOPSMax;
    }
    public long getVolumeMinIOPSMin() {
        return this.volumeMinIOPSMin;
    }
    public long getVolumeNameLengthMax() {
        return this.volumeNameLengthMax;
    }
    public long getVolumeNameLengthMin() {
        return this.volumeNameLengthMin;
    }
    public long getVolumeSizeMax() {
        return this.volumeSizeMax;
    }
    public long getVolumeSizeMin() {
        return this.volumeSizeMin;
    }
    public long getVolumesPerAccountCountMax() {
        return this.volumesPerAccountCountMax;
    }
    public long getVolumesPerGroupSnapshotMax() {
        return this.volumesPerGroupSnapshotMax;
    }
    public long getVolumesPerVolumeAccessGroupCountMax() {
        return this.volumesPerVolumeAccessGroupCountMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLimitsResult that = (GetLimitsResult) o;
        

        return Objects.equals( accountCountMax , that.accountCountMax )
            && Objects.equals( accountNameLengthMax , that.accountNameLengthMax )
            && Objects.equals( accountNameLengthMin , that.accountNameLengthMin )
            && Objects.equals( bulkVolumeJobsPerNodeMax , that.bulkVolumeJobsPerNodeMax )
            && Objects.equals( bulkVolumeJobsPerVolumeMax , that.bulkVolumeJobsPerVolumeMax )
            && Objects.equals( cloneJobsPerVolumeMax , that.cloneJobsPerVolumeMax )
            && Objects.equals( clusterPairsCountMax , that.clusterPairsCountMax )
            && Objects.equals( initiatorNameLengthMax , that.initiatorNameLengthMax )
            && Objects.equals( initiatorsPerVolumeAccessGroupCountMax , that.initiatorsPerVolumeAccessGroupCountMax )
            && Objects.equals( secretLengthMax , that.secretLengthMax )
            && Objects.equals( secretLengthMin , that.secretLengthMin )
            && Objects.equals( snapshotNameLengthMax , that.snapshotNameLengthMax )
            && Objects.equals( snapshotsPerVolumeMax , that.snapshotsPerVolumeMax )
            && Objects.equals( volumeAccessGroupCountMax , that.volumeAccessGroupCountMax )
            && Objects.equals( volumeAccessGroupLunMax , that.volumeAccessGroupLunMax )
            && Objects.equals( volumeAccessGroupNameLengthMax , that.volumeAccessGroupNameLengthMax )
            && Objects.equals( volumeAccessGroupNameLengthMin , that.volumeAccessGroupNameLengthMin )
            && Objects.equals( volumeAccessGroupsPerInitiatorCountMax , that.volumeAccessGroupsPerInitiatorCountMax )
            && Objects.equals( volumeAccessGroupsPerVolumeCountMax , that.volumeAccessGroupsPerVolumeCountMax )
            && Objects.equals( volumeBurstIOPSMax , that.volumeBurstIOPSMax )
            && Objects.equals( volumeBurstIOPSMin , that.volumeBurstIOPSMin )
            && Objects.equals( volumeCountMax , that.volumeCountMax )
            && Objects.equals( volumeMaxIOPSMax , that.volumeMaxIOPSMax )
            && Objects.equals( volumeMaxIOPSMin , that.volumeMaxIOPSMin )
            && Objects.equals( volumeMinIOPSMax , that.volumeMinIOPSMax )
            && Objects.equals( volumeMinIOPSMin , that.volumeMinIOPSMin )
            && Objects.equals( volumeNameLengthMax , that.volumeNameLengthMax )
            && Objects.equals( volumeNameLengthMin , that.volumeNameLengthMin )
            && Objects.equals( volumeSizeMax , that.volumeSizeMax )
            && Objects.equals( volumeSizeMin , that.volumeSizeMin )
            && Objects.equals( volumesPerAccountCountMax , that.volumesPerAccountCountMax )
            && Objects.equals( volumesPerGroupSnapshotMax , that.volumesPerGroupSnapshotMax )
            && Objects.equals( volumesPerVolumeAccessGroupCountMax , that.volumesPerVolumeAccessGroupCountMax );
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountCountMax, accountNameLengthMax, accountNameLengthMin, bulkVolumeJobsPerNodeMax, bulkVolumeJobsPerVolumeMax, cloneJobsPerVolumeMax, clusterPairsCountMax, initiatorNameLengthMax, initiatorsPerVolumeAccessGroupCountMax, secretLengthMax, secretLengthMin, snapshotNameLengthMax, snapshotsPerVolumeMax, volumeAccessGroupCountMax, volumeAccessGroupLunMax, volumeAccessGroupNameLengthMax, volumeAccessGroupNameLengthMin, volumeAccessGroupsPerInitiatorCountMax, volumeAccessGroupsPerVolumeCountMax, volumeBurstIOPSMax, volumeBurstIOPSMin, volumeCountMax, volumeMaxIOPSMax, volumeMaxIOPSMin, volumeMinIOPSMax, volumeMinIOPSMin, volumeNameLengthMax, volumeNameLengthMin, volumeSizeMax, volumeSizeMin, volumesPerAccountCountMax, volumesPerGroupSnapshotMax, volumesPerVolumeAccessGroupCountMax );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountCountMax : ").append(accountCountMax).append(",");
        sb.append(" accountNameLengthMax : ").append(accountNameLengthMax).append(",");
        sb.append(" accountNameLengthMin : ").append(accountNameLengthMin).append(",");
        sb.append(" bulkVolumeJobsPerNodeMax : ").append(bulkVolumeJobsPerNodeMax).append(",");
        sb.append(" bulkVolumeJobsPerVolumeMax : ").append(bulkVolumeJobsPerVolumeMax).append(",");
        sb.append(" cloneJobsPerVolumeMax : ").append(cloneJobsPerVolumeMax).append(",");
        sb.append(" clusterPairsCountMax : ").append(clusterPairsCountMax).append(",");
        sb.append(" initiatorNameLengthMax : ").append(initiatorNameLengthMax).append(",");
        sb.append(" initiatorsPerVolumeAccessGroupCountMax : ").append(initiatorsPerVolumeAccessGroupCountMax).append(",");
        sb.append(" secretLengthMax : ").append(secretLengthMax).append(",");
        sb.append(" secretLengthMin : ").append(secretLengthMin).append(",");
        sb.append(" snapshotNameLengthMax : ").append(snapshotNameLengthMax).append(",");
        sb.append(" snapshotsPerVolumeMax : ").append(snapshotsPerVolumeMax).append(",");
        sb.append(" volumeAccessGroupCountMax : ").append(volumeAccessGroupCountMax).append(",");
        sb.append(" volumeAccessGroupLunMax : ").append(volumeAccessGroupLunMax).append(",");
        sb.append(" volumeAccessGroupNameLengthMax : ").append(volumeAccessGroupNameLengthMax).append(",");
        sb.append(" volumeAccessGroupNameLengthMin : ").append(volumeAccessGroupNameLengthMin).append(",");
        sb.append(" volumeAccessGroupsPerInitiatorCountMax : ").append(volumeAccessGroupsPerInitiatorCountMax).append(",");
        sb.append(" volumeAccessGroupsPerVolumeCountMax : ").append(volumeAccessGroupsPerVolumeCountMax).append(",");
        sb.append(" volumeBurstIOPSMax : ").append(volumeBurstIOPSMax).append(",");
        sb.append(" volumeBurstIOPSMin : ").append(volumeBurstIOPSMin).append(",");
        sb.append(" volumeCountMax : ").append(volumeCountMax).append(",");
        sb.append(" volumeMaxIOPSMax : ").append(volumeMaxIOPSMax).append(",");
        sb.append(" volumeMaxIOPSMin : ").append(volumeMaxIOPSMin).append(",");
        sb.append(" volumeMinIOPSMax : ").append(volumeMinIOPSMax).append(",");
        sb.append(" volumeMinIOPSMin : ").append(volumeMinIOPSMin).append(",");
        sb.append(" volumeNameLengthMax : ").append(volumeNameLengthMax).append(",");
        sb.append(" volumeNameLengthMin : ").append(volumeNameLengthMin).append(",");
        sb.append(" volumeSizeMax : ").append(volumeSizeMax).append(",");
        sb.append(" volumeSizeMin : ").append(volumeSizeMin).append(",");
        sb.append(" volumesPerAccountCountMax : ").append(volumesPerAccountCountMax).append(",");
        sb.append(" volumesPerGroupSnapshotMax : ").append(volumesPerGroupSnapshotMax).append(",");
        sb.append(" volumesPerVolumeAccessGroupCountMax : ").append(volumesPerVolumeAccessGroupCountMax);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
