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
 * GetClusterStructureResult  
 **/

public class GetClusterStructureResult implements Serializable {

    public static final long serialVersionUID = -319355645801966921L;
    @SerializedName("accounts") private Account[] accounts;
    @SerializedName("clusterAdmins") private ClusterAdmin[] clusterAdmins;
    @SerializedName("clusterInfo") private ClusterInfo clusterInfo;
    @SerializedName("defaultQoS") private VolumeQOS defaultQoS;
    @SerializedName("features") private FeatureObject[] features;
    @SerializedName("initiators") private Initiator[] initiators;
    @SerializedName("ldapConfiguration") private LdapConfiguration ldapConfiguration;
    @SerializedName("ntp") private GetNtpInfoResult ntp;
    @SerializedName("qosPolicies") private QoSPolicy[] qosPolicies;
    @SerializedName("remoteHosts") private LoggingServer[] remoteHosts;
    @SerializedName("schedules") private ScheduleObject[] schedules;
    @SerializedName("snmp") private GetSnmpInfoResult snmp;
    @SerializedName("tlsCiphers") private Optional<GetActiveTlsCiphersResult> tlsCiphers;
    @SerializedName("virtualNetworks") private VirtualNetwork[] virtualNetworks;
    @SerializedName("volumeAccessGroupLunAssignments") private VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments;
    @SerializedName("volumeAccessGroups") private VolumeAccessGroup[] volumeAccessGroups;
    @SerializedName("volumes") private Volume[] volumes;
    @SerializedName("storageContainers") private Optional<StorageContainer[]> storageContainers;
    @SerializedName("snapMirrorEndpoints") private Optional<SnapMirrorEndpoint[]> snapMirrorEndpoints;
    // empty constructor
    @Since("7.0")
    public GetClusterStructureResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterStructureResult(
        Account[] accounts,
        ClusterAdmin[] clusterAdmins,
        ClusterInfo clusterInfo,
        VolumeQOS defaultQoS,
        FeatureObject[] features,
        Initiator[] initiators,
        LdapConfiguration ldapConfiguration,
        GetNtpInfoResult ntp,
        QoSPolicy[] qosPolicies,
        LoggingServer[] remoteHosts,
        ScheduleObject[] schedules,
        GetSnmpInfoResult snmp,
        Optional<GetActiveTlsCiphersResult> tlsCiphers,
        VirtualNetwork[] virtualNetworks,
        VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments,
        VolumeAccessGroup[] volumeAccessGroups,
        Volume[] volumes,
        Optional<StorageContainer[]> storageContainers,
        Optional<SnapMirrorEndpoint[]> snapMirrorEndpoints
    )
    {
        this.accounts = accounts;
        this.clusterAdmins = clusterAdmins;
        this.clusterInfo = clusterInfo;
        this.defaultQoS = defaultQoS;
        this.features = features;
        this.initiators = initiators;
        this.ldapConfiguration = ldapConfiguration;
        this.ntp = ntp;
        this.qosPolicies = qosPolicies;
        this.remoteHosts = remoteHosts;
        this.schedules = schedules;
        this.snmp = snmp;
        this.tlsCiphers = (tlsCiphers == null) ? Optional.<GetActiveTlsCiphersResult>empty() : tlsCiphers;
        this.virtualNetworks = virtualNetworks;
        this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
        this.volumeAccessGroups = volumeAccessGroups;
        this.volumes = volumes;
        this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : storageContainers;
        this.snapMirrorEndpoints = (snapMirrorEndpoints == null) ? Optional.<SnapMirrorEndpoint[]>empty() : snapMirrorEndpoints;
    }

    /** 
     * 
     **/
    public Account[] getAccounts() { return this.accounts; }
   
    public void setAccounts(Account[] accounts) { 
        this.accounts = accounts;
    }
    /** 
     * 
     **/
    public ClusterAdmin[] getClusterAdmins() { return this.clusterAdmins; }
   
    public void setClusterAdmins(ClusterAdmin[] clusterAdmins) { 
        this.clusterAdmins = clusterAdmins;
    }
    /** 
     * 
     **/
    public ClusterInfo getClusterInfo() { return this.clusterInfo; }
   
    public void setClusterInfo(ClusterInfo clusterInfo) { 
        this.clusterInfo = clusterInfo;
    }
    /** 
     * 
     **/
    public VolumeQOS getDefaultQoS() { return this.defaultQoS; }
   
    public void setDefaultQoS(VolumeQOS defaultQoS) { 
        this.defaultQoS = defaultQoS;
    }
    /** 
     * 
     **/
    public FeatureObject[] getFeatures() { return this.features; }
   
