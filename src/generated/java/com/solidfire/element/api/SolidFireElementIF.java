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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;



/**
 * The API for controlling a SolidFire cluster.
 **/

public interface SolidFireElementIF {

    /**
     * Used to add a new account to the system.
     * New volumes can be created under the new account.
     * The CHAP settings specified for the account applies to all volumes owned by the account.
     *  
     * @param request The request @see com.solidfire.element.api.AddAccountRequest 
     *  
     * @return the response
     **/
    AddAccountResult addAccount(final AddAccountRequest request);

    /**
     * Returns details about an account, given its AccountID.
     *  
     * @param request The request @see com.solidfire.element.api.GetAccountByIDRequest 
     *  
     * @return the response
     **/
    GetAccountResult getAccountByID(final GetAccountByIDRequest request);


    /**
     * Convenience method for getAccountByID 
     *  
     * @param accountID Specifies the account for which details are gathered.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getAccountByID(GetAccountByIDRequest) 
     **/
    GetAccountResult getAccountByID(Long accountID);

    /**
     * Returns details about an account, given its Username.
     *  
     * @param request The request @see com.solidfire.element.api.GetAccountByNameRequest 
     *  
     * @return the response
     **/
    GetAccountResult getAccountByName(final GetAccountByNameRequest request);


    /**
     * Convenience method for getAccountByName 
     *  
     * @param username Username for the account.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getAccountByName(GetAccountByNameRequest) 
     **/
    GetAccountResult getAccountByName(String username);

    /**
     * Returns the entire list of accounts, with optional paging support.
     *  
     * @param request The request @see com.solidfire.element.api.ListAccountsRequest 
     *  
     * @return the response
     **/
    ListAccountsResult listAccounts(final ListAccountsRequest request);


    /**
     * Convenience method for listAccounts 
     *  
     * @param startAccountID Starting AccountID to return.
     *                       If no Account exists with this AccountID,
     *                       the next Account by AccountID order is used as the start of the list.
     *                       To page through the list, pass the AccountID of the last Account in the previous response + 1
     *
     * @param limit Maximum number of AccountInfo objects to return.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listAccounts(ListAccountsRequest) 
     **/
    ListAccountsResult listAccounts(Optional<Long> startAccountID, Optional<Long> limit);

    /**
     * Used to modify an existing account.
     * When locking an account, any existing connections from that account are immediately terminated.
     * When changing CHAP settings, any existing connections continue to be active,
     * and the new CHAP values are only used on subsequent connection or reconnection.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyAccountRequest 
     *  
     * @return the response
     **/
    ModifyAccountResult modifyAccount(final ModifyAccountRequest request);

    /**
     * Used to remove an existing account.
     * All Volumes must be deleted and purged on the account before it can be removed.
     * If volumes on the account are still pending deletion, RemoveAccount cannot be used until DeleteVolume to delete and purge the volumes.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveAccountRequest 
     *  
     * @return the response
     **/
    RemoveAccountResult removeAccount(final RemoveAccountRequest request);


    /**
     * Convenience method for removeAccount 
     *  
     * @param accountID AccountID for the account to remove.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeAccount(RemoveAccountRequest) 
     **/
    RemoveAccountResult removeAccount(Long accountID);

    /**
     * Retrieves the current version of the API and a list of all supported versions.
     *  
     * @param request The request @see com.solidfire.element.api.GetAPIRequest 
     *  
     * @return the response
     **/
    GetAPIResult getAPI(final GetAPIRequest request);


    /**
     * Convenience method for getAPI 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getAPI(GetAPIRequest) 
     **/
    GetAPIResult getAPI();

    /**
     * Used to retrieve the result of asynchronous method calls.
     * Some method calls are long running and do not complete when the initial response is sent.
     * To obtain the result of the method call, polling with GetAsyncResult is required.
     * <br/><br/>
     * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion,
     * but the actual data returned for the operation depends on the original method call and the return data is documented with each method.
     * <br/><br/>
     * The result for a completed asynchronous method call can only be retrieved once.
     * Once the final result has been returned, later attempts returns an error.
     *  
     * @param request The request @see com.solidfire.element.api.GetAsyncResultRequest 
     *  
     * @return the response
     **/
    GetAsyncResultResult getAsyncResult(final GetAsyncResultRequest request);


