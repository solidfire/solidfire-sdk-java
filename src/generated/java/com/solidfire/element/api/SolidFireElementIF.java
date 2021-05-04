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

import com.solidfire.core.client.Attributes;
import com.solidfire.core.annotation.*;
import com.solidfire.core.javautil.Optional;


/**
 * The API for controlling a SolidFire cluster.
 **/

public interface SolidFireElementIF {

    /** 
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(final AddAccountRequest request);

    
    /** 
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(
        String username, 
        Optional<CHAPSecret> initiatorSecret, 
        Optional<CHAPSecret> targetSecret, 
        Optional<Attributes> attributes
        );

    
    /** 
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(
        String username, 
        Optional<CHAPSecret> initiatorSecret, 
        Optional<CHAPSecret> targetSecret, 
        Optional<Attributes> attributes, 
        Optional<Boolean> enableChap
        );

    
    /** 
     * GetAccountByID enables you to return details about a specific account, given its accountID.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request);

    
    /** 
     * GetAccountByID enables you to return details about a specific account, given its accountID.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(
        Long accountID
        );

    
    /** 
     * GetAccountByName enables you to retrieve details about a specific account, given its username.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request);

    
    /** 
     * GetAccountByName enables you to retrieve details about a specific account, given its username.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(
        String username
        );

    
    /** 
     * GetAccountEfficiency enables you to retrieve efficiency statistics about a volume account. This method returns efficiency information
     * only for the account you specify as a parameter.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(final GetAccountEfficiencyRequest request);

    
    /** 
     * GetAccountEfficiency enables you to retrieve efficiency statistics about a volume account. This method returns efficiency information
     * only for the account you specify as a parameter.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(
        Long accountID
        );

    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(final ListAccountsRequest request);

    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(
        Optional<Long> startAccountID, 
        Optional<Long> limit
        );

    
    /** 
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(
        Optional<Long> startAccountID, 
        Optional<Long> limit, 
        Optional<Boolean> includeStorageContainers
        );

    
    /** 
     * ModifyAccount enables you to modify an existing account.
     * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
     * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
     * reconnections.
     * To clear an account's attributes, specify {} for the attributes parameter.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(final ModifyAccountRequest request);

    
    /** 
     * ModifyAccount enables you to modify an existing account.
     * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
     * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
     * reconnections.
     * To clear an account's attributes, specify {} for the attributes parameter.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(
        Long accountID, 
        Optional<String> username, 
        Optional<String> status, 
        Optional<CHAPSecret> initiatorSecret, 
        Optional<CHAPSecret> targetSecret, 
        Optional<Attributes> attributes
        );

    
    /** 
     * ModifyAccount enables you to modify an existing account.
     * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
     * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
     * reconnections.
     * To clear an account's attributes, specify {} for the attributes parameter.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyAccountResult modifyAccount(
        Long accountID, 
        Optional<String> username, 
        Optional<String> status, 
        Optional<CHAPSecret> initiatorSecret, 
        Optional<CHAPSecret> targetSecret, 
        Optional<Attributes> attributes, 
        Optional<Boolean> enableChap
        );

    
    /** 
     * RemoveAccount enables you to remove an existing account. You must delete and purge all volumes associated with the account
     * using DeleteVolume before you can remove the account. If volumes on the account are still pending deletion, you cannot use
     * RemoveAccount to remove the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request);

    
    /** 
     * RemoveAccount enables you to remove an existing account. You must delete and purge all volumes associated with the account
     * using DeleteVolume before you can remove the account. If volumes on the account are still pending deletion, you cannot use
     * RemoveAccount to remove the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(
        Long accountID
        );

    
    /** 
     * You can use GetAsyncResult to retrieve the result of asynchronous method calls. Some method calls require some time to run, and
     * might not be finished when the system sends the initial response. To obtain the status or result of the method call, use
     * GetAsyncResult to poll the asyncHandle value returned by the method.
     * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion, but the actual
     * data returned for the operation depends on the original method call and the return data is documented with each method.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getAsyncResult(final GetAsyncResultRequest request);

    
    /** 
     * You can use GetAsyncResult to retrieve the result of asynchronous method calls. Some method calls require some time to run, and
     * might not be finished when the system sends the initial response. To obtain the status or result of the method call, use
     * GetAsyncResult to poll the asyncHandle value returned by the method.
     * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion, but the actual
     * data returned for the operation depends on the original method call and the return data is documented with each method.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getAsyncResult(
        Long asyncHandle, 
        Optional<Boolean> keepResult
        );

    
    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system.
     * Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult
     * to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(final ListAsyncResultsRequest request);

    
    /** 
     * You can use ListAsyncResults to list the results of all currently running and completed asynchronous methods on the system.
     * Querying asynchronous results with ListAsyncResults does not cause completed asyncHandles to expire; you can use GetAsyncResult
     * to query any of the asyncHandles returned by ListAsyncResults.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListAsyncResultsResult listAsyncResults(
        Optional<String[]> asyncResultTypes
        );

    
    /** 
     * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(final CreateBackupTargetRequest request);

    
    /** 
     * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(
        String name, 
        Attributes attributes
        );

    
    /** 
     * GetBackupTarget enables you to return information about a specific backup target that you have created.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(final GetBackupTargetRequest request);

    
    /** 
     * GetBackupTarget enables you to return information about a specific backup target that you have created.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(
        Long backupTargetID
        );

    

    
    /** 
     * You can use ListBackupTargets to retrieve information about all backup targets that have been created.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListBackupTargetsResult listBackupTargets();
    
    /** 
     * ModifyBackupTarget enables you to change attributes of a backup target.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(final ModifyBackupTargetRequest request);

    
    /** 
     * ModifyBackupTarget enables you to change attributes of a backup target.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(
        Long backupTargetID, 
        Optional<String> name, 
        Optional<Attributes> attributes
        );

    
    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(final RemoveBackupTargetRequest request);

    
    /** 
     * RemoveBackupTarget allows you to delete backup targets.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveBackupTargetResult removeBackupTarget(
        Long backupTargetID
        );

    
    /** 
     * CheckProposedNodeAdditions validates that adding a node (or nodes) to an existing cluster is likely to succeed.  Any problems with the proposed new cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public CheckProposedResult checkProposedNodeAdditions(final CheckProposedNodeAdditionsRequest request);

    
    /** 
     * CheckProposedNodeAdditions validates that adding a node (or nodes) to an existing cluster is likely to succeed.  Any problems with the proposed new cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public CheckProposedResult checkProposedNodeAdditions(
        String[] nodes
        );

    
    /** 
     * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
     * and unresolved faults can be cleared.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request);

    
    /** 
     * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
     * and unresolved faults can be cleared.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(
        Optional<String> faultTypes
        );

    
    /** 
     * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
     * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
     * cluster. Then, run the CreateCluster method.
     **/
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(final CreateClusterRequest request);

    
    /** 
     * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
     * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
     * cluster. Then, run the CreateCluster method.
     **/
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(
        Optional<Boolean> acceptEula, 
        String mvip, 
        String svip, 
        String username, 
        String password, 
        String[] nodes, 
        Optional<Attributes> attributes
        );

    
    /** 
     * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
     * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
     * cluster. Then, run the CreateCluster method.
     **/
    @Since("7.0")
    @ConnectionType("Both")
    public CreateClusterResult createCluster(
        Optional<Boolean> acceptEula, 
        Optional<String> serialNumber, 
        Optional<String> orderNumber, 
        String mvip, 
        String svip, 
        String username, 
        String password, 
        String[] nodes, 
        Optional<Attributes> attributes, 
        Optional<Boolean> enableSoftwareEncryptionAtRest
        );

    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference(final CreateClusterInterfacePreferenceRequest request);

    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference();
    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference(
        String name, 
        String value
        );

    
    /** 
     * CreateSupportBundle enables you to create a support bundle file under the node's directory. After creation, the bundle is stored on the node as a tar.gz file.
     **/
    @Since("8.0")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(final CreateSupportBundleRequest request);

    
    /** 
     * CreateSupportBundle enables you to create a support bundle file under the node's directory. After creation, the bundle is stored on the node as a tar.gz file.
     **/
    @Since("8.0")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(
        Optional<String> bundleName, 
        Optional<String> extraArgs, 
        Optional<Long> timeoutSec
        );

    

    
    /** 
     * DeleteAllSupportBundles enables you to delete all support bundles generated with the CreateSupportBundle API method.
     **/
    @Since("8.0")
    @ConnectionType("Node")
    public DeleteAllSupportBundlesResult deleteAllSupportBundles();
    
    /** 
     * Deletes an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public DeleteClusterInterfacePreferenceResult deleteClusterInterfacePreference(final DeleteClusterInterfacePreferenceRequest request);

    
    /** 
     * Deletes an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public DeleteClusterInterfacePreferenceResult deleteClusterInterfacePreference(
        String name
        );

    

    
    /** 
     * Initiate the process of removing the password from self-encrypting drives (SEDs) within the cluster.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public DisableEncryptionAtRestResult disableEncryptionAtRest();
    
    /** 
     * Take a node out of maintenance mode. This should be called after maintenance is complete and the node is online.
     **/
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult disableMaintenanceMode(final DisableMaintenanceModeRequest request);

    
    /** 
     * Take a node out of maintenance mode. This should be called after maintenance is complete and the node is online.
     **/
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult disableMaintenanceMode(
        Long[] nodes
        );

    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest(final EnableEncryptionAtRestRequest request);

    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest();
    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest(
        Optional<Long> keyProviderID
        );

    
    /** 
     * Prepare a node for maintenance. Maintenance includes anything that will require the node to be powered-off or restarted.
     **/
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult enableMaintenanceMode(final EnableMaintenanceModeRequest request);

    
    /** 
     * Prepare a node for maintenance. Maintenance includes anything that will require the node to be powered-off or restarted.
     **/
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult enableMaintenanceMode(
        Long[] nodes, 
        Optional<Long> perMinutePrimarySwapLimit, 
        Optional<String> timeout, 
        Optional<Boolean> forceWithUnresolvedFaults
        );

    

    
    /** 
     * You can use the GetAPI method to return a list of all the API methods and supported API endpoints that can be used in the system.
     **/
    @Since("1.0")
    @ConnectionType("Both")
    public GetAPIResult getAPI();
    

    
    /** 
     * You can use the GetActiveTlsCiphers method to get a list of the TLS ciphers that are currently accepted on the cluster.
     **/
    @Since("11.3")
    @ConnectionType("Cluster")
    public GetActiveTlsCiphersResult getActiveTlsCiphers();
    

    
    /** 
     * GetBinAssignmentProperties enables you to retrieve the bin assignment properties in the database.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetBinAssignmentPropertiesResult getBinAssignmentProperties();
    

    
    /** 
     * You can use the GetClusterCapacity method to return the high-level capacity measurements for an entire cluster. You can use the fields returned from this method to calculate the efficiency rates that are displayed in the Element OS Web UI. You can use the following calculations in scripts to return the efficiency rates for thin provisioning, deduplication, compression, and overall efficiency.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterCapacityResult getClusterCapacity();
    

    
    /** 
     * The GetClusterConfig API method enables you to return information about the cluster configuration this node uses to communicate with the cluster that it is a part of.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetClusterConfigResult getClusterConfig();
    

    
    /** 
     * You can use GetClusterFullThreshold to view the stages set for cluster fullness levels. This method returns all fullness metrics for the
     * cluster.
     * Note: When a cluster reaches the Error stage of block cluster fullness, the maximum IOPS on all volumes are reduced linearly to the volume's minimum IOPS as the cluster approaches the Critical stage. This helps prevent the cluster from
     * reaching the Critical stage of block cluster fullness.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterFullThresholdResult getClusterFullThreshold();
    

    
    /** 
     * GetClusterInfo enables you to return configuration information about the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterInfoResult getClusterInfo();
    
    /** 
     * Retrieves an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public GetClusterInterfacePreferenceResult getClusterInterfacePreference(final GetClusterInterfacePreferenceRequest request);

    
    /** 
     * Retrieves an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public GetClusterInterfacePreferenceResult getClusterInterfacePreference(
        String name
        );

    

    
    /** 
     * GetClusterMasterNodeID enables you to retrieve the ID of the node that can perform cluster-wide administration tasks and holds the
     * storage virtual IP address (SVIP) and management virtual IP address (MVIP).
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterMasterNodeIDResult getClusterMasterNodeID();
    
    /** 
     * The GetClusterState API method enables you to indicate if a node is part of a cluster or not. The three states are:
     * Available: Node has not been configured with a cluster name.
     * Pending: Node is pending for a specific named cluster and can be added.
     * Active: Node is an active member of a cluster and may not be added to another
     * cluster.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(final GetClusterStateRequest request);

    
    /** 
     * The GetClusterState API method enables you to indicate if a node is part of a cluster or not. The three states are:
     * Available: Node has not been configured with a cluster name.
     * Pending: Node is pending for a specific named cluster and can be added.
     * Active: Node is an active member of a cluster and may not be added to another
     * cluster.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetClusterStateResult getClusterState(
        Boolean force
        );

    

    
    /** 
     * GetClusterStats enables you to retrieve high-level activity measurements for the cluster. Values returned are cumulative from the
     * creation of the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterStatsResult getClusterStats();
    

    
    /** 
     * You can use the GetClusterStructure method to back up the current storage cluster configuration information. If the storage cluster configuration is changed while this method is running, the contents of the configuration backup will be unpredictable. You can save this data to a text file and restore it on other clusters, or the cluster in the case of a disaster.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetClusterStructureResult getClusterStructure();
    

    
    /** 
     * GetClusterVersionInfo enables you to retrieve information about the Element software version running on each node in the cluster.
     * This method also returns information about nodes that are currently in the process of upgrading software.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterVersionInfoResult getClusterVersionInfo();
    

    
    /** 
     * NetApp engineering uses the GetCompleteStats API method to troubleshoot new features. The data returned from GetCompleteStats is not documented, changes frequently, and is not guaranteed to be accurate. NetApp does not recommend using GetCompleteStats for collecting performance data or any other
     * management integration with a SolidFire cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getCompleteStats();
    

    
    /** 
     * You can use the GetLicenseKey method to get the current license key.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLicenseKeyResult getLicenseKey();
    

    
    /** 
     * GetLimits enables you to retrieve the limit values set by the API. These values might change between releases of Element OS, but do not change without an update to the system. Knowing the limit values set by the API can be useful when writing API scripts for user-facing tools.
     * Note: The GetLimits method returns the limits for the current software version regardless of the API endpoint version used to pass the method.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetLimitsResult getLimits();
    

    
    /** 
     * GetNtpInfo enables you to return the current network time protocol (NTP) configuration information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNtpInfoResult getNtpInfo();
    

    
    /** 
     * GetProtectionDomainLayout returns all of the Protection Domain information for the cluster.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public GetProtectionDomainLayoutResult getProtectionDomainLayout();
    

    
    /** 
     * NetApp engineering uses the GetRawStats API method to troubleshoot new features. The data returned from GetRawStats is not documented, changes frequently, and is not guaranteed to be accurate. NetApp does not recommend using GetCompleteStats for collecting performance data or any other
     * management integration with a SolidFire cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public Attributes getRawStats();
    

    
    /** 
     * You can use the GetSSLCertificate method to retrieve the SSL certificate that is currently active on the cluster.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetSSLCertificateResult getSSLCertificate();
    

    
    /** 
     * You can use the GetSupportedTlsCiphers method to get a list of the supported TLS ciphers.
     **/
    @Since("11.3")
    @ConnectionType("Cluster")
    public GetSupportedTlsCiphersResult getSupportedTlsCiphers();
    

    
    /** 
     * GetSystemStatus enables you to return whether a reboot ir required or not.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetSystemStatusResult getSystemStatus();
    
    /** 
     * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request);

    
    /** 
     * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(
        Optional<Boolean> bestPractices, 
        Optional<String> faultTypes
        );

    

    
    /** 
     * Lists all the existing cluster interface preferences.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public ListClusterInterfacePreferencesResult listClusterInterfacePreferences();
    
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(final ListEventsRequest request);

    
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(
        Optional<Long> maxEvents, 
        Optional<Long> startEventID, 
        Optional<Long> endEventID, 
        Optional<Long> serviceID, 
        Optional<Long> nodeID, 
        Optional<Long> driveID, 
        Optional<String> startReportTime, 
        Optional<String> endReportTime, 
        Optional<String> startPublishTime, 
        Optional<String> endPublishTime
        );

    
    /** 
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(
        Optional<Long> maxEvents, 
        Optional<Long> startEventID, 
        Optional<Long> endEventID, 
        Optional<String> eventType, 
        Optional<Long> serviceID, 
        Optional<Long> nodeID, 
        Optional<Long> driveID, 
        Optional<String> startReportTime, 
        Optional<String> endReportTime, 
        Optional<String> startPublishTime, 
        Optional<String> endPublishTime
        );

    

    
    /** 
     * ListProtectionDomainLevels returns the Tolerance and Resiliency of the cluster from the perspective
     * of each of the supported ProtectionDomainTypes.
     **/
    @Since("11")
    @ConnectionType("Cluster")
    public ListProtectionDomainLevelsResult listProtectionDomainLevels();
    

    
    /** 
     * ListSyncJobs returns information about synchronization jobs that are running on a SolidFire cluster. The type of
     * synchronization jobs that are returned with this method are block, slice, clone, and remote.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListSyncJobsResult listSyncJobs();
    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request);

    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold, 
        Optional<Long> stage3MetadataThresholdPercent, 
        Optional<Long> maxMetadataOverProvisionFactor
        );

    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold, 
        Optional<Long> stage3BlockThresholdPercent, 
        Optional<Long> stage3MetadataThresholdPercent, 
        Optional<Long> maxMetadataOverProvisionFactor
        );

    
    /** 
     * Modifies an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference(final ModifyClusterInterfacePreferenceRequest request);

    
    /** 
     * Modifies an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference();
    
    /** 
     * Modifies an existing cluster interface preference.
     **/
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference(
        String name, 
        String value
        );

    

    
    /** 
     * You can use the RemoveSSLCertificate method to remove the user SSL certificate and private key for the cluster.
     * After the certificate and private key are removed, the cluster is configured to use the default certificate and private key.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public RemoveSSLCertificateResult removeSSLCertificate();
    

    
    /** 
     * You can use the ResetSupplementalTlsCiphers method to restore the supplemental ciphers to their defaults.
     **/
    @Since("11.3")
    @ConnectionType("Cluster")
    public ResetSupplementalTlsCiphersResult resetSupplementalTlsCiphers();
    