    public void setFeatures(FeatureObject[] features) { 
        this.features = features;
    }
    /** 
     * 
     **/
    public Initiator[] getInitiators() { return this.initiators; }
   
    public void setInitiators(Initiator[] initiators) { 
        this.initiators = initiators;
    }
    /** 
     * 
     **/
    public LdapConfiguration getLdapConfiguration() { return this.ldapConfiguration; }
   
    public void setLdapConfiguration(LdapConfiguration ldapConfiguration) { 
        this.ldapConfiguration = ldapConfiguration;
    }
    /** 
     * 
     **/
    public GetNtpInfoResult getNtp() { return this.ntp; }
   
    public void setNtp(GetNtpInfoResult ntp) { 
        this.ntp = ntp;
    }
    /** 
     * 
     **/
    public QoSPolicy[] getQosPolicies() { return this.qosPolicies; }
   
    public void setQosPolicies(QoSPolicy[] qosPolicies) { 
        this.qosPolicies = qosPolicies;
    }
    /** 
     * 
     **/
    public LoggingServer[] getRemoteHosts() { return this.remoteHosts; }
   
    public void setRemoteHosts(LoggingServer[] remoteHosts) { 
        this.remoteHosts = remoteHosts;
    }
    /** 
     * 
     **/
    public ScheduleObject[] getSchedules() { return this.schedules; }
   
    public void setSchedules(ScheduleObject[] schedules) { 
        this.schedules = schedules;
    }
    /** 
     * 
     **/
    public GetSnmpInfoResult getSnmp() { return this.snmp; }
   
    public void setSnmp(GetSnmpInfoResult snmp) { 
        this.snmp = snmp;
    }
    /** 
     * 
     **/
    public Optional<GetActiveTlsCiphersResult> getTlsCiphers() { return this.tlsCiphers; }
   
    public void setTlsCiphers(Optional<GetActiveTlsCiphersResult> tlsCiphers) { 
        this.tlsCiphers = (tlsCiphers == null) ? Optional.<GetActiveTlsCiphersResult>empty() : tlsCiphers;
    }
    /** 
     * 
     **/
    public VirtualNetwork[] getVirtualNetworks() { return this.virtualNetworks; }
   
    public void setVirtualNetworks(VirtualNetwork[] virtualNetworks) { 
        this.virtualNetworks = virtualNetworks;
    }
    /** 
     * 
     **/
    public VolumeAccessGroupLunAssignments[] getVolumeAccessGroupLunAssignments() { return this.volumeAccessGroupLunAssignments; }
   
