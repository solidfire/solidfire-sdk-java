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
 * 
 **/
public class SnmpV3UsmUser implements Serializable {

    private static final long serialVersionUID = -1624133180L;

    @SerializedName("access") private final String access;
    @SerializedName("name") private final String name;
    @SerializedName("password") private final String password;
    @SerializedName("passphrase") private final String passphrase;
    @SerializedName("secLevel") private final String secLevel;

    /**
     * 
     * @param access [required] 
     * @param name [required] 
     * @param password [required] 
     * @param passphrase [required] 
     * @param secLevel [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public SnmpV3UsmUser(String access, String name, String password, String passphrase, String secLevel) {
        this.name = name;
        this.passphrase = passphrase;
        this.secLevel = secLevel;
        this.access = access;
        this.password = password;
    }

    public String getAccess() {
        return this.access;
    }
    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    public String getPassphrase() {
        return this.passphrase;
    }
    public String getSecLevel() {
        return this.secLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpV3UsmUser that = (SnmpV3UsmUser) o;
        

        return Objects.equals( access , that.access )
            && Objects.equals( name , that.name )
            && Objects.equals( password , that.password )
            && Objects.equals( passphrase , that.passphrase )
            && Objects.equals( secLevel , that.secLevel );
    }

    @Override
    public int hashCode() {
        return Objects.hash( access, name, password, passphrase, secLevel );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" access : ").append(access).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" password : ").append(password).append(",");
        sb.append(" passphrase : ").append(passphrase).append(",");
        sb.append(" secLevel : ").append(secLevel);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
