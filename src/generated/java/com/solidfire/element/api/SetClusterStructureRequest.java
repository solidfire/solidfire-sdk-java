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
 * SetClusterStructureRequest  
 * You can use the SetClusterStructure method to restore the storage cluster configuration information from a backup. When you call the method, pass the json result returned from the GetClusterStructure API containing the configuration information you want to restore.
 **/

public class SetClusterStructureRequest implements Serializable {

    public static final long serialVersionUID = -2324362754057174332L;
    @SerializedName("accounts") private Optional<Account[]> accounts;
    @SerializedName("defaultQoS") private Optional<VolumeQOS> defaultQoS;
    @SerializedName("features") private Optional<FeatureObject[]> features;
    @SerializedName("initiators") private Optional<Initiator[]> initiators;
    @SerializedName("ntp") private Optional<GetNtpInfoResult> ntp;
    @SerializedName("qosPolicies") private Optional<QoSPolicy[]> qosPolicies;
    @SerializedName("remoteHosts") private Optional<LoggingServer[]> remoteHosts;
    @SerializedName("schedules") private Optional<ScheduleObject[]> schedules;
    @SerializedName("snmp") private Optional<GetSnmpInfoResult> snmp;
    @SerializedName("tlsCiphers") private Optional<GetActiveTlsCiphersResult> tlsCiphers;
    @SerializedName("virtualNetworks") private Optional<VirtualNetwork[]> virtualNetworks;
    @SerializedName("volumeAccessGroupLunAssignments") private Optional<VolumeAccessGroupLunAssignments[]> volumeAccessGroupLunAssignments;
    @SerializedName("volumeAccessGroups") private Optional<VolumeAccessGroup[]> volumeAccessGroups;
    @SerializedName("volumes") private Optional<Volume[]> volumes;
    @SerializedName("storageContainers") private Optional<StorageContainer[]> storageContainers;
    // empty constructor
    @Since("7.0")
    public SetClusterStructureRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetClusterStructureRequest(
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
    )
    {
        this.accounts = (accounts == null) ? Optional.<Account[]>empty() : accounts;
        this.defaultQoS = (defaultQoS == null) ? Optional.<VolumeQOS>empty() : defaultQoS;
        this.features = (features == null) ? Optional.<FeatureObject[]>empty() : features;
        this.initiators = (initiators == null) ? Optional.<Initiator[]>empty() : initiators;
        this.ntp = (ntp == null) ? Optional.<GetNtpInfoResult>empty() : ntp;
        this.qosPolicies = (qosPolicies == null) ? Optional.<QoSPolicy[]>empty() : qosPolicies;
        this.remoteHosts = (remoteHosts == null) ? Optional.<LoggingServer[]>empty() : remoteHosts;
        this.schedules = (schedules == null) ? Optional.<ScheduleObject[]>empty() : schedules;
        this.snmp = (snmp == null) ? Optional.<GetSnmpInfoResult>empty() : snmp;
        this.tlsCiphers = (tlsCiphers == null) ? Optional.<GetActiveTlsCiphersResult>empty() : tlsCiphers;
        this.virtualNetworks = (virtualNetworks == null) ? Optional.<VirtualNetwork[]>empty() : virtualNetworks;
        this.volumeAccessGroupLunAssignments = (volumeAccessGroupLunAssignments == null) ? Optional.<VolumeAccessGroupLunAssignments[]>empty() : volumeAccessGroupLunAssignments;
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<VolumeAccessGroup[]>empty() : volumeAccessGroups;
        this.volumes = (volumes == null) ? Optional.<Volume[]>empty() : volumes;
        this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : storageContainers;
    }

    /** 
     * 
     **/
    public Optional<Account[]> getAccounts() { return this.accounts; }
   
    public void setAccounts(Optional<Account[]> accounts) { 
        this.accounts = (accounts == null) ? Optional.<Account[]>empty() : accounts;
    }
    /** 
     * 
     **/
    public Optional<VolumeQOS> getDefaultQoS() { return this.defaultQoS; }
   
    public void setDefaultQoS(Optional<VolumeQOS> defaultQoS) { 
        this.defaultQoS = (defaultQoS == null) ? Optional.<VolumeQOS>empty() : defaultQoS;
    }
    /** 
     * 
     **/
    public Optional<FeatureObject[]> getFeatures() { return this.features; }
   
