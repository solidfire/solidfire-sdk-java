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
 * The volume services on which the volume metadata resides.
 **/
public class MetadataHosts implements Serializable {

    private static final long serialVersionUID = -1399906185L;

    private final Long[] deadSecondaries;
    private final Long[] liveSecondaries;
    private final Long primary;

    /**
     * The volume services on which the volume metadata resides.
     * @param deadSecondaries [required] Secondary metadata (slice) services that are in a dead state.
     * @param liveSecondaries [required] Secondary metadata (slice) services that are currently in a &quot;live&quot; state.
     * @param primary [required] The primary metadata (slice) services hosting the volume.
     * @since 7.0
     **/
    @Since("7.0")
    public MetadataHosts(Long[] deadSecondaries, Long[] liveSecondaries, Long primary) {
        this.deadSecondaries = deadSecondaries;
        this.liveSecondaries = liveSecondaries;
        this.primary = primary;
    }


    /**
     * Secondary metadata (slice) services that are in a dead state.
     **/
    public Long[] getDeadSecondaries() {
        return this.deadSecondaries;
    }

    /**
     * Secondary metadata (slice) services that are currently in a &quot;live&quot; state.
     **/
    public Long[] getLiveSecondaries() {
        return this.liveSecondaries;
    }

    /**
     * The primary metadata (slice) services hosting the volume.
     **/
    public Long getPrimary() {
        return this.primary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataHosts that = (MetadataHosts) o;
        

        return Objects.deepEquals( deadSecondaries , that.deadSecondaries )
            && Objects.deepEquals( liveSecondaries , that.liveSecondaries )
            && Objects.equals( primary , that.primary );
    }

    @Override
    public int hashCode() {

        return Objects.hash( deadSecondaries, liveSecondaries, primary );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" deadSecondaries : ").append(Arrays.toString(deadSecondaries)).append(",");
        sb.append(" liveSecondaries : ").append(Arrays.toString(liveSecondaries)).append(",");
        sb.append(" primary : ").append(primary);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