    /**
     * Convenience method for getAsyncResult 
     *  
     * @param asyncHandle A value that was returned from the original asynchronous method call.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getAsyncResult(GetAsyncResultRequest) 
     **/
    GetAsyncResultResult getAsyncResult(Long asyncHandle);

    /**
     * CreateSnapshot is used to create a point-in-time copy of a volume.
     * A snapshot can be created from any volume or from an existing snapshot.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     *  
     * @param request The request @see com.solidfire.element.api.CreateSnapshotRequest 
     *  
     * @return the response
     **/
    CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request);

    /**
     * DeleteSnapshot is used to delete a snapshot.
     * A snapshot that is currently the &quot;active&quot; snapshot cannot be deleted.
     * You must rollback and make another snapshot &quot;active&quot; before the current snapshot can be deleted.
     * To rollback a snapshot, use RollbackToSnapshot.
     *  
     * @param request The request @see com.solidfire.element.api.DeleteSnapshotRequest 
     *  
     * @return the response
     **/
    DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request);


    /**
     * Convenience method for deleteSnapshot 
     *  
     * @param snapshotID The ID of the snapshot to delete.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#deleteSnapshot(DeleteSnapshotRequest) 
     **/
    DeleteSnapshotResult deleteSnapshot(Long snapshotID);

    /**
     * ListSnapshots is used to return the attributes of each snapshot taken on the volume.
     *  
     * @param request The request @see com.solidfire.element.api.ListSnapshotsRequest 
     *  
     * @return the response
     **/
    ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request);


    /**
     * Convenience method for listSnapshots 
     *  
     * @param volumeID The volume to list snapshots for.
     *                 If not provided, all snapshots for all volumes are returned.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listSnapshots(ListSnapshotsRequest) 
     **/
    ListSnapshotsResult listSnapshots(Optional<Long> volumeID);

    /**
     * ModifySnapshot is used to change the attributes currently assigned to a snapshot.
     * Use this API method to enable the snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     *  
     * @param request The request @see com.solidfire.element.api.ModifySnapshotRequest 
     *  
     * @return the response
     * @since 8.0 
     **/
    @Since("8.0")
    ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request);


    /**
     * Convenience method for modifySnapshot 
     *  
     * @param snapshotID ID of the snapshot.
     *
     * @param expirationTime Use to set the time when the snapshot should be removed.
     *
     * @param enableRemoteReplication Use to enable the snapshot created to be replicated to a remote SolidFire cluster.
     *                                Possible values:
     *                                <br/><b>true</b>: the snapshot will be replicated to remote storage.
     *                                <br/><b>false</b>: Default. No replication.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#modifySnapshot(ModifySnapshotRequest) 
     * @since 8.0 
     **/
    @Since("8.0")
    ModifySnapshotResult modifySnapshot(Long snapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication);

    /**
     * RollbackToSnapshot is used to make an existing snapshot the &quot;active&quot; volume image. This method creates a new 
     * snapshot from an existing snapshot. The new snapshot becomes &quot;active&quot; and the existing snapshot is preserved until 
     * it is manually deleted. The previously &quot;active&quot; snapshot is deleted unless the parameter saveCurrentState is set with 
     * a value of &quot;true.&quot;
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     *  
     * @param request The request @see com.solidfire.element.api.RollbackToSnapshotRequest 
     *  
     * @return the response
     **/
    CreateSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request);

    /**
     * CreateGroupSnapshot is used to create a point-in-time copy of a group of volumes.
     * The snapshot created can then be used later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time in which the snapshot was created.
     * <br/><br/>
     * <b>Note</b>: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     *  
     * @param request The request @see com.solidfire.element.api.CreateGroupSnapshotRequest 
     *  
     * @return the response
     **/
    CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request);

    /**
     * DeleteGroupSnapshot is used to delete a group snapshot.
     * The saveMembers parameter can be used to preserve all the snapshots that
     * were made for the volumes in the group but the group association will be removed.
     *  
     * @param request The request @see com.solidfire.element.api.DeleteGroupSnapshotRequest 
     *  
     * @return the response
     **/
    DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request);


    /**
     * Convenience method for deleteGroupSnapshot 
     *  
     * @param groupSnapshotID Unique ID of the group snapshot.
     *
     * @param saveMembers <br/><b>true</b>: Snapshots are kept, but group association is removed.
     *                    <br/><b>false</b>: The group and snapshots are deleted.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#deleteGroupSnapshot(DeleteGroupSnapshotRequest) 
     **/
    DeleteGroupSnapshotResult deleteGroupSnapshot(Long groupSnapshotID, Boolean saveMembers);

    /**
     * ListGroupSnapshots is used to return information about all group snapshots that have been created.
     *  
     * @param request The request @see com.solidfire.element.api.ListGroupSnapshotsRequest 
     *  
     * @return the response
     **/
    ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request);


    /**
     * Convenience method for listGroupSnapshots 
     *  
     * @param volumeID An array of unique volume IDs to query.
     *                 If this parameter is not specified, all group snapshots on the cluster will be included.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listGroupSnapshots(ListGroupSnapshotsRequest) 
     **/
    ListGroupSnapshotsResult listGroupSnapshots(Optional<Long> volumeID);

    /**
     * ModifyGroupSnapshot is used to change the attributes currently assigned to a group snapshot.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyGroupSnapshotRequest 
     *  
     * @return the response
     * @since 8.0 
     **/
    @Since("8.0")
    ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request);


    /**
     * Convenience method for modifyGroupSnapshot 
     *  
     * @param groupSnapshotID ID of the snapshot.
     *
     * @param expirationTime Use to set the time when the snapshot should be removed.
     *
     * @param enableRemoteReplication Use to enable the snapshot created to be replicated to a remote SolidFire cluster.
     *                                Possible values:
     *                                <br/><b>true</b>: the snapshot will be replicated to remote storage.
     *                                <br/><b>false</b>: Default. No replication.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#modifyGroupSnapshot(ModifyGroupSnapshotRequest) 
     * @since 8.0 
     **/
    @Since("8.0")
    ModifyGroupSnapshotResult modifyGroupSnapshot(Long groupSnapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication);

    /**
     * RollbackToGroupSnapshot is used to roll back each individual volume in a snapshot group to a copy of their individual snapshots.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     *  
     * @param request The request @see com.solidfire.element.api.RollbackToGroupSnapshotRequest 
     *  
     * @return the response
     * @since 7.0 
     **/
    @Since("7.0")
    CreateGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request);

    /**
     * CloneVolume is used to create a copy of the volume.
     * This method is asynchronous and may take a variable amount of time to complete.
     * The cloning process begins immediately when the CloneVolume request is made and is representative of the state of the volume when the API method is issued.
     * GetAsyncResults can be used to determine when the cloning process is complete and the new volume is available for connections.
     * ListSyncJobs can be used to see the progress of creating the clone.
     * <br/><br/>
     * <b>Note</b>: The initial attributes and quality of service settings for the volume are inherited from the volume being cloned.
     * If different settings are required, they can be changed via ModifyVolume.
     * <br/><br/>
     * <b>Note</b>: Cloned volumes do not inherit volume access group memberships from the source volume.
     *  
     * @param request The request @see com.solidfire.element.api.CloneVolumeRequest 
     *  
     * @return the response
     **/
    CloneVolumeResult cloneVolume(final CloneVolumeRequest request);

    /**
     * CreateVolume is used to create a new (empty) volume on the cluster.
     * When the volume is created successfully it is available for connection via iSCSI.
     *  
     * @param request The request @see com.solidfire.element.api.CreateVolumeRequest 
     *  
     * @return the response
     **/
    CreateVolumeResult createVolume(final CreateVolumeRequest request);

    /**
     * DeleteVolume marks an active volume for deletion.
     * It is purged (permanently deleted) after the cleanup interval elapses.
     * After making a request to delete a volume, any active iSCSI connections to the volume is immediately terminated and no further connections are allowed while the volume is in this state.
     * It is not returned in target discovery requests.
     * <br/><br/>
     * Any snapshots of a volume that has been marked to delete are not affected.
     * Snapshots are kept until the volume is purged from the system.
     * <br/><br/>
     * If a volume is marked for deletion, and it has a bulk volume read or bulk volume write operation in progress, the bulk volume operation is stopped.
     * <br/><br/>
     * If the volume you delete is paired with a volume, replication between the paired volumes is suspended and no data is transferred to it or from it while in a deleted state.
     * The remote volume the deleted volume was paired with enters into a PausedMisconfigured state and data is no longer sent to it or from the deleted volume.
     * Until the deleted volume is purged, it can be restored and data transfers resumes.
     * If the deleted volume gets purged from the system, the volume it was paired with enters into a StoppedMisconfigured state and the volume pairing status is removed.
     * The purged volume becomes permanently unavailable.
     *  
     * @param request The request @see com.solidfire.element.api.DeleteVolumeRequest 
     *  
     * @return the response
     **/
    DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request);


    /**
     * Convenience method for deleteVolume 
     *  
     * @param volumeID The ID of the volume to delete.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#deleteVolume(DeleteVolumeRequest) 
     **/
    DeleteVolumeResult deleteVolume(Long volumeID);

    /**
     * GetVolumeStats is used to retrieve high-level activity measurements for a single volume.
     * Values are cumulative from the creation of the volume.
     *  
     * @param request The request @see com.solidfire.element.api.GetVolumeStatsRequest 
     *  
     * @return the response
     **/
    GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request);


    /**
     * Convenience method for getVolumeStats 
     *  
     * @param volumeID Specifies the volume for which statistics is gathered.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getVolumeStats(GetVolumeStatsRequest) 
     **/
    GetVolumeStatsResult getVolumeStats(Long volumeID);

    /**
     * GetVolumeEfficiency is used to retrieve information about a volume.
     * Only the volume given as a parameter in this API method is used to compute the capacity.
     *  
     * @param request The request @see com.solidfire.element.api.GetVolumeEfficiencyRequest 
     *  
     * @return the response
     **/
    GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request);


    /**
     * Convenience method for getVolumeEfficiency 
     *  
     * @param volumeID Specifies the volume for which capacity is computed.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getVolumeEfficiency(GetVolumeEfficiencyRequest) 
     **/
    GetVolumeEfficiencyResult getVolumeEfficiency(Long volumeID, Optional<Boolean> force);

    /**
     * ListActiveVolumes is used to return the list of active volumes currently in the system.
     * The list of volumes is returned sorted in VolumeID order and can be returned in multiple parts (pages).
     *  
     * @param request The request @see com.solidfire.element.api.ListActiveVolumesRequest 
     *  
     * @return the response
     **/
    ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request);


    /**
     * Convenience method for listActiveVolumes 
     *  
     * @param startVolumeID The ID of the first volume to list.
     *                      This can be useful for paging results.
     *                      By default, this starts at the lowest VolumeID.
     *
     * @param limit The maximum number of volumes to return from the API.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listActiveVolumes(ListActiveVolumesRequest) 
     **/
    ListActiveVolumesResult listActiveVolumes(Optional<Long> startVolumeID, Optional<Long> limit);

    /**
     * ListDeletedVolumes is used to return the entire list of volumes that have been marked for deletion and is purged from the system.
     *  
     * @param request The request @see com.solidfire.element.api.ListDeletedVolumesRequest 
     *  
     * @return the response
     **/
    ListDeletedVolumesResult listDeletedVolumes(final ListDeletedVolumesRequest request);


    /**
     * Convenience method for listDeletedVolumes 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listDeletedVolumes(ListDeletedVolumesRequest) 
     **/
    ListDeletedVolumesResult listDeletedVolumes();

    /**
     * The ListVolumes method is used to return a list of volumes that are in a cluster.
     * You can specify the volumes you want to return in the list by using the available parameters.
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumesRequest 
     *  
     * @return the response
     * @since 8.0 
     **/
    @Since("8.0")
    ListVolumesResult listVolumes(final ListVolumesRequest request);

    /**
     * ListVolumesForAccount returns the list of active AND (pending) deleted volumes for an account.
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumesForAccountRequest 
     *  
     * @return the response
     **/
    ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request);


    /**
     * Convenience method for listVolumesForAccount 
     *  
     * @param accountID The ID of the account to list the volumes for.
     *
     * @param startVolumeID The ID of the first volume to list.
     *                      This can be useful for paging results.
     *                      By default, this starts at the lowest VolumeID.
     *
     * @param limit The maximum number of volumes to return from the API.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listVolumesForAccount(ListVolumesForAccountRequest) 
     **/
    ListVolumesForAccountResult listVolumesForAccount(Long accountID, Optional<Long> startVolumeID, Optional<Long> limit);

    /**
     * ListVolumeStatsByAccount returns high-level activity measurements for every account.
     * Values are summed from all the volumes owned by the account.
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumeStatsByAccountRequest 
     *  
     * @return the response
     **/
    ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request);


    /**
     * Convenience method for listVolumeStatsByAccount 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listVolumeStatsByAccount(ListVolumeStatsByAccountRequest) 
     **/
    ListVolumeStatsByAccountResult listVolumeStatsByAccount();

    /**
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume.
     * Values are cumulative from the creation of the volume.
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumeStatsByVolumeRequest 
     *  
     * @return the response
     **/
    ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request);


    /**
     * Convenience method for listVolumeStatsByVolume 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listVolumeStatsByVolume(ListVolumeStatsByVolumeRequest) 
     **/
    ListVolumeStatsByVolumeResult listVolumeStatsByVolume();

    /**
     * ListVolumeStatsByVolumeAccessGroup is used to get total activity measurements for all of the volumes that are a member of the specified volume access group(s).
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumeStatsByVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request);


    /**
     * Convenience method for listVolumeStatsByVolumeAccessGroup 
     *  
     * @param volumeAccessGroups An array of VolumeAccessGroupIDs for which volume activity is returned.
     *                           If no VolumeAccessGroupID is specified, stats for all volume access groups is returned.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listVolumeStatsByVolumeAccessGroup(ListVolumeStatsByVolumeAccessGroupRequest) 
     **/
    ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(Optional<Long[]> volumeAccessGroups);

    /**
     * ModifyVolume is used to modify settings on an existing volume.
     * Modifications can be made to one volume at a time and changes take place immediately.
     * If an optional parameter is left unspecified, the value will not be changed.
     * <br/><br/>
     * Extending the size of a volume that is being replicated should be done in an order.
     * The target (Replication Target) volume should first be increased in size, then the source (Read/Write) volume can be resized.
     * It is recommended that both the target and the source volumes be the same size.
     * <br/><br/>
     * <b>Note</b>: If you change access status to locked or target all existing iSCSI connections are terminated.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyVolumeRequest 
     *  
     * @return the response
     **/
    ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request);

    /**
     * PurgeDeletedVolume immediately and permanently purges a volume which has been deleted.
     * A volume must be deleted using DeleteVolume before it can be purged.
     * Volumes are purged automatically after a period of time, so usage of this method is not typically required.
     *  
     * @param request The request @see com.solidfire.element.api.PurgeDeletedVolumeRequest 
     *  
     * @return the response
     **/
    PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request);


    /**
     * Convenience method for purgeDeletedVolume 
     *  
     * @param volumeID The ID of the volume to purge.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#purgeDeletedVolume(PurgeDeletedVolumeRequest) 
     **/
    PurgeDeletedVolumeResult purgeDeletedVolume(Long volumeID);

    /**
     * RestoreDeletedVolume marks a deleted volume as active again.
     * This action makes the volume immediately available for iSCSI connection.
     *  
     * @param request The request @see com.solidfire.element.api.RestoreDeletedVolumeRequest 
     *  
     * @return the response
     **/
    RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request);


    /**
     * Convenience method for restoreDeletedVolume 
     *  
     * @param volumeID RestoreDeletedVolume
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#restoreDeletedVolume(RestoreDeletedVolumeRequest) 
     **/
    RestoreDeletedVolumeResult restoreDeletedVolume(Long volumeID);

    /**
     * Creates a new volume access group.
     * The new volume access group must be given a name when it is created.
     * Entering initiators and volumes are optional when creating a volume access group.
     * Once the group is created volumes and initiator IQNs can be added.
     * Any initiator IQN that is successfully added to the volume access group is able to access any volume in the group without CHAP authentication.
     *  
     * @param request The request @see com.solidfire.element.api.CreateVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request);

    /**
     * ListVolumeAccessGroups is used to return information about the volume access groups that are currently in the system.
     *  
     * @param request The request @see com.solidfire.element.api.ListVolumeAccessGroupsRequest 
     *  
     * @return the response
     **/
    ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request);


    /**
     * Convenience method for listVolumeAccessGroups 
     *  
     * @param startVolumeAccessGroupID The lowest VolumeAccessGroupID to return.
     *                                 This can be useful for paging.
     *                                 If unspecified, there is no lower limit (implicitly 0).
     *
     * @param limit The maximum number of results to return.
     *              This can be useful for paging.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listVolumeAccessGroups(ListVolumeAccessGroupsRequest) 
     **/
    ListVolumeAccessGroupsResult listVolumeAccessGroups(Optional<Long> startVolumeAccessGroupID, Optional<Long> limit);

    /**
     * Delete a volume access group from the system.
     *  
     * @param request The request @see com.solidfire.element.api.DeleteVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request);


    /**
     * Convenience method for deleteVolumeAccessGroup 
     *  
     * @param volumeAccessGroupID The ID of the volume access group to delete.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#deleteVolumeAccessGroup(DeleteVolumeAccessGroupRequest) 
     **/
    DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(Long volumeAccessGroupID);

    /**
     * Update initiators and add or remove volumes from a volume access group.
     * A specified initiator or volume that duplicates an existing volume or initiator in a volume access group is left as-is.
     * If a value is not specified for volumes or initiators, the current list of initiators and volumes are not changed.
     * <br/><br/>
     * Often, it is easier to use the convenience functions to modify initiators and volumes independently:
     * <br/><br/>
     * AddInitiatorsToVolumeAccessGroup<br/>
     * RemoveInitiatorsFromVolumeAccessGroup<br/>
     * AddVolumesToVolumeAccessGroup<br/>
     * RemoveVolumesFromVolumeAccessGroup<br/>
     *  
     * @param request The request @see com.solidfire.element.api.ModifyVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request);

    /**
     * Add initiators to a volume access group.
     *  
     * @param request The request @see com.solidfire.element.api.AddInitiatorsToVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request);


    /**
     * Convenience method for addInitiatorsToVolumeAccessGroup 
     *  
     * @param volumeAccessGroupID The ID of the volume access group to modify.
     *
     * @param initiators List of initiators to add to the volume access group.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#addInitiatorsToVolumeAccessGroup(AddInitiatorsToVolumeAccessGroupRequest) 
     **/
    ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators);

    /**
     * Remove initiators from a volume access group.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveInitiatorsFromVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request);


    /**
     * Convenience method for removeInitiatorsFromVolumeAccessGroup 
     *  
     * @param volumeAccessGroupID The ID of the volume access group to modify.
     *
     * @param initiators List of initiators to remove from the volume access group.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeInitiatorsFromVolumeAccessGroup(RemoveInitiatorsFromVolumeAccessGroupRequest) 
     **/
    ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators);

    /**
     * Add volumes to a volume access group.
     *  
     * @param request The request @see com.solidfire.element.api.AddVolumesToVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request);


    /**
     * Convenience method for addVolumesToVolumeAccessGroup 
     *  
     * @param volumeAccessGroupID The ID of the volume access group to modify.
     *
     * @param volumes List of volumes to add to this volume access group.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#addVolumesToVolumeAccessGroup(AddVolumesToVolumeAccessGroupRequest) 
     **/
    ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes);

    /**
     * Remove volumes from a volume access group.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveVolumesFromVolumeAccessGroupRequest 
     *  
     * @return the response
     **/
    ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request);


    /**
     * Convenience method for removeVolumesFromVolumeAccessGroup 
     *  
     * @param volumeAccessGroupID The ID of the volume access group to modify.
     *
     * @param volumes List of volumes to remove from this volume access group.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeVolumesFromVolumeAccessGroup(RemoveVolumesFromVolumeAccessGroupRequest) 
     **/
    ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes);

}