    public void setFeatures(Optional<FeatureObject[]> features) { 
        this.features = (features == null) ? Optional.<FeatureObject[]>empty() : features;
    }
    /** 
     * 
     **/
    public Optional<Initiator[]> getInitiators() { return this.initiators; }
   
    public void setInitiators(Optional<Initiator[]> initiators) { 
        this.initiators = (initiators == null) ? Optional.<Initiator[]>empty() : initiators;
    }
    /** 
     * 
     **/
    public Optional<GetNtpInfoResult> getNtp() { return this.ntp; }
   
    public void setNtp(Optional<GetNtpInfoResult> ntp) { 
        this.ntp = (ntp == null) ? Optional.<GetNtpInfoResult>empty() : ntp;
    }
    /** 
     * 
     **/
    public Optional<QoSPolicy[]> getQosPolicies() { return this.qosPolicies; }
   
    public void setQosPolicies(Optional<QoSPolicy[]> qosPolicies) { 
        this.qosPolicies = (qosPolicies == null) ? Optional.<QoSPolicy[]>empty() : qosPolicies;
    }
    /** 
     * 
     **/
    public Optional<LoggingServer[]> getRemoteHosts() { return this.remoteHosts; }
   
    public void setRemoteHosts(Optional<LoggingServer[]> remoteHosts) { 
        this.remoteHosts = (remoteHosts == null) ? Optional.<LoggingServer[]>empty() : remoteHosts;
    }
    /** 
     * 
     **/
    public Optional<ScheduleObject[]> getSchedules() { return this.schedules; }
   
    public void setSchedules(Optional<ScheduleObject[]> schedules) { 
        this.schedules = (schedules == null) ? Optional.<ScheduleObject[]>empty() : schedules;
    }
    /** 
     * 
     **/
    public Optional<GetSnmpInfoResult> getSnmp() { return this.snmp; }
   
