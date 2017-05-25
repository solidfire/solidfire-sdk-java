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
import com.solidfire.core.client.Attributes;
import com.solidfire.core.javautil.Optional;
import com.solidfire.core.client.ApiException;

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
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(final AddAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, addAccount is not available until version 1.0.");
        }
        return super.sendRequest("AddAccount", request, AddAccountRequest.class, AddAccountResult.class);
    }

    
    /** 
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes
        ) {
        return this.addAccount(new AddAccountRequest(username, initiatorSecret, targetSecret, attributes));
    }
    
    /** 
     * GetAccountByID enables you to return details about a specific account, given its accountID.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getAccountByID is not available until version 1.0.");
        }
        return super.sendRequest("GetAccountByID", request, GetAccountByIDRequest.class, GetAccountResult.class);
    }

    
    /** 
     * GetAccountByID enables you to return details about a specific account, given its accountID.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(
        Long accountID
        ) {
        return this.getAccountByID(new GetAccountByIDRequest(accountID));
    }
    
    /** 
     * GetAccountByName enables you to retrieve details about a specific account, given its username.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getAccountByName is not available until version 1.0.");
        }
        return super.sendRequest("GetAccountByName", request, GetAccountByNameRequest.class, GetAccountResult.class);
    }

    
    /** 
     * GetAccountByName enables you to retrieve details about a specific account, given its username.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(
        String username
        ) {
        return this.getAccountByName(new GetAccountByNameRequest(username));
    }
    
    /** 
     * GetAccountEfficiency enables you to retrieve efficiency statistics about a volume account. This method returns efficiency information
     * only for the account you specify as a parameter.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(final GetAccountEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, getAccountEfficiency is not available until version 6.0.");
        }
        return super.sendRequest("GetAccountEfficiency", request, GetAccountEfficiencyRequest.class, GetEfficiencyResult.class);
    }

    
    /** 
     * GetAccountEfficiency enables you to retrieve efficiency statistics about a volume account. This method returns efficiency information
     * only for the account you specify as a parameter.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(
        Long accountID
        ) {
        return this.getAccountEfficiency(new GetAccountEfficiencyRequest(accountID));
    }
    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(final ListAccountsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listAccounts is not available until version 1.0.");
        }
        if(request.getIncludeStorageContainers() != null && request.getIncludeStorageContainers() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeStorageContainers is not applicable to this version of the API.");
        }
        return super.sendRequest("ListAccounts", request, ListAccountsRequest.class, ListAccountsResult.class);
    }

    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(
        Optional<Long> startAccountID,
        Optional<Long> limit
        ) {
        return this.listAccounts(new ListAccountsRequest(startAccountID, limit));
    }
    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(
        Optional<Long> startAccountID,
        Optional<Long> limit,
        Optional<Boolean> includeStorageContainers
        ) {
        return this.listAccounts(new ListAccountsRequest(startAccountID, limit, includeStorageContainers));
    }
    
    /** 
     * ModifyAccount enables you to modify an existing account.
     * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
     * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
     * reconnections.
     * To clear an account's attributes, specify {} for the attributes parameter.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(final ModifyAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, modifyAccount is not available until version 1.0.");
        }
        return super.sendRequest("ModifyAccount", request, ModifyAccountRequest.class, ModifyAccountResult.class);
    }

    
    /** 
     * ModifyAccount enables you to modify an existing account.
     * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
     * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
     * reconnections.
     * To clear an account's attributes, specify {} for the attributes parameter.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(
        Long accountID,
        Optional<String> username,
        Optional<String> status,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes
        ) {
        return this.modifyAccount(new ModifyAccountRequest(accountID, username, status, initiatorSecret, targetSecret, attributes));
    }
    
    /** 
     * RemoveAccount enables you to remove an existing account. You must delete and purge all volumes associated with the account
     * using DeleteVolume before you can remove the account. If volumes on the account are still pending deletion, you cannot use
     * RemoveAccount to remove the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, removeAccount is not available until version 1.0.");
        }
        return super.sendRequest("RemoveAccount", request, RemoveAccountRequest.class, RemoveAccountResult.class);
    }

    
    /** 
     * RemoveAccount enables you to remove an existing account. You must delete and purge all volumes associated with the account
     * using DeleteVolume before you can remove the account. If volumes on the account are still pending deletion, you cannot use
     * RemoveAccount to remove the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(
        Long accountID
        ) {
        return this.removeAccount(new RemoveAccountRequest(accountID));
    }
    
    /** 
     * You can use GetAsyncResult to retrieve the result of asynchronous method calls. Some method calls require some time to run, and
     * might not be finished when the system sends the initial response. To obtain the status or result of the method call, use
     * GetAsyncResult to poll the asyncHandle value returned by the method.
     * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion, but the actual
     * data returned for the operation depends on the original method call and the return data is documented with each method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getAsyncResult(final GetAsyncResultRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getAsyncResult is not available until version 1.0.");
        }
        return super.sendRequest("GetAsyncResult", request, GetAsyncResultRequest.class, Attributes.class);
    }

    
    /** 
     * You can use GetAsyncResult to retrieve the result of asynchronous method calls. Some method calls require some time to run, and
     * might not be finished when the system sends the initial response. To obtain the status or result of the method call, use
     * GetAsyncResult to poll the asyncHandle value returned by the method.
     * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion, but the actual
     * data returned for the operation depends on the original method call and the return data is documented with each method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getAsyncResult(
        Long asyncHandle,
        Optional<Boolean> keepResult
        ) {
        return this.getAsyncResult(new GetAsyncResultRequest(asyncHandle, keepResult));
    }
    
    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system.
     * Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult
     * to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(final ListAsyncResultsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listAsyncResults is not available until version 9.0.");
        }
        return super.sendRequest("ListAsyncResults", request, ListAsyncResultsRequest.class, ListAsyncResultsResult.class);
    }

    
    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system.
     * Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult
     * to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(
        Optional<String[]> asyncResultTypes
        ) {
        return this.listAsyncResults(new ListAsyncResultsRequest(asyncResultTypes));
    }
    
    /** 
     * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(final CreateBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, createBackupTarget is not available until version 6.0.");
        }
        return super.sendRequest("CreateBackupTarget", request, CreateBackupTargetRequest.class, CreateBackupTargetResult.class);
    }

    
    /** 
     * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(
        String name,
        Optional<Attributes> attributes
        ) {
        return this.createBackupTarget(new CreateBackupTargetRequest(name, attributes));
    }
    
    /** 
     * GetBackupTarget enables you to return information about a specific backup target that you have created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(final GetBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, getBackupTarget is not available until version 6.0.");
        }
        return super.sendRequest("GetBackupTarget", request, GetBackupTargetRequest.class, GetBackupTargetResult.class);
    }

    
    /** 
     * GetBackupTarget enables you to return information about a specific backup target that you have created.
     **/
    @Override
    @Since("6.0")
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
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListBackupTargetsResult listBackupTargets() {
        return super.sendRequest("ListBackupTargets", null, null, ListBackupTargetsResult.class);
    }
    
    /** 
     * ModifyBackupTarget enables you to change attributes of a backup target.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(final ModifyBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, modifyBackupTarget is not available until version 6.0.");
        }
        return super.sendRequest("ModifyBackupTarget", request, ModifyBackupTargetRequest.class, ModifyBackupTargetResult.class);
    }

    
    /** 
     * ModifyBackupTarget enables you to change attributes of a backup target.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(
        Long backupTargetID,
        Optional<String> name,
        Optional<Attributes> attributes
        ) {
        return this.modifyBackupTarget(new ModifyBackupTargetRequest(backupTargetID, name, attributes));
    }
    
    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(final RemoveBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, removeBackupTarget is not available until version 6.0.");
        }
        return super.sendRequest("RemoveBackupTarget", request, RemoveBackupTargetRequest.class, RemoveBackupTargetResult.class);
    }

    
    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(
        Long backupTargetID
        ) {
        return this.removeBackupTarget(new RemoveBackupTargetRequest(backupTargetID));
    }
    
    /** 
     * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
     * and unresolved faults can be cleared.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, clearClusterFaults is not available until version 1.0.");
        }
        return super.sendRequest("ClearClusterFaults", request, ClearClusterFaultsRequest.class, ClearClusterFaultsResult.class);
    }

    
    /** 
     * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
     * and unresolved faults can be cleared.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(
        Optional<String> faultTypes
        ) {
        return this.clearClusterFaults(new ClearClusterFaultsRequest(faultTypes));
    }
    
    /** 
     * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
     * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
     * cluster. Then, run the CreateCluster method.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(final CreateClusterRequest request) { 
        return super.sendRequest("CreateCluster", request, CreateClusterRequest.class, CreateClusterResult.class);
    }

    
    /** 
     * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
     * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
     * cluster. Then, run the CreateCluster method.
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
        Optional<Attributes> attributes
        ) {
        return this.createCluster(new CreateClusterRequest(acceptEula, mvip, svip, repCount, username, password, nodes, attributes));
    }
    
    /** 
     * CreateSupportBundle enables you to create a support bundle file under the node's directory. After creation, the bundle is stored on the node as a tar.gz file.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(final CreateSupportBundleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, createSupportBundle is not available until version 8.0.");
        }
        return super.sendRequest("CreateSupportBundle", request, CreateSupportBundleRequest.class, CreateSupportBundleResult.class);
    }

    
    /** 
     * CreateSupportBundle enables you to create a support bundle file under the node's directory. After creation, the bundle is stored on the node as a tar.gz file.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(
        Optional<String> bundleName,
        Optional<String> extraArgs,
        Optional<Long> timeoutSec
        ) {
        return this.createSupportBundle(new CreateSupportBundleRequest(bundleName, extraArgs, timeoutSec));
    }
    

    
    /** 
     * DeleteAllSupportBundles enables you to delete all support bundles generated with the CreateSupportBundle API method.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Node")
    public DeleteAllSupportBundlesResult deleteAllSupportBundles() {
        return super.sendRequest("DeleteAllSupportBundles", null, null, DeleteAllSupportBundlesResult.class);
    }
    

    
    /** 
     * The DisableEncryptionAtRest method enables you to remove the encryption that was previously applied to the cluster using the EnableEncryptionAtRest method. This disable method is asynchronous and returns a response before encryption is disabled. You can use the GetClusterInfo method to poll the system to see when the process has completed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public DisableEncryptionAtRestResult disableEncryptionAtRest() {
        return super.sendRequest("DisableEncryptionAtRest", null, null, DisableEncryptionAtRestResult.class);
    }
    

    
    /** 
     * You can use the EnableEncryptionAtRest method to enable the Advanced Encryption Standard (AES) 256-bit encryption at rest on the cluster, so that the cluster can manage the encryption key used for the drives on each node. This feature is not enabled by default.
     * When you enable Encryption at Rest, the cluster automatically manages encryption keys internally for the drives on each node in the cluster. Nodes do not store the keys to unlock drives and the keys are never passed over the network. Two nodes participating in a cluster are required to access the key to disable encryption on a drive. The encryption management does not affect performance or efficiency on the cluster. If an encryption-enabled drive or node is removed from the cluster with the API, Encryption at Rest is disabled and the data is not secure erased. Data can be secure erased using the SecureEraseDrives API method.
     * Note: If you have a node type with a model number ending in "-NE", the EnableEncryptionAtRest method call fails with a response of "Encryption not allowed. Cluster detected non-encryptable node".
     * You should only enable or disable encryption when the cluster is running and in a healthy state. You can enable or disable encryption at your discretion and as often as you need.
     * Note: This process is asynchronous and returns a response before encryption is enabled. You can use the GetClusterInfo
     * method to poll the system to see when the process has completed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest() {
        return super.sendRequest("EnableEncryptionAtRest", null, null, EnableEncryptionAtRestResult.class);
    }
    

    
    /** 
     * You can use the GetAPI method to return a list of all the API methods and supported API endpoints that can be used in the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public GetAPIResult getAPI() {
        return super.sendRequest("GetAPI", null, null, GetAPIResult.class);
    }
    

    
    /** 
     * You can use the GetClusterCapacity method to return the high-level capacity measurements for an entire cluster. You can use the fields returned from this method to calculate the efficiency rates that are displayed in the Element OS Web UI. You can use the following calculations in scripts to return the efficiency rates for thin provisioning, deduplication, compression, and overall efficiency.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterCapacityResult getClusterCapacity() {
        return super.sendRequest("GetClusterCapacity", null, null, GetClusterCapacityResult.class);
    }
    

    
    /** 
     * The GetClusterConfig API method enables you to return information about the cluster configuration this node uses to communicate with the cluster that it is a part of.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetClusterConfigResult getClusterConfig() {
        return super.sendRequest("GetClusterConfig", null, null, GetClusterConfigResult.class);
    }
    

    
    /** 
     * You can use GetClusterFullThreshold to view the stages set for cluster fullness levels. This method returns all fullness metrics for the
     * cluster.
     * Note: When a cluster reaches the Error stage of block cluster fullness, the maximum IOPS on all volumes are reduced linearly to the volume's minimum IOPS as the cluster approaches the Critical stage. This helps prevent the cluster from
     * reaching the Critical stage of block cluster fullness.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterFullThresholdResult getClusterFullThreshold() {
        return super.sendRequest("GetClusterFullThreshold", null, null, GetClusterFullThresholdResult.class);
    }
    

    
    /** 
     * GetClusterInfo enables you to return configuration information about the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterInfoResult getClusterInfo() {
        return super.sendRequest("GetClusterInfo", null, null, GetClusterInfoResult.class);
    }
    

    
    /** 
     * GetClusterMasterNodeID enables you to retrieve the ID of the node that can perform cluster-wide administration tasks and holds the
     * storage virtual IP address (SVIP) and management virtual IP address (MVIP).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterMasterNodeIDResult getClusterMasterNodeID() {
        return super.sendRequest("GetClusterMasterNodeID", null, null, GetClusterMasterNodeIDResult.class);
    }
    
    /** 
     * The GetClusterState API method enables you to indicate if a node is part of a cluster or not. The three states are:
     * Available: Node has not been configured with a cluster name.
     * Pending: Node is pending for a specific named cluster and can be added.
     * Active: Node is an active member of a cluster and may not be added to another
     * cluster.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(final GetClusterStateRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, getClusterState is not available until version 5.0.");
        }
        return super.sendRequest("GetClusterState", request, GetClusterStateRequest.class, GetClusterStateResult.class);
    }

    
    /** 
     * The GetClusterState API method enables you to indicate if a node is part of a cluster or not. The three states are:
     * Available: Node has not been configured with a cluster name.
     * Pending: Node is pending for a specific named cluster and can be added.
     * Active: Node is an active member of a cluster and may not be added to another
     * cluster.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(
        Boolean force
        ) {
        return this.getClusterState(new GetClusterStateRequest(force));
    }
    

    
    /** 
     * GetClusterStats enables you to retrieve high-level activity measurements for the cluster. Values returned are cumulative from the
     * creation of the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterStatsResult getClusterStats() {
        return super.sendRequest("GetClusterStats", null, null, GetClusterStatsResult.class);
    }
    

    
    /** 
     * GetClusterVersionInfo enables you to retrieve information about the Element software version running on each node in the cluster.
     * This method also returns information about nodes that are currently in the process of upgrading software.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterVersionInfoResult getClusterVersionInfo() {
        return super.sendRequest("GetClusterVersionInfo", null, null, GetClusterVersionInfoResult.class);
    }
    

    
    /** 
     * NetApp engineering uses the GetCompleteStats API method to troubleshoot new features. The data returned from GetCompleteStats is not documented, changes frequently, and is not guaranteed to be accurate. NetApp does not recommend using GetCompleteStats for collecting performance data or any other
     * management integration with a SolidFire cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getCompleteStats() {
        return super.sendRequest("GetCompleteStats", null, null, Attributes.class);
    }
    

    
    /** 
     * GetLimits enables you to retrieve the limit values set by the API. These values might change between releases of Element OS, but do not change without an update to the system. Knowing the limit values set by the API can be useful when writing API scripts for user-facing tools.
     * Note: The GetLimits method returns the limits for the current software version regardless of the API endpoint version used to pass the method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetLimitsResult getLimits() {
        return super.sendRequest("GetLimits", null, null, GetLimitsResult.class);
    }
    

    
    /** 
     * GetNtpInfo enables you to return the current network time protocol (NTP) configuration information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNtpInfoResult getNtpInfo() {
        return super.sendRequest("GetNtpInfo", null, null, GetNtpInfoResult.class);
    }
    

    
    /** 
     * NetApp engineering uses the GetRawStats API method to troubleshoot new features. The data returned from GetRawStats is not documented, changes frequently, and is not guaranteed to be accurate. NetApp does not recommend using GetCompleteStats for collecting performance data or any other
     * management integration with a SolidFire cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getRawStats() {
        return super.sendRequest("GetRawStats", null, null, Attributes.class);
    }
    

    
    /** 
     * GetSystemStatus enables you to return whether a reboot ir required or not.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetSystemStatusResult getSystemStatus() {
        return super.sendRequest("GetSystemStatus", null, null, GetSystemStatusResult.class);
    }
    
    /** 
     * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listClusterFaults is not available until version 1.0.");
        }
        return super.sendRequest("ListClusterFaults", request, ListClusterFaultsRequest.class, ListClusterFaultsResult.class);
    }

    
    /** 
     * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(
        Optional<Boolean> bestPractices,
        Optional<String> faultTypes
        ) {
        return this.listClusterFaults(new ListClusterFaultsRequest(bestPractices, faultTypes));
    }
    
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(final ListEventsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listEvents is not available until version 1.0.");
        }
        return super.sendRequest("ListEvents", request, ListEventsRequest.class, ListEventsResult.class);
    }

    
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(
        Optional<Long> maxEvents,
        Optional<Long> startEventID,
        Optional<Long> endEventID
        ) {
        return this.listEvents(new ListEventsRequest(maxEvents, startEventID, endEventID));
    }
    

    
    /** 
     * ListSyncJobs enables you to return information about synchronization jobs that are running on a SolidFire cluster. The type of
     * synchronization jobs that are returned with this method are slice, clone, and remote.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListSyncJobsResult listSyncJobs() {
        return super.sendRequest("ListSyncJobs", null, null, ListSyncJobsResult.class);
    }
    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold setting to indicate the acceptable amount of utilized block storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, modifyClusterFullThreshold is not available until version 1.0.");
        }
        if(request.getStage3BlockThresholdPercent() != null && request.getStage3BlockThresholdPercent() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, stage3BlockThresholdPercent is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyClusterFullThreshold", request, ModifyClusterFullThresholdRequest.class, ModifyClusterFullThresholdResult.class);
    }

    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold setting to indicate the acceptable amount of utilized block storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> maxMetadataOverProvisionFactor
        ) {
        return this.modifyClusterFullThreshold(new ModifyClusterFullThresholdRequest(stage2AwareThreshold, maxMetadataOverProvisionFactor));
    }
    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold setting to indicate the acceptable amount of utilized block storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3BlockThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
        ) {
        return this.modifyClusterFullThreshold(new ModifyClusterFullThresholdRequest(stage2AwareThreshold, stage3BlockThresholdPercent, maxMetadataOverProvisionFactor));
    }
    
    /** 
     * The SetClusterConfig API method enables you to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified, see Cluster Object Attributes. To display the current cluster
     * interface settings for a node, run the GetClusterConfig API method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, setClusterConfig is not available until version 5.0.");
        }
        return super.sendRequest("SetClusterConfig", request, SetClusterConfigRequest.class, SetClusterConfigResult.class);
    }

    
    /** 
     * The SetClusterConfig API method enables you to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified, see Cluster Object Attributes. To display the current cluster
     * interface settings for a node, run the GetClusterConfig API method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(
        ClusterConfig cluster
        ) {
        return this.setClusterConfig(new SetClusterConfigRequest(cluster));
    }
    
    /** 
     * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
     * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(final SetNtpInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, setNtpInfo is not available until version 1.0.");
        }
        return super.sendRequest("SetNtpInfo", request, SetNtpInfoRequest.class, SetNtpInfoResult.class);
    }

    
    /** 
     * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
     * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(
        String[] servers,
        Optional<Boolean> broadcastclient
        ) {
        return this.setNtpInfo(new SetNtpInfoRequest(servers, broadcastclient));
    }
    
    /** 
     * You can use AddClusterAdmin to add a new cluster admin account. A cluster ddmin can manage the cluster using the API and management tools. Cluster admins are completely separate and unrelated to standard tenant accounts.
     * Each cluster admin can be restricted to a subset of the API. NetApp recommends using multiple cluster admin accounts for different users and applications. You should give each cluster admin the minimal permissions necessary; this reduces the potential impact of credential compromise.
     * You must accept the End User License Agreement (EULA) by setting the acceptEula parameter to true to add a cluster administrator account to the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, addClusterAdmin is not available until version 1.0.");
        }
        return super.sendRequest("AddClusterAdmin", request, AddClusterAdminRequest.class, AddClusterAdminResult.class);
    }

    
    /** 
     * You can use AddClusterAdmin to add a new cluster admin account. A cluster ddmin can manage the cluster using the API and management tools. Cluster admins are completely separate and unrelated to standard tenant accounts.
     * Each cluster admin can be restricted to a subset of the API. NetApp recommends using multiple cluster admin accounts for different users and applications. You should give each cluster admin the minimal permissions necessary; this reduces the potential impact of credential compromise.
     * You must accept the End User License Agreement (EULA) by setting the acceptEula parameter to true to add a cluster administrator account to the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(
        String username,
        String password,
        String[] access,
        Optional<Boolean> acceptEula,
        Optional<Attributes> attributes
        ) {
        return this.addClusterAdmin(new AddClusterAdminRequest(username, password, access, acceptEula, attributes));
    }
    

    
    /** 
     * GetCurrentClusterAdmin returns information for the current primary cluster administrator. The primary Cluster Admin was created when the cluster was created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetCurrentClusterAdminResult getCurrentClusterAdmin() {
        return super.sendRequest("GetCurrentClusterAdmin", null, null, GetCurrentClusterAdminResult.class);
    }
    

    
    /** 
     * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be several cluster administrator accounts with different levels of permissions. There can be only one primary cluster administrator in the system. The primary Cluster Admin is the administrator that was created when the cluster was created. You can also create LDAP administrators when setting up an LDAP system on the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterAdminsResult listClusterAdmins() {
        return super.sendRequest("ListClusterAdmins", null, null, ListClusterAdminsResult.class);
    }
    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin or LDAP cluster admin. You cannot change access for the administrator cluster admin account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, modifyClusterAdmin is not available until version 1.0.");
        }
        return super.sendRequest("ModifyClusterAdmin", request, ModifyClusterAdminRequest.class, ModifyClusterAdminResult.class);
    }

    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin or LDAP cluster admin. You cannot change access for the administrator cluster admin account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(
        Long clusterAdminID,
        Optional<String> password,
        Optional<String[]> access,
        Optional<Attributes> attributes
        ) {
        return this.modifyClusterAdmin(new ModifyClusterAdminRequest(clusterAdminID, password, access, attributes));
    }
    
    /** 
     * You can use RemoveClusterAdmin to remove a Cluster Admin. You cannot remove the administrator cluster admin account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, removeClusterAdmin is not available until version 1.0.");
        }
        return super.sendRequest("RemoveClusterAdmin", request, RemoveClusterAdminRequest.class, RemoveClusterAdminResult.class);
    }

    
    /** 
     * You can use RemoveClusterAdmin to remove a Cluster Admin. You cannot remove the administrator cluster admin account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(
        Long clusterAdminID
        ) {
        return this.removeClusterAdmin(new RemoveClusterAdminRequest(clusterAdminID));
    }
    
    /** 
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
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(final AddDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, addDrives is not available until version 1.0.");
        }
        return super.sendRequest("AddDrives", request, AddDrivesRequest.class, AddDrivesResult.class);
    }

    
    /** 
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
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(
        NewDrive[] drives,
        Optional<Boolean> forceDuringUpgrade
        ) {
        return this.addDrives(new AddDrivesRequest(drives, forceDuringUpgrade));
    }
    

    
    /** 
     * GetDriveConfig enables you to display drive information for expected slice and block drive counts as well as the number of slices
     * and block drives that are currently connected to the node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("2.0")
    @ConnectionType("Node")
    public GetDriveConfigResult getDriveConfig() {
        return super.sendRequest("GetDriveConfig", null, null, GetDriveConfigResult.class);
    }
    
    /** 
     * GetDriveHardwareInfo returns all the hardware information for the given drive. This generally includes details about manufacturers, vendors, versions, and
     * other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getDriveHardwareInfo is not available until version 1.0.");
        }
        return super.sendRequest("GetDriveHardwareInfo", request, GetDriveHardwareInfoRequest.class, GetDriveHardwareInfoResult.class);
    }

    
    /** 
     * GetDriveHardwareInfo returns all the hardware information for the given drive. This generally includes details about manufacturers, vendors, versions, and
     * other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(
        Long driveID
        ) {
        return this.getDriveHardwareInfo(new GetDriveHardwareInfoRequest(driveID));
    }
    
    /** 
     * GetDriveStats returns high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the
     * cluster. Some values are specific to block drives. You might not obtain statistical data for both block and metadata drives when you
     * run this method. 
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getDriveStats is not available until version 1.0.");
        }
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getDriveStats(this, request);
    }

    
    /** 
     * GetDriveStats returns high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the
     * cluster. Some values are specific to block drives. You might not obtain statistical data for both block and metadata drives when you
     * run this method. 
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(
        Long driveID
        ) {
        return this.getDriveStats(new GetDriveStatsRequest(driveID));
    }
    
    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on individual nodes to return drive hardware
     * information or use this method on the cluster master node MVIP to see information for all the drives on all nodes.
     * Note: The "securitySupported": true line of the method response does not imply that the drives are capable of
     * encryption; only that the security status can be queried. If you have a node type with a model number ending in "-NE",
     * commands to enable security features on these drives will fail. See the EnableEncryptionAtRest method for more information.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(final ListDriveHardwareRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, listDriveHardware is not available until version 7.0.");
        }
        return super.sendRequest("ListDriveHardware", request, ListDriveHardwareRequest.class, ListDriveHardwareResult.class);
    }

    
    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on individual nodes to return drive hardware
     * information or use this method on the cluster master node MVIP to see information for all the drives on all nodes.
     * Note: The "securitySupported": true line of the method response does not imply that the drives are capable of
     * encryption; only that the security status can be queried. If you have a node type with a model number ending in "-NE",
     * commands to enable security features on these drives will fail. See the EnableEncryptionAtRest method for more information.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(
        Boolean force
        ) {
        return this.listDriveHardware(new ListDriveHardwareRequest(force));
    }
    

    
    /** 
     * ListDrives enables you to retrieve the list of the drives that exist in the cluster's active nodes. This method returns drives that have
     * been added as volume metadata or block drives as well as drives that have not been added and are available.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDrivesResult listDrives() {
        return super.sendRequest("ListDrives", null, null, ListDrivesResult.class);
    }
    
    /** 
     * ListDriveStats enables you to retrieve high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(final ListDriveStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listDriveStats is not available until version 9.0.");
        }
        return super.sendRequest("ListDriveStats", request, ListDriveStatsRequest.class, ListDriveStatsResult.class);
    }

    
    /** 
     * ListDriveStats enables you to retrieve high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(
        Optional<Long[]> drives
        ) {
        return this.listDriveStats(new ListDriveStatsRequest(drives));
    }
    
    /** 
     * You can use RemoveDrives to proactively remove drives that are part of the cluster. You might want to use this method when
     * reducing cluster capacity or preparing to replace drives nearing the end of their service life. Any data on the drives is removed and
     * migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method. Depending on
     * the total capacity of the drives being removed, it might take several minutes to migrate all of the data. Use the GetAsyncResult
     * method to check the status of the remove operation.
     * When removing multiple drives, use a single RemoveDrives method call rather than multiple individual methods with a single drive
     * each. This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
     * You can also remove drives with a "failed" status using RemoveDrives. When you remove a drive with a "failed" status it is not
     * returned to an "available" or active status. The drive is unavailable for use in the cluster.
     * Use the ListDrives method to obtain the driveIDs for the drives you want to remove.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(final RemoveDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, removeDrives is not available until version 1.0.");
        }
        return super.sendRequest("RemoveDrives", request, RemoveDrivesRequest.class, AsyncHandleResult.class);
    }

    
    /** 
     * You can use RemoveDrives to proactively remove drives that are part of the cluster. You might want to use this method when
     * reducing cluster capacity or preparing to replace drives nearing the end of their service life. Any data on the drives is removed and
     * migrated to other drives in the cluster before the drive is removed from the cluster. This is an asynchronous method. Depending on
     * the total capacity of the drives being removed, it might take several minutes to migrate all of the data. Use the GetAsyncResult
     * method to check the status of the remove operation.
     * When removing multiple drives, use a single RemoveDrives method call rather than multiple individual methods with a single drive
     * each. This reduces the amount of data balancing that must occur to even stabilize the storage load on the cluster.
     * You can also remove drives with a "failed" status using RemoveDrives. When you remove a drive with a "failed" status it is not
     * returned to an "available" or active status. The drive is unavailable for use in the cluster.
     * Use the ListDrives method to obtain the driveIDs for the drives you want to remove.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(
        Long[] drives,
        Optional<Boolean> forceDuringUpgrade
        ) {
        return this.removeDrives(new RemoveDrivesRequest(drives, forceDuringUpgrade));
    }
    
    /** 
     * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
     * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(final ResetDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, resetDrives is not available until version 6.0.");
        }
        return super.sendRequest("ResetDrives", request, ResetDrivesRequest.class, ResetDrivesResult.class);
    }

    
    /** 
     * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
     * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(
        String drives,
        Boolean force
        ) {
        return this.resetDrives(new ResetDrivesRequest(drives, force));
    }
    
    /** 
     * SecureEraseDrives enables you to remove any residual data from drives that have a status of "available." You might want to use this method when replacing a drive nearing the end of its service life that contained sensitive data. This method uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. This asynchronous method might take up to two minutes to complete. You can use GetAsyncResult to check on the status of the secure erase operation.
     * You can use the ListDrives method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, secureEraseDrives is not available until version 5.0.");
        }
        return super.sendRequest("SecureEraseDrives", request, SecureEraseDrivesRequest.class, AsyncHandleResult.class);
    }

    
    /** 
     * SecureEraseDrives enables you to remove any residual data from drives that have a status of "available." You might want to use this method when replacing a drive nearing the end of its service life that contained sensitive data. This method uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. This asynchronous method might take up to two minutes to complete. You can use GetAsyncResult to check on the status of the secure erase operation.
     * You can use the ListDrives method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(
        Long[] drives
        ) {
        return this.secureEraseDrives(new SecureEraseDrivesRequest(drives));
    }
    
    /** 
     * You can use the TestDrives API method to run a hardware validation on all drives on the node. This method detects hardware
     * failures on the drives (if present) and reports them in the results of the validation tests.
     * You can only use the TestDrives method on nodes that are not "active" in a cluster.
     * Note: This test takes approximately 10 minutes.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(final TestDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, testDrives is not available until version 5.0.");
        }
        return super.sendRequest("TestDrives", request, TestDrivesRequest.class, TestDrivesResult.class);
    }

    
    /** 
     * You can use the TestDrives API method to run a hardware validation on all drives on the node. This method detects hardware
     * failures on the drives (if present) and reports them in the results of the validation tests.
     * You can only use the TestDrives method on nodes that are not "active" in a cluster.
     * Note: This test takes approximately 10 minutes.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(
        Optional<Long> minutes,
        Optional<Boolean> force
        ) {
        return this.testDrives(new TestDrivesRequest(minutes, force));
    }
    
    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI
     * nodes and drives in the cluster. This generally includes details about manufacturers, vendors, versions, and other associated hardware
     * identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(final GetClusterHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getClusterHardwareInfo is not available until version 1.0.");
        }
        return super.sendRequest("GetClusterHardwareInfo", request, GetClusterHardwareInfoRequest.class, GetClusterHardwareInfoResult.class);
    }

    
    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI
     * nodes and drives in the cluster. This generally includes details about manufacturers, vendors, versions, and other associated hardware
     * identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(
        Optional<String> type
        ) {
        return this.getClusterHardwareInfo(new GetClusterHardwareInfoRequest(type));
    }
    

    
    /** 
     * GetHardwareConfig enables you to display the hardware configuration information for a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetHardwareConfigResult getHardwareConfig() {
        return super.sendRequest("GetHardwareConfig", null, null, GetHardwareConfigResult.class);
    }
    

    
    /** 
     * The GetHardwareInfo API method enables you to return hardware information and status for a single node. This generally includes details about manufacturers, vendors, versions, drives, and other associated hardware identification information.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Node")
    public GetHardwareInfoResult getHardwareInfo() {
        return super.sendRequest("GetHardwareInfo", null, null, GetHardwareInfoResult.class);
    }
    
    /** 
     * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
     * manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(final GetNodeHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getNodeHardwareInfo is not available until version 1.0.");
        }
        return super.sendRequest("GetNodeHardwareInfo", request, GetNodeHardwareInfoRequest.class, GetNodeHardwareInfoResult.class);
    }

    
    /** 
     * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
     * manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(
        Long nodeID
        ) {
        return this.getNodeHardwareInfo(new GetNodeHardwareInfoRequest(nodeID));
    }
    
    /** 
     * GetNvramInfo enables you to retrieve information from each node about the NVRAM card.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo(final GetNvramInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, getNvramInfo is not available until version 5.0.");
        }
        return super.sendRequest("GetNvramInfo", request, GetNvramInfoRequest.class, GetNvramInfoResult.class);
    }

    
    /** 
     * GetNvramInfo enables you to retrieve information from each node about the NVRAM card.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo(
        Optional<Boolean> force
        ) {
        return this.getNvramInfo(new GetNvramInfoRequest(force));
    }
    
    /** 
     * AddInitiatorsToVolumeAccessGroup enables you
     * to add initiators to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, addInitiatorsToVolumeAccessGroup is not available until version 5.0.");
        }
        return super.sendRequest("AddInitiatorsToVolumeAccessGroup", request, AddInitiatorsToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    
    /** 
     * AddInitiatorsToVolumeAccessGroup enables you
     * to add initiators to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(
        Long volumeAccessGroupID,
        String[] initiators
        ) {
        return this.addInitiatorsToVolumeAccessGroup(new AddInitiatorsToVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
    }
    
    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
     * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
     * any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(final CreateInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, createInitiators is not available until version 9.0.");
        }
        return super.sendRequest("CreateInitiators", request, CreateInitiatorsRequest.class, CreateInitiatorsResult.class);
    }

    
    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
     * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
     * any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(
        CreateInitiator[] initiators
        ) {
        return this.createInitiators(new CreateInitiatorsRequest(initiators));
    }
    
    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access
     * groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any
     * initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteInitiatorsResult deleteInitiators(final DeleteInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, deleteInitiators is not available until version 9.0.");
        }
        return super.sendRequest("DeleteInitiators", request, DeleteInitiatorsRequest.class, DeleteInitiatorsResult.class);
    }

    
    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access
     * groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any
     * initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
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
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(final ListInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listInitiators is not available until version 9.0.");
        }
        return super.sendRequest("ListInitiators", request, ListInitiatorsRequest.class, ListInitiatorsResult.class);
    }

    
    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(
        Optional<Long> startInitiatorID,
        Optional<Long> limit,
        Optional<Long[]> initiators
        ) {
        return this.listInitiators(new ListInitiatorsRequest(startInitiatorID, limit, initiators));
    }
    
    /** 
     * ModifyInitiators enables you to change the attributes of one or more existing initiators. You cannot change the name of an existing
     * initiator. If you need to change the name of an initiator, delete it first with DeleteInitiators and create a new one with
     * CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not modify
     * any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(final ModifyInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, modifyInitiators is not available until version 9.0.");
        }
        return super.sendRequest("ModifyInitiators", request, ModifyInitiatorsRequest.class, ModifyInitiatorsResult.class);
    }

    
    /** 
     * ModifyInitiators enables you to change the attributes of one or more existing initiators. You cannot change the name of an existing
     * initiator. If you need to change the name of an initiator, delete it first with DeleteInitiators and create a new one with
     * CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not modify
     * any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(
        ModifyInitiator[] initiators
        ) {
        return this.modifyInitiators(new ModifyInitiatorsRequest(initiators));
    }
    
    /** 
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, removeInitiatorsFromVolumeAccessGroup is not available until version 5.0.");
        }
        return super.sendRequest("RemoveInitiatorsFromVolumeAccessGroup", request, RemoveInitiatorsFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    
    /** 
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(
        Long volumeAccessGroupID,
        String[] initiators,
        Optional<Boolean> deleteOrphanInitiators
        ) {
        return this.removeInitiatorsFromVolumeAccessGroup(new RemoveInitiatorsFromVolumeAccessGroupRequest(volumeAccessGroupID, initiators, deleteOrphanInitiators));
    }
    
    /** 
     * AddLdapClusterAdmin enables you to add a new LDAP cluster administrator user. An LDAP cluster administrator can manage the
     * cluster via the API and management tools. LDAP cluster admin accounts are completely separate and unrelated to standard tenant
     * accounts.
     * You can also use this method to add an LDAP group that has been defined in Active Directory. The access level that is given to the group is passed to the individual users in the LDAP group.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(final AddLdapClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, addLdapClusterAdmin is not available until version 8.0.");
        }
        return super.sendRequest("AddLdapClusterAdmin", request, AddLdapClusterAdminRequest.class, AddLdapClusterAdminResult.class);
    }

    
    /** 
     * AddLdapClusterAdmin enables you to add a new LDAP cluster administrator user. An LDAP cluster administrator can manage the
     * cluster via the API and management tools. LDAP cluster admin accounts are completely separate and unrelated to standard tenant
     * accounts.
     * You can also use this method to add an LDAP group that has been defined in Active Directory. The access level that is given to the group is passed to the individual users in the LDAP group.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(
        String username,
        String[] access,
        Optional<Boolean> acceptEula,
        Optional<Attributes> attributes
        ) {
        return this.addLdapClusterAdmin(new AddLdapClusterAdminRequest(username, access, acceptEula, attributes));
    }
    

    
    /** 
     * The DisableLdapAuthentication method enables you to disable LDAP authentication and remove all LDAP configuration settings. This method does not remove any configured cluster admin accounts (user or group). However, those cluster admin accounts will no longer be able to log in.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DisableLdapAuthenticationResult disableLdapAuthentication() {
        return super.sendRequest("DisableLdapAuthentication", null, null, DisableLdapAuthenticationResult.class);
    }
    
    /** 
     * The EnableLdapAuthentication method enables you to configure an LDAP directory connection to use for LDAP authentication to a cluster. Users that are members of the LDAP directory can then log in to the storage system using their LDAP credentials.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public EnableLdapAuthenticationResult enableLdapAuthentication(final EnableLdapAuthenticationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, enableLdapAuthentication is not available until version 7.0.");
        }
        return super.sendRequest("EnableLdapAuthentication", request, EnableLdapAuthenticationRequest.class, EnableLdapAuthenticationResult.class);
    }

    
    /** 
     * The EnableLdapAuthentication method enables you to configure an LDAP directory connection to use for LDAP authentication to a cluster. Users that are members of the LDAP directory can then log in to the storage system using their LDAP credentials.
     **/
    @Override
    @Since("7.0")
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
     * The GetLdapConfiguration method enables you to get the currently active LDAP configuration on the cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLdapConfigurationResult getLdapConfiguration() {
        return super.sendRequest("GetLdapConfiguration", null, null, GetLdapConfigurationResult.class);
    }
    
    /** 
     * The TestLdapAuthentication method enables you to validate the currently enabled LDAP authentication settings. If the configuration is
     * correct, the API call returns the group membership of the tested user.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(final TestLdapAuthenticationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, testLdapAuthentication is not available until version 7.0.");
        }
        return super.sendRequest("TestLdapAuthentication", request, TestLdapAuthenticationRequest.class, TestLdapAuthenticationResult.class);
    }

    
    /** 
     * The TestLdapAuthentication method enables you to validate the currently enabled LDAP authentication settings. If the configuration is
     * correct, the API call returns the group membership of the tested user.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(
        String username,
        String password,
        Optional<LdapConfiguration> ldapConfiguration
        ) {
        return this.testLdapAuthentication(new TestLdapAuthenticationRequest(username, password, ldapConfiguration));
    }
    

    
    /** 
     * GetLoginSessionInfo enables you to return the period of time a log in authentication session is valid for both log in shells and the TUI.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLoginSessionInfoResult getLoginSessionInfo() {
        return super.sendRequest("GetLoginSessionInfo", null, null, GetLoginSessionInfoResult.class);
    }
    

    
    /** 
     * GetRemoteLoggingHosts enables you to retrieve the current list of log servers.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetRemoteLoggingHostsResult getRemoteLoggingHosts() {
        return super.sendRequest("GetRemoteLoggingHosts", null, null, GetRemoteLoggingHostsResult.class);
    }
    
    /** 
     * You can use SetLoginSessionInfo to set the period of time that a session's login authentication is valid. After the log in period elapses without activity on the system, the authentication expires. New login credentials are required for continued access to the cluster after the timeout period has elapsed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(final SetLoginSessionInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, setLoginSessionInfo is not available until version 7.0.");
        }
        return super.sendRequest("SetLoginSessionInfo", request, SetLoginSessionInfoRequest.class, SetLoginSessionInfoResult.class);
    }

    
    /** 
     * You can use SetLoginSessionInfo to set the period of time that a session's login authentication is valid. After the log in period elapses without activity on the system, the authentication expires. New login credentials are required for continued access to the cluster after the timeout period has elapsed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(
        String timeout
        ) {
        return this.setLoginSessionInfo(new SetLoginSessionInfoRequest(timeout));
    }
    
    /** 
     * SetRemoteLoggingHosts enables you to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use GetRemoteLoggingHosts to determine what the current logging hosts are, and then use SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(final SetRemoteLoggingHostsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, setRemoteLoggingHosts is not available until version 1.0.");
        }
        return super.sendRequest("SetRemoteLoggingHosts", request, SetRemoteLoggingHostsRequest.class, SetRemoteLoggingHostsResult.class);
    }

    
    /** 
     * SetRemoteLoggingHosts enables you to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use GetRemoteLoggingHosts to determine what the current logging hosts are, and then use SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(
        LoggingServer[] remoteHosts
        ) {
        return this.setRemoteLoggingHosts(new SetRemoteLoggingHostsRequest(remoteHosts));
    }
    

    
    /** 
     * ListFibreChannelPortInfo enables you to retrieve information about the Fibre Channel ports on a node.  The API method is intended for use on individual nodes; userid and password authentication is required for access to individual Fibre Channel nodes.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListFibreChannelPortInfoResult listFibreChannelPortInfo() {
        return super.sendRequest("ListFibreChannelPortInfo", null, null, ListFibreChannelPortInfoResult.class);
    }
    

    
    /** 
     * ListFibreChannelSessions enables you to retrieve information about the active Fibre Channel sessions on a cluster. 
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListFibreChannelSessionsResult listFibreChannelSessions() {
        return super.sendRequest("ListFibreChannelSessions", null, null, ListFibreChannelSessionsResult.class);
    }
    

    
    /** 
     * You can use ListISCSISessions to return iSCSI information for volumes in the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListISCSISessionsResult listISCSISessions() {
        return super.sendRequest("ListISCSISessions", null, null, ListISCSISessionsResult.class);
    }
    

    
    /** 
     * ListNetworkInterfaces enables you to retrieve information about each network interface on a node. The API method is intended for use on individual nodes; userid and password authentication is required for access to individual nodes.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Node")
    public ListNetworkInterfacesResult listNetworkInterfaces() {
        return super.sendRequest("ListNetworkInterfaces", null, null, ListNetworkInterfacesResult.class);
    }
    

    
    /** 
     * The ListNodeFibreChannelPortInfo API method enables you to retrieve information about the Fibre Channel ports on a node. The API method is intended for use on individual nodes; userid and password authentication is required for access to individual Fibre Channel nodes.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Node")
    public ListNodeFibreChannelPortInfoResult listNodeFibreChannelPortInfo() {
        return super.sendRequest("ListNodeFibreChannelPortInfo", null, null, ListNodeFibreChannelPortInfoResult.class);
    }
    
    /** 
     * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
     * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(final AddNodesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, addNodes is not available until version 1.0.");
        }
        return super.sendRequest("AddNodes", request, AddNodesRequest.class, AddNodesResult.class);
    }

    
    /** 
     * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
     * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(
        Long[] pendingNodes,
        Optional<Boolean> autoInstall
        ) {
        return this.addNodes(new AddNodesRequest(pendingNodes, autoInstall));
    }
    

    
    /** 
     * GetBootstrapConfig returns cluster and node information from the bootstrap configuration file. Use this API method on an individual node before it has been joined with a cluster. You can use the information this method returns in the cluster configuration interface when you create a cluster.
     **/
    @Override
    @Since("2.0")
    @ConnectionType("Both")
    public GetBootstrapConfigResult getBootstrapConfig() {
        return super.sendRequest("GetBootstrapConfig", null, null, GetBootstrapConfigResult.class);
    }
    

    
    /** 
     * The GetConfig API method enables you to retrieve all configuration information for a node. This method includes the same information available in both the GetClusterConfig and GetNetworkConfig API methods.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetConfigResult getConfig() {
        return super.sendRequest("GetConfig", null, null, GetConfigResult.class);
    }
    

    
    /** 
     * The GetNetworkConfig API method enables you to display the network configuration information for a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetNetworkConfigResult getNetworkConfig() {
        return super.sendRequest("GetNetworkConfig", null, null, GetNetworkConfigResult.class);
    }
    
    /** 
     * GetNodeStats enables you to retrieve the high-level activity measurements for a single node.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(final GetNodeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getNodeStats is not available until version 1.0.");
        }
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getNodeStats(this, request);
    }

    
    /** 
     * GetNodeStats enables you to retrieve the high-level activity measurements for a single node.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(
        Long nodeID
        ) {
        return this.getNodeStats(new GetNodeStatsRequest(nodeID));
    }
    

    
    /** 
     * GetOrigin enables you to retrieve the origination certificate for where the node was built. This method might return null if there is no origination certification.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetOriginResult getOrigin() {
        return super.sendRequest("GetOrigin", null, null, GetOriginResult.class);
    }
    

    
    /** 
     * You can use GetPendingOperation to detect an operation on a node that is currently in progress. You can also use this method to report back when an operation has completed. 
     * Note: method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetPendingOperationResult getPendingOperation() {
        return super.sendRequest("GetPendingOperation", null, null, GetPendingOperationResult.class);
    }
    

    
    /** 
     * ListActiveNodes returns the list of currently active nodes that are in the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveNodesResult listActiveNodes() {
        return super.sendRequest("ListActiveNodes", null, null, ListActiveNodesResult.class);
    }
    

    
    /** 
     * ListAllNodes enables you to retrieve a list of active and pending nodes in the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAllNodesResult listAllNodes() {
        return super.sendRequest("ListAllNodes", null, null, ListAllNodesResult.class);
    }
    

    
    /** 
     * ListNodeStats enables you to view the high-level activity measurements for all nodes in a cluster.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListNodeStatsResult listNodeStats() {
        return super.sendRequest("ListNodeStats", null, null, ListNodeStatsResult.class);
    }
    

    
    /** 
     * ListPendingActiveNodes returns the list of nodes in the cluster that are currently in the PendingActive state, between the pending and active states. These are nodes that are currently being returned to the factory image.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListPendingActiveNodesResult listPendingActiveNodes() {
        return super.sendRequest("ListPendingActiveNodes", null, null, ListPendingActiveNodesResult.class);
    }
    

    
    /** 
     * ListPendingNodes returns a list of the currently pending nodes in the system. Pending nodes are nodes that are running and configured to join the cluster, but have not yet been added via the AddNodes API method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListPendingNodesResult listPendingNodes() {
        return super.sendRequest("ListPendingNodes", null, null, ListPendingNodesResult.class);
    }
    
    /** 
     * You can use RemoveNodes to remove one or more nodes that should no longer participate in the cluster. Before removing a node, you must remove all drives the node contains using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated away from the node.
     * After you remove a node, it registers itself as a pending node. You can add the node again or shut it down (shutting the node down removes it from the Pending Node list).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, removeNodes is not available until version 1.0.");
        }
        return super.sendRequest("RemoveNodes", request, RemoveNodesRequest.class, RemoveNodesResult.class);
    }

    
    /** 
     * You can use RemoveNodes to remove one or more nodes that should no longer participate in the cluster. Before removing a node, you must remove all drives the node contains using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated away from the node.
     * After you remove a node, it registers itself as a pending node. You can add the node again or shut it down (shutting the node down removes it from the Pending Node list).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(
        Long[] nodes
        ) {
        return this.removeNodes(new RemoveNodesRequest(nodes));
    }
    
    /** 
     * The SetConfig API method enables you to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Caution: Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetConfigResult setConfig(final SetConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, setConfig is not available until version 5.0.");
        }
        return super.sendRequest("SetConfig", request, SetConfigRequest.class, SetConfigResult.class);
    }

    
    /** 
     * The SetConfig API method enables you to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Caution: Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetConfigResult setConfig(
        ConfigParams config
        ) {
        return this.setConfig(new SetConfigRequest(config));
    }
    
    /** 
     * The SetNetworkConfig API method enables you to set the network configuration for a node. To display the current network settings for a node, run the GetNetworkConfig API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, setNetworkConfig is not available until version 5.0.");
        }
        return super.sendRequest("SetNetworkConfig", request, SetNetworkConfigRequest.class, SetNetworkConfigResult.class);
    }

    
    /** 
     * The SetNetworkConfig API method enables you to set the network configuration for a node. To display the current network settings for a node, run the GetNetworkConfig API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(
        NetworkParams network
        ) {
        return this.setNetworkConfig(new SetNetworkConfigRequest(network));
    }
    
    /** 
     * You can use the CompleteClusterPairing method with the encoded key received from the  StartClusterPairing method to complete the cluster pairing process. The CompleteClusterPairing method is the second step in the cluster pairing process. 
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, completeClusterPairing is not available until version 6.0.");
        }
        return super.sendRequest("CompleteClusterPairing", request, CompleteClusterPairingRequest.class, CompleteClusterPairingResult.class);
    }

    
    /** 
     * You can use the CompleteClusterPairing method with the encoded key received from the  StartClusterPairing method to complete the cluster pairing process. The CompleteClusterPairing method is the second step in the cluster pairing process. 
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(
        String clusterPairingKey
        ) {
        return this.completeClusterPairing(new CompleteClusterPairingRequest(clusterPairingKey));
    }
    
    /** 
     * You can use the CompleteVolumePairing method to complete the pairing of two volumes.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(final CompleteVolumePairingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, completeVolumePairing is not available until version 6.0.");
        }
        return super.sendRequest("CompleteVolumePairing", request, CompleteVolumePairingRequest.class, CompleteVolumePairingResult.class);
    }

    
    /** 
     * You can use the CompleteVolumePairing method to complete the pairing of two volumes.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(
        String volumePairingKey,
        Long volumeID
        ) {
        return this.completeVolumePairing(new CompleteVolumePairingRequest(volumePairingKey, volumeID));
    }
    
    /** 
     * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes(final ListActivePairedVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, listActivePairedVolumes is not available until version 6.0.");
        }
        return super.sendRequest("ListActivePairedVolumes", request, ListActivePairedVolumesRequest.class, ListActivePairedVolumesResult.class);
    }

    
    /** 
     * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit
        ) {
        return this.listActivePairedVolumes(new ListActivePairedVolumesRequest(startVolumeID, limit));
    }
    

    
    /** 
     * You can use the ListClusterPairs method to list all the clusters that a cluster is paired with. This method returns information about active and pending cluster pairings, such as statistics about the current pairing as well as the connectivity and latency (in milliseconds) of the cluster pairing.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListClusterPairsResult listClusterPairs() {
        return super.sendRequest("ListClusterPairs", null, null, ListClusterPairsResult.class);
    }
    
    /** 
     * ModifyVolumePair enables you to pause or restart replication between a pair of volumes.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(final ModifyVolumePairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, modifyVolumePair is not available until version 6.0.");
        }
        return super.sendRequest("ModifyVolumePair", request, ModifyVolumePairRequest.class, ModifyVolumePairResult.class);
    }

    
    /** 
     * ModifyVolumePair enables you to pause or restart replication between a pair of volumes.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(
        Long volumeID,
        Optional<Boolean> pausedManual,
        Optional<String> mode,
        Optional<Long> pauseLimit
        ) {
        return this.modifyVolumePair(new ModifyVolumePairRequest(volumeID, pausedManual, mode, pauseLimit));
    }
    
    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.
     * Note: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, removeClusterPair is not available until version 6.0.");
        }
        return super.sendRequest("RemoveClusterPair", request, RemoveClusterPairRequest.class, RemoveClusterPairResult.class);
    }

    
    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.
     * Note: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(
        Long clusterPairID
        ) {
        return this.removeClusterPair(new RemoveClusterPairRequest(clusterPairID));
    }
    
    /** 
     * RemoveVolumePair enables you to remove the remote pairing between two volumes. Use this method on both the source and target volumes that are paired together. When you remove the volume pairing information, data is no longer replicated to or from the volume.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(final RemoveVolumePairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, removeVolumePair is not available until version 6.0.");
        }
        return super.sendRequest("RemoveVolumePair", request, RemoveVolumePairRequest.class, RemoveVolumePairResult.class);
    }

    
    /** 
     * RemoveVolumePair enables you to remove the remote pairing between two volumes. Use this method on both the source and target volumes that are paired together. When you remove the volume pairing information, data is no longer replicated to or from the volume.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(
        Long volumeID
        ) {
        return this.removeVolumePair(new RemoveVolumePairRequest(volumeID));
    }
    

    
    /** 
     * You can use the StartClusterPairing method to create an encoded key from a cluster that is used to pair with another cluster. The key created from this API method is used in the CompleteClusterPairing API method to establish a cluster pairing. You can pair a cluster with a maximum of four other clusters. 
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartClusterPairingResult startClusterPairing() {
        return super.sendRequest("StartClusterPairing", null, null, StartClusterPairingResult.class);
    }
    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(final StartVolumePairingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, startVolumePairing is not available until version 6.0.");
        }
        if(request.getMode() != null && request.getMode() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, mode is not applicable to this version of the API.");
        }
        return super.sendRequest("StartVolumePairing", request, StartVolumePairingRequest.class, StartVolumePairingResult.class);
    }

    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(
        Long volumeID
        ) {
        return this.startVolumePairing(new StartVolumePairingRequest(volumeID));
    }
    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(
        Long volumeID,
        Optional<String> mode
        ) {
        return this.startVolumePairing(new StartVolumePairingRequest(volumeID, mode));
    }
    
    /** 
     * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
     * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
     * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
     * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
     * cluster, or in a "Pending" state.
     * Caution: This method clears any data that is on the node. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public ResetNodeResult resetNode(final ResetNodeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, resetNode is not available until version 5.0.");
        }
        return super.sendRequest("ResetNode", request, ResetNodeRequest.class, ResetNodeResult.class);
    }

    
    /** 
     * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
     * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
     * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
     * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
     * cluster, or in a "Pending" state.
     * Caution: This method clears any data that is on the node. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public ResetNodeResult resetNode(
        String build,
        Boolean force
        ) {
        return this.resetNode(new ResetNodeRequest(build, force));
    }
    
    /** 
     * The RestartNetworking API method enables you to restart the networking services on a node.
     * Warning: This method restarts all networking services on a node, causing temporary loss of networking connectivity.
     * Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartNetworking(final RestartNetworkingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, restartNetworking is not available until version 5.0.");
        }
        return super.sendRequest("RestartNetworking", request, RestartNetworkingRequest.class, Attributes.class);
    }

    
    /** 
     * The RestartNetworking API method enables you to restart the networking services on a node.
     * Warning: This method restarts all networking services on a node, causing temporary loss of networking connectivity.
     * Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartNetworking(
        Boolean force
        ) {
        return this.restartNetworking(new RestartNetworkingRequest(force));
    }
    
    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method,
     * log in to the MIP for the pending node, and enter the "shutdown" method with either the "restart" or "halt" options.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(final ShutdownRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, shutdown is not available until version 1.0.");
        }
        return super.sendRequest("Shutdown", request, ShutdownRequest.class, ShutdownResult.class);
    }

    
    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method,
     * log in to the MIP for the pending node, and enter the "shutdown" method with either the "restart" or "halt" options.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(
        Long[] nodes,
        Optional<String> option
        ) {
        return this.shutdown(new ShutdownRequest(nodes, option));
    }
    
    /** 
     * CreateSchedule enables you to schedule an automatic snapshot of a volume at a defined interval.
     * You can use the created snapshot later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for
     * the point in time in which the snapshot was created.
     * If you schedule a snapshot to run at a time period that is not divisible by 5 minutes, the snapshot runs at the next time period
     * that is divisible by 5 minutes. For example, if you schedule a snapshot to run at 12:42:00 UTC, it runs at 12:45:00 UTC.
     * Note: You can create snapshots if cluster fullness is at stage 1, 2 or 3. You cannot create snapshots after cluster fullness reaches stage 4 or 5.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(final CreateScheduleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, createSchedule is not available until version 8.0.");
        }
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.createSchedule(this, request);
    }

    
    /** 
     * CreateSchedule enables you to schedule an automatic snapshot of a volume at a defined interval.
     * You can use the created snapshot later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for
     * the point in time in which the snapshot was created.
     * If you schedule a snapshot to run at a time period that is not divisible by 5 minutes, the snapshot runs at the next time period
     * that is divisible by 5 minutes. For example, if you schedule a snapshot to run at 12:42:00 UTC, it runs at 12:45:00 UTC.
     * Note: You can create snapshots if cluster fullness is at stage 1, 2 or 3. You cannot create snapshots after cluster fullness reaches stage 4 or 5.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(
        Schedule schedule
        ) {
        return this.createSchedule(new CreateScheduleRequest(schedule));
    }
    
    /** 
     * You can use the GetSchedule method to retrieve information about a scheduled snapshot. You can see information about a specific
     * schedule if there are many snapshot schedules in the system. You also retrieve information about more than one schedule with this
     * method by specifying additional scheduleIDs in the parameter.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(final GetScheduleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, getSchedule is not available until version 8.0.");
        }
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.getSchedule(this, request);
    }

    
    /** 
     * You can use the GetSchedule method to retrieve information about a scheduled snapshot. You can see information about a specific
     * schedule if there are many snapshot schedules in the system. You also retrieve information about more than one schedule with this
     * method by specifying additional scheduleIDs in the parameter.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(
        Long scheduleID
        ) {
        return this.getSchedule(new GetScheduleRequest(scheduleID));
    }
    

    
    /** 
     * ListSchedule enables you to retrieve information about all scheduled snapshots that have been created.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListSchedulesResult listSchedules() {
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.listSchedules(this);
    }
    
    /** 
     * ModifySchedule enables you to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(final ModifyScheduleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, modifySchedule is not available until version 8.0.");
        }
        // Adaptor
        return com.solidfire.adaptor.ElementServiceAdaptor.modifySchedule(this, request);
    }

    
    /** 
     * ModifySchedule enables you to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(
        Schedule schedule
        ) {
        return this.modifySchedule(new ModifyScheduleRequest(schedule));
    }
    
    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(final GetIpmiConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, getIpmiConfig is not available until version 9.0.");
        }
        return super.sendRequest("GetIpmiConfig", request, GetIpmiConfigRequest.class, GetIpmiConfigResult.class);
    }

    
    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(
        Optional<String> chassisType
        ) {
        return this.getIpmiConfig(new GetIpmiConfigRequest(chassisType));
    }
    

    
    /** 
     * GetIpmiInfo enables you to display a detailed reporting of sensors (objects) for node fans, intake and exhaust temperatures, and power supplies that are monitored by the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiInfoResult getIpmiInfo() {
        return super.sendRequest("GetIpmiInfo", null, null, GetIpmiInfoResult.class);
    }
    

    
    /** 
     * You can use ListServices to return the services information for nodes, drives, current software, and other services that are running on the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListServicesResult listServices() {
        return super.sendRequest("ListServices", null, null, ListServicesResult.class);
    }
    
    /** 
     * The RestartServices API method enables you to restart the services on a node.
     * Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartServices(final RestartServicesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, restartServices is not available until version 5.0.");
        }
        return super.sendRequest("RestartServices", request, RestartServicesRequest.class, Attributes.class);
    }

    
    /** 
     * The RestartServices API method enables you to restart the services on a node.
     * Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartServices(
        Boolean force,
        Optional<String> service,
        Optional<String> action
        ) {
        return this.restartServices(new RestartServicesRequest(force, service, action));
    }
    
    /** 
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public Attributes invokeSFApi(final InvokeSFApiRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, invokeSFApi is not available until version 1.0.");
        }
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
    public Attributes invokeSFApi(
        String method,
        Optional<Object> parameters
        ) {
        return this.invokeSFApi(new InvokeSFApiRequest(method, parameters));
    }
    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, createGroupSnapshot is not available until version 7.0.");
        }
        if(request.getEnableRemoteReplication() != null && request.getEnableRemoteReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, enableRemoteReplication is not applicable to this version of the API.");
        }
        if(request.getRetention() != null && request.getRetention() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, retention is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateGroupSnapshot", request, CreateGroupSnapshotRequest.class, CreateGroupSnapshotResult.class);
    }

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes,
        Optional<String> name,
        Optional<Attributes> attributes
        ) {
        return this.createGroupSnapshot(new CreateGroupSnapshotRequest(volumes, name, attributes));
    }
    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<Attributes> attributes
        ) {
        return this.createGroupSnapshot(new CreateGroupSnapshotRequest(volumes, name, enableRemoteReplication, retention, attributes));
    }
    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, createSnapshot is not available until version 6.0.");
        }
        if(request.getEnableRemoteReplication() != null && request.getEnableRemoteReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, enableRemoteReplication is not applicable to this version of the API.");
        }
        if(request.getRetention() != null && request.getRetention() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, retention is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateSnapshot", request, CreateSnapshotRequest.class, CreateSnapshotResult.class);
    }

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Attributes> attributes
        ) {
        return this.createSnapshot(new CreateSnapshotRequest(volumeID, snapshotID, name, attributes));
    }
    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<Attributes> attributes
        ) {
        return this.createSnapshot(new CreateSnapshotRequest(volumeID, snapshotID, name, enableRemoteReplication, retention, attributes));
    }
    
    /** 
     * DeleteGroupSnapshot enables you to delete a group snapshot. You can use the saveMembers parameter to preserve all the snapshots that were made for the volumes in the group, but the group association is removed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, deleteGroupSnapshot is not available until version 7.0.");
        }
        return super.sendRequest("DeleteGroupSnapshot", request, DeleteGroupSnapshotRequest.class, DeleteGroupSnapshotResult.class);
    }

    
    /** 
     * DeleteGroupSnapshot enables you to delete a group snapshot. You can use the saveMembers parameter to preserve all the snapshots that were made for the volumes in the group, but the group association is removed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(
        Long groupSnapshotID,
        Boolean saveMembers
        ) {
        return this.deleteGroupSnapshot(new DeleteGroupSnapshotRequest(groupSnapshotID, saveMembers));
    }
    
    /** 
     * DeleteSnapshot enables you to delete a snapshot. A snapshot that is currently the "active" snapshot cannot be deleted. You must
     * rollback and make another snapshot "active" before the current snapshot can be deleted. For more details on rolling back snapshots, see RollbackToSnapshot.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, deleteSnapshot is not available until version 6.0.");
        }
        return super.sendRequest("DeleteSnapshot", request, DeleteSnapshotRequest.class, DeleteSnapshotResult.class);
    }

    
    /** 
     * DeleteSnapshot enables you to delete a snapshot. A snapshot that is currently the "active" snapshot cannot be deleted. You must
     * rollback and make another snapshot "active" before the current snapshot can be deleted. For more details on rolling back snapshots, see RollbackToSnapshot.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(
        Long snapshotID
        ) {
        return this.deleteSnapshot(new DeleteSnapshotRequest(snapshotID));
    }
    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, listGroupSnapshots is not available until version 7.0.");
        }
        if(request.getGroupSnapshotID() != null && request.getGroupSnapshotID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, groupSnapshotID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListGroupSnapshots", request, ListGroupSnapshotsRequest.class, ListGroupSnapshotsResult.class);
    }

    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(
        Optional<Long[]> volumes
        ) {
        return this.listGroupSnapshots(new ListGroupSnapshotsRequest(volumes));
    }
    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(
        Optional<Long[]> volumes,
        Optional<Long> groupSnapshotID
        ) {
        return this.listGroupSnapshots(new ListGroupSnapshotsRequest(volumes, groupSnapshotID));
    }
    
    /** 
     * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, listSnapshots is not available until version 6.0.");
        }
        return super.sendRequest("ListSnapshots", request, ListSnapshotsRequest.class, ListSnapshotsResult.class);
    }

    
    /** 
     * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(
        Optional<Long> volumeID,
        Optional<Long> snapshotID
        ) {
        return this.listSnapshots(new ListSnapshotsRequest(volumeID, snapshotID));
    }
    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, modifyGroupSnapshot is not available until version 8.0.");
        }
        return super.sendRequest("ModifyGroupSnapshot", request, ModifyGroupSnapshotRequest.class, ModifyGroupSnapshotResult.class);
    }

    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(
        Long groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
        ) {
        return this.modifyGroupSnapshot(new ModifyGroupSnapshotRequest(groupSnapshotID, expirationTime, enableRemoteReplication));
    }
    
    /** 
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, modifySnapshot is not available until version 8.0.");
        }
        return super.sendRequest("ModifySnapshot", request, ModifySnapshotRequest.class, ModifySnapshotResult.class);
    }

    
    /** 
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(
        Long snapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
        ) {
        return this.modifySnapshot(new ModifySnapshotRequest(snapshotID, expirationTime, enableRemoteReplication));
    }
    
    /** 
     * RollbackToGroupSnapshot enables you to roll back all individual volumes in a snapshot group to each volume's individual snapshot.
     * Note: Rolling back to a group snapshot creates a temporary snapshot of each volume within the group snapshot.
     * Snapshots are allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public RollbackToGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, rollbackToGroupSnapshot is not available until version 7.0.");
        }
        return super.sendRequest("RollbackToGroupSnapshot", request, RollbackToGroupSnapshotRequest.class, RollbackToGroupSnapshotResult.class);
    }

    
    /** 
     * RollbackToGroupSnapshot enables you to roll back all individual volumes in a snapshot group to each volume's individual snapshot.
     * Note: Rolling back to a group snapshot creates a temporary snapshot of each volume within the group snapshot.
     * Snapshots are allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public RollbackToGroupSnapshotResult rollbackToGroupSnapshot(
        Long groupSnapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<Attributes> attributes
        ) {
        return this.rollbackToGroupSnapshot(new RollbackToGroupSnapshotRequest(groupSnapshotID, saveCurrentState, name, attributes));
    }
    
    /** 
     * RollbackToSnapshot enables you to make an existing snapshot of the "active" volume image. This method creates a new snapshot
     * from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until you delete it.
     * The previously "active" snapshot is deleted unless you set the parameter saveCurrentState to true.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RollbackToSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, rollbackToSnapshot is not available until version 6.0.");
        }
        return super.sendRequest("RollbackToSnapshot", request, RollbackToSnapshotRequest.class, RollbackToSnapshotResult.class);
    }

    
    /** 
     * RollbackToSnapshot enables you to make an existing snapshot of the "active" volume image. This method creates a new snapshot
     * from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until you delete it.
     * The previously "active" snapshot is deleted unless you set the parameter saveCurrentState to true.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RollbackToSnapshotResult rollbackToSnapshot(
        Long volumeID,
        Long snapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<Attributes> attributes
        ) {
        return this.rollbackToSnapshot(new RollbackToSnapshotRequest(volumeID, snapshotID, saveCurrentState, name, attributes));
    }
    

    
    /** 
     * You can use DisableSnmp to disable SNMP on the cluster nodes.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public DisableSnmpResult disableSnmp() {
        return super.sendRequest("DisableSnmp", null, null, DisableSnmpResult.class);
    }
    
    /** 
     * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
     * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(final EnableSnmpRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, enableSnmp is not available until version 8.0.");
        }
        return super.sendRequest("EnableSnmp", request, EnableSnmpRequest.class, EnableSnmpResult.class);
    }

    
    /** 
     * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
     * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(
        Boolean snmpV3Enabled
        ) {
        return this.enableSnmp(new EnableSnmpRequest(snmpV3Enabled));
    }
    

    
    /** 
     * GetSnmpACL enables you to return the current SNMP access permissions on the cluster nodes.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetSnmpACLResult getSnmpACL() {
        return super.sendRequest("GetSnmpACL", null, null, GetSnmpACLResult.class);
    }
    

    
    /** 
     * GetSnmpInfo enables you to retrieve the current simple network management protocol (SNMP) configuration information.
     * Note: GetSnmpInfo is available for Element OS 8 and prior releases. It is deprecated for versions later than Element OS 8.
     * NetApp recommends that you migrate to the GetSnmpState and SetSnmpACL methods. See details in the Element API Reference Guide
     * for their descriptions and usage.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetSnmpInfoResult getSnmpInfo() {
        return super.sendRequest("GetSnmpInfo", null, null, GetSnmpInfoResult.class);
    }
    

    
    /** 
     * You can use GetSnmpState to return the current state of the SNMP feature.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetSnmpStateResult getSnmpState() {
        return super.sendRequest("GetSnmpState", null, null, GetSnmpStateResult.class);
    }
    

    
    /** 
     * You can use GetSnmpTrapInfo to return current SNMP trap configuration information.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetSnmpTrapInfoResult getSnmpTrapInfo() {
        return super.sendRequest("GetSnmpTrapInfo", null, null, GetSnmpTrapInfoResult.class);
    }
    
    /** 
     * SetSnmpACL enables you to configure SNMP access permissions on the cluster nodes. The values you set with this interface apply to all
     * nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note
     * that the values set with this interface replace all network or usmUsers values set with the older SetSnmpInfo.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(final SetSnmpACLRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, setSnmpACL is not available until version 8.0.");
        }
        return super.sendRequest("SetSnmpACL", request, SetSnmpACLRequest.class, SetSnmpACLResult.class);
    }

    
    /** 
     * SetSnmpACL enables you to configure SNMP access permissions on the cluster nodes. The values you set with this interface apply to all
     * nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note
     * that the values set with this interface replace all network or usmUsers values set with the older SetSnmpInfo.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(
        SnmpNetwork[] networks,
        SnmpV3UsmUser[] usmUsers
        ) {
        return this.setSnmpACL(new SetSnmpACLRequest(networks, usmUsers));
    }
    
    /** 
     * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
     * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(final SetSnmpInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, setSnmpInfo is not available until version 1.0.");
        }
        return super.sendRequest("SetSnmpInfo", request, SetSnmpInfoRequest.class, SetSnmpInfoResult.class);
    }

    
    /** 
     * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
     * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
     **/
    @Override
    @Since("1.0")
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
     * You can use SetSnmpTrapInfo to enable and disable the generation of cluster SNMP notifications (traps) and to specify the set of network host computers that receive the notifications. The values you pass with each SetSnmpTrapInfo method call replace all values set in any previous call to SetSnmpTrapInfo.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(final SetSnmpTrapInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, setSnmpTrapInfo is not available until version 5.0.");
        }
        return super.sendRequest("SetSnmpTrapInfo", request, SetSnmpTrapInfoRequest.class, SetSnmpTrapInfoResult.class);
    }

    
    /** 
     * You can use SetSnmpTrapInfo to enable and disable the generation of cluster SNMP notifications (traps) and to specify the set of network host computers that receive the notifications. The values you pass with each SetSnmpTrapInfo method call replace all values set in any previous call to SetSnmpTrapInfo.
     **/
    @Override
    @Since("5.0")
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
    @Since("6.0")
    @ConnectionType("Cluster")
    public SnmpSendTestTrapsResult snmpSendTestTraps() {
        return super.sendRequest("SnmpSendTestTraps", null, null, SnmpSendTestTrapsResult.class);
    }
    
    /** 
     * CreateStorageContainer enables you to create a Virtual Volume (VVol) storage container. Storage containers are associated with a SolidFire storage system account, and are used for reporting and resource allocation. Storage containers can only be associated with virtual volumes. You need at least one storage container to use the Virtual Volumes feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(final CreateStorageContainerRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, createStorageContainer is not available until version 9.0.");
        }
        return super.sendRequest("CreateStorageContainer", request, CreateStorageContainerRequest.class, CreateStorageContainerResult.class);
    }

    
    /** 
     * CreateStorageContainer enables you to create a Virtual Volume (VVol) storage container. Storage containers are associated with a SolidFire storage system account, and are used for reporting and resource allocation. Storage containers can only be associated with virtual volumes. You need at least one storage container to use the Virtual Volumes feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(
        String name,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret,
        Optional<Long> accountID
        ) {
        return this.createStorageContainer(new CreateStorageContainerRequest(name, initiatorSecret, targetSecret, accountID));
    }
    
    /** 
     * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
     * The storage containers you remove must not contain any VVols.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(final DeleteStorageContainersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, deleteStorageContainers is not available until version 9.0.");
        }
        return super.sendRequest("DeleteStorageContainers", request, DeleteStorageContainersRequest.class, DeleteStorageContainerResult.class);
    }

    
    /** 
     * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
     * The storage containers you remove must not contain any VVols.
     **/
    @Override
    @Since("9.0")
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
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(final GetStorageContainerEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, getStorageContainerEfficiency is not available until version 9.0.");
        }
        return super.sendRequest("GetStorageContainerEfficiency", request, GetStorageContainerEfficiencyRequest.class, GetStorageContainerEfficiencyResult.class);
    }

    
    /** 
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(
        java.util.UUID storageContainerID
        ) {
        return this.getStorageContainerEfficiency(new GetStorageContainerEfficiencyRequest(storageContainerID));
    }
    
    /** 
     * ListStorageContainers enables you to retrieve information about all virtual volume storage containers known to the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(final ListStorageContainersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listStorageContainers is not available until version 9.0.");
        }
        return super.sendRequest("ListStorageContainers", request, ListStorageContainersRequest.class, ListStorageContainersResult.class);
    }

    
    /** 
     * ListStorageContainers enables you to retrieve information about all virtual volume storage containers known to the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(
        Optional<java.util.UUID[]> storageContainerIDs
        ) {
        return this.listStorageContainers(new ListStorageContainersRequest(storageContainerIDs));
    }
    
    /** 
     * ModifyStorageContainer enables you to make changes to an existing virtual volume storage container.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(final ModifyStorageContainerRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, modifyStorageContainer is not available until version 9.0.");
        }
        return super.sendRequest("ModifyStorageContainer", request, ModifyStorageContainerRequest.class, ModifyStorageContainerResult.class);
    }

    
    /** 
     * ModifyStorageContainer enables you to make changes to an existing virtual volume storage container.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(
        java.util.UUID storageContainerID,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret
        ) {
        return this.modifyStorageContainer(new ModifyStorageContainerRequest(storageContainerID, initiatorSecret, targetSecret));
    }
    

    
    /** 
     * You can use the ListTests API method to return the tests that are available to run on a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public ListTestsResult listTests() {
        return super.sendRequest("ListTests", null, null, ListTestsResult.class);
    }
    

    
    /** 
     * You can use the ListUtilities API method to return the operations that are available to run on a node. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public ListUtilitiesResult listUtilities() {
        return super.sendRequest("ListUtilities", null, null, ListUtilitiesResult.class);
    }
    
    /** 
     * The TestConnectEnsemble API method enables you to verify connectivity with a specified database ensemble. By default, it uses the ensemble for the cluster that the node is associated with. Alternatively, you can provide a different ensemble to test connectivity with.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(final TestConnectEnsembleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, testConnectEnsemble is not available until version 5.0.");
        }
        return super.sendRequest("TestConnectEnsemble", request, TestConnectEnsembleRequest.class, TestConnectEnsembleResult.class);
    }

    
    /** 
     * The TestConnectEnsemble API method enables you to verify connectivity with a specified database ensemble. By default, it uses the ensemble for the cluster that the node is associated with. Alternatively, you can provide a different ensemble to test connectivity with.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(
        Optional<String> ensemble
        ) {
        return this.testConnectEnsemble(new TestConnectEnsembleRequest(ensemble));
    }
    
    /** 
     * The TestConnectMvip API method enables you to test the
     * management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(final TestConnectMvipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, testConnectMvip is not available until version 5.0.");
        }
        return super.sendRequest("TestConnectMvip", request, TestConnectMvipRequest.class, TestConnectMvipResult.class);
    }

    
    /** 
     * The TestConnectMvip API method enables you to test the
     * management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(
        Optional<String> mvip
        ) {
        return this.testConnectMvip(new TestConnectMvipRequest(mvip));
    }
    
    /** 
     * The TestConnectSvip API method enables you to test the storage connection to the cluster. The test pings the SVIP using ICMP packets, and when successful, connects as an iSCSI initiator.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(final TestConnectSvipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, testConnectSvip is not available until version 5.0.");
        }
        return super.sendRequest("TestConnectSvip", request, TestConnectSvipRequest.class, TestConnectSvipResult.class);
    }

    
    /** 
     * The TestConnectSvip API method enables you to test the storage connection to the cluster. The test pings the SVIP using ICMP packets, and when successful, connects as an iSCSI initiator.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(
        Optional<String> svip
        ) {
        return this.testConnectSvip(new TestConnectSvipRequest(svip));
    }
    
    /** 
     * You can use the TestPing API method to validate the
     * connection to all the nodes in a cluster on both 1G and 10G interfaces by using ICMP packets. The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestPingResult testPing(final TestPingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, testPing is not available until version 5.0.");
        }
        return super.sendRequest("TestPing", request, TestPingRequest.class, TestPingResult.class);
    }

    
    /** 
     * You can use the TestPing API method to validate the
     * connection to all the nodes in a cluster on both 1G and 10G interfaces by using ICMP packets. The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestPingResult testPing(
        Optional<Long> attempts,
        Optional<String> hosts,
        Optional<Long> totalTimeoutSec,
        Optional<Long> packetSize,
        Optional<Long> pingTimeoutMsec,
        Optional<Boolean> prohibitFragmentation
        ) {
        return this.testPing(new TestPingRequest(attempts, hosts, totalTimeoutSec, packetSize, pingTimeoutMsec, prohibitFragmentation));
    }
    
    /** 
     * You can use the AddVirtualNetwork method to add a new virtual network to a cluster configuration. When you add a virtual network,
     * an interface for each node is created and each interface will require a virtual network IP address. The number of IP addresses you
     * specify as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. The system bulk
     * provisions virtual network addresses and assigns them to individual nodes automatically. You do not need to assign virtual
     * network addresses to nodes manually.
     * Note: You can use AddVirtualNetwork only to create a new virtual network. If you want to make changes to an
     * existing virtual network, use ModifyVirtualNetwork.
     * Note: Virtual network parameters must be unique to each virtual network when setting the namespace parameter to false.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(final AddVirtualNetworkRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, addVirtualNetwork is not available until version 7.0.");
        }
        if(request.getGateway() != null && request.getGateway() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, gateway is not applicable to this version of the API.");
        }
        if(request.getNamespace() != null && request.getNamespace() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, namespace is not applicable to this version of the API.");
        }
        return super.sendRequest("AddVirtualNetwork", request, AddVirtualNetworkRequest.class, AddVirtualNetworkResult.class);
    }

    
    /** 
     * You can use the AddVirtualNetwork method to add a new virtual network to a cluster configuration. When you add a virtual network,
     * an interface for each node is created and each interface will require a virtual network IP address. The number of IP addresses you
     * specify as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. The system bulk
     * provisions virtual network addresses and assigns them to individual nodes automatically. You do not need to assign virtual
     * network addresses to nodes manually.
     * Note: You can use AddVirtualNetwork only to create a new virtual network. If you want to make changes to an
     * existing virtual network, use ModifyVirtualNetwork.
     * Note: Virtual network parameters must be unique to each virtual network when setting the namespace parameter to false.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(
        Long virtualNetworkTag,
        String name,
        AddressBlockParams[] addressBlocks,
        String netmask,
        String svip,
        Optional<Attributes> attributes
        ) {
        return this.addVirtualNetwork(new AddVirtualNetworkRequest(virtualNetworkTag, name, addressBlocks, netmask, svip, attributes));
    }
    
    /** 
     * You can use the AddVirtualNetwork method to add a new virtual network to a cluster configuration. When you add a virtual network,
     * an interface for each node is created and each interface will require a virtual network IP address. The number of IP addresses you
     * specify as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. The system bulk
     * provisions virtual network addresses and assigns them to individual nodes automatically. You do not need to assign virtual
     * network addresses to nodes manually.
     * Note: You can use AddVirtualNetwork only to create a new virtual network. If you want to make changes to an
     * existing virtual network, use ModifyVirtualNetwork.
     * Note: Virtual network parameters must be unique to each virtual network when setting the namespace parameter to false.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(
        Long virtualNetworkTag,
        String name,
        AddressBlockParams[] addressBlocks,
        String netmask,
        String svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<Attributes> attributes
        ) {
        return this.addVirtualNetwork(new AddVirtualNetworkRequest(virtualNetworkTag, name, addressBlocks, netmask, svip, gateway, namespace, attributes));
    }
    
    /** 
     * ListVirtualNetworks enables you to list all configured virtual networks for the cluster. You can use this method to verify the virtual
     * network settings in the cluster.
     * There are no required parameters for this method. However, to filter the results, you can pass one or more VirtualNetworkID or
     * VirtualNetworkTag values.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVirtualNetworksResult listVirtualNetworks(final ListVirtualNetworksRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, listVirtualNetworks is not available until version 7.0.");
        }
        return super.sendRequest("ListVirtualNetworks", request, ListVirtualNetworksRequest.class, ListVirtualNetworksResult.class);
    }

    
    /** 
     * ListVirtualNetworks enables you to list all configured virtual networks for the cluster. You can use this method to verify the virtual
     * network settings in the cluster.
     * There are no required parameters for this method. However, to filter the results, you can pass one or more VirtualNetworkID or
     * VirtualNetworkTag values.
     **/
    @Override
    @Since("7.0")
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
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(final ModifyVirtualNetworkRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, modifyVirtualNetwork is not available until version 7.0.");
        }
        if(request.getGateway() != null && request.getGateway() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, gateway is not applicable to this version of the API.");
        }
        if(request.getNamespace() != null && request.getNamespace() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, namespace is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyVirtualNetwork", request, ModifyVirtualNetworkRequest.class, AddVirtualNetworkResult.class);
    }

    
    /** 
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlockParams[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<Attributes> attributes
        ) {
        return this.modifyVirtualNetwork(new ModifyVirtualNetworkRequest(virtualNetworkID, virtualNetworkTag, name, addressBlocks, netmask, svip, attributes));
    }
    
    /** 
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlockParams[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<Attributes> attributes
        ) {
        return this.modifyVirtualNetwork(new ModifyVirtualNetworkRequest(virtualNetworkID, virtualNetworkTag, name, addressBlocks, netmask, svip, gateway, namespace, attributes));
    }
    
    /** 
     * RemoveVirtualNetwork enables you to remove a previously added virtual network.
     * Note: This method requires either the virtualNetworkID or the virtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, removeVirtualNetwork is not available until version 7.0.");
        }
        return super.sendRequest("RemoveVirtualNetwork", request, RemoveVirtualNetworkRequest.class, RemoveVirtualNetworkResult.class);
    }

    
    /** 
     * RemoveVirtualNetwork enables you to remove a previously added virtual network.
     * Note: This method requires either the virtualNetworkID or the virtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag
        ) {
        return this.removeVirtualNetwork(new RemoveVirtualNetworkRequest(virtualNetworkID, virtualNetworkTag));
    }
    
    /** 
     * You can use EnableFeature to enable cluster features that are disabled by default.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(final EnableFeatureRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, enableFeature is not available until version 9.0.");
        }
        return super.sendRequest("EnableFeature", request, EnableFeatureRequest.class, EnableFeatureResult.class);
    }

    
    /** 
     * You can use EnableFeature to enable cluster features that are disabled by default.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(
        String feature
        ) {
        return this.enableFeature(new EnableFeatureRequest(feature));
    }
    
    /** 
     * GetFeatureStatus enables you to retrieve the status of a cluster feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(final GetFeatureStatusRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, getFeatureStatus is not available until version 9.0.");
        }
        return super.sendRequest("GetFeatureStatus", request, GetFeatureStatusRequest.class, GetFeatureStatusResult.class);
    }

    
    /** 
     * GetFeatureStatus enables you to retrieve the status of a cluster feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(
        Optional<String> feature
        ) {
        return this.getFeatureStatus(new GetFeatureStatusRequest(feature));
    }
    

    
    /** 
     * Enables retrieval of the number of virtual volumes currently in the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetVirtualVolumeCountResult getVirtualVolumeCount() {
        return super.sendRequest("GetVirtualVolumeCount", null, null, GetVirtualVolumeCountResult.class);
    }
    
    /** 
     * ListProtocolEndpoints enables you to retrieve information about all protocol endpoints in the cluster. Protocol endpoints govern
     * access to their associated virtual volume storage containers.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(final ListProtocolEndpointsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listProtocolEndpoints is not available until version 9.0.");
        }
        return super.sendRequest("ListProtocolEndpoints", request, ListProtocolEndpointsRequest.class, ListProtocolEndpointsResult.class);
    }

    
    /** 
     * ListProtocolEndpoints enables you to retrieve information about all protocol endpoints in the cluster. Protocol endpoints govern
     * access to their associated virtual volume storage containers.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(
        Optional<java.util.UUID[]> protocolEndpointIDs
        ) {
        return this.listProtocolEndpoints(new ListProtocolEndpointsRequest(protocolEndpointIDs));
    }
    
    /** 
     * ListVirtualVolumeBindings returns a list of all virtual volumes in the cluster that are bound to protocol endpoints.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(final ListVirtualVolumeBindingsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listVirtualVolumeBindings is not available until version 9.0.");
        }
        return super.sendRequest("ListVirtualVolumeBindings", request, ListVirtualVolumeBindingsRequest.class, ListVirtualVolumeBindingsResult.class);
    }

    
    /** 
     * ListVirtualVolumeBindings returns a list of all virtual volumes in the cluster that are bound to protocol endpoints.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(
        Optional<Long[]> virtualVolumeBindingIDs
        ) {
        return this.listVirtualVolumeBindings(new ListVirtualVolumeBindingsRequest(virtualVolumeBindingIDs));
    }
    
    /** 
     * ListVirtualVolumeHosts returns a list of all virtual volume hosts known to the cluster. A virtual volume host is a VMware ESX host
     * that has initiated a session with the VASA API provider.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(final ListVirtualVolumeHostsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listVirtualVolumeHosts is not available until version 9.0.");
        }
        return super.sendRequest("ListVirtualVolumeHosts", request, ListVirtualVolumeHostsRequest.class, ListVirtualVolumeHostsResult.class);
    }

    
    /** 
     * ListVirtualVolumeHosts returns a list of all virtual volume hosts known to the cluster. A virtual volume host is a VMware ESX host
     * that has initiated a session with the VASA API provider.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(
        Optional<java.util.UUID[]> virtualVolumeHostIDs
        ) {
        return this.listVirtualVolumeHosts(new ListVirtualVolumeHostsRequest(virtualVolumeHostIDs));
    }
    
    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes,
     * or only list a subset.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(final ListVirtualVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listVirtualVolumes is not available until version 9.0.");
        }
        return super.sendRequest("ListVirtualVolumes", request, ListVirtualVolumesRequest.class, ListVirtualVolumesResult.class);
    }

    
    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes,
     * or only list a subset.
     **/
    @Override
    @Since("9.0")
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
     * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(final ListVirtualVolumeTasksRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listVirtualVolumeTasks is not available until version 9.0.");
        }
        return super.sendRequest("ListVirtualVolumeTasks", request, ListVirtualVolumeTasksRequest.class, ListVirtualVolumeTasksResult.class);
    }

    
    /** 
     * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(
        Optional<java.util.UUID[]> virtualVolumeTaskIDs
        ) {
        return this.listVirtualVolumeTasks(new ListVirtualVolumeTasksRequest(virtualVolumeTaskIDs));
    }
    
    /** 
     * ListVolumeStatsByVirtualVolume enables you to list volume statistics for any volumes in the system that are associated with virtual volumes. Statistics are cumulative from the creation of the volume.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(final ListVolumeStatsByVirtualVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, listVolumeStatsByVirtualVolume is not available until version 9.0.");
        }
        return super.sendRequest("ListVolumeStatsByVirtualVolume", request, ListVolumeStatsByVirtualVolumeRequest.class, ListVolumeStatsByVirtualVolumeResult.class);
    }

    
    /** 
     * ListVolumeStatsByVirtualVolume enables you to list volume statistics for any volumes in the system that are associated with virtual volumes. Statistics are cumulative from the creation of the volume.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(
        Optional<java.util.UUID[]> virtualVolumeIDs
        ) {
        return this.listVolumeStatsByVirtualVolume(new ListVolumeStatsByVirtualVolumeRequest(virtualVolumeIDs));
    }
    
    /** 
     * AddVolumesToVolumeAccessGroup enables you to add
     * volumes to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, addVolumesToVolumeAccessGroup is not available until version 5.0.");
        }
        return super.sendRequest("AddVolumesToVolumeAccessGroup", request, AddVolumesToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    
    /** 
     * AddVolumesToVolumeAccessGroup enables you to add
     * volumes to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(
        Long volumeAccessGroupID,
        Long[] volumes
        ) {
        return this.addVolumesToVolumeAccessGroup(new AddVolumesToVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }
    
    /** 
     * CancelClone enables you to stop an ongoing CloneVolume or CopyVolume process. When you cancel a group clone operation, the
     * system completes and removes the operation's associated asyncHandle.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(final CancelCloneRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, cancelClone is not available until version 9.0.");
        }
        return super.sendRequest("CancelClone", request, CancelCloneRequest.class, CancelCloneResult.class);
    }

    
    /** 
     * CancelClone enables you to stop an ongoing CloneVolume or CopyVolume process. When you cancel a group clone operation, the
     * system completes and removes the operation's associated asyncHandle.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(
        Long cloneID
        ) {
        return this.cancelClone(new CancelCloneRequest(cloneID));
    }
    
    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process occurring on a group of volumes. When you cancel
     * a group clone operation, the system completes and removes the operation's associated asyncHandle.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(final CancelGroupCloneRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, cancelGroupClone is not available until version 9.0.");
        }
        return super.sendRequest("CancelGroupClone", request, CancelGroupCloneRequest.class, CancelGroupCloneResult.class);
    }

    
    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process occurring on a group of volumes. When you cancel
     * a group clone operation, the system completes and removes the operation's associated asyncHandle.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(
        Long groupCloneID
        ) {
        return this.cancelGroupClone(new CancelGroupCloneRequest(groupCloneID));
    }
    
    /** 
     * CloneMultipleVolumes enables you to create a clone of a group of specified volumes. You can assign a consistent set of characteristics
     * to a group of multiple volumes when they are cloned together.
     * Before using groupSnapshotID to clone the volumes in a group snapshot, you must create the group snapshot by using the
     * CreateGroupSnapshot API method or the Element OS Web UI. Using groupSnapshotID is optional when cloning multiple volumes.
     * Note: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CloneMultipleVolumesResult cloneMultipleVolumes(final CloneMultipleVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, cloneMultipleVolumes is not available until version 7.0.");
        }
        return super.sendRequest("CloneMultipleVolumes", request, CloneMultipleVolumesRequest.class, CloneMultipleVolumesResult.class);
    }

    
    /** 
     * CloneMultipleVolumes enables you to create a clone of a group of specified volumes. You can assign a consistent set of characteristics
     * to a group of multiple volumes when they are cloned together.
     * Before using groupSnapshotID to clone the volumes in a group snapshot, you must create the group snapshot by using the
     * CreateGroupSnapshot API method or the Element OS Web UI. Using groupSnapshotID is optional when cloning multiple volumes.
     * Note: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
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
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, cloneVolume is not available until version 1.0.");
        }
        return super.sendRequest("CloneVolume", request, CloneVolumeRequest.class, CloneVolumeResult.class);
    }

    
    /** 
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(
        Long volumeID,
        String name,
        Optional<Long> newAccountID,
        Optional<Long> newSize,
        Optional<String> access,
        Optional<Long> snapshotID,
        Optional<Attributes> attributes,
        Optional<Boolean> enable512e
        ) {
        return this.cloneVolume(new CloneVolumeRequest(volumeID, name, newAccountID, newSize, access, snapshotID, attributes, enable512e));
    }
    
    /** 
     * CopyVolume enables you to overwrite the data contents of an existing volume with the data contents of another volume (or
     * snapshot). Attributes of the destination volume such as IQN, QoS settings, size, account, and volume access group membership are
     * not changed. The destination volume must already exist and must be the same size as the source volume.
     * NetApp strongly recommends that clients unmount the destination volume before the CopyVolume operation begins. If the
     * destination volume is modified during the copy operation, the changes will be lost.
     * This method is asynchronous and may take a variable amount of time to complete. You can use the GetAsyncResult method to
     * determine when the process has finished, and ListSyncJobs to see the progress of the copy.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(final CopyVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, copyVolume is not available until version 9.0.");
        }
        return super.sendRequest("CopyVolume", request, CopyVolumeRequest.class, CopyVolumeResult.class);
    }

    
    /** 
     * CopyVolume enables you to overwrite the data contents of an existing volume with the data contents of another volume (or
     * snapshot). Attributes of the destination volume such as IQN, QoS settings, size, account, and volume access group membership are
     * not changed. The destination volume must already exist and must be the same size as the source volume.
     * NetApp strongly recommends that clients unmount the destination volume before the CopyVolume operation begins. If the
     * destination volume is modified during the copy operation, the changes will be lost.
     * This method is asynchronous and may take a variable amount of time to complete. You can use the GetAsyncResult method to
     * determine when the process has finished, and ListSyncJobs to see the progress of the copy.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(
        Long volumeID,
        Long dstVolumeID,
        Optional<Long> snapshotID
        ) {
        return this.copyVolume(new CopyVolumeRequest(volumeID, dstVolumeID, snapshotID));
    }
    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(final CreateVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, createVolume is not available until version 1.0.");
        }
        return super.sendRequest("CreateVolume", request, CreateVolumeRequest.class, CreateVolumeResult.class);
    }

    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(
        String name,
        Long accountID,
        Long totalSize,
        Boolean enable512e,
        Optional<QoS> qos,
        Optional<Attributes> attributes
        ) {
        return this.createVolume(new CreateVolumeRequest(name, accountID, totalSize, enable512e, qos, attributes));
    }
    
    /** 
     * DeleteVolume marks an active volume for deletion. When marked, the volume is purged (permanently deleted) after the cleanup
     * interval elapses. After making a request to delete a volume, any active iSCSI connections to the volume are immediately terminated
     * and no further connections are allowed while the volume is in this state. A marked volume is not returned in target discovery
     * requests.
     * Any snapshots of a volume that has been marked for deletion are not affected. Snapshots are kept until the volume is purged from
     * the system.
     * If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress, the bulk volume read or
     * write operation is stopped.
     * If the volume you delete is paired with a volume, replication between the paired volumes is suspended and no data is transferred
     * to it or from it while in a deleted state. The remote volume that the deleted volume was paired with enters into a PausedMisconfigured state and data is no longer sent to it or from the deleted volume. Until the deleted volume is purged, it can be restored and data transfers resume. If the deleted volume gets purged from the system, the volume it was paired with enters into a StoppedMisconfigured state and the volume pairing status is removed. The purged volume becomes permanently unavailable.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, deleteVolume is not available until version 1.0.");
        }
        return super.sendRequest("DeleteVolume", request, DeleteVolumeRequest.class, DeleteVolumeResult.class);
    }

    
    /** 
     * DeleteVolume marks an active volume for deletion. When marked, the volume is purged (permanently deleted) after the cleanup
     * interval elapses. After making a request to delete a volume, any active iSCSI connections to the volume are immediately terminated
     * and no further connections are allowed while the volume is in this state. A marked volume is not returned in target discovery
     * requests.
     * Any snapshots of a volume that has been marked for deletion are not affected. Snapshots are kept until the volume is purged from
     * the system.
     * If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress, the bulk volume read or
     * write operation is stopped.
     * If the volume you delete is paired with a volume, replication between the paired volumes is suspended and no data is transferred
     * to it or from it while in a deleted state. The remote volume that the deleted volume was paired with enters into a PausedMisconfigured state and data is no longer sent to it or from the deleted volume. Until the deleted volume is purged, it can be restored and data transfers resume. If the deleted volume gets purged from the system, the volume it was paired with enters into a StoppedMisconfigured state and the volume pairing status is removed. The purged volume becomes permanently unavailable.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(
        Long volumeID
        ) {
        return this.deleteVolume(new DeleteVolumeRequest(volumeID));
    }
    
    /** 
     * DeleteVolumes marks multiple (up to 500) active volumes for deletion.
     * Once marked, the volumes are purged (permanently deleted) after the cleanup interval elapses.
     * The cleanup interval can be set in the SetClusterSettings method.
     * For more information on using this method, see SetClusterSettings on page 1.
     * After making a request to delete volumes, any active iSCSI connections to the volumes are immediately terminated
     * and no further connections are allowed while the volumes are in this state.
     * A marked volume is not returned in target discovery requests.
     * Any snapshots of a volume that has been marked for deletion are not affected.
     * Snapshots are kept until the volume is purged from the system.
     * If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress,
     * the bulk volume read or write operation is stopped.
     * If the volumes you delete are paired with a volume, replication between the paired volumes is suspended
     * and no data is transferred to them or from them while in a deleted state.
     * The remote volumes the deleted volumes were paired with enter into a PausedMisconfigured state
     * and data is no longer sent to them or from the deleted volumes.
     * Until the deleted volumes are purged, they can be restored and data transfers resume.
     * If the deleted volumes are purged from the system, the volumes they were paired with enter into a
     * StoppedMisconfigured state and the volume pairing status is removed.
     * The purged volumes become permanently unavailable.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(final DeleteVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, deleteVolumes is not available until version 9.0.");
        }
        return super.sendRequest("DeleteVolumes", request, DeleteVolumesRequest.class, DeleteVolumesResult.class);
    }

    
    /** 
     * DeleteVolumes marks multiple (up to 500) active volumes for deletion.
     * Once marked, the volumes are purged (permanently deleted) after the cleanup interval elapses.
     * The cleanup interval can be set in the SetClusterSettings method.
     * For more information on using this method, see SetClusterSettings on page 1.
     * After making a request to delete volumes, any active iSCSI connections to the volumes are immediately terminated
     * and no further connections are allowed while the volumes are in this state.
     * A marked volume is not returned in target discovery requests.
     * Any snapshots of a volume that has been marked for deletion are not affected.
     * Snapshots are kept until the volume is purged from the system.
     * If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress,
     * the bulk volume read or write operation is stopped.
     * If the volumes you delete are paired with a volume, replication between the paired volumes is suspended
     * and no data is transferred to them or from them while in a deleted state.
     * The remote volumes the deleted volumes were paired with enter into a PausedMisconfigured state
     * and data is no longer sent to them or from the deleted volumes.
     * Until the deleted volumes are purged, they can be restored and data transfers resume.
     * If the deleted volumes are purged from the system, the volumes they were paired with enter into a
     * StoppedMisconfigured state and the volume pairing status is removed.
     * The purged volumes become permanently unavailable.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs,
        Optional<Long[]> volumeIDs
        ) {
        return this.deleteVolumes(new DeleteVolumesRequest(accountIDs, volumeAccessGroupIDs, volumeIDs));
    }
    

    
    /** 
     * GetDefaultQoS enables you to retrieve the default QoS values for a newly created volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public VolumeQOS getDefaultQoS() {
        return super.sendRequest("GetDefaultQoS", null, null, VolumeQOS.class);
    }
    

    
    /** 
     * GetVolumeCount enables you to retrieve the number of volumes currently in the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetVolumeCountResult getVolumeCount() {
        return super.sendRequest("GetVolumeCount", null, null, GetVolumeCountResult.class);
    }
    
    /** 
     * GetVolumeEfficiency enables you to retrieve information about a volume. Only the volume you give as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, getVolumeEfficiency is not available until version 6.0.");
        }
        return super.sendRequest("GetVolumeEfficiency", request, GetVolumeEfficiencyRequest.class, GetVolumeEfficiencyResult.class);
    }

    
    /** 
     * GetVolumeEfficiency enables you to retrieve information about a volume. Only the volume you give as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(
        Long volumeID
        ) {
        return this.getVolumeEfficiency(new GetVolumeEfficiencyRequest(volumeID));
    }
    
    /** 
     * GetVolumeStats enables  you to retrieve high-level activity measurements for a single volume. Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, getVolumeStats is not available until version 1.0.");
        }
        return super.sendRequest("GetVolumeStats", request, GetVolumeStatsRequest.class, GetVolumeStatsResult.class);
    }

    
    /** 
     * GetVolumeStats enables  you to retrieve high-level activity measurements for a single volume. Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(
        Long volumeID
        ) {
        return this.getVolumeStats(new GetVolumeStatsRequest(volumeID));
    }
    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listActiveVolumes is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListActiveVolumes", request, ListActiveVolumesRequest.class, ListActiveVolumesResult.class);
    }

    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit
        ) {
        return this.listActiveVolumes(new ListActiveVolumesRequest(startVolumeID, limit));
    }
    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listActiveVolumes(new ListActiveVolumesRequest(startVolumeID, limit, includeVirtualVolumes));
    }
    

    
    /** 
     * ListBulkVolumeJobs enables you to retrieve information about each bulk volume read or write operation that is occurring in the
     * system.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListBulkVolumeJobsResult listBulkVolumeJobs() {
        return super.sendRequest("ListBulkVolumeJobs", null, null, ListBulkVolumeJobsResult.class);
    }
    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes(final ListDeletedVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listDeletedVolumes is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListDeletedVolumes", request, ListDeletedVolumesRequest.class, ListDeletedVolumesResult.class);
    }

    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes() {
        return super.sendRequest("ListDeletedVolumes", null, null, ListDeletedVolumesResult.class);
    }
    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes(
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listDeletedVolumes(new ListDeletedVolumesRequest(includeVirtualVolumes));
    }
    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(final ListVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The command, listVolumes is not available until version 8.0.");
        }
        if(request.getVolumeIDs() != null && request.getVolumeIDs() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, volumeIDs is not applicable to this version of the API.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListVolumes", request, ListVolumesRequest.class, ListVolumesResult.class);
    }

    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<Long[]> accounts,
        Optional<Boolean> isPaired,
        Optional<String> volumeName
        ) {
        return this.listVolumes(new ListVolumesRequest(startVolumeID, limit, volumeStatus, accounts, isPaired, volumeName));
    }
    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<Long[]> accounts,
        Optional<Boolean> isPaired,
        Optional<Long[]> volumeIDs,
        Optional<String> volumeName,
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listVolumes(new ListVolumesRequest(startVolumeID, limit, volumeStatus, accounts, isPaired, volumeIDs, volumeName, includeVirtualVolumes));
    }
    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listVolumesForAccount is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListVolumesForAccount", request, ListVolumesForAccountRequest.class, ListVolumesForAccountResult.class);
    }

    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(
        Long accountID,
        Optional<Long> startVolumeID,
        Optional<Long> limit
        ) {
        return this.listVolumesForAccount(new ListVolumesForAccountRequest(accountID, startVolumeID, limit));
    }
    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(
        Long accountID,
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listVolumesForAccount(new ListVolumesForAccountRequest(accountID, startVolumeID, limit, includeVirtualVolumes));
    }
    
    /** 
     * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(final ListVolumeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, listVolumeStats is not available until version 7.0.");
        }
        return super.sendRequest("ListVolumeStats", request, ListVolumeStatsRequest.class, ListVolumeStatsResult.class);
    }

    
    /** 
     * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(
        Optional<Long[]> volumeIDs
        ) {
        return this.listVolumeStats(new ListVolumeStatsRequest(volumeIDs));
    }
    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listVolumeStatsByAccount is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListVolumeStatsByAccount", request, ListVolumeStatsByAccountRequest.class, ListVolumeStatsByAccountResult.class);
    }

    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(
        Optional<Long[]> accounts
        ) {
        return this.listVolumeStatsByAccount(new ListVolumeStatsByAccountRequest(accounts));
    }
    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(
        Optional<Long[]> accounts,
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listVolumeStatsByAccount(new ListVolumeStatsByAccountRequest(accounts, includeVirtualVolumes));
    }
    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, listVolumeStatsByVolume is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListVolumeStatsByVolume", request, ListVolumeStatsByVolumeRequest.class, ListVolumeStatsByVolumeResult.class);
    }

    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume() {
        return super.sendRequest("ListVolumeStatsByVolume", null, null, ListVolumeStatsByVolumeResult.class);
    }
    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listVolumeStatsByVolume(new ListVolumeStatsByVolumeRequest(includeVirtualVolumes));
    }
    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, listVolumeStatsByVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, includeVirtualVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("ListVolumeStatsByVolumeAccessGroup", request, ListVolumeStatsByVolumeAccessGroupRequest.class, ListVolumeStatsByVolumeAccessGroupResult.class);
    }

    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(
        Optional<Long[]> volumeAccessGroups
        ) {
        return this.listVolumeStatsByVolumeAccessGroup(new ListVolumeStatsByVolumeAccessGroupRequest(volumeAccessGroups));
    }
    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(
        Optional<Long[]> volumeAccessGroups,
        Optional<Boolean> includeVirtualVolumes
        ) {
        return this.listVolumeStatsByVolumeAccessGroup(new ListVolumeStatsByVolumeAccessGroupRequest(volumeAccessGroups, includeVirtualVolumes));
    }
    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * NetApp recommends that both the target and source volumes are the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, modifyVolume is not available until version 1.0.");
        }
        return super.sendRequest("ModifyVolume", request, ModifyVolumeRequest.class, ModifyVolumeResult.class);
    }

    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * NetApp recommends that both the target and source volumes are the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(
        Long volumeID,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolume(new ModifyVolumeRequest(volumeID, accountID, access, qos, totalSize, attributes));
    }
    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Recommend that both the target and source volumes be the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(final ModifyVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, modifyVolumes is not available until version 9.0.");
        }
        return super.sendRequest("ModifyVolumes", request, ModifyVolumesRequest.class, ModifyVolumesResult.class);
    }

    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Recommend that both the target and source volumes be the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(
        Long[] volumeIDs,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolumes(new ModifyVolumesRequest(volumeIDs, accountID, access, qos, totalSize, attributes));
    }
    
    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
     * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
     * typically required.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, purgeDeletedVolume is not available until version 1.0.");
        }
        return super.sendRequest("PurgeDeletedVolume", request, PurgeDeletedVolumeRequest.class, PurgeDeletedVolumeResult.class);
    }

    
    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
     * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
     * typically required.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(
        Long volumeID
        ) {
        return this.purgeDeletedVolume(new PurgeDeletedVolumeRequest(volumeID));
    }
    
    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted.
     * You can use this method to purge up to 500 volumes at one time.
     * You must delete volumes using DeleteVolumes before they can be purged.
     * Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(final PurgeDeletedVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, purgeDeletedVolumes is not available until version 9.0.");
        }
        return super.sendRequest("PurgeDeletedVolumes", request, PurgeDeletedVolumesRequest.class, PurgeDeletedVolumesResult.class);
    }

    
    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted.
     * You can use this method to purge up to 500 volumes at one time.
     * You must delete volumes using DeleteVolumes before they can be purged.
     * Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(
        Optional<Long[]> volumeIDs,
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs
        ) {
        return this.purgeDeletedVolumes(new PurgeDeletedVolumesRequest(volumeIDs, accountIDs, volumeAccessGroupIDs));
    }
    
    /** 
     * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, removeVolumesFromVolumeAccessGroup is not available until version 5.0.");
        }
        return super.sendRequest("RemoveVolumesFromVolumeAccessGroup", request, RemoveVolumesFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    
    /** 
     * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(
        Long volumeAccessGroupID,
        Long[] volumes
        ) {
        return this.removeVolumesFromVolumeAccessGroup(new RemoveVolumesFromVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }
    
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 1.0) {
            throw new ApiException("The command, restoreDeletedVolume is not available until version 1.0.");
        }
        return super.sendRequest("RestoreDeletedVolume", request, RestoreDeletedVolumeRequest.class, RestoreDeletedVolumeResult.class);
    }

    
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(
        Long volumeID
        ) {
        return this.restoreDeletedVolume(new RestoreDeletedVolumeRequest(volumeID));
    }
    
    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
     * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(final SetDefaultQoSRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The command, setDefaultQoS is not available until version 9.0.");
        }
        return super.sendRequest("SetDefaultQoS", request, SetDefaultQoSRequest.class, SetDefaultQoSResult.class);
    }

    
    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
     * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(
        Optional<Long> minIOPS,
        Optional<Long> maxIOPS,
        Optional<Long> burstIOPS
        ) {
        return this.setDefaultQoS(new SetDefaultQoSRequest(minIOPS, maxIOPS, burstIOPS));
    }
    
    /** 
     * StartBulkVolumeRead enables you to initialize a bulk volume read session on a specified volume. Only two bulk volume processes
     * can run simultaneously on a volume. When you initialize the session, data is read from a SolidFire storage volume for the purposes
     * of storing the data on an external backup source. The external data is accessed by a web server running on an SF-series node.
     * Communications and server interaction information for external data access is passed by a script running on the storage system.
     * At the start of a bulk volume read operation, a snapshot of the volume is made and the snapshot is deleted when the read is complete. You can also read a snapshot of the volume by entering the ID of the snapshot as a parameter. When you read a
     * previous snapshot, the system does not create a new snapshot of the volume or delete the previous snapshot when the
     * read completes.
     * Note: This process creates a new snapshot if the ID of an existing snapshot is not provided. Snapshots can be created if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(final StartBulkVolumeReadRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, startBulkVolumeRead is not available until version 6.0.");
        }
        return super.sendRequest("StartBulkVolumeRead", request, StartBulkVolumeReadRequest.class, StartBulkVolumeReadResult.class);
    }

    
    /** 
     * StartBulkVolumeRead enables you to initialize a bulk volume read session on a specified volume. Only two bulk volume processes
     * can run simultaneously on a volume. When you initialize the session, data is read from a SolidFire storage volume for the purposes
     * of storing the data on an external backup source. The external data is accessed by a web server running on an SF-series node.
     * Communications and server interaction information for external data access is passed by a script running on the storage system.
     * At the start of a bulk volume read operation, a snapshot of the volume is made and the snapshot is deleted when the read is complete. You can also read a snapshot of the volume by entering the ID of the snapshot as a parameter. When you read a
     * previous snapshot, the system does not create a new snapshot of the volume or delete the previous snapshot when the
     * read completes.
     * Note: This process creates a new snapshot if the ID of an existing snapshot is not provided. Snapshots can be created if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(
        Long volumeID,
        String format,
        Optional<Long> snapshotID,
        Optional<String> script,
        Optional<Attributes> scriptParameters,
        Optional<Attributes> attributes
        ) {
        return this.startBulkVolumeRead(new StartBulkVolumeReadRequest(volumeID, format, snapshotID, script, scriptParameters, attributes));
    }
    
    /** 
     * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
     * interaction information for external data access is passed by a script running on the storage system.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(final StartBulkVolumeWriteRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, startBulkVolumeWrite is not available until version 6.0.");
        }
        return super.sendRequest("StartBulkVolumeWrite", request, StartBulkVolumeWriteRequest.class, StartBulkVolumeWriteResult.class);
    }

    
    /** 
     * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
     * interaction information for external data access is passed by a script running on the storage system.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(
        Long volumeID,
        String format,
        Optional<String> script,
        Optional<Attributes> scriptParameters,
        Optional<Attributes> attributes
        ) {
        return this.startBulkVolumeWrite(new StartBulkVolumeWriteRequest(volumeID, format, script, scriptParameters, attributes));
    }
    
    /** 
     * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
     * StartBulkVolumeRead or StartBulkVolumeWrite methods.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(final UpdateBulkVolumeStatusRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, updateBulkVolumeStatus is not available until version 6.0.");
        }
        return super.sendRequest("UpdateBulkVolumeStatus", request, UpdateBulkVolumeStatusRequest.class, UpdateBulkVolumeStatusResult.class);
    }

    
    /** 
     * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
     * StartBulkVolumeRead or StartBulkVolumeWrite methods.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(
        String key,
        String status,
        Optional<String> percentComplete,
        Optional<String> message,
        Optional<Attributes> attributes
        ) {
        return this.updateBulkVolumeStatus(new UpdateBulkVolumeStatusRequest(key, status, percentComplete, message, attributes));
    }
    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, createVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getVirtualNetworkID() != null && request.getVirtualNetworkID() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, virtualNetworkID is not applicable to this version of the API.");
        }
        if(request.getVirtualNetworkTags() != null && request.getVirtualNetworkTags() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, virtualNetworkTags is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateVolumeAccessGroup", request, CreateVolumeAccessGroupRequest.class, CreateVolumeAccessGroupResult.class);
    }

    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(
        String name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Attributes> attributes
        ) {
        return this.createVolumeAccessGroup(new CreateVolumeAccessGroupRequest(name, initiators, volumes, attributes));
    }
    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(
        String name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<Attributes> attributes
        ) {
        return this.createVolumeAccessGroup(new CreateVolumeAccessGroupRequest(name, initiators, volumes, virtualNetworkID, virtualNetworkTags, attributes));
    }
    
    /** 
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, deleteVolumeAccessGroup is not available until version 5.0.");
        }
        return super.sendRequest("DeleteVolumeAccessGroup", request, DeleteVolumeAccessGroupRequest.class, DeleteVolumeAccessGroupResult.class);
    }

    
    /** 
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(
        Long volumeAccessGroupID
        ) {
        return this.deleteVolumeAccessGroup(new DeleteVolumeAccessGroupRequest(volumeAccessGroupID));
    }
    
    /** 
     * GetVolumeAccessGroupEfficiency enables you to
     * retrieve efficiency information about a volume access
     * group. Only the volume access group you provide as the
     * parameter in this API method is used to compute the
     * capacity.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(final GetVolumeAccessGroupEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 6.0) {
            throw new ApiException("The command, getVolumeAccessGroupEfficiency is not available until version 6.0.");
        }
        return super.sendRequest("GetVolumeAccessGroupEfficiency", request, GetVolumeAccessGroupEfficiencyRequest.class, GetEfficiencyResult.class);
    }

    
    /** 
     * GetVolumeAccessGroupEfficiency enables you to
     * retrieve efficiency information about a volume access
     * group. Only the volume access group you provide as the
     * parameter in this API method is used to compute the
     * capacity.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(
        Long volumeAccessGroupID
        ) {
        return this.getVolumeAccessGroupEfficiency(new GetVolumeAccessGroupEfficiencyRequest(volumeAccessGroupID));
    }
    
    /** 
     * The GetVolumeAccessGroupLunAssignments
     * method enables you to retrieve details on LUN mappings
     * of a specified volume access group.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(final GetVolumeAccessGroupLunAssignmentsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, getVolumeAccessGroupLunAssignments is not available until version 7.0.");
        }
        return super.sendRequest("GetVolumeAccessGroupLunAssignments", request, GetVolumeAccessGroupLunAssignmentsRequest.class, GetVolumeAccessGroupLunAssignmentsResult.class);
    }

    
    /** 
     * The GetVolumeAccessGroupLunAssignments
     * method enables you to retrieve details on LUN mappings
     * of a specified volume access group.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID
        ) {
        return this.getVolumeAccessGroupLunAssignments(new GetVolumeAccessGroupLunAssignmentsRequest(volumeAccessGroupID));
    }
    
    /** 
     * ListVolumeAccessGroups enables you to return
     * information about the volume access groups that are
     * currently in the system.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, listVolumeAccessGroups is not available until version 5.0.");
        }
        return super.sendRequest("ListVolumeAccessGroups", request, ListVolumeAccessGroupsRequest.class, ListVolumeAccessGroupsResult.class);
    }

    
    /** 
     * ListVolumeAccessGroups enables you to return
     * information about the volume access groups that are
     * currently in the system.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(
        Optional<Long> startVolumeAccessGroupID,
        Optional<Long> limit,
        Optional<Long[]> volumeAccessGroups
        ) {
        return this.listVolumeAccessGroups(new ListVolumeAccessGroupsRequest(startVolumeAccessGroupID, limit, volumeAccessGroups));
    }
    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 5.0) {
            throw new ApiException("The command, modifyVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getVirtualNetworkID() != null && request.getVirtualNetworkID() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, virtualNetworkID is not applicable to this version of the API.");
        }
        if(request.getVirtualNetworkTags() != null && request.getVirtualNetworkTags() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 8.0) {
            throw new ApiException("The parameter, virtualNetworkTags is not applicable to this version of the API.");
        }
        if(request.getDeleteOrphanInitiators() != null && request.getDeleteOrphanInitiators() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < 9.0) {
            throw new ApiException("The parameter, deleteOrphanInitiators is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyVolumeAccessGroup", request, ModifyVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class);
    }

    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolumeAccessGroup(new ModifyVolumeAccessGroupRequest(volumeAccessGroupID, name, initiators, volumes, attributes));
    }
    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolumeAccessGroup(new ModifyVolumeAccessGroupRequest(volumeAccessGroupID, virtualNetworkID, virtualNetworkTags, name, initiators, volumes, attributes));
    }
    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Boolean> deleteOrphanInitiators,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolumeAccessGroup(new ModifyVolumeAccessGroupRequest(volumeAccessGroupID, virtualNetworkID, virtualNetworkTags, name, initiators, volumes, deleteOrphanInitiators, attributes));
    }
    
    /** 
     * The ModifyVolumeAccessGroupLunAssignments
     * method enables you to define custom LUN assignments
     * for specific volumes. This method changes only LUN
     * values set on the lunAssignments parameter in the
     * volume access group. All other LUN assignments remain
     * unchanged. LUN assignment values must be unique for volumes in a volume access group. You cannot define duplicate LUN values within a volume access group. However, you can use the same LUN values again in different volume access groups. 
     * Note: Correct LUN values are 0 through 16383. The system generates an exception if you pass a LUN value outside of this range. None of the specified LUN assignments are modified if there is an exception. 
     * Caution: If you change a LUN assignment for a volume with active I/O, the I/O can be disrupted. You might need to change the server configuration before changing volume LUN assignments.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(final ModifyVolumeAccessGroupLunAssignmentsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < 7.0) {
            throw new ApiException("The command, modifyVolumeAccessGroupLunAssignments is not available until version 7.0.");
        }
        return super.sendRequest("ModifyVolumeAccessGroupLunAssignments", request, ModifyVolumeAccessGroupLunAssignmentsRequest.class, ModifyVolumeAccessGroupLunAssignmentsResult.class);
    }

    
    /** 
     * The ModifyVolumeAccessGroupLunAssignments
     * method enables you to define custom LUN assignments
     * for specific volumes. This method changes only LUN
     * values set on the lunAssignments parameter in the
     * volume access group. All other LUN assignments remain
     * unchanged. LUN assignment values must be unique for volumes in a volume access group. You cannot define duplicate LUN values within a volume access group. However, you can use the same LUN values again in different volume access groups. 
     * Note: Correct LUN values are 0 through 16383. The system generates an exception if you pass a LUN value outside of this range. None of the specified LUN assignments are modified if there is an exception. 
     * Caution: If you change a LUN assignment for a volume with active I/O, the I/O can be disrupted. You might need to change the server configuration before changing volume LUN assignments.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID,
        LunAssignment[] lunAssignments
        ) {
        return this.modifyVolumeAccessGroupLunAssignments(new ModifyVolumeAccessGroupLunAssignmentsRequest(volumeAccessGroupID, lunAssignments));
    }
    
}
