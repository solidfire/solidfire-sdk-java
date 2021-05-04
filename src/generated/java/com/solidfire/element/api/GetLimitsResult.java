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
 * GetLimitsResult  
 * Limits for the cluster
 **/

public class GetLimitsResult implements Serializable {

    public static final long serialVersionUID = -9092783588847356842L;
    @SerializedName("accountCountMax") private Long accountCountMax;
    @SerializedName("accountNameLengthMax") private Long accountNameLengthMax;
    @SerializedName("accountNameLengthMin") private Long accountNameLengthMin;
    @SerializedName("bulkVolumeJobsPerNodeMax") private Long bulkVolumeJobsPerNodeMax;
    @SerializedName("bulkVolumeJobsPerVolumeMax") private Long bulkVolumeJobsPerVolumeMax;
    @SerializedName("cloneJobsPerVolumeMax") private Long cloneJobsPerVolumeMax;
    @SerializedName("clusterPairsCountMax") private Long clusterPairsCountMax;
    @SerializedName("initiatorNameLengthMax") private Long initiatorNameLengthMax;
    @SerializedName("initiatorCountMax") private Long initiatorCountMax;
    @SerializedName("initiatorsPerVolumeAccessGroupCountMax") private Long initiatorsPerVolumeAccessGroupCountMax;
    @SerializedName("iscsiSessionsFromFibreChannelNodesMax") private Long iscsiSessionsFromFibreChannelNodesMax;
    @SerializedName("qosPolicyCountMax") private Long qosPolicyCountMax;
    @SerializedName("secretLengthMax") private Long secretLengthMax;
    @SerializedName("scheduleNameLengthMax") private Long scheduleNameLengthMax;
    @SerializedName("secretLengthMin") private Long secretLengthMin;
    @SerializedName("snapshotNameLengthMax") private Long snapshotNameLengthMax;
    @SerializedName("snapshotsPerVolumeMax") private Long snapshotsPerVolumeMax;
    @SerializedName("volumeAccessGroupCountMax") private Long volumeAccessGroupCountMax;
    @SerializedName("volumeAccessGroupLunMax") private Long volumeAccessGroupLunMax;
    @SerializedName("volumeAccessGroupNameLengthMax") private Long volumeAccessGroupNameLengthMax;
    @SerializedName("volumeAccessGroupNameLengthMin") private Long volumeAccessGroupNameLengthMin;
    @SerializedName("volumeAccessGroupsPerInitiatorCountMax") private Long volumeAccessGroupsPerInitiatorCountMax;
    @SerializedName("volumeAccessGroupsPerVolumeCountMax") private Long volumeAccessGroupsPerVolumeCountMax;
    @SerializedName("initiatorAliasLengthMax") private Long initiatorAliasLengthMax;
    @SerializedName("volumeBurstIOPSMax") private Long volumeBurstIOPSMax;
    @SerializedName("volumeBurstIOPSMin") private Long volumeBurstIOPSMin;
    @SerializedName("volumeCountMax") private Long volumeCountMax;
    @SerializedName("volumeMaxIOPSMax") private Long volumeMaxIOPSMax;
    @SerializedName("volumeMaxIOPSMin") private Long volumeMaxIOPSMin;
    @SerializedName("volumeMinIOPSMax") private Long volumeMinIOPSMax;
    @SerializedName("volumeMinIOPSMin") private Long volumeMinIOPSMin;
    @SerializedName("volumeNameLengthMax") private Long volumeNameLengthMax;
    @SerializedName("volumeNameLengthMin") private Long volumeNameLengthMin;
    @SerializedName("volumeSizeMax") private Long volumeSizeMax;
    @SerializedName("volumeSizeMin") private Long volumeSizeMin;
    @SerializedName("volumesPerAccountCountMax") private Long volumesPerAccountCountMax;
    @SerializedName("volumesPerGroupSnapshotMax") private Long volumesPerGroupSnapshotMax;
    @SerializedName("volumesPerVolumeAccessGroupCountMax") private Long volumesPerVolumeAccessGroupCountMax;
    @SerializedName("clusterAdminAccountMax") private Optional<Long> clusterAdminAccountMax;
    @SerializedName("fibreChannelVolumeAccessMax") private Optional<Long> fibreChannelVolumeAccessMax;
    @SerializedName("virtualVolumesPerAccountCountMax") private Optional<Long> virtualVolumesPerAccountCountMax;
    @SerializedName("virtualVolumeCountMax") private Optional<Long> virtualVolumeCountMax;
    // empty constructor
    @Since("7.0")
    public GetLimitsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetLimitsResult(
        Long accountCountMax,
        Long accountNameLengthMax,
        Long accountNameLengthMin,
        Long bulkVolumeJobsPerNodeMax,
        Long bulkVolumeJobsPerVolumeMax,
        Long cloneJobsPerVolumeMax,
        Long clusterPairsCountMax,
        Long initiatorNameLengthMax,
        Long initiatorCountMax,
        Long initiatorsPerVolumeAccessGroupCountMax,
        Long iscsiSessionsFromFibreChannelNodesMax,
        Long secretLengthMax,
        Long secretLengthMin,
        Long snapshotNameLengthMax,
        Long snapshotsPerVolumeMax,
        Long volumeAccessGroupCountMax,
        Long volumeAccessGroupLunMax,
        Long volumeAccessGroupNameLengthMax,
        Long volumeAccessGroupNameLengthMin,
        Long volumeAccessGroupsPerInitiatorCountMax,
        Long volumeAccessGroupsPerVolumeCountMax,
        Long initiatorAliasLengthMax,
        Long volumeBurstIOPSMax,
        Long volumeBurstIOPSMin,
        Long volumeCountMax,
        Long volumeMaxIOPSMax,
        Long volumeMaxIOPSMin,
        Long volumeMinIOPSMax,
        Long volumeMinIOPSMin,
        Long volumeNameLengthMax,
        Long volumeNameLengthMin,
        Long volumeSizeMax,
        Long volumeSizeMin,
        Long volumesPerAccountCountMax,
        Long volumesPerGroupSnapshotMax,
        Long volumesPerVolumeAccessGroupCountMax,
        Optional<Long> clusterAdminAccountMax,
        Optional<Long> fibreChannelVolumeAccessMax,
        Optional<Long> virtualVolumesPerAccountCountMax,
        Optional<Long> virtualVolumeCountMax
    )
    {
        this.accountCountMax = accountCountMax;
        this.accountNameLengthMax = accountNameLengthMax;
        this.accountNameLengthMin = accountNameLengthMin;
        this.bulkVolumeJobsPerNodeMax = bulkVolumeJobsPerNodeMax;
        this.bulkVolumeJobsPerVolumeMax = bulkVolumeJobsPerVolumeMax;
        this.cloneJobsPerVolumeMax = cloneJobsPerVolumeMax;
        this.clusterPairsCountMax = clusterPairsCountMax;
        this.initiatorNameLengthMax = initiatorNameLengthMax;
        this.initiatorCountMax = initiatorCountMax;
        this.initiatorsPerVolumeAccessGroupCountMax = initiatorsPerVolumeAccessGroupCountMax;
        this.iscsiSessionsFromFibreChannelNodesMax = iscsiSessionsFromFibreChannelNodesMax;
        this.secretLengthMax = secretLengthMax;
        this.secretLengthMin = secretLengthMin;
        this.snapshotNameLengthMax = snapshotNameLengthMax;
        this.snapshotsPerVolumeMax = snapshotsPerVolumeMax;
        this.volumeAccessGroupCountMax = volumeAccessGroupCountMax;
        this.volumeAccessGroupLunMax = volumeAccessGroupLunMax;
        this.volumeAccessGroupNameLengthMax = volumeAccessGroupNameLengthMax;
        this.volumeAccessGroupNameLengthMin = volumeAccessGroupNameLengthMin;
        this.volumeAccessGroupsPerInitiatorCountMax = volumeAccessGroupsPerInitiatorCountMax;
        this.volumeAccessGroupsPerVolumeCountMax = volumeAccessGroupsPerVolumeCountMax;
        this.initiatorAliasLengthMax = initiatorAliasLengthMax;
        this.volumeBurstIOPSMax = volumeBurstIOPSMax;
        this.volumeBurstIOPSMin = volumeBurstIOPSMin;
        this.volumeCountMax = volumeCountMax;
        this.volumeMaxIOPSMax = volumeMaxIOPSMax;
        this.volumeMaxIOPSMin = volumeMaxIOPSMin;
        this.volumeMinIOPSMax = volumeMinIOPSMax;
        this.volumeMinIOPSMin = volumeMinIOPSMin;
        this.volumeNameLengthMax = volumeNameLengthMax;
        this.volumeNameLengthMin = volumeNameLengthMin;
        this.volumeSizeMax = volumeSizeMax;
        this.volumeSizeMin = volumeSizeMin;
        this.volumesPerAccountCountMax = volumesPerAccountCountMax;
        this.volumesPerGroupSnapshotMax = volumesPerGroupSnapshotMax;
        this.volumesPerVolumeAccessGroupCountMax = volumesPerVolumeAccessGroupCountMax;
        this.clusterAdminAccountMax = (clusterAdminAccountMax == null) ? Optional.<Long>empty() : clusterAdminAccountMax;
        this.fibreChannelVolumeAccessMax = (fibreChannelVolumeAccessMax == null) ? Optional.<Long>empty() : fibreChannelVolumeAccessMax;
        this.virtualVolumesPerAccountCountMax = (virtualVolumesPerAccountCountMax == null) ? Optional.<Long>empty() : virtualVolumesPerAccountCountMax;
        this.virtualVolumeCountMax = (virtualVolumeCountMax == null) ? Optional.<Long>empty() : virtualVolumeCountMax;
    }
    // parameterized constructor
    @Since("10.0")
    public GetLimitsResult(
        Long accountCountMax,
        Long accountNameLengthMax,
        Long accountNameLengthMin,
        Long bulkVolumeJobsPerNodeMax,
        Long bulkVolumeJobsPerVolumeMax,
        Long cloneJobsPerVolumeMax,
        Long clusterPairsCountMax,
        Long initiatorNameLengthMax,
        Long initiatorCountMax,
        Long initiatorsPerVolumeAccessGroupCountMax,
        Long iscsiSessionsFromFibreChannelNodesMax,
        Long qosPolicyCountMax,
        Long secretLengthMax,
        Long scheduleNameLengthMax,
        Long secretLengthMin,
        Long snapshotNameLengthMax,
        Long snapshotsPerVolumeMax,
        Long volumeAccessGroupCountMax,
        Long volumeAccessGroupLunMax,
        Long volumeAccessGroupNameLengthMax,
        Long volumeAccessGroupNameLengthMin,
        Long volumeAccessGroupsPerInitiatorCountMax,
        Long volumeAccessGroupsPerVolumeCountMax,
        Long initiatorAliasLengthMax,
        Long volumeBurstIOPSMax,
        Long volumeBurstIOPSMin,
        Long volumeCountMax,
        Long volumeMaxIOPSMax,
        Long volumeMaxIOPSMin,
        Long volumeMinIOPSMax,
        Long volumeMinIOPSMin,
        Long volumeNameLengthMax,
        Long volumeNameLengthMin,
        Long volumeSizeMax,
        Long volumeSizeMin,
        Long volumesPerAccountCountMax,
        Long volumesPerGroupSnapshotMax,
        Long volumesPerVolumeAccessGroupCountMax,
        Optional<Long> clusterAdminAccountMax,
        Optional<Long> fibreChannelVolumeAccessMax,
        Optional<Long> virtualVolumesPerAccountCountMax,
        Optional<Long> virtualVolumeCountMax
    )
    {
        this.accountCountMax = accountCountMax;
        this.accountNameLengthMax = accountNameLengthMax;
        this.accountNameLengthMin = accountNameLengthMin;
        this.bulkVolumeJobsPerNodeMax = bulkVolumeJobsPerNodeMax;
        this.bulkVolumeJobsPerVolumeMax = bulkVolumeJobsPerVolumeMax;
        this.cloneJobsPerVolumeMax = cloneJobsPerVolumeMax;
        this.clusterPairsCountMax = clusterPairsCountMax;
        this.initiatorNameLengthMax = initiatorNameLengthMax;
        this.initiatorCountMax = initiatorCountMax;
        this.initiatorsPerVolumeAccessGroupCountMax = initiatorsPerVolumeAccessGroupCountMax;
        this.iscsiSessionsFromFibreChannelNodesMax = iscsiSessionsFromFibreChannelNodesMax;
        this.qosPolicyCountMax = qosPolicyCountMax;
        this.secretLengthMax = secretLengthMax;
        this.scheduleNameLengthMax = scheduleNameLengthMax;
        this.secretLengthMin = secretLengthMin;
        this.snapshotNameLengthMax = snapshotNameLengthMax;
        this.snapshotsPerVolumeMax = snapshotsPerVolumeMax;
        this.volumeAccessGroupCountMax = volumeAccessGroupCountMax;
        this.volumeAccessGroupLunMax = volumeAccessGroupLunMax;
        this.volumeAccessGroupNameLengthMax = volumeAccessGroupNameLengthMax;
        this.volumeAccessGroupNameLengthMin = volumeAccessGroupNameLengthMin;
        this.volumeAccessGroupsPerInitiatorCountMax = volumeAccessGroupsPerInitiatorCountMax;
        this.volumeAccessGroupsPerVolumeCountMax = volumeAccessGroupsPerVolumeCountMax;
        this.initiatorAliasLengthMax = initiatorAliasLengthMax;
        this.volumeBurstIOPSMax = volumeBurstIOPSMax;
        this.volumeBurstIOPSMin = volumeBurstIOPSMin;
        this.volumeCountMax = volumeCountMax;
        this.volumeMaxIOPSMax = volumeMaxIOPSMax;
        this.volumeMaxIOPSMin = volumeMaxIOPSMin;
        this.volumeMinIOPSMax = volumeMinIOPSMax;
        this.volumeMinIOPSMin = volumeMinIOPSMin;
        this.volumeNameLengthMax = volumeNameLengthMax;
        this.volumeNameLengthMin = volumeNameLengthMin;
        this.volumeSizeMax = volumeSizeMax;
        this.volumeSizeMin = volumeSizeMin;
        this.volumesPerAccountCountMax = volumesPerAccountCountMax;
        this.volumesPerGroupSnapshotMax = volumesPerGroupSnapshotMax;
        this.volumesPerVolumeAccessGroupCountMax = volumesPerVolumeAccessGroupCountMax;
        this.clusterAdminAccountMax = (clusterAdminAccountMax == null) ? Optional.<Long>empty() : clusterAdminAccountMax;
        this.fibreChannelVolumeAccessMax = (fibreChannelVolumeAccessMax == null) ? Optional.<Long>empty() : fibreChannelVolumeAccessMax;
        this.virtualVolumesPerAccountCountMax = (virtualVolumesPerAccountCountMax == null) ? Optional.<Long>empty() : virtualVolumesPerAccountCountMax;
        this.virtualVolumeCountMax = (virtualVolumeCountMax == null) ? Optional.<Long>empty() : virtualVolumeCountMax;
    }

