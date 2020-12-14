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
 * ClusterInfo  
 * Cluster Info object returns information the node uses to communicate with the cluster.
 **/

public class ClusterInfo implements Serializable {

    public static final long serialVersionUID = -7475416716545306140L;
    @SerializedName("mvipInterface") private Optional<String> mvipInterface;
    @SerializedName("mvipVlanTag") private Optional<String> mvipVlanTag;
    @SerializedName("svipInterface") private Optional<String> svipInterface;
    @SerializedName("svipVlanTag") private Optional<String> svipVlanTag;
    @SerializedName("encryptionAtRestState") private String encryptionAtRestState;
    @SerializedName("softwareEncryptionAtRestState") private String softwareEncryptionAtRestState;
    @SerializedName("ensemble") private String[] ensemble;
    @SerializedName("mvip") private String mvip;
    @SerializedName("mvipNodeID") private Long mvipNodeID;
    @SerializedName("name") private String name;
    @SerializedName("repCount") private Long repCount;
    @SerializedName("supportedProtectionSchemes") private String[] supportedProtectionSchemes;
    @SerializedName("enabledProtectionSchemes") private String[] enabledProtectionSchemes;
    @SerializedName("defaultProtectionScheme") private String defaultProtectionScheme;
    @SerializedName("svip") private String svip;
    @SerializedName("svipNodeID") private Long svipNodeID;
    @SerializedName("uniqueID") private String uniqueID;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("attributes") private Attributes attributes;
    // empty constructor
    @Since("7.0")
    public ClusterInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterInfo(
        Optional<String> mvipInterface,
        Optional<String> mvipVlanTag,
        Optional<String> svipInterface,
        Optional<String> svipVlanTag,
        String encryptionAtRestState,
        String[] ensemble,
        String mvip,
        Long mvipNodeID,
        String name,
        Long repCount,
        String[] supportedProtectionSchemes,
        String[] enabledProtectionSchemes,
        String defaultProtectionScheme,
        String svip,
        Long svipNodeID,
        String uniqueID,
        java.util.UUID uuid,
        Attributes attributes
    )
    {
        this.mvipInterface = (mvipInterface == null) ? Optional.<String>empty() : mvipInterface;
        this.mvipVlanTag = (mvipVlanTag == null) ? Optional.<String>empty() : mvipVlanTag;
        this.svipInterface = (svipInterface == null) ? Optional.<String>empty() : svipInterface;
        this.svipVlanTag = (svipVlanTag == null) ? Optional.<String>empty() : svipVlanTag;
        this.encryptionAtRestState = encryptionAtRestState;
        this.ensemble = ensemble;
        this.mvip = mvip;
        this.mvipNodeID = mvipNodeID;
        this.name = name;
        this.repCount = repCount;
        this.supportedProtectionSchemes = supportedProtectionSchemes;
        this.enabledProtectionSchemes = enabledProtectionSchemes;
        this.defaultProtectionScheme = defaultProtectionScheme;
        this.svip = svip;
        this.svipNodeID = svipNodeID;
        this.uniqueID = uniqueID;
        this.uuid = uuid;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public ClusterInfo(
        Optional<String> mvipInterface,
        Optional<String> mvipVlanTag,
        Optional<String> svipInterface,
        Optional<String> svipVlanTag,
        String encryptionAtRestState,
        String softwareEncryptionAtRestState,
        String[] ensemble,
        String mvip,
        Long mvipNodeID,
        String name,
        Long repCount,
        String[] supportedProtectionSchemes,
        String[] enabledProtectionSchemes,
        String defaultProtectionScheme,
        String svip,
        Long svipNodeID,
        String uniqueID,
        java.util.UUID uuid,
        Attributes attributes
    )
    {
        this.mvipInterface = (mvipInterface == null) ? Optional.<String>empty() : mvipInterface;
        this.mvipVlanTag = (mvipVlanTag == null) ? Optional.<String>empty() : mvipVlanTag;
        this.svipInterface = (svipInterface == null) ? Optional.<String>empty() : svipInterface;
        this.svipVlanTag = (svipVlanTag == null) ? Optional.<String>empty() : svipVlanTag;
        this.encryptionAtRestState = encryptionAtRestState;
        this.softwareEncryptionAtRestState = softwareEncryptionAtRestState;
        this.ensemble = ensemble;
        this.mvip = mvip;
        this.mvipNodeID = mvipNodeID;
        this.name = name;
        this.repCount = repCount;
        this.supportedProtectionSchemes = supportedProtectionSchemes;
        this.enabledProtectionSchemes = enabledProtectionSchemes;
        this.defaultProtectionScheme = defaultProtectionScheme;
        this.svip = svip;
        this.svipNodeID = svipNodeID;
        this.uniqueID = uniqueID;
        this.uuid = uuid;
        this.attributes = attributes;
    }

    /** 
     * 
     **/
    public Optional<String> getMvipInterface() { return this.mvipInterface; }
   
    public void setMvipInterface(Optional<String> mvipInterface) { 
        this.mvipInterface = (mvipInterface == null) ? Optional.<String>empty() : mvipInterface;
    }
    /** 
     * 
     **/
    public Optional<String> getMvipVlanTag() { return this.mvipVlanTag; }
   
    public void setMvipVlanTag(Optional<String> mvipVlanTag) { 
        this.mvipVlanTag = (mvipVlanTag == null) ? Optional.<String>empty() : mvipVlanTag;
    }
    /** 
     * 
     **/
    public Optional<String> getSvipInterface() { return this.svipInterface; }
   
    public void setSvipInterface(Optional<String> svipInterface) { 
        this.svipInterface = (svipInterface == null) ? Optional.<String>empty() : svipInterface;
    }
    /** 
     * 
     **/
    public Optional<String> getSvipVlanTag() { return this.svipVlanTag; }
   
    public void setSvipVlanTag(Optional<String> svipVlanTag) { 
        this.svipVlanTag = (svipVlanTag == null) ? Optional.<String>empty() : svipVlanTag;
    }
    /** 
     * Encryption at rest state.
     **/
    public String getEncryptionAtRestState() { return this.encryptionAtRestState; }
   
    public void setEncryptionAtRestState(String encryptionAtRestState) { 
        this.encryptionAtRestState = encryptionAtRestState;
    }
    /** 
     * Software-based encryption-at-rest state.
     **/
    public String getSoftwareEncryptionAtRestState() { return this.softwareEncryptionAtRestState; }
   
    public void setSoftwareEncryptionAtRestState(String softwareEncryptionAtRestState) { 
        this.softwareEncryptionAtRestState = softwareEncryptionAtRestState;
    }
    /** 
     * Array of Node IP addresses that are participating in the cluster.
     **/
    public String[] getEnsemble() { return this.ensemble; }
   
    public void setEnsemble(String[] ensemble) { 
        this.ensemble = ensemble;
    }
    /** 
     * Management network interface.
     **/
    public String getMvip() { return this.mvip; }
   
    public void setMvip(String mvip) { 
        this.mvip = mvip;
    }
    /** 
     * Node holding the master MVIP address
     **/
    public Long getMvipNodeID() { return this.mvipNodeID; }
   
    public void setMvipNodeID(Long mvipNodeID) { 
        this.mvipNodeID = mvipNodeID;
    }
    /** 
     * Unique cluster name.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Number of replicas of each piece of data to store in the cluster.
     **/
    public Long getRepCount() { return this.repCount; }
   
    public void setRepCount(Long repCount) { 
        this.repCount = repCount;
    }
    /** 
     * A list of all of the protection schemes that are supported on this cluster.
     **/
    public String[] getSupportedProtectionSchemes() { return this.supportedProtectionSchemes; }
   
    public void setSupportedProtectionSchemes(String[] supportedProtectionSchemes) { 
        this.supportedProtectionSchemes = supportedProtectionSchemes;
    }
    /** 
     * A list of all of the protection schemes that have been enabled on this cluster.
     **/
    public String[] getEnabledProtectionSchemes() { return this.enabledProtectionSchemes; }
   
    public void setEnabledProtectionSchemes(String[] enabledProtectionSchemes) { 
        this.enabledProtectionSchemes = enabledProtectionSchemes;
    }
    /** 
     * If a protection scheme is not provided to the CreateVolume call, this protection scheme will be used for the new volume.
     * This protection scheme must always be in the set of enabled protection schemes.
     **/
    public String getDefaultProtectionScheme() { return this.defaultProtectionScheme; }
   
    public void setDefaultProtectionScheme(String defaultProtectionScheme) { 
        this.defaultProtectionScheme = defaultProtectionScheme;
    }
    /** 
     * Storage virtual IP
     **/
    public String getSvip() { return this.svip; }
   
    public void setSvip(String svip) { 
        this.svip = svip;
    }
    /** 
     * Node holding the master SVIP address.
     **/
    public Long getSvipNodeID() { return this.svipNodeID; }
   
    public void setSvipNodeID(Long svipNodeID) { 
        this.svipNodeID = svipNodeID;
    }
    /** 
     * Unique ID for the cluster.
     **/
    public String getUniqueID() { return this.uniqueID; }
   
    public void setUniqueID(String uniqueID) { 
        this.uniqueID = uniqueID;
    }
    /** 
     * 
     **/
    public java.util.UUID getUuid() { return this.uuid; }
   
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterInfo that = (ClusterInfo) o;

        return 
            Objects.equals(mvipInterface, that.mvipInterface) && 
            Objects.equals(mvipVlanTag, that.mvipVlanTag) && 
            Objects.equals(svipInterface, that.svipInterface) && 
            Objects.equals(svipVlanTag, that.svipVlanTag) && 
            Objects.equals(encryptionAtRestState, that.encryptionAtRestState) && 
            Objects.equals(softwareEncryptionAtRestState, that.softwareEncryptionAtRestState) && 
            Arrays.equals(ensemble, that.ensemble) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(mvipNodeID, that.mvipNodeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(repCount, that.repCount) && 
            Arrays.equals(supportedProtectionSchemes, that.supportedProtectionSchemes) && 
            Arrays.equals(enabledProtectionSchemes, that.enabledProtectionSchemes) && 
            Objects.equals(defaultProtectionScheme, that.defaultProtectionScheme) && 
            Objects.equals(svip, that.svip) && 
            Objects.equals(svipNodeID, that.svipNodeID) && 
            Objects.equals(uniqueID, that.uniqueID) && 
            Objects.equals(uuid, that.uuid) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( mvipInterface,mvipVlanTag,svipInterface,svipVlanTag,encryptionAtRestState,softwareEncryptionAtRestState,(Object[])ensemble,mvip,mvipNodeID,name,repCount,(Object[])supportedProtectionSchemes,(Object[])enabledProtectionSchemes,defaultProtectionScheme,svip,svipNodeID,uniqueID,uuid,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("mvipInterface", mvipInterface);
        map.put("mvipVlanTag", mvipVlanTag);
        map.put("svipInterface", svipInterface);
        map.put("svipVlanTag", svipVlanTag);
        map.put("encryptionAtRestState", encryptionAtRestState);
        map.put("softwareEncryptionAtRestState", softwareEncryptionAtRestState);
        map.put("ensemble", ensemble);
        map.put("mvip", mvip);
        map.put("mvipNodeID", mvipNodeID);
        map.put("name", name);
        map.put("repCount", repCount);
        map.put("supportedProtectionSchemes", supportedProtectionSchemes);
        map.put("enabledProtectionSchemes", enabledProtectionSchemes);
        map.put("defaultProtectionScheme", defaultProtectionScheme);
        map.put("svip", svip);
        map.put("svipNodeID", svipNodeID);
        map.put("uniqueID", uniqueID);
        map.put("uuid", uuid);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != mvipInterface && mvipInterface.isPresent()){
            sb.append(" mvipInterface : ").append(gson.toJson(mvipInterface)).append(",");
        }
        else{
            sb.append(" mvipInterface : ").append("null").append(",");
        }
        if(null != mvipVlanTag && mvipVlanTag.isPresent()){
            sb.append(" mvipVlanTag : ").append(gson.toJson(mvipVlanTag)).append(",");
        }
        else{
            sb.append(" mvipVlanTag : ").append("null").append(",");
        }
        if(null != svipInterface && svipInterface.isPresent()){
            sb.append(" svipInterface : ").append(gson.toJson(svipInterface)).append(",");
        }
        else{
            sb.append(" svipInterface : ").append("null").append(",");
        }
        if(null != svipVlanTag && svipVlanTag.isPresent()){
            sb.append(" svipVlanTag : ").append(gson.toJson(svipVlanTag)).append(",");
        }
        else{
            sb.append(" svipVlanTag : ").append("null").append(",");
        }
        sb.append(" encryptionAtRestState : ").append(gson.toJson(encryptionAtRestState)).append(",");
        sb.append(" softwareEncryptionAtRestState : ").append(gson.toJson(softwareEncryptionAtRestState)).append(",");
        sb.append(" ensemble : ").append(gson.toJson(Arrays.toString(ensemble))).append(",");
        sb.append(" mvip : ").append(gson.toJson(mvip)).append(",");
        sb.append(" mvipNodeID : ").append(gson.toJson(mvipNodeID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" repCount : ").append(gson.toJson(repCount)).append(",");
        sb.append(" supportedProtectionSchemes : ").append(gson.toJson(Arrays.toString(supportedProtectionSchemes))).append(",");
        sb.append(" enabledProtectionSchemes : ").append(gson.toJson(Arrays.toString(enabledProtectionSchemes))).append(",");
        sb.append(" defaultProtectionScheme : ").append(gson.toJson(defaultProtectionScheme)).append(",");
        sb.append(" svip : ").append(gson.toJson(svip)).append(",");
        sb.append(" svipNodeID : ").append(gson.toJson(svipNodeID)).append(",");
        sb.append(" uniqueID : ").append(gson.toJson(uniqueID)).append(",");
        sb.append(" uuid : ").append(gson.toJson(uuid)).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
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
        private Optional<String> mvipInterface;
        private Optional<String> mvipVlanTag;
        private Optional<String> svipInterface;
        private Optional<String> svipVlanTag;
        private String encryptionAtRestState;
        private String softwareEncryptionAtRestState;
        private String[] ensemble;
        private String mvip;
        private Long mvipNodeID;
        private String name;
        private Long repCount;
        private String[] supportedProtectionSchemes;
        private String[] enabledProtectionSchemes;
        private String defaultProtectionScheme;
        private String svip;
        private Long svipNodeID;
        private String uniqueID;
        private java.util.UUID uuid;
        private Attributes attributes;

        private Builder() { }

        public ClusterInfo build() {
            return new ClusterInfo (
                         this.mvipInterface,
                         this.mvipVlanTag,
                         this.svipInterface,
                         this.svipVlanTag,
                         this.encryptionAtRestState,
                         this.softwareEncryptionAtRestState,
                         this.ensemble,
                         this.mvip,
                         this.mvipNodeID,
                         this.name,
                         this.repCount,
                         this.supportedProtectionSchemes,
                         this.enabledProtectionSchemes,
                         this.defaultProtectionScheme,
                         this.svip,
                         this.svipNodeID,
                         this.uniqueID,
                         this.uuid,
                         this.attributes);
        }

        private ClusterInfo.Builder buildFrom(final ClusterInfo req) {
            this.mvipInterface = req.mvipInterface;
            this.mvipVlanTag = req.mvipVlanTag;
            this.svipInterface = req.svipInterface;
            this.svipVlanTag = req.svipVlanTag;
            this.encryptionAtRestState = req.encryptionAtRestState;
            this.softwareEncryptionAtRestState = req.softwareEncryptionAtRestState;
            this.ensemble = req.ensemble;
            this.mvip = req.mvip;
            this.mvipNodeID = req.mvipNodeID;
            this.name = req.name;
            this.repCount = req.repCount;
            this.supportedProtectionSchemes = req.supportedProtectionSchemes;
            this.enabledProtectionSchemes = req.enabledProtectionSchemes;
            this.defaultProtectionScheme = req.defaultProtectionScheme;
            this.svip = req.svip;
            this.svipNodeID = req.svipNodeID;
            this.uniqueID = req.uniqueID;
            this.uuid = req.uuid;
            this.attributes = req.attributes;

            return this;
        }

        public ClusterInfo.Builder optionalMvipInterface(final String mvipInterface) {
            this.mvipInterface = (mvipInterface == null) ? Optional.<String>empty() : Optional.of(mvipInterface);
            return this;
        }

        public ClusterInfo.Builder optionalMvipVlanTag(final String mvipVlanTag) {
            this.mvipVlanTag = (mvipVlanTag == null) ? Optional.<String>empty() : Optional.of(mvipVlanTag);
            return this;
        }

        public ClusterInfo.Builder optionalSvipInterface(final String svipInterface) {
            this.svipInterface = (svipInterface == null) ? Optional.<String>empty() : Optional.of(svipInterface);
            return this;
        }

        public ClusterInfo.Builder optionalSvipVlanTag(final String svipVlanTag) {
            this.svipVlanTag = (svipVlanTag == null) ? Optional.<String>empty() : Optional.of(svipVlanTag);
            return this;
        }

        public ClusterInfo.Builder encryptionAtRestState(final String encryptionAtRestState) {
            this.encryptionAtRestState = encryptionAtRestState;
            return this;
        }

        public ClusterInfo.Builder softwareEncryptionAtRestState(final String softwareEncryptionAtRestState) {
            this.softwareEncryptionAtRestState = softwareEncryptionAtRestState;
            return this;
        }

        public ClusterInfo.Builder ensemble(final String[] ensemble) {
            this.ensemble = ensemble;
            return this;
        }

        public ClusterInfo.Builder mvip(final String mvip) {
            this.mvip = mvip;
            return this;
        }

        public ClusterInfo.Builder mvipNodeID(final Long mvipNodeID) {
            this.mvipNodeID = mvipNodeID;
            return this;
        }

        public ClusterInfo.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public ClusterInfo.Builder repCount(final Long repCount) {
            this.repCount = repCount;
            return this;
        }

        public ClusterInfo.Builder supportedProtectionSchemes(final String[] supportedProtectionSchemes) {
            this.supportedProtectionSchemes = supportedProtectionSchemes;
            return this;
        }

        public ClusterInfo.Builder enabledProtectionSchemes(final String[] enabledProtectionSchemes) {
            this.enabledProtectionSchemes = enabledProtectionSchemes;
            return this;
        }

        public ClusterInfo.Builder defaultProtectionScheme(final String defaultProtectionScheme) {
            this.defaultProtectionScheme = defaultProtectionScheme;
            return this;
        }

        public ClusterInfo.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

        public ClusterInfo.Builder svipNodeID(final Long svipNodeID) {
            this.svipNodeID = svipNodeID;
            return this;
        }

        public ClusterInfo.Builder uniqueID(final String uniqueID) {
            this.uniqueID = uniqueID;
            return this;
        }

        public ClusterInfo.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public ClusterInfo.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
