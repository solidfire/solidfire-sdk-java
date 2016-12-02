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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * The SNMP v3 usmUser object is used with the API method SetSnmpInfo to configure SNMP on the cluster.
 **/

public class SnmpV3UsmUser implements Serializable {

    public static final long serialVersionUID = 4809109003511391850L;
    @SerializedName("access") private String access;
    @SerializedName("name") private String name;
    @SerializedName("password") private String password;
    @SerializedName("passphrase") private String passphrase;
    @SerializedName("secLevel") private String secLevel;

    // empty constructor
    @Since("7.0")
    public SnmpV3UsmUser() {}

    // parameterized constructor
    @Since("7.0")
    public SnmpV3UsmUser(
        String access,
        String name,
        String password,
        String passphrase,
        String secLevel
    )
    {
        this.access = access;
        this.name = name;
        this.password = password;
        this.passphrase = passphrase;
        this.secLevel = secLevel;
    }

    /** 
     * <br/><b>rouser</b>: read-only access.*
     * <br/><b>rwuser</b>: for read-write access.
     * <br/><b>rosys</b>: for read-only access to a restricted set of system information
     * *SolidFire recommends that all USM users be set to "rouser" access, because all SolidFire MIB objects are read-only.
     **/
    public String getAccess() { return this.access; }
    public void setAccess(String access) { 
        this.access = access;
    }
    /** 
     * The name of the user. Must contain at least one character, but no more than 32 characters. Blank spaces are not allowed.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The password of the user. Must be between 8 and 255 characters long (inclusive). Blank spaces are not allowed. Required if "secLevel" is "auth" or "priv."
     **/
    public String getPassword() { return this.password; }
    public void setPassword(String password) { 
        this.password = password;
    }
    /** 
     * The passphrase of the user. Must be between 8 and 255 characters long (inclusive). Blank spaces are not allowed. Required if "secLevel" is "priv."
     **/
    public String getPassphrase() { return this.passphrase; }
    public void setPassphrase(String passphrase) { 
        this.passphrase = passphrase;
    }
    /** 
     * <br/><b>noauth</b>: No password or passphrase is required.
     * <br/><b>auth</b>: A password is required for user access.
     * <br/><b>priv</b>: A password and passphrase is required for user access.
     **/
    public String getSecLevel() { return this.secLevel; }
    public void setSecLevel(String secLevel) { 
        this.secLevel = secLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpV3UsmUser that = (SnmpV3UsmUser) o;

        return 
            Objects.equals(access, that.access) &&
            Objects.equals(name, that.name) &&
            Objects.equals(password, that.password) &&
            Objects.equals(passphrase, that.passphrase) &&
            Objects.equals(secLevel, that.secLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( access, name, password, passphrase, secLevel );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("access", access);
        map.put("name", name);
        map.put("password", password);
        map.put("passphrase", passphrase);
        map.put("secLevel", secLevel);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" access : ").append(access).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" password : ").append(password).append(",");
        sb.append(" passphrase : ").append(passphrase).append(",");
        sb.append(" secLevel : ").append(secLevel).append(",");
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
        private String access;
        private String name;
        private String password;
        private String passphrase;
        private String secLevel;

        private Builder() { }

        public SnmpV3UsmUser build() {
            return new SnmpV3UsmUser (
                         this.access,
                         this.name,
                         this.password,
                         this.passphrase,
                         this.secLevel);
        }

        private SnmpV3UsmUser.Builder buildFrom(final SnmpV3UsmUser req) {
            this.access = req.access;
            this.name = req.name;
            this.password = req.password;
            this.passphrase = req.passphrase;
            this.secLevel = req.secLevel;

            return this;
        }

        public SnmpV3UsmUser.Builder access(final String access) {
            this.access = access;
            return this;
        }

        public SnmpV3UsmUser.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public SnmpV3UsmUser.Builder password(final String password) {
            this.password = password;
            return this;
        }

        public SnmpV3UsmUser.Builder passphrase(final String passphrase) {
            this.passphrase = passphrase;
            return this;
        }

        public SnmpV3UsmUser.Builder secLevel(final String secLevel) {
            this.secLevel = secLevel;
            return this;
        }

    }
}