    /** 
     * The SetClusterConfig API method enables you to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified, see Cluster Object Attributes. To display the current cluster
     * interface settings for a node, run the GetClusterConfig API method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request);

    
    /** 
     * The SetClusterConfig API method enables you to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified, see Cluster Object Attributes. To display the current cluster
     * interface settings for a node, run the GetClusterConfig API method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetClusterConfigResult setClusterConfig(
        ClusterConfig cluster
        );

    
    /** 
     * You can use the SetClusterStructure method to restore the storage cluster configuration information from a backup. When you call the method, pass the json result returned from the GetClusterStructure API containing the configuration information you want to restore.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public SetClusterStructureResult setClusterStructure(final SetClusterStructureRequest request);

    
    /** 
     * You can use the SetClusterStructure method to restore the storage cluster configuration information from a backup. When you call the method, pass the json result returned from the GetClusterStructure API containing the configuration information you want to restore.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public SetClusterStructureResult setClusterStructure(
        Optional<Account[]> accounts, 
        Optional<VolumeQOS> defaultQoS, 
        Optional<FeatureObject[]> features, 
        Optional<Initiator[]> initiators, 
        Optional<GetNtpInfoResult> ntp, 
        Optional<QoSPolicy[]> qosPolicies, 
        Optional<LoggingServer[]> remoteHosts, 
        Optional<ScheduleObject[]> schedules, 
        Optional<GetSnmpInfoResult> snmp, 
        Optional<GetActiveTlsCiphersResult> tlsCiphers, 
        Optional<VirtualNetwork[]> virtualNetworks, 
        Optional<VolumeAccessGroupLunAssignments[]> volumeAccessGroupLunAssignments, 
        Optional<VolumeAccessGroup[]> volumeAccessGroups, 
        Optional<Volume[]> volumes, 
        Optional<StorageContainer[]> storageContainers
        );

    
    /** 
     * You can use the SetLicenseKey method to set the SerialNumber And OrderNumber for the cluster.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLicenseKeyResult setLicenseKey(final SetLicenseKeyRequest request);

    
    /** 
     * You can use the SetLicenseKey method to set the SerialNumber And OrderNumber for the cluster.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLicenseKeyResult setLicenseKey(
        String serialNumber, 
        String orderNumber
        );

    
    /** 
     * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
     * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(final SetNtpInfoRequest request);

    
    /** 
     * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
     * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(
        String[] servers, 
        Optional<Boolean> broadcastclient
        );

    
    /** 
     * Used to assign Nodes to user-defined Protection Domains. This information must be provided for all
     * Active Nodes in the cluster, and no information may be provided for Nodes that are not Active. All Nodes
     * in a given Chassis must be assigned to the same user-defined Protection Domain. The same
     * ProtectionDomainType must be supplied for all nodes. ProtectionDomainTypes that are not user-defined
     * such as Node and Chassis, must not be included. If any of these are not true, the Custom Protection
     * Domains will be ignored, and an appropriate error will be returned.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public SetProtectionDomainLayoutResult setProtectionDomainLayout(final SetProtectionDomainLayoutRequest request);

    
    /** 
     * Used to assign Nodes to user-defined Protection Domains. This information must be provided for all
     * Active Nodes in the cluster, and no information may be provided for Nodes that are not Active. All Nodes
     * in a given Chassis must be assigned to the same user-defined Protection Domain. The same
     * ProtectionDomainType must be supplied for all nodes. ProtectionDomainTypes that are not user-defined
     * such as Node and Chassis, must not be included. If any of these are not true, the Custom Protection
     * Domains will be ignored, and an appropriate error will be returned.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public SetProtectionDomainLayoutResult setProtectionDomainLayout(
        NodeProtectionDomains[] protectionDomainLayout
        );

    
    /** 
     * You can use the SetSSLCertificate method to set a user SSL certificate and a private key for the cluster.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetSSLCertificateResult setSSLCertificate(final SetSSLCertificateRequest request);

    
    /** 
     * You can use the SetSSLCertificate method to set a user SSL certificate and a private key for the cluster.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetSSLCertificateResult setSSLCertificate(
        String certificate, 
        String privateKey
        );

    
    /** 
     * You can use the SetSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers.
     **/
    @Since("11.3")
    @ConnectionType("Cluster")
    public SetSupplementalTlsCiphersResult setSupplementalTlsCiphers(final SetSupplementalTlsCiphersRequest request);

    
    /** 
     * You can use the SetSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers.
     **/
    @Since("11.3")
    @ConnectionType("Cluster")
    public SetSupplementalTlsCiphersResult setSupplementalTlsCiphers(
        String[] supplementalCiphers
        );

    
    /** 
     * You can use the TestAddressAvailability method to check to see if a certain IP address is inuse on an interface within the storage cluster.
     **/
    @Since("7.0")
    @ConnectionType("Node")
    public TestAddressAvailabilityResult testAddressAvailability(final TestAddressAvailabilityRequest request);

    
    /** 
     * You can use the TestAddressAvailability method to check to see if a certain IP address is inuse on an interface within the storage cluster.
     **/
    @Since("7.0")
    @ConnectionType("Node")
    public TestAddressAvailabilityResult testAddressAvailability(
        String iface, 
        String address, 
        Optional<Long> virtualNetworkTag, 
        Optional<Long> timeout
        );

    
    /** 
     * You can use AddClusterAdmin to add a new cluster admin account. A cluster ddmin can manage the cluster using the API and management tools. Cluster admins are completely separate and unrelated to standard tenant accounts.
     * Each cluster admin can be restricted to a subset of the API. NetApp recommends using multiple cluster admin accounts for different users and applications. You should give each cluster admin the minimal permissions necessary; this reduces the potential impact of credential compromise.
     * You must accept the End User License Agreement (EULA) by setting the acceptEula parameter to true to add a cluster administrator account to the system.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request);

    
    /** 
     * You can use AddClusterAdmin to add a new cluster admin account. A cluster ddmin can manage the cluster using the API and management tools. Cluster admins are completely separate and unrelated to standard tenant accounts.
     * Each cluster admin can be restricted to a subset of the API. NetApp recommends using multiple cluster admin accounts for different users and applications. You should give each cluster admin the minimal permissions necessary; this reduces the potential impact of credential compromise.
     * You must accept the End User License Agreement (EULA) by setting the acceptEula parameter to true to add a cluster administrator account to the system.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addClusterAdmin(
        String username, 
        String password, 
        String[] access, 
        Boolean acceptEula, 
        Optional<Attributes> attributes
        );

    
    /** 
     * Deletes an individual auth session
     * If the calling user is not in the ClusterAdmins / Administrator AccessGroup, only auth session belonging 
     * to the calling user can be deleted.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionResult deleteAuthSession(final DeleteAuthSessionRequest request);

    
    /** 
     * Deletes an individual auth session
     * If the calling user is not in the ClusterAdmins / Administrator AccessGroup, only auth session belonging 
     * to the calling user can be deleted.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionResult deleteAuthSession(
        java.util.UUID sessionID
        );

    
    /** 
     * Deletes all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be deleted.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByClusterAdmin with the same parameter.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByClusterAdmin(final DeleteAuthSessionsByClusterAdminRequest request);

    
    /** 
     * Deletes all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be deleted.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByClusterAdmin with the same parameter.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByClusterAdmin(
        Long clusterAdminID
        );

    
    /** 
     * Deletes all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator may only delete their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may delete sessions belonging to any user.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByUsername with the same parameters.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByUsername(final DeleteAuthSessionsByUsernameRequest request);

    
    /** 
     * Deletes all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator may only delete their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may delete sessions belonging to any user.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByUsername with the same parameters.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByUsername(
        Optional<String> username, 
        Optional<String> authMethod
        );

    

    
    /** 
     * GetCurrentClusterAdmin returns information about the calling ClusterAdmin.
     * If the authMethod in the return value is Ldap or Idp, then other fields in the return value may contain data aggregated from multiple LdapAdmins or IdpAdmins, respectively.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetCurrentClusterAdminResult getCurrentClusterAdmin();
    

    
    /** 
     * You can use the GetLoginBanner method to get the currently active Terms of Use banner that users see when they log on to the web interface.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetLoginBannerResult getLoginBanner();
    

    
    /** 
     * Lists all active auth sessions.
     * This is only callable by a user with Administrative access rights.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listActiveAuthSessions();
    
    /** 
     * List all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be listed.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByClusterAdmin(final ListAuthSessionsByClusterAdminRequest request);

    
    /** 
     * List all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be listed.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByClusterAdmin(
        Long clusterAdminID
        );

    
    /** 
     * Lists all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator privileges may only list their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may list sessions belonging to any user.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByUsername(final ListAuthSessionsByUsernameRequest request);

    
    /** 
     * Lists all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator privileges may only list their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may list sessions belonging to any user.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByUsername(
        Optional<String> username, 
        Optional<String> authMethod
        );

    

    
    /** 
     * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be 
     * several cluster administrator accounts with different levels of permissions.  There can be only 
     * one primary cluster administrator in the system. The primary Cluster Admin is the 
     * administrator that was created when the cluster was created.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterAdminsResult listClusterAdmins();
    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin, LDAP cluster admin, 
     * or third party Identity Provider (IdP) cluster admin.  You cannot change access for the 
     * administrator cluster admin account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request);

    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin, LDAP cluster admin, 
     * or third party Identity Provider (IdP) cluster admin.  You cannot change access for the 
     * administrator cluster admin account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(
        Long clusterAdminID, 
        Optional<String> password, 
        Optional<String[]> access, 
        Optional<Attributes> attributes
        );

    
    /** 
     * One can use this API to remove a local cluster admin, an LDAP cluster admin, or a third 
     * party Identity Provider (IdP) cluster admin.  
     * One cannot remove the administrator cluster admin account.  
     * When an IdP Admin is removed that has authenticated sessions associated with a third party 
     * Identity Provider (IdP), those sessions will either logout or possibly experience a loss of 
     * access rights within their current session.  The access rights loss will depend on whether the 
     * removed IdP cluster admin matched one of multiple IdP cluster admins from a given user's 
     * SAML Attributes and the remaining set of matching IdP cluster admins results in a reduced 
     * set of aggregate access rights.  
     * Other cluster admin user types will be logged out upon their cluster admin removal.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request);

    
    /** 
     * One can use this API to remove a local cluster admin, an LDAP cluster admin, or a third 
     * party Identity Provider (IdP) cluster admin.  
     * One cannot remove the administrator cluster admin account.  
     * When an IdP Admin is removed that has authenticated sessions associated with a third party 
     * Identity Provider (IdP), those sessions will either logout or possibly experience a loss of 
     * access rights within their current session.  The access rights loss will depend on whether the 
     * removed IdP cluster admin matched one of multiple IdP cluster admins from a given user's 
     * SAML Attributes and the remaining set of matching IdP cluster admins results in a reduced 
     * set of aggregate access rights.  
     * Other cluster admin user types will be logged out upon their cluster admin removal.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(
        Long clusterAdminID
        );

    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner(final SetLoginBannerRequest request);

    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner();
    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner(
        Optional<String> banner, 
        Optional<Boolean> enabled
        );

    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(final AddDrivesRequest request);

    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddDrivesResult addDrives(
        NewDrive[] drives
        );

    

    
    /** 
     * GetDriveConfig enables you to display drive information for expected slice and block drive counts as well as the number of slices
     * and block drives that are currently connected to the node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("2.0")
    @ConnectionType("Node")
    public GetDriveConfigResult getDriveConfig();
    
    /** 
     * GetDriveHardwareInfo returns all the hardware information for the given drive. This generally includes details about manufacturers, vendors, versions, and
     * other associated hardware identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request);

    
    /** 
     * GetDriveHardwareInfo returns all the hardware information for the given drive. This generally includes details about manufacturers, vendors, versions, and
     * other associated hardware identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(
        Long driveID
        );

    
    /** 
     * GetDriveStats returns high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the
     * cluster. Some values are specific to block drives. You might not obtain statistical data for both block and metadata drives when you
     * run this method. 
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request);

    
    /** 
     * GetDriveStats returns high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the
     * cluster. Some values are specific to block drives. You might not obtain statistical data for both block and metadata drives when you
     * run this method. 
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(
        Long driveID
        );

    
    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on individual nodes to return drive hardware
     * information or use this method on the cluster master node MVIP to see information for all the drives on all nodes.
     * Note: The "securitySupported": true line of the method response does not imply that the drives are capable of
     * encryption; only that the security status can be queried. If you have a node type with a model number ending in "-NE",
     * commands to enable security features on these drives will fail. See the EnableEncryptionAtRest method for more information.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(final ListDriveHardwareRequest request);

    
    /** 
     * ListDriveHardware returns all the drives connected to a node. Use this method on individual nodes to return drive hardware
     * information or use this method on the cluster master node MVIP to see information for all the drives on all nodes.
     * Note: The "securitySupported": true line of the method response does not imply that the drives are capable of
     * encryption; only that the security status can be queried. If you have a node type with a model number ending in "-NE",
     * commands to enable security features on these drives will fail. See the EnableEncryptionAtRest method for more information.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListDriveHardwareResult listDriveHardware(
        Boolean force
        );

    
    /** 
     * ListDriveStats enables you to retrieve high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(final ListDriveStatsRequest request);

    
    /** 
     * ListDriveStats enables you to retrieve high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(
        Optional<Long[]> drives
        );

    

    
    /** 
     * ListDrives enables you to retrieve the list of the drives that exist in the cluster's active nodes. This method returns drives that have
     * been added as volume metadata or block drives as well as drives that have not been added and are available.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDrivesResult listDrives();
    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(final RemoveDrivesRequest request);

    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult removeDrives(
        Long[] drives
        );

    
    /** 
     * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
     * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
     **/
    @Since("6.0")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(final ResetDrivesRequest request);

    
    /** 
     * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
     * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
     **/
    @Since("6.0")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(
        String drives, 
        Boolean force
        );

    
    /** 
     * SecureEraseDrives enables you to remove any residual data from drives that have a status of "available." You might want to use this method when replacing a drive nearing the end of its service life that contained sensitive data. This method uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. This asynchronous method might take up to two minutes to complete. You can use GetAsyncResult to check on the status of the secure erase operation.
     * You can use the ListDrives method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request);

    
    /** 
     * SecureEraseDrives enables you to remove any residual data from drives that have a status of "available." You might want to use this method when replacing a drive nearing the end of its service life that contained sensitive data. This method uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. This asynchronous method might take up to two minutes to complete. You can use GetAsyncResult to check on the status of the secure erase operation.
     * You can use the ListDrives method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(
        Long[] drives
        );

    
    /** 
     * You can use the TestDrives API method to run a hardware validation on all drives on the node. This method detects hardware
     * failures on the drives (if present) and reports them in the results of the validation tests.
     * You can only use the TestDrives method on nodes that are not "active" in a cluster.
     * Note: This test takes approximately 10 minutes.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(final TestDrivesRequest request);

    
    /** 
     * You can use the TestDrives API method to run a hardware validation on all drives on the node. This method detects hardware
     * failures on the drives (if present) and reports them in the results of the validation tests.
     * You can only use the TestDrives method on nodes that are not "active" in a cluster.
     * Note: This test takes approximately 10 minutes.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestDrivesResult testDrives(
        Optional<Long> minutes, 
        Optional<Boolean> force
        );

    

    
    /** 
     * DisableBmcColdReset disables the background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Since("9.4")
    @ConnectionType("Cluster")
    public DisableBmcColdResetResult disableBmcColdReset();
    
    /** 
     * EnableBmcColdReset enables a background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Since("9.4")
    @ConnectionType("Cluster")
    public EnableBmcColdResetResult enableBmcColdReset(final EnableBmcColdResetRequest request);

    
    /** 
     * EnableBmcColdReset enables a background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Since("9.4")
    @ConnectionType("Cluster")
    public EnableBmcColdResetResult enableBmcColdReset(
        Optional<Long> timeout
        );

    
    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI
     * nodes and drives in the cluster. This generally includes details about manufacturers, vendors, versions, and other associated hardware
     * identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(final GetClusterHardwareInfoRequest request);

    
    /** 
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI
     * nodes and drives in the cluster. This generally includes details about manufacturers, vendors, versions, and other associated hardware
     * identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(
        Optional<String> type
        );

    

    
    /** 
     * GetHardwareConfig enables you to display the hardware configuration information for a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetHardwareConfigResult getHardwareConfig();
    

    
    /** 
     * The GetHardwareInfo API method enables you to return hardware information and status for a single node. This generally includes details about manufacturers, vendors, versions, drives, and other associated hardware identification information.
     **/
    @Since("9.0")
    @ConnectionType("Node")
    public GetHardwareInfoResult getHardwareInfo();
    