    public void setVolumeAccessGroupLunAssignments(VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments) { 
        this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
    }
    /** 
     * 
     **/
    public VolumeAccessGroup[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
   
    public void setVolumeAccessGroups(VolumeAccessGroup[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * 
     **/
    public Volume[] getVolumes() { return this.volumes; }
   
    public void setVolumes(Volume[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     * 
     **/
    public Optional<StorageContainer[]> getStorageContainers() { return this.storageContainers; }
   
    public void setStorageContainers(Optional<StorageContainer[]> storageContainers) { 
        this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : storageContainers;
    }
    /** 
     * 
     **/
    public Optional<SnapMirrorEndpoint[]> getSnapMirrorEndpoints() { return this.snapMirrorEndpoints; }
   
    public void setSnapMirrorEndpoints(Optional<SnapMirrorEndpoint[]> snapMirrorEndpoints) { 
        this.snapMirrorEndpoints = (snapMirrorEndpoints == null) ? Optional.<SnapMirrorEndpoint[]>empty() : snapMirrorEndpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterStructureResult that = (GetClusterStructureResult) o;

        return 
            Arrays.equals(accounts, that.accounts) && 
            Arrays.equals(clusterAdmins, that.clusterAdmins) && 
            Objects.equals(clusterInfo, that.clusterInfo) && 
            Objects.equals(defaultQoS, that.defaultQoS) && 
            Arrays.equals(features, that.features) && 
            Arrays.equals(initiators, that.initiators) && 
            Objects.equals(ldapConfiguration, that.ldapConfiguration) && 
            Objects.equals(ntp, that.ntp) && 
            Arrays.equals(qosPolicies, that.qosPolicies) && 
            Arrays.equals(remoteHosts, that.remoteHosts) && 
            Arrays.equals(schedules, that.schedules) && 
            Objects.equals(snmp, that.snmp) && 
            Objects.equals(tlsCiphers, that.tlsCiphers) && 
            Arrays.equals(virtualNetworks, that.virtualNetworks) && 
            Arrays.equals(volumeAccessGroupLunAssignments, that.volumeAccessGroupLunAssignments) && 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups) && 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(storageContainers, that.storageContainers) && 
            Objects.equals(snapMirrorEndpoints, that.snapMirrorEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])accounts,(Object[])clusterAdmins,clusterInfo,defaultQoS,(Object[])features,(Object[])initiators,ldapConfiguration,ntp,(Object[])qosPolicies,(Object[])remoteHosts,(Object[])schedules,snmp,tlsCiphers,(Object[])virtualNetworks,(Object[])volumeAccessGroupLunAssignments,(Object[])volumeAccessGroups,(Object[])volumes,storageContainers,snapMirrorEndpoints );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accounts", accounts);
        map.put("clusterAdmins", clusterAdmins);
        map.put("clusterInfo", clusterInfo);
        map.put("defaultQoS", defaultQoS);
        map.put("features", features);
        map.put("initiators", initiators);
        map.put("ldapConfiguration", ldapConfiguration);
        map.put("ntp", ntp);
        map.put("qosPolicies", qosPolicies);
        map.put("remoteHosts", remoteHosts);
        map.put("schedules", schedules);
        map.put("snmp", snmp);
        map.put("tlsCiphers", tlsCiphers);
        map.put("virtualNetworks", virtualNetworks);
        map.put("volumeAccessGroupLunAssignments", volumeAccessGroupLunAssignments);
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("volumes", volumes);
        map.put("storageContainers", storageContainers);
        map.put("snapMirrorEndpoints", snapMirrorEndpoints);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accounts : ").append(gson.toJson(Arrays.toString(accounts))).append(",");
        sb.append(" clusterAdmins : ").append(gson.toJson(Arrays.toString(clusterAdmins))).append(",");
        sb.append(" clusterInfo : ").append(gson.toJson(clusterInfo)).append(",");
        sb.append(" defaultQoS : ").append(gson.toJson(defaultQoS)).append(",");
        sb.append(" features : ").append(gson.toJson(Arrays.toString(features))).append(",");
        sb.append(" initiators : ").append(gson.toJson(Arrays.toString(initiators))).append(",");
        sb.append(" ldapConfiguration : ").append(gson.toJson(ldapConfiguration)).append(",");
        sb.append(" ntp : ").append(gson.toJson(ntp)).append(",");
        sb.append(" qosPolicies : ").append(gson.toJson(Arrays.toString(qosPolicies))).append(",");
        sb.append(" remoteHosts : ").append(gson.toJson(Arrays.toString(remoteHosts))).append(",");
        sb.append(" schedules : ").append(gson.toJson(Arrays.toString(schedules))).append(",");
        sb.append(" snmp : ").append(gson.toJson(snmp)).append(",");
        if(null != tlsCiphers && tlsCiphers.isPresent()){
            sb.append(" tlsCiphers : ").append(gson.toJson(tlsCiphers)).append(",");
        }
        else{
            sb.append(" tlsCiphers : ").append("null").append(",");
        }
        sb.append(" virtualNetworks : ").append(gson.toJson(Arrays.toString(virtualNetworks))).append(",");
        sb.append(" volumeAccessGroupLunAssignments : ").append(gson.toJson(Arrays.toString(volumeAccessGroupLunAssignments))).append(",");
        sb.append(" volumeAccessGroups : ").append(gson.toJson(Arrays.toString(volumeAccessGroups))).append(",");
        sb.append(" volumes : ").append(gson.toJson(Arrays.toString(volumes))).append(",");
        if(null != storageContainers && storageContainers.isPresent()){
            sb.append(" storageContainers : ").append(gson.toJson(storageContainers)).append(",");
        }
        else{
            sb.append(" storageContainers : ").append("null").append(",");
        }
        if(null != snapMirrorEndpoints && snapMirrorEndpoints.isPresent()){
            sb.append(" snapMirrorEndpoints : ").append(gson.toJson(snapMirrorEndpoints)).append(",");
        }
        else{
            sb.append(" snapMirrorEndpoints : ").append("null").append(",");
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
        private Account[] accounts;
        private ClusterAdmin[] clusterAdmins;
        private ClusterInfo clusterInfo;
        private VolumeQOS defaultQoS;
        private FeatureObject[] features;
        private Initiator[] initiators;
        private LdapConfiguration ldapConfiguration;
        private GetNtpInfoResult ntp;
        private QoSPolicy[] qosPolicies;
        private LoggingServer[] remoteHosts;
        private ScheduleObject[] schedules;
        private GetSnmpInfoResult snmp;
        private Optional<GetActiveTlsCiphersResult> tlsCiphers;
        private VirtualNetwork[] virtualNetworks;
        private VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments;
        private VolumeAccessGroup[] volumeAccessGroups;
        private Volume[] volumes;
        private Optional<StorageContainer[]> storageContainers;
        private Optional<SnapMirrorEndpoint[]> snapMirrorEndpoints;

        private Builder() { }

        public GetClusterStructureResult build() {
            return new GetClusterStructureResult (
                         this.accounts,
                         this.clusterAdmins,
                         this.clusterInfo,
                         this.defaultQoS,
                         this.features,
                         this.initiators,
                         this.ldapConfiguration,
                         this.ntp,
                         this.qosPolicies,
                         this.remoteHosts,
                         this.schedules,
                         this.snmp,
                         this.tlsCiphers,
                         this.virtualNetworks,
                         this.volumeAccessGroupLunAssignments,
                         this.volumeAccessGroups,
                         this.volumes,
                         this.storageContainers,
                         this.snapMirrorEndpoints);
        }

        private GetClusterStructureResult.Builder buildFrom(final GetClusterStructureResult req) {
            this.accounts = req.accounts;
            this.clusterAdmins = req.clusterAdmins;
            this.clusterInfo = req.clusterInfo;
            this.defaultQoS = req.defaultQoS;
            this.features = req.features;
            this.initiators = req.initiators;
            this.ldapConfiguration = req.ldapConfiguration;
            this.ntp = req.ntp;
            this.qosPolicies = req.qosPolicies;
            this.remoteHosts = req.remoteHosts;
            this.schedules = req.schedules;
            this.snmp = req.snmp;
            this.tlsCiphers = req.tlsCiphers;
            this.virtualNetworks = req.virtualNetworks;
            this.volumeAccessGroupLunAssignments = req.volumeAccessGroupLunAssignments;
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.volumes = req.volumes;
            this.storageContainers = req.storageContainers;
            this.snapMirrorEndpoints = req.snapMirrorEndpoints;

            return this;
        }

        public GetClusterStructureResult.Builder accounts(final Account[] accounts) {
            this.accounts = accounts;
            return this;
        }

        public GetClusterStructureResult.Builder clusterAdmins(final ClusterAdmin[] clusterAdmins) {
            this.clusterAdmins = clusterAdmins;
            return this;
        }

        public GetClusterStructureResult.Builder clusterInfo(final ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        public GetClusterStructureResult.Builder defaultQoS(final VolumeQOS defaultQoS) {
            this.defaultQoS = defaultQoS;
            return this;
        }

        public GetClusterStructureResult.Builder features(final FeatureObject[] features) {
            this.features = features;
            return this;
        }

        public GetClusterStructureResult.Builder initiators(final Initiator[] initiators) {
            this.initiators = initiators;
            return this;
        }

        public GetClusterStructureResult.Builder ldapConfiguration(final LdapConfiguration ldapConfiguration) {
            this.ldapConfiguration = ldapConfiguration;
            return this;
        }

        public GetClusterStructureResult.Builder ntp(final GetNtpInfoResult ntp) {
            this.ntp = ntp;
            return this;
        }

        public GetClusterStructureResult.Builder qosPolicies(final QoSPolicy[] qosPolicies) {
            this.qosPolicies = qosPolicies;
            return this;
        }

        public GetClusterStructureResult.Builder remoteHosts(final LoggingServer[] remoteHosts) {
            this.remoteHosts = remoteHosts;
            return this;
        }

        public GetClusterStructureResult.Builder schedules(final ScheduleObject[] schedules) {
            this.schedules = schedules;
            return this;
        }

        public GetClusterStructureResult.Builder snmp(final GetSnmpInfoResult snmp) {
            this.snmp = snmp;
            return this;
        }

        public GetClusterStructureResult.Builder optionalTlsCiphers(final GetActiveTlsCiphersResult tlsCiphers) {
            this.tlsCiphers = (tlsCiphers == null) ? Optional.<GetActiveTlsCiphersResult>empty() : Optional.of(tlsCiphers);
            return this;
        }

        public GetClusterStructureResult.Builder virtualNetworks(final VirtualNetwork[] virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }

        public GetClusterStructureResult.Builder volumeAccessGroupLunAssignments(final VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments) {
            this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
            return this;
        }

        public GetClusterStructureResult.Builder volumeAccessGroups(final VolumeAccessGroup[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

        public GetClusterStructureResult.Builder volumes(final Volume[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public GetClusterStructureResult.Builder optionalStorageContainers(final StorageContainer[] storageContainers) {
            this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : Optional.of(storageContainers);
            return this;
        }

        public GetClusterStructureResult.Builder optionalSnapMirrorEndpoints(final SnapMirrorEndpoint[] snapMirrorEndpoints) {
            this.snapMirrorEndpoints = (snapMirrorEndpoints == null) ? Optional.<SnapMirrorEndpoint[]>empty() : Optional.of(snapMirrorEndpoints);
            return this;
        }

    }
}
