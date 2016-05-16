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
 * The object returned by the "CreateSnapshot" API Service call.
 **/
public class CreateSnapshotResult implements Serializable {

    private static final long serialVersionUID = -1721184563L;

    private final Long snapshotID;
    private final String checksum;

    /**
     * The object returned by the "CreateSnapshot" API Service call.
     * @param snapshotID [required] ID of the newly-created snapshot.
     * @param checksum [required] A string that represents the correct digits in the stored snapshot.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateSnapshotResult(Long snapshotID, String checksum) {
        this.snapshotID = snapshotID;
        this.checksum = checksum;
    }


    /**
     * ID of the newly-created snapshot.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public String getChecksum() {
        return this.checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapshotResult that = (CreateSnapshotResult) o;
        

        return Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( checksum , that.checksum );
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID, checksum );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" checksum : ").append(checksum);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
