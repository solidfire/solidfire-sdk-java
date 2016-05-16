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

public class SolidFireElement
    extends com.solidfire.jsvcgen.client.ServiceBase
    implements SolidFireElementIF {



    /**
     * Create a new instance of  SolidFireElement with the provided requestDispatcher. You probably do not want to use
     * this constructor directly -- it is easier to use the static create methods.
     * @param requestDispatcher  The class responsible for processing request/responses and
     *                           serialization/deserialization of the JSON payload
     */
    public SolidFireElement(com.solidfire.jsvcgen.client.RequestDispatcher requestDispatcher) {
        super(requestDispatcher);
    }

    /**
     * Create a new instance of  SolidFireElement with a connection to the given MVIP and the appropriate username and
     * password.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param apiVersion the version of the API services
     * @param username   admin username
     * @param password   admin password
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement create(String mvip, String apiVersion, String username, String password) {
        checkConnection(mvip, apiVersion, of(username), of(password), true);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.<Integer>empty());
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint, username, password));
    }

    /**
     * Create a new instance of  SolidFireElement with a connection to the given MVIP with Port and the appropriate username and
     * password.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param port       the port to use
     * @param apiVersion the version of the API services
     * @param username   admin username
     * @param password   admin password
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement create(String mvip, Integer port, String apiVersion, String username, String password) {
        checkConnection(mvip, apiVersion, of(username), of(password), true);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.of(port));
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint, username, password));
    }

    /**
     * Similar to the other create method, but do not use any form of authentication. This is only useful before the
     * cluster has been created.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement create(String mvip, String apiVersion) {
        checkConnection(mvip, apiVersion, Optional.<String>empty(), Optional.<String>empty(), true);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.<Integer>empty());
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint));
    }

    /**
     * Similar to the other create method, but do not use any form of authentication. This is only useful before the
     * cluster has been created.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param port       the port to use
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement create(String mvip, Integer port, String apiVersion) {
        checkConnection(mvip, apiVersion, Optional.<String>empty(), Optional.<String>empty(), true);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.of(port));
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint));
    }

    /**
     * Create a new instance of  SolidFireElement with a connection to the given MVIP and the appropriate username and
     * password.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param apiVersion the version of the API services
     * @param username   admin username
     * @param password   admin password
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement createWithoutSecurity(String mvip, String apiVersion, String username, String password) {
        checkConnection(mvip, apiVersion, of(username), of(password), false);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.<Integer>empty());
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint, username, password));
    }

    /**
     * Create a new instance of  SolidFireElement with a connection to the given MVIP and the appropriate username and
     * password.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param port       the port to use
     * @param apiVersion the version of the API services
     * @param username   admin username
     * @param password   admin password
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement createWithoutSecurity(String mvip, Integer port, String apiVersion, String username, String password) {
        checkConnection(mvip, apiVersion, of(username), of(password), false);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.of(port));
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint, username, password));
    }

    /**
     * Similar to the other create method, but do not use any form of authentication. This is only useful before the
     * cluster has been created.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement createWithoutSecurity(String mvip, String apiVersion) {
        checkConnection(mvip, apiVersion, Optional.<String>empty(), Optional.<String>empty(), false);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.<Integer>empty());
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint));
    }

    /**
     * Similar to the other create method, but do not use any form of authentication. This is only useful before the
     * cluster has been created.
     *
     * @param mvip       the management virtual IP (or hostname)
     * @param port       the port to use
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static  SolidFireElement createWithoutSecurity(String mvip, Integer port, String apiVersion) {
        checkConnection(mvip, apiVersion, Optional.<String>empty(), Optional.<String>empty(), false);
        java.net.URL endpoint = toEndpoint(mvip, apiVersion, Optional.of(port));
        return new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint));
    }

    private static URL toEndpoint(String mvip, String apiVersion, Optional<Integer> port) {
        try {
            if (port.isPresent()){
                return new java.net.URL("https", mvip, port.get(), "/json-rpc/" + apiVersion);
            }
            else {
                return new java.net.URL("https", mvip, "/json-rpc/" + apiVersion);
            }
        } catch (java.net.MalformedURLException mue) {
            // Can't actually happen
            throw new RuntimeException(mue);
        }
    }

    private static void checkConnection(String mvip, String apiVersion, Optional<String> username, Optional<String> password, boolean withSecurity) {
        getCurrentVersion(mvip, apiVersion, username, password, withSecurity);
    }

    private static double getCurrentVersion(String mvip, String apiVersion, Optional<String> username, Optional<String> password, boolean withSecurity) {

        java.net.URL endpoint = toEndpoint(mvip, "0.0", Optional.<Integer>empty());

        final  SolidFireElement cluster;

        if (withSecurity && username.isPresent() && password.isPresent()) {
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint, username.get(), password.get()));
        } else if (withSecurity && !username.isPresent() && !password.isPresent()) {
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint));
        } else if (!withSecurity && username.isPresent() && password.isPresent()) {
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint, username.get(), password.get()));
        } else if (!withSecurity && !username.isPresent() && !password.isPresent()) {
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcher(endpoint));
        } else {
            throw new ApiException("Missing " + (!username.isPresent() ? "username" : "password") + "");
        }

        try {
            GetAPIResult apiResult = cluster.getAPI();
            Double currentVersion = apiResult.getCurrentVersion();
            if(!Arrays.asList(apiResult.getSupportedVersions()).contains(Double.valueOf(apiVersion))){
                throw new ApiException(String.format("API Version [%s] not supported on this cluster. Supported versions %s",apiVersion, Arrays.toString(apiResult.getSupportedVersions())));
            }
            return currentVersion;
        } catch (final ApiException e) {
            throw e;
        } catch (final Exception e) {
            throw new ApiException(e);
        }
    }

    @Override
    public AddAccountResult addAccount(final AddAccountRequest request) {
        return super.sendRequest("AddAccount", request, AddAccountRequest.class, AddAccountResult.class );
    }

    @Override
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request) {
        return super.sendRequest("GetAccountByID", request, GetAccountByIDRequest.class, GetAccountResult.class );
    }


    @Override
    public GetAccountResult getAccountByID(Long accountID) {
        return this.getAccountByID( new GetAccountByIDRequest(accountID));
    }

    @Override
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request) {
        return super.sendRequest("GetAccountByName", request, GetAccountByNameRequest.class, GetAccountResult.class );
    }


    @Override
    public GetAccountResult getAccountByName(String username) {
        return this.getAccountByName( new GetAccountByNameRequest(username));
    }

    @Override
    public ListAccountsResult listAccounts(final ListAccountsRequest request) {
        return super.sendRequest("ListAccounts", request, ListAccountsRequest.class, ListAccountsResult.class );
    }


    @Override
    public ListAccountsResult listAccounts(Optional<Long> startAccountID, Optional<Long> limit) {
        return this.listAccounts( new ListAccountsRequest(startAccountID, limit));
    }

    @Override
    public ModifyAccountResult modifyAccount(final ModifyAccountRequest request) {
        return super.sendRequest("ModifyAccount", request, ModifyAccountRequest.class, ModifyAccountResult.class );
    }

    @Override
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request) {
        return super.sendRequest("RemoveAccount", request, RemoveAccountRequest.class, RemoveAccountResult.class );
    }


    @Override
    public RemoveAccountResult removeAccount(Long accountID) {
        return this.removeAccount( new RemoveAccountRequest(accountID));
    }

    @Override
    public GetClusterCapacityResult getClusterCapacity(final GetClusterCapacityRequest request) {
        return super.sendRequest("GetClusterCapacity", request, GetClusterCapacityRequest.class, GetClusterCapacityResult.class );
    }


    @Override
    public GetClusterCapacityResult getClusterCapacity() {
        return this.getClusterCapacity( new GetClusterCapacityRequest());
    }

    @Override
    public GetClusterInfoResult getClusterInfo(final GetClusterInfoRequest request) {
        return super.sendRequest("GetClusterInfo", request, GetClusterInfoRequest.class, GetClusterInfoResult.class );
    }


    @Override
    public GetClusterInfoResult getClusterInfo() {
        return this.getClusterInfo( new GetClusterInfoRequest());
    }

    @Override
    public GetClusterVersionInfoResult getClusterVersionInfo(final GetClusterVersionInfoRequest request) {
        return super.sendRequest("GetClusterVersionInfo", request, GetClusterVersionInfoRequest.class, GetClusterVersionInfoResult.class );
    }


    @Override
    public GetClusterVersionInfoResult getClusterVersionInfo() {
        return this.getClusterVersionInfo( new GetClusterVersionInfoRequest());
    }

    @Override
    public GetLimitsResult getLimits(final GetLimitsRequest request) {
        return super.sendRequest("GetLimits", request, GetLimitsRequest.class, GetLimitsResult.class );
    }


    @Override
    public GetLimitsResult getLimits() {
        return this.getLimits( new GetLimitsRequest());
    }

    @Override
    public ListEventsResult listEvents(final ListEventsRequest request) {
        return super.sendRequest("ListEvents", request, ListEventsRequest.class, ListEventsResult.class );
    }

    @Override
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request) {
        return super.sendRequest("ListClusterFaults", request, ListClusterFaultsRequest.class, ListClusterFaultsResult.class );
    }

    @Override
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request) {
        return super.sendRequest("ClearClusterFaults", request, ClearClusterFaultsRequest.class, ClearClusterFaultsResult.class );
    }


    @Override
    public ClearClusterFaultsResult clearClusterFaults(Optional<String> faultTypes) {
        return this.clearClusterFaults( new ClearClusterFaultsRequest(faultTypes));
    }

    @Override
    public GetClusterConfigResult getClusterConfig(final GetClusterConfigRequest request) {
        return super.sendRequest("GetClusterConfig", request, GetClusterConfigRequest.class, GetClusterConfigResult.class );
    }


    @Override
    public GetClusterConfigResult getClusterConfig() {
        return this.getClusterConfig( new GetClusterConfigRequest());
    }

    @Override
    public ListClusterAdminsResult listClusterAdmins(final ListClusterAdminsRequest request) {
        return super.sendRequest("ListClusterAdmins", request, ListClusterAdminsRequest.class, ListClusterAdminsResult.class );
    }


    @Override
    public ListClusterAdminsResult listClusterAdmins() {
        return this.listClusterAdmins( new ListClusterAdminsRequest());
    }

    @Override
    public AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request) {
        return super.sendRequest("AddClusterAdmin", request, AddClusterAdminRequest.class, AddClusterAdminResult.class );
    }

    @Override
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request) {
        return super.sendRequest("ModifyClusterAdmin", request, ModifyClusterAdminRequest.class, ModifyClusterAdminResult.class );
    }

    @Override
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request) {
        return super.sendRequest("RemoveClusterAdmin", request, RemoveClusterAdminRequest.class, RemoveClusterAdminResult.class );
    }


    @Override
    public RemoveClusterAdminResult removeClusterAdmin(Long clusterAdminID) {
        return this.removeClusterAdmin( new RemoveClusterAdminRequest(clusterAdminID));
    }

    @Override
    public SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request) {
        return super.sendRequest("SetClusterConfig", request, SetClusterConfigRequest.class, SetClusterConfigResult.class );
    }


    @Override
    public SetClusterConfigResult setClusterConfig(ClusterConfig cluster) {
        return this.setClusterConfig( new SetClusterConfigRequest(cluster));
    }

    @Override
    public GetAPIResult getAPI(final GetAPIRequest request) {
        return super.sendRequest("GetAPI", request, GetAPIRequest.class, GetAPIResult.class );
    }


    @Override
    public GetAPIResult getAPI() {
        return this.getAPI( new GetAPIRequest());
    }

    @Override
    public GetCurrentClusterAdminResult getCurrentClusterAdmin(final GetCurrentClusterAdminRequest request) {
        return super.sendRequest("GetCurrentClusterAdmin", request, GetCurrentClusterAdminRequest.class, GetCurrentClusterAdminResult.class );
    }


    @Override
    public GetCurrentClusterAdminResult getCurrentClusterAdmin() {
        return this.getCurrentClusterAdmin( new GetCurrentClusterAdminRequest());
    }

    @Override
    public GetAsyncResultResult getAsyncResult(final GetAsyncResultRequest request) {
        return super.sendRequest("GetAsyncResult", request, GetAsyncResultRequest.class, GetAsyncResultResult.class );
    }


    @Override
    public GetAsyncResultResult getAsyncResult(Long asyncHandle) {
        return this.getAsyncResult( new GetAsyncResultRequest(asyncHandle));
    }

    @Override
    public ListActiveNodesResult listActiveNodes(final ListActiveNodesRequest request) {
        return super.sendRequest("ListActiveNodes", request, ListActiveNodesRequest.class, ListActiveNodesResult.class );
    }


    @Override
    public ListActiveNodesResult listActiveNodes() {
        return this.listActiveNodes( new ListActiveNodesRequest());
    }

    @Override
    public ListAllNodesResult listAllNodes(final ListAllNodesRequest request) {
        return super.sendRequest("ListAllNodes", request, ListAllNodesRequest.class, ListAllNodesResult.class );
    }


    @Override
    public ListAllNodesResult listAllNodes() {
        return this.listAllNodes( new ListAllNodesRequest());
    }

    @Override
    public ListPendingNodesResult listPendingNodes(final ListPendingNodesRequest request) {
        return super.sendRequest("ListPendingNodes", request, ListPendingNodesRequest.class, ListPendingNodesResult.class );
    }


    @Override
    public ListPendingNodesResult listPendingNodes() {
        return this.listPendingNodes( new ListPendingNodesRequest());
    }

    @Override
    public AddNodesResult addNodes(final AddNodesRequest request) {
        return super.sendRequest("AddNodes", request, AddNodesRequest.class, AddNodesResult.class );
    }


    @Override
    public AddNodesResult addNodes(Long[] pendingNodes) {
        return this.addNodes( new AddNodesRequest(pendingNodes));
    }

    @Override
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request) {
        return super.sendRequest("RemoveNodes", request, RemoveNodesRequest.class, RemoveNodesResult.class );
    }


    @Override
    public RemoveNodesResult removeNodes(Long[] nodes) {
        return this.removeNodes( new RemoveNodesRequest(nodes));
    }

    @Override
    public GetNetworkConfigResult getNetworkConfig(final GetNetworkConfigRequest request) {
        return super.sendRequest("GetNetworkConfig", request, GetNetworkConfigRequest.class, GetNetworkConfigResult.class );
    }


    @Override
    public GetNetworkConfigResult getNetworkConfig() {
        return this.getNetworkConfig( new GetNetworkConfigRequest());
    }

    @Override
    public SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request) {
        return super.sendRequest("SetNetworkConfig", request, SetNetworkConfigRequest.class, SetNetworkConfigResult.class );
    }


    @Override
    public SetNetworkConfigResult setNetworkConfig(Network network) {
        return this.setNetworkConfig( new SetNetworkConfigRequest(network));
    }

    @Override
    public GetConfigResult getConfig(final GetConfigRequest request) {
        return super.sendRequest("GetConfig", request, GetConfigRequest.class, GetConfigResult.class );
    }


    @Override
    public GetConfigResult getConfig() {
        return this.getConfig( new GetConfigRequest());
    }

    @Override
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request) {
        return super.sendRequest("CreateSnapshot", request, CreateSnapshotRequest.class, CreateSnapshotResult.class );
    }

    @Override
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request) {
        return super.sendRequest("DeleteSnapshot", request, DeleteSnapshotRequest.class, DeleteSnapshotResult.class );
    }


    @Override
    public DeleteSnapshotResult deleteSnapshot(Long snapshotID) {
        return this.deleteSnapshot( new DeleteSnapshotRequest(snapshotID));
    }

    @Override
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request) {
        return super.sendRequest("ListSnapshots", request, ListSnapshotsRequest.class, ListSnapshotsResult.class );
    }


    @Override
    public ListSnapshotsResult listSnapshots(Optional<Long> volumeID) {
        return this.listSnapshots( new ListSnapshotsRequest(volumeID));
    }

    @Override
    @Since("8.0")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request) {
        return super.sendRequest("ModifySnapshot", request, ModifySnapshotRequest.class, ModifySnapshotResult.class );
    }


    @Override
    @Since("8.0")
    public ModifySnapshotResult modifySnapshot(Long snapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication) {
        return this.modifySnapshot( new ModifySnapshotRequest(snapshotID, expirationTime, enableRemoteReplication));
    }

    @Override
    public CreateSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request) {
        return super.sendRequest("RollbackToSnapshot", request, RollbackToSnapshotRequest.class, CreateSnapshotResult.class );
    }

    @Override
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request) {
        return super.sendRequest("CreateGroupSnapshot", request, CreateGroupSnapshotRequest.class, CreateGroupSnapshotResult.class );
    }

    @Override
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request) {
        return super.sendRequest("DeleteGroupSnapshot", request, DeleteGroupSnapshotRequest.class, DeleteGroupSnapshotResult.class );
    }


    @Override
    public DeleteGroupSnapshotResult deleteGroupSnapshot(Long groupSnapshotID, Boolean saveMembers) {
        return this.deleteGroupSnapshot( new DeleteGroupSnapshotRequest(groupSnapshotID, saveMembers));
    }

    @Override
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request) {
        return super.sendRequest("ListGroupSnapshots", request, ListGroupSnapshotsRequest.class, ListGroupSnapshotsResult.class );
    }


    @Override
    public ListGroupSnapshotsResult listGroupSnapshots(Optional<Long> volumeID) {
        return this.listGroupSnapshots( new ListGroupSnapshotsRequest(volumeID));
    }

    @Override
    @Since("8.0")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request) {
        return super.sendRequest("ModifyGroupSnapshot", request, ModifyGroupSnapshotRequest.class, ModifyGroupSnapshotResult.class );
    }


    @Override
    @Since("8.0")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(Long groupSnapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication) {
        return this.modifyGroupSnapshot( new ModifyGroupSnapshotRequest(groupSnapshotID, expirationTime, enableRemoteReplication));
    }

    @Override
    @Since("7.0")
    public CreateGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request) {
        return super.sendRequest("RollbackToGroupSnapshot", request, RollbackToGroupSnapshotRequest.class, CreateGroupSnapshotResult.class );
    }

    @Override
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request) {
        return super.sendRequest("CloneVolume", request, CloneVolumeRequest.class, CloneVolumeResult.class );
    }

    @Override
    public CreateVolumeResult createVolume(final CreateVolumeRequest request) {
        return super.sendRequest("CreateVolume", request, CreateVolumeRequest.class, CreateVolumeResult.class );
    }

    @Override
    public DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request) {
        return super.sendRequest("DeleteVolume", request, DeleteVolumeRequest.class, DeleteVolumeResult.class );
    }


    @Override
    public DeleteVolumeResult deleteVolume(Long volumeID) {
        return this.deleteVolume( new DeleteVolumeRequest(volumeID));
    }

    @Override
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request) {
        return super.sendRequest("GetVolumeStats", request, GetVolumeStatsRequest.class, GetVolumeStatsResult.class );
    }


    @Override
    public GetVolumeStatsResult getVolumeStats(Long volumeID) {
        return this.getVolumeStats( new GetVolumeStatsRequest(volumeID));
    }

    @Override
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request) {
        return super.sendRequest("GetVolumeEfficiency", request, GetVolumeEfficiencyRequest.class, GetVolumeEfficiencyResult.class );
    }


    @Override
    public GetVolumeEfficiencyResult getVolumeEfficiency(Long volumeID, Optional<Boolean> force) {
        return this.getVolumeEfficiency( new GetVolumeEfficiencyRequest(volumeID, force));
    }

    @Override
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request) {
        return super.sendRequest("ListActiveVolumes", request, ListActiveVolumesRequest.class, ListActiveVolumesResult.class );
    }


    @Override
    public ListActiveVolumesResult listActiveVolumes(Optional<Long> startVolumeID, Optional<Long> limit) {
        return this.listActiveVolumes( new ListActiveVolumesRequest(startVolumeID, limit));
    }

    @Override
    public ListDeletedVolumesResult listDeletedVolumes(final ListDeletedVolumesRequest request) {
        return super.sendRequest("ListDeletedVolumes", request, ListDeletedVolumesRequest.class, ListDeletedVolumesResult.class );
    }


    @Override
    public ListDeletedVolumesResult listDeletedVolumes() {
        return this.listDeletedVolumes( new ListDeletedVolumesRequest());
    }

    @Override
    public ListISCSISessionsResult listISCSISessions(final ListISCSISessionsRequest request) {
        return super.sendRequest("ListISCSISessions", request, ListISCSISessionsRequest.class, ListISCSISessionsResult.class );
    }


    @Override
    public ListISCSISessionsResult listISCSISessions() {
        return this.listISCSISessions( new ListISCSISessionsRequest());
    }

    @Override
    @Since("8.0")
    public ListVolumesResult listVolumes(final ListVolumesRequest request) {
        return super.sendRequest("ListVolumes", request, ListVolumesRequest.class, ListVolumesResult.class );
    }

    @Override
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request) {
        return super.sendRequest("ListVolumesForAccount", request, ListVolumesForAccountRequest.class, ListVolumesForAccountResult.class );
    }


    @Override
    public ListVolumesForAccountResult listVolumesForAccount(Long accountID, Optional<Long> startVolumeID, Optional<Long> limit) {
        return this.listVolumesForAccount( new ListVolumesForAccountRequest(accountID, startVolumeID, limit));
    }

    @Override
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request) {
        return super.sendRequest("ListVolumeStatsByAccount", request, ListVolumeStatsByAccountRequest.class, ListVolumeStatsByAccountResult.class );
    }


    @Override
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount() {
        return this.listVolumeStatsByAccount( new ListVolumeStatsByAccountRequest());
    }

    @Override
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request) {
        return super.sendRequest("ListVolumeStatsByVolume", request, ListVolumeStatsByVolumeRequest.class, ListVolumeStatsByVolumeResult.class );
    }


    @Override
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume() {
        return this.listVolumeStatsByVolume( new ListVolumeStatsByVolumeRequest());
    }

    @Override
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request) {
        return super.sendRequest("ListVolumeStatsByVolumeAccessGroup", request, ListVolumeStatsByVolumeAccessGroupRequest.class, ListVolumeStatsByVolumeAccessGroupResult.class );
    }


    @Override
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(Optional<Long[]> volumeAccessGroups) {
        return this.listVolumeStatsByVolumeAccessGroup( new ListVolumeStatsByVolumeAccessGroupRequest(volumeAccessGroups));
    }

    @Override
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request) {
        return super.sendRequest("ModifyVolume", request, ModifyVolumeRequest.class, ModifyVolumeResult.class );
    }

    @Override
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request) {
        return super.sendRequest("PurgeDeletedVolume", request, PurgeDeletedVolumeRequest.class, PurgeDeletedVolumeResult.class );
    }


    @Override
    public PurgeDeletedVolumeResult purgeDeletedVolume(Long volumeID) {
        return this.purgeDeletedVolume( new PurgeDeletedVolumeRequest(volumeID));
    }

    @Override
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request) {
        return super.sendRequest("RestoreDeletedVolume", request, RestoreDeletedVolumeRequest.class, RestoreDeletedVolumeResult.class );
    }


    @Override
    public RestoreDeletedVolumeResult restoreDeletedVolume(Long volumeID) {
        return this.restoreDeletedVolume( new RestoreDeletedVolumeRequest(volumeID));
    }

    @Override
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request) {
        return super.sendRequest("CreateVolumeAccessGroup", request, CreateVolumeAccessGroupRequest.class, CreateVolumeAccessGroupResult.class );
    }

    @Override
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request) {
        return super.sendRequest("ListVolumeAccessGroups", request, ListVolumeAccessGroupsRequest.class, ListVolumeAccessGroupsResult.class );
    }


    @Override
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(Optional<Long> startVolumeAccessGroupID, Optional<Long> limit) {
        return this.listVolumeAccessGroups( new ListVolumeAccessGroupsRequest(startVolumeAccessGroupID, limit));
    }

    @Override
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request) {
        return super.sendRequest("DeleteVolumeAccessGroup", request, DeleteVolumeAccessGroupRequest.class, DeleteVolumeAccessGroupResult.class );
    }


    @Override
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(Long volumeAccessGroupID) {
        return this.deleteVolumeAccessGroup( new DeleteVolumeAccessGroupRequest(volumeAccessGroupID));
    }

    @Override
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request) {
        return super.sendRequest("ModifyVolumeAccessGroup", request, ModifyVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );
    }

    @Override
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request) {
        return super.sendRequest("AddInitiatorsToVolumeAccessGroup", request, AddInitiatorsToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );
    }


    @Override
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators) {
        return this.addInitiatorsToVolumeAccessGroup( new AddInitiatorsToVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
    }

    @Override
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request) {
        return super.sendRequest("RemoveInitiatorsFromVolumeAccessGroup", request, RemoveInitiatorsFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );
    }


    @Override
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators) {
        return this.removeInitiatorsFromVolumeAccessGroup( new RemoveInitiatorsFromVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
    }

    @Override
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request) {
        return super.sendRequest("AddVolumesToVolumeAccessGroup", request, AddVolumesToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );
    }


    @Override
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes) {
        return this.addVolumesToVolumeAccessGroup( new AddVolumesToVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }

    @Override
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request) {
        return super.sendRequest("RemoveVolumesFromVolumeAccessGroup", request, RemoveVolumesFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );
    }


    @Override
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes) {
        return this.removeVolumesFromVolumeAccessGroup( new RemoveVolumesFromVolumeAccessGroupRequest(volumeAccessGroupID, volumes));
    }

}
