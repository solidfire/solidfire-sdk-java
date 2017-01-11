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
 *
 *
 * DO NOT EDIT THIS CODE BY HAND! It has been generated with jsvcgen.
 */
package com.solidfire.element.api;

import com.solidfire.core.annotation.*;
import com.solidfire.core.client.RequestDispatcher;
import com.solidfire.core.javautil.Optional;

/**
 * The API for controlling a SolidFire cluster.
 **/

public class SolidFireElement
    extends com.solidfire.client.ElementServiceBase implements SolidFireElementIF {

    /**
     * Create a new instance of  SolidFireElement with the provided requestDispatcher. You probably do not want to use
     * this constructor directly -- it is easier to use the static create methods.
     * @param requestDispatcher  The class responsible for processing request/responses and
     *                           serialization/deserialization of the JSON payload
     */
    public SolidFireElement(RequestDispatcher requestDispatcher) {
        super(requestDispatcher);
    }

    /** 
     * Used to add a new account to the system.
     * New volumes can be created under the new account.
     * The CHAP settings specified for the account applies to all volumes owned by the account.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(final AddAccountRequest request) {
        return super.sendRequest("AddAccount", request, AddAccountRequest.class, AddAccountResult.class);
    }

    /** 
     * Used to add a new account to the system.
     * New volumes can be created under the new account.
     * The CHAP settings specified for the account applies to all volumes owned by the account.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.addAccount(new AddAccountRequest(username, initiatorSecret, targetSecret, attributes));
    }
    /** 
     * Returns details about an account, given its AccountID.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request) {
        return super.sendRequest("GetAccountByID", request, GetAccountByIDRequest.class, GetAccountResult.class);
    }

    /** 
     * Returns details about an account, given its AccountID.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(
        Long accountID
        ) {
        return this.getAccountByID(new GetAccountByIDRequest(accountID));
    }
    /** 
     * Returns details about an account, given its Username.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request) {
        return super.sendRequest("GetAccountByName", request, GetAccountByNameRequest.class, GetAccountResult.class);
    }

    /** 
     * Returns details about an account, given its Username.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(
        String username
        ) {
        return this.getAccountByName(new GetAccountByNameRequest(username));
    }
    /** 
     * GetAccountEfficiency is used to retrieve information about a volume account. Only the account given as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(final GetAccountEfficiencyRequest request) {
        return super.sendRequest("GetAccountEfficiency", request, GetAccountEfficiencyRequest.class, GetEfficiencyResult.class);
    }

    /** 
     * GetAccountEfficiency is used to retrieve information about a volume account. Only the account given as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(
        Long accountID
        ) {
        return this.getAccountEfficiency(new GetAccountEfficiencyRequest(accountID));
    }
    /** 
     * Returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(final ListAccountsRequest request) {
        return super.sendRequest("ListAccounts", request, ListAccountsRequest.class, ListAccountsResult.class);
    }

    /** 
     * Returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(
        Optional<Long> startAccountID,
        Optional<Long> limit
        ) {
        return this.listAccounts(new ListAccountsRequest(startAccountID, limit));
    }
    /** 
     * Used to modify an existing account.
     * When locking an account, any existing connections from that account are immediately terminated.
     * When changing CHAP settings, any existing connections continue to be active,
     * and the new CHAP values are only used on subsequent connection or reconnection.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(final ModifyAccountRequest request) {
        return super.sendRequest("ModifyAccount", request, ModifyAccountRequest.class, ModifyAccountResult.class);
    }

    /** 
     * Used to modify an existing account.
     * When locking an account, any existing connections from that account are immediately terminated.
     * When changing CHAP settings, any existing connections continue to be active,
     * and the new CHAP values are only used on subsequent connection or reconnection.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(
        Long accountID,
        Optional<String> username,
        Optional<String> status,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyAccount(new ModifyAccountRequest(accountID, username, status, initiatorSecret, targetSecret, attributes));
    }
    /** 
     * Used to remove an existing account.
     * All Volumes must be deleted and purged on the account before it can be removed.
     * If volumes on the account are still pending deletion, RemoveAccount cannot be used until DeleteVolume to delete and purge the volumes.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request) {
        return super.sendRequest("RemoveAccount", request, RemoveAccountRequest.class, RemoveAccountResult.class);
    }

    /** 
     * Used to remove an existing account.
     * All Volumes must be deleted and purged on the account before it can be removed.
     * If volumes on the account are still pending deletion, RemoveAccount cannot be used until DeleteVolume to delete and purge the volumes.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(
        Long accountID
        ) {
        return this.removeAccount(new RemoveAccountRequest(accountID));
    }
    /** 
     * CreateBackupTarget allows you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(final CreateBackupTargetRequest request) {
        return super.sendRequest("CreateBackupTarget", request, CreateBackupTargetRequest.class, CreateBackupTargetResult.class);
    }

    /** 
     * CreateBackupTarget allows you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(
        String name,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createBackupTarget(new CreateBackupTargetRequest(name, attributes));
    }
    /** 
     * GetBackupTarget allows you to return information about a specific backup target that has been created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(final GetBackupTargetRequest request) {
        return super.sendRequest("GetBackupTarget", request, GetBackupTargetRequest.class, GetBackupTargetResult.class);
    }

    /** 
     * GetBackupTarget allows you to return information about a specific backup target that has been created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(
        Long backupTargetID
        ) {
        return this.getBackupTarget(new GetBackupTargetRequest(backupTargetID));
    }
    /** 
     * You can use ListBackupTargets to retrieve information about all backup targets that have been created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListBackupTargetsResult listBackupTargets() {
        return super.sendRequest("ListBackupTargets", null, null, ListBackupTargetsResult.class);
    }
    /** 
     * ModifyBackupTarget is used to change attributes of a backup target.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(final ModifyBackupTargetRequest request) {
        return super.sendRequest("ModifyBackupTarget", request, ModifyBackupTargetRequest.class, ModifyBackupTargetResult.class);
    }

    /** 
     * ModifyBackupTarget is used to change attributes of a backup target.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(
        Long backupTargetID,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyBackupTarget(new ModifyBackupTargetRequest(backupTargetID, name, attributes));
    }
    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(final RemoveBackupTargetRequest request) {
        return super.sendRequest("RemoveBackupTarget", request, RemoveBackupTargetRequest.class, RemoveBackupTargetResult.class);
    }

    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(
        Long backupTargetID
        ) {
        return this.removeBackupTarget(new RemoveBackupTargetRequest(backupTargetID));
    }
    /** 
     * AddClusterAdmin adds a new Cluster Admin. A Cluster Admin can be used to manage the cluster via the API and management tools. Cluster Admins are completely separate and unrelated to standard tenant accounts.
     * <br/><br/>
     * Each Cluster Admin can be restricted to a sub-set of the API. SolidFire recommends using multiple Cluster Admins for different users and applications. Each Cluster Admin should be given the minimal permissions necessary to reduce the potential impact of credential compromise.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request) {
        return super.sendRequest("AddClusterAdmin", request, AddClusterAdminRequest.class, AddClusterAdminResult.class);
    }

    /** 
     * AddClusterAdmin adds a new Cluster Admin. A Cluster Admin can be used to manage the cluster via the API and management tools. Cluster Admins are completely separate and unrelated to standard tenant accounts.
     * <br/><br/>
     * Each Cluster Admin can be restricted to a sub-set of the API. SolidFire recommends using multiple Cluster Admins for different users and applications. Each Cluster Admin should be given the minimal permissions necessary to reduce the potential impact of credential compromise.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(
        String username,
        String password,
        String[] access,
        Optional<Boolean> acceptEula,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.addClusterAdmin(new AddClusterAdminRequest(username, password, access, acceptEula, attributes));
    }
    /** 
     * ClearClusterFaults is used to clear information about both current faults that are resolved as well as faults that were previously detected and resolved can be cleared.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request) {
        return super.sendRequest("ClearClusterFaults", request, ClearClusterFaultsRequest.class, ClearClusterFaultsResult.class);
    }

    /** 
     * ClearClusterFaults is used to clear information about both current faults that are resolved as well as faults that were previously detected and resolved can be cleared.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(
        Optional<String> faultTypes
        ) {
        return this.clearClusterFaults(new ClearClusterFaultsRequest(faultTypes));
    }
    /** 
     * CreateSupportBundle is used to create a support bundle file under the node's directory. When the bundle has been successfully created, the bundle is stored on the node as a tar.gz file.
     **/
    @Override
    @Since("8")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(final CreateSupportBundleRequest request) {
        return super.sendRequest("CreateSupportBundle", request, CreateSupportBundleRequest.class, CreateSupportBundleResult.class);
    }

    /** 
     * CreateSupportBundle is used to create a support bundle file under the node's directory. When the bundle has been successfully created, the bundle is stored on the node as a tar.gz file.
     **/
    @Override
    @Since("8")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(
        Optional<String> bundleName,
        Optional<String> extraArgs,
        Optional<Long> timeoutSec
        ) {
        return this.createSupportBundle(new CreateSupportBundleRequest(bundleName, extraArgs, timeoutSec));
    }
    /** 
     * DeleteAllSupportBundles is used to delete all support bundles generated with the CreateSupportBundle API method.
     **/
    @Override
    @Since("8")
    @ConnectionType("Node")
    public DeleteAllSupportBundlesResult deleteAllSupportBundles() {
        return super.sendRequest("DeleteAllSupportBundles", null, null, DeleteAllSupportBundlesResult.class);
    }
    /** 
     * The DisableEncryptionAtRest method enables you to remove the encryption that was previously applied to the cluster using the EnableEncryptionAtRest method.
     * This disable method is asynchronous and returns a response before encryption is disabled.
     * You can use the GetClusterInfo method to poll the system to see when the process has completed.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public DisableEncryptionAtRestResult disableEncryptionAtRest() {
        return super.sendRequest("DisableEncryptionAtRest", null, null, DisableEncryptionAtRestResult.class);
    }
    /** 
     * DisableSnmp is used to disable SNMP on the cluster nodes.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public DisableSnmpResult disableSnmp() {
        return super.sendRequest("DisableSnmp", null, null, DisableSnmpResult.class);
    }
    /** 
     * The EnableEncryptionAtRest method is used to enable the Advanced Encryption Standard (AES) 256-bit encryption at rest on the cluster so that the cluster can manage the encryption key used for the drives on each node. This feature is not enabled by default. Enabling this operation allows the cluster to automatically manage encryption keys internally for the drives on each node in the cluster. Nodes do not store the keys to unlock drives and the keys are never passed over the network. Two nodes participating in a cluster are required to access the key to disable encryption on a drive. The encryption management does not affect performance or efficiency on the cluster. If an encryption-enabled drive or node is removed from the cluster with the API, all data is secure erased and any data left on the drive cannot be read or accessed.
     * Enabling or disabling encryption should be performed when the cluster is running and in a healthy state. Encryption can be enabled or disabled at your discretion and can be performed as often as you need.
     * <br/><b>Note</b>: This process is asynchronous and returns a response before encryption is enabled. The GetClusterInfo method can be used to poll the system to see when the process has completed.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest() {
        return super.sendRequest("EnableEncryptionAtRest", null, null, EnableEncryptionAtRestResult.class);
    }
    /** 
     * EnableSnmp is used to enable SNMP on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(final EnableSnmpRequest request) {
        return super.sendRequest("EnableSnmp", request, EnableSnmpRequest.class, EnableSnmpResult.class);
    }

    /** 
     * EnableSnmp is used to enable SNMP on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(
        Boolean snmpV3Enabled
        ) {
        return this.enableSnmp(new EnableSnmpRequest(snmpV3Enabled));
    }
    /** 
     * Retrieves the current version of the API and a list of all supported versions.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public GetAPIResult getAPI() {
        return super.sendRequest("GetAPI", null, null, GetAPIResult.class);
    }
    /** 
     * Return the high-level capacity measurements for an entire cluster.
     * The fields returned from this method can be used to calculate the efficiency rates that are displayed in the Element User Interface.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterCapacityResult getClusterCapacity() {
        return super.sendRequest("GetClusterCapacity", null, null, GetClusterCapacityResult.class);
    }
    /** 
     * The GetClusterConfig API method is used to return information about the cluster configuration this node uses to communicate with the cluster it is a part of.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetClusterConfigResult getClusterConfig() {
        return super.sendRequest("GetClusterConfig", null, null, GetClusterConfigResult.class);
    }
    /** 
     * GetClusterFullThreshold is used to view the stages set for cluster fullness levels. All levels are returned when this method is entered.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterFullThresholdResult getClusterFullThreshold() {
        return super.sendRequest("GetClusterFullThreshold", null, null, GetClusterFullThresholdResult.class);
    }
    /** 
     * Return configuration information about the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterInfoResult getClusterInfo() {
        return super.sendRequest("GetClusterInfo", null, null, GetClusterInfoResult.class);
    }
    /** 
     * GetClusterMasterNodeID is used to return the ID of the node that can perform cluster-wide administration tasks and holds the storage virtual IP (SVIP) and management virtual IP (MVIP).
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterMasterNodeIDResult getClusterMasterNodeID() {
        return super.sendRequest("GetClusterMasterNodeID", null, null, GetClusterMasterNodeIDResult.class);
    }
    /** 
     * The GetClusterState method is used to indicate if a node is part of a cluster or not. The three states are: <br><strong>Available:</strong> Node has not been configured with a cluster name.<br><strong>Pending:</strong> Node is pending for a specific named cluster and can be added.<br><strong>Active:</strong> Node is active and a member of a cluster and may not be added to another cluster.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(final GetClusterStateRequest request) {
        return super.sendRequest("GetClusterState", request, GetClusterStateRequest.class, GetClusterStateResult.class);
    }

    /** 
     * The GetClusterState method is used to indicate if a node is part of a cluster or not. The three states are: <br><strong>Available:</strong> Node has not been configured with a cluster name.<br><strong>Pending:</strong> Node is pending for a specific named cluster and can be added.<br><strong>Active:</strong> Node is active and a member of a cluster and may not be added to another cluster.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(
        Boolean force
        ) {
        return this.getClusterState(new GetClusterStateRequest(force));
    }
    /** 
     * GetClusterStats is used to return high-level activity measurements for the cluster. Values returned are cumulative from the creation of the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterStatsResult getClusterStats() {
        return super.sendRequest("GetClusterStats", null, null, GetClusterStatsResult.class);
    }
    /** 
     * Return information about the Element software version running on each node in the cluster.
     * Information about the nodes that are currently in the process of upgrading software is also returned.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterVersionInfoResult getClusterVersionInfo() {
        return super.sendRequest("GetClusterVersionInfo", null, null, GetClusterVersionInfoResult.class);
    }
    /** 
     * GetCurrentClusterAdmin returns information for the current primary cluster administrator. The primary Cluster Admin was ncreated when the cluster was created.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetCurrentClusterAdminResult getCurrentClusterAdmin() {
        return super.sendRequest("GetCurrentClusterAdmin", null, null, GetCurrentClusterAdminResult.class);
    }
    /** 
     * GetLimits enables you to retrieve the limit values set by the API. These values might change between releases of  Element, but do not change without an update to the system. Knowing the limit values set by the API can be useful when writing API scripts for user-facing tools.NOTE: The GetLimits method returns the limits for the current software version regardless of the API endpoint version used to pass the method.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetLimitsResult getLimits() {
        return super.sendRequest("GetLimits", null, null, GetLimitsResult.class);
    }
    /** 
     * GetNtpInfo is used to return the current network time protocol (NTP) configuration information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetNtpInfoResult getNtpInfo() {
        return super.sendRequest("GetNtpInfo", null, null, GetNtpInfoResult.class);
    }
    /** 
     * GetSnmpACL is used to return the current SNMP access permissions on the cluster nodes.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public GetSnmpACLResult getSnmpACL() {
        return super.sendRequest("GetSnmpACL", null, null, GetSnmpACLResult.class);
    }
    /** 
     * GetSnmpInfo is used to return the current simple network management protocol (SNMP) configuration information.
     * <br/><br/>
     * <b>Note</b>: GetSnmpInfo will be available for Element OS 8 and prior releases. It will be deprecated after Element OS 8. There are two new SNMP API methods that you should migrate over to. They are GetSnmpState and GetSnmpACL. Please see details in this document for their descriptions and usage.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetSnmpInfoResult getSnmpInfo() {
        return super.sendRequest("GetSnmpInfo", null, null, GetSnmpInfoResult.class);
    }
    /** 
     * GetSnmpState is used to return the current state of the SNMP feature.
     * <br/><br/>
     * <b>Note</b>: GetSnmpState is new for Element OS 8. Please use this method and SetSnmpACL to migrate your SNMP functionality in the future.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public GetSnmpStateResult getSnmpState() {
        return super.sendRequest("GetSnmpState", null, null, GetSnmpStateResult.class);
    }
    /** 
     * GetSnmpTrapInfo is used to return current SNMP trap configuration information.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public GetSnmpTrapInfoResult getSnmpTrapInfo() {
        return super.sendRequest("GetSnmpTrapInfo", null, null, GetSnmpTrapInfoResult.class);
    }
    /** 
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetSystemStatusResult getSystemStatus() {
        return super.sendRequest("GetSystemStatus", null, null, GetSystemStatusResult.class);
    }
    /** 
     * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be several cluster administrators that have different levels of permissions. There can be only one primary cluster administrator in the system. The primary Cluster Admin is the administrator that was created when the cluster was created. LDAP administrators can also be created when setting up an LDAP system on the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListClusterAdminsResult listClusterAdmins() {
        return super.sendRequest("ListClusterAdmins", null, null, ListClusterAdminsResult.class);
    }
    /** 
     * ListClusterFaults is used to retrieve information about any faults detected on the cluster.
     * With this method, both current and resolved faults can be retrieved. The system caches faults every 30 seconds.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request) {
        return super.sendRequest("ListClusterFaults", request, ListClusterFaultsRequest.class, ListClusterFaultsResult.class);
    }

    /** 
     * ListClusterFaults is used to retrieve information about any faults detected on the cluster.
     * With this method, both current and resolved faults can be retrieved. The system caches faults every 30 seconds.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(
        Optional<Boolean> exceptions,
        Optional<Boolean> bestPractices,
        Optional<Boolean> update,
        Optional<String> faultTypes
        ) {
        return this.listClusterFaults(new ListClusterFaultsRequest(exceptions, bestPractices, update, faultTypes));
    }
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(final ListEventsRequest request) {
        return super.sendRequest("ListEvents", request, ListEventsRequest.class, ListEventsResult.class);
    }

    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(
        Optional<Long> maxEvents,
        Optional<Long> startEventID,
        Optional<Long> endEventID,
        Optional<String> eventQueueType
        ) {
        return this.listEvents(new ListEventsRequest(maxEvents, startEventID, endEventID, eventQueueType));
    }
    /** 
     * ListSyncJobs is used to return information about synchronization jobs that are running on a SolidFire cluster. Synchronization jobs that are returned with this method are, "slice," "clone" and "remote."
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListSyncJobsResult listSyncJobs() {
        return super.sendRequest("ListSyncJobs", null, null, ListSyncJobsResult.class);
    }
    /** 
     * ModifyClusterAdmin is used to change the settings for a Cluster Admin or LDAP Cluster Admin. Access for the administrator Cluster Admin account cannot be changed.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request) {
        return super.sendRequest("ModifyClusterAdmin", request, ModifyClusterAdminRequest.class, ModifyClusterAdminResult.class);
    }

    /** 
     * ModifyClusterAdmin is used to change the settings for a Cluster Admin or LDAP Cluster Admin. Access for the administrator Cluster Admin account cannot be changed.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(
        Long clusterAdminID,
        Optional<String> password,
        Optional<String[]> access,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyClusterAdmin(new ModifyClusterAdminRequest(clusterAdminID, password, access, attributes));
    }
    /** 
     * ModifyClusterFullThreshold is used to change the level at which an event is generated when the storage cluster approaches the capacity utilization requested. The number entered in this setting is used to indicate the number of node failures the system is required to recover from. For example, on a 10 node cluster, if you want to be alerted when the system cannot recover from 3 nodes failures, enter the value of "3". When this number is reached, a message alert is sent to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request) {
        return super.sendRequest("ModifyClusterFullThreshold", request, ModifyClusterFullThresholdRequest.class, ModifyClusterFullThresholdResult.class);
    }

    /** 
     * ModifyClusterFullThreshold is used to change the level at which an event is generated when the storage cluster approaches the capacity utilization requested. The number entered in this setting is used to indicate the number of node failures the system is required to recover from. For example, on a 10 node cluster, if you want to be alerted when the system cannot recover from 3 nodes failures, enter the value of "3". When this number is reached, a message alert is sent to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3BlockThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
        ) {
        return this.modifyClusterFullThreshold(new ModifyClusterFullThresholdRequest(stage2AwareThreshold, stage3BlockThresholdPercent, maxMetadataOverProvisionFactor));
    }
    /** 
     * RemoveClusterAdmin is used to remove a Cluster Admin. The "admin" Cluster Admin cannot be removed.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request) {
        return super.sendRequest("RemoveClusterAdmin", request, RemoveClusterAdminRequest.class, RemoveClusterAdminResult.class);
    }

    /** 
     * RemoveClusterAdmin is used to remove a Cluster Admin. The "admin" Cluster Admin cannot be removed.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(
        Long clusterAdminID
        ) {
        return this.removeClusterAdmin(new RemoveClusterAdminRequest(clusterAdminID));
    }
    /** 
     * The SetClusterConfig API method is used to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified see Cluster Object on page 109. To display the current cluster interface settings for a node, run the GetClusterConfig API method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request) {
        return super.sendRequest("SetClusterConfig", request, SetClusterConfigRequest.class, SetClusterConfigResult.class);
    }

    /** 
     * The SetClusterConfig API method is used to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified see Cluster Object on page 109. To display the current cluster interface settings for a node, run the GetClusterConfig API method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(
        ClusterConfig cluster
        ) {
        return this.setClusterConfig(new SetClusterConfigRequest(cluster));
    }
    /** 
     * SetNtpInfo is used to configure the NTP on cluster nodes. The values set with this interface apply to all nodes in the cluster. The nodes can only be configured as a server where a host is selected to administrate the networking and/or a broadcast client where each host sends each message to each peer.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(final SetNtpInfoRequest request) {
        return super.sendRequest("SetNtpInfo", request, SetNtpInfoRequest.class, SetNtpInfoResult.class);
    }

    /** 
     * SetNtpInfo is used to configure the NTP on cluster nodes. The values set with this interface apply to all nodes in the cluster. The nodes can only be configured as a server where a host is selected to administrate the networking and/or a broadcast client where each host sends each message to each peer.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(
        String[] servers,
        Optional<Boolean> broadcastclient
        ) {
        return this.setNtpInfo(new SetNtpInfoRequest(servers, broadcastclient));
    }
    /** 
     * SetSnmpACL is used to configure SNMP access permissions on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note that the values set with this interface replace all "network" or "usmUsers" values set with the older SetSnmpInfo.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(final SetSnmpACLRequest request) {
        return super.sendRequest("SetSnmpACL", request, SetSnmpACLRequest.class, SetSnmpACLResult.class);
    }

    /** 
     * SetSnmpACL is used to configure SNMP access permissions on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note that the values set with this interface replace all "network" or "usmUsers" values set with the older SetSnmpInfo.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(
        SnmpNetwork[] networks,
        SnmpV3UsmUser[] usmUsers
        ) {
        return this.setSnmpACL(new SetSnmpACLRequest(networks, usmUsers));
    }
    /** 
     * SetSnmpInfo is used to configure SNMP v2 and v3 on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * <br/><br/>
     * <b>Note</b>: EnableSnmp and SetSnmpACL methods can be used to accomplish the same results as SetSnmpInfo. SetSnmpInfo will no longer be available after the Element 8 release. Please use EnableSnmp and SetSnmpACL in the future.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(final SetSnmpInfoRequest request) {
        return super.sendRequest("SetSnmpInfo", request, SetSnmpInfoRequest.class, SetSnmpInfoResult.class);
    }

    /** 
     * SetSnmpInfo is used to configure SNMP v2 and v3 on the cluster nodes. The values set with this interface apply to all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * <br/><br/>
     * <b>Note</b>: EnableSnmp and SetSnmpACL methods can be used to accomplish the same results as SetSnmpInfo. SetSnmpInfo will no longer be available after the Element 8 release. Please use EnableSnmp and SetSnmpACL in the future.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(
        Optional<SnmpNetwork[]> networks,
        Optional<Boolean> enabled,
        Optional<Boolean> snmpV3Enabled,
        Optional<SnmpV3UsmUser[]> usmUsers
        ) {
        return this.setSnmpInfo(new SetSnmpInfoRequest(networks, enabled, snmpV3Enabled, usmUsers));
    }
    /** 
     * SetSnmpTrapInfo is used to enable and disable the generation of SolidFire SNMP notifications (traps) and to specify the set of network host computers that are to receive the notifications. The values passed with each SetSnmpTrapInfo method replaces all values set in any previous method to SetSnmpTrapInfo.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(final SetSnmpTrapInfoRequest request) {
        return super.sendRequest("SetSnmpTrapInfo", request, SetSnmpTrapInfoRequest.class, SetSnmpTrapInfoResult.class);
    }

    /** 
     * SetSnmpTrapInfo is used to enable and disable the generation of SolidFire SNMP notifications (traps) and to specify the set of network host computers that are to receive the notifications. The values passed with each SetSnmpTrapInfo method replaces all values set in any previous method to SetSnmpTrapInfo.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(
        SnmpTrapRecipient[] trapRecipients,
        Boolean clusterFaultTrapsEnabled,
        Boolean clusterFaultResolvedTrapsEnabled,
        Boolean clusterEventTrapsEnabled
        ) {
        return this.setSnmpTrapInfo(new SetSnmpTrapInfoRequest(trapRecipients, clusterFaultTrapsEnabled, clusterFaultResolvedTrapsEnabled, clusterEventTrapsEnabled));
    }
    /** 
     * SnmpSendTestTraps enables you to test SNMP functionality for a cluster. This method instructs the cluster to send test SNMP traps to the currently configured SNMP manager.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public SnmpSendTestTrapsResult snmpSendTestTraps() {
        return super.sendRequest("SnmpSendTestTraps", null, null, SnmpSendTestTrapsResult.class);
    }
    /** 
     * The CreateCluster method is used to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the MIP of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. The method is used only once each time a new cluster is initialized.
     * <br/><br/>
     * <b>Note</b>: You need to log into the node that is used as the master node for the cluster. Once logged in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the cluster. Then run the CreateCluster method.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(final CreateClusterRequest request) {
        return super.sendRequest("CreateCluster", request, CreateClusterRequest.class, CreateClusterResult.class);
    }

    /** 
     * The CreateCluster method is used to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the MIP of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. The method is used only once each time a new cluster is initialized.
     * <br/><br/>
     * <b>Note</b>: You need to log into the node that is used as the master node for the cluster. Once logged in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the cluster. Then run the CreateCluster method.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(
        Optional<Boolean> acceptEula,
        String mvip,
        String svip,
        Long repCount,
        String username,
        String password,
        String[] nodes,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createCluster(new CreateClusterRequest(acceptEula, mvip, svip, repCount, username, password, nodes, attributes));
    }
    /** 
     * AddDrives is used to add one or more available drives to the cluster enabling the drives to host a portion of the cluster's data.
     * When you add a node to the cluster or install new drives in an existing node, the new drives are marked as "available" and must be added via AddDrives before they can be utilized.
     * Use the "ListDrives" method to display drives that are "available" to be added.
     * When you add multiple drives, it is more efficient to add them in a single "AddDrives" method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to stabilize the storage load on the cluster.
     * <br/><br/>
     * When you add a drive, the system automatically determines the "type" of drive it should be.
     * <br/><br/>
     * The method returns immediately. However, it may take some time for the data in the cluster to be rebalanced using the newly added drives.
     * As the new drive(s) are syncing on the system, you can use the "ListSyncJobs" method to see how the drive(s) are being rebalanced and the progress of adding the new drive.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(final AddDrivesRequest request) {
        return super.sendRequest("AddDrives", request, AddDrivesRequest.class, AddDrivesResult.class);
    }

    /** 
     * AddDrives is used to add one or more available drives to the cluster enabling the drives to host a portion of the cluster's data.
     * When you add a node to the cluster or install new drives in an existing node, the new drives are marked as "available" and must be added via AddDrives before they can be utilized.
     * Use the "ListDrives" method to display drives that are "available" to be added.
     * When you add multiple drives, it is more efficient to add them in a single "AddDrives" method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to stabilize the storage load on the cluster.
     * <br/><br/>
     * When you add a drive, the system automatically determines the "type" of drive it should be.
     * <br/><br/>
     * The method returns immediately. However, it may take some time for the data in the cluster to be rebalanced using the newly added drives.
     * As the new drive(s) are syncing on the system, you can use the "ListSyncJobs" method to see how the drive(s) are being rebalanced and the progress of adding the new drive.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(
        NewDrive[] drives
        ) {
        return this.addDrives(new AddDrivesRequest(drives));
    }
    /** 
     * GetDriveConfig is used to display drive information for expected slice and block drive counts as well as the number of slices and block drives that are currently connected to the node.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("2")
    @ConnectionType("Node")
    public GetDriveConfigResult getDriveConfig() {
        return super.sendRequest("GetDriveConfig", null, null, GetDriveConfigResult.class);
    }
    /** 
     * GetDriveHardwareInfo returns all the hardware info for the given drive. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request) {
        return super.sendRequest("GetDriveHardwareInfo", request, GetDriveHardwareInfoRequest.class, GetDriveHardwareInfoResult.class);
    }

    /** 
     * GetDriveHardwareInfo returns all the hardware info for the given drive. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(
        Long driveID
        ) {
        return this.getDriveHardwareInfo(new GetDriveHardwareInfoRequest(driveID));
    }
    /** 
     * GetDriveStats return high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the cluster. Some values are specific to Block Drives. Statistical data may not be returned for both block and metadata drives when running this method.
     * For more information on which drive type returns which data, see Response Example (Block Drive) and Response Example (Volume Metadata Drive) in the SolidFire API guide.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getDriveStats(this, request);
    }

    /** 
     * GetDriveStats return high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the cluster. Some values are specific to Block Drives. Statistical data may not be returned for both block and metadata drives when running this method.
     * For more information on which drive type returns which data, see Response Example (Block Drive) and Response Example (Volume Metadata Drive) in the SolidFire API guide.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(
        Long driveID
        ) {
        return this.getDriveStats(new GetDriveStatsRequest(driveID));
    }
    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on the cluster to return drive hardware information for all the drives on all nodes.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(final ListDriveHardwareRequest request) {
        return super.sendRequest("ListDriveHardware", request, ListDriveHardwareRequest.class, ListDriveHardwareResult.class);
    }

    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on the cluster to return drive hardware information for all the drives on all nodes.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(
        Boolean force
        ) {
        return this.listDriveHardware(new ListDriveHardwareRequest(force));
    }
    /** 
     * ListDrives allows you to retrieve the list of the drives that exist in the cluster's active nodes.
     * This method returns drives that have been added as volume metadata or block drives as well as drives that have not been added and are available.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListDrivesResult listDrives() {
        return super.sendRequest("ListDrives", null, null, ListDrivesResult.class);
    }
    /** 
     * You can use RemoveDrives to proactively remove drives that are part of the cluster.
     * You may want to use this method when reducing cluster capacity or preparing to replace drives nearing the end of their service life.
     * Any data on the drives is removed and migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method.
     * Depending on the total capacity of the drives being removed, it may take several minutes to migrate all of the data.
     * Use the "GetAsyncResult" method to check the status of the remove operation.
     * <br/><br/>
     * When removing multiple drives, use a single "RemoveDrives" method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
     * <br/><br/>
     * You can also remove drives with a "failed" status using "RemoveDrives".
     * When you remove a drive with a "failed" status it is not returned to an "available" or "active" status.
     * The drive is unavailable for use in the cluster.
     * <br/><br/>
     * Use the "ListDrives" method to obtain the driveIDs for the drives you want to remove.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(final RemoveDrivesRequest request) {
        return super.sendRequest("RemoveDrives", request, RemoveDrivesRequest.class, AsyncHandleResult.class);
    }

    /** 
     * You can use RemoveDrives to proactively remove drives that are part of the cluster.
     * You may want to use this method when reducing cluster capacity or preparing to replace drives nearing the end of their service life.
     * Any data on the drives is removed and migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method.
     * Depending on the total capacity of the drives being removed, it may take several minutes to migrate all of the data.
     * Use the "GetAsyncResult" method to check the status of the remove operation.
     * <br/><br/>
     * When removing multiple drives, use a single "RemoveDrives" method call rather than multiple individual methods with a single drive each.
     * This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
     * <br/><br/>
     * You can also remove drives with a "failed" status using "RemoveDrives".
     * When you remove a drive with a "failed" status it is not returned to an "available" or "active" status.
     * The drive is unavailable for use in the cluster.
     * <br/><br/>
     * Use the "ListDrives" method to obtain the driveIDs for the drives you want to remove.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(
        Long[] drives
        ) {
        return this.removeDrives(new RemoveDrivesRequest(drives));
    }
    /** 
     * ResetDrives is used to pro-actively initialize drives and remove all data currently residing on the drive. The drive can then be reused in an existing node or used in an upgraded SolidFire node. This method requires the force=true parameter to be included in the method call.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("6")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(final ResetDrivesRequest request) {
        return super.sendRequest("ResetDrives", request, ResetDrivesRequest.class, ResetDrivesResult.class);
    }

    /** 
     * ResetDrives is used to pro-actively initialize drives and remove all data currently residing on the drive. The drive can then be reused in an existing node or used in an upgraded SolidFire node. This method requires the force=true parameter to be included in the method call.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("6")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(
        String drives,
        Boolean force
        ) {
        return this.resetDrives(new ResetDrivesRequest(drives, force));
    }
    /** 
     * SecureEraseDrives is used to remove any residual data from drives that have a status of "available." For example, when replacing a drive at its end-of-life that contained sensitive data.
     * It uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. The method may take up to two minutes to complete, so it is an asynchronous method.
     * The GetAsyncResult method can be used to check on the status of the secure erase operation.
     * <br/><br/>
     * Use the "ListDrives" method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request) {
        return super.sendRequest("SecureEraseDrives", request, SecureEraseDrivesRequest.class, AsyncHandleResult.class);
    }

    /** 
     * SecureEraseDrives is used to remove any residual data from drives that have a status of "available." For example, when replacing a drive at its end-of-life that contained sensitive data.
     * It uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. The method may take up to two minutes to complete, so it is an asynchronous method.
     * The GetAsyncResult method can be used to check on the status of the secure erase operation.
     * <br/><br/>
     * Use the "ListDrives" method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(
        Long[] drives
        ) {
        return this.secureEraseDrives(new SecureEraseDrivesRequest(drives));
    }
    /** 
     * The TestDrives API method is used to run a hardware validation on all the drives on the node. Hardware failures on the drives are detected if present and they are reported in the results of the validation tests.
     * <br/><br/>
     * <b>Note</b>: This test takes approximately 10 minutes.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(final TestDrivesRequest request) {
        return super.sendRequest("TestDrives", request, TestDrivesRequest.class, TestDrivesResult.class);
    }

    /** 
     * The TestDrives API method is used to run a hardware validation on all the drives on the node. Hardware failures on the drives are detected if present and they are reported in the results of the validation tests.
     * <br/><br/>
     * <b>Note</b>: This test takes approximately 10 minutes.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(
        Optional<Long> minutes
        ) {
        return this.testDrives(new TestDrivesRequest(minutes));
    }
    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI nodes and drives in the cluster. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(final GetClusterHardwareInfoRequest request) {
        return super.sendRequest("GetClusterHardwareInfo", request, GetClusterHardwareInfoRequest.class, GetClusterHardwareInfoResult.class);
    }

    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI nodes and drives in the cluster. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(
        Optional<String> type
        ) {
        return this.getClusterHardwareInfo(new GetClusterHardwareInfoRequest(type));
    }
    /** 
     * GetHardwareConfig enables you to display the hardware configuration information for a node. NOTE: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetHardwareConfigResult getHardwareConfig() {
        return super.sendRequest("GetHardwareConfig", null, null, GetHardwareConfigResult.class);
    }
    /** 
     * GetNodeHardwareInfo is used to return all the hardware info and status for the node specified. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(final GetNodeHardwareInfoRequest request) {
        return super.sendRequest("GetNodeHardwareInfo", request, GetNodeHardwareInfoRequest.class, GetNodeHardwareInfoResult.class);
    }

    /** 
     * GetNodeHardwareInfo is used to return all the hardware info and status for the node specified. This generally includes manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(
        Long nodeID
        ) {
        return this.getNodeHardwareInfo(new GetNodeHardwareInfoRequest(nodeID));
    }
    /** 
     * GetNvramInfo allows you to retrieve information from each node about the NVRAM card.  
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo() {
        return super.sendRequest("GetNvramInfo", null, null, GetNvramInfoResult.class);
    }
    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(final CreateInitiatorsRequest request) {
        return super.sendRequest("CreateInitiators", request, CreateInitiatorsRequest.class, CreateInitiatorsResult.class);
    }

    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(
        CreateInitiator[] initiators
        ) {
        return this.createInitiators(new CreateInitiatorsRequest(initiators));
    }
    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteInitiatorsResult deleteInitiators(final DeleteInitiatorsRequest request) {
        return super.sendRequest("DeleteInitiators", request, DeleteInitiatorsRequest.class, DeleteInitiatorsResult.class);
    }

    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteInitiatorsResult deleteInitiators(
        Long[] initiators
        ) {
        return this.deleteInitiators(new DeleteInitiatorsRequest(initiators));
    }
    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(final ListInitiatorsRequest request) {
        return super.sendRequest("ListInitiators", request, ListInitiatorsRequest.class, ListInitiatorsResult.class);
    }

    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(
        Optional<Long> startInitiatorID,
        Optional<Long> limit,
        Optional<Long[]> initiators
        ) {
        return this.listInitiators(new ListInitiatorsRequest(startInitiatorID, limit, initiators));
    }
    /** 
     * ModifyInitiators enables you to change the attributes of an existing initiator. You cannot change the name of an existing initiator. If you need to change the name of an initiator, delete the existing initiator with DeleteInitiators and create a new one with CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not create any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(final ModifyInitiatorsRequest request) {
        return super.sendRequest("ModifyInitiators", request, ModifyInitiatorsRequest.class, ModifyInitiatorsResult.class);
    }

    /** 
     * ModifyInitiators enables you to change the attributes of an existing initiator. You cannot change the name of an existing initiator. If you need to change the name of an initiator, delete the existing initiator with DeleteInitiators and create a new one with CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not create any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(
        ModifyInitiator[] initiators
        ) {
        return this.modifyInitiators(new ModifyInitiatorsRequest(initiators));
    }
    /** 
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public Object invokeSFApi(final InvokeSFApiRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.invokeSFApi(this, request);
    }

    /** 
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public Object invokeSFApi(
        String method,
        Optional<java.util.Map<String, Object>> parameters
        ) {
        return this.invokeSFApi(new InvokeSFApiRequest(method, parameters));
    }
    /** 
     * AddLdapClusterAdmin is used to add a new LDAP Cluster Admin. An LDAP Cluster Admin can be used to manage the cluster via the API and management tools. LDAP Cluster Admins are completely separate and unrelated to standard tenant accounts.
     * <br/><br/>
     * An LDAP group that has been defined in Active Directory can also be added using this API method. The access level that is given to the group will be passed to the individual users in the LDAP group.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(final AddLdapClusterAdminRequest request) {
        return super.sendRequest("AddLdapClusterAdmin", request, AddLdapClusterAdminRequest.class, AddLdapClusterAdminResult.class);
    }

    /** 
     * AddLdapClusterAdmin is used to add a new LDAP Cluster Admin. An LDAP Cluster Admin can be used to manage the cluster via the API and management tools. LDAP Cluster Admins are completely separate and unrelated to standard tenant accounts.
     * <br/><br/>
     * An LDAP group that has been defined in Active Directory can also be added using this API method. The access level that is given to the group will be passed to the individual users in the LDAP group.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(
        String username,
        String[] access,
        Optional<Boolean> acceptEula,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.addLdapClusterAdmin(new AddLdapClusterAdminRequest(username, access, acceptEula, attributes));
    }
    /** 
     * The DisableLdapAuthentication method is used disable LDAP authentication and remove all LDAP configuration settings. This call will not remove any configured cluster admin accounts (user or group). However, those cluster admin accounts will no longer be able to log in.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public DisableLdapAuthenticationResult disableLdapAuthentication() {
        return super.sendRequest("DisableLdapAuthentication", null, null, DisableLdapAuthenticationResult.class);
    }
    /** 
     * The EnableLdapAuthentication method is used to configure an LDAP server connection to use for LDAP authentication to a SolidFire cluster. Users that are members on the LDAP server can then log in to a SolidFire storage system using their LDAP authentication userid and password.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public EnableLdapAuthenticationResult enableLdapAuthentication(final EnableLdapAuthenticationRequest request) {
        return super.sendRequest("EnableLdapAuthentication", request, EnableLdapAuthenticationRequest.class, EnableLdapAuthenticationResult.class);
    }

    /** 
     * The EnableLdapAuthentication method is used to configure an LDAP server connection to use for LDAP authentication to a SolidFire cluster. Users that are members on the LDAP server can then log in to a SolidFire storage system using their LDAP authentication userid and password.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public EnableLdapAuthenticationResult enableLdapAuthentication(
        Optional<String> authType,
        Optional<String> groupSearchBaseDN,
        Optional<String> groupSearchCustomFilter,
        Optional<String> groupSearchType,
        Optional<String> searchBindDN,
        Optional<String> searchBindPassword,
        String[] serverURIs,
        Optional<String> userDNTemplate,
        Optional<String> userSearchBaseDN,
        Optional<String> userSearchFilter
        ) {
        return this.enableLdapAuthentication(new EnableLdapAuthenticationRequest(authType, groupSearchBaseDN, groupSearchCustomFilter, groupSearchType, searchBindDN, searchBindPassword, serverURIs, userDNTemplate, userSearchBaseDN, userSearchFilter));
    }
    /** 
     * The GetLdapConfiguration is used to get the LDAP configuration currently active on the cluster.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public GetLdapConfigurationResult getLdapConfiguration() {
        return super.sendRequest("GetLdapConfiguration", null, null, GetLdapConfigurationResult.class);
    }
    /** 
     * The TestLdapAuthentication is used to verify the currently enabled LDAP authentication configuration settings are correct. If the configuration settings are correct, the API call returns a list of the groups the tested user is a member of.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(final TestLdapAuthenticationRequest request) {
        return super.sendRequest("TestLdapAuthentication", request, TestLdapAuthenticationRequest.class, TestLdapAuthenticationResult.class);
    }

    /** 
     * The TestLdapAuthentication is used to verify the currently enabled LDAP authentication configuration settings are correct. If the configuration settings are correct, the API call returns a list of the groups the tested user is a member of.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(
        String username,
        String password,
        Optional<LdapConfiguration> ldapConfiguration
        ) {
        return this.testLdapAuthentication(new TestLdapAuthenticationRequest(username, password, ldapConfiguration));
    }
    /** 
     * GetLoginSessionInfo is used to return the period of time a log in authentication is valid for both log in shells and the TUI.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public GetLoginSessionInfoResult getLoginSessionInfo() {
        return super.sendRequest("GetLoginSessionInfo", null, null, GetLoginSessionInfoResult.class);
    }
    /** 
     * GetRemoteLoggingHosts is used to retrieve the current list of log servers.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetRemoteLoggingHostsResult getRemoteLoggingHosts() {
        return super.sendRequest("GetRemoteLoggingHosts", null, null, GetRemoteLoggingHostsResult.class);
    }
    /** 
     * SetLoginSessionInfo is used to set the period of time a log in authentication is valid. After the log in period elapses without activity on the system the authentication will expire. New log in credentials will be required for continued access to the cluster once the timeout period has elapsed.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(final SetLoginSessionInfoRequest request) {
        return super.sendRequest("SetLoginSessionInfo", request, SetLoginSessionInfoRequest.class, SetLoginSessionInfoResult.class);
    }

    /** 
     * SetLoginSessionInfo is used to set the period of time a log in authentication is valid. After the log in period elapses without activity on the system the authentication will expire. New log in credentials will be required for continued access to the cluster once the timeout period has elapsed.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(
        String timeout
        ) {
        return this.setLoginSessionInfo(new SetLoginSessionInfoRequest(timeout));
    }
    /** 
     * RemoteLoggingHosts is used to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use the GetRemoteLoggingHosts to determine what the current logging hosts are and then use the SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(final SetRemoteLoggingHostsRequest request) {
        return super.sendRequest("SetRemoteLoggingHosts", request, SetRemoteLoggingHostsRequest.class, SetRemoteLoggingHostsResult.class);
    }

    /** 
     * RemoteLoggingHosts is used to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use the GetRemoteLoggingHosts to determine what the current logging hosts are and then use the SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(
        LoggingServer[] remoteHosts
        ) {
        return this.setRemoteLoggingHosts(new SetRemoteLoggingHostsRequest(remoteHosts));
    }
    /** 
     * The ListFibreChannelPortInfo is used to return information about the Fibre Channel ports. The API method is intended for use on individual nodes; userid and password is required for access to individual Fibre Channel nodes.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ListFibreChannelPortInfoResult listFibreChannelPortInfo() {
        return super.sendRequest("ListFibreChannelPortInfo", null, null, ListFibreChannelPortInfoResult.class);
    }
    /** 
     * The ListFibreChannelSessions is used to return information about the active Fibre Channel sessions on a cluster.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListFibreChannelSessionsResult listFibreChannelSessions() {
        return super.sendRequest("ListFibreChannelSessions", null, null, ListFibreChannelSessionsResult.class);
    }
    /** 
     * ListISCSISessions is used to return iSCSI connection information for volumes in the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListISCSISessionsResult listISCSISessions() {
        return super.sendRequest("ListISCSISessions", null, null, ListISCSISessionsResult.class);
    }
    /** 
     * The ListNetworkInterfaces API method is used to return information about each network interface on a node. The API method is intended for use on individual nodes. 
     **/
    @Override
    @Since("7")
    @ConnectionType("Node")
    public ListNetworkInterfacesResult listNetworkInterfaces() {
        return super.sendRequest("ListNetworkInterfaces", null, null, ListNetworkInterfacesResult.class);
    }
    /** 
     * The ListNodeFibreChannelPortInfo is used to return information about the Fibre Channel ports. The API method is intended for use on individual nodes; userid and password is required for access to individual Fibre Channel nodes.
     **/
    @Override
    @Since("7")
    @ConnectionType("Node")
    public ListNodeFibreChannelPortInfoResult listNodeFibreChannelPortInfo() {
        return super.sendRequest("ListNodeFibreChannelPortInfo", null, null, ListNodeFibreChannelPortInfoResult.class);
    }
    /** 
     * AddNodes is used to add one or more new nodes to the cluster. When a node is not configured and starts up for the first time you are prompted to configure the node. Once a node is configured it is registered as a "pending node" with the cluster.
     * <br/><br/>
     * Adding a node to a cluster that has been set up for virtual networking will require a sufficient number of virtual storage IP addresses to allocate a virtual IP to the new node. If there are no virtual IP addresses available for the new node, the AddNode operation will not complete successfully. Use the "ModifyVirtualNetwork" method to add more storage IP addresses to your virtual network.
     * <br/><br/>
     * The software version on each node in a cluster must be compatible. Run the "ListAllNodes" API to see what versions of software are currently running on the cluster nodes. For an explanation of software version compatibility, see "Node Versioning and Compatibility" in the Element API guide.
     * <br/><br/>
     * Once a node has been added, the drives on the node are made available and can then be added via the "AddDrives" method to increase the storage capacity of the cluster.
     * <br/><br/>
     * <b>Note</b>: It may take several seconds after adding a new Node for it to start up and register the drives as being available.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(final AddNodesRequest request) {
        return super.sendRequest("AddNodes", request, AddNodesRequest.class, AddNodesResult.class);
    }

    /** 
     * AddNodes is used to add one or more new nodes to the cluster. When a node is not configured and starts up for the first time you are prompted to configure the node. Once a node is configured it is registered as a "pending node" with the cluster.
     * <br/><br/>
     * Adding a node to a cluster that has been set up for virtual networking will require a sufficient number of virtual storage IP addresses to allocate a virtual IP to the new node. If there are no virtual IP addresses available for the new node, the AddNode operation will not complete successfully. Use the "ModifyVirtualNetwork" method to add more storage IP addresses to your virtual network.
     * <br/><br/>
     * The software version on each node in a cluster must be compatible. Run the "ListAllNodes" API to see what versions of software are currently running on the cluster nodes. For an explanation of software version compatibility, see "Node Versioning and Compatibility" in the Element API guide.
     * <br/><br/>
     * Once a node has been added, the drives on the node are made available and can then be added via the "AddDrives" method to increase the storage capacity of the cluster.
     * <br/><br/>
     * <b>Note</b>: It may take several seconds after adding a new Node for it to start up and register the drives as being available.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(
        Long[] pendingNodes
        ) {
        return this.addNodes(new AddNodesRequest(pendingNodes));
    }
    /** 
     * The GetConfig API method is used to retrieve all the configuration information for the node. This one API method includes the same information available in both "GetClusterConfig" and "GetNetworkConfig" methods.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetConfigResult getConfig() {
        return super.sendRequest("GetConfig", null, null, GetConfigResult.class);
    }
    /** 
     * The GetNetworkConfig API method is used to display the network configuration information for a node.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetNetworkConfigResult getNetworkConfig() {
        return super.sendRequest("GetNetworkConfig", null, null, GetNetworkConfigResult.class);
    }
    /** 
     * GetNodeStats is used to return the high-level activity measurements for a single node.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(final GetNodeStatsRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getNodeStats(this, request);
    }

    /** 
     * GetNodeStats is used to return the high-level activity measurements for a single node.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(
        Long nodeID
        ) {
        return this.getNodeStats(new GetNodeStatsRequest(nodeID));
    }
    /** 
     * GetOrigin enables you to retrieve the origination certificate for where the node was built.NOTE: The GetOrigin method may return "null" if there is no origination certification.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetOriginResult getOrigin(final GetOriginRequest request) {
        return super.sendRequest("GetOrigin", request, GetOriginRequest.class, GetOriginResult.class);
    }

    /** 
     * GetOrigin enables you to retrieve the origination certificate for where the node was built.NOTE: The GetOrigin method may return "null" if there is no origination certification.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetOriginResult getOrigin(
        Boolean force
        ) {
        return this.getOrigin(new GetOriginRequest(force));
    }
    /** 
     * GetPendingOperation is used to detect an operation on a node that is currently in progress. This method can also be used to report back when an operation has completed.<br/>
     * <br/>
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public GetPendingOperationResult getPendingOperation() {
        return super.sendRequest("GetPendingOperation", null, null, GetPendingOperationResult.class);
    }
    /** 
     * ListActiveNodes returns the list of currently active nodes that are in the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListActiveNodesResult listActiveNodes() {
        return super.sendRequest("ListActiveNodes", null, null, ListActiveNodesResult.class);
    }
    /** 
     * ListAllNodes enables you to retrieve a list of active and pending nodes in the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListAllNodesResult listAllNodes() {
        return super.sendRequest("ListAllNodes", null, null, ListAllNodesResult.class);
    }
    /** 
     * ListNodeStats is used to return the high-level activity measurements for all nodes in a cluster.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListNodeStatsResult listNodeStats() {
        return super.sendRequest("ListNodeStats", null, null, ListNodeStatsResult.class);
    }
    /** 
     * ListPendingActiveNodes returns the list of nodes in the cluster that are currently in the PendingActive state, between the pending and active states. These are nodes that are currently being returned to the factory image.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListPendingActiveNodesResult listPendingActiveNodes() {
        return super.sendRequest("ListPendingActiveNodes", null, null, ListPendingActiveNodesResult.class);
    }
    /** 
     * Gets the list of pending nodes.
     * Pending nodes are running and configured to join the cluster, but have not been added via the AddNodes method.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListPendingNodesResult listPendingNodes() {
        return super.sendRequest("ListPendingNodes", null, null, ListPendingNodesResult.class);
    }
    /** 
     * RemoveNodes is used to remove one or more nodes that should no longer participate in the cluster. Before removing a node, all drives it contains must first be removed with "RemoveDrives" method. A node cannot be removed until the RemoveDrives process has completed and all data has been migrated away from the node.
     * <br/><br/>
     * Once removed, a node registers itself as a pending node and can be added again, or shut down which removes it from the "Pending Node" list.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request) {
        return super.sendRequest("RemoveNodes", request, RemoveNodesRequest.class, RemoveNodesResult.class);
    }

    /** 
     * RemoveNodes is used to remove one or more nodes that should no longer participate in the cluster. Before removing a node, all drives it contains must first be removed with "RemoveDrives" method. A node cannot be removed until the RemoveDrives process has completed and all data has been migrated away from the node.
     * <br/><br/>
     * Once removed, a node registers itself as a pending node and can be added again, or shut down which removes it from the "Pending Node" list.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(
        Long[] nodes
        ) {
        return this.removeNodes(new RemoveNodesRequest(nodes));
    }
    /** 
     * The SetConfig API method is used to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method.
     * <br/><br/>
     * <b>Warning!</b> Changing the 'bond-mode' on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetConfigResult setConfig(final SetConfigRequest request) {
        return super.sendRequest("SetConfig", request, SetConfigRequest.class, SetConfigResult.class);
    }

    /** 
     * The SetConfig API method is used to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method.
     * <br/><br/>
     * <b>Warning!</b> Changing the 'bond-mode' on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetConfigResult setConfig(
        Config config
        ) {
        return this.setConfig(new SetConfigRequest(config));
    }
    /** 
     * The "SetNetworkConfig" method is used to set the network configuration for a node. To see the states in which these objects can be modified, see "Network Object for 1G and 10G Interfaces" on page 109 of the Element API. To display the current network settings for a node, run the "GetNetworkConfig" method.
     * <br/><br/>
     * <b>WARNING!</b> Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request) {
        return super.sendRequest("SetNetworkConfig", request, SetNetworkConfigRequest.class, SetNetworkConfigResult.class);
    }

    /** 
     * The "SetNetworkConfig" method is used to set the network configuration for a node. To see the states in which these objects can be modified, see "Network Object for 1G and 10G Interfaces" on page 109 of the Element API. To display the current network settings for a node, run the "GetNetworkConfig" method.
     * <br/><br/>
     * <b>WARNING!</b> Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Caution should be taken when using this method.
     * <br/><br/>
     * <b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(
        Network network
        ) {
        return this.setNetworkConfig(new SetNetworkConfigRequest(network));
    }
    /** 
     * GetBootstrapConfig returns the cluster name and node name from the bootstrap configuration file. This API method should be performed on an individual node before it has been configured into a cluster. The resulting information from this method is used in the Cluster Configuration UI when the cluster is eventually created.
     **/
    @Override
    @Since("2")
    @ConnectionType("Both")
    public GetBootstrapConfigResult getBootstrapConfig() {
        return super.sendRequest("GetBootstrapConfig", null, null, GetBootstrapConfigResult.class);
    }
    /** 
     * The CompleteClusterPairing method is the second step in the cluster pairing process.
     * Use this method with the encoded key received from the "StartClusterPairing" API method to complete the cluster pairing process.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request) {
        return super.sendRequest("CompleteClusterPairing", request, CompleteClusterPairingRequest.class, CompleteClusterPairingResult.class);
    }

    /** 
     * The CompleteClusterPairing method is the second step in the cluster pairing process.
     * Use this method with the encoded key received from the "StartClusterPairing" API method to complete the cluster pairing process.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(
        String clusterPairingKey
        ) {
        return this.completeClusterPairing(new CompleteClusterPairingRequest(clusterPairingKey));
    }
    /** 
     * CompleteVolumePairing is used to complete the pairing of two volumes.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(final CompleteVolumePairingRequest request) {
        return super.sendRequest("CompleteVolumePairing", request, CompleteVolumePairingRequest.class, CompleteVolumePairingResult.class);
    }

    /** 
     * CompleteVolumePairing is used to complete the pairing of two volumes.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(
        String volumePairingKey,
        Long volumeID
        ) {
        return this.completeVolumePairing(new CompleteVolumePairingRequest(volumePairingKey, volumeID));
    }
    /** 
     * ListActivePairedVolumes is used to list all of the active volumes paired with a volume.
     * Volumes listed in the return for this method include volumes with active and pending pairings.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes() {
        return super.sendRequest("ListActivePairedVolumes", null, null, ListActivePairedVolumesResult.class);
    }
    /** 
     * ListClusterPairs is used to list all of the clusters a cluster is paired with.
     * This method returns information about active and pending cluster pairings, such as statistics about the current pairing as well as the connectivity and latency (in milliseconds) of the cluster pairing.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListClusterPairsResult listClusterPairs() {
        return super.sendRequest("ListClusterPairs", null, null, ListClusterPairsResult.class);
    }
    /** 
     * ModifyVolumePair is used to pause or restart replication between a pair of volumes.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(final ModifyVolumePairRequest request) {
        return super.sendRequest("ModifyVolumePair", request, ModifyVolumePairRequest.class, ModifyVolumePairResult.class);
    }

    /** 
     * ModifyVolumePair is used to pause or restart replication between a pair of volumes.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(
        Long volumeID,
        Optional<Boolean> pausedManual,
        Optional<String> mode
        ) {
        return this.modifyVolumePair(new ModifyVolumePairRequest(volumeID, pausedManual, mode));
    }
    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.<br/>
     * <b>Note</b>: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request) {
        return super.sendRequest("RemoveClusterPair", request, RemoveClusterPairRequest.class, RemoveClusterPairResult.class);
    }

    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.<br/>
     * <b>Note</b>: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(
        Long clusterPairID
        ) {
        return this.removeClusterPair(new RemoveClusterPairRequest(clusterPairID));
    }
    /** 
     * RemoveVolumePair is used to remove the remote pairing between two volumes.
     * When the volume pairing information is removed, data is no longer replicated to or from the volume.
     * This method should be run on both the source and target volumes that are paired together.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(final RemoveVolumePairRequest request) {
        return super.sendRequest("RemoveVolumePair", request, RemoveVolumePairRequest.class, RemoveVolumePairResult.class);
    }

    /** 
     * RemoveVolumePair is used to remove the remote pairing between two volumes.
     * When the volume pairing information is removed, data is no longer replicated to or from the volume.
     * This method should be run on both the source and target volumes that are paired together.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(
        Long volumeID
        ) {
        return this.removeVolumePair(new RemoveVolumePairRequest(volumeID));
    }
    /** 
     * StartClusterPairing is used to create an encoded key from a cluster that is used to pair with another cluster.
     * The key created from this API method is used in the "CompleteClusterPairing" API method to establish a cluster pairing.
     * You can pair a cluster with a maximum of four other SolidFire clusters.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartClusterPairingResult startClusterPairing() {
        return super.sendRequest("StartClusterPairing", null, null, StartClusterPairingResult.class);
    }
    /** 
     * StartVolumePairing is used to create an encoded key from a volume that is used to pair with another volume.
     * The key that this method creates is used in the "CompleteVolumePairing" API method to establish a volume pairing.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(final StartVolumePairingRequest request) {
        return super.sendRequest("StartVolumePairing", request, StartVolumePairingRequest.class, StartVolumePairingResult.class);
    }

    /** 
     * StartVolumePairing is used to create an encoded key from a volume that is used to pair with another volume.
     * The key that this method creates is used in the "CompleteVolumePairing" API method to establish a volume pairing.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(
        Long volumeID,
        Optional<String> mode
        ) {
        return this.startVolumePairing(new StartVolumePairingRequest(volumeID, mode));
    }
    /** 
     * Gets protocol endpoints in the system
     * If protocolEndpointIDs isn't specified all protocol endpoints
     * are returned. Else the supplied protocolEndpointIDs are.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(final ListProtocolEndpointsRequest request) {
        return super.sendRequest("ListProtocolEndpoints", request, ListProtocolEndpointsRequest.class, ListProtocolEndpointsResult.class);
    }

    /** 
     * Gets protocol endpoints in the system
     * If protocolEndpointIDs isn't specified all protocol endpoints
     * are returned. Else the supplied protocolEndpointIDs are.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(
        Optional<java.util.UUID[]> protocolEndpointIDs
        ) {
        return this.listProtocolEndpoints(new ListProtocolEndpointsRequest(protocolEndpointIDs));
    }
    /** 
     * Allows you to reset a node to the SolidFire factory settings. All data will be deleted from the node when you call this method. A node participating in a cluster cannot be reset.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ResetNodeResult resetNode(final ResetNodeRequest request) {
        return super.sendRequest("ResetNode", request, ResetNodeRequest.class, ResetNodeResult.class);
    }

    /** 
     * Allows you to reset a node to the SolidFire factory settings. All data will be deleted from the node when you call this method. A node participating in a cluster cannot be reset.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ResetNodeResult resetNode(
        String build,
        Boolean force,
        String option
        ) {
        return this.resetNode(new ResetNodeRequest(build, force, option));
    }
    /** 
     * The RestartNetworking API method is used to restart the networking services on a node.WARNING! This method restarts all networking services on a node, causing temporary loss of networking connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    @SuppressWarnings("unchecked")
    public java.util.Map<String, Object> restartNetworking(final RestartNetworkingRequest request) {
        return super.sendRequest("RestartNetworking", request, RestartNetworkingRequest.class, java.util.Map.class);
    }

    /** 
     * The RestartNetworking API method is used to restart the networking services on a node.WARNING! This method restarts all networking services on a node, causing temporary loss of networking connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public java.util.Map<String, Object> restartNetworking(
        Boolean force
        ) {
        return this.restartNetworking(new RestartNetworkingRequest(force));
    }
    /** 
     * The RestartServices API method is used to restart the  Element services on a node.Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    @SuppressWarnings("unchecked")
    public java.util.Map<String, Object> restartServices(final RestartServicesRequest request) {
        return super.sendRequest("RestartServices", request, RestartServicesRequest.class, java.util.Map.class);
    }

    /** 
     * The RestartServices API method is used to restart the  Element services on a node.Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public java.util.Map<String, Object> restartServices(
        Boolean force,
        Optional<String> service,
        Optional<String> action
        ) {
        return this.restartServices(new RestartServicesRequest(force, service, action));
    }
    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method, login in to the MIP for the pending node and enter the "shutdown" method with either the "restart" or "halt" options in the following table.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(final ShutdownRequest request) {
        return super.sendRequest("Shutdown", request, ShutdownRequest.class, ShutdownResult.class);
    }

    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method, login in to the MIP for the pending node and enter the "shutdown" method with either the "restart" or "halt" options in the following table.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(
        Optional<Long[]> nodes,
        String option
        ) {
        return this.shutdown(new ShutdownRequest(nodes, option));
    }
    /** 
     * List the services in the cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListServicesResult listServices() {
        return super.sendRequest("ListServices", null, null, ListServicesResult.class);
    }
    /** 
     * CreateGroupSnapshot is used to create a point-in-time copy of a group of volumes.
     * The snapshot created can then be used later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time in which the snapshot was created.
     * <br/><br/>
     * <b>Note</b>: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request) {
        return super.sendRequest("CreateGroupSnapshot", request, CreateGroupSnapshotRequest.class, CreateGroupSnapshotResult.class);
    }

    /** 
     * CreateGroupSnapshot is used to create a point-in-time copy of a group of volumes.
     * The snapshot created can then be used later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time in which the snapshot was created.
     * <br/><br/>
     * <b>Note</b>: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createGroupSnapshot(new CreateGroupSnapshotRequest(volumes, name, enableRemoteReplication, retention, attributes));
    }
    /** 
     * CreateSchedule is used to create a schedule that will autonomously make a snapshot of a volume at a defined interval.<br/>
     * <br/>
     * The snapshot created can be used later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for the point in time in which the snapshot was created. <br/>
     * <br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(final CreateScheduleRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.createSchedule(this, request);
    }

    /** 
     * CreateSchedule is used to create a schedule that will autonomously make a snapshot of a volume at a defined interval.<br/>
     * <br/>
     * The snapshot created can be used later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for the point in time in which the snapshot was created. <br/>
     * <br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(
        Schedule schedule
        ) {
        return this.createSchedule(new CreateScheduleRequest(schedule));
    }
    /** 
     * CreateSnapshot is used to create a point-in-time copy of a volume.
     * A snapshot can be created from any volume or from an existing snapshot.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request) {
        return super.sendRequest("CreateSnapshot", request, CreateSnapshotRequest.class, CreateSnapshotResult.class);
    }

    /** 
     * CreateSnapshot is used to create a point-in-time copy of a volume.
     * A snapshot can be created from any volume or from an existing snapshot.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createSnapshot(new CreateSnapshotRequest(volumeID, snapshotID, name, enableRemoteReplication, retention, attributes));
    }
    /** 
     * DeleteGroupSnapshot is used to delete a group snapshot.
     * The saveMembers parameter can be used to preserve all the snapshots that
     * were made for the volumes in the group but the group association will be removed.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request) {
        return super.sendRequest("DeleteGroupSnapshot", request, DeleteGroupSnapshotRequest.class, DeleteGroupSnapshotResult.class);
    }

    /** 
     * DeleteGroupSnapshot is used to delete a group snapshot.
     * The saveMembers parameter can be used to preserve all the snapshots that
     * were made for the volumes in the group but the group association will be removed.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(
        Long groupSnapshotID,
        Boolean saveMembers
        ) {
        return this.deleteGroupSnapshot(new DeleteGroupSnapshotRequest(groupSnapshotID, saveMembers));
    }
    /** 
     * DeleteSnapshot is used to delete a snapshot.
     * A snapshot that is currently the "active" snapshot cannot be deleted.
     * You must rollback and make another snapshot "active" before the current snapshot can be deleted.
     * To rollback a snapshot, use RollbackToSnapshot.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request) {
        return super.sendRequest("DeleteSnapshot", request, DeleteSnapshotRequest.class, DeleteSnapshotResult.class);
    }

    /** 
     * DeleteSnapshot is used to delete a snapshot.
     * A snapshot that is currently the "active" snapshot cannot be deleted.
     * You must rollback and make another snapshot "active" before the current snapshot can be deleted.
     * To rollback a snapshot, use RollbackToSnapshot.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(
        Long snapshotID
        ) {
        return this.deleteSnapshot(new DeleteSnapshotRequest(snapshotID));
    }
    /** 
     * GetSchedule is used to return information about a scheduled snapshot that has been created. You can see information about a specified schedule if there are many snapshot schedules in the system. You can include more than one schedule with this method by specifying additional scheduleIDs to the parameter.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(final GetScheduleRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getSchedule(this, request);
    }

    /** 
     * GetSchedule is used to return information about a scheduled snapshot that has been created. You can see information about a specified schedule if there are many snapshot schedules in the system. You can include more than one schedule with this method by specifying additional scheduleIDs to the parameter.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(
        Long scheduleID
        ) {
        return this.getSchedule(new GetScheduleRequest(scheduleID));
    }
    /** 
     * ListGroupSnapshots is used to return information about all group snapshots that have been created.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request) {
        return super.sendRequest("ListGroupSnapshots", request, ListGroupSnapshotsRequest.class, ListGroupSnapshotsResult.class);
    }

    /** 
     * ListGroupSnapshots is used to return information about all group snapshots that have been created.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(
        Optional<Long> volumeID
        ) {
        return this.listGroupSnapshots(new ListGroupSnapshotsRequest(volumeID));
    }
    /** 
     * ListSchedule is used to return information about all scheduled snapshots that have been created.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ListSchedulesResult listSchedules() {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.listSchedules(this);
    }
    /** 
     * ListSnapshots is used to return the attributes of each snapshot taken on the volume.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request) {
        return super.sendRequest("ListSnapshots", request, ListSnapshotsRequest.class, ListSnapshotsResult.class);
    }

    /** 
     * ListSnapshots is used to return the attributes of each snapshot taken on the volume.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(
        Optional<Long> volumeID
        ) {
        return this.listSnapshots(new ListSnapshotsRequest(volumeID));
    }
    /** 
     * ModifyGroupSnapshot is used to change the attributes currently assigned to a group snapshot.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request) {
        return super.sendRequest("ModifyGroupSnapshot", request, ModifyGroupSnapshotRequest.class, ModifyGroupSnapshotResult.class);
    }

    /** 
     * ModifyGroupSnapshot is used to change the attributes currently assigned to a group snapshot.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(
        Long groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
        ) {
        return this.modifyGroupSnapshot(new ModifyGroupSnapshotRequest(groupSnapshotID, expirationTime, enableRemoteReplication));
    }
    /** 
     * ModifySchedule is used to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.<br/>
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(final ModifyScheduleRequest request) {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.modifySchedule(this, request);
    }

    /** 
     * ModifySchedule is used to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.<br/>
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(
        Schedule schedule
        ) {
        return this.modifySchedule(new ModifyScheduleRequest(schedule));
    }
    /** 
     * ModifySnapshot is used to change the attributes currently assigned to a snapshot.
     * Use this API method to enable the snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request) {
        return super.sendRequest("ModifySnapshot", request, ModifySnapshotRequest.class, ModifySnapshotResult.class);
    }

    /** 
     * ModifySnapshot is used to change the attributes currently assigned to a snapshot.
     * Use this API method to enable the snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(
        Long snapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
        ) {
        return this.modifySnapshot(new ModifySnapshotRequest(snapshotID, expirationTime, enableRemoteReplication));
    }
    /** 
     * RollbackToGroupSnapshot is used to roll back each individual volume in a snapshot group to a copy of their individual snapshots.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request) {
        return super.sendRequest("RollbackToGroupSnapshot", request, RollbackToGroupSnapshotRequest.class, CreateGroupSnapshotResult.class);
    }

    /** 
     * RollbackToGroupSnapshot is used to roll back each individual volume in a snapshot group to a copy of their individual snapshots.
     * <br/><br/>
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult rollbackToGroupSnapshot(
        Long groupSnapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.rollbackToGroupSnapshot(new RollbackToGroupSnapshotRequest(groupSnapshotID, saveCurrentState, name, attributes));
    }
    /** 
     * RollbackToSnapshot is used to make an existing snapshot the "active" volume image. This method creates a new 
     * snapshot from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until 
     * it is manually deleted. The previously "active" snapshot is deleted unless the parameter saveCurrentState is set with 
     * a value of "true."
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request) {
        return super.sendRequest("RollbackToSnapshot", request, RollbackToSnapshotRequest.class, CreateSnapshotResult.class);
    }

    /** 
     * RollbackToSnapshot is used to make an existing snapshot the "active" volume image. This method creates a new 
     * snapshot from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until 
     * it is manually deleted. The previously "active" snapshot is deleted unless the parameter saveCurrentState is set with 
     * a value of "true."
     * <b>Note</b>: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public CreateSnapshotResult rollbackToSnapshot(
        Long volumeID,
        Long snapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.rollbackToSnapshot(new RollbackToSnapshotRequest(volumeID, snapshotID, saveCurrentState, name, attributes));
    }
    /** 
     * The GetCompleteStats API method is used by SolidFire engineering to troubleshoot new features. The data returned from GetCompleteStats is not documented, changes frequently, and is not guaranteed to be accurate. It is not recommended to ever use GetCompleteStats for collecting performance data or any other management integration with a SolidFire cluster.
     * The data returned from GetCompleteStats changes frequently, and is not guaranteed to accurately show performance from the system. It is not recommended to ever use GetCompleteStats for collecting performance data or any other management integration with a SolidFire cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public Object getCompleteStats() {
        return super.sendRequest("GetCompleteStats", null, null, Object.class);
    }
    /** 
     * GetHardwareInfo allows you to return hardware information and status for a single node. This generally includes manufacturers, vendors, versions, drives, and other associated hardware identification information.
     **/
    @Override
    @Since("9")
    @ConnectionType("Node")
    public GetHardwareInfoResult getHardwareInfo() {
        return super.sendRequest("GetHardwareInfo", null, null, GetHardwareInfoResult.class);
    }
    /** 
     * The GetRawStats call is used by SolidFire engineering to troubleshoot new features. The data returned from GetRawStats is not documented, it changes frequently, and is not guaranteed to be accurate. It is not recommended to ever use GetRawStats for collecting performance data or any other management integration with a SolidFire cluster.
     * The data returned from GetRawStats changes frequently, and is not guaranteed to accurately show performance from the system. It is not recommended to ever use GetRawStats for collecting performance data or any other management integration with a SolidFire cluster.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public Object getRawStats() {
        return super.sendRequest("GetRawStats", null, null, Object.class);
    }
    /** 
     * ListDriveStats enables you to retrieve  high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives. For more information on what data each drive type returns, see the response examples for the GetDriveStats method.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(final ListDriveStatsRequest request) {
        return super.sendRequest("ListDriveStats", request, ListDriveStatsRequest.class, ListDriveStatsResult.class);
    }

    /** 
     * ListDriveStats enables you to retrieve  high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives. For more information on what data each drive type returns, see the response examples for the GetDriveStats method.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(
        Optional<Long[]> drives
        ) {
        return this.listDriveStats(new ListDriveStatsRequest(drives));
    }
    /** 
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(final ListVolumeStatsRequest request) {
        return super.sendRequest("ListVolumeStats", request, ListVolumeStatsRequest.class, ListVolumeStatsResult.class);
    }

    /** 
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(
        Optional<Long[]> volumeIDs
        ) {
        return this.listVolumeStats(new ListVolumeStatsRequest(volumeIDs));
    }
    /** 
     * ListVolumeStatsByVirtualVolume enables you to list statistics for volumes, sorted by virtual volumes.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(final ListVolumeStatsByVirtualVolumeRequest request) {
        return super.sendRequest("ListVolumeStatsByVirtualVolume", request, ListVolumeStatsByVirtualVolumeRequest.class, ListVolumeStatsByVirtualVolumeResult.class);
    }

    /** 
     * ListVolumeStatsByVirtualVolume enables you to list statistics for volumes, sorted by virtual volumes.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(
        Optional<java.util.UUID[]> virtualVolumeIDs
        ) {
        return this.listVolumeStatsByVirtualVolume(new ListVolumeStatsByVirtualVolumeRequest(virtualVolumeIDs));
    }
    /** 
     * Creates a new VVols storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(final CreateStorageContainerRequest request) {
        return super.sendRequest("CreateStorageContainer", request, CreateStorageContainerRequest.class, CreateStorageContainerResult.class);
    }

    /** 
     * Creates a new VVols storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(
        String name,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret
        ) {
        return this.createStorageContainer(new CreateStorageContainerRequest(name, initiatorSecret, targetSecret));
    }
    /** 
     * Deletes a storage container from the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(final DeleteStorageContainersRequest request) {
        return super.sendRequest("DeleteStorageContainers", request, DeleteStorageContainersRequest.class, DeleteStorageContainerResult.class);
    }

    /** 
     * Deletes a storage container from the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(
        java.util.UUID[] storageContainerIDs
        ) {
        return this.deleteStorageContainers(new DeleteStorageContainersRequest(storageContainerIDs));
    }
    /** 
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(final GetStorageContainerEfficiencyRequest request) {
        return super.sendRequest("GetStorageContainerEfficiency", request, GetStorageContainerEfficiencyRequest.class, GetStorageContainerEfficiencyResult.class);
    }

    /** 
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(
        java.util.UUID storageContainerID
        ) {
        return this.getStorageContainerEfficiency(new GetStorageContainerEfficiencyRequest(storageContainerID));
    }
    /** 
     * Gets information for all storage containers currently in the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(final ListStorageContainersRequest request) {
        return super.sendRequest("ListStorageContainers", request, ListStorageContainersRequest.class, ListStorageContainersResult.class);
    }

    /** 
     * Gets information for all storage containers currently in the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(
        Optional<java.util.UUID[]> storageContainerIDs
        ) {
        return this.listStorageContainers(new ListStorageContainersRequest(storageContainerIDs));
    }
    /** 
     * Modifies an existing storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(final ModifyStorageContainerRequest request) {
        return super.sendRequest("ModifyStorageContainer", request, ModifyStorageContainerRequest.class, ModifyStorageContainerResult.class);
    }

    /** 
     * Modifies an existing storage container.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(
        java.util.UUID storageContainerID,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret
        ) {
        return this.modifyStorageContainer(new ModifyStorageContainerRequest(storageContainerID, initiatorSecret, targetSecret));
    }
    /** 
     * The ListTests API method is used to return the tests that are available to run on a node.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public ListTestsResult listTests() {
        return super.sendRequest("ListTests", null, null, ListTestsResult.class);
    }
    /** 
     * The ListUtilities API method is used to return the tests that are available to run on a node.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public ListUtilitiesResult listUtilities() {
        return super.sendRequest("ListUtilities", null, null, ListUtilitiesResult.class);
    }
    /** 
     * The TestConnectEnsemble API method is used to verify connectivity with a sepcified database ensemble. By default it uses the ensemble for the cluster the node is associated with. Alternatively you can provide a different ensemble to test connectivity with.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(final TestConnectEnsembleRequest request) {
        return super.sendRequest("TestConnectEnsemble", request, TestConnectEnsembleRequest.class, TestConnectEnsembleResult.class);
    }

    /** 
     * The TestConnectEnsemble API method is used to verify connectivity with a sepcified database ensemble. By default it uses the ensemble for the cluster the node is associated with. Alternatively you can provide a different ensemble to test connectivity with.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(
        Optional<String> ensemble
        ) {
        return this.testConnectEnsemble(new TestConnectEnsembleRequest(ensemble));
    }
    /** 
     * The TestConnectMvip API method is used to test the management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(final TestConnectMvipRequest request) {
        return super.sendRequest("TestConnectMvip", request, TestConnectMvipRequest.class, TestConnectMvipResult.class);
    }

    /** 
     * The TestConnectMvip API method is used to test the management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(
        Optional<String> mvip
        ) {
        return this.testConnectMvip(new TestConnectMvipRequest(mvip));
    }
    /** 
     * The TestConnectSvip API method is used to test the storage connection to the cluster. The test pings the SVIP using ICMP packets and when successful connects as an iSCSI initiator.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(final TestConnectSvipRequest request) {
        return super.sendRequest("TestConnectSvip", request, TestConnectSvipRequest.class, TestConnectSvipResult.class);
    }

    /** 
     * The TestConnectSvip API method is used to test the storage connection to the cluster. The test pings the SVIP using ICMP packets and when successful connects as an iSCSI initiator.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(
        Optional<String> svip
        ) {
        return this.testConnectSvip(new TestConnectSvipRequest(svip));
    }
    /** 
     * The TestPing API method is used to validate the connection to all nodes in the cluster on both 1G and 10G interfaces using ICMP packets. The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestPingResult testPing(final TestPingRequest request) {
        return super.sendRequest("TestPing", request, TestPingRequest.class, TestPingResult.class);
    }

    /** 
     * The TestPing API method is used to validate the connection to all nodes in the cluster on both 1G and 10G interfaces using ICMP packets. The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * <br/><b>Note</b>: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5")
    @ConnectionType("Node")
    public TestPingResult testPing(
        Optional<Long> attempts,
        Optional<String> hosts,
        Optional<Long> totalTimeoutSec,
        Optional<Long> packetSize,
        Optional<Long> pingTimeoutMsec
        ) {
        return this.testPing(new TestPingRequest(attempts, hosts, totalTimeoutSec, packetSize, pingTimeoutMsec));
    }
    /** 
     * AddVirtualNetwork is used to add a new virtual network to a cluster configuration. When a virtual network is added, an interface for each node is created and each will require a virtual network IP address. The number of IP addresses specified as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. Virtual network addresses are bulk provisioned by SolidFire and assigned to individual nodes automatically. Virtual network addresses do not need to be assigned to nodes manually.
     * <br/><br/>
     * <b>Note:</b> The AddVirtualNetwork method is used only to create a new virtual network. If you want to make changes to a virtual network, please use the ModifyVirtualNetwork method.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(final AddVirtualNetworkRequest request) {
        return super.sendRequest("AddVirtualNetwork", request, AddVirtualNetworkRequest.class, AddVirtualNetworkResult.class);
    }

    /** 
     * AddVirtualNetwork is used to add a new virtual network to a cluster configuration. When a virtual network is added, an interface for each node is created and each will require a virtual network IP address. The number of IP addresses specified as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. Virtual network addresses are bulk provisioned by SolidFire and assigned to individual nodes automatically. Virtual network addresses do not need to be assigned to nodes manually.
     * <br/><br/>
     * <b>Note:</b> The AddVirtualNetwork method is used only to create a new virtual network. If you want to make changes to a virtual network, please use the ModifyVirtualNetwork method.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(
        Long virtualNetworkTag,
        String name,
        AddressBlock[] addressBlocks,
        String netmask,
        String svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.addVirtualNetwork(new AddVirtualNetworkRequest(virtualNetworkTag, name, addressBlocks, netmask, svip, gateway, namespace, attributes));
    }
    /** 
     * ListVirtualNetworks is used to get a list of all the configured virtual networks for the cluster. This method can be used to verify the virtual network settings in the cluster.
     * 
     * This method does not require any parameters to be passed. But, one or more VirtualNetworkIDs or VirtualNetworkTags can be passed in order to filter the results.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListVirtualNetworksResult listVirtualNetworks(final ListVirtualNetworksRequest request) {
        return super.sendRequest("ListVirtualNetworks", request, ListVirtualNetworksRequest.class, ListVirtualNetworksResult.class);
    }

    /** 
     * ListVirtualNetworks is used to get a list of all the configured virtual networks for the cluster. This method can be used to verify the virtual network settings in the cluster.
     * 
     * This method does not require any parameters to be passed. But, one or more VirtualNetworkIDs or VirtualNetworkTags can be passed in order to filter the results.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ListVirtualNetworksResult listVirtualNetworks(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<Long[]> virtualNetworkIDs,
        Optional<Long[]> virtualNetworkTags
        ) {
        return this.listVirtualNetworks(new ListVirtualNetworksRequest(virtualNetworkID, virtualNetworkTag, virtualNetworkIDs, virtualNetworkTags));
    }
    /** 
     * ModifyVirtualNetwork is used to change various attributes of a VirtualNetwork object. This method can be used to add or remove address blocks, change the netmask IP, or modify the name or description of the virtual network.
     * <br/><br/>
     * <b>Note:</b> This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(final ModifyVirtualNetworkRequest request) {
        return super.sendRequest("ModifyVirtualNetwork", request, ModifyVirtualNetworkRequest.class, AddVirtualNetworkResult.class);
    }

    /** 
     * ModifyVirtualNetwork is used to change various attributes of a VirtualNetwork object. This method can be used to add or remove address blocks, change the netmask IP, or modify the name or description of the virtual network.
     * <br/><br/>
     * <b>Note:</b> This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlock[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyVirtualNetwork(new ModifyVirtualNetworkRequest(virtualNetworkID, virtualNetworkTag, name, addressBlocks, netmask, svip, gateway, namespace, attributes));
    }
    /** 
     * RemoveVirtualNetwork is used to remove a previously added virtual network.
     * <br/><br/>
     * <b>Note:</b> This method requires either the VirtualNetworkID of the VirtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request) {
        return super.sendRequest("RemoveVirtualNetwork", request, RemoveVirtualNetworkRequest.class, RemoveVirtualNetworkResult.class);
    }

    /** 
     * RemoveVirtualNetwork is used to remove a previously added virtual network.
     * <br/><br/>
     * <b>Note:</b> This method requires either the VirtualNetworkID of the VirtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag
        ) {
        return this.removeVirtualNetwork(new RemoveVirtualNetworkRequest(virtualNetworkID, virtualNetworkTag));
    }
    /** 
     * Enables retrieval of the number of virtual volumes currently in the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetVirtualVolumeCountResult getVirtualVolumeCount() {
        return super.sendRequest("GetVirtualVolumeCount", null, null, GetVirtualVolumeCountResult.class);
    }
    /** 
     * GetVirtualVolumeTaskUpdate checks the status of a VVol Async Task.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeTaskResult getVirtualVolumeTaskUpdate(final GetVirtualVolumeTaskUpdateRequest request) {
        return super.sendRequest("GetVirtualVolumeTaskUpdate", request, GetVirtualVolumeTaskUpdateRequest.class, VirtualVolumeTaskResult.class);
    }

    /** 
     * GetVirtualVolumeTaskUpdate checks the status of a VVol Async Task.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeTaskResult getVirtualVolumeTaskUpdate(
        java.util.UUID virtualVolumeTaskID,
        Optional<java.util.UUID> callingVirtualVolumeHostID
        ) {
        return this.getVirtualVolumeTaskUpdate(new GetVirtualVolumeTaskUpdateRequest(virtualVolumeTaskID, callingVirtualVolumeHostID));
    }
    /** 
     * GetVirtualVolumeAllocatedBitmap scans a VVol segment and returns the number of 
     * chunks not shared between two volumes. This call will return results in less 
     * than 30 seconds. If the specified VVol and the base VVil are not related, an 
     * error is thrown. If the offset/length combination is invalid or out fo range 
     * an error is thrown.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeUnsharedChunkResult getVirtualVolumeUnsharedChunks(final GetVirtualVolumeUnsharedChunksRequest request) {
        return super.sendRequest("GetVirtualVolumeUnsharedChunks", request, GetVirtualVolumeUnsharedChunksRequest.class, VirtualVolumeUnsharedChunkResult.class);
    }

    /** 
     * GetVirtualVolumeAllocatedBitmap scans a VVol segment and returns the number of 
     * chunks not shared between two volumes. This call will return results in less 
     * than 30 seconds. If the specified VVol and the base VVil are not related, an 
     * error is thrown. If the offset/length combination is invalid or out fo range 
     * an error is thrown.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeUnsharedChunkResult getVirtualVolumeUnsharedChunks(
        java.util.UUID virtualVolumeID,
        java.util.UUID baseVirtualVolumeID,
        Long segmentStart,
        Long segmentLength,
        Long chunkSize,
        Optional<java.util.UUID> callingVirtualVolumeHostID
        ) {
        return this.getVirtualVolumeUnsharedChunks(new GetVirtualVolumeUnsharedChunksRequest(virtualVolumeID, baseVirtualVolumeID, segmentStart, segmentLength, chunkSize, callingVirtualVolumeHostID));
    }
    /** 
     * ListVirtualVolumeBindings returns a list of VVol bindings.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(final ListVirtualVolumeBindingsRequest request) {
        return super.sendRequest("ListVirtualVolumeBindings", request, ListVirtualVolumeBindingsRequest.class, ListVirtualVolumeBindingsResult.class);
    }

    /** 
     * ListVirtualVolumeBindings returns a list of VVol bindings.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(
        Optional<Long[]> virtualVolumeBindingIDs
        ) {
        return this.listVirtualVolumeBindings(new ListVirtualVolumeBindingsRequest(virtualVolumeBindingIDs));
    }
    /** 
     * ListVirtualVolumeHosts returns a list of known ESX hosts.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(final ListVirtualVolumeHostsRequest request) {
        return super.sendRequest("ListVirtualVolumeHosts", request, ListVirtualVolumeHostsRequest.class, ListVirtualVolumeHostsResult.class);
    }

    /** 
     * ListVirtualVolumeHosts returns a list of known ESX hosts.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(
        Optional<java.util.UUID[]> virtualVolumeHostIDs
        ) {
        return this.listVirtualVolumeHosts(new ListVirtualVolumeHostsRequest(virtualVolumeHostIDs));
    }
    /** 
     * ListVirtualVolumeTasks returns a list of VVol Async Tasks.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(final ListVirtualVolumeTasksRequest request) {
        return super.sendRequest("ListVirtualVolumeTasks", request, ListVirtualVolumeTasksRequest.class, ListVirtualVolumeTasksResult.class);
    }

    /** 
     * ListVirtualVolumeTasks returns a list of VVol Async Tasks.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(
        Optional<java.util.UUID[]> virtualVolumeTaskIDs
        ) {
        return this.listVirtualVolumeTasks(new ListVirtualVolumeTasksRequest(virtualVolumeTaskIDs));
    }
    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes, or only list a subset.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(final ListVirtualVolumesRequest request) {
        return super.sendRequest("ListVirtualVolumes", request, ListVirtualVolumesRequest.class, ListVirtualVolumesResult.class);
    }

    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes, or only list a subset.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(
        Optional<Boolean> details,
        Optional<Long> limit,
        Optional<Boolean> recursive,
        Optional<java.util.UUID> startVirtualVolumeID,
        Optional<java.util.UUID[]> virtualVolumeIDs
        ) {
        return this.listVirtualVolumes(new ListVirtualVolumesRequest(details, limit, recursive, startVirtualVolumeID, virtualVolumeIDs));
    }
    /** 
     * PrepareVirtualSnapshot is used to set up VMware Virtual Volume snapshot.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public PrepareVirtualSnapshotResult prepareVirtualSnapshot(final PrepareVirtualSnapshotRequest request) {
        return super.sendRequest("PrepareVirtualSnapshot", request, PrepareVirtualSnapshotRequest.class, PrepareVirtualSnapshotResult.class);
    }

    /** 
     * PrepareVirtualSnapshot is used to set up VMware Virtual Volume snapshot.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public PrepareVirtualSnapshotResult prepareVirtualSnapshot(
        java.util.UUID virtualVolumeID,
        Optional<String> name,
        Optional<Boolean> writableSnapshot,
        Optional<java.util.UUID> callingVirtualVolumeHostID
        ) {
        return this.prepareVirtualSnapshot(new PrepareVirtualSnapshotRequest(virtualVolumeID, name, writableSnapshot, callingVirtualVolumeHostID));
    }
    /** 
     * CreateVirtualVolumeHost creates a new ESX host.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeNullResult createVirtualVolumeHost(final CreateVirtualVolumeHostRequest request) {
        return super.sendRequest("CreateVirtualVolumeHost", request, CreateVirtualVolumeHostRequest.class, VirtualVolumeNullResult.class);
    }

    /** 
     * CreateVirtualVolumeHost creates a new ESX host.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public VirtualVolumeNullResult createVirtualVolumeHost(
        java.util.UUID virtualVolumeHostID,
        java.util.UUID clusterID,
        Optional<String[]> initiatorNames,
        Optional<java.util.UUID[]> visibleProtocolEndpointIDs,
        Optional<String> hostAddress,
        Optional<java.util.UUID> callingVirtualVolumeHostID
        ) {
        return this.createVirtualVolumeHost(new CreateVirtualVolumeHostRequest(virtualVolumeHostID, clusterID, initiatorNames, visibleProtocolEndpointIDs, hostAddress, callingVirtualVolumeHostID));
    }
    /** 
     * EnableFeature allows you to enable cluster features that are disabled by default.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(final EnableFeatureRequest request) {
        return super.sendRequest("EnableFeature", request, EnableFeatureRequest.class, EnableFeatureResult.class);
    }

    /** 
     * EnableFeature allows you to enable cluster features that are disabled by default.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(
        String feature
        ) {
        return this.enableFeature(new EnableFeatureRequest(feature));
    }
    /** 
     * GetFeatureStatus allows you to retrieve the status of a cluster feature.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(final GetFeatureStatusRequest request) {
        return super.sendRequest("GetFeatureStatus", request, GetFeatureStatusRequest.class, GetFeatureStatusResult.class);
    }

    /** 
     * GetFeatureStatus allows you to retrieve the status of a cluster feature.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(
        Optional<String> feature
        ) {
        return this.getFeatureStatus(new GetFeatureStatusRequest(feature));
    }
    /** 
     * CreateVolume is used to create a new (empty) volume on the cluster.
     * When the volume is created successfully it is available for connection via iSCSI.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(final CreateVolumeRequest request) {
        return super.sendRequest("CreateVolume", request, CreateVolumeRequest.class, CreateVolumeResult.class);
    }

    /** 
     * CreateVolume is used to create a new (empty) volume on the cluster.
     * When the volume is created successfully it is available for connection via iSCSI.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(
        String name,
        Long accountID,
        Long totalSize,
        Boolean enable512e,
        Optional<QoS> qos,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createVolume(new CreateVolumeRequest(name, accountID, totalSize, enable512e, qos, attributes));
    }
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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request) {
        return super.sendRequest("DeleteVolume", request, DeleteVolumeRequest.class, DeleteVolumeResult.class);
    }

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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(
        Long volumeID
        ) {
        return this.deleteVolume(new DeleteVolumeRequest(volumeID));
    }
    /** 
     * DeleteVolumes marks multiple (up to 500) active volumes for deletion. Once marked, the volumes are purged (permanently deleted) after the cleanup interval elapses.The cleanup interval can be set in the SetClusterSettings method. For more information on using this method, see SetClusterSettings on page 1. After making a request to delete volumes, any active iSCSI connections to the volumes are immediately terminated and no further connections are allowed while the volumes are in this state. A marked volume is not returned in target discovery requests. Any snapshots of a volume that has been marked for deletion are not affected. Snapshots are kept until the volume is purged from the system. If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress, the bulk volume read or write operation is stopped. If the volumes you delete are paired with a volume, replication between the paired volumes is suspended and no data is transferred to them or from them while in a deleted state. The remote volumes the deleted volumes were paired with enter into a PausedMisconfigured state and data is no longer sent to them or from the deleted volumes. Until the deleted volumes are purged, they can be restored and data transfers resume. If the deleted volumes are purged from the system, the volumes they were paired with enter into a StoppedMisconfigured state and the volume pairing status is removed. The purged volumes become permanently unavailable.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(final DeleteVolumesRequest request) {
        return super.sendRequest("DeleteVolumes", request, DeleteVolumesRequest.class, DeleteVolumesResult.class);
    }

    /** 
     * DeleteVolumes marks multiple (up to 500) active volumes for deletion. Once marked, the volumes are purged (permanently deleted) after the cleanup interval elapses.The cleanup interval can be set in the SetClusterSettings method. For more information on using this method, see SetClusterSettings on page 1. After making a request to delete volumes, any active iSCSI connections to the volumes are immediately terminated and no further connections are allowed while the volumes are in this state. A marked volume is not returned in target discovery requests. Any snapshots of a volume that has been marked for deletion are not affected. Snapshots are kept until the volume is purged from the system. If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress, the bulk volume read or write operation is stopped. If the volumes you delete are paired with a volume, replication between the paired volumes is suspended and no data is transferred to them or from them while in a deleted state. The remote volumes the deleted volumes were paired with enter into a PausedMisconfigured state and data is no longer sent to them or from the deleted volumes. Until the deleted volumes are purged, they can be restored and data transfers resume. If the deleted volumes are purged from the system, the volumes they were paired with enter into a StoppedMisconfigured state and the volume pairing status is removed. The purged volumes become permanently unavailable.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs,
        Optional<Long[]> volumeIDs
        ) {
        return this.deleteVolumes(new DeleteVolumesRequest(accountIDs, volumeAccessGroupIDs, volumeIDs));
    }
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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAsyncResultResult getAsyncResult(final GetAsyncResultRequest request) {
        return super.sendRequest("GetAsyncResult", request, GetAsyncResultRequest.class, GetAsyncResultResult.class);
    }

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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetAsyncResultResult getAsyncResult(
        Long asyncHandle
        ) {
        return this.getAsyncResult(new GetAsyncResultRequest(asyncHandle));
    }
    /** 
     * GetDefaultQoS is used to retrieve the default QoS values that are set for a volume if QoS is not supplied.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public VolumeQOS getDefaultQoS() {
        return super.sendRequest("GetDefaultQoS", null, null, VolumeQOS.class);
    }
    /** 
     * GetVolumeCount enables you to retrieve the number of volumes currently in the system.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetVolumeCountResult getVolumeCount() {
        return super.sendRequest("GetVolumeCount", null, null, GetVolumeCountResult.class);
    }
    /** 
     * GetVolumeEfficiency is used to retrieve information about a volume.
     * Only the volume given as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request) {
        return super.sendRequest("GetVolumeEfficiency", request, GetVolumeEfficiencyRequest.class, GetVolumeEfficiencyResult.class);
    }

    /** 
     * GetVolumeEfficiency is used to retrieve information about a volume.
     * Only the volume given as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(
        Long volumeID
        ) {
        return this.getVolumeEfficiency(new GetVolumeEfficiencyRequest(volumeID));
    }
    /** 
     * GetVolumeStats is used to retrieve high-level activity measurements for a single volume.
     * Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request) {
        return super.sendRequest("GetVolumeStats", request, GetVolumeStatsRequest.class, GetVolumeStatsResult.class);
    }

    /** 
     * GetVolumeStats is used to retrieve high-level activity measurements for a single volume.
     * Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(
        Long volumeID
        ) {
        return this.getVolumeStats(new GetVolumeStatsRequest(volumeID));
    }
    /** 
     * ListActiveVolumes is used to return the list of active volumes currently in the system.
     * The list of volumes is returned sorted in VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request) {
        return super.sendRequest("ListActiveVolumes", request, ListActiveVolumesRequest.class, ListActiveVolumesResult.class);
    }

    /** 
     * ListActiveVolumes is used to return the list of active volumes currently in the system.
     * The list of volumes is returned sorted in VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit
        ) {
        return this.listActiveVolumes(new ListActiveVolumesRequest(startVolumeID, limit));
    }
    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system. Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(final ListAsyncResultsRequest request) {
        return super.sendRequest("ListAsyncResults", request, ListAsyncResultsRequest.class, ListAsyncResultsResult.class);
    }

    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system. Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(
        Optional<String[]> asyncResultTypes
        ) {
        return this.listAsyncResults(new ListAsyncResultsRequest(asyncResultTypes));
    }
    /** 
     * ListBulkVolumeJobs is used to return information about each bulk volume read or write operation that is occurring in the system.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public ListBulkVolumeJobsResult listBulkVolumeJobs() {
        return super.sendRequest("ListBulkVolumeJobs", null, null, ListBulkVolumeJobsResult.class);
    }
    /** 
     * ListDeletedVolumes is used to return the entire list of volumes that have been marked for deletion and is purged from the system.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes() {
        return super.sendRequest("ListDeletedVolumes", null, null, ListDeletedVolumesResult.class);
    }
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account.
     * Values are summed from all the volumes owned by the account.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount() {
        return super.sendRequest("ListVolumeStatsByAccount", null, null, ListVolumeStatsByAccountResult.class);
    }
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume.
     * Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume() {
        return super.sendRequest("ListVolumeStatsByVolume", null, null, ListVolumeStatsByVolumeResult.class);
    }
    /** 
     * ListVolumeStatsByVolumeAccessGroup is used to get total activity measurements for all of the volumes that are a member of the specified volume access group(s).
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request) {
        return super.sendRequest("ListVolumeStatsByVolumeAccessGroup", request, ListVolumeStatsByVolumeAccessGroupRequest.class, ListVolumeStatsByVolumeAccessGroupResult.class);
    }

    /** 
     * ListVolumeStatsByVolumeAccessGroup is used to get total activity measurements for all of the volumes that are a member of the specified volume access group(s).
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(
        Optional<Long[]> volumeAccessGroups
        ) {
        return this.listVolumeStatsByVolumeAccessGroup(new ListVolumeStatsByVolumeAccessGroupRequest(volumeAccessGroups));
    }
    /** 
     * The ListVolumes method is used to return a list of volumes that are in a cluster.
     * You can specify the volumes you want to return in the list by using the available parameters.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(final ListVolumesRequest request) {
        return super.sendRequest("ListVolumes", request, ListVolumesRequest.class, ListVolumesResult.class);
    }

    /** 
     * The ListVolumes method is used to return a list of volumes that are in a cluster.
     * You can specify the volumes you want to return in the list by using the available parameters.
     **/
    @Override
    @Since("8")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<Long[]> accounts,
        Optional<Boolean> isPaired,
        Optional<Long[]> volumeIDs
        ) {
        return this.listVolumes(new ListVolumesRequest(startVolumeID, limit, volumeStatus, accounts, isPaired, volumeIDs));
    }
    /** 
     * ListVolumesForAccount returns the list of active AND (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request) {
        return super.sendRequest("ListVolumesForAccount", request, ListVolumesForAccountRequest.class, ListVolumesForAccountResult.class);
    }

    /** 
     * ListVolumesForAccount returns the list of active AND (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(
        Long accountID,
        Optional<Long> startVolumeID,
        Optional<Long> limit
        ) {
        return this.listVolumesForAccount(new ListVolumesForAccountRequest(accountID, startVolumeID, limit));
    }
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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request) {
        return super.sendRequest("ModifyVolume", request, ModifyVolumeRequest.class, ModifyVolumeResult.class);
    }

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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(
        Long volumeID,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyVolume(new ModifyVolumeRequest(volumeID, accountID, access, qos, totalSize, attributes));
    }
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately. If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged. You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.When you need to increase the size of volumes that are being replicated, do so in the following order to prevent replication errors:Increase the size of the "Replication Target" volume.Increase the size of the source or "Read / Write" volume. recommends that both the target and source volumes be the same size.NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(final ModifyVolumesRequest request) {
        return super.sendRequest("ModifyVolumes", request, ModifyVolumesRequest.class, ModifyVolumesResult.class);
    }

    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately. If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged. You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.When you need to increase the size of volumes that are being replicated, do so in the following order to prevent replication errors:Increase the size of the "Replication Target" volume.Increase the size of the source or "Read / Write" volume. recommends that both the target and source volumes be the same size.NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(
        Long[] volumeIDs,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyVolumes(new ModifyVolumesRequest(volumeIDs, accountID, access, qos, totalSize, attributes));
    }
    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume which has been deleted.
     * A volume must be deleted using DeleteVolume before it can be purged.
     * Volumes are purged automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request) {
        return super.sendRequest("PurgeDeletedVolume", request, PurgeDeletedVolumeRequest.class, PurgeDeletedVolumeResult.class);
    }

    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume which has been deleted.
     * A volume must be deleted using DeleteVolume before it can be purged.
     * Volumes are purged automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(
        Long volumeID
        ) {
        return this.purgeDeletedVolume(new PurgeDeletedVolumeRequest(volumeID));
    }
    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted; you can use this method to purge up to 500 volumes at one time. You must delete volumes using DeleteVolumes before they can be purged. Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(final PurgeDeletedVolumesRequest request) {
        return super.sendRequest("PurgeDeletedVolumes", request, PurgeDeletedVolumesRequest.class, PurgeDeletedVolumesResult.class);
    }

    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted; you can use this method to purge up to 500 volumes at one time. You must delete volumes using DeleteVolumes before they can be purged. Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(
        Optional<Long[]> volumeIDs,
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs
        ) {
        return this.purgeDeletedVolumes(new PurgeDeletedVolumesRequest(volumeIDs, accountIDs, volumeAccessGroupIDs));
    }
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again.
     * This action makes the volume immediately available for iSCSI connection.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request) {
        return super.sendRequest("RestoreDeletedVolume", request, RestoreDeletedVolumeRequest.class, RestoreDeletedVolumeResult.class);
    }

    /** 
     * RestoreDeletedVolume marks a deleted volume as active again.
     * This action makes the volume immediately available for iSCSI connection.
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(
        Long volumeID
        ) {
        return this.restoreDeletedVolume(new RestoreDeletedVolumeRequest(volumeID));
    }
    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or IOPS) for all volumes not yet created.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(final SetDefaultQoSRequest request) {
        return super.sendRequest("SetDefaultQoS", request, SetDefaultQoSRequest.class, SetDefaultQoSResult.class);
    }

    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or IOPS) for all volumes not yet created.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(
        Optional<Long> minIOPS,
        Optional<Long> maxIOPS,
        Optional<Long> burstIOPS
        ) {
        return this.setDefaultQoS(new SetDefaultQoSRequest(minIOPS, maxIOPS, burstIOPS));
    }
    /** 
     * StartBulkVolumeRead allows you to initialize a bulk volume read session on a specified volume.
     * Only two bulk volume processes can run simultaneously on a volume.
     * When you initialize the session, data is read from a SolidFire storage volume for the purposes of storing the data on an external backup source.
     * The external data is accessed by a web server running on a SolidFire node.
     * Communications and server interaction information for external data access is passed by a script running on the SolidFire storage system.<br/>
     * <br/>
     * At the start of a bulk volume read operation, a snapshot of the volume is made and the snapshot is deleted when the read has completed.
     * You can also read a snapshot of the volume by entering the ID of the snapshot as a parameter.
     * Reading a previous snapshot does not create a new snapshot of the volume, nor does the previous snapshot be deleted when the read completes.<br/>
     * <br/>
     * <b>Note</b>: This process creates a new snapshot if the ID of an existing snapshot is not provided.
     * Snapshots can be created if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(final StartBulkVolumeReadRequest request) {
        return super.sendRequest("StartBulkVolumeRead", request, StartBulkVolumeReadRequest.class, StartBulkVolumeReadResult.class);
    }

    /** 
     * StartBulkVolumeRead allows you to initialize a bulk volume read session on a specified volume.
     * Only two bulk volume processes can run simultaneously on a volume.
     * When you initialize the session, data is read from a SolidFire storage volume for the purposes of storing the data on an external backup source.
     * The external data is accessed by a web server running on a SolidFire node.
     * Communications and server interaction information for external data access is passed by a script running on the SolidFire storage system.<br/>
     * <br/>
     * At the start of a bulk volume read operation, a snapshot of the volume is made and the snapshot is deleted when the read has completed.
     * You can also read a snapshot of the volume by entering the ID of the snapshot as a parameter.
     * Reading a previous snapshot does not create a new snapshot of the volume, nor does the previous snapshot be deleted when the read completes.<br/>
     * <br/>
     * <b>Note</b>: This process creates a new snapshot if the ID of an existing snapshot is not provided.
     * Snapshots can be created if cluster fullness is at stage 2 or 3.
     * Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(
        Long volumeID,
        String format,
        Optional<Long> snapshotID,
        Optional<String> script,
        Optional<Object> scriptParameters,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.startBulkVolumeRead(new StartBulkVolumeReadRequest(volumeID, format, snapshotID, script, scriptParameters, attributes));
    }
    /** 
     * StartBulkVolumeWrite allows you to initialize a bulk volume write session on a specified volume.
     * Only two bulk volume processes can run simultaneously on a volume.
     * When the session is initialized, data can be written to a SolidFire storage volume from an external backup source.
     * The external data is accessed by a web server running on a SolidFire node.
     * Communications and server interaction information for external data access is passed by a script running on the SolidFire storage system.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(final StartBulkVolumeWriteRequest request) {
        return super.sendRequest("StartBulkVolumeWrite", request, StartBulkVolumeWriteRequest.class, StartBulkVolumeWriteResult.class);
    }

    /** 
     * StartBulkVolumeWrite allows you to initialize a bulk volume write session on a specified volume.
     * Only two bulk volume processes can run simultaneously on a volume.
     * When the session is initialized, data can be written to a SolidFire storage volume from an external backup source.
     * The external data is accessed by a web server running on a SolidFire node.
     * Communications and server interaction information for external data access is passed by a script running on the SolidFire storage system.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(
        Long volumeID,
        String format,
        Optional<String> script,
        Optional<Object> scriptParameters,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.startBulkVolumeWrite(new StartBulkVolumeWriteRequest(volumeID, format, script, scriptParameters, attributes));
    }
    /** 
     * You can use UpdateBulkVolumeStatus in a script to return to the SolidFire system the status of a bulk volume job that you have started with the "StartBulkVolumeRead" or "StartBulkVolumeWrite" methods.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(final UpdateBulkVolumeStatusRequest request) {
        return super.sendRequest("UpdateBulkVolumeStatus", request, UpdateBulkVolumeStatusRequest.class, UpdateBulkVolumeStatusResult.class);
    }

    /** 
     * You can use UpdateBulkVolumeStatus in a script to return to the SolidFire system the status of a bulk volume job that you have started with the "StartBulkVolumeRead" or "StartBulkVolumeWrite" methods.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(
        String key,
        String status,
        Optional<String> percentComplete,
        Optional<String> message,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.updateBulkVolumeStatus(new UpdateBulkVolumeStatusRequest(key, status, percentComplete, message, attributes));
    }
    /** 
     * Cancels a currently running clone operation. This method does not return anything.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(final CancelCloneRequest request) {
        return super.sendRequest("CancelClone", request, CancelCloneRequest.class, CancelCloneResult.class);
    }

    /** 
     * Cancels a currently running clone operation. This method does not return anything.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(
        Long cloneID
        ) {
        return this.cancelClone(new CancelCloneRequest(cloneID));
    }
    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process for a group of clones. When you cancel a group clone operation, the system completes and removes the operation's associated asyncHandle. This method does not return anything.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(final CancelGroupCloneRequest request) {
        return super.sendRequest("CancelGroupClone", request, CancelGroupCloneRequest.class, CancelGroupCloneResult.class);
    }

    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process for a group of clones. When you cancel a group clone operation, the system completes and removes the operation's associated asyncHandle. This method does not return anything.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(
        Long groupCloneID
        ) {
        return this.cancelGroupClone(new CancelGroupCloneRequest(groupCloneID));
    }
    /** 
     * CloneMultipleVolumes is used to create a clone of a group of specified volumes. A consistent set of characteristics can be assigned to a group of multiple volume when they are cloned together.
     * If groupSnapshotID is going to be used to clone the volumes in a group snapshot, the group snapshot must be created first using the CreateGroupSnapshot API method or the SolidFire Element WebUI. Using groupSnapshotID is optional when cloning multiple volumes.
     * <br/><br/>
     * <b>Note</b>: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CloneMultipleVolumesResult cloneMultipleVolumes(final CloneMultipleVolumesRequest request) {
        return super.sendRequest("CloneMultipleVolumes", request, CloneMultipleVolumesRequest.class, CloneMultipleVolumesResult.class);
    }

    /** 
     * CloneMultipleVolumes is used to create a clone of a group of specified volumes. A consistent set of characteristics can be assigned to a group of multiple volume when they are cloned together.
     * If groupSnapshotID is going to be used to clone the volumes in a group snapshot, the group snapshot must be created first using the CreateGroupSnapshot API method or the SolidFire Element WebUI. Using groupSnapshotID is optional when cloning multiple volumes.
     * <br/><br/>
     * <b>Note</b>: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public CloneMultipleVolumesResult cloneMultipleVolumes(
        CloneMultipleVolumeParams[] volumes,
        Optional<String> access,
        Optional<Long> groupSnapshotID,
        Optional<Long> newAccountID
        ) {
        return this.cloneMultipleVolumes(new CloneMultipleVolumesRequest(volumes, access, groupSnapshotID, newAccountID));
    }
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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request) {
        return super.sendRequest("CloneVolume", request, CloneVolumeRequest.class, CloneVolumeResult.class);
    }

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
     **/
    @Override
    @Since("1")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(
        Long volumeID,
        String name,
        Optional<Long> newAccountID,
        Optional<Long> newSize,
        Optional<String> access,
        Optional<Long> snapshotID,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.cloneVolume(new CloneVolumeRequest(volumeID, name, newAccountID, newSize, access, snapshotID, attributes));
    }
    /** 
     * Copies one volume to another.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(final CopyVolumeRequest request) {
        return super.sendRequest("CopyVolume", request, CopyVolumeRequest.class, CopyVolumeResult.class);
    }

    /** 
     * Copies one volume to another.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(
        Long volumeID,
        Long dstVolumeID,
        Optional<Long> snapshotID
        ) {
        return this.copyVolume(new CopyVolumeRequest(volumeID, dstVolumeID, snapshotID));
    }
    /** 
     * Add initiators to a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request) {
        return super.sendRequest("AddInitiatorsToVolumeAccessGroup", request, AddInitiatorsToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    /** 
     * Add initiators to a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(
        Long volumeAccessGroupID,
        String[] initiators
        ) {
        return this.addInitiatorsToVolumeAccessGroup(new AddInitiatorsToVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
    }
    /** 
     * Add volumes to a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request) {
        return super.sendRequest("AddVolumesToVolumeAccessGroup", request, AddVolumesToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    /** 
     * Add volumes to a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(
        Long volumeAccessGroupID,
        Long[] volumes
        ) {
        return this.addVolumesToVolumeAccessGroup(new AddVolumesToVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }
    /** 
     * Creates a new volume access group.
     * The new volume access group must be given a name when it is created.
     * Entering initiators and volumes are optional when creating a volume access group.
     * Once the group is created volumes and initiator IQNs can be added.
     * Any initiator IQN that is successfully added to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request) {
        return super.sendRequest("CreateVolumeAccessGroup", request, CreateVolumeAccessGroupRequest.class, CreateVolumeAccessGroupResult.class);
    }

    /** 
     * Creates a new volume access group.
     * The new volume access group must be given a name when it is created.
     * Entering initiators and volumes are optional when creating a volume access group.
     * Once the group is created volumes and initiator IQNs can be added.
     * Any initiator IQN that is successfully added to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(
        String name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.createVolumeAccessGroup(new CreateVolumeAccessGroupRequest(name, initiators, volumes, virtualNetworkID, virtualNetworkTags, attributes));
    }
    /** 
     * Delete a volume access group from the system.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request) {
        return super.sendRequest("DeleteVolumeAccessGroup", request, DeleteVolumeAccessGroupRequest.class, DeleteVolumeAccessGroupResult.class);
    }

    /** 
     * Delete a volume access group from the system.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(
        Long volumeAccessGroupID
        ) {
        return this.deleteVolumeAccessGroup(new DeleteVolumeAccessGroupRequest(volumeAccessGroupID));
    }
    /** 
     * GetVolumeAccessGroupEfficiency is used to retrieve efficiency information about a volume access group. Only the volume access group provided as parameters in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(final GetVolumeAccessGroupEfficiencyRequest request) {
        return super.sendRequest("GetVolumeAccessGroupEfficiency", request, GetVolumeAccessGroupEfficiencyRequest.class, GetEfficiencyResult.class);
    }

    /** 
     * GetVolumeAccessGroupEfficiency is used to retrieve efficiency information about a volume access group. Only the volume access group provided as parameters in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(
        Long volumeAccessGroupID
        ) {
        return this.getVolumeAccessGroupEfficiency(new GetVolumeAccessGroupEfficiencyRequest(volumeAccessGroupID));
    }
    /** 
     * The GetVolumeAccessGroupLunAssignments is used to return information LUN mappings of a specified volume access group.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(final GetVolumeAccessGroupLunAssignmentsRequest request) {
        return super.sendRequest("GetVolumeAccessGroupLunAssignments", request, GetVolumeAccessGroupLunAssignmentsRequest.class, GetVolumeAccessGroupLunAssignmentsResult.class);
    }

    /** 
     * The GetVolumeAccessGroupLunAssignments is used to return information LUN mappings of a specified volume access group.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID
        ) {
        return this.getVolumeAccessGroupLunAssignments(new GetVolumeAccessGroupLunAssignmentsRequest(volumeAccessGroupID));
    }
    /** 
     * ListVolumeAccessGroups is used to return information about the volume access groups that are currently in the system.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request) {
        return super.sendRequest("ListVolumeAccessGroups", request, ListVolumeAccessGroupsRequest.class, ListVolumeAccessGroupsResult.class);
    }

    /** 
     * ListVolumeAccessGroups is used to return information about the volume access groups that are currently in the system.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(
        Optional<Long> startVolumeAccessGroupID,
        Optional<Long> limit
        ) {
        return this.listVolumeAccessGroups(new ListVolumeAccessGroupsRequest(startVolumeAccessGroupID, limit));
    }
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
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request) {
        return super.sendRequest("ModifyVolumeAccessGroup", request, ModifyVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

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
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<java.util.Map<String, Object>> attributes
        ) {
        return this.modifyVolumeAccessGroup(new ModifyVolumeAccessGroupRequest(volumeAccessGroupID, virtualNetworkID, virtualNetworkTags, name, initiators, volumes, attributes));
    }
    /** 
     * The ModifytVolumeAccessGroupLunAssignments is used to define custom LUN assignments for specific volumes. Only LUN values set on the lunAssignments parameter will be changed in the volume access group. All other LUN assignments will remain unchanged.
     * <br/><br/>
     * LUN assignment values must be unique for volumes in a volume access group. An exception will be seen if LUN assignments are duplicated in a volume access group. However, the same LUN values can be used again in different volume access groups.
     * <br/><br/>
     * <b>Note:</b> Correct LUN values are 0 - 16383. An exception will be seen if an incorrect LUN value is passed. None of the specified LUN assignments will be modified if there is an exception.
     * <br/><br/>
     * <b>Caution:</b> If a LUN assignment is changed for a volume with active I/O, the I/O could be disrupted. Changes to the server configuration may be required in order to change volume LUN assignments.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(final ModifyVolumeAccessGroupLunAssignmentsRequest request) {
        return super.sendRequest("ModifyVolumeAccessGroupLunAssignments", request, ModifyVolumeAccessGroupLunAssignmentsRequest.class, ModifyVolumeAccessGroupLunAssignmentsResult.class);
    }

    /** 
     * The ModifytVolumeAccessGroupLunAssignments is used to define custom LUN assignments for specific volumes. Only LUN values set on the lunAssignments parameter will be changed in the volume access group. All other LUN assignments will remain unchanged.
     * <br/><br/>
     * LUN assignment values must be unique for volumes in a volume access group. An exception will be seen if LUN assignments are duplicated in a volume access group. However, the same LUN values can be used again in different volume access groups.
     * <br/><br/>
     * <b>Note:</b> Correct LUN values are 0 - 16383. An exception will be seen if an incorrect LUN value is passed. None of the specified LUN assignments will be modified if there is an exception.
     * <br/><br/>
     * <b>Caution:</b> If a LUN assignment is changed for a volume with active I/O, the I/O could be disrupted. Changes to the server configuration may be required in order to change volume LUN assignments.
     **/
    @Override
    @Since("7")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID,
        LunAssignment[] lunAssignments
        ) {
        return this.modifyVolumeAccessGroupLunAssignments(new ModifyVolumeAccessGroupLunAssignmentsRequest(volumeAccessGroupID, lunAssignments));
    }
    /** 
     * Remove initiators from a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request) {
        return super.sendRequest("RemoveInitiatorsFromVolumeAccessGroup", request, RemoveInitiatorsFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    /** 
     * Remove initiators from a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(
        Long volumeAccessGroupID,
        String[] initiators
        ) {
        return this.removeInitiatorsFromVolumeAccessGroup(new RemoveInitiatorsFromVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
    }
    /** 
     * Remove volumes from a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request) {
        return super.sendRequest("RemoveVolumesFromVolumeAccessGroup", request, RemoveVolumesFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    /** 
     * Remove volumes from a volume access group.
     **/
    @Override
    @Since("5")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(
        Long volumeAccessGroupID,
        Long[] volumes
        ) {
        return this.removeVolumesFromVolumeAccessGroup(new RemoveVolumesFromVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }
    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(final GetIpmiConfigRequest request) {
        return super.sendRequest("GetIpmiConfig", request, GetIpmiConfigRequest.class, GetIpmiConfigResult.class);
    }

    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(
        Optional<String> chassisType,
        Boolean force
        ) {
        return this.getIpmiConfig(new GetIpmiConfigRequest(chassisType, force));
    }
    /** 
     * GetIpmiInfo allows you to display a detailed reporting of sensors (objects) for node fans, intake and exhaust temperatures, and power supplies  that are monitored by . 
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetIpmiInfoResult getIpmiInfo(final GetIpmiInfoRequest request) {
        return super.sendRequest("GetIpmiInfo", request, GetIpmiInfoRequest.class, GetIpmiInfoResult.class);
    }

    /** 
     * GetIpmiInfo allows you to display a detailed reporting of sensors (objects) for node fans, intake and exhaust temperatures, and power supplies  that are monitored by . 
     **/
    @Override
    @Since("9")
    @ConnectionType("Cluster")
    public GetIpmiInfoResult getIpmiInfo(
        Boolean force
        ) {
        return this.getIpmiInfo(new GetIpmiInfoRequest(force));
    }
}