    /** 
     * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
     * manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(final GetNodeHardwareInfoRequest request);

    
    /** 
     * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
     * manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(
        Long nodeID
        );

    
    /** 
     * GetNvramInfo enables you to retrieve information from each node about the NVRAM card.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo(final GetNvramInfoRequest request);

    
    /** 
     * GetNvramInfo enables you to retrieve information from each node about the NVRAM card.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo(
        Optional<Boolean> force
        );

    
    /** 
     * Adds a cluster administrator user authenticated by a third party Identity Provider (IdP).  
     * IdP cluster admin accounts are configured based on SAML attribute-value information provided 
     * within the IdP's SAML assertion associated with the user.  If a user successfully 
     * authenticates with the IdP and has SAML attribute statements within the SAML assertion 
     * matching multiple IdP cluster admin accounts, the user will have the combined access level 
     * of those matching IdP cluster admin accounts.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addIdpClusterAdmin(final AddIdpClusterAdminRequest request);

    
    /** 
     * Adds a cluster administrator user authenticated by a third party Identity Provider (IdP).  
     * IdP cluster admin accounts are configured based on SAML attribute-value information provided 
     * within the IdP's SAML assertion associated with the user.  If a user successfully 
     * authenticates with the IdP and has SAML attribute statements within the SAML assertion 
     * matching multiple IdP cluster admin accounts, the user will have the combined access level 
     * of those matching IdP cluster admin accounts.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addIdpClusterAdmin(
        String username, 
        String[] access, 
        Boolean acceptEula, 
        Optional<Attributes> attributes
        );

    
    /** 
     * Create a potential trust relationship for authentication using a third party Identity Provider (IdP) for the cluster.  
     * A SAML Service Provider certificate is required for IdP communication, which will be generated as necessary.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public CreateIdpConfigurationResult createIdpConfiguration(final CreateIdpConfigurationRequest request);

    
    /** 
     * Create a potential trust relationship for authentication using a third party Identity Provider (IdP) for the cluster.  
     * A SAML Service Provider certificate is required for IdP communication, which will be generated as necessary.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public CreateIdpConfigurationResult createIdpConfiguration(
        String idpName, 
        String idpMetadata
        );

    
    /** 
     * Delete an existing configuration with a third party Identity Provider (IdP) for the cluster.
     * Deleting the last IdP Configuration will remove the SAML Service Provider certificate from the cluster.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteIdpConfigurationResult deleteIdpConfiguration(final DeleteIdpConfigurationRequest request);

    
    /** 
     * Delete an existing configuration with a third party Identity Provider (IdP) for the cluster.
     * Deleting the last IdP Configuration will remove the SAML Service Provider certificate from the cluster.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteIdpConfigurationResult deleteIdpConfiguration(
        Optional<java.util.UUID> idpConfigurationID, 
        Optional<String> idpName
        );

    

    
    /** 
     * Disable support for authentication using third party Identity Providers (IdP) for the cluster.
     * Once disabled, users authenticated by third party IdPs will no longer be able to access the cluster and any active authenticated sessions will be invalidated/logged out.
     * Ldap and cluster admins will be able to access the cluster via supported UIs.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public DisableIdpAuthenticationResult disableIdpAuthentication();
    
    /** 
     * Enable support for authentication using a third party Identity Provider (IdP) for the cluster.
     * Once IdP authentication is enabled, cluster and Ldap admins will no longer be able to access the cluster via supported UIs and any active authenticated sessions will be invalidated/logged out.
     * Only third party IdP authenticated users will be able to access the cluster via the supported UIs.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public EnableIdpAuthenticationResult enableIdpAuthentication(final EnableIdpAuthenticationRequest request);

    
    /** 
     * Enable support for authentication using a third party Identity Provider (IdP) for the cluster.
     * Once IdP authentication is enabled, cluster and Ldap admins will no longer be able to access the cluster via supported UIs and any active authenticated sessions will be invalidated/logged out.
     * Only third party IdP authenticated users will be able to access the cluster via the supported UIs.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public EnableIdpAuthenticationResult enableIdpAuthentication(
        Optional<java.util.UUID> idpConfigurationID
        );

    

    
    /** 
     * Return information regarding the state of authentication using third party Identity Providers
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public GetIdpAuthenticationStateResult getIdpAuthenticationState();
    
    /** 
     * List configurations for third party Identity Provider(s) (IdP), optionally providing either enabledOnly flag to retrieve the currently enabled IdP configuration, or an IdP metadata UUID or IdP name to query a specific IdP configuration information.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListIdpConfigurationsResult listIdpConfigurations(final ListIdpConfigurationsRequest request);

    
    /** 
     * List configurations for third party Identity Provider(s) (IdP), optionally providing either enabledOnly flag to retrieve the currently enabled IdP configuration, or an IdP metadata UUID or IdP name to query a specific IdP configuration information.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListIdpConfigurationsResult listIdpConfigurations(
        Optional<java.util.UUID> idpConfigurationID, 
        Optional<String> idpName, 
        Optional<Boolean> enabledOnly
        );

    
    /** 
     * Update an existing configuration with a third party Identity Provider (IdP) for the cluster.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public UpdateIdpConfigurationResult updateIdpConfiguration(final UpdateIdpConfigurationRequest request);

    
    /** 
     * Update an existing configuration with a third party Identity Provider (IdP) for the cluster.
     **/
    @Since("12.0")
    @ConnectionType("Cluster")
    public UpdateIdpConfigurationResult updateIdpConfiguration(
        Optional<java.util.UUID> idpConfigurationID, 
        Optional<String> idpName, 
        Optional<String> newIdpName, 
        Optional<String> idpMetadata, 
        Optional<Boolean> generateNewCertificate
        );

    
    /** 
     * AddInitiatorsToVolumeAccessGroup enables you
     * to add initiators to a specified volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request);

    
    /** 
     * AddInitiatorsToVolumeAccessGroup enables you
     * to add initiators to a specified volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(
        Long volumeAccessGroupID, 
        String[] initiators
        );

    
    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
     * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
     * any initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(final CreateInitiatorsRequest request);

    
    /** 
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
     * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
     * any initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(
        CreateInitiator[] initiators
        );

    
    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access
     * groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any
     * initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteInitiatorsResult deleteInitiators(final DeleteInitiatorsRequest request);

    
    /** 
     * DeleteInitiators enables you to delete one or more initiators from the system (and from any associated volumes or volume access
     * groups).
     * If DeleteInitiators fails to delete one of the initiators provided in the parameter, the system returns an error and does not delete any
     * initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteInitiatorsResult deleteInitiators(
        Long[] initiators
        );

    
    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(final ListInitiatorsRequest request);

    
    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(
        Optional<Long> startInitiatorID, 
        Optional<Long> limit, 
        Optional<Long[]> initiators
        );

    
    /** 
     * ModifyInitiators enables you to change the attributes of one or more existing initiators. You cannot change the name of an existing
     * initiator. If you need to change the name of an initiator, delete it first with DeleteInitiators and create a new one with
     * CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not modify
     * any initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(final ModifyInitiatorsRequest request);

    
    /** 
     * ModifyInitiators enables you to change the attributes of one or more existing initiators. You cannot change the name of an existing
     * initiator. If you need to change the name of an initiator, delete it first with DeleteInitiators and create a new one with
     * CreateInitiators.
     * If ModifyInitiators fails to change one of the initiators provided in the parameter, the method returns an error and does not modify
     * any initiators (no partial completion is possible).
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyInitiatorsResult modifyInitiators(
        ModifyInitiator[] initiators
        );

    
    /** 
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request);

    
    /** 
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(
        Long volumeAccessGroupID, 
        String[] initiators
        );

    
    /** 
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(
        Long volumeAccessGroupID, 
        String[] initiators, 
        Optional<Boolean> deleteOrphanInitiators
        );

    
    /** 
     * AddLdapClusterAdmin enables you to add a new LDAP cluster administrator user. An LDAP cluster administrator can manage the
     * cluster via the API and management tools. LDAP cluster admin accounts are completely separate and unrelated to standard tenant
     * accounts.
     * You can also use this method to add an LDAP group that has been defined in Active Directory. The access level that is given to the group is passed to the individual users in the LDAP group.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(final AddLdapClusterAdminRequest request);

    
    /** 
     * AddLdapClusterAdmin enables you to add a new LDAP cluster administrator user. An LDAP cluster administrator can manage the
     * cluster via the API and management tools. LDAP cluster admin accounts are completely separate and unrelated to standard tenant
     * accounts.
     * You can also use this method to add an LDAP group that has been defined in Active Directory. The access level that is given to the group is passed to the individual users in the LDAP group.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public AddLdapClusterAdminResult addLdapClusterAdmin(
        String username, 
        String[] access, 
        Optional<Boolean> acceptEula, 
        Optional<Attributes> attributes
        );

    

    
    /** 
     * The DisableLdapAuthentication method enables you to disable LDAP authentication and remove all LDAP configuration settings. This method does not remove any configured cluster admin accounts (user or group). However, those cluster admin accounts will no longer be able to log in.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public DisableLdapAuthenticationResult disableLdapAuthentication();
    
    /** 
     * The EnableLdapAuthentication method enables you to configure an LDAP directory connection to use for LDAP authentication to a cluster. Users that are members of the LDAP directory can then log in to the storage system using their LDAP credentials.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public EnableLdapAuthenticationResult enableLdapAuthentication(final EnableLdapAuthenticationRequest request);

    
    /** 
     * The EnableLdapAuthentication method enables you to configure an LDAP directory connection to use for LDAP authentication to a cluster. Users that are members of the LDAP directory can then log in to the storage system using their LDAP credentials.
     **/
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
        );

    

    
    /** 
     * The GetLdapConfiguration method enables you to get the currently active LDAP configuration on the cluster.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLdapConfigurationResult getLdapConfiguration();
    
    /** 
     * The TestLdapAuthentication method enables you to validate the currently enabled LDAP authentication settings. If the configuration is
     * correct, the API call returns the group membership of the tested user.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(final TestLdapAuthenticationRequest request);

    
    /** 
     * The TestLdapAuthentication method enables you to validate the currently enabled LDAP authentication settings. If the configuration is
     * correct, the API call returns the group membership of the tested user.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(
        String username, 
        String password, 
        Optional<LdapConfiguration> ldapConfiguration
        );

    

    
    /** 
     * GetLldpConfig returns the current LLDP configuration for this node.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult getLldpConfig();
    
    /** 
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig(final SetLldpConfigRequest request);

    
    /** 
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig();
    
    /** 
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig(
        LldpConfig lldpConfig
        );

    

    
    /** 
     * GetLoginSessionInfo enables you to return the period of time a log in authentication session is valid for both log in shells and the TUI.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLoginSessionInfoResult getLoginSessionInfo();
    

    
    /** 
     * GetRemoteLoggingHosts enables you to retrieve the current list of log servers.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetRemoteLoggingHostsResult getRemoteLoggingHosts();
    
    /** 
     * You can use SetLoginSessionInfo to set the period of time that a session's login authentication is valid. After the log in period elapses without activity on the system, the authentication expires. New login credentials are required for continued access to the cluster after the timeout period has elapsed.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(final SetLoginSessionInfoRequest request);

    
    /** 
     * You can use SetLoginSessionInfo to set the period of time that a session's login authentication is valid. After the log in period elapses without activity on the system, the authentication expires. New login credentials are required for continued access to the cluster after the timeout period has elapsed.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(
        Optional<String> timeout
        );

    
    /** 
     * SetRemoteLoggingHosts enables you to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use GetRemoteLoggingHosts to determine what the current logging hosts are, and then use SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(final SetRemoteLoggingHostsRequest request);

    
    /** 
     * SetRemoteLoggingHosts enables you to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use GetRemoteLoggingHosts to determine what the current logging hosts are, and then use SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetRemoteLoggingHostsResult setRemoteLoggingHosts(
        LoggingServer[] remoteHosts
        );

    

    
    /** 
     * ListFibreChannelPortInfo enables you to retrieve information about the Fibre Channel ports on a node.  The API method is intended for use on individual nodes; userid and password authentication is required for access to individual Fibre Channel nodes.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListFibreChannelPortInfoResult listFibreChannelPortInfo();
    

    
    /** 
     * ListFibreChannelSessions enables you to retrieve information about the active Fibre Channel sessions on a cluster. 
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListFibreChannelSessionsResult listFibreChannelSessions();
    

    
    /** 
     * You can use ListISCSISessions to return iSCSI session information for the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListISCSISessionsResult listISCSISessions();
    

    
    /** 
     * ListNetworkInterfaces enables you to retrieve information about each network interface on a node. The API method is intended for use on individual nodes; userid and password authentication is required for access to individual nodes.
     **/
    @Since("7.0")
    @ConnectionType("Node")
    public ListNetworkInterfacesResult listNetworkInterfaces();
    

    
    /** 
     * The ListNodeFibreChannelPortInfo API method enables you to retrieve information about the Fibre Channel ports on a node. The API method is intended for use on individual nodes; userid and password authentication is required for access to individual Fibre Channel nodes.
     **/
    @Since("7.0")
    @ConnectionType("Node")
    public ListNodeFibreChannelPortInfoResult listNodeFibreChannelPortInfo();
    

    
    /** 
     * List statistics for network statistics such as dropped packets and various types of errors.
     **/
    @Since("12.3")
    @ConnectionType("Node")
    public ListNetworkInterfaceStatsResult listNetworkInterfaceStats();
    
    /** 
     * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
     * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(final AddNodesRequest request);

    
    /** 
     * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
     * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(
        Long[] pendingNodes, 
        Optional<Boolean> autoInstall
        );

    
    /** 
     * CheckProposedCluster validates that creating a cluster from a given set of nodes is likely to succeed.  Any problems with the proposed cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public CheckProposedResult checkProposedCluster(final CheckProposedClusterRequest request);

    
    /** 
     * CheckProposedCluster validates that creating a cluster from a given set of nodes is likely to succeed.  Any problems with the proposed cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public CheckProposedResult checkProposedCluster(
        String[] nodes
        );

    
    /** 
     * ControlPower can be used to reboot or halt a node.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public ControlPowerResult controlPower(final ControlPowerRequest request);

    
    /** 
     * ControlPower can be used to reboot or halt a node.
     **/
    @Since("11.0")
    @ConnectionType("Node")
    public ControlPowerResult controlPower(
        String action, 
        Optional<String> wakeupDelay, 
        Boolean force
        );

    

    
    /** 
     * GetBootstrapConfig returns cluster and node information from the bootstrap configuration file. Use this API method on an individual node before it has been joined with a cluster. You can use the information this method returns in the cluster configuration interface when you create a cluster.
     * If a cluster has already been created, this can be used to obtain the MVIP and SVIP addresses of the cluster.
     **/
    @Since("2.0")
    @ConnectionType("Both")
    public GetBootstrapConfigResult getBootstrapConfig();
    

    
    /** 
     * The GetConfig API method enables you to retrieve all configuration information for a node. This method includes the same information available in both the GetClusterConfig and GetNetworkConfig API methods.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetConfigResult getConfig();
    

    
    /** 
     * The GetNetworkConfig API method enables you to display the network configuration information for a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetNetworkConfigResult getNetworkConfig();
    

    
    /** 
     * You can use the GetNodeActiveTlsCiphers method to get a list of the TLS ciphers that are currently accepted on this node.
     * You can use this method on both management and storage nodes.
     **/
    @Since("11.3")
    @ConnectionType("Node")
    public GetNodeActiveTlsCiphersResult getNodeActiveTlsCiphers();
    

    
    /** 
     * The GetNodeFipsDrivesReport reports the FipsDrives capability of a node. This is a per-node API.
     **/
    @Since("11.5")
    @ConnectionType("Node")
    public GetNodeFipsDrivesReportResult getNodeFipsDrivesReport();
    

    
    /** 
     * You can use the GetNodeSSLCertificate method to retrieve the SSL certificate that is currently active on the cluster.
     * You can use this method on both management and storage nodes.
     **/
    @Since("10.0")
    @ConnectionType("Node")
    public GetNodeSSLCertificateResult getNodeSSLCertificate();
    
    /** 
     * GetNodeStats enables you to retrieve the high-level activity measurements for a single node.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(final GetNodeStatsRequest request);

    
    /** 
     * GetNodeStats enables you to retrieve the high-level activity measurements for a single node.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(
        Long nodeID
        );

    

    
    /** 
     * You can use the GetSupportedTlsCiphers method to get a list of the supported TLS ciphers on this node.
     * You can use this method on both management and storage nodes.
     **/
    @Since("12.0")
    @ConnectionType("Node")
    public GetNodeSupportedTlsCiphersResult getNodeSupportedTlsCiphers();
    

    
    /** 
     * GetOrigin enables you to retrieve the origination certificate for where the node was built. This method might return null if there is no origination certification.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetOriginResult getOrigin();
    
    /** 
     * GetPatchInfo enables you to display the details of D-patch information for the given node.
     **/
    @Since("12.3")
    @ConnectionType("Node")
    public GetPatchInfoResult getPatchInfo(final GetPatchInfoRequest request);

    
    /** 
     * GetPatchInfo enables you to display the details of D-patch information for the given node.
     **/
    @Since("12.3")
    @ConnectionType("Node")
    public GetPatchInfoResult getPatchInfo();
    
    /** 
     * GetPatchInfo enables you to display the details of D-patch information for the given node.
     **/
    @Since("12.3")
    @ConnectionType("Node")
    public GetPatchInfoResult getPatchInfo(
        Optional<Boolean> force
        );

    

    
    /** 
     * You can use GetPendingOperation to detect an operation on a node that is currently in progress. You can also use this method to report back when an operation has completed. 
     * Note: method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public GetPendingOperationResult getPendingOperation();
    

    
    /** 
     * ListActiveNodes returns the list of currently active nodes that are in the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveNodesResult listActiveNodes();
    

    
    /** 
     * ListAllNodes enables you to retrieve a list of active and pending nodes in the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAllNodesResult listAllNodes();
    

    
    /** 
     * ListNodeStats enables you to view the high-level activity measurements for all nodes in a cluster.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListNodeStatsResult listNodeStats();
    

    
    /** 
     * ListPendingActiveNodes returns the list of nodes in the cluster that are currently in the PendingActive state, between the pending and active states. These are nodes that are currently being returned to the factory image.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListPendingActiveNodesResult listPendingActiveNodes();
    

    
    /** 
     * ListPendingNodes returns a list of the currently pending nodes in the system. Pending nodes are nodes that are running and configured to join the cluster, but have not yet been added via the AddNodes API method.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListPendingNodesResult listPendingNodes();
    

    
    /** 
     * You can use the RemoveNodeSSLCertificate method to remove the user SSL certificate and private key for the management node.
     * After the certificate and private key are removed, the management node is configured to use the default certificate and private key..
     **/
    @Since("10.0")
    @ConnectionType("Node")
    public RemoveNodeSSLCertificateResult removeNodeSSLCertificate();
    
    /** 
     * RemoveNodes can be used to remove one or more nodes from the cluster. Before removing a node, you must remove all drives from the node using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated off of the node's drives.
     * After removing a node, the removed node registers itself as a pending node. You can add the pending node again or shut it down (shutting the node down removes it from the Pending Node list).
     * 
     * RemoveNodes can fail with xEnsembleInvalidSize if removing the nodes would violate ensemble size restrictions.
     * RemoveNodes can fail with xEnsembleQuorumLoss if removing the nodes would cause a loss of quorum.
     * RemoveNodes can fail with xEnsembleToleranceChange if there are enabled data protection schemes that can tolerate multiple node failures and removing the nodes would decrease the ensemble's node failure tolerance. The optional ignoreEnsembleToleranceChange parameter can be set true to disable the ensemble tolerance check.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request);

    
    /** 
     * RemoveNodes can be used to remove one or more nodes from the cluster. Before removing a node, you must remove all drives from the node using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated off of the node's drives.
     * After removing a node, the removed node registers itself as a pending node. You can add the pending node again or shut it down (shutting the node down removes it from the Pending Node list).
     * 
     * RemoveNodes can fail with xEnsembleInvalidSize if removing the nodes would violate ensemble size restrictions.
     * RemoveNodes can fail with xEnsembleQuorumLoss if removing the nodes would cause a loss of quorum.
     * RemoveNodes can fail with xEnsembleToleranceChange if there are enabled data protection schemes that can tolerate multiple node failures and removing the nodes would decrease the ensemble's node failure tolerance. The optional ignoreEnsembleToleranceChange parameter can be set true to disable the ensemble tolerance check.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(
        Long[] nodes, 
        Optional<Boolean> ignoreEnsembleToleranceChange
        );

    

    
    /** 
     * You can use the ResetNodeSupplementalTlsCiphers method to restore the supplemental ciphers to their defaults.
     * You can use this command on management nodes.
     **/
    @Since("11.3")
    @ConnectionType("Node")
    public ResetNodeSupplementalTlsCiphersResult resetNodeSupplementalTlsCiphers();
    
    /** 
     * The SetConfig API method enables you to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Caution: Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetConfigResult setConfig(final SetConfigRequest request);

    
    /** 
     * The SetConfig API method enables you to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Caution: Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetConfigResult setConfig(
        ConfigParams config
        );

    
    /** 
     * The SetNetworkConfig API method enables you to set the network configuration for a node. To display the current network settings for a node, run the GetNetworkConfig API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request);

    
    /** 
     * The SetNetworkConfig API method enables you to set the network configuration for a node. To display the current network settings for a node, run the GetNetworkConfig API method. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     * Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public SetNetworkConfigResult setNetworkConfig(
        NetworkParams network
        );

    
    /** 
     * You can use the SetNodeSSLCertificate method to set a user SSL certificate and private key for the management node.
     **/
    @Since("10.0")
    @ConnectionType("Node")
    public SetNodeSSLCertificateResult setNodeSSLCertificate(final SetNodeSSLCertificateRequest request);

    
    /** 
     * You can use the SetNodeSSLCertificate method to set a user SSL certificate and private key for the management node.
     **/
    @Since("10.0")
    @ConnectionType("Node")
    public SetNodeSSLCertificateResult setNodeSSLCertificate(
        String certificate, 
        String privateKey
        );

    
    /** 
     * You can use the SetNodeSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers for this node.
     * You can use this command on management nodes.
     **/
    @Since("11.3")
    @ConnectionType("Node")
    public SetNodeSupplementalTlsCiphersResult setNodeSupplementalTlsCiphers(final SetNodeSupplementalTlsCiphersRequest request);

    
    /** 
     * You can use the SetNodeSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers for this node.
     * You can use this command on management nodes.
     **/
    @Since("11.3")
    @ConnectionType("Node")
    public SetNodeSupplementalTlsCiphersResult setNodeSupplementalTlsCiphers(
        String[] supplementalCiphers
        );

    
    /** 
     * You can use the CompleteClusterPairing method with the encoded key received from the  StartClusterPairing method to complete the cluster pairing process. The CompleteClusterPairing method is the second step in the cluster pairing process. 
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request);

    
    /** 
     * You can use the CompleteClusterPairing method with the encoded key received from the  StartClusterPairing method to complete the cluster pairing process. The CompleteClusterPairing method is the second step in the cluster pairing process. 
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(
        String clusterPairingKey
        );

    
    /** 
     * You can use the CompleteVolumePairing method to complete the pairing of two volumes.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(final CompleteVolumePairingRequest request);

    
    /** 
     * You can use the CompleteVolumePairing method to complete the pairing of two volumes.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteVolumePairingResult completeVolumePairing(
        String volumePairingKey, 
        Long volumeID
        );

    
    /** 
     * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes(final ListActivePairedVolumesRequest request);

    
    /** 
     * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes(
        Optional<Long> startVolumeID, 
        Optional<Long> limit
        );

    

    
    /** 
     * You can use the ListClusterPairs method to list all the clusters that a cluster is paired with. This method returns information about active and pending cluster pairings, such as statistics about the current pairing as well as the connectivity and latency (in milliseconds) of the cluster pairing.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListClusterPairsResult listClusterPairs();
    
    /** 
     * ModifyVolumePair enables you to pause or restart replication between a pair of volumes.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(final ModifyVolumePairRequest request);

    
    /** 
     * ModifyVolumePair enables you to pause or restart replication between a pair of volumes.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyVolumePairResult modifyVolumePair(
        Long volumeID, 
        Optional<Boolean> pausedManual, 
        Optional<String> mode, 
        Optional<Long> pauseLimit
        );

    
    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.
     * Note: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request);

    
    /** 
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.
     * Note: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(
        Long clusterPairID
        );

    
    /** 
     * RemoveVolumePair enables you to remove the remote pairing between two volumes. Use this method on both the source and target volumes that are paired together. When you remove the volume pairing information, data is no longer replicated to or from the volume.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(final RemoveVolumePairRequest request);

    
    /** 
     * RemoveVolumePair enables you to remove the remote pairing between two volumes. Use this method on both the source and target volumes that are paired together. When you remove the volume pairing information, data is no longer replicated to or from the volume.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(
        Long volumeID
        );

    

    
    /** 
     * You can use the StartClusterPairing method to create an encoded key from a cluster that is used to pair with another cluster. The key created from this API method is used in the CompleteClusterPairing API method to establish a cluster pairing. You can pair a cluster with a maximum of four other clusters. 
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartClusterPairingResult startClusterPairing();
    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(final StartVolumePairingRequest request);

    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(
        Long volumeID
        );

    
    /** 
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(
        Long volumeID, 
        Optional<String> mode
        );

    
    /** 
     * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
     * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
     * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
     * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
     * cluster, or in a "Pending" state.
     * Caution: This method clears any data that is on the node. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public ResetNodeResult resetNode(final ResetNodeRequest request);

    
    /** 
     * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
     * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
     * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
     * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
     * cluster, or in a "Pending" state.
     * Caution: This method clears any data that is on the node. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public ResetNodeResult resetNode(
        String build, 
        Boolean force
        );

    
    /** 
     * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
     * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
     * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
     * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
     * cluster, or in a "Pending" state.
     * Caution: This method clears any data that is on the node. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public ResetNodeResult resetNode(
        String build, 
        Boolean force, 
        Optional<Boolean> reboot, 
        Optional<String> options
        );

    
    /** 
     * The RestartNetworking API method enables you to restart the networking services on a node.
     * Warning: This method restarts all networking services on a node, causing temporary loss of networking connectivity.
     * Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartNetworking(final RestartNetworkingRequest request);

    
    /** 
     * The RestartNetworking API method enables you to restart the networking services on a node.
     * Warning: This method restarts all networking services on a node, causing temporary loss of networking connectivity.
     * Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartNetworking(
        Boolean force
        );

    
    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method,
     * log in to the MIP for the pending node, and enter the "shutdown" method with either the "restart" or "halt" options.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(final ShutdownRequest request);

    
    /** 
     * The Shutdown API method enables you to restart or shutdown a node that has not yet been added to a cluster. To use this method,
     * log in to the MIP for the pending node, and enter the "shutdown" method with either the "restart" or "halt" options.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ShutdownResult shutdown(
        Long[] nodes, 
        Optional<String> option
        );

    
    /** 
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Since("1.0")
    @ConnectionType("Both")
    public Attributes invokeSFApi(final InvokeSFApiRequest request);

    
    /** 
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Since("1.0")
    @ConnectionType("Both")
    public Attributes invokeSFApi(
        String method, 
        Optional<Object> parameters
        );

    

    
    /** 
     * Disables SSH on all nodes in the cluster.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public DisableClusterSshResult disableClusterSsh();
    

    
    /** 
     * Disables SSH on the targeted node.
     * This does not effect the cluster-wide SSH timeout duration.
     * The node is not exempt from the SSH shut off by the global timeout.
     **/
    @Since("10.3")
    @ConnectionType("Node")
    public DisableSshResult disableSsh();
    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh(final EnableClusterSshRequest request);

    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh();
    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh(
        String duration
        );

    

    
    /** 
     * Enables SSH on the targeted node.
     * This does not effect the cluster-wide SSH timeout duration.
     * The node is not exempt from the SSH shut off by the global timeout.
     **/
    @Since("10.3")
    @ConnectionType("Node")
    public EnableSshResult enableSsh();
    

    
    /** 
     * Returns SSH status for the cluster.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetClusterSshInfoResult getClusterSshInfo();
    

    
    /** 
     * Returns SSH status for the targeted node.
     **/
    @Since("10.3")
    @ConnectionType("Node")
    public GetSshInfoResult getSshInfo();
    
    /** 
     * CreateSchedule enables you to schedule an automatic snapshot of a volume at a defined interval.
     * You can use the created snapshot later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for
     * the point in time in which the snapshot was created.
     * If you schedule a snapshot to run at a time period that is not divisible by 5 minutes, the snapshot runs at the next time period
     * that is divisible by 5 minutes. For example, if you schedule a snapshot to run at 12:42:00 UTC, it runs at 12:45:00 UTC.
     * Note: You can create snapshots if cluster fullness is at stage 1, 2 or 3. You cannot create snapshots after cluster fullness reaches stage 4 or 5.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(final CreateScheduleRequest request);

    
    /** 
     * CreateSchedule enables you to schedule an automatic snapshot of a volume at a defined interval.
     * You can use the created snapshot later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for
     * the point in time in which the snapshot was created.
     * If you schedule a snapshot to run at a time period that is not divisible by 5 minutes, the snapshot runs at the next time period
     * that is divisible by 5 minutes. For example, if you schedule a snapshot to run at 12:42:00 UTC, it runs at 12:45:00 UTC.
     * Note: You can create snapshots if cluster fullness is at stage 1, 2 or 3. You cannot create snapshots after cluster fullness reaches stage 4 or 5.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public CreateScheduleResult createSchedule(
        Schedule schedule
        );

    
    /** 
     * You can use the GetSchedule method to retrieve information about a scheduled snapshot. You can see information about a specific
     * schedule if there are many snapshot schedules in the system. You also retrieve information about more than one schedule with this
     * method by specifying additional scheduleIDs in the parameter.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(final GetScheduleRequest request);

    
    /** 
     * You can use the GetSchedule method to retrieve information about a scheduled snapshot. You can see information about a specific
     * schedule if there are many snapshot schedules in the system. You also retrieve information about more than one schedule with this
     * method by specifying additional scheduleIDs in the parameter.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(
        Long scheduleID
        );

    

    
    /** 
     * ListSchedule enables you to retrieve information about all scheduled snapshots that have been created.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListSchedulesResult listSchedules();
    
    /** 
     * ModifySchedule enables you to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(final ModifyScheduleRequest request);

    
    /** 
     * ModifySchedule enables you to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(
        Schedule schedule
        );

    
    /** 
     * Adds (assigns) the specified KMIP (Key Management Interoperability Protocol) Key Server to the specified Key Provider.  This will result in contacting the server to verify it's functional, as well as to synchronize keys in the event that there are multiple key servers assigned to the provider.  This synchronization may result in conflicts which could cause this to fail.  If the specified KMIP Key Server is already assigned to the specified Key Provider, this is a no-op and no error will be returned.  The assignment can be removed (unassigned) using RemoveKeyServerFromProviderKmip.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public AddKeyServerToProviderKmipResult addKeyServerToProviderKmip(final AddKeyServerToProviderKmipRequest request);

    
    /** 
     * Adds (assigns) the specified KMIP (Key Management Interoperability Protocol) Key Server to the specified Key Provider.  This will result in contacting the server to verify it's functional, as well as to synchronize keys in the event that there are multiple key servers assigned to the provider.  This synchronization may result in conflicts which could cause this to fail.  If the specified KMIP Key Server is already assigned to the specified Key Provider, this is a no-op and no error will be returned.  The assignment can be removed (unassigned) using RemoveKeyServerFromProviderKmip.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public AddKeyServerToProviderKmipResult addKeyServerToProviderKmip(
        Long keyProviderID, 
        Long keyServerID
        );

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Provider with the specified name.  A Key Provider defines a mechanism and location to retrieve authentication keys.  A KMIP Key Provider represents a collection of one or more KMIP Key Servers.  A newly created KMIP Key Provider will not have any KMIP Key Servers assigned to it.  To create a KMIP Key Server see CreateKeyServerKmip and to assign it to a provider created via this method see AddKeyServerToProviderKmip.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreateKeyProviderKmipResult createKeyProviderKmip(final CreateKeyProviderKmipRequest request);

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Provider with the specified name.  A Key Provider defines a mechanism and location to retrieve authentication keys.  A KMIP Key Provider represents a collection of one or more KMIP Key Servers.  A newly created KMIP Key Provider will not have any KMIP Key Servers assigned to it.  To create a KMIP Key Server see CreateKeyServerKmip and to assign it to a provider created via this method see AddKeyServerToProviderKmip.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreateKeyProviderKmipResult createKeyProviderKmip(
        String keyProviderName
        );

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Server with the specified attributes. The server will not be contacted as part of this operation so it need not exist or be configured prior.
     * For clustered Key Server configurations, the hostnames or IP Addresses, of all server nodes, must be provided in the kmipKeyServerHostnames parameter.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateKeyServerKmipResult createKeyServerKmip(final CreateKeyServerKmipRequest request);

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Server with the specified attributes. The server will not be contacted as part of this operation so it need not exist or be configured prior.
     * For clustered Key Server configurations, the hostnames or IP Addresses, of all server nodes, must be provided in the kmipKeyServerHostnames parameter.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateKeyServerKmipResult createKeyServerKmip(
        String kmipCaCertificate, 
        String kmipClientCertificate, 
        String[] kmipKeyServerHostnames, 
        String kmipKeyServerName, 
        Optional<Long> kmipKeyServerPort
        );

    
    /** 
     * Creates SSL public and private keys. These keys can be used to generate Certificate Sign Requests.
     * There can be only one key pair in use for the cluster. To replace the existing keys, make sure that they are not being used by any providers before invoking this API.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreatePublicPrivateKeyPairResult createPublicPrivateKeyPair(final CreatePublicPrivateKeyPairRequest request);

    
    /** 
     * Creates SSL public and private keys. These keys can be used to generate Certificate Sign Requests.
     * There can be only one key pair in use for the cluster. To replace the existing keys, make sure that they are not being used by any providers before invoking this API.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreatePublicPrivateKeyPairResult createPublicPrivateKeyPair(
        Optional<String> commonName, 
        Optional<String> organization, 
        Optional<String> organizationalUnit, 
        Optional<String> locality, 
        Optional<String> state, 
        Optional<String> country, 
        Optional<String> emailAddress
        );

    

    
    /** 
     * Get details of the current Encryption At Rest configuration. Encryption At Rest feature is built upon the Self-Encrypting Drive's hardware encryption capability.
     **/
    @Since("12.3")
    @ConnectionType("Cluster")
    public GetEncryptionAtRestInfoResult getEncryptionAtRestInfo();
    
    /** 
     * Delete the specified inactive Key Provider.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteKeyProviderKmipResult deleteKeyProviderKmip(final DeleteKeyProviderKmipRequest request);

    
    /** 
     * Delete the specified inactive Key Provider.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteKeyProviderKmipResult deleteKeyProviderKmip(
        Long keyProviderID
        );

    
    /** 
     * Delete the specified KMIP (Key Management Interoperability Protocol) Key Server.  A KMIP Key Server can be deleted unless it's the last one assigned to its provider, and that provider is active (providing keys which are currently in use).
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public DeleteKeyServerKmipResult deleteKeyServerKmip(final DeleteKeyServerKmipRequest request);

    
    /** 
     * Delete the specified KMIP (Key Management Interoperability Protocol) Key Server.  A KMIP Key Server can be deleted unless it's the last one assigned to its provider, and that provider is active (providing keys which are currently in use).
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public DeleteKeyServerKmipResult deleteKeyServerKmip(
        Long keyServerID
        );

    

    
    /** 
     * Generates a Certificate Sign Request which can be signed by a Certificate Authority to generate a client certificate for the cluster.  This is part of establishing a trust relationship for interacting with external services.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public GetClientCertificateSignRequestResult getClientCertificateSignRequest();
    

    
    /** 
     * GetFipsReport enables you to retrieve FIPS compliance status on a per node basis.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetFipsReportResult getFipsReport();
    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Provider object.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyProviderKmipResult getKeyProviderKmip(final GetKeyProviderKmipRequest request);

    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Provider object.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyProviderKmipResult getKeyProviderKmip(
        Long keyProviderID
        );

    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Server object.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyServerKmipResult getKeyServerKmip(final GetKeyServerKmipRequest request);

    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Server object.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyServerKmipResult getKeyServerKmip(
        Long keyServerID
        );

    

    
    /** 
     * Get details of the current Software Encryption At Rest configuration.
     **/
    @Since("12.3")
    @ConnectionType("Cluster")
    public GetSoftwareEncryptionAtRestInfoResult getSoftwareEncryptionAtRestInfo();
    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Providers which have been created via CreateKeyProviderKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyProvidersKmipResult listKeyProvidersKmip(final ListKeyProvidersKmipRequest request);

    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Providers which have been created via CreateKeyProviderKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyProvidersKmipResult listKeyProvidersKmip(
        Optional<Boolean> keyProviderIsActive, 
        Optional<Boolean> kmipKeyProviderHasServerAssigned
        );

    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyServersKmipResult listKeyServersKmip(final ListKeyServersKmipRequest request);

    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyServersKmipResult listKeyServersKmip(
        Optional<Long> keyProviderID, 
        Optional<Boolean> kmipAssignedProviderIsActive, 
        Optional<Boolean> kmipHasProviderAssigned
        );

    
    /** 
     * Modifies a KMIP (Key Management Interoperability Protocol) Key Server to the specified attributes. The only required parameter is the keyServerID. A request which contains only the keyServerID will be a no-op and no error will be returned. Any other parameters which are specified will replace the existing values on the KMIP Key Server with the specified keyServerID. Because this server might be part of an active provider this will result in contacting the server to verify it's functional. Multiple hostnames or IP addresses must only be provided to the kmipKeyServerHostnames parameter if the key servers are in a clustered configuration.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public ModifyKeyServerKmipResult modifyKeyServerKmip(final ModifyKeyServerKmipRequest request);

    
    /** 
     * Modifies a KMIP (Key Management Interoperability Protocol) Key Server to the specified attributes. The only required parameter is the keyServerID. A request which contains only the keyServerID will be a no-op and no error will be returned. Any other parameters which are specified will replace the existing values on the KMIP Key Server with the specified keyServerID. Because this server might be part of an active provider this will result in contacting the server to verify it's functional. Multiple hostnames or IP addresses must only be provided to the kmipKeyServerHostnames parameter if the key servers are in a clustered configuration.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public ModifyKeyServerKmipResult modifyKeyServerKmip(
        Optional<String> kmipCaCertificate, 
        Optional<String> kmipClientCertificate, 
        Optional<String[]> kmipKeyServerHostnames, 
        Long keyServerID, 
        Optional<String> kmipKeyServerName, 
        Optional<Long> kmipKeyServerPort
        );

    
    /** 
     * Rekey the Software Encryption At Rest Master Key used to encrypt the DEKs (Data Encryption Keys).
     **/
    @Since("12.3")
    @ConnectionType("Cluster")
    public RekeySoftwareEncryptionAtRestMasterKeyResult rekeySoftwareEncryptionAtRestMasterKey(final RekeySoftwareEncryptionAtRestMasterKeyRequest request);

    
    /** 
     * Rekey the Software Encryption At Rest Master Key used to encrypt the DEKs (Data Encryption Keys).
     **/
    @Since("12.3")
    @ConnectionType("Cluster")
    public RekeySoftwareEncryptionAtRestMasterKeyResult rekeySoftwareEncryptionAtRestMasterKey();
    
    /** 
     * Rekey the Software Encryption At Rest Master Key used to encrypt the DEKs (Data Encryption Keys).
     **/
    @Since("12.3")
    @ConnectionType("Cluster")
    public RekeySoftwareEncryptionAtRestMasterKeyResult rekeySoftwareEncryptionAtRestMasterKey(
        Optional<String> keyManagementType, 
        Optional<Long> keyProviderID
        );

    
    /** 
     * Remove (unassign) the specified KMIP (Key Management Interoperability Protocol) Key Server from the provider it was assigned to via AddKeyServerToProviderKmip (if any).  A KMIP Key Server can be unassigned from its provider unless it's the last one and that provider is active (providing keys which are currently in use).  If the specified KMIP Key Server is not assigned to a provider, this is a no-op and no error will be returned.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public RemoveKeyServerFromProviderKmipResult removeKeyServerFromProviderKmip(final RemoveKeyServerFromProviderKmipRequest request);

    
    /** 
     * Remove (unassign) the specified KMIP (Key Management Interoperability Protocol) Key Server from the provider it was assigned to via AddKeyServerToProviderKmip (if any).  A KMIP Key Server can be unassigned from its provider unless it's the last one and that provider is active (providing keys which are currently in use).  If the specified KMIP Key Server is not assigned to a provider, this is a no-op and no error will be returned.
     **/
    @Since("11.7")
    @ConnectionType("Cluster")
    public RemoveKeyServerFromProviderKmipResult removeKeyServerFromProviderKmip(
        Long keyServerID
        );

    
    /** 
     * Test whether the specified Key Provider is functioning normally.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyProviderKmipResult testKeyProviderKmip(final TestKeyProviderKmipRequest request);

    
    /** 
     * Test whether the specified Key Provider is functioning normally.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyProviderKmipResult testKeyProviderKmip(
        Long keyProviderID
        );

    
    /** 
     * Test whether the specified KMIP (Key Management Interoperability Protocol) Key Server is functioning normally.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyServerKmipResult testKeyServerKmip(final TestKeyServerKmipRequest request);

    
    /** 
     * Test whether the specified KMIP (Key Management Interoperability Protocol) Key Server is functioning normally.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyServerKmipResult testKeyServerKmip(
        Long keyServerID
        );

    
    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(final GetIpmiConfigRequest request);

    
    /** 
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(
        Optional<String> chassisType
        );

    

    
    /** 
     * GetIpmiInfo enables you to display a detailed reporting of sensors (objects) for node fans, intake and exhaust temperatures, and power supplies that are monitored by the system.
     **/
    @Since("9.0")
    @ConnectionType("Node")
    public GetIpmiInfoResult getIpmiInfo();
    

    
    /** 
     * You can use ListServices to return the services information for nodes, drives, current software, and other services that are running on the cluster.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListServicesResult listServices();
    
    /** 
     * The RestartServices API method enables you to restart the services on a node.
     * Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartServices(final RestartServicesRequest request);

    
    /** 
     * The RestartServices API method enables you to restart the services on a node.
     * Caution: This method causes temporary node services interruption. Exercise caution when using this method.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public Attributes restartServices(
        Boolean force, 
        Optional<String> service, 
        Optional<String> action
        );

    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship(final AbortSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<Boolean> clearCheckpoint
        );

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship(final BreakSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume
        );

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume(final BreakSnapMirrorVolumeRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume();
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume(
        Long volumeID, 
        Optional<Long> snapshotID, 
        Optional<Boolean> preserve, 
        Optional<String> access
        );

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint(final CreateSnapMirrorEndpointRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint();
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint(
        String managementIP, 
        String username, 
        String password
        );

    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged(final CreateSnapMirrorEndpointUnmanagedRequest request);

    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged();
    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged(
        String clusterName, 
        String[] ipAddresses
        );

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorRelationshipResult createSnapMirrorRelationship(final CreateSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorRelationshipResult createSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorRelationshipResult createSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo sourceVolume, 
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<String> relationshipType, 
        Optional<String> policyName, 
        Optional<String> scheduleName, 
        Optional<Long> maxTransferRate
        );

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume(final CreateSnapMirrorVolumeRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume();
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume(
        Long snapMirrorEndpointID, 
        String vserver, 
        String name, 
        Optional<String> type, 
        String aggregate, 
        Long size
        );

    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints(final DeleteSnapMirrorEndpointsRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints();
    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints(
        Long[] snapMirrorEndpointIDs
        );

    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships(final DeleteSnapMirrorRelationshipsRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships();
    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo[] destinationVolumes
        );

    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo(final GetOntapVersionInfoRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo();
    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity(final GetSnapMirrorClusterIdentityRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity();
    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship(final InitializeSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<Long> maxTransferRate
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates(final ListSnapMirrorAggregatesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints(final ListSnapMirrorEndpointsRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints(
        Optional<Long[]> snapMirrorEndpointIDs
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns(final ListSnapMirrorLunsRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces(final ListSnapMirrorNetworkInterfacesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces(
        Optional<Long> snapMirrorEndpointID, 
        Optional<String> interfaceRole
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes(final ListSnapMirrorNodesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies(final ListSnapMirrorPoliciesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships(final ListSnapMirrorRelationshipsRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships(
        Optional<Long> snapMirrorEndpointID, 
        Optional<SnapMirrorVolumeInfo> destinationVolume, 
        Optional<SnapMirrorVolumeInfo> sourceVolume, 
        Optional<String> vserver, 
        Optional<String> relationshipID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules(final ListSnapMirrorSchedulesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules(
        Optional<Long> snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes(final ListSnapMirrorVolumesRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes(
        Optional<Long> snapMirrorEndpointID, 
        Optional<String> vserver, 
        Optional<String> name, 
        Optional<String> type
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers(final ListSnapMirrorVserversRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers();
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers(
        Optional<Long> snapMirrorEndpointID, 
        Optional<String> vserverType, 
        Optional<String> vserverName
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint(final ModifySnapMirrorEndpointRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint();
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint(
        Long snapMirrorEndpointID, 
        Optional<String> managementIP, 
        Optional<String> username, 
        Optional<String> password
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged(final ModifySnapMirrorEndpointUnmanagedRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged();
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged(
        Long snapMirrorEndpointID, 
        Optional<String> clusterName, 
        Optional<String[]> ipAddresses
        );

    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship(final ModifySnapMirrorRelationshipRequest request);

    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship();
    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship(
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<Long> maxTransferRate, 
        Optional<String> policyName, 
        Optional<String> scheduleName, 
        Long snapMirrorEndpointID
        );

    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship(final QuiesceSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship(final ResumeSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume
        );

    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship(final ResyncSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<Long> maxTransferRate, 
        Optional<SnapMirrorVolumeInfo> sourceVolume
        );

    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship(final UpdateSnapMirrorRelationshipRequest request);

    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship();
    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship(
        Long snapMirrorEndpointID, 
        SnapMirrorVolumeInfo destinationVolume, 
        Optional<Long> maxTransferRate
        );

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request);

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes, 
        Optional<String> name, 
        Optional<String> expirationTime, 
        Optional<Attributes> attributes
        );

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes
        );

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes, 
        Optional<String> snapMirrorLabel
        );

    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(
        Long[] volumes, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes, 
        Optional<String> snapMirrorLabel, 
        Optional<Boolean> ensureSerialCreation
        );

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request);

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID, 
        Optional<Long> snapshotID, 
        Optional<String> name, 
        Optional<String> expirationTime, 
        Optional<Attributes> attributes
        );

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID, 
        Optional<Long> snapshotID, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes
        );

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID, 
        Optional<Long> snapshotID, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes, 
        Optional<String> snapMirrorLabel
        );

    
    /** 
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(
        Long volumeID, 
        Optional<Long> snapshotID, 
        Optional<String> name, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> expirationTime, 
        Optional<String> retention, 
        Optional<Attributes> attributes, 
        Optional<String> snapMirrorLabel, 
        Optional<Boolean> ensureSerialCreation
        );

    
    /** 
     * DeleteGroupSnapshot enables you to delete a group snapshot. You can use the saveMembers parameter to preserve all the snapshots that were made for the volumes in the group, but the group association is removed.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request);

    
    /** 
     * DeleteGroupSnapshot enables you to delete a group snapshot. You can use the saveMembers parameter to preserve all the snapshots that were made for the volumes in the group, but the group association is removed.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(
        Long groupSnapshotID, 
        Boolean saveMembers
        );

    
    /** 
     * DeleteSnapshot enables you to delete a snapshot. A snapshot that is currently the "active" snapshot cannot be deleted. You must
     * rollback and make another snapshot "active" before the current snapshot can be deleted. For more details on rolling back snapshots, see RollbackToSnapshot.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request);

    
    /** 
     * DeleteSnapshot enables you to delete a snapshot. A snapshot that is currently the "active" snapshot cannot be deleted. You must
     * rollback and make another snapshot "active" before the current snapshot can be deleted. For more details on rolling back snapshots, see RollbackToSnapshot.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(
        Long snapshotID
        );

    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request);

    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(
        Optional<Long[]> volumes
        );

    
    /** 
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(
        Optional<Long[]> volumes, 
        Optional<Long> groupSnapshotID
        );

    
    /** 
     * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request);

    
    /** 
     * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(
        Optional<Long> volumeID, 
        Optional<Long> snapshotID
        );

    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request);

    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(
        Long groupSnapshotID, 
        Optional<String> expirationTime, 
        Optional<Boolean> enableRemoteReplication
        );

    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(
        Long groupSnapshotID, 
        Optional<String> expirationTime, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> snapMirrorLabel
        );

    
    /** 
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request);

    
    /** 
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(
        Long snapshotID, 
        Optional<String> expirationTime, 
        Optional<Boolean> enableRemoteReplication
        );

    
    /** 
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(
        Long snapshotID, 
        Optional<String> expirationTime, 
        Optional<Boolean> enableRemoteReplication, 
        Optional<String> snapMirrorLabel
        );

    
    /** 
     * RollbackToGroupSnapshot enables you to roll back all individual volumes in a snapshot group to each volume's individual snapshot.
     * Note: Rolling back to a group snapshot creates a temporary snapshot of each volume within the group snapshot.
     * Snapshots are allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public RollbackToGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request);

    
    /** 
     * RollbackToGroupSnapshot enables you to roll back all individual volumes in a snapshot group to each volume's individual snapshot.
     * Note: Rolling back to a group snapshot creates a temporary snapshot of each volume within the group snapshot.
     * Snapshots are allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public RollbackToGroupSnapshotResult rollbackToGroupSnapshot(
        Long groupSnapshotID, 
        Boolean saveCurrentState, 
        Optional<String> name, 
        Optional<Attributes> attributes
        );

    
    /** 
     * RollbackToSnapshot enables you to make an existing snapshot of the "active" volume image. This method creates a new snapshot
     * from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until you delete it.
     * The previously "active" snapshot is deleted unless you set the parameter saveCurrentState to true.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RollbackToSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request);

    
    /** 
     * RollbackToSnapshot enables you to make an existing snapshot of the "active" volume image. This method creates a new snapshot
     * from an existing snapshot. The new snapshot becomes "active" and the existing snapshot is preserved until you delete it.
     * The previously "active" snapshot is deleted unless you set the parameter saveCurrentState to true.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public RollbackToSnapshotResult rollbackToSnapshot(
        Long volumeID, 
        Long snapshotID, 
        Boolean saveCurrentState, 
        Optional<String> name, 
        Optional<Attributes> attributes
        );

    

    
    /** 
     * You can use DisableSnmp to disable SNMP on the cluster nodes.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public DisableSnmpResult disableSnmp();
    
    /** 
     * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
     * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(final EnableSnmpRequest request);

    
    /** 
     * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
     * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(
        Boolean snmpV3Enabled
        );

    

    
    /** 
     * GetSnmpACL enables you to return the current SNMP access permissions on the cluster nodes.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetSnmpACLResult getSnmpACL();
    

    
    /** 
     * GetSnmpInfo enables you to retrieve the current simple network management protocol (SNMP) configuration information.
     * Note: GetSnmpInfo is available for Element OS 8 and prior releases. It is deprecated for versions later than Element OS 8.
     * NetApp recommends that you migrate to the GetSnmpState and SetSnmpACL methods. See details in the Element API Reference Guide
     * for their descriptions and usage.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetSnmpInfoResult getSnmpInfo();
    

    
    /** 
     * You can use GetSnmpState to return the current state of the SNMP feature.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetSnmpStateResult getSnmpState();
    

    
    /** 
     * You can use GetSnmpTrapInfo to return current SNMP trap configuration information.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetSnmpTrapInfoResult getSnmpTrapInfo();
    
    /** 
     * SetSnmpACL enables you to configure SNMP access permissions on the cluster nodes. The values you set with this interface apply to all
     * nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note
     * that the values set with this interface replace all network or usmUsers values set with the older SetSnmpInfo.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(final SetSnmpACLRequest request);

    
    /** 
     * SetSnmpACL enables you to configure SNMP access permissions on the cluster nodes. The values you set with this interface apply to all
     * nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note
     * that the values set with this interface replace all network or usmUsers values set with the older SetSnmpInfo.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(
        SnmpNetwork[] networks, 
        SnmpV3UsmUser[] usmUsers
        );

    
    /** 
     * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
     * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(final SetSnmpInfoRequest request);

    
    /** 
     * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
     * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(
        Optional<SnmpNetwork[]> networks, 
        Optional<Boolean> enabled, 
        Optional<Boolean> snmpV3Enabled, 
        Optional<SnmpV3UsmUser[]> usmUsers
        );

    
    /** 
     * You can use SetSnmpTrapInfo to enable and disable the generation of cluster SNMP notifications (traps) and to specify the set of network host computers that receive the notifications. The values you pass with each SetSnmpTrapInfo method call replace all values set in any previous call to SetSnmpTrapInfo.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(final SetSnmpTrapInfoRequest request);

    
    /** 
     * You can use SetSnmpTrapInfo to enable and disable the generation of cluster SNMP notifications (traps) and to specify the set of network host computers that receive the notifications. The values you pass with each SetSnmpTrapInfo method call replace all values set in any previous call to SetSnmpTrapInfo.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(
        Optional<SnmpTrapRecipient[]> trapRecipients, 
        Boolean clusterFaultTrapsEnabled, 
        Boolean clusterFaultResolvedTrapsEnabled, 
        Boolean clusterEventTrapsEnabled
        );

    

    
    /** 
     * SnmpSendTestTraps enables you to test SNMP functionality for a cluster. This method instructs the cluster to send test SNMP traps to the currently configured SNMP manager.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public SnmpSendTestTrapsResult snmpSendTestTraps();
    
    /** 
     * CreateStorageContainer enables you to create a Virtual Volume (VVol) storage container. Storage containers are associated with a SolidFire storage system account, and are used for reporting and resource allocation. Storage containers can only be associated with virtual volumes. You need at least one storage container to use the Virtual Volumes feature.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(final CreateStorageContainerRequest request);

    
    /** 
     * CreateStorageContainer enables you to create a Virtual Volume (VVol) storage container. Storage containers are associated with a SolidFire storage system account, and are used for reporting and resource allocation. Storage containers can only be associated with virtual volumes. You need at least one storage container to use the Virtual Volumes feature.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(
        String name, 
        Optional<String> initiatorSecret, 
        Optional<String> targetSecret, 
        Optional<Long> accountID
        );

    
    /** 
     * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
     * The storage containers you remove must not contain any VVols.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(final DeleteStorageContainersRequest request);

    
    /** 
     * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
     * The storage containers you remove must not contain any VVols.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(
        java.util.UUID[] storageContainerIDs
        );

    
    /** 
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(final GetStorageContainerEfficiencyRequest request);

    
    /** 
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(
        java.util.UUID storageContainerID
        );

    
    /** 
     * ListStorageContainers enables you to retrieve information about all virtual volume storage containers known to the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(final ListStorageContainersRequest request);

    
    /** 
     * ListStorageContainers enables you to retrieve information about all virtual volume storage containers known to the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(
        Optional<java.util.UUID[]> storageContainerIDs
        );

    
    /** 
     * ModifyStorageContainer enables you to make changes to an existing virtual volume storage container.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(final ModifyStorageContainerRequest request);

    
    /** 
     * ModifyStorageContainer enables you to make changes to an existing virtual volume storage container.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyStorageContainerResult modifyStorageContainer(
        java.util.UUID storageContainerID, 
        Optional<String> initiatorSecret, 
        Optional<String> targetSecret
        );

    

    
    /** 
     * You can use the ListTests API method to return the tests that are available to run on a node.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public ListTestsResult listTests();
    

    
    /** 
     * You can use the ListUtilities API method to return the operations that are available to run on a node. 
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public ListUtilitiesResult listUtilities();
    
    /** 
     * The TestConnectEnsemble API method enables you to verify connectivity with a specified database ensemble. By default, it uses the ensemble for the cluster that the node is associated with. Alternatively, you can provide a different ensemble to test connectivity with.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(final TestConnectEnsembleRequest request);

    
    /** 
     * The TestConnectEnsemble API method enables you to verify connectivity with a specified database ensemble. By default, it uses the ensemble for the cluster that the node is associated with. Alternatively, you can provide a different ensemble to test connectivity with.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectEnsembleResult testConnectEnsemble(
        Optional<String> ensemble
        );

    
    /** 
     * The TestConnectMvip API method enables you to test the
     * management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(final TestConnectMvipRequest request);

    
    /** 
     * The TestConnectMvip API method enables you to test the
     * management connection to the cluster. The test pings the MVIP and executes a simple API method to verify connectivity.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectMvipResult testConnectMvip(
        Optional<String> mvip
        );

    
    /** 
     * The TestConnectSvip API method enables you to test the storage connection to the cluster. The test pings the SVIP using ICMP packets, and when successful, connects as an iSCSI initiator.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(final TestConnectSvipRequest request);

    
    /** 
     * The TestConnectSvip API method enables you to test the storage connection to the cluster. The test pings the SVIP using ICMP packets, and when successful, connects as an iSCSI initiator.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(
        Optional<String> svip
        );

    
    /** 
     * The TestPing API allows to test the reachability to IP address(s) using ICMP packets. Source address(v4 or v6), interface and vlan tag can be specified. If not Bond1G/10G network is used to reach the target address.
     * The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestPingResult testPing(final TestPingRequest request);

    
    /** 
     * The TestPing API allows to test the reachability to IP address(s) using ICMP packets. Source address(v4 or v6), interface and vlan tag can be specified. If not Bond1G/10G network is used to reach the target address.
     * The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Since("5.0")
    @ConnectionType("Node")
    public TestPingResult testPing(
        Optional<Long> attempts, 
        Optional<String> hosts, 
        Optional<Long> totalTimeoutSec, 
        Optional<Long> packetSize, 
        Optional<Long> pingTimeoutMsec, 
        Optional<Boolean> prohibitFragmentation, 
        Optional<String> sourceAddressV4, 
        Optional<String> sourceAddressV6, 
        Optional<String> iface, 
        Optional<Long> virtualNetworkTag
        );

    
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
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(final AddVirtualNetworkRequest request);

    
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
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult addVirtualNetwork(
        Long virtualNetworkTag, 
        String name, 
        AddressBlockParams[] addressBlocks, 
        String netmask, 
        String svip, 
        Optional<Attributes> attributes
        );

    
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
        );

    
    /** 
     * ListVirtualNetworks enables you to list all configured virtual networks for the cluster. You can use this method to verify the virtual
     * network settings in the cluster.
     * There are no required parameters for this method. However, to filter the results, you can pass one or more VirtualNetworkID or
     * VirtualNetworkTag values.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVirtualNetworksResult listVirtualNetworks(final ListVirtualNetworksRequest request);

    
    /** 
     * ListVirtualNetworks enables you to list all configured virtual networks for the cluster. You can use this method to verify the virtual
     * network settings in the cluster.
     * There are no required parameters for this method. However, to filter the results, you can pass one or more VirtualNetworkID or
     * VirtualNetworkTag values.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVirtualNetworksResult listVirtualNetworks(
        Optional<Long> virtualNetworkID, 
        Optional<Long> virtualNetworkTag, 
        Optional<Long[]> virtualNetworkIDs, 
        Optional<Long[]> virtualNetworkTags
        );

    
    /** 
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public AddVirtualNetworkResult modifyVirtualNetwork(final ModifyVirtualNetworkRequest request);

    
    /** 
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
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
        );

    
    /** 
     * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
     * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
     * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
     * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
     * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
     * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
     * "namespace" parameter only during a scheduled maintenance window.
     **/
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
        );

    
    /** 
     * RemoveVirtualNetwork enables you to remove a previously added virtual network.
     * Note: This method requires either the virtualNetworkID or the virtualNetworkTag as a parameter, but not both.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request);

    
    /** 
     * RemoveVirtualNetwork enables you to remove a previously added virtual network.
     * Note: This method requires either the virtualNetworkID or the virtualNetworkTag as a parameter, but not both.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(
        Optional<Long> virtualNetworkID, 
        Optional<Long> virtualNetworkTag
        );

    
    /** 
     * You can use EnableFeature to enable cluster features that are disabled by default.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(final EnableFeatureRequest request);

    
    /** 
     * You can use EnableFeature to enable cluster features that are disabled by default.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(
        String feature
        );

    
    /** 
     * GetFeatureStatus enables you to retrieve the status of a cluster feature.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(final GetFeatureStatusRequest request);

    
    /** 
     * GetFeatureStatus enables you to retrieve the status of a cluster feature.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(
        Optional<String> feature
        );

    

    
    /** 
     * Enables retrieval of the number of virtual volumes currently in the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetVirtualVolumeCountResult getVirtualVolumeCount();
    
    /** 
     * ListProtocolEndpoints enables you to retrieve information about all protocol endpoints in the cluster. Protocol endpoints govern
     * access to their associated virtual volume storage containers.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(final ListProtocolEndpointsRequest request);

    
    /** 
     * ListProtocolEndpoints enables you to retrieve information about all protocol endpoints in the cluster. Protocol endpoints govern
     * access to their associated virtual volume storage containers.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(
        Optional<java.util.UUID[]> protocolEndpointIDs
        );

    
    /** 
     * ListVirtualVolumeBindings returns a list of all virtual volumes in the cluster that are bound to protocol endpoints.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(final ListVirtualVolumeBindingsRequest request);

    
    /** 
     * ListVirtualVolumeBindings returns a list of all virtual volumes in the cluster that are bound to protocol endpoints.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(
        Optional<Long[]> virtualVolumeBindingIDs
        );

    
    /** 
     * ListVirtualVolumeHosts returns a list of all virtual volume hosts known to the cluster. A virtual volume host is a VMware ESX host
     * that has initiated a session with the VASA API provider.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(final ListVirtualVolumeHostsRequest request);

    
    /** 
     * ListVirtualVolumeHosts returns a list of all virtual volume hosts known to the cluster. A virtual volume host is a VMware ESX host
     * that has initiated a session with the VASA API provider.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(
        Optional<java.util.UUID[]> virtualVolumeHostIDs
        );

    
    /** 
     * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(final ListVirtualVolumeTasksRequest request);

    
    /** 
     * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(
        Optional<java.util.UUID[]> virtualVolumeTaskIDs
        );

    
    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes,
     * or only list a subset.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(final ListVirtualVolumesRequest request);

    
    /** 
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes,
     * or only list a subset.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(
        Optional<Boolean> details, 
        Optional<Long> limit, 
        Optional<Boolean> recursive, 
        Optional<java.util.UUID> startVirtualVolumeID, 
        Optional<java.util.UUID[]> virtualVolumeIDs
        );

    
    /** 
     * ListVolumeStatsByVirtualVolume enables you to list volume statistics for any volumes in the system that are associated with virtual volumes. Statistics are cumulative from the creation of the volume.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(final ListVolumeStatsByVirtualVolumeRequest request);

    
    /** 
     * ListVolumeStatsByVirtualVolume enables you to list volume statistics for any volumes in the system that are associated with virtual volumes. Statistics are cumulative from the creation of the volume.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(
        Optional<java.util.UUID[]> virtualVolumeIDs
        );

    
    /** 
     * AddVolumesToVolumeAccessGroup enables you to add
     * volumes to a specified volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request);

    
    /** 
     * AddVolumesToVolumeAccessGroup enables you to add
     * volumes to a specified volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(
        Long volumeAccessGroupID, 
        Long[] volumes
        );

    
    /** 
     * CancelClone enables you to stop an ongoing CloneVolume or CopyVolume process. When you cancel a group clone operation, the
     * system completes and removes the operation's associated asyncHandle.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(final CancelCloneRequest request);

    
    /** 
     * CancelClone enables you to stop an ongoing CloneVolume or CopyVolume process. When you cancel a group clone operation, the
     * system completes and removes the operation's associated asyncHandle.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(
        Long cloneID
        );

    
    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process occurring on a group of volumes. When you cancel
     * a group clone operation, the system completes and removes the operation's associated asyncHandle.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(final CancelGroupCloneRequest request);

    
    /** 
     * CancelGroupClone enables you to stop an ongoing CloneMultipleVolumes process occurring on a group of volumes. When you cancel
     * a group clone operation, the system completes and removes the operation's associated asyncHandle.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelGroupCloneResult cancelGroupClone(
        Long groupCloneID
        );

    
    /** 
     * CloneMultipleVolumes enables you to create a clone of a group of specified volumes. You can assign a consistent set of characteristics
     * to a group of multiple volumes when they are cloned together.
     * Before using groupSnapshotID to clone the volumes in a group snapshot, you must create the group snapshot by using the
     * CreateGroupSnapshot API method or the Element OS Web UI. Using groupSnapshotID is optional when cloning multiple volumes.
     * Note: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CloneMultipleVolumesResult cloneMultipleVolumes(final CloneMultipleVolumesRequest request);

    
    /** 
     * CloneMultipleVolumes enables you to create a clone of a group of specified volumes. You can assign a consistent set of characteristics
     * to a group of multiple volumes when they are cloned together.
     * Before using groupSnapshotID to clone the volumes in a group snapshot, you must create the group snapshot by using the
     * CreateGroupSnapshot API method or the Element OS Web UI. Using groupSnapshotID is optional when cloning multiple volumes.
     * Note: Cloning multiple volumes is allowed if cluster fullness is at stage 2 or 3. Clones are not created when cluster fullness is
     * at stage 4 or 5.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public CloneMultipleVolumesResult cloneMultipleVolumes(
        CloneMultipleVolumeParams[] volumes, 
        Optional<String> access, 
        Optional<Long> groupSnapshotID, 
        Optional<Long> newAccountID
        );

    
    /** 
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request);

    
    /** 
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
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
        );

    
    /** 
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
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
        Optional<Boolean> enable512e, 
        Optional<Boolean> enableSnapMirrorReplication
        );

    
    /** 
     * CopyVolume enables you to overwrite the data contents of an existing volume with the data contents of another volume (or
     * snapshot). Attributes of the destination volume such as IQN, QoS settings, size, account, and volume access group membership are
     * not changed. The destination volume must already exist and must be the same size as the source volume.
     * NetApp strongly recommends that clients unmount the destination volume before the CopyVolume operation begins. If the
     * destination volume is modified during the copy operation, the changes will be lost.
     * This method is asynchronous and may take a variable amount of time to complete. You can use the GetAsyncResult method to
     * determine when the process has finished, and ListSyncJobs to see the progress of the copy.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(final CopyVolumeRequest request);

    
    /** 
     * CopyVolume enables you to overwrite the data contents of an existing volume with the data contents of another volume (or
     * snapshot). Attributes of the destination volume such as IQN, QoS settings, size, account, and volume access group membership are
     * not changed. The destination volume must already exist and must be the same size as the source volume.
     * NetApp strongly recommends that clients unmount the destination volume before the CopyVolume operation begins. If the
     * destination volume is modified during the copy operation, the changes will be lost.
     * This method is asynchronous and may take a variable amount of time to complete. You can use the GetAsyncResult method to
     * determine when the process has finished, and ListSyncJobs to see the progress of the copy.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public CopyVolumeResult copyVolume(
        Long volumeID, 
        Long dstVolumeID, 
        Optional<Long> snapshotID
        );

    
    /** 
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy(final CreateQoSPolicyRequest request);

    
    /** 
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy();
    
    /** 
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy(
        String name, 
        QoS qos
        );

    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(final CreateVolumeRequest request);

    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(
        String name, 
        Long accountID, 
        Long totalSize, 
        Optional<Boolean> enable512e, 
        Optional<QoS> qos, 
        Optional<Attributes> attributes, 
        Optional<String> protectionScheme
        );

    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(
        String name, 
        Long accountID, 
        Long totalSize, 
        Optional<Boolean> enable512e, 
        Optional<QoS> qos, 
        Optional<Attributes> attributes, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<String> access, 
        Optional<Boolean> enableSnapMirrorReplication, 
        Optional<Long> qosPolicyID, 
        Optional<String> protectionScheme
        );

    
    /** 
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(
        String name, 
        Long accountID, 
        Long totalSize, 
        Optional<Boolean> enable512e, 
        Optional<QoS> qos, 
        Optional<Attributes> attributes, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<String> access, 
        Optional<Boolean> enableSnapMirrorReplication, 
        Optional<Long> qosPolicyID, 
        Optional<String> protectionScheme, 
        Optional<Long> fifoSize, 
        Optional<Long> minFifoSize
        );

    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy(final DeleteQoSPolicyRequest request);

    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy();
    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy(
        Long qosPolicyID
        );

    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request);

    
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
    @Since("1.0")
    @ConnectionType("Cluster")
    public DeleteVolumeResult deleteVolume(
        Long volumeID
        );

    
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
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(final DeleteVolumesRequest request);

    
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
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteVolumesResult deleteVolumes(
        Optional<Long[]> accountIDs, 
        Optional<Long[]> volumeAccessGroupIDs, 
        Optional<Long[]> volumeIDs
        );

    

    
    /** 
     * GetDefaultQoS enables you to retrieve the default QoS values for a newly created volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public VolumeQOS getDefaultQoS();
    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy(final GetQoSPolicyRequest request);

    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy();
    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy(
        Long qosPolicyID
        );

    

    
    /** 
     * GetVolumeCount enables you to retrieve the number of volumes currently in the system.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetVolumeCountResult getVolumeCount();
    
    /** 
     * GetVolumeEfficiency enables you to retrieve information about a volume. Only the volume you give as a parameter in this API method is used to compute the capacity.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request);

    
    /** 
     * GetVolumeEfficiency enables you to retrieve information about a volume. Only the volume you give as a parameter in this API method is used to compute the capacity.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(
        Long volumeID
        );

    
    /** 
     * GetVolumeStats enables  you to retrieve high-level activity measurements for a single volume. Values are cumulative from the creation of the volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request);

    
    /** 
     * GetVolumeStats enables  you to retrieve high-level activity measurements for a single volume. Values are cumulative from the creation of the volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(
        Long volumeID
        );

    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request);

    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(
        Optional<Long> startVolumeID, 
        Optional<Long> limit
        );

    
    /** 
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(
        Optional<Long> startVolumeID, 
        Optional<Long> limit, 
        Optional<Boolean> includeVirtualVolumes
        );

    

    
    /** 
     * ListBulkVolumeJobs enables you to retrieve information about each bulk volume read or write operation that is occurring in the
     * system.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListBulkVolumeJobsResult listBulkVolumeJobs();
    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes(final ListDeletedVolumesRequest request);

    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes();
    
    /** 
     * ListDeletedVolumes enables you to retrieve the list of volumes that have been marked for deletion and purged from the system.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListDeletedVolumesResult listDeletedVolumes(
        Optional<Boolean> includeVirtualVolumes
        );

    

    
    /** 
     * You can use the ListQoSPolicies method to list all the settings of all QoS policies on the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public ListQoSPoliciesResult listQoSPolicies();
    
    /** 
     * ListVolumeQoSHistograms returns histograms detailing volume performance relative to QOS settings.
     * It may take up to 5 seconds for newly created volumes to have accurate histogram data available.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeQoSHistogramsResult listVolumeQoSHistograms(final ListVolumeQoSHistogramsRequest request);

    
    /** 
     * ListVolumeQoSHistograms returns histograms detailing volume performance relative to QOS settings.
     * It may take up to 5 seconds for newly created volumes to have accurate histogram data available.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeQoSHistogramsResult listVolumeQoSHistograms(
        Optional<Long> volumeIDs
        );

    
    /** 
     * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(final ListVolumeStatsRequest request);

    
    /** 
     * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(
        Optional<Long[]> volumeIDs
        );

    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request);

    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(
        Optional<Long[]> accounts
        );

    
    /** 
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(
        Optional<Long[]> accounts, 
        Optional<Boolean> includeVirtualVolumes
        );

    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request);

    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume();
    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(
        Optional<Boolean> includeVirtualVolumes
        );

    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request);

    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(
        Optional<Long[]> volumeAccessGroups
        );

    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(
        Optional<Long[]> volumeAccessGroups, 
        Optional<Boolean> includeVirtualVolumes
        );

    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(final ListVolumesRequest request);

    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
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
        Optional<String[]> protectionSchemes
        );

    
    /** 
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
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
        Optional<Boolean> includeVirtualVolumes, 
        Optional<String[]> protectionSchemes
        );

    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request);

    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(
        Long accountID, 
        Optional<Long> startVolumeID, 
        Optional<Long> limit
        );

    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(
        Long accountID, 
        Optional<Long> startVolumeID, 
        Optional<Long> limit, 
        Optional<Boolean> includeVirtualVolumes
        );

    
    /** 
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy(final ModifyQoSPolicyRequest request);

    
    /** 
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy();
    
    /** 
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy(
        Long qosPolicyID, 
        Optional<String> name, 
        Optional<QoS> qos
        );

    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request);

    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(
        Long volumeID, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Attributes> attributes
        );

    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(
        Long volumeID, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Attributes> attributes, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<Long> qosPolicyID, 
        Optional<Boolean> enableSnapMirrorReplication
        );

    
    /** 
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(
        Long volumeID, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Attributes> attributes, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<Long> qosPolicyID, 
        Optional<Boolean> enableSnapMirrorReplication, 
        Optional<Long> fifoSize, 
        Optional<Long> minFifoSize
        );

    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(final ModifyVolumesRequest request);

    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(
        Long[] volumeIDs, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Attributes> attributes
        );

    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(
        Long[] volumeIDs, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<Long> qosPolicyID, 
        Optional<Attributes> attributes, 
        Optional<Boolean> enableSnapMirrorReplication
        );

    
    /** 
     * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
     * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
     * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
     * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of volumes that are being replicated, do so in the following order
     * to prevent replication errors:
     *    Increase the size of the "Replication Target" volume.
     *    Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(
        Long[] volumeIDs, 
        Optional<Long> accountID, 
        Optional<String> access, 
        Optional<QoS> qos, 
        Optional<Long> totalSize, 
        Optional<Boolean> associateWithQoSPolicy, 
        Optional<Long> qosPolicyID, 
        Optional<Attributes> attributes, 
        Optional<Boolean> enableSnapMirrorReplication, 
        Optional<Long> fifoSize, 
        Optional<Long> minFifoSize
        );

    
    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
     * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
     * typically required.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request);

    
    /** 
     * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
     * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
     * typically required.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(
        Long volumeID
        );

    
    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted.
     * You can use this method to purge up to 500 volumes at one time.
     * You must delete volumes using DeleteVolumes before they can be purged.
     * Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(final PurgeDeletedVolumesRequest request);

    
    /** 
     * PurgeDeletedVolumes immediately and permanently purges volumes that have been deleted.
     * You can use this method to purge up to 500 volumes at one time.
     * You must delete volumes using DeleteVolumes before they can be purged.
     * Volumes are purged by the system automatically after a period of time, so usage of this method is not typically required.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumesResult purgeDeletedVolumes(
        Optional<Long[]> volumeIDs, 
        Optional<Long[]> accountIDs, 
        Optional<Long[]> volumeAccessGroupIDs
        );

    
    /** 
     * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request);

    
    /** 
     * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(
        Long volumeAccessGroupID, 
        Long[] volumes
        );

    
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request);

    
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
     **/
    @Since("1.0")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(
        Long volumeID
        );

    
    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
     * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(final SetDefaultQoSRequest request);

    
    /** 
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
     * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
     **/
    @Since("9.0")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(
        Optional<Long> minIOPS, 
        Optional<Long> maxIOPS, 
        Optional<Long> burstIOPS
        );

    
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
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(final StartBulkVolumeReadRequest request);

    
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
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeReadResult startBulkVolumeRead(
        Long volumeID, 
        String format, 
        Optional<Long> snapshotID, 
        Optional<String> script, 
        Optional<Attributes> scriptParameters, 
        Optional<Attributes> attributes
        );

    
    /** 
     * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
     * interaction information for external data access is passed by a script running on the storage system.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(final StartBulkVolumeWriteRequest request);

    
    /** 
     * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
     * interaction information for external data access is passed by a script running on the storage system.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(
        Long volumeID, 
        String format, 
        Optional<String> script, 
        Optional<Attributes> scriptParameters, 
        Optional<Attributes> attributes
        );

    
    /** 
     * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
     * StartBulkVolumeRead or StartBulkVolumeWrite methods.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(final UpdateBulkVolumeStatusRequest request);

    
    /** 
     * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
     * StartBulkVolumeRead or StartBulkVolumeWrite methods.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(
        String key, 
        String status, 
        Optional<String> percentComplete, 
        Optional<String> message, 
        Optional<Attributes> attributes
        );

    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request);

    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(
        String name, 
        Optional<String[]> initiators, 
        Optional<Long[]> volumes, 
        Optional<Attributes> attributes
        );

    
    /** 
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(
        String name, 
        Optional<String[]> initiators, 
        Optional<Long[]> volumes, 
        Optional<Long[]> virtualNetworkID, 
        Optional<Long[]> virtualNetworkTags, 
        Optional<Attributes> attributes
        );

    
    /** 
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request);

    
    /** 
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(
        Long volumeAccessGroupID
        );

    
    /** 
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(
        Long volumeAccessGroupID, 
        Optional<Boolean> deleteOrphanInitiators
        );

    
    /** 
     * GetVolumeAccessGroupEfficiency enables you to
     * retrieve efficiency information about a volume access
     * group. Only the volume access group you provide as the
     * parameter in this API method is used to compute the
     * capacity.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(final GetVolumeAccessGroupEfficiencyRequest request);

    
    /** 
     * GetVolumeAccessGroupEfficiency enables you to
     * retrieve efficiency information about a volume access
     * group. Only the volume access group you provide as the
     * parameter in this API method is used to compute the
     * capacity.
     **/
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(
        Long volumeAccessGroupID
        );

    
    /** 
     * The GetVolumeAccessGroupLunAssignments
     * method enables you to retrieve details on LUN mappings
     * of a specified volume access group.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(final GetVolumeAccessGroupLunAssignmentsRequest request);

    
    /** 
     * The GetVolumeAccessGroupLunAssignments
     * method enables you to retrieve details on LUN mappings
     * of a specified volume access group.
     **/
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetVolumeAccessGroupLunAssignmentsResult getVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID
        );

    
    /** 
     * ListVolumeAccessGroups enables you to return
     * information about the volume access groups that are
     * currently in the system.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request);

    
    /** 
     * ListVolumeAccessGroups enables you to return
     * information about the volume access groups that are
     * currently in the system.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(
        Optional<Long> startVolumeAccessGroupID, 
        Optional<Long> limit, 
        Optional<Long[]> volumeAccessGroups
        );

    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request);

    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID, 
        Optional<String> name, 
        Optional<String[]> initiators, 
        Optional<Long[]> volumes, 
        Optional<Attributes> attributes
        );

    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(
        Long volumeAccessGroupID, 
        Optional<String> name, 
        Optional<String[]> initiators, 
        Optional<Long[]> volumes, 
        Optional<Boolean> deleteOrphanInitiators, 
        Optional<Attributes> attributes
        );

    
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
    @Since("7.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(final ModifyVolumeAccessGroupLunAssignmentsRequest request);

    
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
    @Since("7.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupLunAssignmentsResult modifyVolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID, 
        LunAssignment[] lunAssignments
        );

    
}