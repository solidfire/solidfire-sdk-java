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
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig(final SetLldpConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, setLldpConfig is not available until version 11.0.");
        }
        if(request.getLldpConfig() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The parameter, lldpConfig is not applicable to this version of the API.");
        }
        return super.sendRequest("SetLldpConfig", request, SetLldpConfigRequest.class, GetLldpConfigResult.class);
    }

    
    /** 
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig() {
        return super.sendRequest("SetLldpConfig", null, null, GetLldpConfigResult.class);
    }
    
    /** 
     * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult setLldpConfig(
        LldpConfig lldpConfig
        ) {
        return this.setLldpConfig(new SetLldpConfigRequest(lldpConfig));
    }
    

    
    /** 
     * GetLldpConfig returns the current LLDP configuration for this node.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public GetLldpConfigResult getLldpConfig() {
        return super.sendRequest("GetLldpConfig", null, null, GetLldpConfigResult.class);
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
     * The TestConnectSvip API method enables you to test the storage connection to the cluster. The test pings the SVIP using ICMP packets, and when successful, connects as an iSCSI initiator.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestConnectSvipResult testConnectSvip(final TestConnectSvipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * The TestPing API allows to test the reachability to IP address(s) using ICMP packets. Source address(v4 or v6), interface and vlan tag can be specified. If not Bond1G/10G network is used to reach the target address.
     * The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
     * Note: This method is available only through the per-node API endpoint 5.0 or later.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public TestPingResult testPing(final TestPingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, testPing is not available until version 5.0.");
        }
        return super.sendRequest("TestPing", request, TestPingRequest.class, TestPingResult.class);
    }

    
    /** 
     * The TestPing API allows to test the reachability to IP address(s) using ICMP packets. Source address(v4 or v6), interface and vlan tag can be specified. If not Bond1G/10G network is used to reach the target address.
     * The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
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
        Optional<Boolean> prohibitFragmentation,
        Optional<String> sourceAddressV4,
        Optional<String> sourceAddressV6,
        Optional<String> iface,
        Optional<Long> virtualNetworkTag
        ) {
        return this.testPing(new TestPingRequest(attempts, hosts, totalTimeoutSec, packetSize, pingTimeoutMsec, prohibitFragmentation, sourceAddressV4, sourceAddressV6, iface, virtualNetworkTag));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
            throw new ApiException("The command, addVirtualNetwork is not available until version 7.0.");
        }
        if(request.getGateway() != null && request.getGateway() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, gateway is not applicable to this version of the API.");
        }
        if(request.getNamespace() != null && request.getNamespace() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * RemoveVirtualNetwork enables you to remove a previously added virtual network.
     * Note: This method requires either the virtualNetworkID or the virtualNetworkTag as a parameter, but not both.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public RemoveVirtualNetworkResult removeVirtualNetwork(final RemoveVirtualNetworkRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
            throw new ApiException("The command, modifyVirtualNetwork is not available until version 7.0.");
        }
        if(request.getGateway() != null && request.getGateway() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, gateway is not applicable to this version of the API.");
        }
        if(request.getNamespace() != null && request.getNamespace() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * GetAccountByName enables you to retrieve details about a specific account, given its username.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByName(final GetAccountByNameRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * ListAccounts returns the entire list of accounts, with optional paging support.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListAccountsResult listAccounts(final ListAccountsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listAccounts is not available until version 1.0.");
        }
        if(request.getIncludeStorageContainers() != null && request.getIncludeStorageContainers() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * RemoveAccount enables you to remove an existing account. You must delete and purge all volumes associated with the account
     * using DeleteVolume before you can remove the account. If volumes on the account are still pending deletion, you cannot use
     * RemoveAccount to remove the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveAccountResult removeAccount(final RemoveAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetAccountByID enables you to return details about a specific account, given its accountID.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetAccountResult getAccountByID(final GetAccountByIDRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(final AddAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, addAccount is not available until version 1.0.");
        }
        if(request.getEnableChap() != null && request.getEnableChap() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The parameter, enableChap is not applicable to this version of the API.");
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
     * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddAccountResult addAccount(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes,
        Optional<Boolean> enableChap
        ) {
        return this.addAccount(new AddAccountRequest(username, initiatorSecret, targetSecret, attributes, enableChap));
    }
    
    /** 
     * GetAccountEfficiency enables you to retrieve efficiency statistics about a volume account. This method returns efficiency information
     * only for the account you specify as a parameter.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetEfficiencyResult getAccountEfficiency(final GetAccountEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, modifyAccount is not available until version 1.0.");
        }
        if(request.getEnableChap() != null && request.getEnableChap() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The parameter, enableChap is not applicable to this version of the API.");
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
        Optional<Attributes> attributes,
        Optional<Boolean> enableChap
        ) {
        return this.modifyAccount(new ModifyAccountRequest(accountID, username, status, initiatorSecret, targetSecret, attributes, enableChap));
    }
    
    /** 
     * Deletes an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public DeleteClusterInterfacePreferenceResult deleteClusterInterfacePreference(final DeleteClusterInterfacePreferenceRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, deleteClusterInterfacePreference is not available until version 11.0.");
        }
        return super.sendRequest("DeleteClusterInterfacePreference", request, DeleteClusterInterfacePreferenceRequest.class, DeleteClusterInterfacePreferenceResult.class);
    }

    
    /** 
     * Deletes an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public DeleteClusterInterfacePreferenceResult deleteClusterInterfacePreference(
        String name
        ) {
        return this.deleteClusterInterfacePreference(new DeleteClusterInterfacePreferenceRequest(name));
    }
    
    /** 
     * You can use the SetSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Cluster")
    public SetSupplementalTlsCiphersResult setSupplementalTlsCiphers(final SetSupplementalTlsCiphersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.3")) {
            throw new ApiException("The command, setSupplementalTlsCiphers is not available until version 11.3.");
        }
        return super.sendRequest("SetSupplementalTlsCiphers", request, SetSupplementalTlsCiphersRequest.class, SetSupplementalTlsCiphersResult.class);
    }

    
    /** 
     * You can use the SetSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Cluster")
    public SetSupplementalTlsCiphersResult setSupplementalTlsCiphers(
        String[] supplementalCiphers
        ) {
        return this.setSupplementalTlsCiphers(new SetSupplementalTlsCiphersRequest(supplementalCiphers));
    }
    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest(final EnableEncryptionAtRestRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, enableEncryptionAtRest is not available until version 5.0.");
        }
        if(request.getKeyProviderID() != null && request.getKeyProviderID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The parameter, keyProviderID is not applicable to this version of the API.");
        }
        return super.sendRequest("EnableEncryptionAtRest", request, EnableEncryptionAtRestRequest.class, EnableEncryptionAtRestResult.class);
    }

    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest() {
        return super.sendRequest("EnableEncryptionAtRest", null, null, EnableEncryptionAtRestResult.class);
    }
    
    /** 
     * Initiate the process of setting a password on self-encrypting drives (SEDs) within the cluster.  This feature is not enabled by default but can be toggled on and off as needed.
     * If a password is set on a SED which is removed from the cluster, the password will remain set and the drive is not secure erased.  Data can be secure erased using the SecureEraseDrives API method.
     * Note: This does not affect performance or efficiency.
     * If no parameters are specified, the password will be generated internally and at random (the only option for endpoints prior to 12.0).  This generated password will be distributed across the nodes using Shamir's Secret Sharing Algorithm such that at least two nodes are required to reconstruct the password.  The complete password to unlock the drives is not stored on any single node and is never sent across the network in its entirety.  This protects against the theft of any number of drives or a single node.
     * If a keyProviderID is specified then the password will be generated/retrieved as appropriate per the type of provider.  Commonly this would be via a KMIP (Key Management Interoperability Protocol) Key Server in the case of a KMIP Key Provider (see CreateKeyProviderKmip).  After this operation the specified provider will be considered 'active' and will not be able to be deleted until DisableEncryptionAtRest is called.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public EnableEncryptionAtRestResult enableEncryptionAtRest(
        Optional<Long> keyProviderID
        ) {
        return this.enableEncryptionAtRest(new EnableEncryptionAtRestRequest(keyProviderID));
    }
    
    /** 
     * Take a node out of maintenance mode. This should be called after maintenance is complete and the node is online.
     **/
    @Override
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult disableMaintenanceMode(final DisableMaintenanceModeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The command, disableMaintenanceMode is not available until version 12.2.");
        }
        return super.sendRequest("DisableMaintenanceMode", request, DisableMaintenanceModeRequest.class, MaintenanceModeResult.class);
    }

    
    /** 
     * Take a node out of maintenance mode. This should be called after maintenance is complete and the node is online.
     **/
    @Override
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult disableMaintenanceMode(
        Long[] nodes
        ) {
        return this.disableMaintenanceMode(new DisableMaintenanceModeRequest(nodes));
    }
    

    
    /** 
     * You can use the GetLicenseKey method to get the current license key.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLicenseKeyResult getLicenseKey() {
        return super.sendRequest("GetLicenseKey", null, null, GetLicenseKeyResult.class);
    }
    

    
    /** 
     * Initiate the process of removing the password from self-encrypting drives (SEDs) within the cluster.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public DisableEncryptionAtRestResult disableEncryptionAtRest() {
        return super.sendRequest("DisableEncryptionAtRest", null, null, DisableEncryptionAtRestResult.class);
    }
    

    
    /** 
     * GetProtectionDomainLayout returns all of the Protection Domain information for the cluster.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public GetProtectionDomainLayoutResult getProtectionDomainLayout() {
        return super.sendRequest("GetProtectionDomainLayout", null, null, GetProtectionDomainLayoutResult.class);
    }
    
    /** 
     * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
     * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetNtpInfoResult setNtpInfo(final SetNtpInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetBinAssignmentProperties enables you to retrieve the bin assignment properties in the database.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetBinAssignmentPropertiesResult getBinAssignmentProperties() {
        return super.sendRequest("GetBinAssignmentProperties", null, null, GetBinAssignmentPropertiesResult.class);
    }
    

    
    /** 
     * You can use the GetSSLCertificate method to retrieve the SSL certificate that is currently active on the cluster.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetSSLCertificateResult getSSLCertificate() {
        return super.sendRequest("GetSSLCertificate", null, null, GetSSLCertificateResult.class);
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
     * The GetClusterConfig API method enables you to return information about the cluster configuration this node uses to communicate with the cluster that it is a part of.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetClusterConfigResult getClusterConfig() {
        return super.sendRequest("GetClusterConfig", null, null, GetClusterConfigResult.class);
    }
    

    
    /** 
     * You can use the RemoveSSLCertificate method to remove the user SSL certificate and private key for the cluster.
     * After the certificate and private key are removed, the cluster is configured to use the default certificate and private key.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public RemoveSSLCertificateResult removeSSLCertificate() {
        return super.sendRequest("RemoveSSLCertificate", null, null, RemoveSSLCertificateResult.class);
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
     * Lists all the existing cluster interface preferences.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public ListClusterInterfacePreferencesResult listClusterInterfacePreferences() {
        return super.sendRequest("ListClusterInterfacePreferences", null, null, ListClusterInterfacePreferencesResult.class);
    }
    

    
    /** 
     * You can use the GetClusterStructure method to back up the current storage cluster configuration information. If the storage cluster configuration is changed while this method is running, the contents of the configuration backup will be unpredictable. You can save this data to a text file and restore it on other clusters, or the cluster in the case of a disaster.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetClusterStructureResult getClusterStructure() {
        return super.sendRequest("GetClusterStructure", null, null, GetClusterStructureResult.class);
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
     * You can use the ResetSupplementalTlsCiphers method to restore the supplemental ciphers to their defaults.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Cluster")
    public ResetSupplementalTlsCiphersResult resetSupplementalTlsCiphers() {
        return super.sendRequest("ResetSupplementalTlsCiphers", null, null, ResetSupplementalTlsCiphersResult.class);
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
     * Used to assign Nodes to user-defined Protection Domains. This information must be provided for all
     * Active Nodes in the cluster, and no information may be provided for Nodes that are not Active. All Nodes
     * in a given Chassis must be assigned to the same user-defined Protection Domain. The same
     * ProtectionDomainType must be supplied for all nodes. ProtectionDomainTypes that are not user-defined
     * such as Node and Chassis, must not be included. If any of these are not true, the Custom Protection
     * Domains will be ignored, and an appropriate error will be returned.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public SetProtectionDomainLayoutResult setProtectionDomainLayout(final SetProtectionDomainLayoutRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, setProtectionDomainLayout is not available until version 12.0.");
        }
        return super.sendRequest("SetProtectionDomainLayout", request, SetProtectionDomainLayoutRequest.class, SetProtectionDomainLayoutResult.class);
    }

    
    /** 
     * Used to assign Nodes to user-defined Protection Domains. This information must be provided for all
     * Active Nodes in the cluster, and no information may be provided for Nodes that are not Active. All Nodes
     * in a given Chassis must be assigned to the same user-defined Protection Domain. The same
     * ProtectionDomainType must be supplied for all nodes. ProtectionDomainTypes that are not user-defined
     * such as Node and Chassis, must not be included. If any of these are not true, the Custom Protection
     * Domains will be ignored, and an appropriate error will be returned.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public SetProtectionDomainLayoutResult setProtectionDomainLayout(
        NodeProtectionDomains[] protectionDomainLayout
        ) {
        return this.setProtectionDomainLayout(new SetProtectionDomainLayoutRequest(protectionDomainLayout));
    }
    

    
    /** 
     * You can use the GetSupportedTlsCiphers method to get a list of the supported TLS ciphers.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Cluster")
    public GetSupportedTlsCiphersResult getSupportedTlsCiphers() {
        return super.sendRequest("GetSupportedTlsCiphers", null, null, GetSupportedTlsCiphersResult.class);
    }
    
    /** 
     * Prepare a node for maintenance. Maintenance includes anything that will require the node to be powered-off or restarted.
     **/
    @Override
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult enableMaintenanceMode(final EnableMaintenanceModeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The command, enableMaintenanceMode is not available until version 12.2.");
        }
        return super.sendRequest("EnableMaintenanceMode", request, EnableMaintenanceModeRequest.class, MaintenanceModeResult.class);
    }

    
    /** 
     * Prepare a node for maintenance. Maintenance includes anything that will require the node to be powered-off or restarted.
     **/
    @Override
    @Since("12.2")
    @ConnectionType("Cluster")
    public MaintenanceModeResult enableMaintenanceMode(
        Long[] nodes,
        Optional<Long> perMinutePrimarySwapLimit,
        Optional<String> timeout,
        Optional<Boolean> forceWithUnresolvedFaults
        ) {
        return this.enableMaintenanceMode(new EnableMaintenanceModeRequest(nodes, perMinutePrimarySwapLimit, timeout, forceWithUnresolvedFaults));
    }
    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference(final CreateClusterInterfacePreferenceRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, createClusterInterfacePreference is not available until version 11.0.");
        }
        if(request.getName() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getValue() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The parameter, value is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateClusterInterfacePreference", request, CreateClusterInterfacePreferenceRequest.class, CreateClusterInterfacePreferenceResult.class);
    }

    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference() {
        return super.sendRequest("CreateClusterInterfacePreference", null, null, CreateClusterInterfacePreferenceResult.class);
    }
    
    /** 
     * Creates a new cluster preference and stores it on the storage cluster. The ClusterInterfacePreference
     * related APIs can be used by internal interfaces to the storage cluster such as HCI and UI to store arbitrary
     * information in the cluster. Since the API calls in the UI are visible to customers, these APIs are made public.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public CreateClusterInterfacePreferenceResult createClusterInterfacePreference(
        String name,
        String value
        ) {
        return this.createClusterInterfacePreference(new CreateClusterInterfacePreferenceRequest(name, value));
    }
    
    /** 
     * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterFaultsResult listClusterFaults(final ListClusterFaultsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * ListSyncJobs returns information about synchronization jobs that are running on a SolidFire cluster. The type of
     * synchronization jobs that are returned with this method are block, slice, clone, and remote.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListSyncJobsResult listSyncJobs() {
        return super.sendRequest("ListSyncJobs", null, null, ListSyncJobsResult.class);
    }
    
    /** 
     * You can use the SetSSLCertificate method to set a user SSL certificate and a private key for the cluster.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetSSLCertificateResult setSSLCertificate(final SetSSLCertificateRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, setSSLCertificate is not available until version 10.0.");
        }
        return super.sendRequest("SetSSLCertificate", request, SetSSLCertificateRequest.class, SetSSLCertificateResult.class);
    }

    
    /** 
     * You can use the SetSSLCertificate method to set a user SSL certificate and a private key for the cluster.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetSSLCertificateResult setSSLCertificate(
        String certificate,
        String privateKey
        ) {
        return this.setSSLCertificate(new SetSSLCertificateRequest(certificate, privateKey));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * ListProtectionDomainLevels returns the Tolerance and Resiliency of the cluster from the perspective
     * of each of the supported ProtectionDomainTypes.
     **/
    @Override
    @Since("11")
    @ConnectionType("Cluster")
    public ListProtectionDomainLevelsResult listProtectionDomainLevels() {
        return super.sendRequest("ListProtectionDomainLevels", null, null, ListProtectionDomainLevelsResult.class);
    }
    
    /** 
     * You can use the SetClusterStructure method to restore the storage cluster configuration information from a backup. When you call the method, pass the json result returned from the GetClusterStructure API containing the configuration information you want to restore.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public SetClusterStructureResult setClusterStructure(final SetClusterStructureRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The command, setClusterStructure is not available until version 10.3.");
        }
        return super.sendRequest("SetClusterStructure", request, SetClusterStructureRequest.class, SetClusterStructureResult.class);
    }

    
    /** 
     * You can use the SetClusterStructure method to restore the storage cluster configuration information from a backup. When you call the method, pass the json result returned from the GetClusterStructure API containing the configuration information you want to restore.
     **/
    @Override
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
        ) {
        return this.setClusterStructure(new SetClusterStructureRequest(accounts, defaultQoS, features, initiators, ntp, qosPolicies, remoteHosts, schedules, snmp, tlsCiphers, virtualNetworks, volumeAccessGroupLunAssignments, volumeAccessGroups, volumes, storageContainers));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * DeleteAllSupportBundles enables you to delete all support bundles generated with the CreateSupportBundle API method.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Node")
    public DeleteAllSupportBundlesResult deleteAllSupportBundles() {
        return super.sendRequest("DeleteAllSupportBundles", null, null, DeleteAllSupportBundlesResult.class);
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
     * Modifies an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference(final ModifyClusterInterfacePreferenceRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, modifyClusterInterfacePreference is not available until version 11.0.");
        }
        if(request.getName() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getValue() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The parameter, value is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyClusterInterfacePreference", request, ModifyClusterInterfacePreferenceRequest.class, ModifyClusterInterfacePreferenceResult.class);
    }

    
    /** 
     * Modifies an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference() {
        return super.sendRequest("ModifyClusterInterfacePreference", null, null, ModifyClusterInterfacePreferenceResult.class);
    }
    
    /** 
     * Modifies an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public ModifyClusterInterfacePreferenceResult modifyClusterInterfacePreference(
        String name,
        String value
        ) {
        return this.modifyClusterInterfacePreference(new ModifyClusterInterfacePreferenceRequest(name, value));
    }
    
    /** 
     * Retrieves an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public GetClusterInterfacePreferenceResult getClusterInterfacePreference(final GetClusterInterfacePreferenceRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, getClusterInterfacePreference is not available until version 11.0.");
        }
        return super.sendRequest("GetClusterInterfacePreference", request, GetClusterInterfacePreferenceRequest.class, GetClusterInterfacePreferenceResult.class);
    }

    
    /** 
     * Retrieves an existing cluster interface preference.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public GetClusterInterfacePreferenceResult getClusterInterfacePreference(
        String name
        ) {
        return this.getClusterInterfacePreference(new GetClusterInterfacePreferenceRequest(name));
    }
    
    /** 
     * You can use the TestAddressAvailability method to check to see if a certain IP address is inuse on an interface within the storage cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Node")
    public TestAddressAvailabilityResult testAddressAvailability(final TestAddressAvailabilityRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, testAddressAvailability is not available until version 11.0.");
        }
        return super.sendRequest("TestAddressAvailability", request, TestAddressAvailabilityRequest.class, TestAddressAvailabilityResult.class);
    }

    
    /** 
     * You can use the TestAddressAvailability method to check to see if a certain IP address is inuse on an interface within the storage cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Node")
    public TestAddressAvailabilityResult testAddressAvailability(
        String iface,
        String address,
        Optional<Long> virtualNetworkTag,
        Optional<Long> timeout
        ) {
        return this.testAddressAvailability(new TestAddressAvailabilityRequest(iface, address, virtualNetworkTag, timeout));
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
     * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
     * and unresolved faults can be cleared.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ClearClusterFaultsResult clearClusterFaults(final ClearClusterFaultsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(final ModifyClusterFullThresholdRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, modifyClusterFullThreshold is not available until version 1.0.");
        }
        if(request.getStage3BlockThresholdPercent() != null && request.getStage3BlockThresholdPercent() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, stage3BlockThresholdPercent is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyClusterFullThreshold", request, ModifyClusterFullThresholdRequest.class, ModifyClusterFullThresholdResult.class);
    }

    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3MetadataThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
        ) {
        return this.modifyClusterFullThreshold(new ModifyClusterFullThresholdRequest(stage2AwareThreshold, stage3MetadataThresholdPercent, maxMetadataOverProvisionFactor));
    }
    
    /** 
     * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterFullThresholdResult modifyClusterFullThreshold(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3BlockThresholdPercent,
        Optional<Long> stage3MetadataThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
        ) {
        return this.modifyClusterFullThreshold(new ModifyClusterFullThresholdRequest(stage2AwareThreshold, stage3BlockThresholdPercent, stage3MetadataThresholdPercent, maxMetadataOverProvisionFactor));
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
        if(request.getSerialNumber() != null && request.getSerialNumber() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The parameter, serialNumber is not applicable to this version of the API.");
        }
        if(request.getOrderNumber() != null && request.getOrderNumber() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The parameter, orderNumber is not applicable to this version of the API.");
        }
        if(request.getEnableSoftwareEncryptionAtRest() != null && request.getEnableSoftwareEncryptionAtRest() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The parameter, enableSoftwareEncryptionAtRest is not applicable to this version of the API.");
        }
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
        String username,
        String password,
        String[] nodes,
        Optional<Attributes> attributes
        ) {
        return this.createCluster(new CreateClusterRequest(acceptEula, mvip, svip, username, password, nodes, attributes));
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
        Optional<String> serialNumber,
        Optional<String> orderNumber,
        String mvip,
        String svip,
        String username,
        String password,
        String[] nodes,
        Optional<Attributes> attributes,
        Optional<Boolean> enableSoftwareEncryptionAtRest
        ) {
        return this.createCluster(new CreateClusterRequest(acceptEula, serialNumber, orderNumber, mvip, svip, username, password, nodes, attributes, enableSoftwareEncryptionAtRest));
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
     * CheckProposedNodeAdditions validates that adding a node (or nodes) to an existing cluster is likely to succeed.  Any problems with the proposed new cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public CheckProposedResult checkProposedNodeAdditions(final CheckProposedNodeAdditionsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, checkProposedNodeAdditions is not available until version 11.0.");
        }
        return super.sendRequest("CheckProposedNodeAdditions", request, CheckProposedNodeAdditionsRequest.class, CheckProposedResult.class);
    }

    
    /** 
     * CheckProposedNodeAdditions validates that adding a node (or nodes) to an existing cluster is likely to succeed.  Any problems with the proposed new cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Cluster")
    public CheckProposedResult checkProposedNodeAdditions(
        String[] nodes
        ) {
        return this.checkProposedNodeAdditions(new CheckProposedNodeAdditionsRequest(nodes));
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
     * ListEvents returns events detected on the cluster, sorted from oldest to newest.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListEventsResult listEvents(final ListEventsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listEvents is not available until version 1.0.");
        }
        if(request.getEventType() != null && request.getEventType() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, eventType is not applicable to this version of the API.");
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
        Optional<Long> endEventID,
        Optional<Long> serviceID,
        Optional<Long> nodeID,
        Optional<Long> driveID,
        Optional<String> startReportTime,
        Optional<String> endReportTime,
        Optional<String> startPublishTime,
        Optional<String> endPublishTime
        ) {
        return this.listEvents(new ListEventsRequest(maxEvents, startEventID, endEventID, serviceID, nodeID, driveID, startReportTime, endReportTime, startPublishTime, endPublishTime));
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
        Optional<Long> endEventID,
        Optional<String> eventType,
        Optional<Long> serviceID,
        Optional<Long> nodeID,
        Optional<Long> driveID,
        Optional<String> startReportTime,
        Optional<String> endReportTime,
        Optional<String> startPublishTime,
        Optional<String> endPublishTime
        ) {
        return this.listEvents(new ListEventsRequest(maxEvents, startEventID, endEventID, eventType, serviceID, nodeID, driveID, startReportTime, endReportTime, startPublishTime, endPublishTime));
    }
    

    
    /** 
     * You can use the GetActiveTlsCiphers method to get a list of the TLS ciphers that are currently accepted on the cluster.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Cluster")
    public GetActiveTlsCiphersResult getActiveTlsCiphers() {
        return super.sendRequest("GetActiveTlsCiphers", null, null, GetActiveTlsCiphersResult.class);
    }
    
    /** 
     * You can use the SetLicenseKey method to set the SerialNumber And OrderNumber for the cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLicenseKeyResult setLicenseKey(final SetLicenseKeyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.2")) {
            throw new ApiException("The command, setLicenseKey is not available until version 12.2.");
        }
        return super.sendRequest("SetLicenseKey", request, SetLicenseKeyRequest.class, SetLicenseKeyResult.class);
    }

    
    /** 
     * You can use the SetLicenseKey method to set the SerialNumber And OrderNumber for the cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLicenseKeyResult setLicenseKey(
        String serialNumber,
        String orderNumber
        ) {
        return this.setLicenseKey(new SetLicenseKeyRequest(serialNumber, orderNumber));
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
     * CreateSupportBundle enables you to create a support bundle file under the node's directory. After creation, the bundle is stored on the node as a tar.gz file.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Node")
    public CreateSupportBundleResult createSupportBundle(final CreateSupportBundleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, resetNode is not available until version 5.0.");
        }
        if(request.getReboot() != null && request.getReboot() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, reboot is not applicable to this version of the API.");
        }
        if(request.getOptions() != null && request.getOptions() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, options is not applicable to this version of the API.");
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
        Boolean force,
        Optional<Boolean> reboot,
        Optional<String> options
        ) {
        return this.resetNode(new ResetNodeRequest(build, force, reboot, options));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetBackupTarget enables you to return information about a specific backup target that you have created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetBackupTargetResult getBackupTarget(final GetBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * ModifyBackupTarget enables you to change attributes of a backup target.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ModifyBackupTargetResult modifyBackupTarget(final ModifyBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * You can use ListBackupTargets to retrieve information about all backup targets that have been created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListBackupTargetsResult listBackupTargets() {
        return super.sendRequest("ListBackupTargets", null, null, ListBackupTargetsResult.class);
    }
    
    /** 
     * CreateBackupTarget enables you to create and store backup target information so that you do not need to re-enter it each time a backup is created.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateBackupTargetResult createBackupTarget(final CreateBackupTargetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        Attributes attributes
        ) {
        return this.createBackupTarget(new CreateBackupTargetRequest(name, attributes));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListGroupSnapshotsResult listGroupSnapshots(final ListGroupSnapshotsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
            throw new ApiException("The command, listGroupSnapshots is not available until version 7.0.");
        }
        if(request.getGroupSnapshotID() != null && request.getGroupSnapshotID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * DeleteSnapshot enables you to delete a snapshot. A snapshot that is currently the "active" snapshot cannot be deleted. You must
     * rollback and make another snapshot "active" before the current snapshot can be deleted. For more details on rolling back snapshots, see RollbackToSnapshot.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public DeleteSnapshotResult deleteSnapshot(final DeleteSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * DeleteGroupSnapshot enables you to delete a group snapshot. You can use the saveMembers parameter to preserve all the snapshots that were made for the volumes in the group, but the group association is removed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteGroupSnapshotResult deleteGroupSnapshot(final DeleteGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListSnapshotsResult listSnapshots(final ListSnapshotsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
     * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
     * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CreateSnapshotResult createSnapshot(final CreateSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
            throw new ApiException("The command, createSnapshot is not available until version 6.0.");
        }
        if(request.getEnableRemoteReplication() != null && request.getEnableRemoteReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, enableRemoteReplication is not applicable to this version of the API.");
        }
        if(request.getRetention() != null && request.getRetention() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, retention is not applicable to this version of the API.");
        }
        if(request.getSnapMirrorLabel() != null && request.getSnapMirrorLabel() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, snapMirrorLabel is not applicable to this version of the API.");
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
        Optional<Attributes> attributes,
        Optional<String> snapMirrorLabel
        ) {
        return this.createSnapshot(new CreateSnapshotRequest(volumeID, snapshotID, name, enableRemoteReplication, retention, attributes, snapMirrorLabel));
    }
    
    /** 
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(final ModifyGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The command, modifyGroupSnapshot is not available until version 8.0.");
        }
        if(request.getSnapMirrorLabel() != null && request.getSnapMirrorLabel() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, snapMirrorLabel is not applicable to this version of the API.");
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
     * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyGroupSnapshotResult modifyGroupSnapshot(
        Long groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> snapMirrorLabel
        ) {
        return this.modifyGroupSnapshot(new ModifyGroupSnapshotRequest(groupSnapshotID, expirationTime, enableRemoteReplication, snapMirrorLabel));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(final ModifySnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The command, modifySnapshot is not available until version 8.0.");
        }
        if(request.getSnapMirrorLabel() != null && request.getSnapMirrorLabel() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, snapMirrorLabel is not applicable to this version of the API.");
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
     * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
     * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifySnapshotResult modifySnapshot(
        Long snapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> snapMirrorLabel
        ) {
        return this.modifySnapshot(new ModifySnapshotRequest(snapshotID, expirationTime, enableRemoteReplication, snapMirrorLabel));
    }
    
    /** 
     * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
     * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateGroupSnapshotResult createGroupSnapshot(final CreateGroupSnapshotRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
            throw new ApiException("The command, createGroupSnapshot is not available until version 7.0.");
        }
        if(request.getEnableRemoteReplication() != null && request.getEnableRemoteReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, enableRemoteReplication is not applicable to this version of the API.");
        }
        if(request.getRetention() != null && request.getRetention() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, retention is not applicable to this version of the API.");
        }
        if(request.getSnapMirrorLabel() != null && request.getSnapMirrorLabel() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, snapMirrorLabel is not applicable to this version of the API.");
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
        Optional<Attributes> attributes,
        Optional<String> snapMirrorLabel
        ) {
        return this.createGroupSnapshot(new CreateGroupSnapshotRequest(volumes, name, enableRemoteReplication, retention, attributes, snapMirrorLabel));
    }
    
    /** 
     * You can use SetLoginSessionInfo to set the period of time that a session's login authentication is valid. After the log in period elapses without activity on the system, the authentication expires. New login credentials are required for continued access to the cluster after the timeout period has elapsed.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public SetLoginSessionInfoResult setLoginSessionInfo(final SetLoginSessionInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
        Optional<String> timeout
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetRemoteLoggingHosts enables you to retrieve the current list of log servers.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetRemoteLoggingHostsResult getRemoteLoggingHosts() {
        return super.sendRequest("GetRemoteLoggingHosts", null, null, GetRemoteLoggingHostsResult.class);
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
     * ModifySchedule enables you to change the intervals at which a scheduled snapshot occurs. This allows for adjustment to the snapshot frequency and retention.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ModifyScheduleResult modifySchedule(final ModifyScheduleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
     * You can use the GetSchedule method to retrieve information about a scheduled snapshot. You can see information about a specific
     * schedule if there are many snapshot schedules in the system. You also retrieve information about more than one schedule with this
     * method by specifying additional scheduleIDs in the parameter.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public GetScheduleResult getSchedule(final GetScheduleRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
     * This will invoke any API method supported by the SolidFire API for the version and port the connection is using.
     * Returns a nested hashtable of key/value pairs that contain the result of the invoked method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Both")
    public Attributes invokeSFApi(final InvokeSFApiRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetIpmiConfigResult getIpmiConfig(final GetIpmiConfigRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
    @ConnectionType("Node")
    public GetIpmiInfoResult getIpmiInfo() {
        return super.sendRequest("GetIpmiInfo", null, null, GetIpmiInfoResult.class);
    }
    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh(final EnableClusterSshRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The command, enableClusterSsh is not available until version 10.3.");
        }
        if(request.getDuration() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, duration is not applicable to this version of the API.");
        }
        return super.sendRequest("EnableClusterSsh", request, EnableClusterSshRequest.class, EnableClusterSshResult.class);
    }

    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh() {
        return super.sendRequest("EnableClusterSsh", null, null, EnableClusterSshResult.class);
    }
    
    /** 
     * Enables SSH on all nodes in the cluster.
     * Overwrites previous duration.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public EnableClusterSshResult enableClusterSsh(
        String duration
        ) {
        return this.enableClusterSsh(new EnableClusterSshRequest(duration));
    }
    

    
    /** 
     * Disables SSH on all nodes in the cluster.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public DisableClusterSshResult disableClusterSsh() {
        return super.sendRequest("DisableClusterSsh", null, null, DisableClusterSshResult.class);
    }
    

    
    /** 
     * Returns SSH status for the targeted node.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Node")
    public GetSshInfoResult getSshInfo() {
        return super.sendRequest("GetSshInfo", null, null, GetSshInfoResult.class);
    }
    

    
    /** 
     * Enables SSH on the targeted node.
     * This does not effect the cluster-wide SSH timeout duration.
     * The node is not exempt from the SSH shut off by the global timeout.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Node")
    public EnableSshResult enableSsh() {
        return super.sendRequest("EnableSsh", null, null, EnableSshResult.class);
    }
    

    
    /** 
     * Disables SSH on the targeted node.
     * This does not effect the cluster-wide SSH timeout duration.
     * The node is not exempt from the SSH shut off by the global timeout.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Node")
    public DisableSshResult disableSsh() {
        return super.sendRequest("DisableSsh", null, null, DisableSshResult.class);
    }
    

    
    /** 
     * Returns SSH status for the cluster.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetClusterSshInfoResult getClusterSshInfo() {
        return super.sendRequest("GetClusterSshInfo", null, null, GetClusterSshInfoResult.class);
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
     * You can use ListISCSISessions to return iSCSI information for volumes in the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListISCSISessionsResult listISCSISessions() {
        return super.sendRequest("ListISCSISessions", null, null, ListISCSISessionsResult.class);
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
     * ListNetworkInterfaces enables you to retrieve information about each network interface on a node. The API method is intended for use on individual nodes; userid and password authentication is required for access to individual nodes.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Node")
    public ListNetworkInterfacesResult listNetworkInterfaces() {
        return super.sendRequest("ListNetworkInterfaces", null, null, ListNetworkInterfacesResult.class);
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
    
    /** 
     * ListVolumeAccessGroups enables you to return
     * information about the volume access groups that are
     * currently in the system.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeAccessGroupsResult listVolumeAccessGroups(final ListVolumeAccessGroupsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public CreateVolumeAccessGroupResult createVolumeAccessGroup(final CreateVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, createVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getVirtualNetworkID() != null && request.getVirtualNetworkID() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The parameter, virtualNetworkID is not applicable to this version of the API.");
        }
        if(request.getVirtualNetworkTags() != null && request.getVirtualNetworkTags() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, deleteVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getDeleteOrphanInitiators() != null && request.getDeleteOrphanInitiators() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, deleteOrphanInitiators is not applicable to this version of the API.");
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
     * DeleteVolumeAccessGroup enables you to delete a
     * volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public DeleteVolumeAccessGroupResult deleteVolumeAccessGroup(
        Long volumeAccessGroupID,
        Optional<Boolean> deleteOrphanInitiators
        ) {
        return this.deleteVolumeAccessGroup(new DeleteVolumeAccessGroupRequest(volumeAccessGroupID, deleteOrphanInitiators));
    }
    
    /** 
     * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult modifyVolumeAccessGroup(final ModifyVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, modifyVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getDeleteOrphanInitiators() != null && request.getDeleteOrphanInitiators() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Boolean> deleteOrphanInitiators,
        Optional<Attributes> attributes
        ) {
        return this.modifyVolumeAccessGroup(new ModifyVolumeAccessGroupRequest(volumeAccessGroupID, name, initiators, volumes, deleteOrphanInitiators, attributes));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * ListStorageContainers enables you to retrieve information about all virtual volume storage containers known to the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListStorageContainersResult listStorageContainers(final ListStorageContainersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * GetStorageContainerEfficiency enables you to retrieve efficiency information about a virtual volume storage container.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetStorageContainerEfficiencyResult getStorageContainerEfficiency(final GetStorageContainerEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * DeleteStorageContainers enables you to remove up to 2000 Virtual Volume (VVol) storage containers from the system at one time.
     * The storage containers you remove must not contain any VVols.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public DeleteStorageContainerResult deleteStorageContainers(final DeleteStorageContainersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * CreateStorageContainer enables you to create a Virtual Volume (VVol) storage container. Storage containers are associated with a SolidFire storage system account, and are used for reporting and resource allocation. Storage containers can only be associated with virtual volumes. You need at least one storage container to use the Virtual Volumes feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateStorageContainerResult createStorageContainer(final CreateStorageContainerRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVolumeStatsByVirtualVolume enables you to list volume statistics for any volumes in the system that are associated with virtual volumes. Statistics are cumulative from the creation of the volume.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVirtualVolumeResult listVolumeStatsByVirtualVolume(final ListVolumeStatsByVirtualVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * You can use EnableFeature to enable cluster features that are disabled by default.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public EnableFeatureResult enableFeature(final EnableFeatureRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeTasksResult listVirtualVolumeTasks(final ListVirtualVolumeTasksRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVirtualVolumes enables you to list the virtual volumes currently in the system. You can use this method to list all virtual volumes,
     * or only list a subset.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumesResult listVirtualVolumes(final ListVirtualVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVirtualVolumeBindings returns a list of all virtual volumes in the cluster that are bound to protocol endpoints.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeBindingsResult listVirtualVolumeBindings(final ListVirtualVolumeBindingsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * GetFeatureStatus enables you to retrieve the status of a cluster feature.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public GetFeatureStatusResult getFeatureStatus(final GetFeatureStatusRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVirtualVolumeHosts returns a list of all virtual volume hosts known to the cluster. A virtual volume host is a VMware ESX host
     * that has initiated a session with the VASA API provider.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListVirtualVolumeHostsResult listVirtualVolumeHosts(final ListVirtualVolumeHostsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListProtocolEndpoints enables you to retrieve information about all protocol endpoints in the cluster. Protocol endpoints govern
     * access to their associated virtual volume storage containers.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListProtocolEndpointsResult listProtocolEndpoints(final ListProtocolEndpointsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listDeletedVolumes is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
     * available for connection via iSCSI.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CreateVolumeResult createVolume(final CreateVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, createVolume is not available until version 1.0.");
        }
        if(request.getAssociateWithQoSPolicy() != null && request.getAssociateWithQoSPolicy() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, associateWithQoSPolicy is not applicable to this version of the API.");
        }
        if(request.getAccess() != null && request.getAccess() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, access is not applicable to this version of the API.");
        }
        if(request.getEnableSnapMirrorReplication() != null && request.getEnableSnapMirrorReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, enableSnapMirrorReplication is not applicable to this version of the API.");
        }
        if(request.getQosPolicyID() != null && request.getQosPolicyID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
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
        Optional<Boolean> enable512e,
        Optional<QoS> qos,
        Optional<Attributes> attributes,
        Optional<String> protectionScheme
        ) {
        return this.createVolume(new CreateVolumeRequest(name, accountID, totalSize, enable512e, qos, attributes, protectionScheme));
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
        Optional<Boolean> enable512e,
        Optional<QoS> qos,
        Optional<Attributes> attributes,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<String> access,
        Optional<Boolean> enableSnapMirrorReplication,
        Optional<Long> qosPolicyID,
        Optional<String> protectionScheme
        ) {
        return this.createVolume(new CreateVolumeRequest(name, accountID, totalSize, enable512e, qos, attributes, associateWithQoSPolicy, access, enableSnapMirrorReplication, qosPolicyID, protectionScheme));
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
     * CancelClone enables you to stop an ongoing CloneVolume or CopyVolume process. When you cancel a group clone operation, the
     * system completes and removes the operation's associated asyncHandle.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CancelCloneResult cancelClone(final CancelCloneRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
     * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
     * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public CloneVolumeResult cloneVolume(final CloneVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, cloneVolume is not available until version 1.0.");
        }
        if(request.getAttributes() != null && request.getAttributes() != Optional.<Attributes>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
            throw new ApiException("The parameter, attributes is not applicable to this version of the API.");
        }
        if(request.getEnableSnapMirrorReplication() != null && request.getEnableSnapMirrorReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, enableSnapMirrorReplication is not applicable to this version of the API.");
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
        Optional<Boolean> enable512e,
        Optional<Boolean> enableSnapMirrorReplication
        ) {
        return this.cloneVolume(new CloneVolumeRequest(volumeID, name, newAccountID, newSize, access, snapshotID, attributes, enable512e, enableSnapMirrorReplication));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * GetVolumeStats enables  you to retrieve high-level activity measurements for a single volume. Values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetVolumeStatsResult getVolumeStats(final GetVolumeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy(final CreateQoSPolicyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, createQoSPolicy is not available until version 10.0.");
        }
        if(request.getName() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getQos() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qos is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateQoSPolicy", request, CreateQoSPolicyRequest.class, CreateQoSPolicyResult.class);
    }

    
    /** 
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy() {
        return super.sendRequest("CreateQoSPolicy", null, null, CreateQoSPolicyResult.class);
    }
    
    /** 
     * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public CreateQoSPolicyResult createQoSPolicy(
        String name,
        QoS qos
        ) {
        return this.createQoSPolicy(new CreateQoSPolicyRequest(name, qos));
    }
    
    /** 
     * ListVolumeStatsByVolumeAccessGroup enables you to get total activity measurements for all of the volumes that are a member of the
     * specified volume access group(s).
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeAccessGroupResult listVolumeStatsByVolumeAccessGroup(final ListVolumeStatsByVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, listVolumeStatsByVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListVolumeStatsByAccount returns high-level activity measurements for every account. Values are summed from all the volumes owned by the account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByAccountResult listVolumeStatsByAccount(final ListVolumeStatsByAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listVolumeStatsByAccount is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ListActiveVolumes enables you to return the list of active volumes currently in the system. The list of volumes is returned sorted in
     * VolumeID order and can be returned in multiple parts (pages).
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveVolumesResult listActiveVolumes(final ListActiveVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listActiveVolumes is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * StartBulkVolumeWrite enables you to initialize a bulk volume write session on a specified volume. Only two bulk volume processes can run simultaneously on a volume. When you initialize the write session, data is written to a SolidFire storage volume from an external backup source. The external data is accessed by a web server running on an SF-series node. Communications and server
     * interaction information for external data access is passed by a script running on the storage system.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartBulkVolumeWriteResult startBulkVolumeWrite(final StartBulkVolumeWriteRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeVolumesFromVolumeAccessGroup(final RemoveVolumesFromVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * ListVolumeQoSHistograms returns histograms detailing volume performance relative to QOS settings.
     * It may take up to 5 seconds for newly created volumes to have accurate histogram data available.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeQoSHistogramsResult listVolumeQoSHistograms(final ListVolumeQoSHistogramsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, listVolumeQoSHistograms is not available until version 11.0.");
        }
        return super.sendRequest("ListVolumeQoSHistograms", request, ListVolumeQoSHistogramsRequest.class, ListVolumeQoSHistogramsResult.class);
    }

    
    /** 
     * ListVolumeQoSHistograms returns histograms detailing volume performance relative to QOS settings.
     * It may take up to 5 seconds for newly created volumes to have accurate histogram data available.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeQoSHistogramsResult listVolumeQoSHistograms(
        Optional<Long> volumeIDs
        ) {
        return this.listVolumeQoSHistograms(new ListVolumeQoSHistogramsRequest(volumeIDs));
    }
    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy(final DeleteQoSPolicyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, deleteQoSPolicy is not available until version 10.0.");
        }
        if(request.getQosPolicyID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
        }
        return super.sendRequest("DeleteQoSPolicy", request, DeleteQoSPolicyRequest.class, DeleteQoSPolicyResult.class);
    }

    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy() {
        return super.sendRequest("DeleteQoSPolicy", null, null, DeleteQoSPolicyResult.class);
    }
    
    /** 
     * You can use the DeleteQoSPolicy method to delete a QoS policy from the system.
     * The QoS settings for all volumes created of modified with this policy are unaffected.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public DeleteQoSPolicyResult deleteQoSPolicy(
        Long qosPolicyID
        ) {
        return this.deleteQoSPolicy(new DeleteQoSPolicyRequest(qosPolicyID));
    }
    
    /** 
     * ListVolumeStatsByVolume returns high-level activity measurements for every volume, by volume. Values are cumulative from the
     * creation of the volume.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsByVolumeResult listVolumeStatsByVolume(final ListVolumeStatsByVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listVolumeStatsByVolume is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
     * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public SetDefaultQoSResult setDefaultQoS(final SetDefaultQoSRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
     * return in the list by using the available parameters.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public ListVolumesResult listVolumes(final ListVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
            throw new ApiException("The command, listVolumes is not available until version 8.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        Optional<Long[]> volumeIDs,
        Optional<String> volumeName,
        Optional<String[]> protectionSchemes
        ) {
        return this.listVolumes(new ListVolumesRequest(startVolumeID, limit, volumeStatus, accounts, isPaired, volumeIDs, volumeName, protectionSchemes));
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
        Optional<Boolean> includeVirtualVolumes,
        Optional<String[]> protectionSchemes
        ) {
        return this.listVolumes(new ListVolumesRequest(startVolumeID, limit, volumeStatus, accounts, isPaired, volumeIDs, volumeName, includeVirtualVolumes, protectionSchemes));
    }
    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy(final GetQoSPolicyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, getQoSPolicy is not available until version 10.0.");
        }
        if(request.getQosPolicyID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
        }
        return super.sendRequest("GetQoSPolicy", request, GetQoSPolicyRequest.class, GetQoSPolicyResult.class);
    }

    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy() {
        return super.sendRequest("GetQoSPolicy", null, null, GetQoSPolicyResult.class);
    }
    
    /** 
     * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetQoSPolicyResult getQoSPolicy(
        Long qosPolicyID
        ) {
        return this.getQoSPolicy(new GetQoSPolicyRequest(qosPolicyID));
    }
    
    /** 
     * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListVolumesForAccountResult listVolumesForAccount(final ListVolumesForAccountRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, listVolumesForAccount is not available until version 1.0.");
        }
        if(request.getIncludeVirtualVolumes() != null && request.getIncludeVirtualVolumes() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ModifyVolumesResult modifyVolumes(final ModifyVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The command, modifyVolumes is not available until version 9.0.");
        }
        if(request.getAssociateWithQoSPolicy() != null && request.getAssociateWithQoSPolicy() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, associateWithQoSPolicy is not applicable to this version of the API.");
        }
        if(request.getQosPolicyID() != null && request.getQosPolicyID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
        }
        if(request.getEnableSnapMirrorReplication() != null && request.getEnableSnapMirrorReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, enableSnapMirrorReplication is not applicable to this version of the API.");
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
     * Both the target and source volumes must be of the same size.
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
    @Override
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
        ) {
        return this.modifyVolumes(new ModifyVolumesRequest(volumeIDs, accountID, access, qos, totalSize, associateWithQoSPolicy, qosPolicyID, attributes, enableSnapMirrorReplication));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * AddVolumesToVolumeAccessGroup enables you to add
     * volumes to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addVolumesToVolumeAccessGroup(final AddVolumesToVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * You can use UpdateBulkVolumeStatus in a script to update the status of a bulk volume job that you started with the
     * StartBulkVolumeRead or StartBulkVolumeWrite methods.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public UpdateBulkVolumeStatusResult updateBulkVolumeStatus(final UpdateBulkVolumeStatusRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
     * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyVolumeResult modifyVolume(final ModifyVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, modifyVolume is not available until version 1.0.");
        }
        if(request.getAssociateWithQoSPolicy() != null && request.getAssociateWithQoSPolicy() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, associateWithQoSPolicy is not applicable to this version of the API.");
        }
        if(request.getQosPolicyID() != null && request.getQosPolicyID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
        }
        if(request.getEnableSnapMirrorReplication() != null && request.getEnableSnapMirrorReplication() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, enableSnapMirrorReplication is not applicable to this version of the API.");
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
     * Both the target and source volumes must be of the same size.
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
     * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
     * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
     * default QoS values for a newly created volume by running the GetDefaultQoS method.
     * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
     * 1. Increase the size of the "Replication Target" volume.
     * 2. Increase the size of the source or "Read / Write" volume.
     * Both the target and source volumes must be of the same size.
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
        Optional<Attributes> attributes,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<Long> qosPolicyID,
        Optional<Boolean> enableSnapMirrorReplication
        ) {
        return this.modifyVolume(new ModifyVolumeRequest(volumeID, accountID, access, qos, totalSize, attributes, associateWithQoSPolicy, qosPolicyID, enableSnapMirrorReplication));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy(final ModifyQoSPolicyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, modifyQoSPolicy is not available until version 10.0.");
        }
        if(request.getQosPolicyID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qosPolicyID is not applicable to this version of the API.");
        }
        if(request.getName() != null && request.getName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getQos() != null && request.getQos() != Optional.<QoS>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, qos is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifyQoSPolicy", request, ModifyQoSPolicyRequest.class, ModifyQoSPolicyResult.class);
    }

    
    /** 
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy() {
        return super.sendRequest("ModifyQoSPolicy", null, null, ModifyQoSPolicyResult.class);
    }
    
    /** 
     * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public ModifyQoSPolicyResult modifyQoSPolicy(
        Long qosPolicyID,
        Optional<String> name,
        Optional<QoS> qos
        ) {
        return this.modifyQoSPolicy(new ModifyQoSPolicyRequest(qosPolicyID, name, qos));
    }
    
    /** 
     * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RestoreDeletedVolumeResult restoreDeletedVolume(final RestoreDeletedVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListVolumeStatsResult listVolumeStats(final ListVolumeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * GetVolumeEfficiency enables you to retrieve information about a volume. Only the volume you give as a parameter in this API method is used to compute the capacity.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetVolumeEfficiencyResult getVolumeEfficiency(final GetVolumeEfficiencyRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
     * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
     * typically required.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public PurgeDeletedVolumeResult purgeDeletedVolume(final PurgeDeletedVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * You can use the ListQoSPolicies method to list all the settings of all QoS policies on the system.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public ListQoSPoliciesResult listQoSPolicies() {
        return super.sendRequest("ListQoSPolicies", null, null, ListQoSPoliciesResult.class);
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
     * SetSnmpACL enables you to configure SNMP access permissions on the cluster nodes. The values you set with this interface apply to all
     * nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpACL. Also note
     * that the values set with this interface replace all network or usmUsers values set with the older SetSnmpInfo.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public SetSnmpACLResult setSnmpACL(final SetSnmpACLRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
     * You can use GetSnmpTrapInfo to return current SNMP trap configuration information.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public GetSnmpTrapInfoResult getSnmpTrapInfo() {
        return super.sendRequest("GetSnmpTrapInfo", null, null, GetSnmpTrapInfoResult.class);
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
     * You can use SetSnmpTrapInfo to enable and disable the generation of cluster SNMP notifications (traps) and to specify the set of network host computers that receive the notifications. The values you pass with each SetSnmpTrapInfo method call replace all values set in any previous call to SetSnmpTrapInfo.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public SetSnmpTrapInfoResult setSnmpTrapInfo(final SetSnmpTrapInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        Optional<SnmpTrapRecipient[]> trapRecipients,
        Boolean clusterFaultTrapsEnabled,
        Boolean clusterFaultResolvedTrapsEnabled,
        Boolean clusterEventTrapsEnabled
        ) {
        return this.setSnmpTrapInfo(new SetSnmpTrapInfoRequest(trapRecipients, clusterFaultTrapsEnabled, clusterFaultResolvedTrapsEnabled, clusterEventTrapsEnabled));
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
     * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
     * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public EnableSnmpResult enableSnmp(final EnableSnmpRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
     * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
     * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
     * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public SetSnmpInfoResult setSnmpInfo(final SetSnmpInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * You can use DisableSnmp to disable SNMP on the cluster nodes.
     **/
    @Override
    @Since("8.0")
    @ConnectionType("Cluster")
    public DisableSnmpResult disableSnmp() {
        return super.sendRequest("DisableSnmp", null, null, DisableSnmpResult.class);
    }
    
    /** 
     * ListInitiators enables you to list initiator IQNs or World Wide Port Names (WWPNs).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListInitiatorsResult listInitiators(final ListInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * CreateInitiators enables you to create multiple new initiator IQNs or World Wide Port Names (WWPNs) and optionally assign them
     * aliases and attributes. When you use CreateInitiators to create new initiators, you can also add them to volume access groups.
     * If CreateInitiators fails to create one of the initiators provided in the parameter, the method returns an error and does not create
     * any initiators (no partial completion is possible).
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public CreateInitiatorsResult createInitiators(final CreateInitiatorsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * AddInitiatorsToVolumeAccessGroup enables you
     * to add initiators to a specified volume access group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult addInitiatorsToVolumeAccessGroup(final AddInitiatorsToVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * RemoveInitiatorsFromVolumeAccessGroup enables
     * you to remove initiators from a specified volume access
     * group.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public ModifyVolumeAccessGroupResult removeInitiatorsFromVolumeAccessGroup(final RemoveInitiatorsFromVolumeAccessGroupRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
            throw new ApiException("The command, removeInitiatorsFromVolumeAccessGroup is not available until version 5.0.");
        }
        if(request.getDeleteOrphanInitiators() != null && request.getDeleteOrphanInitiators() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
            throw new ApiException("The parameter, deleteOrphanInitiators is not applicable to this version of the API.");
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
        String[] initiators
        ) {
        return this.removeInitiatorsFromVolumeAccessGroup(new RemoveInitiatorsFromVolumeAccessGroupRequest(volumeAccessGroupID, initiators));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public ListActivePairedVolumesResult listActivePairedVolumes(final ListActivePairedVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * You can use the CompleteClusterPairing method with the encoded key received from the  StartClusterPairing method to complete the cluster pairing process. The CompleteClusterPairing method is the second step in the cluster pairing process. 
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public CompleteClusterPairingResult completeClusterPairing(final CompleteClusterPairingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * RemoveVolumePair enables you to remove the remote pairing between two volumes. Use this method on both the source and target volumes that are paired together. When you remove the volume pairing information, data is no longer replicated to or from the volume.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveVolumePairResult removeVolumePair(final RemoveVolumePairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * StartVolumePairing enables you to create an encoded key from a volume that is used to pair with another volume. The key that this
     * method creates is used in the CompleteVolumePairing API method to establish a volume pairing.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartVolumePairingResult startVolumePairing(final StartVolumePairingRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
            throw new ApiException("The command, startVolumePairing is not available until version 6.0.");
        }
        if(request.getMode() != null && request.getMode() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
     * You can use the RemoveClusterPair method to close the open connections between two paired clusters.
     * Note: Before you remove a cluster pair, you must first remove all volume pairing to the clusters with the "RemoveVolumePair" API method.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public RemoveClusterPairResult removeClusterPair(final RemoveClusterPairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * You can use the StartClusterPairing method to create an encoded key from a cluster that is used to pair with another cluster. The key created from this API method is used in the CompleteClusterPairing API method to establish a cluster pairing. You can pair a cluster with a maximum of four other clusters. 
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public StartClusterPairingResult startClusterPairing() {
        return super.sendRequest("StartClusterPairing", null, null, StartClusterPairingResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity(final GetSnapMirrorClusterIdentityRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, getSnapMirrorClusterIdentity is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("GetSnapMirrorClusterIdentity", request, GetSnapMirrorClusterIdentityRequest.class, GetSnapMirrorClusterIdentityResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity() {
        return super.sendRequest("GetSnapMirrorClusterIdentity", null, null, GetSnapMirrorClusterIdentityResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetSnapMirrorClusterIdentityResult getSnapMirrorClusterIdentity(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.getSnapMirrorClusterIdentity(new GetSnapMirrorClusterIdentityRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship(final ResumeSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, resumeSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        return super.sendRequest("ResumeSnapMirrorRelationship", request, ResumeSnapMirrorRelationshipRequest.class, ResumeSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship() {
        return super.sendRequest("ResumeSnapMirrorRelationship", null, null, ResumeSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ResumeSnapMirrorRelationship method to enable future transfers for a quiesced SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResumeSnapMirrorRelationshipResult resumeSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume
        ) {
        return this.resumeSnapMirrorRelationship(new ResumeSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint(final ModifySnapMirrorEndpointRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, modifySnapMirrorEndpoint is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getManagementIP() != null && request.getManagementIP() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, managementIP is not applicable to this version of the API.");
        }
        if(request.getUsername() != null && request.getUsername() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, username is not applicable to this version of the API.");
        }
        if(request.getPassword() != null && request.getPassword() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, password is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifySnapMirrorEndpoint", request, ModifySnapMirrorEndpointRequest.class, ModifySnapMirrorEndpointResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint() {
        return super.sendRequest("ModifySnapMirrorEndpoint", null, null, ModifySnapMirrorEndpointResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointResult modifySnapMirrorEndpoint(
        Long snapMirrorEndpointID,
        Optional<String> managementIP,
        Optional<String> username,
        Optional<String> password
        ) {
        return this.modifySnapMirrorEndpoint(new ModifySnapMirrorEndpointRequest(snapMirrorEndpointID, managementIP, username, password));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships(final DeleteSnapMirrorRelationshipsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, deleteSnapMirrorRelationships is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolumes() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolumes is not applicable to this version of the API.");
        }
        return super.sendRequest("DeleteSnapMirrorRelationships", request, DeleteSnapMirrorRelationshipsRequest.class, DeleteSnapMirrorRelationshipsResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships() {
        return super.sendRequest("DeleteSnapMirrorRelationships", null, null, DeleteSnapMirrorRelationshipsResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorRelationshipsResult deleteSnapMirrorRelationships(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo[] destinationVolumes
        ) {
        return this.deleteSnapMirrorRelationships(new DeleteSnapMirrorRelationshipsRequest(snapMirrorEndpointID, destinationVolumes));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers(final ListSnapMirrorVserversRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorVservers is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getVserverType() != null && request.getVserverType() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, vserverType is not applicable to this version of the API.");
        }
        if(request.getVserverName() != null && request.getVserverName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, vserverName is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorVservers", request, ListSnapMirrorVserversRequest.class, ListSnapMirrorVserversResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers() {
        return super.sendRequest("ListSnapMirrorVservers", null, null, ListSnapMirrorVserversResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVserversResult listSnapMirrorVservers(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> vserverType,
        Optional<String> vserverName
        ) {
        return this.listSnapMirrorVservers(new ListSnapMirrorVserversRequest(snapMirrorEndpointID, vserverType, vserverName));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships(final ListSnapMirrorRelationshipsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorRelationships is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && request.getDestinationVolume() != Optional.<SnapMirrorVolumeInfo>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getSourceVolume() != null && request.getSourceVolume() != Optional.<SnapMirrorVolumeInfo>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, sourceVolume is not applicable to this version of the API.");
        }
        if(request.getVserver() != null && request.getVserver() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, vserver is not applicable to this version of the API.");
        }
        if(request.getRelationshipID() != null && request.getRelationshipID() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, relationshipID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorRelationships", request, ListSnapMirrorRelationshipsRequest.class, ListSnapMirrorRelationshipsResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships() {
        return super.sendRequest("ListSnapMirrorRelationships", null, null, ListSnapMirrorRelationshipsResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorRelationshipsResult listSnapMirrorRelationships(
        Optional<Long> snapMirrorEndpointID,
        Optional<SnapMirrorVolumeInfo> destinationVolume,
        Optional<SnapMirrorVolumeInfo> sourceVolume,
        Optional<String> vserver,
        Optional<String> relationshipID
        ) {
        return this.listSnapMirrorRelationships(new ListSnapMirrorRelationshipsRequest(snapMirrorEndpointID, destinationVolume, sourceVolume, vserver, relationshipID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo(final GetOntapVersionInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, getOntapVersionInfo is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("GetOntapVersionInfo", request, GetOntapVersionInfoRequest.class, GetOntapVersionInfoResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo() {
        return super.sendRequest("GetOntapVersionInfo", null, null, GetOntapVersionInfoResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses GetOntapVersionInfo to get information about API version support from the ONTAP cluster in a SnapMirror relationship.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public GetOntapVersionInfoResult getOntapVersionInfo(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.getOntapVersionInfo(new GetOntapVersionInfoRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies(final ListSnapMirrorPoliciesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorPolicies is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorPolicies", request, ListSnapMirrorPoliciesRequest.class, ListSnapMirrorPoliciesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies() {
        return super.sendRequest("ListSnapMirrorPolicies", null, null, ListSnapMirrorPoliciesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorPolicies method to list all SnapMirror policies on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorPoliciesResult listSnapMirrorPolicies(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.listSnapMirrorPolicies(new ListSnapMirrorPoliciesRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates(final ListSnapMirrorAggregatesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorAggregates is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorAggregates", request, ListSnapMirrorAggregatesRequest.class, ListSnapMirrorAggregatesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates() {
        return super.sendRequest("ListSnapMirrorAggregates", null, null, ListSnapMirrorAggregatesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorAggregates method to list all SnapMirror aggregates that are available on the remote ONTAP system. An aggregate describes a set of physical storage resources.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorAggregatesResult listSnapMirrorAggregates(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.listSnapMirrorAggregates(new ListSnapMirrorAggregatesRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship(final BreakSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, breakSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        return super.sendRequest("BreakSnapMirrorRelationship", request, BreakSnapMirrorRelationshipRequest.class, BreakSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship() {
        return super.sendRequest("BreakSnapMirrorRelationship", null, null, BreakSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorRelationship method to break a SnapMirror relationship. When a SnapMirror relationship is broken, the destination volume is made read-write and independent, and can then diverge from the source. You can reestablish the relationship with the ResyncSnapMirrorRelationship API method. This method requires the ONTAP cluster to be available.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorRelationshipResult breakSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume
        ) {
        return this.breakSnapMirrorRelationship(new BreakSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints(final ListSnapMirrorEndpointsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorEndpoints is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointIDs() != null && request.getSnapMirrorEndpointIDs() != Optional.<Long[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointIDs is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorEndpoints", request, ListSnapMirrorEndpointsRequest.class, ListSnapMirrorEndpointsResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints() {
        return super.sendRequest("ListSnapMirrorEndpoints", null, null, ListSnapMirrorEndpointsResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorEndpointsResult listSnapMirrorEndpoints(
        Optional<Long[]> snapMirrorEndpointIDs
        ) {
        return this.listSnapMirrorEndpoints(new ListSnapMirrorEndpointsRequest(snapMirrorEndpointIDs));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules(final ListSnapMirrorSchedulesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorSchedules is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorSchedules", request, ListSnapMirrorSchedulesRequest.class, ListSnapMirrorSchedulesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules() {
        return super.sendRequest("ListSnapMirrorSchedules", null, null, ListSnapMirrorSchedulesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorSchedules method to get a list of schedules that are available on a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorSchedulesResult listSnapMirrorSchedules(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.listSnapMirrorSchedules(new ListSnapMirrorSchedulesRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship(final ResyncSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, resyncSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getMaxTransferRate() != null && request.getMaxTransferRate() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, maxTransferRate is not applicable to this version of the API.");
        }
        if(request.getSourceVolume() != null && request.getSourceVolume() != Optional.<SnapMirrorVolumeInfo>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, sourceVolume is not applicable to this version of the API.");
        }
        return super.sendRequest("ResyncSnapMirrorRelationship", request, ResyncSnapMirrorRelationshipRequest.class, ResyncSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship() {
        return super.sendRequest("ResyncSnapMirrorRelationship", null, null, ResyncSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ResyncSnapMirrorRelationship method to establish or reestablish a mirror relationship between a source and destination endpoint. When you resync a relationship, the system removes snapshots on the destination volume that are newer than the common snapshot copy, and then mounts the destination volume as a data protection volume with the common snapshot copy as the exported snapshot copy.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ResyncSnapMirrorRelationshipResult resyncSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate,
        Optional<SnapMirrorVolumeInfo> sourceVolume
        ) {
        return this.resyncSnapMirrorRelationship(new ResyncSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume, maxTransferRate, sourceVolume));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship(final QuiesceSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, quiesceSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        return super.sendRequest("QuiesceSnapMirrorRelationship", request, QuiesceSnapMirrorRelationshipRequest.class, QuiesceSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship() {
        return super.sendRequest("QuiesceSnapMirrorRelationship", null, null, QuiesceSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the QuiesceSnapMirrorRelationship method to disable future data transfers for a SnapMirror relationship. If a transfer is in progress, the relationship status becomes "quiescing" until the transfer is complete. If the current transfer is aborted, it will not restart. You can reenable data transfers for the relationship using the ResumeSnapMirrorRelationship API method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public QuiesceSnapMirrorRelationshipResult quiesceSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume
        ) {
        return this.quiesceSnapMirrorRelationship(new QuiesceSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged(final ModifySnapMirrorEndpointUnmanagedRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The command, modifySnapMirrorEndpointUnmanaged is not available until version 10.3.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getClusterName() != null && request.getClusterName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, clusterName is not applicable to this version of the API.");
        }
        if(request.getIpAddresses() != null && request.getIpAddresses() != Optional.<String[]>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, ipAddresses is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifySnapMirrorEndpointUnmanaged", request, ModifySnapMirrorEndpointUnmanagedRequest.class, ModifySnapMirrorEndpointUnmanagedResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged() {
        return super.sendRequest("ModifySnapMirrorEndpointUnmanaged", null, null, ModifySnapMirrorEndpointUnmanagedResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public ModifySnapMirrorEndpointUnmanagedResult modifySnapMirrorEndpointUnmanaged(
        Long snapMirrorEndpointID,
        Optional<String> clusterName,
        Optional<String[]> ipAddresses
        ) {
        return this.modifySnapMirrorEndpointUnmanaged(new ModifySnapMirrorEndpointUnmanagedRequest(snapMirrorEndpointID, clusterName, ipAddresses));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint(final CreateSnapMirrorEndpointRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, createSnapMirrorEndpoint is not available until version 10.1.");
        }
        if(request.getManagementIP() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, managementIP is not applicable to this version of the API.");
        }
        if(request.getUsername() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, username is not applicable to this version of the API.");
        }
        if(request.getPassword() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, password is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateSnapMirrorEndpoint", request, CreateSnapMirrorEndpointRequest.class, CreateSnapMirrorEndpointResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint() {
        return super.sendRequest("CreateSnapMirrorEndpoint", null, null, CreateSnapMirrorEndpointResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointResult createSnapMirrorEndpoint(
        String managementIP,
        String username,
        String password
        ) {
        return this.createSnapMirrorEndpoint(new CreateSnapMirrorEndpointRequest(managementIP, username, password));
    }
    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints(final DeleteSnapMirrorEndpointsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, deleteSnapMirrorEndpoints is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointIDs() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointIDs is not applicable to this version of the API.");
        }
        return super.sendRequest("DeleteSnapMirrorEndpoints", request, DeleteSnapMirrorEndpointsRequest.class, DeleteSnapMirrorEndpointsResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints() {
        return super.sendRequest("DeleteSnapMirrorEndpoints", null, null, DeleteSnapMirrorEndpointsResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public DeleteSnapMirrorEndpointsResult deleteSnapMirrorEndpoints(
        Long[] snapMirrorEndpointIDs
        ) {
        return this.deleteSnapMirrorEndpoints(new DeleteSnapMirrorEndpointsRequest(snapMirrorEndpointIDs));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship(final InitializeSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, initializeSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getMaxTransferRate() != null && request.getMaxTransferRate() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, maxTransferRate is not applicable to this version of the API.");
        }
        return super.sendRequest("InitializeSnapMirrorRelationship", request, InitializeSnapMirrorRelationshipRequest.class, InitializeSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship() {
        return super.sendRequest("InitializeSnapMirrorRelationship", null, null, InitializeSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the InitializeSnapMirrorRelationship method to initialize the destination volume in a SnapMirror relationship by performing an initial baseline transfer between clusters.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public InitializeSnapMirrorRelationshipResult initializeSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate
        ) {
        return this.initializeSnapMirrorRelationship(new InitializeSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume, maxTransferRate));
    }
    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship(final ModifySnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, modifySnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getMaxTransferRate() != null && request.getMaxTransferRate() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, maxTransferRate is not applicable to this version of the API.");
        }
        if(request.getPolicyName() != null && request.getPolicyName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, policyName is not applicable to this version of the API.");
        }
        if(request.getScheduleName() != null && request.getScheduleName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, scheduleName is not applicable to this version of the API.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("ModifySnapMirrorRelationship", request, ModifySnapMirrorRelationshipRequest.class, ModifySnapMirrorRelationshipResult.class);
    }

    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship() {
        return super.sendRequest("ModifySnapMirrorRelationship", null, null, ModifySnapMirrorRelationshipResult.class);
    }
    
    /** 
     * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ModifySnapMirrorRelationshipResult modifySnapMirrorRelationship(
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate,
        Optional<String> policyName,
        Optional<String> scheduleName,
        Long snapMirrorEndpointID
        ) {
        return this.modifySnapMirrorRelationship(new ModifySnapMirrorRelationshipRequest(destinationVolume, maxTransferRate, policyName, scheduleName, snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume(final CreateSnapMirrorVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, createSnapMirrorVolume is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getVserver() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, vserver is not applicable to this version of the API.");
        }
        if(request.getName() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getType() != null && request.getType() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, type is not applicable to this version of the API.");
        }
        if(request.getAggregate() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, aggregate is not applicable to this version of the API.");
        }
        if(request.getSize() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, size is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateSnapMirrorVolume", request, CreateSnapMirrorVolumeRequest.class, SnapMirrorVolume.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume() {
        return super.sendRequest("CreateSnapMirrorVolume", null, null, SnapMirrorVolume.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public SnapMirrorVolume createSnapMirrorVolume(
        Long snapMirrorEndpointID,
        String vserver,
        String name,
        Optional<String> type,
        String aggregate,
        Long size
        ) {
        return this.createSnapMirrorVolume(new CreateSnapMirrorVolumeRequest(snapMirrorEndpointID, vserver, name, type, aggregate, size));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes(final ListSnapMirrorVolumesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorVolumes is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getVserver() != null && request.getVserver() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, vserver is not applicable to this version of the API.");
        }
        if(request.getName() != null && request.getName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, name is not applicable to this version of the API.");
        }
        if(request.getType() != null && request.getType() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, type is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorVolumes", request, ListSnapMirrorVolumesRequest.class, ListSnapMirrorVolumesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes() {
        return super.sendRequest("ListSnapMirrorVolumes", null, null, ListSnapMirrorVolumesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorVolumesResult listSnapMirrorVolumes(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> vserver,
        Optional<String> name,
        Optional<String> type
        ) {
        return this.listSnapMirrorVolumes(new ListSnapMirrorVolumesRequest(snapMirrorEndpointID, vserver, name, type));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns(final ListSnapMirrorLunsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorLuns is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorLuns", request, ListSnapMirrorLunsRequest.class, ListSnapMirrorLunsResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns() {
        return super.sendRequest("ListSnapMirrorLuns", null, null, ListSnapMirrorLunsResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorLunsResult listSnapMirrorLuns(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume
        ) {
        return this.listSnapMirrorLuns(new ListSnapMirrorLunsRequest(snapMirrorEndpointID, destinationVolume));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorRelationshipResult createSnapMirrorRelationship(final CreateSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, createSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getSourceVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, sourceVolume is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getRelationshipType() != null && request.getRelationshipType() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, relationshipType is not applicable to this version of the API.");
        }
        if(request.getPolicyName() != null && request.getPolicyName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, policyName is not applicable to this version of the API.");
        }
        if(request.getScheduleName() != null && request.getScheduleName() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, scheduleName is not applicable to this version of the API.");
        }
        if(request.getMaxTransferRate() != null && request.getMaxTransferRate() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, maxTransferRate is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateSnapMirrorRelationship", request, CreateSnapMirrorRelationshipRequest.class, CreateSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public CreateSnapMirrorRelationshipResult createSnapMirrorRelationship() {
        return super.sendRequest("CreateSnapMirrorRelationship", null, null, CreateSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
     **/
    @Override
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
        ) {
        return this.createSnapMirrorRelationship(new CreateSnapMirrorRelationshipRequest(snapMirrorEndpointID, sourceVolume, destinationVolume, relationshipType, policyName, scheduleName, maxTransferRate));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship(final AbortSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, abortSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getClearCheckpoint() != null && request.getClearCheckpoint() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, clearCheckpoint is not applicable to this version of the API.");
        }
        return super.sendRequest("AbortSnapMirrorRelationship", request, AbortSnapMirrorRelationshipRequest.class, AbortSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship() {
        return super.sendRequest("AbortSnapMirrorRelationship", null, null, AbortSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public AbortSnapMirrorRelationshipResult abortSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Boolean> clearCheckpoint
        ) {
        return this.abortSnapMirrorRelationship(new AbortSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume, clearCheckpoint));
    }
    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged(final CreateSnapMirrorEndpointUnmanagedRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The command, createSnapMirrorEndpointUnmanaged is not available until version 10.3.");
        }
        if(request.getClusterName() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, clusterName is not applicable to this version of the API.");
        }
        if(request.getIpAddresses() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.3")) {
            throw new ApiException("The parameter, ipAddresses is not applicable to this version of the API.");
        }
        return super.sendRequest("CreateSnapMirrorEndpointUnmanaged", request, CreateSnapMirrorEndpointUnmanagedRequest.class, CreateSnapMirrorEndpointUnmanagedResult.class);
    }

    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged() {
        return super.sendRequest("CreateSnapMirrorEndpointUnmanaged", null, null, CreateSnapMirrorEndpointUnmanagedResult.class);
    }
    
    /** 
     * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
     * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public CreateSnapMirrorEndpointUnmanagedResult createSnapMirrorEndpointUnmanaged(
        String clusterName,
        String[] ipAddresses
        ) {
        return this.createSnapMirrorEndpointUnmanaged(new CreateSnapMirrorEndpointUnmanagedRequest(clusterName, ipAddresses));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes(final ListSnapMirrorNodesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorNodes is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorNodes", request, ListSnapMirrorNodesRequest.class, ListSnapMirrorNodesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes() {
        return super.sendRequest("ListSnapMirrorNodes", null, null, ListSnapMirrorNodesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNodes method to get a list of nodes in a remote ONTAP cluster.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNodesResult listSnapMirrorNodes(
        Optional<Long> snapMirrorEndpointID
        ) {
        return this.listSnapMirrorNodes(new ListSnapMirrorNodesRequest(snapMirrorEndpointID));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship(final UpdateSnapMirrorRelationshipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, updateSnapMirrorRelationship is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getDestinationVolume() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, destinationVolume is not applicable to this version of the API.");
        }
        if(request.getMaxTransferRate() != null && request.getMaxTransferRate() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, maxTransferRate is not applicable to this version of the API.");
        }
        return super.sendRequest("UpdateSnapMirrorRelationship", request, UpdateSnapMirrorRelationshipRequest.class, UpdateSnapMirrorRelationshipResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship() {
        return super.sendRequest("UpdateSnapMirrorRelationship", null, null, UpdateSnapMirrorRelationshipResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public UpdateSnapMirrorRelationshipResult updateSnapMirrorRelationship(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate
        ) {
        return this.updateSnapMirrorRelationship(new UpdateSnapMirrorRelationshipRequest(snapMirrorEndpointID, destinationVolume, maxTransferRate));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume(final BreakSnapMirrorVolumeRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, breakSnapMirrorVolume is not available until version 10.1.");
        }
        if(request.getVolumeID() != null && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, volumeID is not applicable to this version of the API.");
        }
        if(request.getSnapshotID() != null && request.getSnapshotID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapshotID is not applicable to this version of the API.");
        }
        if(request.getPreserve() != null && request.getPreserve() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, preserve is not applicable to this version of the API.");
        }
        if(request.getAccess() != null && request.getAccess() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, access is not applicable to this version of the API.");
        }
        return super.sendRequest("BreakSnapMirrorVolume", request, BreakSnapMirrorVolumeRequest.class, BreakSnapMirrorVolumeResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume() {
        return super.sendRequest("BreakSnapMirrorVolume", null, null, BreakSnapMirrorVolumeResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public BreakSnapMirrorVolumeResult breakSnapMirrorVolume(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<Boolean> preserve,
        Optional<String> access
        ) {
        return this.breakSnapMirrorVolume(new BreakSnapMirrorVolumeRequest(volumeID, snapshotID, preserve, access));
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces(final ListSnapMirrorNetworkInterfacesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The command, listSnapMirrorNetworkInterfaces is not available until version 10.1.");
        }
        if(request.getSnapMirrorEndpointID() != null && request.getSnapMirrorEndpointID() != Optional.<Long>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, snapMirrorEndpointID is not applicable to this version of the API.");
        }
        if(request.getInterfaceRole() != null && request.getInterfaceRole() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.1")) {
            throw new ApiException("The parameter, interfaceRole is not applicable to this version of the API.");
        }
        return super.sendRequest("ListSnapMirrorNetworkInterfaces", request, ListSnapMirrorNetworkInterfacesRequest.class, ListSnapMirrorNetworkInterfacesResult.class);
    }

    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces() {
        return super.sendRequest("ListSnapMirrorNetworkInterfaces", null, null, ListSnapMirrorNetworkInterfacesResult.class);
    }
    
    /** 
     * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
     **/
    @Override
    @Since("10.1")
    @ConnectionType("Cluster")
    public ListSnapMirrorNetworkInterfacesResult listSnapMirrorNetworkInterfaces(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> interfaceRole
        ) {
        return this.listSnapMirrorNetworkInterfaces(new ListSnapMirrorNetworkInterfacesRequest(snapMirrorEndpointID, interfaceRole));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * You can use the GetClusterHardwareInfo method to retrieve the hardware status and information for all Fibre Channel nodes, iSCSI
     * nodes and drives in the cluster. This generally includes details about manufacturers, vendors, versions, and other associated hardware
     * identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetClusterHardwareInfoResult getClusterHardwareInfo(final GetClusterHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
     * manufacturers, vendors, versions, and other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeHardwareInfoResult getNodeHardwareInfo(final GetNodeHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * EnableBmcColdReset enables a background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Override
    @Since("9.4")
    @ConnectionType("Cluster")
    public EnableBmcColdResetResult enableBmcColdReset(final EnableBmcColdResetRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.4")) {
            throw new ApiException("The command, enableBmcColdReset is not available until version 9.4.");
        }
        return super.sendRequest("EnableBmcColdReset", request, EnableBmcColdResetRequest.class, EnableBmcColdResetResult.class);
    }

    
    /** 
     * EnableBmcColdReset enables a background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Override
    @Since("9.4")
    @ConnectionType("Cluster")
    public EnableBmcColdResetResult enableBmcColdReset(
        Optional<Long> timeout
        ) {
        return this.enableBmcColdReset(new EnableBmcColdResetRequest(timeout));
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
     * DisableBmcColdReset disables the background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
     **/
    @Override
    @Since("9.4")
    @ConnectionType("Cluster")
    public DisableBmcColdResetResult disableBmcColdReset() {
        return super.sendRequest("DisableBmcColdReset", null, null, DisableBmcColdResetResult.class);
    }
    
    /** 
     * GetNvramInfo enables you to retrieve information from each node about the NVRAM card.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Node")
    public GetNvramInfoResult getNvramInfo(final GetNvramInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * The GetHardwareInfo API method enables you to return hardware information and status for a single node. This generally includes details about manufacturers, vendors, versions, drives, and other associated hardware identification information.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Node")
    public GetHardwareInfoResult getHardwareInfo() {
        return super.sendRequest("GetHardwareInfo", null, null, GetHardwareInfoResult.class);
    }
    
    /** 
     * Test whether the specified KMIP (Key Management Interoperability Protocol) Key Server is functioning normally.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyServerKmipResult testKeyServerKmip(final TestKeyServerKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, testKeyServerKmip is not available until version 11.7.");
        }
        return super.sendRequest("TestKeyServerKmip", request, TestKeyServerKmipRequest.class, TestKeyServerKmipResult.class);
    }

    
    /** 
     * Test whether the specified KMIP (Key Management Interoperability Protocol) Key Server is functioning normally.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyServerKmipResult testKeyServerKmip(
        Long keyServerID
        ) {
        return this.testKeyServerKmip(new TestKeyServerKmipRequest(keyServerID));
    }
    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Providers which have been created via CreateKeyProviderKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyProvidersKmipResult listKeyProvidersKmip(final ListKeyProvidersKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, listKeyProvidersKmip is not available until version 11.7.");
        }
        return super.sendRequest("ListKeyProvidersKmip", request, ListKeyProvidersKmipRequest.class, ListKeyProvidersKmipResult.class);
    }

    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Providers which have been created via CreateKeyProviderKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyProvidersKmipResult listKeyProvidersKmip(
        Optional<Boolean> keyProviderIsActive,
        Optional<Boolean> kmipKeyProviderHasServerAssigned
        ) {
        return this.listKeyProvidersKmip(new ListKeyProvidersKmipRequest(keyProviderIsActive, kmipKeyProviderHasServerAssigned));
    }
    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyServersKmipResult listKeyServersKmip(final ListKeyServersKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, listKeyServersKmip is not available until version 11.7.");
        }
        return super.sendRequest("ListKeyServersKmip", request, ListKeyServersKmipRequest.class, ListKeyServersKmipResult.class);
    }

    
    /** 
     * Returns the list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.  The list can optionally be filtered by specifying additional parameters.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public ListKeyServersKmipResult listKeyServersKmip(
        Optional<Long> keyProviderID,
        Optional<Boolean> kmipAssignedProviderIsActive,
        Optional<Boolean> kmipHasProviderAssigned
        ) {
        return this.listKeyServersKmip(new ListKeyServersKmipRequest(keyProviderID, kmipAssignedProviderIsActive, kmipHasProviderAssigned));
    }
    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Server with the specified attributes. The server will not be contacted as part of this operation so it need not exist or be configured prior.
     * For clustered Key Server configurations, the hostnames or IP Addresses, of all server nodes, must be provided in the kmipKeyServerHostnames parameter.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateKeyServerKmipResult createKeyServerKmip(final CreateKeyServerKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, createKeyServerKmip is not available until version 11.7.");
        }
        return super.sendRequest("CreateKeyServerKmip", request, CreateKeyServerKmipRequest.class, CreateKeyServerKmipResult.class);
    }

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Server with the specified attributes. The server will not be contacted as part of this operation so it need not exist or be configured prior.
     * For clustered Key Server configurations, the hostnames or IP Addresses, of all server nodes, must be provided in the kmipKeyServerHostnames parameter.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public CreateKeyServerKmipResult createKeyServerKmip(
        String kmipCaCertificate,
        String kmipClientCertificate,
        String[] kmipKeyServerHostnames,
        String kmipKeyServerName,
        Optional<Long> kmipKeyServerPort
        ) {
        return this.createKeyServerKmip(new CreateKeyServerKmipRequest(kmipCaCertificate, kmipClientCertificate, kmipKeyServerHostnames, kmipKeyServerName, kmipKeyServerPort));
    }
    
    /** 
     * Delete the specified KMIP (Key Management Interoperability Protocol) Key Server.  A KMIP Key Server can be deleted unless it's the last one assigned to its provider, and that provider is active (providing keys which are currently in use).
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public DeleteKeyServerKmipResult deleteKeyServerKmip(final DeleteKeyServerKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, deleteKeyServerKmip is not available until version 11.7.");
        }
        return super.sendRequest("DeleteKeyServerKmip", request, DeleteKeyServerKmipRequest.class, DeleteKeyServerKmipResult.class);
    }

    
    /** 
     * Delete the specified KMIP (Key Management Interoperability Protocol) Key Server.  A KMIP Key Server can be deleted unless it's the last one assigned to its provider, and that provider is active (providing keys which are currently in use).
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public DeleteKeyServerKmipResult deleteKeyServerKmip(
        Long keyServerID
        ) {
        return this.deleteKeyServerKmip(new DeleteKeyServerKmipRequest(keyServerID));
    }
    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Provider object.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyProviderKmipResult getKeyProviderKmip(final GetKeyProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, getKeyProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("GetKeyProviderKmip", request, GetKeyProviderKmipRequest.class, GetKeyProviderKmipResult.class);
    }

    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Provider object.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyProviderKmipResult getKeyProviderKmip(
        Long keyProviderID
        ) {
        return this.getKeyProviderKmip(new GetKeyProviderKmipRequest(keyProviderID));
    }
    
    /** 
     * Adds (assigns) the specified KMIP (Key Management Interoperability Protocol) Key Server to the specified Key Provider.  This will result in contacting the server to verify it's functional, as well as to synchronize keys in the event that there are multiple key servers assigned to the provider.  This synchronization may result in conflicts which could cause this to fail.  If the specified KMIP Key Server is already assigned to the specified Key Provider, this is a no-op and no error will be returned.  The assignment can be removed (unassigned) using RemoveKeyServerFromProviderKmip.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public AddKeyServerToProviderKmipResult addKeyServerToProviderKmip(final AddKeyServerToProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, addKeyServerToProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("AddKeyServerToProviderKmip", request, AddKeyServerToProviderKmipRequest.class, AddKeyServerToProviderKmipResult.class);
    }

    
    /** 
     * Adds (assigns) the specified KMIP (Key Management Interoperability Protocol) Key Server to the specified Key Provider.  This will result in contacting the server to verify it's functional, as well as to synchronize keys in the event that there are multiple key servers assigned to the provider.  This synchronization may result in conflicts which could cause this to fail.  If the specified KMIP Key Server is already assigned to the specified Key Provider, this is a no-op and no error will be returned.  The assignment can be removed (unassigned) using RemoveKeyServerFromProviderKmip.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public AddKeyServerToProviderKmipResult addKeyServerToProviderKmip(
        Long keyProviderID,
        Long keyServerID
        ) {
        return this.addKeyServerToProviderKmip(new AddKeyServerToProviderKmipRequest(keyProviderID, keyServerID));
    }
    
    /** 
     * Remove (unassign) the specified KMIP (Key Management Interoperability Protocol) Key Server from the provider it was assigned to via AddKeyServerToProviderKmip (if any).  A KMIP Key Server can be unassigned from its provider unless it's the last one and that provider is active (providing keys which are currently in use).  If the specified KMIP Key Server is not assigned to a provider, this is a no-op and no error will be returned.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public RemoveKeyServerFromProviderKmipResult removeKeyServerFromProviderKmip(final RemoveKeyServerFromProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, removeKeyServerFromProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("RemoveKeyServerFromProviderKmip", request, RemoveKeyServerFromProviderKmipRequest.class, RemoveKeyServerFromProviderKmipResult.class);
    }

    
    /** 
     * Remove (unassign) the specified KMIP (Key Management Interoperability Protocol) Key Server from the provider it was assigned to via AddKeyServerToProviderKmip (if any).  A KMIP Key Server can be unassigned from its provider unless it's the last one and that provider is active (providing keys which are currently in use).  If the specified KMIP Key Server is not assigned to a provider, this is a no-op and no error will be returned.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public RemoveKeyServerFromProviderKmipResult removeKeyServerFromProviderKmip(
        Long keyServerID
        ) {
        return this.removeKeyServerFromProviderKmip(new RemoveKeyServerFromProviderKmipRequest(keyServerID));
    }
    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Server object.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyServerKmipResult getKeyServerKmip(final GetKeyServerKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, getKeyServerKmip is not available until version 11.7.");
        }
        return super.sendRequest("GetKeyServerKmip", request, GetKeyServerKmipRequest.class, GetKeyServerKmipResult.class);
    }

    
    /** 
     * Returns the specified KMIP (Key Management Interoperability Protocol) Key Server object.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetKeyServerKmipResult getKeyServerKmip(
        Long keyServerID
        ) {
        return this.getKeyServerKmip(new GetKeyServerKmipRequest(keyServerID));
    }
    

    
    /** 
     * Generates a Certificate Sign Request which can be signed by a Certificate Authority to generate a client certificate for the cluster.  This is part of establishing a trust relationship for interacting with external services.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public GetClientCertificateSignRequestResult getClientCertificateSignRequest() {
        return super.sendRequest("GetClientCertificateSignRequest", null, null, GetClientCertificateSignRequestResult.class);
    }
    
    /** 
     * Creates SSL public and private keys. These keys can be used to generate Certificate Sign Requests.
     * There can be only one key pair in use for the cluster. To replace the existing keys, make sure that they are not being used by any providers before invoking this API.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreatePublicPrivateKeyPairResult createPublicPrivateKeyPair(final CreatePublicPrivateKeyPairRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, createPublicPrivateKeyPair is not available until version 11.7.");
        }
        return super.sendRequest("CreatePublicPrivateKeyPair", request, CreatePublicPrivateKeyPairRequest.class, CreatePublicPrivateKeyPairResult.class);
    }

    
    /** 
     * Creates SSL public and private keys. These keys can be used to generate Certificate Sign Requests.
     * There can be only one key pair in use for the cluster. To replace the existing keys, make sure that they are not being used by any providers before invoking this API.
     **/
    @Override
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
        ) {
        return this.createPublicPrivateKeyPair(new CreatePublicPrivateKeyPairRequest(commonName, organization, organizationalUnit, locality, state, country, emailAddress));
    }
    
    /** 
     * Delete the specified inactive Key Provider.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteKeyProviderKmipResult deleteKeyProviderKmip(final DeleteKeyProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, deleteKeyProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("DeleteKeyProviderKmip", request, DeleteKeyProviderKmipRequest.class, DeleteKeyProviderKmipResult.class);
    }

    
    /** 
     * Delete the specified inactive Key Provider.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public DeleteKeyProviderKmipResult deleteKeyProviderKmip(
        Long keyProviderID
        ) {
        return this.deleteKeyProviderKmip(new DeleteKeyProviderKmipRequest(keyProviderID));
    }
    
    /** 
     * Modifies a KMIP (Key Management Interoperability Protocol) Key Server to the specified attributes. The only required parameter is the keyServerID. A request which contains only the keyServerID will be a no-op and no error will be returned. Any other parameters which are specified will replace the existing values on the KMIP Key Server with the specified keyServerID. Because this server might be part of an active provider this will result in contacting the server to verify it's functional. Multiple hostnames or IP addresses must only be provided to the kmipKeyServerHostnames parameter if the key servers are in a clustered configuration.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public ModifyKeyServerKmipResult modifyKeyServerKmip(final ModifyKeyServerKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, modifyKeyServerKmip is not available until version 11.7.");
        }
        return super.sendRequest("ModifyKeyServerKmip", request, ModifyKeyServerKmipRequest.class, ModifyKeyServerKmipResult.class);
    }

    
    /** 
     * Modifies a KMIP (Key Management Interoperability Protocol) Key Server to the specified attributes. The only required parameter is the keyServerID. A request which contains only the keyServerID will be a no-op and no error will be returned. Any other parameters which are specified will replace the existing values on the KMIP Key Server with the specified keyServerID. Because this server might be part of an active provider this will result in contacting the server to verify it's functional. Multiple hostnames or IP addresses must only be provided to the kmipKeyServerHostnames parameter if the key servers are in a clustered configuration.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public ModifyKeyServerKmipResult modifyKeyServerKmip(
        Optional<String> kmipCaCertificate,
        Optional<String> kmipClientCertificate,
        Optional<String[]> kmipKeyServerHostnames,
        Long keyServerID,
        Optional<String> kmipKeyServerName,
        Optional<Long> kmipKeyServerPort
        ) {
        return this.modifyKeyServerKmip(new ModifyKeyServerKmipRequest(kmipCaCertificate, kmipClientCertificate, kmipKeyServerHostnames, keyServerID, kmipKeyServerName, kmipKeyServerPort));
    }
    
    /** 
     * Test whether the specified Key Provider is functioning normally.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyProviderKmipResult testKeyProviderKmip(final TestKeyProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, testKeyProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("TestKeyProviderKmip", request, TestKeyProviderKmipRequest.class, TestKeyProviderKmipResult.class);
    }

    
    /** 
     * Test whether the specified Key Provider is functioning normally.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestKeyProviderKmipResult testKeyProviderKmip(
        Long keyProviderID
        ) {
        return this.testKeyProviderKmip(new TestKeyProviderKmipRequest(keyProviderID));
    }
    

    
    /** 
     * GetFipsReport enables you to retrieve FIPS compliance status on a per node basis.
     **/
    @Override
    @Since("10.3")
    @ConnectionType("Cluster")
    public GetFipsReportResult getFipsReport() {
        return super.sendRequest("GetFipsReport", null, null, GetFipsReportResult.class);
    }
    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Provider with the specified name.  A Key Provider defines a mechanism and location to retrieve authentication keys.  A KMIP Key Provider represents a collection of one or more KMIP Key Servers.  A newly created KMIP Key Provider will not have any KMIP Key Servers assigned to it.  To create a KMIP Key Server see CreateKeyServerKmip and to assign it to a provider created via this method see AddKeyServerToProviderKmip.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreateKeyProviderKmipResult createKeyProviderKmip(final CreateKeyProviderKmipRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.7")) {
            throw new ApiException("The command, createKeyProviderKmip is not available until version 11.7.");
        }
        return super.sendRequest("CreateKeyProviderKmip", request, CreateKeyProviderKmipRequest.class, CreateKeyProviderKmipResult.class);
    }

    
    /** 
     * Creates a KMIP (Key Management Interoperability Protocol) Key Provider with the specified name.  A Key Provider defines a mechanism and location to retrieve authentication keys.  A KMIP Key Provider represents a collection of one or more KMIP Key Servers.  A newly created KMIP Key Provider will not have any KMIP Key Servers assigned to it.  To create a KMIP Key Server see CreateKeyServerKmip and to assign it to a provider created via this method see AddKeyServerToProviderKmip.
     **/
    @Override
    @Since("11.7")
    @ConnectionType("Cluster")
    public CreateKeyProviderKmipResult createKeyProviderKmip(
        String keyProviderName
        ) {
        return this.createKeyProviderKmip(new CreateKeyProviderKmipRequest(keyProviderName));
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
     * ListActiveNodes returns the list of currently active nodes that are in the cluster.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListActiveNodesResult listActiveNodes() {
        return super.sendRequest("ListActiveNodes", null, null, ListActiveNodesResult.class);
    }
    

    
    /** 
     * You can use the GetNodeActiveTlsCiphers method to get a list of the TLS ciphers that are currently accepted on this node.
     * You can use this method on both management and storage nodes.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Node")
    public GetNodeActiveTlsCiphersResult getNodeActiveTlsCiphers() {
        return super.sendRequest("GetNodeActiveTlsCiphers", null, null, GetNodeActiveTlsCiphersResult.class);
    }
    

    
    /** 
     * You can use the ResetNodeSupplementalTlsCiphers method to restore the supplemental ciphers to their defaults.
     * You can use this command on management nodes.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Node")
    public ResetNodeSupplementalTlsCiphersResult resetNodeSupplementalTlsCiphers() {
        return super.sendRequest("ResetNodeSupplementalTlsCiphers", null, null, ResetNodeSupplementalTlsCiphersResult.class);
    }
    
    /** 
     * ControlPower can be used to reboot or halt a node.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public ControlPowerResult controlPower(final ControlPowerRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, controlPower is not available until version 11.0.");
        }
        return super.sendRequest("ControlPower", request, ControlPowerRequest.class, ControlPowerResult.class);
    }

    
    /** 
     * ControlPower can be used to reboot or halt a node.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public ControlPowerResult controlPower(
        String action,
        Optional<String> wakeupDelay,
        Boolean force
        ) {
        return this.controlPower(new ControlPowerRequest(action, wakeupDelay, force));
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
     * You can use the SetNodeSSLCertificate method to set a user SSL certificate and private key for the management node.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Node")
    public SetNodeSSLCertificateResult setNodeSSLCertificate(final SetNodeSSLCertificateRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, setNodeSSLCertificate is not available until version 10.0.");
        }
        return super.sendRequest("SetNodeSSLCertificate", request, SetNodeSSLCertificateRequest.class, SetNodeSSLCertificateResult.class);
    }

    
    /** 
     * You can use the SetNodeSSLCertificate method to set a user SSL certificate and private key for the management node.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Node")
    public SetNodeSSLCertificateResult setNodeSSLCertificate(
        String certificate,
        String privateKey
        ) {
        return this.setNodeSSLCertificate(new SetNodeSSLCertificateRequest(certificate, privateKey));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * You can use the RemoveNodeSSLCertificate method to remove the user SSL certificate and private key for the management node.
     * After the certificate and private key are removed, the management node is configured to use the default certificate and private key..
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Node")
    public RemoveNodeSSLCertificateResult removeNodeSSLCertificate() {
        return super.sendRequest("RemoveNodeSSLCertificate", null, null, RemoveNodeSSLCertificateResult.class);
    }
    

    
    /** 
     * You can use the GetNodeSSLCertificate method to retrieve the SSL certificate that is currently active on the cluster.
     * You can use this method on both management and storage nodes.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Node")
    public GetNodeSSLCertificateResult getNodeSSLCertificate() {
        return super.sendRequest("GetNodeSSLCertificate", null, null, GetNodeSSLCertificateResult.class);
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
     * You can use the SetNodeSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers for this node.
     * You can use this command on management nodes.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Node")
    public SetNodeSupplementalTlsCiphersResult setNodeSupplementalTlsCiphers(final SetNodeSupplementalTlsCiphersRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.3")) {
            throw new ApiException("The command, setNodeSupplementalTlsCiphers is not available until version 11.3.");
        }
        return super.sendRequest("SetNodeSupplementalTlsCiphers", request, SetNodeSupplementalTlsCiphersRequest.class, SetNodeSupplementalTlsCiphersResult.class);
    }

    
    /** 
     * You can use the SetNodeSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers for this node.
     * You can use this command on management nodes.
     **/
    @Override
    @Since("11.3")
    @ConnectionType("Node")
    public SetNodeSupplementalTlsCiphersResult setNodeSupplementalTlsCiphers(
        String[] supplementalCiphers
        ) {
        return this.setNodeSupplementalTlsCiphers(new SetNodeSupplementalTlsCiphersRequest(supplementalCiphers));
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
     * GetBootstrapConfig returns cluster and node information from the bootstrap configuration file. Use this API method on an individual node before it has been joined with a cluster. You can use the information this method returns in the cluster configuration interface when you create a cluster.
     * If a cluster has already been created, this can be used to obtain the MVIP and SVIP addresses of the cluster.
     **/
    @Override
    @Since("2.0")
    @ConnectionType("Both")
    public GetBootstrapConfigResult getBootstrapConfig() {
        return super.sendRequest("GetBootstrapConfig", null, null, GetBootstrapConfigResult.class);
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
     * The GetNodeFipsDrivesReport reports the FipsDrives capability of a node. This is a per-node API.
     **/
    @Override
    @Since("11.5")
    @ConnectionType("Node")
    public GetNodeFipsDrivesReportResult getNodeFipsDrivesReport() {
        return super.sendRequest("GetNodeFipsDrivesReport", null, null, GetNodeFipsDrivesReportResult.class);
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
     * ListPendingNodes returns a list of the currently pending nodes in the system. Pending nodes are nodes that are running and configured to join the cluster, but have not yet been added via the AddNodes API method.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListPendingNodesResult listPendingNodes() {
        return super.sendRequest("ListPendingNodes", null, null, ListPendingNodesResult.class);
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * CheckProposedCluster validates that creating a cluster from a given set of nodes is likely to succeed.  Any problems with the proposed cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public CheckProposedResult checkProposedCluster(final CheckProposedClusterRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("11.0")) {
            throw new ApiException("The command, checkProposedCluster is not available until version 11.0.");
        }
        return super.sendRequest("CheckProposedCluster", request, CheckProposedClusterRequest.class, CheckProposedResult.class);
    }

    
    /** 
     * CheckProposedCluster validates that creating a cluster from a given set of nodes is likely to succeed.  Any problems with the proposed cluster are returned as errors with a human-readable description and unique error code.
     **/
    @Override
    @Since("11.0")
    @ConnectionType("Node")
    public CheckProposedResult checkProposedCluster(
        String[] nodes
        ) {
        return this.checkProposedCluster(new CheckProposedClusterRequest(nodes));
    }
    
    /** 
     * GetNodeStats enables you to retrieve the high-level activity measurements for a single node.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetNodeStatsResult getNodeStats(final GetNodeStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
     * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public AddNodesResult addNodes(final AddNodesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
     * RemoveNodes can be used to remove one or more nodes from the cluster. Before removing a node, you must remove all drives from the node using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated off of the node's drives.
     * After removing a node, the removed node registers itself as a pending node. You can add the pending node again or shut it down (shutting the node down removes it from the Pending Node list).
     * 
     * RemoveNodes can fail with xEnsembleInvalidSize if removing the nodes would violate ensemble size restrictions.
     * RemoveNodes can fail with xEnsembleQuorumLoss if removing the nodes would cause a loss of quorum.
     * RemoveNodes can fail with xEnsembleToleranceChange if there are enabled data protection schemes that can tolerate multiple node failures and removing the nodes would decrease the ensemble's node failure tolerance. The optional ignoreEnsembleToleranceChange parameter can be set true to disable the ensemble tolerance check.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(final RemoveNodesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, removeNodes is not available until version 1.0.");
        }
        return super.sendRequest("RemoveNodes", request, RemoveNodesRequest.class, RemoveNodesResult.class);
    }

    
    /** 
     * RemoveNodes can be used to remove one or more nodes from the cluster. Before removing a node, you must remove all drives from the node using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated off of the node's drives.
     * After removing a node, the removed node registers itself as a pending node. You can add the pending node again or shut it down (shutting the node down removes it from the Pending Node list).
     * 
     * RemoveNodes can fail with xEnsembleInvalidSize if removing the nodes would violate ensemble size restrictions.
     * RemoveNodes can fail with xEnsembleQuorumLoss if removing the nodes would cause a loss of quorum.
     * RemoveNodes can fail with xEnsembleToleranceChange if there are enabled data protection schemes that can tolerate multiple node failures and removing the nodes would decrease the ensemble's node failure tolerance. The optional ignoreEnsembleToleranceChange parameter can be set true to disable the ensemble tolerance check.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveNodesResult removeNodes(
        Long[] nodes,
        Optional<Boolean> ignoreEnsembleToleranceChange
        ) {
        return this.removeNodes(new RemoveNodesRequest(nodes, ignoreEnsembleToleranceChange));
    }
    

    
    /** 
     * You can use the GetSupportedTlsCiphers method to get a list of the supported TLS ciphers on this node.
     * You can use this method on both management and storage nodes.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Node")
    public GetNodeSupportedTlsCiphersResult getNodeSupportedTlsCiphers() {
        return super.sendRequest("GetNodeSupportedTlsCiphers", null, null, GetNodeSupportedTlsCiphersResult.class);
    }
    
    /** 
     * Enable support for authentication using a third party Identity Provider (IdP) for the cluster.
     * Once IdP authentication is enabled, cluster and Ldap admins will no longer be able to access the cluster via supported UIs and any active authenticated sessions will be invalidated/logged out.
     * Only third party IdP authenticated users will be able to access the cluster via the supported UIs.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public EnableIdpAuthenticationResult enableIdpAuthentication(final EnableIdpAuthenticationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, enableIdpAuthentication is not available until version 12.0.");
        }
        return super.sendRequest("EnableIdpAuthentication", request, EnableIdpAuthenticationRequest.class, EnableIdpAuthenticationResult.class);
    }

    
    /** 
     * Enable support for authentication using a third party Identity Provider (IdP) for the cluster.
     * Once IdP authentication is enabled, cluster and Ldap admins will no longer be able to access the cluster via supported UIs and any active authenticated sessions will be invalidated/logged out.
     * Only third party IdP authenticated users will be able to access the cluster via the supported UIs.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public EnableIdpAuthenticationResult enableIdpAuthentication(
        Optional<java.util.UUID> idpConfigurationID
        ) {
        return this.enableIdpAuthentication(new EnableIdpAuthenticationRequest(idpConfigurationID));
    }
    

    
    /** 
     * Return information regarding the state of authentication using third party Identity Providers
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public GetIdpAuthenticationStateResult getIdpAuthenticationState() {
        return super.sendRequest("GetIdpAuthenticationState", null, null, GetIdpAuthenticationStateResult.class);
    }
    

    
    /** 
     * Disable support for authentication using third party Identity Providers (IdP) for the cluster.
     * Once disabled, users authenticated by third party IdPs will no longer be able to access the cluster and any active authenticated sessions will be invalidated/logged out.
     * Ldap and cluster admins will be able to access the cluster via supported UIs.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DisableIdpAuthenticationResult disableIdpAuthentication() {
        return super.sendRequest("DisableIdpAuthentication", null, null, DisableIdpAuthenticationResult.class);
    }
    
    /** 
     * Delete an existing configuration with a third party Identity Provider (IdP) for the cluster.
     * Deleting the last IdP Configuration will remove the SAML Service Provider certificate from the cluster.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteIdpConfigurationResult deleteIdpConfiguration(final DeleteIdpConfigurationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, deleteIdpConfiguration is not available until version 12.0.");
        }
        return super.sendRequest("DeleteIdpConfiguration", request, DeleteIdpConfigurationRequest.class, DeleteIdpConfigurationResult.class);
    }

    
    /** 
     * Delete an existing configuration with a third party Identity Provider (IdP) for the cluster.
     * Deleting the last IdP Configuration will remove the SAML Service Provider certificate from the cluster.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteIdpConfigurationResult deleteIdpConfiguration(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName
        ) {
        return this.deleteIdpConfiguration(new DeleteIdpConfigurationRequest(idpConfigurationID, idpName));
    }
    
    /** 
     * List configurations for third party Identity Provider(s) (IdP), optionally providing either enabledOnly flag to retrieve the currently enabled IdP configuration, or an IdP metadata UUID or IdP name to query a specific IdP configuration information.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListIdpConfigurationsResult listIdpConfigurations(final ListIdpConfigurationsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, listIdpConfigurations is not available until version 12.0.");
        }
        return super.sendRequest("ListIdpConfigurations", request, ListIdpConfigurationsRequest.class, ListIdpConfigurationsResult.class);
    }

    
    /** 
     * List configurations for third party Identity Provider(s) (IdP), optionally providing either enabledOnly flag to retrieve the currently enabled IdP configuration, or an IdP metadata UUID or IdP name to query a specific IdP configuration information.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListIdpConfigurationsResult listIdpConfigurations(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName,
        Optional<Boolean> enabledOnly
        ) {
        return this.listIdpConfigurations(new ListIdpConfigurationsRequest(idpConfigurationID, idpName, enabledOnly));
    }
    
    /** 
     * Create a potential trust relationship for authentication using a third party Identity Provider (IdP) for the cluster.  
     * A SAML Service Provider certificate is required for IdP communication, which will be generated as necessary.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public CreateIdpConfigurationResult createIdpConfiguration(final CreateIdpConfigurationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, createIdpConfiguration is not available until version 12.0.");
        }
        return super.sendRequest("CreateIdpConfiguration", request, CreateIdpConfigurationRequest.class, CreateIdpConfigurationResult.class);
    }

    
    /** 
     * Create a potential trust relationship for authentication using a third party Identity Provider (IdP) for the cluster.  
     * A SAML Service Provider certificate is required for IdP communication, which will be generated as necessary.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public CreateIdpConfigurationResult createIdpConfiguration(
        String idpName,
        String idpMetadata
        ) {
        return this.createIdpConfiguration(new CreateIdpConfigurationRequest(idpName, idpMetadata));
    }
    
    /** 
     * Adds a cluster administrator user authenticated by a third party Identity Provider (IdP).  
     * IdP cluster admin accounts are configured based on SAML attribute-value information provided 
     * within the IdP's SAML assertion associated with the user.  If a user successfully 
     * authenticates with the IdP and has SAML attribute statements within the SAML assertion 
     * matching multiple IdP cluster admin accounts, the user will have the combined access level 
     * of those matching IdP cluster admin accounts.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addIdpClusterAdmin(final AddIdpClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, addIdpClusterAdmin is not available until version 12.0.");
        }
        return super.sendRequest("AddIdpClusterAdmin", request, AddIdpClusterAdminRequest.class, AddClusterAdminResult.class);
    }

    
    /** 
     * Adds a cluster administrator user authenticated by a third party Identity Provider (IdP).  
     * IdP cluster admin accounts are configured based on SAML attribute-value information provided 
     * within the IdP's SAML assertion associated with the user.  If a user successfully 
     * authenticates with the IdP and has SAML attribute statements within the SAML assertion 
     * matching multiple IdP cluster admin accounts, the user will have the combined access level 
     * of those matching IdP cluster admin accounts.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public AddClusterAdminResult addIdpClusterAdmin(
        String username,
        String[] access,
        Boolean acceptEula,
        Optional<Attributes> attributes
        ) {
        return this.addIdpClusterAdmin(new AddIdpClusterAdminRequest(username, access, acceptEula, attributes));
    }
    
    /** 
     * Update an existing configuration with a third party Identity Provider (IdP) for the cluster.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public UpdateIdpConfigurationResult updateIdpConfiguration(final UpdateIdpConfigurationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, updateIdpConfiguration is not available until version 12.0.");
        }
        return super.sendRequest("UpdateIdpConfiguration", request, UpdateIdpConfigurationRequest.class, UpdateIdpConfigurationResult.class);
    }

    
    /** 
     * Update an existing configuration with a third party Identity Provider (IdP) for the cluster.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public UpdateIdpConfigurationResult updateIdpConfiguration(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName,
        Optional<String> newIdpName,
        Optional<String> idpMetadata,
        Optional<Boolean> generateNewCertificate
        ) {
        return this.updateIdpConfiguration(new UpdateIdpConfigurationRequest(idpConfigurationID, idpName, newIdpName, idpMetadata, generateNewCertificate));
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        Boolean acceptEula,
        Optional<Attributes> attributes
        ) {
        return this.addClusterAdmin(new AddClusterAdminRequest(username, password, access, acceptEula, attributes));
    }
    
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
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(final RemoveClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, removeClusterAdmin is not available until version 1.0.");
        }
        return super.sendRequest("RemoveClusterAdmin", request, RemoveClusterAdminRequest.class, RemoveClusterAdminResult.class);
    }

    
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
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public RemoveClusterAdminResult removeClusterAdmin(
        Long clusterAdminID
        ) {
        return this.removeClusterAdmin(new RemoveClusterAdminRequest(clusterAdminID));
    }
    
    /** 
     * Deletes all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator may only delete their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may delete sessions belonging to any user.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByUsername with the same parameters.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByUsername(final DeleteAuthSessionsByUsernameRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, deleteAuthSessionsByUsername is not available until version 12.0.");
        }
        return super.sendRequest("DeleteAuthSessionsByUsername", request, DeleteAuthSessionsByUsernameRequest.class, DeleteAuthSessionsResult.class);
    }

    
    /** 
     * Deletes all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator may only delete their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may delete sessions belonging to any user.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByUsername with the same parameters.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByUsername(
        Optional<String> username,
        Optional<String> authMethod
        ) {
        return this.deleteAuthSessionsByUsername(new DeleteAuthSessionsByUsernameRequest(username, authMethod));
    }
    

    
    /** 
     * Lists all active auth sessions.
     * This is only callable by a user with Administrative access rights.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listActiveAuthSessions() {
        return super.sendRequest("ListActiveAuthSessions", null, null, ListAuthSessionsResult.class);
    }
    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin, LDAP cluster admin, 
     * or third party Identity Provider (IdP) cluster admin.  You cannot change access for the 
     * administrator cluster admin account.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ModifyClusterAdminResult modifyClusterAdmin(final ModifyClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
            throw new ApiException("The command, modifyClusterAdmin is not available until version 1.0.");
        }
        return super.sendRequest("ModifyClusterAdmin", request, ModifyClusterAdminRequest.class, ModifyClusterAdminResult.class);
    }

    
    /** 
     * You can use ModifyClusterAdmin to change the settings for a cluster admin, LDAP cluster admin, 
     * or third party Identity Provider (IdP) cluster admin.  You cannot change access for the 
     * administrator cluster admin account.
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
     * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be 
     * several cluster administrator accounts with different levels of permissions.  There can be only 
     * one primary cluster administrator in the system. The primary Cluster Admin is the 
     * administrator that was created when the cluster was created.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public ListClusterAdminsResult listClusterAdmins() {
        return super.sendRequest("ListClusterAdmins", null, null, ListClusterAdminsResult.class);
    }
    

    
    /** 
     * GetCurrentClusterAdmin returns information about the calling ClusterAdmin.
     * If the authMethod in the return value is Ldap or Idp, then other fields in the return value may contain data aggregated from multiple LdapAdmins or IdpAdmins, respectively.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Cluster")
    public GetCurrentClusterAdminResult getCurrentClusterAdmin() {
        return super.sendRequest("GetCurrentClusterAdmin", null, null, GetCurrentClusterAdminResult.class);
    }
    
    /** 
     * Lists all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator privileges may only list their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may list sessions belonging to any user.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByUsername(final ListAuthSessionsByUsernameRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, listAuthSessionsByUsername is not available until version 12.0.");
        }
        return super.sendRequest("ListAuthSessionsByUsername", request, ListAuthSessionsByUsernameRequest.class, ListAuthSessionsResult.class);
    }

    
    /** 
     * Lists all auth sessions for the given user.
     * A caller not in AccessGroup ClusterAdmins / Administrator privileges may only list their own sessions.
     * A caller with ClusterAdmins / Administrator privileges may list sessions belonging to any user.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByUsername(
        Optional<String> username,
        Optional<String> authMethod
        ) {
        return this.listAuthSessionsByUsername(new ListAuthSessionsByUsernameRequest(username, authMethod));
    }
    
    /** 
     * Deletes all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be deleted.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByClusterAdmin with the same parameter.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByClusterAdmin(final DeleteAuthSessionsByClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, deleteAuthSessionsByClusterAdmin is not available until version 12.0.");
        }
        return super.sendRequest("DeleteAuthSessionsByClusterAdmin", request, DeleteAuthSessionsByClusterAdminRequest.class, DeleteAuthSessionsResult.class);
    }

    
    /** 
     * Deletes all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be deleted.
     * To see the list of sessions that could be deleted, use ListAuthSessionsByClusterAdmin with the same parameter.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionsResult deleteAuthSessionsByClusterAdmin(
        Long clusterAdminID
        ) {
        return this.deleteAuthSessionsByClusterAdmin(new DeleteAuthSessionsByClusterAdminRequest(clusterAdminID));
    }
    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner(final SetLoginBannerRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The command, setLoginBanner is not available until version 10.0.");
        }
        if(request.getBanner() != null && request.getBanner() != Optional.<String>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, banner is not applicable to this version of the API.");
        }
        if(request.getEnabled() != null && request.getEnabled() != Optional.<Boolean>empty() && Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("10.0")) {
            throw new ApiException("The parameter, enabled is not applicable to this version of the API.");
        }
        return super.sendRequest("SetLoginBanner", request, SetLoginBannerRequest.class, SetLoginBannerResult.class);
    }

    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner() {
        return super.sendRequest("SetLoginBanner", null, null, SetLoginBannerResult.class);
    }
    
    /** 
     * You can use the SetLoginBanner method to set the active Terms of Use banner users see when they log on to the web interface.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public SetLoginBannerResult setLoginBanner(
        Optional<String> banner,
        Optional<Boolean> enabled
        ) {
        return this.setLoginBanner(new SetLoginBannerRequest(banner, enabled));
    }
    
    /** 
     * List all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be listed.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByClusterAdmin(final ListAuthSessionsByClusterAdminRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, listAuthSessionsByClusterAdmin is not available until version 12.0.");
        }
        return super.sendRequest("ListAuthSessionsByClusterAdmin", request, ListAuthSessionsByClusterAdminRequest.class, ListAuthSessionsResult.class);
    }

    
    /** 
     * List all auth sessions associated with the specified ClusterAdminID. 
     * If the specified ClusterAdminID maps to a group of users, all auth sessions for all members of that group will be listed.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public ListAuthSessionsResult listAuthSessionsByClusterAdmin(
        Long clusterAdminID
        ) {
        return this.listAuthSessionsByClusterAdmin(new ListAuthSessionsByClusterAdminRequest(clusterAdminID));
    }
    
    /** 
     * Deletes an individual auth session
     * If the calling user is not in the ClusterAdmins / Administrator AccessGroup, only auth session belonging 
     * to the calling user can be deleted.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionResult deleteAuthSession(final DeleteAuthSessionRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("12.0")) {
            throw new ApiException("The command, deleteAuthSession is not available until version 12.0.");
        }
        return super.sendRequest("DeleteAuthSession", request, DeleteAuthSessionRequest.class, DeleteAuthSessionResult.class);
    }

    
    /** 
     * Deletes an individual auth session
     * If the calling user is not in the ClusterAdmins / Administrator AccessGroup, only auth session belonging 
     * to the calling user can be deleted.
     **/
    @Override
    @Since("12.0")
    @ConnectionType("Cluster")
    public DeleteAuthSessionResult deleteAuthSession(
        java.util.UUID sessionID
        ) {
        return this.deleteAuthSession(new DeleteAuthSessionRequest(sessionID));
    }
    

    
    /** 
     * You can use the GetLoginBanner method to get the currently active Terms of Use banner that users see when they log on to the web interface.
     **/
    @Override
    @Since("10.0")
    @ConnectionType("Cluster")
    public GetLoginBannerResult getLoginBanner() {
        return super.sendRequest("GetLoginBanner", null, null, GetLoginBannerResult.class);
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("8.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * The TestLdapAuthentication method enables you to validate the currently enabled LDAP authentication settings. If the configuration is
     * correct, the API call returns the group membership of the tested user.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public TestLdapAuthenticationResult testLdapAuthentication(final TestLdapAuthenticationRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * The GetLdapConfiguration method enables you to get the currently active LDAP configuration on the cluster.
     **/
    @Override
    @Since("7.0")
    @ConnectionType("Cluster")
    public GetLdapConfigurationResult getLdapConfiguration() {
        return super.sendRequest("GetLdapConfiguration", null, null, GetLdapConfigurationResult.class);
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        NewDrive[] drives
        ) {
        return this.addDrives(new AddDrivesRequest(drives));
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
     * ResetDrives enables you to proactively initialize drives and remove all data currently residing on a drive. The drive can then be reused
     * in an existing node or used in an upgraded node. This method requires the force parameter to be included in the method call.
     **/
    @Override
    @Since("6.0")
    @ConnectionType("Node")
    public ResetDrivesResult resetDrives(final ResetDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("6.0")) {
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
     * ListDriveStats enables you to retrieve high-level activity measurements for multiple drives in the cluster. By default, this method returns statistics for all drives in the cluster, and these measurements are cumulative from the addition of the drive to the cluster. Some values this method returns are specific to block drives, and some are specific to metadata drives.
     **/
    @Override
    @Since("9.0")
    @ConnectionType("Cluster")
    public ListDriveStatsResult listDriveStats(final ListDriveStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("9.0")) {
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
     * GetDriveHardwareInfo returns all the hardware information for the given drive. This generally includes details about manufacturers, vendors, versions, and
     * other associated hardware identification information.
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveHardwareInfoResult getDriveHardwareInfo(final GetDriveHardwareInfoRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("7.0")) {
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
     * SecureEraseDrives enables you to remove any residual data from drives that have a status of "available." You might want to use this method when replacing a drive nearing the end of its service life that contained sensitive data. This method uses a Security Erase Unit command to write a predetermined pattern to the drive and resets the encryption key on the drive. This asynchronous method might take up to two minutes to complete. You can use GetAsyncResult to check on the status of the secure erase operation.
     * You can use the ListDrives method to obtain the driveIDs for the drives you want to secure erase.
     **/
    @Override
    @Since("5.0")
    @ConnectionType("Cluster")
    public AsyncHandleResult secureEraseDrives(final SecureEraseDrivesRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
     * GetDriveStats returns high-level activity measurements for a single drive. Values are cumulative from the addition of the drive to the
     * cluster. Some values are specific to block drives. You might not obtain statistical data for both block and metadata drives when you
     * run this method. 
     **/
    @Override
    @Since("1.0")
    @ConnectionType("Cluster")
    public GetDriveStatsResult getDriveStats(final GetDriveStatsRequest request) { 
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("5.0")) {
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
        if(Float.parseFloat(super.getRequestDispatcher().getVersion()) < Float.parseFloat("1.0")) {
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
        Long[] drives
        ) {
        return this.removeDrives(new RemoveDrivesRequest(drives));
    }
    
}
