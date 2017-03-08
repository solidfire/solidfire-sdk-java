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
 * ListClusterAdminsRequest  
 * ListClusterAdmins returns the list of all cluster administrators for the cluster. There can be several cluster administrators that have different levels of permissions. There can be only one primary cluster administrator in the system. The primary Cluster Admin is the administrator that was created when the cluster was created. LDAP administrators can also be created when setting up an LDAP system on the cluster.
 **/

public class ListClusterAdminsRequest implements Serializable {

    public static final long serialVersionUID = 8775773498631788059L;
    @SerializedName("showHidden") private Optional<Boolean> showHidden;

    // empty constructor
    @Since("7.0")
    public ListClusterAdminsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListClusterAdminsRequest(
        Optional<Boolean> showHidden
    )
    {
        this.showHidden = (showHidden == null) ? Optional.<Boolean>empty() : showHidden;
    }

    /** 
     * 
     **/
    public Optional<Boolean> getShowHidden() { return this.showHidden; }
    public void setShowHidden(Optional<Boolean> showHidden) { 
        this.showHidden = (showHidden == null) ? Optional.<Boolean>empty() : showHidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterAdminsRequest that = (ListClusterAdminsRequest) o;

        return 
            Objects.equals(showHidden, that.showHidden);
    }

    @Override
    public int hashCode() {
        return Objects.hash( showHidden );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("showHidden", showHidden);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != showHidden && showHidden.isPresent()){
            sb.append(" showHidden : ").append(showHidden).append(",");
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
        private Optional<Boolean> showHidden;

        private Builder() { }

        public ListClusterAdminsRequest build() {
            return new ListClusterAdminsRequest (
                         this.showHidden);
        }

        private ListClusterAdminsRequest.Builder buildFrom(final ListClusterAdminsRequest req) {
            this.showHidden = req.showHidden;

            return this;
        }

        public ListClusterAdminsRequest.Builder optionalShowHidden(final Boolean showHidden) {
            this.showHidden = (showHidden == null) ? Optional.<Boolean>empty() : Optional.of(showHidden);
            return this;
        }

    }
}