    /** 
     * 
     **/
    public Long getAccountCountMax() { return this.accountCountMax; }
   
    public void setAccountCountMax(Long accountCountMax) { 
        this.accountCountMax = accountCountMax;
    }
    /** 
     * 
     **/
    public Long getAccountNameLengthMax() { return this.accountNameLengthMax; }
   
    public void setAccountNameLengthMax(Long accountNameLengthMax) { 
        this.accountNameLengthMax = accountNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getAccountNameLengthMin() { return this.accountNameLengthMin; }
   
    public void setAccountNameLengthMin(Long accountNameLengthMin) { 
        this.accountNameLengthMin = accountNameLengthMin;
    }
    /** 
     * 
     **/
    public Long getBulkVolumeJobsPerNodeMax() { return this.bulkVolumeJobsPerNodeMax; }
   
    public void setBulkVolumeJobsPerNodeMax(Long bulkVolumeJobsPerNodeMax) { 
        this.bulkVolumeJobsPerNodeMax = bulkVolumeJobsPerNodeMax;
    }
    /** 
     * 
     **/
    public Long getBulkVolumeJobsPerVolumeMax() { return this.bulkVolumeJobsPerVolumeMax; }
   
    public void setBulkVolumeJobsPerVolumeMax(Long bulkVolumeJobsPerVolumeMax) { 
        this.bulkVolumeJobsPerVolumeMax = bulkVolumeJobsPerVolumeMax;
    }
    /** 
     * 
     **/
    public Long getCloneJobsPerVolumeMax() { return this.cloneJobsPerVolumeMax; }
   
    public void setCloneJobsPerVolumeMax(Long cloneJobsPerVolumeMax) { 
        this.cloneJobsPerVolumeMax = cloneJobsPerVolumeMax;
    }
    /** 
     * 
     **/
    public Long getClusterPairsCountMax() { return this.clusterPairsCountMax; }
   
    public void setClusterPairsCountMax(Long clusterPairsCountMax) { 
        this.clusterPairsCountMax = clusterPairsCountMax;
    }
    /** 
     * 
     **/
    public Long getInitiatorNameLengthMax() { return this.initiatorNameLengthMax; }
   
    public void setInitiatorNameLengthMax(Long initiatorNameLengthMax) { 
        this.initiatorNameLengthMax = initiatorNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getInitiatorCountMax() { return this.initiatorCountMax; }
   
    public void setInitiatorCountMax(Long initiatorCountMax) { 
        this.initiatorCountMax = initiatorCountMax;
    }
    /** 
     * 
     **/
    public Long getInitiatorsPerVolumeAccessGroupCountMax() { return this.initiatorsPerVolumeAccessGroupCountMax; }
   
    public void setInitiatorsPerVolumeAccessGroupCountMax(Long initiatorsPerVolumeAccessGroupCountMax) { 
        this.initiatorsPerVolumeAccessGroupCountMax = initiatorsPerVolumeAccessGroupCountMax;
    }
    /** 
     * 
     **/
    public Long getIscsiSessionsFromFibreChannelNodesMax() { return this.iscsiSessionsFromFibreChannelNodesMax; }
   
    public void setIscsiSessionsFromFibreChannelNodesMax(Long iscsiSessionsFromFibreChannelNodesMax) { 
        this.iscsiSessionsFromFibreChannelNodesMax = iscsiSessionsFromFibreChannelNodesMax;
    }
    /** 
     * 
     **/
    public Long getQosPolicyCountMax() { return this.qosPolicyCountMax; }
   
    public void setQosPolicyCountMax(Long qosPolicyCountMax) { 
        this.qosPolicyCountMax = qosPolicyCountMax;
    }
    /** 
     * 
     **/
    public Long getSecretLengthMax() { return this.secretLengthMax; }
   
    public void setSecretLengthMax(Long secretLengthMax) { 
        this.secretLengthMax = secretLengthMax;
    }
    /** 
     * 
     **/
    public Long getScheduleNameLengthMax() { return this.scheduleNameLengthMax; }
   
    public void setScheduleNameLengthMax(Long scheduleNameLengthMax) { 
        this.scheduleNameLengthMax = scheduleNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getSecretLengthMin() { return this.secretLengthMin; }
   
    public void setSecretLengthMin(Long secretLengthMin) { 
        this.secretLengthMin = secretLengthMin;
    }
    /** 
     * 
     **/
    public Long getSnapshotNameLengthMax() { return this.snapshotNameLengthMax; }
   
    public void setSnapshotNameLengthMax(Long snapshotNameLengthMax) { 
        this.snapshotNameLengthMax = snapshotNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getSnapshotsPerVolumeMax() { return this.snapshotsPerVolumeMax; }
   
    public void setSnapshotsPerVolumeMax(Long snapshotsPerVolumeMax) { 
        this.snapshotsPerVolumeMax = snapshotsPerVolumeMax;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupCountMax() { return this.volumeAccessGroupCountMax; }
   
    public void setVolumeAccessGroupCountMax(Long volumeAccessGroupCountMax) { 
        this.volumeAccessGroupCountMax = volumeAccessGroupCountMax;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupLunMax() { return this.volumeAccessGroupLunMax; }
   
    public void setVolumeAccessGroupLunMax(Long volumeAccessGroupLunMax) { 
        this.volumeAccessGroupLunMax = volumeAccessGroupLunMax;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupNameLengthMax() { return this.volumeAccessGroupNameLengthMax; }
   
    public void setVolumeAccessGroupNameLengthMax(Long volumeAccessGroupNameLengthMax) { 
        this.volumeAccessGroupNameLengthMax = volumeAccessGroupNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupNameLengthMin() { return this.volumeAccessGroupNameLengthMin; }
   
    public void setVolumeAccessGroupNameLengthMin(Long volumeAccessGroupNameLengthMin) { 
        this.volumeAccessGroupNameLengthMin = volumeAccessGroupNameLengthMin;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupsPerInitiatorCountMax() { return this.volumeAccessGroupsPerInitiatorCountMax; }
   
    public void setVolumeAccessGroupsPerInitiatorCountMax(Long volumeAccessGroupsPerInitiatorCountMax) { 
        this.volumeAccessGroupsPerInitiatorCountMax = volumeAccessGroupsPerInitiatorCountMax;
    }
    /** 
     * 
     **/
    public Long getVolumeAccessGroupsPerVolumeCountMax() { return this.volumeAccessGroupsPerVolumeCountMax; }
   
    public void setVolumeAccessGroupsPerVolumeCountMax(Long volumeAccessGroupsPerVolumeCountMax) { 
        this.volumeAccessGroupsPerVolumeCountMax = volumeAccessGroupsPerVolumeCountMax;
    }
    /** 
     * 
     **/
    public Long getInitiatorAliasLengthMax() { return this.initiatorAliasLengthMax; }
   
    public void setInitiatorAliasLengthMax(Long initiatorAliasLengthMax) { 
        this.initiatorAliasLengthMax = initiatorAliasLengthMax;
    }
    /** 
     * 
     **/
    public Long getVolumeBurstIOPSMax() { return this.volumeBurstIOPSMax; }
   
    public void setVolumeBurstIOPSMax(Long volumeBurstIOPSMax) { 
        this.volumeBurstIOPSMax = volumeBurstIOPSMax;
    }
    /** 
     * 
     **/
    public Long getVolumeBurstIOPSMin() { return this.volumeBurstIOPSMin; }
   
    public void setVolumeBurstIOPSMin(Long volumeBurstIOPSMin) { 
        this.volumeBurstIOPSMin = volumeBurstIOPSMin;
    }
    /** 
     * 
     **/
    public Long getVolumeCountMax() { return this.volumeCountMax; }
   
    public void setVolumeCountMax(Long volumeCountMax) { 
        this.volumeCountMax = volumeCountMax;
    }
    /** 
     * 
     **/
    public Long getVolumeMaxIOPSMax() { return this.volumeMaxIOPSMax; }
   
    public void setVolumeMaxIOPSMax(Long volumeMaxIOPSMax) { 
        this.volumeMaxIOPSMax = volumeMaxIOPSMax;
    }
    /** 
     * 
     **/
    public Long getVolumeMaxIOPSMin() { return this.volumeMaxIOPSMin; }
   
    public void setVolumeMaxIOPSMin(Long volumeMaxIOPSMin) { 
        this.volumeMaxIOPSMin = volumeMaxIOPSMin;
    }
    /** 
     * 
     **/
    public Long getVolumeMinIOPSMax() { return this.volumeMinIOPSMax; }
   
    public void setVolumeMinIOPSMax(Long volumeMinIOPSMax) { 
        this.volumeMinIOPSMax = volumeMinIOPSMax;
    }
    /** 
     * 
     **/
    public Long getVolumeMinIOPSMin() { return this.volumeMinIOPSMin; }
   
    public void setVolumeMinIOPSMin(Long volumeMinIOPSMin) { 
        this.volumeMinIOPSMin = volumeMinIOPSMin;
    }
    /** 
     * 
     **/
    public Long getVolumeNameLengthMax() { return this.volumeNameLengthMax; }
   
    public void setVolumeNameLengthMax(Long volumeNameLengthMax) { 
        this.volumeNameLengthMax = volumeNameLengthMax;
    }
    /** 
     * 
     **/
    public Long getVolumeNameLengthMin() { return this.volumeNameLengthMin; }
   
    public void setVolumeNameLengthMin(Long volumeNameLengthMin) { 
        this.volumeNameLengthMin = volumeNameLengthMin;
    }
    /** 
     * 
     **/
    public Long getVolumeSizeMax() { return this.volumeSizeMax; }
   
    public void setVolumeSizeMax(Long volumeSizeMax) { 
        this.volumeSizeMax = volumeSizeMax;
    }
    /** 
     * 
     **/
    public Long getVolumeSizeMin() { return this.volumeSizeMin; }
   
    public void setVolumeSizeMin(Long volumeSizeMin) { 
        this.volumeSizeMin = volumeSizeMin;
    }
    /** 
     * 
     **/
    public Long getVolumesPerAccountCountMax() { return this.volumesPerAccountCountMax; }
   
    public void setVolumesPerAccountCountMax(Long volumesPerAccountCountMax) { 
        this.volumesPerAccountCountMax = volumesPerAccountCountMax;
    }
    /** 
     * 
     **/
    public Long getVolumesPerGroupSnapshotMax() { return this.volumesPerGroupSnapshotMax; }
   
    public void setVolumesPerGroupSnapshotMax(Long volumesPerGroupSnapshotMax) { 
        this.volumesPerGroupSnapshotMax = volumesPerGroupSnapshotMax;
    }
    /** 
     * 
     **/
    public Long getVolumesPerVolumeAccessGroupCountMax() { return this.volumesPerVolumeAccessGroupCountMax; }
   
    public void setVolumesPerVolumeAccessGroupCountMax(Long volumesPerVolumeAccessGroupCountMax) { 
        this.volumesPerVolumeAccessGroupCountMax = volumesPerVolumeAccessGroupCountMax;
    }
    /** 
     * 
     **/
    public Optional<Long> getClusterAdminAccountMax() { return this.clusterAdminAccountMax; }
   
    public void setClusterAdminAccountMax(Optional<Long> clusterAdminAccountMax) { 
        this.clusterAdminAccountMax = (clusterAdminAccountMax == null) ? Optional.<Long>empty() : clusterAdminAccountMax;
    }
    /** 
     * 
     **/
    public Optional<Long> getFibreChannelVolumeAccessMax() { return this.fibreChannelVolumeAccessMax; }
   
    public void setFibreChannelVolumeAccessMax(Optional<Long> fibreChannelVolumeAccessMax) { 
        this.fibreChannelVolumeAccessMax = (fibreChannelVolumeAccessMax == null) ? Optional.<Long>empty() : fibreChannelVolumeAccessMax;
    }
    /** 
     * 
     **/
    public Optional<Long> getVirtualVolumesPerAccountCountMax() { return this.virtualVolumesPerAccountCountMax; }
   
    public void setVirtualVolumesPerAccountCountMax(Optional<Long> virtualVolumesPerAccountCountMax) { 
        this.virtualVolumesPerAccountCountMax = (virtualVolumesPerAccountCountMax == null) ? Optional.<Long>empty() : virtualVolumesPerAccountCountMax;
    }
    /** 
     * 
     **/
    public Optional<Long> getVirtualVolumeCountMax() { return this.virtualVolumeCountMax; }
   
    public void setVirtualVolumeCountMax(Optional<Long> virtualVolumeCountMax) { 
        this.virtualVolumeCountMax = (virtualVolumeCountMax == null) ? Optional.<Long>empty() : virtualVolumeCountMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLimitsResult that = (GetLimitsResult) o;

        return 
            Objects.equals(accountCountMax, that.accountCountMax) && 
            Objects.equals(accountNameLengthMax, that.accountNameLengthMax) && 
            Objects.equals(accountNameLengthMin, that.accountNameLengthMin) && 
            Objects.equals(bulkVolumeJobsPerNodeMax, that.bulkVolumeJobsPerNodeMax) && 
            Objects.equals(bulkVolumeJobsPerVolumeMax, that.bulkVolumeJobsPerVolumeMax) && 
            Objects.equals(cloneJobsPerVolumeMax, that.cloneJobsPerVolumeMax) && 
            Objects.equals(clusterPairsCountMax, that.clusterPairsCountMax) && 
            Objects.equals(initiatorNameLengthMax, that.initiatorNameLengthMax) && 
            Objects.equals(initiatorCountMax, that.initiatorCountMax) && 
            Objects.equals(initiatorsPerVolumeAccessGroupCountMax, that.initiatorsPerVolumeAccessGroupCountMax) && 
            Objects.equals(iscsiSessionsFromFibreChannelNodesMax, that.iscsiSessionsFromFibreChannelNodesMax) && 
            Objects.equals(qosPolicyCountMax, that.qosPolicyCountMax) && 
            Objects.equals(secretLengthMax, that.secretLengthMax) && 
            Objects.equals(scheduleNameLengthMax, that.scheduleNameLengthMax) && 
            Objects.equals(secretLengthMin, that.secretLengthMin) && 
            Objects.equals(snapshotNameLengthMax, that.snapshotNameLengthMax) && 
            Objects.equals(snapshotsPerVolumeMax, that.snapshotsPerVolumeMax) && 
            Objects.equals(volumeAccessGroupCountMax, that.volumeAccessGroupCountMax) && 
            Objects.equals(volumeAccessGroupLunMax, that.volumeAccessGroupLunMax) && 
            Objects.equals(volumeAccessGroupNameLengthMax, that.volumeAccessGroupNameLengthMax) && 
            Objects.equals(volumeAccessGroupNameLengthMin, that.volumeAccessGroupNameLengthMin) && 
            Objects.equals(volumeAccessGroupsPerInitiatorCountMax, that.volumeAccessGroupsPerInitiatorCountMax) && 
            Objects.equals(volumeAccessGroupsPerVolumeCountMax, that.volumeAccessGroupsPerVolumeCountMax) && 
            Objects.equals(initiatorAliasLengthMax, that.initiatorAliasLengthMax) && 
            Objects.equals(volumeBurstIOPSMax, that.volumeBurstIOPSMax) && 
            Objects.equals(volumeBurstIOPSMin, that.volumeBurstIOPSMin) && 
            Objects.equals(volumeCountMax, that.volumeCountMax) && 
            Objects.equals(volumeMaxIOPSMax, that.volumeMaxIOPSMax) && 
            Objects.equals(volumeMaxIOPSMin, that.volumeMaxIOPSMin) && 
            Objects.equals(volumeMinIOPSMax, that.volumeMinIOPSMax) && 
            Objects.equals(volumeMinIOPSMin, that.volumeMinIOPSMin) && 
            Objects.equals(volumeNameLengthMax, that.volumeNameLengthMax) && 
            Objects.equals(volumeNameLengthMin, that.volumeNameLengthMin) && 
            Objects.equals(volumeSizeMax, that.volumeSizeMax) && 
            Objects.equals(volumeSizeMin, that.volumeSizeMin) && 
            Objects.equals(volumesPerAccountCountMax, that.volumesPerAccountCountMax) && 
            Objects.equals(volumesPerGroupSnapshotMax, that.volumesPerGroupSnapshotMax) && 
            Objects.equals(volumesPerVolumeAccessGroupCountMax, that.volumesPerVolumeAccessGroupCountMax) && 
            Objects.equals(clusterAdminAccountMax, that.clusterAdminAccountMax) && 
            Objects.equals(fibreChannelVolumeAccessMax, that.fibreChannelVolumeAccessMax) && 
            Objects.equals(virtualVolumesPerAccountCountMax, that.virtualVolumesPerAccountCountMax) && 
            Objects.equals(virtualVolumeCountMax, that.virtualVolumeCountMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountCountMax,accountNameLengthMax,accountNameLengthMin,bulkVolumeJobsPerNodeMax,bulkVolumeJobsPerVolumeMax,cloneJobsPerVolumeMax,clusterPairsCountMax,initiatorNameLengthMax,initiatorCountMax,initiatorsPerVolumeAccessGroupCountMax,iscsiSessionsFromFibreChannelNodesMax,qosPolicyCountMax,secretLengthMax,scheduleNameLengthMax,secretLengthMin,snapshotNameLengthMax,snapshotsPerVolumeMax,volumeAccessGroupCountMax,volumeAccessGroupLunMax,volumeAccessGroupNameLengthMax,volumeAccessGroupNameLengthMin,volumeAccessGroupsPerInitiatorCountMax,volumeAccessGroupsPerVolumeCountMax,initiatorAliasLengthMax,volumeBurstIOPSMax,volumeBurstIOPSMin,volumeCountMax,volumeMaxIOPSMax,volumeMaxIOPSMin,volumeMinIOPSMax,volumeMinIOPSMin,volumeNameLengthMax,volumeNameLengthMin,volumeSizeMax,volumeSizeMin,volumesPerAccountCountMax,volumesPerGroupSnapshotMax,volumesPerVolumeAccessGroupCountMax,clusterAdminAccountMax,fibreChannelVolumeAccessMax,virtualVolumesPerAccountCountMax,virtualVolumeCountMax );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountCountMax", accountCountMax);
        map.put("accountNameLengthMax", accountNameLengthMax);
        map.put("accountNameLengthMin", accountNameLengthMin);
        map.put("bulkVolumeJobsPerNodeMax", bulkVolumeJobsPerNodeMax);
        map.put("bulkVolumeJobsPerVolumeMax", bulkVolumeJobsPerVolumeMax);
        map.put("cloneJobsPerVolumeMax", cloneJobsPerVolumeMax);
        map.put("clusterPairsCountMax", clusterPairsCountMax);
        map.put("initiatorNameLengthMax", initiatorNameLengthMax);
        map.put("initiatorCountMax", initiatorCountMax);
        map.put("initiatorsPerVolumeAccessGroupCountMax", initiatorsPerVolumeAccessGroupCountMax);
        map.put("iscsiSessionsFromFibreChannelNodesMax", iscsiSessionsFromFibreChannelNodesMax);
        map.put("qosPolicyCountMax", qosPolicyCountMax);
        map.put("secretLengthMax", secretLengthMax);
        map.put("scheduleNameLengthMax", scheduleNameLengthMax);
        map.put("secretLengthMin", secretLengthMin);
        map.put("snapshotNameLengthMax", snapshotNameLengthMax);
        map.put("snapshotsPerVolumeMax", snapshotsPerVolumeMax);
        map.put("volumeAccessGroupCountMax", volumeAccessGroupCountMax);
        map.put("volumeAccessGroupLunMax", volumeAccessGroupLunMax);
        map.put("volumeAccessGroupNameLengthMax", volumeAccessGroupNameLengthMax);
        map.put("volumeAccessGroupNameLengthMin", volumeAccessGroupNameLengthMin);
        map.put("volumeAccessGroupsPerInitiatorCountMax", volumeAccessGroupsPerInitiatorCountMax);
        map.put("volumeAccessGroupsPerVolumeCountMax", volumeAccessGroupsPerVolumeCountMax);
        map.put("initiatorAliasLengthMax", initiatorAliasLengthMax);
        map.put("volumeBurstIOPSMax", volumeBurstIOPSMax);
        map.put("volumeBurstIOPSMin", volumeBurstIOPSMin);
        map.put("volumeCountMax", volumeCountMax);
        map.put("volumeMaxIOPSMax", volumeMaxIOPSMax);
        map.put("volumeMaxIOPSMin", volumeMaxIOPSMin);
        map.put("volumeMinIOPSMax", volumeMinIOPSMax);
        map.put("volumeMinIOPSMin", volumeMinIOPSMin);
        map.put("volumeNameLengthMax", volumeNameLengthMax);
        map.put("volumeNameLengthMin", volumeNameLengthMin);
        map.put("volumeSizeMax", volumeSizeMax);
        map.put("volumeSizeMin", volumeSizeMin);
        map.put("volumesPerAccountCountMax", volumesPerAccountCountMax);
        map.put("volumesPerGroupSnapshotMax", volumesPerGroupSnapshotMax);
        map.put("volumesPerVolumeAccessGroupCountMax", volumesPerVolumeAccessGroupCountMax);
        map.put("clusterAdminAccountMax", clusterAdminAccountMax);
        map.put("fibreChannelVolumeAccessMax", fibreChannelVolumeAccessMax);
        map.put("virtualVolumesPerAccountCountMax", virtualVolumesPerAccountCountMax);
        map.put("virtualVolumeCountMax", virtualVolumeCountMax);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accountCountMax : ").append(gson.toJson(accountCountMax)).append(",");
        sb.append(" accountNameLengthMax : ").append(gson.toJson(accountNameLengthMax)).append(",");
        sb.append(" accountNameLengthMin : ").append(gson.toJson(accountNameLengthMin)).append(",");
        sb.append(" bulkVolumeJobsPerNodeMax : ").append(gson.toJson(bulkVolumeJobsPerNodeMax)).append(",");
        sb.append(" bulkVolumeJobsPerVolumeMax : ").append(gson.toJson(bulkVolumeJobsPerVolumeMax)).append(",");
        sb.append(" cloneJobsPerVolumeMax : ").append(gson.toJson(cloneJobsPerVolumeMax)).append(",");
        sb.append(" clusterPairsCountMax : ").append(gson.toJson(clusterPairsCountMax)).append(",");
        sb.append(" initiatorNameLengthMax : ").append(gson.toJson(initiatorNameLengthMax)).append(",");
        sb.append(" initiatorCountMax : ").append(gson.toJson(initiatorCountMax)).append(",");
        sb.append(" initiatorsPerVolumeAccessGroupCountMax : ").append(gson.toJson(initiatorsPerVolumeAccessGroupCountMax)).append(",");
        sb.append(" iscsiSessionsFromFibreChannelNodesMax : ").append(gson.toJson(iscsiSessionsFromFibreChannelNodesMax)).append(",");
        sb.append(" qosPolicyCountMax : ").append(gson.toJson(qosPolicyCountMax)).append(",");
        sb.append(" secretLengthMax : ").append(gson.toJson(secretLengthMax)).append(",");
        sb.append(" scheduleNameLengthMax : ").append(gson.toJson(scheduleNameLengthMax)).append(",");
        sb.append(" secretLengthMin : ").append(gson.toJson(secretLengthMin)).append(",");
        sb.append(" snapshotNameLengthMax : ").append(gson.toJson(snapshotNameLengthMax)).append(",");
        sb.append(" snapshotsPerVolumeMax : ").append(gson.toJson(snapshotsPerVolumeMax)).append(",");
        sb.append(" volumeAccessGroupCountMax : ").append(gson.toJson(volumeAccessGroupCountMax)).append(",");
        sb.append(" volumeAccessGroupLunMax : ").append(gson.toJson(volumeAccessGroupLunMax)).append(",");
        sb.append(" volumeAccessGroupNameLengthMax : ").append(gson.toJson(volumeAccessGroupNameLengthMax)).append(",");
        sb.append(" volumeAccessGroupNameLengthMin : ").append(gson.toJson(volumeAccessGroupNameLengthMin)).append(",");
        sb.append(" volumeAccessGroupsPerInitiatorCountMax : ").append(gson.toJson(volumeAccessGroupsPerInitiatorCountMax)).append(",");
        sb.append(" volumeAccessGroupsPerVolumeCountMax : ").append(gson.toJson(volumeAccessGroupsPerVolumeCountMax)).append(",");
        sb.append(" initiatorAliasLengthMax : ").append(gson.toJson(initiatorAliasLengthMax)).append(",");
        sb.append(" volumeBurstIOPSMax : ").append(gson.toJson(volumeBurstIOPSMax)).append(",");
        sb.append(" volumeBurstIOPSMin : ").append(gson.toJson(volumeBurstIOPSMin)).append(",");
        sb.append(" volumeCountMax : ").append(gson.toJson(volumeCountMax)).append(",");
        sb.append(" volumeMaxIOPSMax : ").append(gson.toJson(volumeMaxIOPSMax)).append(",");
        sb.append(" volumeMaxIOPSMin : ").append(gson.toJson(volumeMaxIOPSMin)).append(",");
        sb.append(" volumeMinIOPSMax : ").append(gson.toJson(volumeMinIOPSMax)).append(",");
        sb.append(" volumeMinIOPSMin : ").append(gson.toJson(volumeMinIOPSMin)).append(",");
        sb.append(" volumeNameLengthMax : ").append(gson.toJson(volumeNameLengthMax)).append(",");
        sb.append(" volumeNameLengthMin : ").append(gson.toJson(volumeNameLengthMin)).append(",");
        sb.append(" volumeSizeMax : ").append(gson.toJson(volumeSizeMax)).append(",");
        sb.append(" volumeSizeMin : ").append(gson.toJson(volumeSizeMin)).append(",");
        sb.append(" volumesPerAccountCountMax : ").append(gson.toJson(volumesPerAccountCountMax)).append(",");
        sb.append(" volumesPerGroupSnapshotMax : ").append(gson.toJson(volumesPerGroupSnapshotMax)).append(",");
        sb.append(" volumesPerVolumeAccessGroupCountMax : ").append(gson.toJson(volumesPerVolumeAccessGroupCountMax)).append(",");
        if(null != clusterAdminAccountMax && clusterAdminAccountMax.isPresent()){
            sb.append(" clusterAdminAccountMax : ").append(gson.toJson(clusterAdminAccountMax)).append(",");
        }
        else{
            sb.append(" clusterAdminAccountMax : ").append("null").append(",");
        }
        if(null != fibreChannelVolumeAccessMax && fibreChannelVolumeAccessMax.isPresent()){
            sb.append(" fibreChannelVolumeAccessMax : ").append(gson.toJson(fibreChannelVolumeAccessMax)).append(",");
        }
        else{
            sb.append(" fibreChannelVolumeAccessMax : ").append("null").append(",");
        }
        if(null != virtualVolumesPerAccountCountMax && virtualVolumesPerAccountCountMax.isPresent()){
            sb.append(" virtualVolumesPerAccountCountMax : ").append(gson.toJson(virtualVolumesPerAccountCountMax)).append(",");
        }
        else{
            sb.append(" virtualVolumesPerAccountCountMax : ").append("null").append(",");
        }
        if(null != virtualVolumeCountMax && virtualVolumeCountMax.isPresent()){
            sb.append(" virtualVolumeCountMax : ").append(gson.toJson(virtualVolumeCountMax)).append(",");
        }
        else{
            sb.append(" virtualVolumeCountMax : ").append("null").append(",");
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
        private Long accountCountMax;
        private Long accountNameLengthMax;
        private Long accountNameLengthMin;
        private Long bulkVolumeJobsPerNodeMax;
        private Long bulkVolumeJobsPerVolumeMax;
        private Long cloneJobsPerVolumeMax;
        private Long clusterPairsCountMax;
        private Long initiatorNameLengthMax;
        private Long initiatorCountMax;
        private Long initiatorsPerVolumeAccessGroupCountMax;
        private Long iscsiSessionsFromFibreChannelNodesMax;
        private Long qosPolicyCountMax;
        private Long secretLengthMax;
        private Long scheduleNameLengthMax;
        private Long secretLengthMin;
        private Long snapshotNameLengthMax;
        private Long snapshotsPerVolumeMax;
        private Long volumeAccessGroupCountMax;
        private Long volumeAccessGroupLunMax;
        private Long volumeAccessGroupNameLengthMax;
        private Long volumeAccessGroupNameLengthMin;
        private Long volumeAccessGroupsPerInitiatorCountMax;
        private Long volumeAccessGroupsPerVolumeCountMax;
        private Long initiatorAliasLengthMax;
        private Long volumeBurstIOPSMax;
        private Long volumeBurstIOPSMin;
        private Long volumeCountMax;
        private Long volumeMaxIOPSMax;
        private Long volumeMaxIOPSMin;
        private Long volumeMinIOPSMax;
        private Long volumeMinIOPSMin;
        private Long volumeNameLengthMax;
        private Long volumeNameLengthMin;
        private Long volumeSizeMax;
        private Long volumeSizeMin;
        private Long volumesPerAccountCountMax;
        private Long volumesPerGroupSnapshotMax;
        private Long volumesPerVolumeAccessGroupCountMax;
        private Optional<Long> clusterAdminAccountMax;
        private Optional<Long> fibreChannelVolumeAccessMax;
        private Optional<Long> virtualVolumesPerAccountCountMax;
        private Optional<Long> virtualVolumeCountMax;

        private Builder() { }

        public GetLimitsResult build() {
            return new GetLimitsResult (
                         this.accountCountMax,
                         this.accountNameLengthMax,
                         this.accountNameLengthMin,
                         this.bulkVolumeJobsPerNodeMax,
                         this.bulkVolumeJobsPerVolumeMax,
                         this.cloneJobsPerVolumeMax,
                         this.clusterPairsCountMax,
                         this.initiatorNameLengthMax,
                         this.initiatorCountMax,
                         this.initiatorsPerVolumeAccessGroupCountMax,
                         this.iscsiSessionsFromFibreChannelNodesMax,
                         this.qosPolicyCountMax,
                         this.secretLengthMax,
                         this.scheduleNameLengthMax,
                         this.secretLengthMin,
                         this.snapshotNameLengthMax,
                         this.snapshotsPerVolumeMax,
                         this.volumeAccessGroupCountMax,
                         this.volumeAccessGroupLunMax,
                         this.volumeAccessGroupNameLengthMax,
                         this.volumeAccessGroupNameLengthMin,
                         this.volumeAccessGroupsPerInitiatorCountMax,
                         this.volumeAccessGroupsPerVolumeCountMax,
                         this.initiatorAliasLengthMax,
                         this.volumeBurstIOPSMax,
                         this.volumeBurstIOPSMin,
                         this.volumeCountMax,
                         this.volumeMaxIOPSMax,
                         this.volumeMaxIOPSMin,
                         this.volumeMinIOPSMax,
                         this.volumeMinIOPSMin,
                         this.volumeNameLengthMax,
                         this.volumeNameLengthMin,
                         this.volumeSizeMax,
                         this.volumeSizeMin,
                         this.volumesPerAccountCountMax,
                         this.volumesPerGroupSnapshotMax,
                         this.volumesPerVolumeAccessGroupCountMax,
                         this.clusterAdminAccountMax,
                         this.fibreChannelVolumeAccessMax,
                         this.virtualVolumesPerAccountCountMax,
                         this.virtualVolumeCountMax);
        }

        private GetLimitsResult.Builder buildFrom(final GetLimitsResult req) {
            this.accountCountMax = req.accountCountMax;
            this.accountNameLengthMax = req.accountNameLengthMax;
            this.accountNameLengthMin = req.accountNameLengthMin;
            this.bulkVolumeJobsPerNodeMax = req.bulkVolumeJobsPerNodeMax;
            this.bulkVolumeJobsPerVolumeMax = req.bulkVolumeJobsPerVolumeMax;
            this.cloneJobsPerVolumeMax = req.cloneJobsPerVolumeMax;
            this.clusterPairsCountMax = req.clusterPairsCountMax;
            this.initiatorNameLengthMax = req.initiatorNameLengthMax;
            this.initiatorCountMax = req.initiatorCountMax;
            this.initiatorsPerVolumeAccessGroupCountMax = req.initiatorsPerVolumeAccessGroupCountMax;
            this.iscsiSessionsFromFibreChannelNodesMax = req.iscsiSessionsFromFibreChannelNodesMax;
            this.qosPolicyCountMax = req.qosPolicyCountMax;
            this.secretLengthMax = req.secretLengthMax;
            this.scheduleNameLengthMax = req.scheduleNameLengthMax;
            this.secretLengthMin = req.secretLengthMin;
            this.snapshotNameLengthMax = req.snapshotNameLengthMax;
            this.snapshotsPerVolumeMax = req.snapshotsPerVolumeMax;
            this.volumeAccessGroupCountMax = req.volumeAccessGroupCountMax;
            this.volumeAccessGroupLunMax = req.volumeAccessGroupLunMax;
            this.volumeAccessGroupNameLengthMax = req.volumeAccessGroupNameLengthMax;
            this.volumeAccessGroupNameLengthMin = req.volumeAccessGroupNameLengthMin;
            this.volumeAccessGroupsPerInitiatorCountMax = req.volumeAccessGroupsPerInitiatorCountMax;
            this.volumeAccessGroupsPerVolumeCountMax = req.volumeAccessGroupsPerVolumeCountMax;
            this.initiatorAliasLengthMax = req.initiatorAliasLengthMax;
            this.volumeBurstIOPSMax = req.volumeBurstIOPSMax;
            this.volumeBurstIOPSMin = req.volumeBurstIOPSMin;
            this.volumeCountMax = req.volumeCountMax;
            this.volumeMaxIOPSMax = req.volumeMaxIOPSMax;
            this.volumeMaxIOPSMin = req.volumeMaxIOPSMin;
            this.volumeMinIOPSMax = req.volumeMinIOPSMax;
            this.volumeMinIOPSMin = req.volumeMinIOPSMin;
            this.volumeNameLengthMax = req.volumeNameLengthMax;
            this.volumeNameLengthMin = req.volumeNameLengthMin;
            this.volumeSizeMax = req.volumeSizeMax;
            this.volumeSizeMin = req.volumeSizeMin;
            this.volumesPerAccountCountMax = req.volumesPerAccountCountMax;
            this.volumesPerGroupSnapshotMax = req.volumesPerGroupSnapshotMax;
            this.volumesPerVolumeAccessGroupCountMax = req.volumesPerVolumeAccessGroupCountMax;
            this.clusterAdminAccountMax = req.clusterAdminAccountMax;
            this.fibreChannelVolumeAccessMax = req.fibreChannelVolumeAccessMax;
            this.virtualVolumesPerAccountCountMax = req.virtualVolumesPerAccountCountMax;
            this.virtualVolumeCountMax = req.virtualVolumeCountMax;

            return this;
        }

        public GetLimitsResult.Builder accountCountMax(final Long accountCountMax) {
            this.accountCountMax = accountCountMax;
            return this;
        }

        public GetLimitsResult.Builder accountNameLengthMax(final Long accountNameLengthMax) {
            this.accountNameLengthMax = accountNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder accountNameLengthMin(final Long accountNameLengthMin) {
            this.accountNameLengthMin = accountNameLengthMin;
            return this;
        }

        public GetLimitsResult.Builder bulkVolumeJobsPerNodeMax(final Long bulkVolumeJobsPerNodeMax) {
            this.bulkVolumeJobsPerNodeMax = bulkVolumeJobsPerNodeMax;
            return this;
        }

        public GetLimitsResult.Builder bulkVolumeJobsPerVolumeMax(final Long bulkVolumeJobsPerVolumeMax) {
            this.bulkVolumeJobsPerVolumeMax = bulkVolumeJobsPerVolumeMax;
            return this;
        }

        public GetLimitsResult.Builder cloneJobsPerVolumeMax(final Long cloneJobsPerVolumeMax) {
            this.cloneJobsPerVolumeMax = cloneJobsPerVolumeMax;
            return this;
        }

        public GetLimitsResult.Builder clusterPairsCountMax(final Long clusterPairsCountMax) {
            this.clusterPairsCountMax = clusterPairsCountMax;
            return this;
        }

        public GetLimitsResult.Builder initiatorNameLengthMax(final Long initiatorNameLengthMax) {
            this.initiatorNameLengthMax = initiatorNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder initiatorCountMax(final Long initiatorCountMax) {
            this.initiatorCountMax = initiatorCountMax;
            return this;
        }

        public GetLimitsResult.Builder initiatorsPerVolumeAccessGroupCountMax(final Long initiatorsPerVolumeAccessGroupCountMax) {
            this.initiatorsPerVolumeAccessGroupCountMax = initiatorsPerVolumeAccessGroupCountMax;
            return this;
        }

        public GetLimitsResult.Builder iscsiSessionsFromFibreChannelNodesMax(final Long iscsiSessionsFromFibreChannelNodesMax) {
            this.iscsiSessionsFromFibreChannelNodesMax = iscsiSessionsFromFibreChannelNodesMax;
            return this;
        }

        public GetLimitsResult.Builder qosPolicyCountMax(final Long qosPolicyCountMax) {
            this.qosPolicyCountMax = qosPolicyCountMax;
            return this;
        }

        public GetLimitsResult.Builder secretLengthMax(final Long secretLengthMax) {
            this.secretLengthMax = secretLengthMax;
            return this;
        }

        public GetLimitsResult.Builder scheduleNameLengthMax(final Long scheduleNameLengthMax) {
            this.scheduleNameLengthMax = scheduleNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder secretLengthMin(final Long secretLengthMin) {
            this.secretLengthMin = secretLengthMin;
            return this;
        }

        public GetLimitsResult.Builder snapshotNameLengthMax(final Long snapshotNameLengthMax) {
            this.snapshotNameLengthMax = snapshotNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder snapshotsPerVolumeMax(final Long snapshotsPerVolumeMax) {
            this.snapshotsPerVolumeMax = snapshotsPerVolumeMax;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupCountMax(final Long volumeAccessGroupCountMax) {
            this.volumeAccessGroupCountMax = volumeAccessGroupCountMax;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupLunMax(final Long volumeAccessGroupLunMax) {
            this.volumeAccessGroupLunMax = volumeAccessGroupLunMax;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupNameLengthMax(final Long volumeAccessGroupNameLengthMax) {
            this.volumeAccessGroupNameLengthMax = volumeAccessGroupNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupNameLengthMin(final Long volumeAccessGroupNameLengthMin) {
            this.volumeAccessGroupNameLengthMin = volumeAccessGroupNameLengthMin;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupsPerInitiatorCountMax(final Long volumeAccessGroupsPerInitiatorCountMax) {
            this.volumeAccessGroupsPerInitiatorCountMax = volumeAccessGroupsPerInitiatorCountMax;
            return this;
        }

        public GetLimitsResult.Builder volumeAccessGroupsPerVolumeCountMax(final Long volumeAccessGroupsPerVolumeCountMax) {
            this.volumeAccessGroupsPerVolumeCountMax = volumeAccessGroupsPerVolumeCountMax;
            return this;
        }

        public GetLimitsResult.Builder initiatorAliasLengthMax(final Long initiatorAliasLengthMax) {
            this.initiatorAliasLengthMax = initiatorAliasLengthMax;
            return this;
        }

        public GetLimitsResult.Builder volumeBurstIOPSMax(final Long volumeBurstIOPSMax) {
            this.volumeBurstIOPSMax = volumeBurstIOPSMax;
            return this;
        }

        public GetLimitsResult.Builder volumeBurstIOPSMin(final Long volumeBurstIOPSMin) {
            this.volumeBurstIOPSMin = volumeBurstIOPSMin;
            return this;
        }

        public GetLimitsResult.Builder volumeCountMax(final Long volumeCountMax) {
            this.volumeCountMax = volumeCountMax;
            return this;
        }

        public GetLimitsResult.Builder volumeMaxIOPSMax(final Long volumeMaxIOPSMax) {
            this.volumeMaxIOPSMax = volumeMaxIOPSMax;
            return this;
        }

        public GetLimitsResult.Builder volumeMaxIOPSMin(final Long volumeMaxIOPSMin) {
            this.volumeMaxIOPSMin = volumeMaxIOPSMin;
            return this;
        }

        public GetLimitsResult.Builder volumeMinIOPSMax(final Long volumeMinIOPSMax) {
            this.volumeMinIOPSMax = volumeMinIOPSMax;
            return this;
        }

        public GetLimitsResult.Builder volumeMinIOPSMin(final Long volumeMinIOPSMin) {
            this.volumeMinIOPSMin = volumeMinIOPSMin;
            return this;
        }

        public GetLimitsResult.Builder volumeNameLengthMax(final Long volumeNameLengthMax) {
            this.volumeNameLengthMax = volumeNameLengthMax;
            return this;
        }

        public GetLimitsResult.Builder volumeNameLengthMin(final Long volumeNameLengthMin) {
            this.volumeNameLengthMin = volumeNameLengthMin;
            return this;
        }

        public GetLimitsResult.Builder volumeSizeMax(final Long volumeSizeMax) {
            this.volumeSizeMax = volumeSizeMax;
            return this;
        }

        public GetLimitsResult.Builder volumeSizeMin(final Long volumeSizeMin) {
            this.volumeSizeMin = volumeSizeMin;
            return this;
        }

        public GetLimitsResult.Builder volumesPerAccountCountMax(final Long volumesPerAccountCountMax) {
            this.volumesPerAccountCountMax = volumesPerAccountCountMax;
            return this;
        }

        public GetLimitsResult.Builder volumesPerGroupSnapshotMax(final Long volumesPerGroupSnapshotMax) {
            this.volumesPerGroupSnapshotMax = volumesPerGroupSnapshotMax;
            return this;
        }

        public GetLimitsResult.Builder volumesPerVolumeAccessGroupCountMax(final Long volumesPerVolumeAccessGroupCountMax) {
            this.volumesPerVolumeAccessGroupCountMax = volumesPerVolumeAccessGroupCountMax;
            return this;
        }

        public GetLimitsResult.Builder optionalClusterAdminAccountMax(final Long clusterAdminAccountMax) {
            this.clusterAdminAccountMax = (clusterAdminAccountMax == null) ? Optional.<Long>empty() : Optional.of(clusterAdminAccountMax);
            return this;
        }

        public GetLimitsResult.Builder optionalFibreChannelVolumeAccessMax(final Long fibreChannelVolumeAccessMax) {
            this.fibreChannelVolumeAccessMax = (fibreChannelVolumeAccessMax == null) ? Optional.<Long>empty() : Optional.of(fibreChannelVolumeAccessMax);
            return this;
        }

        public GetLimitsResult.Builder optionalVirtualVolumesPerAccountCountMax(final Long virtualVolumesPerAccountCountMax) {
            this.virtualVolumesPerAccountCountMax = (virtualVolumesPerAccountCountMax == null) ? Optional.<Long>empty() : Optional.of(virtualVolumesPerAccountCountMax);
            return this;
        }

        public GetLimitsResult.Builder optionalVirtualVolumeCountMax(final Long virtualVolumeCountMax) {
            this.virtualVolumeCountMax = (virtualVolumeCountMax == null) ? Optional.<Long>empty() : Optional.of(virtualVolumeCountMax);
            return this;
        }

    }
}
