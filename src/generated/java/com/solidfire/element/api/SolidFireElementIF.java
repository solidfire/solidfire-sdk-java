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
    GetAccountResult getAccountByID(long accountID);

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
    RemoveAccountResult removeAccount(long accountID);

    /**
     * Return the high-level capacity measurements for an entire cluster.
     * The fields returned from this method can be used to calculate the efficiency rates that are displayed in the Element User Interface.
     *  
     * @param request The request @see com.solidfire.element.api.GetClusterCapacityRequest 
     *  
     * @return the response
     **/
    GetClusterCapacityResult getClusterCapacity(final GetClusterCapacityRequest request);


    /**
     * Convenience method for getClusterCapacity 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getClusterCapacity(GetClusterCapacityRequest) 
     **/
    GetClusterCapacityResult getClusterCapacity();

    /**
     * Return configuration information about the cluster.
     *  
     * @param request The request @see com.solidfire.element.api.GetClusterInfoRequest 
     *  
     * @return the response
     **/
    GetClusterInfoResult getClusterInfo(final GetClusterInfoRequest request);


    /**
     * Convenience method for getClusterInfo 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getClusterInfo(GetClusterInfoRequest) 
     **/
    GetClusterInfoResult getClusterInfo();

    /**
     * Return information about the Element software version running on each node in the cluster.
     * Information about the nodes that are currently in the process of upgrading software is also returned.
     *  
     * @param request The request @see com.solidfire.element.api.GetClusterVersionInfoRequest 
     *  
     * @return the response
     **/
    GetClusterVersionInfoResult getClusterVersionInfo(final GetClusterVersionInfoRequest request);


    /**
     * Convenience method for getClusterVersionInfo 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getClusterVersionInfo(GetClusterVersionInfoRequest) 
     **/
    GetClusterVersionInfoResult getClusterVersionInfo();

    /**
     * Retrieves the limit values set by the API
     *  
     * @param request The request @see com.solidfire.element.api.GetLimitsRequest 
     *  
     * @return the response
     **/
    GetLimitsResult getLimits(final GetLimitsRequest request);


    /**
     * Convenience method for getLimits 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getLimits(GetLimitsRequest) 
     **/
    GetLimitsResult getLimits();

    /**
     * Returns events detected on the cluster, sorted from oldest to newest.
     *  
     * @param request The request @see com.solidfire.element.api.ListEventsRequest 
     *  
     * @return the response
     **/
    ListEventsResult listEvents(final ListEventsRequest request);

    /**
     * Gets the list of cluster faults
     *  
     * @param request The request @see com.solidfire.element.api.ListClusterFaultsRequest 
     *  
     * @return the response
     **/
    ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request);

    /**
     * ClearClusterFaults is used to clear information about both current faults that are resolved as well as faults that were previously detected and resolved can be cleared.
     *  
     * @param request The request @see com.solidfire.element.api.ClearClusterFaultsRequest 
     *  
     * @return the response
     **/
    ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request);


    /**
     * Convenience method for clearClusterFaults 
     *  
     * @param faultTypes Determines the types of faults cleared:<br/>
     *                   <b>current</b>: Faults that are currently detected and have not been resolved.<br/>
     *                   <b>resolved</b>: Faults that were previously detected and resolved.<br/>
     *                   <b>all</b>: Both current and resolved faults are cleared. The fault status can be determined by the &quot;resolved&quot; field of the fault object.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#clearClusterFaults(ClearClusterFaultsRequest) 
     **/
    ClearClusterFaultsResult clearClusterFaults(Optional<String> faultTypes);

    /**
     * The GetClusterConfig API method is used to return information about the cluster configuration this node uses to communicate with the cluster it is a part of.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.GetClusterConfigRequest 
     *  
     * @return the response
     **/
    GetClusterConfigResult getClusterConfig(final GetClusterConfigRequest request);


    /**
     * Convenience method for getClusterConfig 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getClusterConfig(GetClusterConfigRequest) 
     **/
    GetClusterConfigResult getClusterConfig();

    /**
     * GetClusterFullThreshold is used to view the stages set for cluster fullness levels. All levels are returned when this method is entered.
     *  
     * @param request The request @see com.solidfire.element.api.GetClusterFullThresholdRequest 
     *  
     * @return the response
     **/
    GetClusterFullThresholdResult getClusterFullThreshold(final GetClusterFullThresholdRequest request);


    /**
     * Convenience method for getClusterFullThreshold 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getClusterFullThreshold(GetClusterFullThresholdRequest) 
     **/
    GetClusterFullThresholdResult getClusterFullThreshold();

    /**
     * ModifyClusterFullThreshold is used to change the level at which an event is generated when the storage cluster approaches the capacity utilization requested. The number entered in this setting is used to indicate the number of node failures the system is required to recover from. For example, on a 10 node cluster, if you want to be alerted when the system cannot recover from 3 nodes failures, enter the value of "3". When this number is reached, a message alert is sent to the Event Log in the Cluster Management Console.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyClusterFullThresholdRequest 
     *  
     * @return the response
     **/
    ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request);


    /**
     * Convenience method for modifyClusterFullThreshold 
     *  
     * @param stage2AwareThreshold Number of nodes worth of capacity remaining on the cluster that triggers a notification.
     *
     * @param stage3BlockThresholdPercent Percent below "Error" state to raise a cluster "Warning" alert.
     *
     * @param maxMetadataOverProvisionFactor A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#modifyClusterFullThreshold(ModifyClusterFullThresholdRequest) 
     **/
    ModifyClusterFullThresholdResult modifyClusterFullThreshold(Optional<Long> stage2AwareThreshold, Optional<Long> stage3BlockThresholdPercent, Optional<Long> maxMetadataOverProvisionFactor);

    /**
     * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be several cluster administrators that have different levels of permissions. There can be only one primary cluster administrator in the system. The primary Cluster Admin is the administrator that was created when the cluster was created. LDAP administrators can also be created when setting up an LDAP system on the cluster.
     *  
     * @param request The request @see com.solidfire.element.api.ListClusterAdminsRequest 
     *  
     * @return the response
     **/
    ListClusterAdminsResult listClusterAdmins(final ListClusterAdminsRequest request);


    /**
     * Convenience method for listClusterAdmins 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listClusterAdmins(ListClusterAdminsRequest) 
     **/
    ListClusterAdminsResult listClusterAdmins();

    /**
     * AddClusterAdmin adds a new Cluster Admin. A Cluster Admin can be used to manage the cluster via the API and management tools. Cluster Admins are completely separate and unrelated to standard tenant accounts.
     * <br/><br/>
     * Each Cluster Admin can be restricted to a sub-set of the API. SolidFire recommends using multiple Cluster Admins for different users and applications. Each Cluster Admin should be given the minimal permissions necessary to reduce the potential impact of credential compromise.
     *  
     * @param request The request @see com.solidfire.element.api.AddClusterAdminRequest 
     *  
     * @return the response
     **/
    AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request);

    /**
     * ModifyClusterAdmin is used to change the settings for a Cluster Admin or LDAP Cluster Admin. Access for the administrator Cluster Admin account cannot be changed.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyClusterAdminRequest 
     *  
     * @return the response
     **/
    ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request);

    /**
     * RemoveClusterAdmin is used to remove a Cluster Admin. The &quot;admin&quot; Cluster Admin cannot be removed.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveClusterAdminRequest 
     *  
     * @return the response
     **/
    RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request);


    /**
     * Convenience method for removeClusterAdmin 
     *  
     * @param clusterAdminID ClusterAdminID for the Cluster Admin to remove.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeClusterAdmin(RemoveClusterAdminRequest) 
     **/
    RemoveClusterAdminResult removeClusterAdmin(long clusterAdminID);

    /**
     * The SetClusterConfig API method is used to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified see Cluster Object on page 109. To display the current cluster interface settings for a node, run the GetClusterConfig API method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.SetClusterConfigRequest 
     *  
     * @return the response
     **/
    SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request);


    /**
     * Convenience method for setClusterConfig 
     *  
     * @param cluster Objects that are changed for the cluster interface settings. Only the fields you want changed need to be added to this method as objects in the &quot;cluster&quot; parameter.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#setClusterConfig(SetClusterConfigRequest) 
     **/
    SetClusterConfigResult setClusterConfig(ClusterConfig cluster);

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
     * GetCurrentClusterAdmin returns information for the current primary cluster administrator. The primary Cluster Admin was ncreated when the cluster was created.
     *  
     * @param request The request @see com.solidfire.element.api.GetCurrentClusterAdminRequest 
     *  
     * @return the response
     **/
    GetCurrentClusterAdminResult getCurrentClusterAdmin(final GetCurrentClusterAdminRequest request);


    /**
     * Convenience method for getCurrentClusterAdmin 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getCurrentClusterAdmin(GetCurrentClusterAdminRequest) 
     **/
    GetCurrentClusterAdminResult getCurrentClusterAdmin();

    /**
     * The EnableEncryptionAtRest method is used to enable the Advanced Encryption Standard (AES) 256-bit encryption at rest on the cluster so that the cluster can manage the encryption key used for the drives on each node. This feature is not enabled by default. Enabling this operation allows the cluster to automatically manage encryption keys internally for the drives on each node in the cluster. Nodes do not store the keys to unlock drives and the keys are never passed over the network. Two nodes participating in a cluster are required to access the key to disable encryption on a drive. The encryption management does not affect performance or efficiency on the cluster. If an encryption-enabled drive or node is removed from the cluster with the API, all data is secure erased and any data left on the drive cannot be read or accessed.
     * Enabling or disabling encryption should be performed when the cluster is running and in a healthy state. Encryption can be enabled or disabled at your discretion and can be performed as often as you need.
     * <b>Note</b>: This process is asynchronous and returns a response before encryption is enabled. The GetClusterInfo method can be used to poll the system to see when the process has completed.
     *  
     * @param request The request @see com.solidfire.element.api.EnableEncryptionAtRestRequest 
     *  
     * @return the response
     **/
    EnableEncryptionAtRestResult enableEncryptionAtRest(final EnableEncryptionAtRestRequest request);


    /**
     * Convenience method for enableEncryptionAtRest 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#enableEncryptionAtRest(EnableEncryptionAtRestRequest) 
     **/
    EnableEncryptionAtRestResult enableEncryptionAtRest();

    /**
     * The DisableEncryptionAtRest method is used to remove the encryption that was previously applied to the cluster using the EnableEncryptionAtRest method.
     * Enabling or disabling encryption should be performed when the cluster is running and in a healthy state. Encryption can be enabled or disabled at your discretion and can be performed as often as you need.
     * <b>Note</b>: This process is asynchronous and returns a response before encryption is disabled. The GetClusterInfo method can be used to poll the system to see when the process has completed.
     *  
     * @param request The request @see com.solidfire.element.api.DisableEncryptionAtRestRequest 
     *  
     * @return the response
     **/
    DisableEncryptionAtRestResult disableEncryptionAtRest(final DisableEncryptionAtRestRequest request);


    /**
     * Convenience method for disableEncryptionAtRest 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#disableEncryptionAtRest(DisableEncryptionAtRestRequest) 
     **/
    DisableEncryptionAtRestResult disableEncryptionAtRest();

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
    GetAsyncResultResult getAsyncResult(long asyncHandle);

    /**
     * AddDrives is used to add one or more available drives to the cluster enabling the drives to host a portion of the cluster&#39;s data.
     * When you add a node to the cluster or install new drives in an existing node, the new drives are marked as &quot;available&quot; and must be added via AddDrives before they can be utilized.
     * Use the &quot;ListDrives&quot; method to display drives that are &quot;available&quot; to be added.
     * When you add multiple drives, it is more efficient to add them in a single &quot;AddDrives&quot; method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to stabilize the storage load on the cluster.
     * <br/><br/>
     * When you add a drive, the system automatically determines the &quot;type&quot; of drive it should be.
     * <br/><br/>
     * The method returns immediately. However, it may take some time for the data in the cluster to be rebalanced using the newly added drives.
     * As the new drive(s) are syncing on the system, you can use the &quot;ListSyncJobs&quot; method to see how the drive(s) are being rebalanced and the progress of adding the new drive.
     *  
     * @param request The request @see com.solidfire.element.api.AddDrivesRequest 
     *  
     * @return the response
     **/
    AddDrivesResult addDrives(final AddDrivesRequest request);


    /**
     * Convenience method for addDrives 
     *  
     * @param drives List of drives to add to the cluster.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#addDrives(AddDrivesRequest) 
     **/
    AddDrivesResult addDrives(NewDrive[] drives);

    /**
     * ListDrives allows you to retrieve the list of the drives that exist in the cluster&#39;s active nodes.
     * This method returns drives that have been added as volume metadata or block drives as well as drives that have not been added and are available.
     *  
     * @param request The request @see com.solidfire.element.api.ListDrivesRequest 
     *  
     * @return the response
     **/
    ListDrivesResult listDrives(final ListDrivesRequest request);


    /**
     * Convenience method for listDrives 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listDrives(ListDrivesRequest) 
     **/
    ListDrivesResult listDrives();

    /**
     * GetDriveHardwareInfo returns all the hardware info for the given drive. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     *  
     * @param request The request @see com.solidfire.element.api.GetDriveHardwareInfoRequest 
     *  
     * @return the response
     **/
    GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request);


    /**
     * Convenience method for getDriveHardwareInfo 
     *  
     * @param driveID DriveID for the drive information requested. DriveIDs can be obtained via the &quot;ListDrives&quot; method.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getDriveHardwareInfo(GetDriveHardwareInfoRequest) 
     **/
    GetDriveHardwareInfoResult getDriveHardwareInfo(long driveID);

    /**
     * ListDriveHardware returns all the drives connected to a node. Use this method on the cluster to return drive hardware information for all the drives on all nodes.
     *  
     * @param request The request @see com.solidfire.element.api.ListDriveHardwareRequest 
     *  
     * @return the response
     **/
    ListDriveHardwareResult listDriveHardware(final ListDriveHardwareRequest request);


    /**
     * Convenience method for listDriveHardware 
     *  
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listDriveHardware(ListDriveHardwareRequest) 
     **/
    ListDriveHardwareResult listDriveHardware(boolean force);

    /**
     * ResetDrives is used to pro-actively initialize drives and remove all data currently residing on the drive. The drive can then be reused in an existing node or used in an upgraded SolidFire node. This method requires the force=true parameter to be included in the method call.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.ResetDrivesRequest 
     *  
     * @return the response
     **/
    ResetDrivesResult resetDrives(final ResetDrivesRequest request);


    /**
     * Convenience method for resetDrives 
     *  
     * @param drives List of device names (not driveIDs) to reset.
     *
     * @param force The "force" parameter must be included on this method to successfully reset a drive.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#resetDrives(ResetDrivesRequest) 
     **/
    ResetDrivesResult resetDrives(String drives, boolean force);

    /**
     * The TestDrives API method is used to run a hardware validation on all the drives on the node. Hardware failures on the drives are detected if present and they are reported in the results of the validation tests.
     * <br/><br/>
     * <b>Note</b>: This test takes approximately 10 minutes.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.TestDrivesRequest 
     *  
     * @return the response
     **/
    TestDrivesResult testDrives(final TestDrivesRequest request);


    /**
     * Convenience method for testDrives 
     *  
     * @param minutes The number of minutes to run the test can be specified.
     *
     * @param force The "force" parameter must be included on this method to successfully test the drives on the node.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#testDrives(TestDrivesRequest) 
     **/
    TestDrivesResult testDrives(Optional<Long> minutes, boolean force);

    /**
     * GetDriveStats return high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the cluster. Some values are specific to Block Drives. Statistical data may not be returned for both block and metadata drives when running this method.
     * For more information on which drive type returns which data, see Response Example (Block Drive) and Response Example (Volume Metadata Drive) in the SolidFire API guide.
     *  
     * @param request The request @see com.solidfire.element.api.GetDriveStatsRequest 
     *  
     * @return the response
     **/
    GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request);


    /**
     * Convenience method for getDriveStats 
     *  
     * @param driveID Specifies the drive for which statistics are gathered.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getDriveStats(GetDriveStatsRequest) 
     **/
    GetDriveStatsResult getDriveStats(long driveID);

    /**
     * SecureEraseDrives is used to remove any residual data from drives that have a status of &quot;available.&quot; For example, when replacing a drive at its end-of-life that contained sensitive data.
     * It uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. The method may take up to two minutes to complete, so it is an asynchronous method.
     * The GetAsyncResult method can be used to check on the status of the secure erase operation.
     * <br/><br/>
     * Use the &quot;ListDrives&quot; method to obtain the driveIDs for the drives you want to secure erase.
     *  
     * @param request The request @see com.solidfire.element.api.SecureEraseDrivesRequest 
     *  
     * @return the response
     **/
    AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request);


    /**
     * Convenience method for secureEraseDrives 
     *  
     * @param drives List of driveIDs to secure erase.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#secureEraseDrives(SecureEraseDrivesRequest) 
     **/
    AsyncHandleResult secureEraseDrives(long[] drives);

    /**
     * You can use RemoveDrives to proactively remove drives that are part of the cluster.
     * You may want to use this method when reducing cluster capacity or preparing to replace drives nearing the end of their service life.
     * Any data on the drives is removed and migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method.
     * Depending on the total capacity of the drives being removed, it may take several minutes to migrate all of the data.
     * Use the &quot;GetAsyncResult&quot; method to check the status of the remove operation.
     * <br/><br/>
     * When removing multiple drives, use a single &quot;RemoveDrives&quot; method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
     * <br/><br/>
     * You can also remove drives with a &quot;failed&quot; status using &quot;RemoveDrives&quot;.
     * When you remove a drive with a &quot;failed&quot; status it is not returned to an &quot;available&quot; or &quot;active&quot; status.
     * The drive is unavailable for use in the cluster.
     * <br/><br/>
     * Use the &quot;ListDrives&quot; method to obtain the driveIDs for the drives you want to remove.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveDrivesRequest 
     *  
     * @return the response
     **/
    AsyncHandleResult removeDrives(final RemoveDrivesRequest request);


    /**
     * Convenience method for removeDrives 
     *  
     * @param drives List of driveIDs to remove from the cluster.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeDrives(RemoveDrivesRequest) 
     **/
    AsyncHandleResult removeDrives(long[] drives);

    ListActiveNodesResult listActiveNodes(final ListActiveNodesRequest request);


    ListActiveNodesResult listActiveNodes();

    ListAllNodesResult listAllNodes(final ListAllNodesRequest request);


    ListAllNodesResult listAllNodes();

    /**
     * Gets the list of pending nodes.
     * Pending nodes are running and configured to join the cluster, but have not been added via the AddNodes method.
     *  
     * @param request The request @see com.solidfire.element.api.ListPendingNodesRequest 
     *  
     * @return the response
     **/
    ListPendingNodesResult listPendingNodes(final ListPendingNodesRequest request);


    /**
     * Convenience method for listPendingNodes 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listPendingNodes(ListPendingNodesRequest) 
     **/
    ListPendingNodesResult listPendingNodes();

    /**
     * AddNodes is used to add one or more new nodes to the cluster. When a node is not configured and starts up for the first time you are prompted to configure the node. Once a node is configured it is registered as a &quot;pending node&quot; with the cluster.
     * <br/><br/>
     * Adding a node to a cluster that has been set up for virtual networking will require a sufficient number of virtual storage IP addresses to allocate a virtual IP to the new node. If there are no virtual IP addresses available for the new node, the AddNode operation will not complete successfully. Use the &quot;ModifyVirtualNetwork&quot; method to add more storage IP addresses to your virtual network.
     * <br/><br/>
     * The software version on each node in a cluster must be compatible. Run the &quot;ListAllNodes&quot; API to see what versions of software are currently running on the cluster nodes. For an explanation of software version compatibility, see &quot;Node Versioning and Compatibility&quot; in the Element API guide.
     * <br/><br/>
     * Once a node has been added, the drives on the node are made available and can then be added via the &quot;AddDrives&quot; method to increase the storage capacity of the cluster.
     * <br/><br/>
     * <b>Note</b>: It may take several seconds after adding a new Node for it to start up and register the drives as being available.
     *  
     * @param request The request @see com.solidfire.element.api.AddNodesRequest 
     *  
     * @return the response
     **/
    AddNodesResult addNodes(final AddNodesRequest request);


    /**
     * Convenience method for addNodes 
     *  
     * @param pendingNodes List of PendingNodeIDs for the Nodes to be added. You can obtain the list of Pending Nodes via the ListPendingNodes method.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#addNodes(AddNodesRequest) 
     **/
    AddNodesResult addNodes(long[] pendingNodes);

    /**
     * RemoveNodes is used to remove one or more nodes that should no longer participate in the cluster. Before removing a node, all drives it contains must first be removed with &quot;RemoveDrives&quot; method. A node cannot be removed until the RemoveDrives process has completed and all data has been migrated away from the node.
     * <br/><br/>
     * Once removed, a node registers itself as a pending node and can be added again, or shut down which removes it from the &quot;Pending Node&quot; list.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveNodesRequest 
     *  
     * @return the response
     **/
    RemoveNodesResult removeNodes(final RemoveNodesRequest request);


    /**
     * Convenience method for removeNodes 
     *  
     * @param nodes List of NodeIDs for the nodes to be removed.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeNodes(RemoveNodesRequest) 
     **/
    RemoveNodesResult removeNodes(long[] nodes);

    /**
     * The GetNetworkConfig API method is used to display the network configuration information for a node.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.GetNetworkConfigRequest 
     *  
     * @return the response
     **/
    GetNetworkConfigResult getNetworkConfig(final GetNetworkConfigRequest request);


    /**
     * Convenience method for getNetworkConfig 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getNetworkConfig(GetNetworkConfigRequest) 
     **/
    GetNetworkConfigResult getNetworkConfig();

    /**
     * The SetConfig API method is used to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method.
     * <br/><br/>
     * <b>Warning!</b> Changing the 'bond-mode' on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.SetConfigRequest 
     *  
     * @return the response
     **/
    SetConfigResult setConfig(final SetConfigRequest request);


    /**
     * Convenience method for setConfig 
     *  
     * @param config Objects that you want changed for the cluster interface settings.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#setConfig(SetConfigRequest) 
     **/
    SetConfigResult setConfig(Config config);

    /**
     * The &quot;SetNetworkConfig&quot; method is used to set the network configuration for a node. To see the states in which these objects can be modified, see &quot;Network Object for 1G and 10G Interfaces&quot; on page 109 of the Element API. To display the current network settings for a node, run the &quot;GetNetworkConfig&quot; method.
     * <br/><br/>
     * <b>WARNING!</b> Changing the &quot;bond-mode&quot; on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.SetNetworkConfigRequest 
     *  
     * @return the response
     **/
    SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request);


    /**
     * Convenience method for setNetworkConfig 
     *  
     * @param network Objects that will be changed for the node network settings.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#setNetworkConfig(SetNetworkConfigRequest) 
     **/
    SetNetworkConfigResult setNetworkConfig(Network network);

    /**
     * The GetConfig API method is used to retrieve all the configuration information for the node. This one API method includes the same information available in both &quot;GetClusterConfig&quot; and &quot;GetNetworkConfig&quot; methods.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     *  
     * @param request The request @see com.solidfire.element.api.GetConfigRequest 
     *  
     * @return the response
     **/
    GetConfigResult getConfig(final GetConfigRequest request);


    /**
     * Convenience method for getConfig 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#getConfig(GetConfigRequest) 
     **/
    GetConfigResult getConfig();

    /**
     * ListClusterPairs allows you to list all of the clusters a cluster is paired with.
     * This method returns information about active and pending cluster pairings, such as statistics about the current pairing as well as the connectivity and latency (in milliseconds) of the cluster pairing.
     *  
     * @param request The request @see com.solidfire.element.api.ListClusterPairsRequest 
     *  
     * @return the response
     **/
    ListClusterPairsResult listClusterPairs(final ListClusterPairsRequest request);


    /**
     * Convenience method for listClusterPairs 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listClusterPairs(ListClusterPairsRequest) 
     **/
    ListClusterPairsResult listClusterPairs();

    /**
     * StartClusterPairing allows you to create an encoded key from a cluster that is used to pair with another cluster.
     * The key created from this API method is used in the "CompleteClusterPairing" API method to establish a cluster pairing.
     * You can pair a cluster with a maximum of four other SolidFire clusters.
     *  
     * @param request The request @see com.solidfire.element.api.StartClusterPairingRequest 
     *  
     * @return the response
     **/
    StartClusterPairingResult startClusterPairing(final StartClusterPairingRequest request);


    /**
     * Convenience method for startClusterPairing 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#startClusterPairing(StartClusterPairingRequest) 
     **/
    StartClusterPairingResult startClusterPairing();

    /**
     * The CompleteClusterPairing method is the second step in the cluster pairing process.
     * Use this method with the encoded key received from the "StartClusterPairing" API method to complete the cluster pairing process.
     *  
     * @param request The request @see com.solidfire.element.api.CompleteClusterPairingRequest 
     *  
     * @return the response
     **/
    CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request);


    /**
     * Convenience method for completeClusterPairing 
     *  
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#completeClusterPairing(CompleteClusterPairingRequest) 
     **/
    CompleteClusterPairingResult completeClusterPairing(String clusterPairingKey);

    /**
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.<br/>
     * <b>Note</b>: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveClusterPairRequest 
     *  
     * @return the response
     **/
    RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request);


    /**
     * Convenience method for removeClusterPair 
     *  
     * @param clusterPairID Unique identifier used to pair two clusters.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeClusterPair(RemoveClusterPairRequest) 
     **/
    RemoveClusterPairResult removeClusterPair(long clusterPairID);

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
    DeleteSnapshotResult deleteSnapshot(long snapshotID);

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
    ModifySnapshotResult modifySnapshot(long snapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication);

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
    DeleteGroupSnapshotResult deleteGroupSnapshot(long groupSnapshotID, boolean saveMembers);

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
    ModifyGroupSnapshotResult modifyGroupSnapshot(long groupSnapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication);

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
     * ListVirtualNetworks is used to get a list of all the configured virtual networks for the cluster. This method can be used to verify the virtual network settings in the cluster.
     * 
     * This method does not require any parameters to be passed. But, one or more VirtualNetworkIDs or VirtualNetworkTags can be passed in order to filter the results.
     *  
     * @param request The request @see com.solidfire.element.api.ListVirtualNetworksRequest 
     *  
     * @return the response
     * @since 7.0 
     **/
    @Since("7.0")
    ListVirtualNetworksResult listVirtualNetworks(final ListVirtualNetworksRequest request);

    /**
     * AddVirtualNetwork is used to add a new virtual network to a cluster configuration. When a virtual network is added, an interface for each node is created and each will require a virtual network IP address. The number of IP addresses specified as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. Virtual network addresses are bulk provisioned by SolidFire and assigned to individual nodes automatically. Virtual network addresses do not need to be assigned to nodes manually.
     * 
     * <b>Note:</b> The AddVirtualNetwork method is used only to create a new virtual network. If you want to make changes to a virtual network, please use the ModifyVirtualNetwork method.
     *  
     * @param request The request @see com.solidfire.element.api.AddVirtualNetworkRequest 
     *  
     * @return the response
     * @since 7.0 
     **/
    @Since("7.0")
    AddVirtualNetworkResult addVirtualNetwork(final AddVirtualNetworkRequest request);

    /**
     * ModifyVirtualNetwork is used to change various attributes of a VirtualNetwork object. This method can be used to add or remove address blocks, change the netmask IP, or modify the name or description of the virtual network.
     * 
     * <b>Note:</b> This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     *  
     * @param request The request @see com.solidfire.element.api.ModifyVirtualNetworkRequest 
     *  
     * @return the response
     * @since 7.0 
     **/
    @Since("7.0")
    AddVirtualNetworkResult modifyVirtualNetwork(final ModifyVirtualNetworkRequest request);

    /**
     * RemoveVirtualNetwork is used to remove a previously added virtual network.
     * 
     * <b>Note:</b> This method requires either the VirtualNetworkID of the VirtualNetworkTag as a parameter, but not both.
     *  
     * @param request The request @see com.solidfire.element.api.RemoveVirtualNetworkRequest 
     *  
     * @return the response
     * @since 7.0 
     **/
    @Since("7.0")
    RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request);


    /**
     * Convenience method for removeVirtualNetwork 
     *  
     * @param virtualNetworkID Network ID that identifies the virtual network to remove.
     *
     * @param virtualNetworkTag Network Tag that identifies the virtual network to remove.
     *
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#removeVirtualNetwork(RemoveVirtualNetworkRequest) 
     * @since 7.0 
     **/
    @Since("7.0")
    RemoveVirtualNetworkResult removeVirtualNetwork(Optional<Long> virtualNetworkID, Optional<Long> virtualNetworkTag);

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
    DeleteVolumeResult deleteVolume(long volumeID);

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
    GetVolumeStatsResult getVolumeStats(long volumeID);

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
    GetVolumeEfficiencyResult getVolumeEfficiency(long volumeID, Optional<Boolean> force);

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
     * ListISCSISessions is used to return iSCSI connection information for volumes in the cluster.
     *  
     * @param request The request @see com.solidfire.element.api.ListISCSISessionsRequest 
     *  
     * @return the response
     **/
    ListISCSISessionsResult listISCSISessions(final ListISCSISessionsRequest request);


    /**
     * Convenience method for listISCSISessions 
     *  
     * @return the response
     * @see com.solidfire.element.api.SolidFireElementIF#listISCSISessions(ListISCSISessionsRequest) 
     **/
    ListISCSISessionsResult listISCSISessions();

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
    ListVolumesForAccountResult listVolumesForAccount(long accountID, Optional<Long> startVolumeID, Optional<Long> limit);

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
    PurgeDeletedVolumeResult purgeDeletedVolume(long volumeID);

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
    RestoreDeletedVolumeResult restoreDeletedVolume(long volumeID);

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
    DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(long volumeAccessGroupID);

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
    ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(long volumeAccessGroupID, String[] initiators);

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
    ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(long volumeAccessGroupID, String[] initiators);

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
    ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(long volumeAccessGroupID, long[] volumes);

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
    ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(long volumeAccessGroupID, long[] volumes);

}