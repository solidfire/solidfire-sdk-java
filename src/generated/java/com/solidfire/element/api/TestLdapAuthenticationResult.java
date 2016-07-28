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
 * The object returned by the "TestLdapAuthentication" API Service call.
 **/
public class TestLdapAuthenticationResult  implements Serializable  {

    private static final long serialVersionUID = 529086387L;

    @SerializedName("groups") private final String[] groups;
    @SerializedName("userDN") private final String userDN;

    /**
     * The object returned by the "TestLdapAuthentication" API Service call.
     * @param groups [required] List of LDAP groups that the tested user is a member of.
     * @param userDN [required] The tested user&#39;s full LDAP distinguished name.
     * @since 7.0
     **/
    @Since("7.0")
    public TestLdapAuthenticationResult(String[] groups, String userDN) {
        this.groups = groups;
        this.userDN = userDN;
    }


    /**
     * List of LDAP groups that the tested user is a member of.
     **/
    public String[] getGroups() {
        return this.groups;
    }

    /**
     * The tested user&#39;s full LDAP distinguished name.
     **/
    public String getUserDN() {
        return this.userDN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestLdapAuthenticationResult that = (TestLdapAuthenticationResult) o;
        

        return Objects.deepEquals( groups , that.groups )
            && Objects.equals( userDN , that.userDN );
    }

    @Override
    public int hashCode() {
        return Objects.hash( groups, userDN );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groups : ").append(Arrays.toString(groups)).append(",");
        sb.append(" userDN : ").append(userDN);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private String[] groups;
        private String userDN;

        private Builder() { }

        public TestLdapAuthenticationResult build() {
            return new TestLdapAuthenticationResult (
                         this.groups,
                         this.userDN            );
        }

        private TestLdapAuthenticationResult.Builder buildFrom(final TestLdapAuthenticationResult req) {
            this.groups = req.groups;
            this.userDN = req.userDN;

            return this;
        }

        public TestLdapAuthenticationResult.Builder groups(final String[] groups) {
            this.groups = groups;
            return this;
        }

        public TestLdapAuthenticationResult.Builder userDN(final String userDN) {
            this.userDN = userDN;
            return this;
        }

    }

}