    public void setSnmp(Optional<GetSnmpInfoResult> snmp) { 
        this.snmp = (snmp == null) ? Optional.<GetSnmpInfoResult>empty() : snmp;
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
    public Optional<VirtualNetwork[]> getVirtualNetworks() { return this.virtualNetworks; }
   
    public void setVirtualNetworks(Optional<VirtualNetwork[]> virtualNetworks) { 
        this.virtualNetworks = (virtualNetworks == null) ? Optional.<VirtualNetwork[]>empty() : virtualNetworks;
    }
    /** 
     * 
     **/
    public Optional<VolumeAccessGroupLunAssignments[]> getVolumeAccessGroupLunAssignments() { return this.volumeAccessGroupLunAssignments; }
   
    public void setVolumeAccessGroupLunAssignments(Optional<VolumeAccessGroupLunAssignments[]> volumeAccessGroupLunAssignments) { 
        this.volumeAccessGroupLunAssignments = (volumeAccessGroupLunAssignments == null) ? Optional.<VolumeAccessGroupLunAssignments[]>empty() : volumeAccessGroupLunAssignments;
    }
    /** 
     * 
     **/
    public Optional<VolumeAccessGroup[]> getVolumeAccessGroups() { return this.volumeAccessGroups; }
   
    public void setVolumeAccessGroups(Optional<VolumeAccessGroup[]> volumeAccessGroups) { 
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<VolumeAccessGroup[]>empty() : volumeAccessGroups;
    }
    /** 
     * 
     **/
    public Optional<Volume[]> getVolumes() { return this.volumes; }
   
    public void setVolumes(Optional<Volume[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<Volume[]>empty() : volumes;
    }
    /** 
     * 
     **/
    public Optional<StorageContainer[]> getStorageContainers() { return this.storageContainers; }
   
    public void setStorageContainers(Optional<StorageContainer[]> storageContainers) { 
        this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : storageContainers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetClusterStructureRequest that = (SetClusterStructureRequest) o;

        return 
            Objects.equals(accounts, that.accounts) && 
            Objects.equals(defaultQoS, that.defaultQoS) && 
            Objects.equals(features, that.features) && 
            Objects.equals(initiators, that.initiators) && 
            Objects.equals(ntp, that.ntp) && 
            Objects.equals(qosPolicies, that.qosPolicies) && 
            Objects.equals(remoteHosts, that.remoteHosts) && 
            Objects.equals(schedules, that.schedules) && 
            Objects.equals(snmp, that.snmp) && 
            Objects.equals(tlsCiphers, that.tlsCiphers) && 
            Objects.equals(virtualNetworks, that.virtualNetworks) && 
            Objects.equals(volumeAccessGroupLunAssignments, that.volumeAccessGroupLunAssignments) && 
            Objects.equals(volumeAccessGroups, that.volumeAccessGroups) && 
            Objects.equals(volumes, that.volumes) && 
            Objects.equals(storageContainers, that.storageContainers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accounts,defaultQoS,features,initiators,ntp,qosPolicies,remoteHosts,schedules,snmp,tlsCiphers,virtualNetworks,volumeAccessGroupLunAssignments,volumeAccessGroups,volumes,storageContainers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accounts", accounts);
        map.put("defaultQoS", defaultQoS);
        map.put("features", features);
        map.put("initiators", initiators);
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
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != accounts && accounts.isPresent()){
            sb.append(" accounts : ").append(gson.toJson(accounts)).append(",");
        }
        else{
            sb.append(" accounts : ").append("null").append(",");
        }
        if(null != defaultQoS && defaultQoS.isPresent()){
            sb.append(" defaultQoS : ").append(gson.toJson(defaultQoS)).append(",");
        }
        else{
            sb.append(" defaultQoS : ").append("null").append(",");
        }
        if(null != features && features.isPresent()){
            sb.append(" features : ").append(gson.toJson(features)).append(",");
        }
        else{
            sb.append(" features : ").append("null").append(",");
        }
        if(null != initiators && initiators.isPresent()){
            sb.append(" initiators : ").append(gson.toJson(initiators)).append(",");
        }
        else{
            sb.append(" initiators : ").append("null").append(",");
        }
        if(null != ntp && ntp.isPresent()){
            sb.append(" ntp : ").append(gson.toJson(ntp)).append(",");
        }
        else{
            sb.append(" ntp : ").append("null").append(",");
        }
        if(null != qosPolicies && qosPolicies.isPresent()){
            sb.append(" qosPolicies : ").append(gson.toJson(qosPolicies)).append(",");
        }
        else{
            sb.append(" qosPolicies : ").append("null").append(",");
        }
        if(null != remoteHosts && remoteHosts.isPresent()){
            sb.append(" remoteHosts : ").append(gson.toJson(remoteHosts)).append(",");
        }
        else{
            sb.append(" remoteHosts : ").append("null").append(",");
        }
        if(null != schedules && schedules.isPresent()){
            sb.append(" schedules : ").append(gson.toJson(schedules)).append(",");
        }
        else{
            sb.append(" schedules : ").append("null").append(",");
        }
        if(null != snmp && snmp.isPresent()){
            sb.append(" snmp : ").append(gson.toJson(snmp)).append(",");
        }
        else{
            sb.append(" snmp : ").append("null").append(",");
        }
        if(null != tlsCiphers && tlsCiphers.isPresent()){
            sb.append(" tlsCiphers : ").append(gson.toJson(tlsCiphers)).append(",");
        }
        else{
            sb.append(" tlsCiphers : ").append("null").append(",");
        }
        if(null != virtualNetworks && virtualNetworks.isPresent()){
            sb.append(" virtualNetworks : ").append(gson.toJson(virtualNetworks)).append(",");
        }
        else{
            sb.append(" virtualNetworks : ").append("null").append(",");
        }
        if(null != volumeAccessGroupLunAssignments && volumeAccessGroupLunAssignments.isPresent()){
            sb.append(" volumeAccessGroupLunAssignments : ").append(gson.toJson(volumeAccessGroupLunAssignments)).append(",");
        }
        else{
            sb.append(" volumeAccessGroupLunAssignments : ").append("null").append(",");
        }
        if(null != volumeAccessGroups && volumeAccessGroups.isPresent()){
            sb.append(" volumeAccessGroups : ").append(gson.toJson(volumeAccessGroups)).append(",");
        }
        else{
            sb.append(" volumeAccessGroups : ").append("null").append(",");
        }
        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(gson.toJson(volumes)).append(",");
        }
        else{
            sb.append(" volumes : ").append("null").append(",");
        }
        if(null != storageContainers && storageContainers.isPresent()){
            sb.append(" storageContainers : ").append(gson.toJson(storageContainers)).append(",");
        }
        else{
            sb.append(" storageContainers : ").append("null").append(",");
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
        private Optional<Account[]> accounts;
        private Optional<VolumeQOS> defaultQoS;
        private Optional<FeatureObject[]> features;
        private Optional<Initiator[]> initiators;
        private Optional<GetNtpInfoResult> ntp;
        private Optional<QoSPolicy[]> qosPolicies;
        private Optional<LoggingServer[]> remoteHosts;
        private Optional<ScheduleObject[]> schedules;
        private Optional<GetSnmpInfoResult> snmp;
        private Optional<GetActiveTlsCiphersResult> tlsCiphers;
        private Optional<VirtualNetwork[]> virtualNetworks;
        private Optional<VolumeAccessGroupLunAssignments[]> volumeAccessGroupLunAssignments;
        private Optional<VolumeAccessGroup[]> volumeAccessGroups;
        private Optional<Volume[]> volumes;
        private Optional<StorageContainer[]> storageContainers;

        private Builder() { }

        public SetClusterStructureRequest build() {
            return new SetClusterStructureRequest (
                         this.accounts,
                         this.defaultQoS,
                         this.features,
                         this.initiators,
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
                         this.storageContainers);
        }

        private SetClusterStructureRequest.Builder buildFrom(final SetClusterStructureRequest req) {
            this.accounts = req.accounts;
            this.defaultQoS = req.defaultQoS;
            this.features = req.features;
            this.initiators = req.initiators;
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

            return this;
        }

        public SetClusterStructureRequest.Builder optionalAccounts(final Account[] accounts) {
            this.accounts = (accounts == null) ? Optional.<Account[]>empty() : Optional.of(accounts);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalDefaultQoS(final VolumeQOS defaultQoS) {
            this.defaultQoS = (defaultQoS == null) ? Optional.<VolumeQOS>empty() : Optional.of(defaultQoS);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalFeatures(final FeatureObject[] features) {
            this.features = (features == null) ? Optional.<FeatureObject[]>empty() : Optional.of(features);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalInitiators(final Initiator[] initiators) {
            this.initiators = (initiators == null) ? Optional.<Initiator[]>empty() : Optional.of(initiators);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalNtp(final GetNtpInfoResult ntp) {
            this.ntp = (ntp == null) ? Optional.<GetNtpInfoResult>empty() : Optional.of(ntp);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalQosPolicies(final QoSPolicy[] qosPolicies) {
            this.qosPolicies = (qosPolicies == null) ? Optional.<QoSPolicy[]>empty() : Optional.of(qosPolicies);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalRemoteHosts(final LoggingServer[] remoteHosts) {
            this.remoteHosts = (remoteHosts == null) ? Optional.<LoggingServer[]>empty() : Optional.of(remoteHosts);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalSchedules(final ScheduleObject[] schedules) {
            this.schedules = (schedules == null) ? Optional.<ScheduleObject[]>empty() : Optional.of(schedules);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalSnmp(final GetSnmpInfoResult snmp) {
            this.snmp = (snmp == null) ? Optional.<GetSnmpInfoResult>empty() : Optional.of(snmp);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalTlsCiphers(final GetActiveTlsCiphersResult tlsCiphers) {
            this.tlsCiphers = (tlsCiphers == null) ? Optional.<GetActiveTlsCiphersResult>empty() : Optional.of(tlsCiphers);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalVirtualNetworks(final VirtualNetwork[] virtualNetworks) {
            this.virtualNetworks = (virtualNetworks == null) ? Optional.<VirtualNetwork[]>empty() : Optional.of(virtualNetworks);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalVolumeAccessGroupLunAssignments(final VolumeAccessGroupLunAssignments[] volumeAccessGroupLunAssignments) {
            this.volumeAccessGroupLunAssignments = (volumeAccessGroupLunAssignments == null) ? Optional.<VolumeAccessGroupLunAssignments[]>empty() : Optional.of(volumeAccessGroupLunAssignments);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalVolumeAccessGroups(final VolumeAccessGroup[] volumeAccessGroups) {
            this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<VolumeAccessGroup[]>empty() : Optional.of(volumeAccessGroups);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalVolumes(final Volume[] volumes) {
            this.volumes = (volumes == null) ? Optional.<Volume[]>empty() : Optional.of(volumes);
            return this;
        }

        public SetClusterStructureRequest.Builder optionalStorageContainers(final StorageContainer[] storageContainers) {
            this.storageContainers = (storageContainers == null) ? Optional.<StorageContainer[]>empty() : Optional.of(storageContainers);
            return this;
        }

    }
}
