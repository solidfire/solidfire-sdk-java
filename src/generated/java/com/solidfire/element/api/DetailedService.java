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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * DetailedService  
 **/

public class DetailedService implements Serializable {

    public static final long serialVersionUID = 8056035336441509510L;
    @SerializedName("service") private Service service;
    @SerializedName("node") private Node node;
    @SerializedName("drive") private Optional<Drive> drive;
    @SerializedName("drives") private Drive[] drives;

    // empty constructor
    @Since("7.0")
    public DetailedService() {}

    
    // parameterized constructor
    @Since("7.0")
    public DetailedService(
        Service service,
        Node node,
        Optional<Drive> drive,
        Drive[] drives
    )
    {
        this.service = service;
        this.node = node;
        this.drive = (drive == null) ? Optional.<Drive>empty() : drive;
        this.drives = drives;
    }

    /** 
     **/
    public Service getService() { return this.service; }
    public void setService(Service service) { 
        this.service = service;
    }
    /** 
     **/
    public Node getNode() { return this.node; }
    public void setNode(Node node) { 
        this.node = node;
    }
    /** 
     **/
    public Optional<Drive> getDrive() { return this.drive; }
    public void setDrive(Optional<Drive> drive) { 
        this.drive = (drive == null) ? Optional.<Drive>empty() : drive;
    }
    /** 
     **/
    public Drive[] getDrives() { return this.drives; }
    public void setDrives(Drive[] drives) { 
        this.drives = drives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailedService that = (DetailedService) o;

        return 
            Objects.equals(service, that.service) && 
            Objects.equals(node, that.node) && 
            Objects.equals(drive, that.drive) && 
            Arrays.equals(drives, that.drives);
    }

    @Override
    public int hashCode() {
        return Objects.hash( service,node,drive,(Object[])drives );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("service", service);
        map.put("node", node);
        map.put("drive", drive);
        map.put("drives", drives);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" service : ").append(service).append(",");
        sb.append(" node : ").append(node).append(",");
        if(null != drive && drive.isPresent()){
            sb.append(" drive : ").append(drive).append(",");
        }
        sb.append(" drives : ").append(Arrays.toString(drives)).append(",");
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
        private Service service;
        private Node node;
        private Optional<Drive> drive;
        private Drive[] drives;

        private Builder() { }

        public DetailedService build() {
            return new DetailedService (
                         this.service,
                         this.node,
                         this.drive,
                         this.drives);
        }

        private DetailedService.Builder buildFrom(final DetailedService req) {
            this.service = req.service;
            this.node = req.node;
            this.drive = req.drive;
            this.drives = req.drives;

            return this;
        }

        public DetailedService.Builder service(final Service service) {
            this.service = service;
            return this;
        }

        public DetailedService.Builder node(final Node node) {
            this.node = node;
            return this;
        }

        public DetailedService.Builder optionalDrive(final Drive drive) {
            this.drive = (drive == null) ? Optional.<Drive>empty() : Optional.of(drive);
            return this;
        }

        public DetailedService.Builder drives(final Drive[] drives) {
            this.drives = drives;
            return this;
        }

    }
}
