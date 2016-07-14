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

public class SolidFireElement
    extends com.solidfire.client.ElementServiceBase
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
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint, username.get(), password.get()));
        } else if (!withSecurity && !username.isPresent() && !password.isPresent()) {
            cluster = new  SolidFireElement(new com.solidfire.jsvcgen.client.HttpsRequestDispatcherWithoutSecurity(endpoint));
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
        final AddAccountResult result = super.sendRequest( "AddAccount", request, AddAccountRequest.class, AddAccountResult.class );

        return result;
    }

    @Override
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request) {
        final GetAccountResult result = super.sendRequest( "GetAccountByID", request, GetAccountByIDRequest.class, GetAccountResult.class );

        return result;
    }


    @Override
    public GetAccountResult getAccountByID(Long accountID) {
        final GetAccountByIDRequest request = new GetAccountByIDRequest( accountID);
        final GetAccountResult result = this.getAccountByID( request );

        return result;
    }

    @Override
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request) {
        final GetAccountResult result = super.sendRequest( "GetAccountByName", request, GetAccountByNameRequest.class, GetAccountResult.class );

        return result;
    }


    @Override
    public GetAccountResult getAccountByName(String username) {
        final GetAccountByNameRequest request = new GetAccountByNameRequest( username);
        final GetAccountResult result = this.getAccountByName( request );

        return result;
    }

    @Override
    public ListAccountsResult listAccounts(final ListAccountsRequest request) {
        final ListAccountsResult result = super.sendRequest( "ListAccounts", request, ListAccountsRequest.class, ListAccountsResult.class );

        return result;
    }


    @Override
    public ListAccountsResult listAccounts(Optional<Long> startAccountID, Optional<Long> limit) {
        final ListAccountsRequest request = new ListAccountsRequest( startAccountID, limit);
        final ListAccountsResult result = this.listAccounts( request );

        return result;
    }

    @Override
    public ModifyAccountResult modifyAccount(final ModifyAccountRequest request) {
        final ModifyAccountResult result = super.sendRequest( "ModifyAccount", request, ModifyAccountRequest.class, ModifyAccountResult.class );

        return result;
    }

    @Override
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request) {
        final RemoveAccountResult result = super.sendRequest( "RemoveAccount", request, RemoveAccountRequest.class, RemoveAccountResult.class );

        return result;
    }


    @Override
    public RemoveAccountResult removeAccount(Long accountID) {
        final RemoveAccountRequest request = new RemoveAccountRequest( accountID);
        final RemoveAccountResult result = this.removeAccount( request );

        return result;
    }

    @Override
    public GetEfficiencyResult getAccountEfficiency(final GetAccountEfficiencyRequest request) {
        final GetEfficiencyResult result = super.sendRequest( "GetAccountEfficiency", request, GetAccountEfficiencyRequest.class, GetEfficiencyResult.class );

        return result;
    }


    @Override
    public GetEfficiencyResult getAccountEfficiency(Long accountID, Optional<Boolean> force) {
        final GetAccountEfficiencyRequest request = new GetAccountEfficiencyRequest( accountID, force);
        final GetEfficiencyResult result = this.getAccountEfficiency( request );

        return result;
    }

    @Override
    public CreateBackupTargetResult createBackupTarget(final CreateBackupTargetRequest request) {
        final CreateBackupTargetResult result = super.sendRequest( "CreateBackupTarget", request, CreateBackupTargetRequest.class, CreateBackupTargetResult.class );

        return result;
    }


    @Override
    public CreateBackupTargetResult createBackupTarget(String name, Optional<java.util.Map<String, Object>> attributes) {
        final CreateBackupTargetRequest request = new CreateBackupTargetRequest( name, attributes);
        final CreateBackupTargetResult result = this.createBackupTarget( request );

        return result;
    }

    @Override
    public GetBackupTargetResult getBackupTarget(final GetBackupTargetRequest request) {
        final GetBackupTargetResult result = super.sendRequest( "GetBackupTarget", request, GetBackupTargetRequest.class, GetBackupTargetResult.class );

        return result;
    }


    @Override
    public GetBackupTargetResult getBackupTarget(Long backupTargetID) {
        final GetBackupTargetRequest request = new GetBackupTargetRequest( backupTargetID);
        final GetBackupTargetResult result = this.getBackupTarget( request );

        return result;
    }

    @Override
    public ListBackupTargetsResult listBackupTargets(final ListBackupTargetsRequest request) {
        final ListBackupTargetsResult result = super.sendRequest( "ListBackupTargets", request, ListBackupTargetsRequest.class, ListBackupTargetsResult.class );

        return result;
    }


    @Override
    public ListBackupTargetsResult listBackupTargets() {
        final ListBackupTargetsRequest request = new ListBackupTargetsRequest( );
        final ListBackupTargetsResult result = this.listBackupTargets( request );

        return result;
    }

    @Override
    public ModifyBackupTargetResult modifyBackupTarget(final ModifyBackupTargetRequest request) {
        final ModifyBackupTargetResult result = super.sendRequest( "ModifyBackupTarget", request, ModifyBackupTargetRequest.class, ModifyBackupTargetResult.class );

        return result;
    }


    @Override
    public ModifyBackupTargetResult modifyBackupTarget(Long backupTargetID, Optional<String> name, Optional<java.util.Map<String, Object>> attributes) {
        final ModifyBackupTargetRequest request = new ModifyBackupTargetRequest( backupTargetID, name, attributes);
        final ModifyBackupTargetResult result = this.modifyBackupTarget( request );

        return result;
    }

    @Override
    public RemoveBackupTargetResult removeBackupTarget(final RemoveBackupTargetRequest request) {
        final RemoveBackupTargetResult result = super.sendRequest( "RemoveBackupTarget", request, RemoveBackupTargetRequest.class, RemoveBackupTargetResult.class );

        return result;
    }


    @Override
    public RemoveBackupTargetResult removeBackupTarget(Long backupTargetID) {
        final RemoveBackupTargetRequest request = new RemoveBackupTargetRequest( backupTargetID);
        final RemoveBackupTargetResult result = this.removeBackupTarget( request );

        return result;
    }

    @Override
    public GetClusterCapacityResult getClusterCapacity(final GetClusterCapacityRequest request) {
        final GetClusterCapacityResult result = super.sendRequest( "GetClusterCapacity", request, GetClusterCapacityRequest.class, GetClusterCapacityResult.class );

        return result;
    }


    @Override
    public GetClusterCapacityResult getClusterCapacity() {
        final GetClusterCapacityRequest request = new GetClusterCapacityRequest( );
        final GetClusterCapacityResult result = this.getClusterCapacity( request );

        return result;
    }

    @Override
    public GetClusterInfoResult getClusterInfo(final GetClusterInfoRequest request) {
        final GetClusterInfoResult result = super.sendRequest( "GetClusterInfo", request, GetClusterInfoRequest.class, GetClusterInfoResult.class );

        return result;
    }


    @Override
    public GetClusterInfoResult getClusterInfo() {
        final GetClusterInfoRequest request = new GetClusterInfoRequest( );
        final GetClusterInfoResult result = this.getClusterInfo( request );

        return result;
    }

    @Override
    public GetClusterVersionInfoResult getClusterVersionInfo(final GetClusterVersionInfoRequest request) {
        final GetClusterVersionInfoResult result = super.sendRequest( "GetClusterVersionInfo", request, GetClusterVersionInfoRequest.class, GetClusterVersionInfoResult.class );

        return result;
    }


    @Override
    public GetClusterVersionInfoResult getClusterVersionInfo() {
        final GetClusterVersionInfoRequest request = new GetClusterVersionInfoRequest( );
        final GetClusterVersionInfoResult result = this.getClusterVersionInfo( request );

        return result;
    }

    @Override
    public GetLimitsResult getLimits(final GetLimitsRequest request) {
        final GetLimitsResult result = super.sendRequest( "GetLimits", request, GetLimitsRequest.class, GetLimitsResult.class );

        return result;
    }


    @Override
    public GetLimitsResult getLimits() {
        final GetLimitsRequest request = new GetLimitsRequest( );
        final GetLimitsResult result = this.getLimits( request );

        return result;
    }

    @Override
    public ListEventsResult listEvents(final ListEventsRequest request) {
        final ListEventsResult result = super.sendRequest( "ListEvents", request, ListEventsRequest.class, ListEventsResult.class );

        return result;
    }

    @Override
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request) {
        final ListClusterFaultsResult result = super.sendRequest( "ListClusterFaults", request, ListClusterFaultsRequest.class, ListClusterFaultsResult.class );

        return result;
    }

    @Override
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request) {
        final ClearClusterFaultsResult result = super.sendRequest( "ClearClusterFaults", request, ClearClusterFaultsRequest.class, ClearClusterFaultsResult.class );

        return result;
    }


    @Override
    public ClearClusterFaultsResult clearClusterFaults(Optional<String> faultTypes) {
        final ClearClusterFaultsRequest request = new ClearClusterFaultsRequest( faultTypes);
        final ClearClusterFaultsResult result = this.clearClusterFaults( request );

        return result;
    }

    @Override
    public GetClusterConfigResult getClusterConfig(final GetClusterConfigRequest request) {
        final GetClusterConfigResult result = super.sendRequest( "GetClusterConfig", request, GetClusterConfigRequest.class, GetClusterConfigResult.class );

        return result;
    }


    @Override
    public GetClusterConfigResult getClusterConfig() {
        final GetClusterConfigRequest request = new GetClusterConfigRequest( );
        final GetClusterConfigResult result = this.getClusterConfig( request );

        return result;
    }

    @Override
    public GetClusterFullThresholdResult getClusterFullThreshold(final GetClusterFullThresholdRequest request) {
        final GetClusterFullThresholdResult result = super.sendRequest( "GetClusterFullThreshold", request, GetClusterFullThresholdRequest.class, GetClusterFullThresholdResult.class );

        return result;
    }


    @Override
    public GetClusterFullThresholdResult getClusterFullThreshold() {
        final GetClusterFullThresholdRequest request = new GetClusterFullThresholdRequest( );
        final GetClusterFullThresholdResult result = this.getClusterFullThreshold( request );

        return result;
    }

    @Override
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request) {
        final ModifyClusterFullThresholdResult result = super.sendRequest( "ModifyClusterFullThreshold", request, ModifyClusterFullThresholdRequest.class, ModifyClusterFullThresholdResult.class );

        return result;
    }


    @Override
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(Optional<Long> stage2AwareThreshold, @Since("8.0") Optional<Long> stage3BlockThresholdPercent, Optional<Long> maxMetadataOverProvisionFactor) {
        final ModifyClusterFullThresholdRequest request = new ModifyClusterFullThresholdRequest( stage2AwareThreshold, stage3BlockThresholdPercent, maxMetadataOverProvisionFactor);
        final ModifyClusterFullThresholdResult result = this.modifyClusterFullThreshold( request );

        return result;
    }

    @Override
    public GetClusterStatsResult getClusterStats(final GetClusterStatsRequest request) {
        final GetClusterStatsResult result = super.sendRequest( "GetClusterStats", request, GetClusterStatsRequest.class, GetClusterStatsResult.class );

        return result;
    }


    @Override
    public GetClusterStatsResult getClusterStats() {
        final GetClusterStatsRequest request = new GetClusterStatsRequest( );
        final GetClusterStatsResult result = this.getClusterStats( request );

        return result;
    }

    @Override
    public ListClusterAdminsResult listClusterAdmins(final ListClusterAdminsRequest request) {
        final ListClusterAdminsResult result = super.sendRequest( "ListClusterAdmins", request, ListClusterAdminsRequest.class, ListClusterAdminsResult.class );

        return result;
    }


    @Override
    public ListClusterAdminsResult listClusterAdmins() {
        final ListClusterAdminsRequest request = new ListClusterAdminsRequest( );
        final ListClusterAdminsResult result = this.listClusterAdmins( request );

        return result;
    }

    @Override
    public AddClusterAdminResult addClusterAdmin(final AddClusterAdminRequest request) {
        final AddClusterAdminResult result = super.sendRequest( "AddClusterAdmin", request, AddClusterAdminRequest.class, AddClusterAdminResult.class );

        return result;
    }

    @Override
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request) {
        final ModifyClusterAdminResult result = super.sendRequest( "ModifyClusterAdmin", request, ModifyClusterAdminRequest.class, ModifyClusterAdminResult.class );

        return result;
    }

    @Override
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request) {
        final RemoveClusterAdminResult result = super.sendRequest( "RemoveClusterAdmin", request, RemoveClusterAdminRequest.class, RemoveClusterAdminResult.class );

        return result;
    }


    @Override
    public RemoveClusterAdminResult removeClusterAdmin(Long clusterAdminID) {
        final RemoveClusterAdminRequest request = new RemoveClusterAdminRequest( clusterAdminID);
        final RemoveClusterAdminResult result = this.removeClusterAdmin( request );

        return result;
    }

    @Override
    public SetClusterConfigResult setClusterConfig(final SetClusterConfigRequest request) {
        final SetClusterConfigResult result = super.sendRequest( "SetClusterConfig", request, SetClusterConfigRequest.class, SetClusterConfigResult.class );

        return result;
    }


    @Override
    public SetClusterConfigResult setClusterConfig(ClusterConfig cluster) {
        final SetClusterConfigRequest request = new SetClusterConfigRequest( cluster);
        final SetClusterConfigResult result = this.setClusterConfig( request );

        return result;
    }

    @Override
    @Since("8.0")
    public GetSnmpACLResult getSnmpACL(final GetSnmpACLRequest request) {
        final GetSnmpACLResult result = super.sendRequest( "GetSnmpACL", request, GetSnmpACLRequest.class, GetSnmpACLResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public GetSnmpACLResult getSnmpACL() {
        final GetSnmpACLRequest request = new GetSnmpACLRequest( );
        final GetSnmpACLResult result = this.getSnmpACL( request );

        return result;
    }

    @Override
    @Since("8.0")
    public SetSnmpACLResult setSnmpACL(final SetSnmpACLRequest request) {
        final SetSnmpACLResult result = super.sendRequest( "SetSnmpACL", request, SetSnmpACLRequest.class, SetSnmpACLResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public SetSnmpACLResult setSnmpACL(SnmpNetwork[] networks, SnmpV3UsmUser[] usmUsers) {
        final SetSnmpACLRequest request = new SetSnmpACLRequest( networks, usmUsers);
        final SetSnmpACLResult result = this.setSnmpACL( request );

        return result;
    }

    @Override
    public GetSnmpTrapInfoResult getSnmpTrapInfo(final GetSnmpTrapInfoRequest request) {
        final GetSnmpTrapInfoResult result = super.sendRequest( "GetSnmpTrapInfo", request, GetSnmpTrapInfoRequest.class, GetSnmpTrapInfoResult.class );

        return result;
    }


    @Override
    public GetSnmpTrapInfoResult getSnmpTrapInfo() {
        final GetSnmpTrapInfoRequest request = new GetSnmpTrapInfoRequest( );
        final GetSnmpTrapInfoResult result = this.getSnmpTrapInfo( request );

        return result;
    }

    @Override
    public SetSnmpTrapInfoResult setSnmpTrapInfo(final SetSnmpTrapInfoRequest request) {
        final SetSnmpTrapInfoResult result = super.sendRequest( "SetSnmpTrapInfo", request, SetSnmpTrapInfoRequest.class, SetSnmpTrapInfoResult.class );

        return result;
    }

    @Override
    public EnableSnmpResult enableSnmp(final EnableSnmpRequest request) {
        final EnableSnmpResult result = super.sendRequest( "EnableSnmp", request, EnableSnmpRequest.class, EnableSnmpResult.class );

        return result;
    }


    @Override
    public EnableSnmpResult enableSnmp(Boolean snmpV3Enabled) {
        final EnableSnmpRequest request = new EnableSnmpRequest( snmpV3Enabled);
        final EnableSnmpResult result = this.enableSnmp( request );

        return result;
    }

    @Override
    public DisableSnmpResult disableSnmp(final DisableSnmpRequest request) {
        final DisableSnmpResult result = super.sendRequest( "DisableSnmp", request, DisableSnmpRequest.class, DisableSnmpResult.class );

        return result;
    }


    @Override
    public DisableSnmpResult disableSnmp() {
        final DisableSnmpRequest request = new DisableSnmpRequest( );
        final DisableSnmpResult result = this.disableSnmp( request );

        return result;
    }

    @Override
    public GetSnmpInfoResult getSnmpInfo(final GetSnmpInfoRequest request) {
        final GetSnmpInfoResult result = super.sendRequest( "GetSnmpInfo", request, GetSnmpInfoRequest.class, GetSnmpInfoResult.class );

        return result;
    }


    @Override
    public GetSnmpInfoResult getSnmpInfo() {
        final GetSnmpInfoRequest request = new GetSnmpInfoRequest( );
        final GetSnmpInfoResult result = this.getSnmpInfo( request );

        return result;
    }

    @Override
    public SetSnmpInfoResult setSnmpInfo(final SetSnmpInfoRequest request) {
        final SetSnmpInfoResult result = super.sendRequest( "SetSnmpInfo", request, SetSnmpInfoRequest.class, SetSnmpInfoResult.class );

        return result;
    }

    @Override
    @Since("8.0")
    public GetSnmpStateResult getSnmpState(final GetSnmpStateRequest request) {
        final GetSnmpStateResult result = super.sendRequest( "GetSnmpState", request, GetSnmpStateRequest.class, GetSnmpStateResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public GetSnmpStateResult getSnmpState() {
        final GetSnmpStateRequest request = new GetSnmpStateRequest( );
        final GetSnmpStateResult result = this.getSnmpState( request );

        return result;
    }

    @Override
    public GetAPIResult getAPI(final GetAPIRequest request) {
        final GetAPIResult result = super.sendRequest( "GetAPI", request, GetAPIRequest.class, GetAPIResult.class );

        return result;
    }


    @Override
    public GetAPIResult getAPI() {
        final GetAPIRequest request = new GetAPIRequest( );
        final GetAPIResult result = this.getAPI( request );

        return result;
    }

    @Override
    public GetCurrentClusterAdminResult getCurrentClusterAdmin(final GetCurrentClusterAdminRequest request) {
        final GetCurrentClusterAdminResult result = super.sendRequest( "GetCurrentClusterAdmin", request, GetCurrentClusterAdminRequest.class, GetCurrentClusterAdminResult.class );

        return result;
    }


    @Override
    public GetCurrentClusterAdminResult getCurrentClusterAdmin() {
        final GetCurrentClusterAdminRequest request = new GetCurrentClusterAdminRequest( );
        final GetCurrentClusterAdminResult result = this.getCurrentClusterAdmin( request );

        return result;
    }

    @Override
    public EnableEncryptionAtRestResult enableEncryptionAtRest(final EnableEncryptionAtRestRequest request) {
        final EnableEncryptionAtRestResult result = super.sendRequest( "EnableEncryptionAtRest", request, EnableEncryptionAtRestRequest.class, EnableEncryptionAtRestResult.class );

        return result;
    }


    @Override
    public EnableEncryptionAtRestResult enableEncryptionAtRest() {
        final EnableEncryptionAtRestRequest request = new EnableEncryptionAtRestRequest( );
        final EnableEncryptionAtRestResult result = this.enableEncryptionAtRest( request );

        return result;
    }

    @Override
    public DisableEncryptionAtRestResult disableEncryptionAtRest(final DisableEncryptionAtRestRequest request) {
        final DisableEncryptionAtRestResult result = super.sendRequest( "DisableEncryptionAtRest", request, DisableEncryptionAtRestRequest.class, DisableEncryptionAtRestResult.class );

        return result;
    }


    @Override
    public DisableEncryptionAtRestResult disableEncryptionAtRest() {
        final DisableEncryptionAtRestRequest request = new DisableEncryptionAtRestRequest( );
        final DisableEncryptionAtRestResult result = this.disableEncryptionAtRest( request );

        return result;
    }

    @Override
    public SnmpSendTestTrapsResult snmpSendTestTraps(final SnmpSendTestTrapsRequest request) {
        final SnmpSendTestTrapsResult result = super.sendRequest( "SnmpSendTestTraps", request, SnmpSendTestTrapsRequest.class, SnmpSendTestTrapsResult.class );

        return result;
    }


    @Override
    public SnmpSendTestTrapsResult snmpSendTestTraps(String status) {
        final SnmpSendTestTrapsRequest request = new SnmpSendTestTrapsRequest( status);
        final SnmpSendTestTrapsResult result = this.snmpSendTestTraps( request );

        return result;
    }

    @Override
    public GetAsyncResultResult getAsyncResult(final GetAsyncResultRequest request) {
        final GetAsyncResultResult result = super.sendRequest( "GetAsyncResult", request, GetAsyncResultRequest.class, GetAsyncResultResult.class );

        return result;
    }


    @Override
    public GetAsyncResultResult getAsyncResult(Long asyncHandle) {
        final GetAsyncResultRequest request = new GetAsyncResultRequest( asyncHandle);
        final GetAsyncResultResult result = this.getAsyncResult( request );

        return result;
    }

    @Override
    public AddDrivesResult addDrives(final AddDrivesRequest request) {
        final AddDrivesResult result = super.sendRequest( "AddDrives", request, AddDrivesRequest.class, AddDrivesResult.class );

        return result;
    }


    @Override
    public AddDrivesResult addDrives(NewDrive[] drives) {
        final AddDrivesRequest request = new AddDrivesRequest( drives);
        final AddDrivesResult result = this.addDrives( request );

        return result;
    }

    @Override
    public ListDrivesResult listDrives(final ListDrivesRequest request) {
        final ListDrivesResult result = super.sendRequest( "ListDrives", request, ListDrivesRequest.class, ListDrivesResult.class );

        return result;
    }


    @Override
    public ListDrivesResult listDrives() {
        final ListDrivesRequest request = new ListDrivesRequest( );
        final ListDrivesResult result = this.listDrives( request );

        return result;
    }

    @Override
    public GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request) {
        final GetDriveHardwareInfoResult result = super.sendRequest( "GetDriveHardwareInfo", request, GetDriveHardwareInfoRequest.class, GetDriveHardwareInfoResult.class );

        return result;
    }


    @Override
    public GetDriveHardwareInfoResult getDriveHardwareInfo(Long driveID) {
        final GetDriveHardwareInfoRequest request = new GetDriveHardwareInfoRequest( driveID);
        final GetDriveHardwareInfoResult result = this.getDriveHardwareInfo( request );

        return result;
    }

    @Override
    public ListDriveHardwareResult listDriveHardware(final ListDriveHardwareRequest request) {
        final ListDriveHardwareResult result = super.sendRequest( "ListDriveHardware", request, ListDriveHardwareRequest.class, ListDriveHardwareResult.class );

        return result;
    }


    @Override
    public ListDriveHardwareResult listDriveHardware(Boolean force) {
        final ListDriveHardwareRequest request = new ListDriveHardwareRequest( force);
        final ListDriveHardwareResult result = this.listDriveHardware( request );

        return result;
    }

    @Override
    public ResetDrivesResult resetDrives(final ResetDrivesRequest request) {
        final ResetDrivesResult result = super.sendRequest( "ResetDrives", request, ResetDrivesRequest.class, ResetDrivesResult.class );

        return result;
    }


    @Override
    public ResetDrivesResult resetDrives(String drives, Boolean force) {
        final ResetDrivesRequest request = new ResetDrivesRequest( drives, force);
        final ResetDrivesResult result = this.resetDrives( request );

        return result;
    }

    @Override
    public TestDrivesResult testDrives(final TestDrivesRequest request) {
        final TestDrivesResult result = super.sendRequest( "TestDrives", request, TestDrivesRequest.class, TestDrivesResult.class );

        return result;
    }


    @Override
    public TestDrivesResult testDrives(Optional<Long> minutes, Boolean force) {
        final TestDrivesRequest request = new TestDrivesRequest( minutes, force);
        final TestDrivesResult result = this.testDrives( request );

        return result;
    }

    @Override
    public GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request) {
        final GetDriveStatsResult result = super.sendRequest( "GetDriveStats", request, GetDriveStatsRequest.class, GetDriveStatsResult.class );

        return result;
    }


    @Override
    public GetDriveStatsResult getDriveStats(Long driveID) {
        final GetDriveStatsRequest request = new GetDriveStatsRequest( driveID);
        final GetDriveStatsResult result = this.getDriveStats( request );

        return result;
    }

    @Override
    public AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request) {
        final AsyncHandleResult result = super.sendRequest( "SecureEraseDrives", request, SecureEraseDrivesRequest.class, AsyncHandleResult.class );

        return result;
    }


    @Override
    public AsyncHandleResult secureEraseDrives(Long[] drives) {
        final SecureEraseDrivesRequest request = new SecureEraseDrivesRequest( drives);
        final AsyncHandleResult result = this.secureEraseDrives( request );

        return result;
    }

    @Override
    public AsyncHandleResult removeDrives(final RemoveDrivesRequest request) {
        final AsyncHandleResult result = super.sendRequest( "RemoveDrives", request, RemoveDrivesRequest.class, AsyncHandleResult.class );

        return result;
    }


    @Override
    public AsyncHandleResult removeDrives(Long[] drives) {
        final RemoveDrivesRequest request = new RemoveDrivesRequest( drives);
        final AsyncHandleResult result = this.removeDrives( request );

        return result;
    }

    @Override
    public ListActiveNodesResult listActiveNodes(final ListActiveNodesRequest request) {
        final ListActiveNodesResult result = super.sendRequest( "ListActiveNodes", request, ListActiveNodesRequest.class, ListActiveNodesResult.class );

        return result;
    }


    @Override
    public ListActiveNodesResult listActiveNodes() {
        final ListActiveNodesRequest request = new ListActiveNodesRequest( );
        final ListActiveNodesResult result = this.listActiveNodes( request );

        return result;
    }

    @Override
    public ListAllNodesResult listAllNodes(final ListAllNodesRequest request) {
        final ListAllNodesResult result = super.sendRequest( "ListAllNodes", request, ListAllNodesRequest.class, ListAllNodesResult.class );

        return result;
    }


    @Override
    public ListAllNodesResult listAllNodes() {
        final ListAllNodesRequest request = new ListAllNodesRequest( );
        final ListAllNodesResult result = this.listAllNodes( request );

        return result;
    }

    @Override
    public ListPendingNodesResult listPendingNodes(final ListPendingNodesRequest request) {
        final ListPendingNodesResult result = super.sendRequest( "ListPendingNodes", request, ListPendingNodesRequest.class, ListPendingNodesResult.class );

        return result;
    }


    @Override
    public ListPendingNodesResult listPendingNodes() {
        final ListPendingNodesRequest request = new ListPendingNodesRequest( );
        final ListPendingNodesResult result = this.listPendingNodes( request );

        return result;
    }

    @Override
    public AddNodesResult addNodes(final AddNodesRequest request) {
        final AddNodesResult result = super.sendRequest( "AddNodes", request, AddNodesRequest.class, AddNodesResult.class );

        return result;
    }


    @Override
    public AddNodesResult addNodes(Long[] pendingNodes) {
        final AddNodesRequest request = new AddNodesRequest( pendingNodes);
        final AddNodesResult result = this.addNodes( request );

        return result;
    }

    @Override
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request) {
        final RemoveNodesResult result = super.sendRequest( "RemoveNodes", request, RemoveNodesRequest.class, RemoveNodesResult.class );

        return result;
    }


    @Override
    public RemoveNodesResult removeNodes(Long[] nodes) {
        final RemoveNodesRequest request = new RemoveNodesRequest( nodes);
        final RemoveNodesResult result = this.removeNodes( request );

        return result;
    }

    @Override
    public GetNetworkConfigResult getNetworkConfig(final GetNetworkConfigRequest request) {
        final GetNetworkConfigResult result = super.sendRequest( "GetNetworkConfig", request, GetNetworkConfigRequest.class, GetNetworkConfigResult.class );

        return result;
    }


    @Override
    public GetNetworkConfigResult getNetworkConfig() {
        final GetNetworkConfigRequest request = new GetNetworkConfigRequest( );
        final GetNetworkConfigResult result = this.getNetworkConfig( request );

        return result;
    }

    @Override
    public SetConfigResult setConfig(final SetConfigRequest request) {
        final SetConfigResult result = super.sendRequest( "SetConfig", request, SetConfigRequest.class, SetConfigResult.class );

        return result;
    }


    @Override
    public SetConfigResult setConfig(Config config) {
        final SetConfigRequest request = new SetConfigRequest( config);
        final SetConfigResult result = this.setConfig( request );

        return result;
    }

    @Override
    public SetNetworkConfigResult setNetworkConfig(final SetNetworkConfigRequest request) {
        final SetNetworkConfigResult result = super.sendRequest( "SetNetworkConfig", request, SetNetworkConfigRequest.class, SetNetworkConfigResult.class );

        return result;
    }


    @Override
    public SetNetworkConfigResult setNetworkConfig(Network network) {
        final SetNetworkConfigRequest request = new SetNetworkConfigRequest( network);
        final SetNetworkConfigResult result = this.setNetworkConfig( request );

        return result;
    }

    @Override
    public GetConfigResult getConfig(final GetConfigRequest request) {
        final GetConfigResult result = super.sendRequest( "GetConfig", request, GetConfigRequest.class, GetConfigResult.class );

        return result;
    }


    @Override
    public GetConfigResult getConfig() {
        final GetConfigRequest request = new GetConfigRequest( );
        final GetConfigResult result = this.getConfig( request );

        return result;
    }

    @Override
    public GetNodeStatsResult getNodeStats(final GetNodeStatsRequest request) {
        final GetNodeStatsResult result = super.sendRequest( "GetNodeStats", request, GetNodeStatsRequest.class, GetNodeStatsResult.class );

        return com.solidfire.adaptor.ElementServiceAdaptor.getNodeStats(request, result);
    }


    @Override
    public GetNodeStatsResult getNodeStats(Long nodeID) {
        final GetNodeStatsRequest request = new GetNodeStatsRequest( nodeID);
        final GetNodeStatsResult result = this.getNodeStats( request );

        return com.solidfire.adaptor.ElementServiceAdaptor.getNodeStats(request, result);
    }

    @Override
    public ListNodeStatsResult listNodeStats(final ListNodeStatsRequest request) {
        final ListNodeStatsResult result = super.sendRequest( "ListNodeStats", request, ListNodeStatsRequest.class, ListNodeStatsResult.class );

        return result;
    }


    @Override
    public ListNodeStatsResult listNodeStats() {
        final ListNodeStatsRequest request = new ListNodeStatsRequest( );
        final ListNodeStatsResult result = this.listNodeStats( request );

        return result;
    }

    @Override
    public ListClusterPairsResult listClusterPairs(final ListClusterPairsRequest request) {
        final ListClusterPairsResult result = super.sendRequest( "ListClusterPairs", request, ListClusterPairsRequest.class, ListClusterPairsResult.class );

        return result;
    }


    @Override
    public ListClusterPairsResult listClusterPairs() {
        final ListClusterPairsRequest request = new ListClusterPairsRequest( );
        final ListClusterPairsResult result = this.listClusterPairs( request );

        return result;
    }

    @Override
    public StartClusterPairingResult startClusterPairing(final StartClusterPairingRequest request) {
        final StartClusterPairingResult result = super.sendRequest( "StartClusterPairing", request, StartClusterPairingRequest.class, StartClusterPairingResult.class );

        return result;
    }


    @Override
    public StartClusterPairingResult startClusterPairing() {
        final StartClusterPairingRequest request = new StartClusterPairingRequest( );
        final StartClusterPairingResult result = this.startClusterPairing( request );

        return result;
    }

    @Override
    public CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request) {
        final CompleteClusterPairingResult result = super.sendRequest( "CompleteClusterPairing", request, CompleteClusterPairingRequest.class, CompleteClusterPairingResult.class );

        return result;
    }


    @Override
    public CompleteClusterPairingResult completeClusterPairing(String clusterPairingKey) {
        final CompleteClusterPairingRequest request = new CompleteClusterPairingRequest( clusterPairingKey);
        final CompleteClusterPairingResult result = this.completeClusterPairing( request );

        return result;
    }

    @Override
    public RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request) {
        final RemoveClusterPairResult result = super.sendRequest( "RemoveClusterPair", request, RemoveClusterPairRequest.class, RemoveClusterPairResult.class );

        return result;
    }


    @Override
    public RemoveClusterPairResult removeClusterPair(Long clusterPairID) {
        final RemoveClusterPairRequest request = new RemoveClusterPairRequest( clusterPairID);
        final RemoveClusterPairResult result = this.removeClusterPair( request );

        return result;
    }

    @Override
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request) {
        final CreateSnapshotResult result = super.sendRequest( "CreateSnapshot", request, CreateSnapshotRequest.class, CreateSnapshotResult.class );

        return result;
    }

    @Override
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request) {
        final DeleteSnapshotResult result = super.sendRequest( "DeleteSnapshot", request, DeleteSnapshotRequest.class, DeleteSnapshotResult.class );

        return result;
    }


    @Override
    public DeleteSnapshotResult deleteSnapshot(Long snapshotID) {
        final DeleteSnapshotRequest request = new DeleteSnapshotRequest( snapshotID);
        final DeleteSnapshotResult result = this.deleteSnapshot( request );

        return result;
    }

    @Override
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request) {
        final ListSnapshotsResult result = super.sendRequest( "ListSnapshots", request, ListSnapshotsRequest.class, ListSnapshotsResult.class );

        return result;
    }


    @Override
    public ListSnapshotsResult listSnapshots(Optional<Long> volumeID) {
        final ListSnapshotsRequest request = new ListSnapshotsRequest( volumeID);
        final ListSnapshotsResult result = this.listSnapshots( request );

        return result;
    }

    @Override
    @Since("8.0")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request) {
        final ModifySnapshotResult result = super.sendRequest( "ModifySnapshot", request, ModifySnapshotRequest.class, ModifySnapshotResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public ModifySnapshotResult modifySnapshot(Long snapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication) {
        final ModifySnapshotRequest request = new ModifySnapshotRequest( snapshotID, expirationTime, enableRemoteReplication);
        final ModifySnapshotResult result = this.modifySnapshot( request );

        return result;
    }

    @Override
    public CreateSnapshotResult rollbackToSnapshot(final RollbackToSnapshotRequest request) {
        final CreateSnapshotResult result = super.sendRequest( "RollbackToSnapshot", request, RollbackToSnapshotRequest.class, CreateSnapshotResult.class );

        return result;
    }

    @Override
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request) {
        final CreateGroupSnapshotResult result = super.sendRequest( "CreateGroupSnapshot", request, CreateGroupSnapshotRequest.class, CreateGroupSnapshotResult.class );

        return result;
    }

    @Override
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request) {
        final DeleteGroupSnapshotResult result = super.sendRequest( "DeleteGroupSnapshot", request, DeleteGroupSnapshotRequest.class, DeleteGroupSnapshotResult.class );

        return result;
    }


    @Override
    public DeleteGroupSnapshotResult deleteGroupSnapshot(Long groupSnapshotID, Boolean saveMembers) {
        final DeleteGroupSnapshotRequest request = new DeleteGroupSnapshotRequest( groupSnapshotID, saveMembers);
        final DeleteGroupSnapshotResult result = this.deleteGroupSnapshot( request );

        return result;
    }

    @Override
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request) {
        final ListGroupSnapshotsResult result = super.sendRequest( "ListGroupSnapshots", request, ListGroupSnapshotsRequest.class, ListGroupSnapshotsResult.class );

        return result;
    }


    @Override
    public ListGroupSnapshotsResult listGroupSnapshots(Optional<Long> volumeID) {
        final ListGroupSnapshotsRequest request = new ListGroupSnapshotsRequest( volumeID);
        final ListGroupSnapshotsResult result = this.listGroupSnapshots( request );

        return result;
    }

    @Override
    @Since("8.0")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request) {
        final ModifyGroupSnapshotResult result = super.sendRequest( "ModifyGroupSnapshot", request, ModifyGroupSnapshotRequest.class, ModifyGroupSnapshotResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(Long groupSnapshotID, Optional<String> expirationTime, Optional<Boolean> enableRemoteReplication) {
        final ModifyGroupSnapshotRequest request = new ModifyGroupSnapshotRequest( groupSnapshotID, expirationTime, enableRemoteReplication);
        final ModifyGroupSnapshotResult result = this.modifyGroupSnapshot( request );

        return result;
    }

    @Override
    @Since("7.0")
    public CreateGroupSnapshotResult rollbackToGroupSnapshot(final RollbackToGroupSnapshotRequest request) {
        final CreateGroupSnapshotResult result = super.sendRequest( "RollbackToGroupSnapshot", request, RollbackToGroupSnapshotRequest.class, CreateGroupSnapshotResult.class );

        return result;
    }

    @Override
    @Since("8.0")
    public GetScheduleResult getSchedule(final GetScheduleRequest request) {
        final GetScheduleResult result = super.sendRequest( "GetSchedule", request, GetScheduleRequest.class, GetScheduleResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public GetScheduleResult getSchedule(Long scheduleID) {
        final GetScheduleRequest request = new GetScheduleRequest( scheduleID);
        final GetScheduleResult result = this.getSchedule( request );

        return result;
    }

    @Override
    @Since("8.0")
    public ListSchedulesResult listSchedules(final ListSchedulesRequest request) {
        final ListSchedulesResult result = super.sendRequest( "ListSchedules", request, ListSchedulesRequest.class, ListSchedulesResult.class );

        return result;
    }


    @Override
    @Since("8.0")
    public ListSchedulesResult listSchedules() {
        final ListSchedulesRequest request = new ListSchedulesRequest( );
        final ListSchedulesResult result = this.listSchedules( request );

        return result;
    }

    @Override
    @Since("8.0")
    public CreateScheduleResult createSchedule(final CreateScheduleRequest request) {
        final CreateScheduleResult result = super.sendRequest( "CreateSchedule", request, CreateScheduleRequest.class, CreateScheduleResult.class );

        return result;
    }

    @Override
    @Since("8.0")
    public ModifyScheduleResult modifySchedule(final ModifyScheduleRequest request) {
        final ModifyScheduleResult result = super.sendRequest( "ModifySchedule", request, ModifyScheduleRequest.class, ModifyScheduleResult.class );

        return result;
    }

    @Override
    public Object getRawStats(final GetRawStatsRequest request) {
        final Object result = super.sendRequest( "GetRawStats", request, GetRawStatsRequest.class, Object.class );

        return result;
    }


    @Override
    public Object getRawStats() {
        final GetRawStatsRequest request = new GetRawStatsRequest( );
        final Object result = this.getRawStats( request );

        return result;
    }

    @Override
    public Object getCompleteStats(final GetCompleteStatsRequest request) {
        final Object result = super.sendRequest( "GetCompleteStats", request, GetCompleteStatsRequest.class, Object.class );

        return result;
    }


    @Override
    public Object getCompleteStats() {
        final GetCompleteStatsRequest request = new GetCompleteStatsRequest( );
        final Object result = this.getCompleteStats( request );

        return result;
    }

    @Override
    @Since("7.0")
    public ListVirtualNetworksResult listVirtualNetworks(final ListVirtualNetworksRequest request) {
        final ListVirtualNetworksResult result = super.sendRequest( "ListVirtualNetworks", request, ListVirtualNetworksRequest.class, ListVirtualNetworksResult.class );

        return result;
    }

    @Override
    @Since("7.0")
    public AddVirtualNetworkResult addVirtualNetwork(final AddVirtualNetworkRequest request) {
        final AddVirtualNetworkResult result = super.sendRequest( "AddVirtualNetwork", request, AddVirtualNetworkRequest.class, AddVirtualNetworkResult.class );

        return result;
    }

    @Override
    @Since("7.0")
    public AddVirtualNetworkResult modifyVirtualNetwork(final ModifyVirtualNetworkRequest request) {
        final AddVirtualNetworkResult result = super.sendRequest( "ModifyVirtualNetwork", request, ModifyVirtualNetworkRequest.class, AddVirtualNetworkResult.class );

        return result;
    }

    @Override
    @Since("7.0")
    public RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request) {
        final RemoveVirtualNetworkResult result = super.sendRequest( "RemoveVirtualNetwork", request, RemoveVirtualNetworkRequest.class, RemoveVirtualNetworkResult.class );

        return result;
    }


    @Override
    @Since("7.0")
    public RemoveVirtualNetworkResult removeVirtualNetwork(Optional<Long> virtualNetworkID, Optional<Long> virtualNetworkTag) {
        final RemoveVirtualNetworkRequest request = new RemoveVirtualNetworkRequest( virtualNetworkID, virtualNetworkTag);
        final RemoveVirtualNetworkResult result = this.removeVirtualNetwork( request );

        return result;
    }

    @Override
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request) {
        final CloneVolumeResult result = super.sendRequest( "CloneVolume", request, CloneVolumeRequest.class, CloneVolumeResult.class );

        return result;
    }

    @Override
    public CreateVolumeResult createVolume(final CreateVolumeRequest request) {
        final CreateVolumeResult result = super.sendRequest( "CreateVolume", request, CreateVolumeRequest.class, CreateVolumeResult.class );

        return result;
    }

    @Override
    public DeleteVolumeResult deleteVolume(final DeleteVolumeRequest request) {
        final DeleteVolumeResult result = super.sendRequest( "DeleteVolume", request, DeleteVolumeRequest.class, DeleteVolumeResult.class );

        return result;
    }


    @Override
    public DeleteVolumeResult deleteVolume(Long volumeID) {
        final DeleteVolumeRequest request = new DeleteVolumeRequest( volumeID);
        final DeleteVolumeResult result = this.deleteVolume( request );

        return result;
    }

    @Override
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request) {
        final GetVolumeStatsResult result = super.sendRequest( "GetVolumeStats", request, GetVolumeStatsRequest.class, GetVolumeStatsResult.class );

        return result;
    }


    @Override
    public GetVolumeStatsResult getVolumeStats(Long volumeID) {
        final GetVolumeStatsRequest request = new GetVolumeStatsRequest( volumeID);
        final GetVolumeStatsResult result = this.getVolumeStats( request );

        return result;
    }

    @Override
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request) {
        final GetVolumeEfficiencyResult result = super.sendRequest( "GetVolumeEfficiency", request, GetVolumeEfficiencyRequest.class, GetVolumeEfficiencyResult.class );

        return result;
    }


    @Override
    public GetVolumeEfficiencyResult getVolumeEfficiency(Long volumeID, Optional<Boolean> force) {
        final GetVolumeEfficiencyRequest request = new GetVolumeEfficiencyRequest( volumeID, force);
        final GetVolumeEfficiencyResult result = this.getVolumeEfficiency( request );

        return result;
    }

    @Override
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request) {
        final ListActiveVolumesResult result = super.sendRequest( "ListActiveVolumes", request, ListActiveVolumesRequest.class, ListActiveVolumesResult.class );

        return result;
    }


    @Override
    public ListActiveVolumesResult listActiveVolumes(Optional<Long> startVolumeID, Optional<Long> limit) {
        final ListActiveVolumesRequest request = new ListActiveVolumesRequest( startVolumeID, limit);
        final ListActiveVolumesResult result = this.listActiveVolumes( request );

        return result;
    }

    @Override
    public ListDeletedVolumesResult listDeletedVolumes(final ListDeletedVolumesRequest request) {
        final ListDeletedVolumesResult result = super.sendRequest( "ListDeletedVolumes", request, ListDeletedVolumesRequest.class, ListDeletedVolumesResult.class );

        return result;
    }


    @Override
    public ListDeletedVolumesResult listDeletedVolumes() {
        final ListDeletedVolumesRequest request = new ListDeletedVolumesRequest( );
        final ListDeletedVolumesResult result = this.listDeletedVolumes( request );

        return result;
    }

    @Override
    public ListISCSISessionsResult listISCSISessions(final ListISCSISessionsRequest request) {
        final ListISCSISessionsResult result = super.sendRequest( "ListISCSISessions", request, ListISCSISessionsRequest.class, ListISCSISessionsResult.class );

        return result;
    }


    @Override
    public ListISCSISessionsResult listISCSISessions() {
        final ListISCSISessionsRequest request = new ListISCSISessionsRequest( );
        final ListISCSISessionsResult result = this.listISCSISessions( request );

        return result;
    }

    @Override
    @Since("8.0")
    public ListVolumesResult listVolumes(final ListVolumesRequest request) {
        final ListVolumesResult result = super.sendRequest( "ListVolumes", request, ListVolumesRequest.class, ListVolumesResult.class );

        return result;
    }

    @Override
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request) {
        final ListVolumesForAccountResult result = super.sendRequest( "ListVolumesForAccount", request, ListVolumesForAccountRequest.class, ListVolumesForAccountResult.class );

        return result;
    }


    @Override
    public ListVolumesForAccountResult listVolumesForAccount(Long accountID, Optional<Long> startVolumeID, Optional<Long> limit) {
        final ListVolumesForAccountRequest request = new ListVolumesForAccountRequest( accountID, startVolumeID, limit);
        final ListVolumesForAccountResult result = this.listVolumesForAccount( request );

        return result;
    }

    @Override
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request) {
        final ListVolumeStatsByAccountResult result = super.sendRequest( "ListVolumeStatsByAccount", request, ListVolumeStatsByAccountRequest.class, ListVolumeStatsByAccountResult.class );

        return result;
    }


    @Override
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount() {
        final ListVolumeStatsByAccountRequest request = new ListVolumeStatsByAccountRequest( );
        final ListVolumeStatsByAccountResult result = this.listVolumeStatsByAccount( request );

        return result;
    }

    @Override
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request) {
        final ListVolumeStatsByVolumeResult result = super.sendRequest( "ListVolumeStatsByVolume", request, ListVolumeStatsByVolumeRequest.class, ListVolumeStatsByVolumeResult.class );

        return result;
    }


    @Override
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume() {
        final ListVolumeStatsByVolumeRequest request = new ListVolumeStatsByVolumeRequest( );
        final ListVolumeStatsByVolumeResult result = this.listVolumeStatsByVolume( request );

        return result;
    }

    @Override
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request) {
        final ListVolumeStatsByVolumeAccessGroupResult result = super.sendRequest( "ListVolumeStatsByVolumeAccessGroup", request, ListVolumeStatsByVolumeAccessGroupRequest.class, ListVolumeStatsByVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(Optional<Long[]> volumeAccessGroups) {
        final ListVolumeStatsByVolumeAccessGroupRequest request = new ListVolumeStatsByVolumeAccessGroupRequest( volumeAccessGroups);
        final ListVolumeStatsByVolumeAccessGroupResult result = this.listVolumeStatsByVolumeAccessGroup( request );

        return result;
    }

    @Override
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request) {
        final ModifyVolumeResult result = super.sendRequest( "ModifyVolume", request, ModifyVolumeRequest.class, ModifyVolumeResult.class );

        return result;
    }

    @Override
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request) {
        final PurgeDeletedVolumeResult result = super.sendRequest( "PurgeDeletedVolume", request, PurgeDeletedVolumeRequest.class, PurgeDeletedVolumeResult.class );

        return result;
    }


    @Override
    public PurgeDeletedVolumeResult purgeDeletedVolume(Long volumeID) {
        final PurgeDeletedVolumeRequest request = new PurgeDeletedVolumeRequest( volumeID);
        final PurgeDeletedVolumeResult result = this.purgeDeletedVolume( request );

        return result;
    }

    @Override
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request) {
        final RestoreDeletedVolumeResult result = super.sendRequest( "RestoreDeletedVolume", request, RestoreDeletedVolumeRequest.class, RestoreDeletedVolumeResult.class );

        return result;
    }


    @Override
    public RestoreDeletedVolumeResult restoreDeletedVolume(Long volumeID) {
        final RestoreDeletedVolumeRequest request = new RestoreDeletedVolumeRequest( volumeID);
        final RestoreDeletedVolumeResult result = this.restoreDeletedVolume( request );

        return result;
    }

    @Override
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request) {
        final CreateVolumeAccessGroupResult result = super.sendRequest( "CreateVolumeAccessGroup", request, CreateVolumeAccessGroupRequest.class, CreateVolumeAccessGroupResult.class );

        return result;
    }

    @Override
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request) {
        final ListVolumeAccessGroupsResult result = super.sendRequest( "ListVolumeAccessGroups", request, ListVolumeAccessGroupsRequest.class, ListVolumeAccessGroupsResult.class );

        return result;
    }


    @Override
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(Optional<Long> startVolumeAccessGroupID, Optional<Long> limit) {
        final ListVolumeAccessGroupsRequest request = new ListVolumeAccessGroupsRequest( startVolumeAccessGroupID, limit);
        final ListVolumeAccessGroupsResult result = this.listVolumeAccessGroups( request );

        return result;
    }

    @Override
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(final DeleteVolumeAccessGroupRequest request) {
        final DeleteVolumeAccessGroupResult result = super.sendRequest( "DeleteVolumeAccessGroup", request, DeleteVolumeAccessGroupRequest.class, DeleteVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(Long volumeAccessGroupID) {
        final DeleteVolumeAccessGroupRequest request = new DeleteVolumeAccessGroupRequest( volumeAccessGroupID);
        final DeleteVolumeAccessGroupResult result = this.deleteVolumeAccessGroup( request );

        return result;
    }

    @Override
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request) {
        final ModifyVolumeAccessGroupResult result = super.sendRequest( "ModifyVolumeAccessGroup", request, ModifyVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );

        return result;
    }

    @Override
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request) {
        final ModifyVolumeAccessGroupResult result = super.sendRequest( "AddInitiatorsToVolumeAccessGroup", request, AddInitiatorsToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators) {
        final AddInitiatorsToVolumeAccessGroupRequest request = new AddInitiatorsToVolumeAccessGroupRequest( volumeAccessGroupID, initiators);
        final ModifyVolumeAccessGroupResult result = this.addInitiatorsToVolumeAccessGroup( request );

        return result;
    }

    @Override
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request) {
        final ModifyVolumeAccessGroupResult result = super.sendRequest( "RemoveInitiatorsFromVolumeAccessGroup", request, RemoveInitiatorsFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(Long volumeAccessGroupID, String[] initiators) {
        final RemoveInitiatorsFromVolumeAccessGroupRequest request = new RemoveInitiatorsFromVolumeAccessGroupRequest( volumeAccessGroupID, initiators);
        final ModifyVolumeAccessGroupResult result = this.removeInitiatorsFromVolumeAccessGroup( request );

        return result;
    }

    @Override
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request) {
        final ModifyVolumeAccessGroupResult result = super.sendRequest( "AddVolumesToVolumeAccessGroup", request, AddVolumesToVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes) {
        final AddVolumesToVolumeAccessGroupRequest request = new AddVolumesToVolumeAccessGroupRequest( volumeAccessGroupID, volumes);
        final ModifyVolumeAccessGroupResult result = this.addVolumesToVolumeAccessGroup( request );

        return result;
    }

    @Override
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request) {
        final ModifyVolumeAccessGroupResult result = super.sendRequest( "RemoveVolumesFromVolumeAccessGroup", request, RemoveVolumesFromVolumeAccessGroupRequest.class, ModifyVolumeAccessGroupResult.class );

        return result;
    }


    @Override
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(Long volumeAccessGroupID, Long[] volumes) {
        final RemoveVolumesFromVolumeAccessGroupRequest request = new RemoveVolumesFromVolumeAccessGroupRequest( volumeAccessGroupID, volumes);
        final ModifyVolumeAccessGroupResult result = this.removeVolumesFromVolumeAccessGroup( request );

        return result;
    }

    @Override
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(final GetVolumeAccessGroupEfficiencyRequest request) {
        final GetEfficiencyResult result = super.sendRequest( "GetVolumeAccessGroupEfficiency", request, GetVolumeAccessGroupEfficiencyRequest.class, GetEfficiencyResult.class );

        return result;
    }


    @Override
    public GetEfficiencyResult getVolumeAccessGroupEfficiency(Long volumeAccessGroupID) {
        final GetVolumeAccessGroupEfficiencyRequest request = new GetVolumeAccessGroupEfficiencyRequest( volumeAccessGroupID);
        final GetEfficiencyResult result = this.getVolumeAccessGroupEfficiency( request );

        return result;
    }

}
