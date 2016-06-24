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

    @SerializedName("accountCountMax") private final Long accountCountMax;
    @SerializedName("accountNameLengthMax") private final Long accountNameLengthMax;
    @SerializedName("accountNameLengthMin") private final Long accountNameLengthMin;
    @SerializedName("bulkVolumeJobsPerNodeMax") private final Long bulkVolumeJobsPerNodeMax;
    @SerializedName("bulkVolumeJobsPerVolumeMax") private final Long bulkVolumeJobsPerVolumeMax;
    @SerializedName("cloneJobsPerVolumeMax") private final Long cloneJobsPerVolumeMax;
    @SerializedName("clusterPairsCountMax") private final Long clusterPairsCountMax;
    @SerializedName("initiatorNameLengthMax") private final Long initiatorNameLengthMax;
    @SerializedName("initiatorsPerVolumeAccessGroupCountMax") private final Long initiatorsPerVolumeAccessGroupCountMax;
    @SerializedName("secretLengthMax") private final Long secretLengthMax;
    @SerializedName("secretLengthMin") private final Long secretLengthMin;
    @SerializedName("snapshotNameLengthMax") private final Long snapshotNameLengthMax;
    @SerializedName("snapshotsPerVolumeMax") private final Long snapshotsPerVolumeMax;
    @SerializedName("volumeAccessGroupCountMax") private final Long volumeAccessGroupCountMax;
    @SerializedName("volumeAccessGroupLunMax") private final Long volumeAccessGroupLunMax;
    @SerializedName("volumeAccessGroupNameLengthMax") private final Long volumeAccessGroupNameLengthMax;
    @SerializedName("volumeAccessGroupNameLengthMin") private final Long volumeAccessGroupNameLengthMin;
    @SerializedName("volumeAccessGroupsPerInitiatorCountMax") private final Long volumeAccessGroupsPerInitiatorCountMax;
    @SerializedName("volumeAccessGroupsPerVolumeCountMax") private final Long volumeAccessGroupsPerVolumeCountMax;
    @SerializedName("volumeBurstIOPSMax") private final Long volumeBurstIOPSMax;
    @SerializedName("volumeBurstIOPSMin") private final Long volumeBurstIOPSMin;
    @SerializedName("volumeCountMax") private final Long volumeCountMax;
    @SerializedName("volumeMaxIOPSMax") private final Long volumeMaxIOPSMax;
    @SerializedName("volumeMaxIOPSMin") private final Long volumeMaxIOPSMin;
    @SerializedName("volumeMinIOPSMax") private final Long volumeMinIOPSMax;
    @SerializedName("volumeMinIOPSMin") private final Long volumeMinIOPSMin;
    @SerializedName("volumeNameLengthMax") private final Long volumeNameLengthMax;
    @SerializedName("volumeNameLengthMin") private final Long volumeNameLengthMin;
    @SerializedName("volumeSizeMax") private final Long volumeSizeMax;
    @SerializedName("volumeSizeMin") private final Long volumeSizeMin;
    @SerializedName("volumesPerAccountCountMax") private final Long volumesPerAccountCountMax;
    @SerializedName("volumesPerGroupSnapshotMax") private final Long volumesPerGroupSnapshotMax;
    @SerializedName("volumesPerVolumeAccessGroupCountMax") private final Long volumesPerVolumeAccessGroupCountMax;

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
    public GetLimitsResult(Long accountCountMax, Long accountNameLengthMax, Long accountNameLengthMin, Long bulkVolumeJobsPerNodeMax, Long bulkVolumeJobsPerVolumeMax, Long cloneJobsPerVolumeMax, Long clusterPairsCountMax, Long initiatorNameLengthMax, Long initiatorsPerVolumeAccessGroupCountMax, Long secretLengthMax, Long secretLengthMin, Long snapshotNameLengthMax, Long snapshotsPerVolumeMax, Long volumeAccessGroupCountMax, Long volumeAccessGroupLunMax, Long volumeAccessGroupNameLengthMax, Long volumeAccessGroupNameLengthMin, Long volumeAccessGroupsPerInitiatorCountMax, Long volumeAccessGroupsPerVolumeCountMax, Long volumeBurstIOPSMax, Long volumeBurstIOPSMin, Long volumeCountMax, Long volumeMaxIOPSMax, Long volumeMaxIOPSMin, Long volumeMinIOPSMax, Long volumeMinIOPSMin, Long volumeNameLengthMax, Long volumeNameLengthMin, Long volumeSizeMax, Long volumeSizeMin, Long volumesPerAccountCountMax, Long volumesPerGroupSnapshotMax, Long volumesPerVolumeAccessGroupCountMax) {
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

    public Long getAccountCountMax() {
        return this.accountCountMax;
    }
    public Long getAccountNameLengthMax() {
        return this.accountNameLengthMax;
    }
    public Long getAccountNameLengthMin() {
        return this.accountNameLengthMin;
    }
    public Long getBulkVolumeJobsPerNodeMax() {
        return this.bulkVolumeJobsPerNodeMax;
    }
    public Long getBulkVolumeJobsPerVolumeMax() {
        return this.bulkVolumeJobsPerVolumeMax;
    }
    public Long getCloneJobsPerVolumeMax() {
        return this.cloneJobsPerVolumeMax;
    }
    public Long getClusterPairsCountMax() {
        return this.clusterPairsCountMax;
    }
    public Long getInitiatorNameLengthMax() {
        return this.initiatorNameLengthMax;
    }
    public Long getInitiatorsPerVolumeAccessGroupCountMax() {
        return this.initiatorsPerVolumeAccessGroupCountMax;
    }
    public Long getSecretLengthMax() {
        return this.secretLengthMax;
    }
    public Long getSecretLengthMin() {
        return this.secretLengthMin;
    }
    public Long getSnapshotNameLengthMax() {
        return this.snapshotNameLengthMax;
    }
    public Long getSnapshotsPerVolumeMax() {
        return this.snapshotsPerVolumeMax;
    }
    public Long getVolumeAccessGroupCountMax() {
        return this.volumeAccessGroupCountMax;
    }
    public Long getVolumeAccessGroupLunMax() {
        return this.volumeAccessGroupLunMax;
    }
    public Long getVolumeAccessGroupNameLengthMax() {
        return this.volumeAccessGroupNameLengthMax;
    }
    public Long getVolumeAccessGroupNameLengthMin() {
        return this.volumeAccessGroupNameLengthMin;
    }
    public Long getVolumeAccessGroupsPerInitiatorCountMax() {
        return this.volumeAccessGroupsPerInitiatorCountMax;
    }
    public Long getVolumeAccessGroupsPerVolumeCountMax() {
        return this.volumeAccessGroupsPerVolumeCountMax;
    }
    public Long getVolumeBurstIOPSMax() {
        return this.volumeBurstIOPSMax;
    }
    public Long getVolumeBurstIOPSMin() {
        return this.volumeBurstIOPSMin;
    }
    public Long getVolumeCountMax() {
        return this.volumeCountMax;
    }
    public Long getVolumeMaxIOPSMax() {
        return this.volumeMaxIOPSMax;
    }
    public Long getVolumeMaxIOPSMin() {
        return this.volumeMaxIOPSMin;
    }
    public Long getVolumeMinIOPSMax() {
        return this.volumeMinIOPSMax;
    }
    public Long getVolumeMinIOPSMin() {
        return this.volumeMinIOPSMin;
    }
    public Long getVolumeNameLengthMax() {
        return this.volumeNameLengthMax;
    }
    public Long getVolumeNameLengthMin() {
        return this.volumeNameLengthMin;
    }
    public Long getVolumeSizeMax() {
        return this.volumeSizeMax;
    }
    public Long getVolumeSizeMin() {
        return this.volumeSizeMin;
    }
    public Long getVolumesPerAccountCountMax() {
        return this.volumesPerAccountCountMax;
    }
    public Long getVolumesPerGroupSnapshotMax() {
        return this.volumesPerGroupSnapshotMax;
    }
    public Long getVolumesPerVolumeAccessGroupCountMax() {
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
