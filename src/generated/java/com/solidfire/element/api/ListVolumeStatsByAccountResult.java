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
 * The object returned by the "ListVolumeStatsByAccount" API Service call.
 **/
public class ListVolumeStatsByAccountResult  implements Serializable  {

    private static final long serialVersionUID = -146299878L;

    @SerializedName("volumeStats") private final VolumeStats[] volumeStats;

    /**
     * The object returned by the "ListVolumeStatsByAccount" API Service call.
     * @param volumeStats [required] List of account activity information.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVolumeStatsByAccountResult(VolumeStats[] volumeStats) {
        this.volumeStats = volumeStats;
    }


    /**
     * List of account activity information.
     * <br/><b>Note</b>: The volumeID member is 0 for each entry, as the values represent the summation of all volumes owned by the account.
     **/
    public VolumeStats[] getVolumeStats() {
        return this.volumeStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsByAccountResult that = (ListVolumeStatsByAccountResult) o;
        

        return Objects.deepEquals( volumeStats , that.volumeStats );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeStats );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeStats : ").append(Arrays.toString(volumeStats));
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
        private VolumeStats[] volumeStats;

        private Builder() { }

        public ListVolumeStatsByAccountResult build() {
            return new ListVolumeStatsByAccountResult (
                         this.volumeStats            );
        }

        private ListVolumeStatsByAccountResult.Builder buildFrom(final ListVolumeStatsByAccountResult req) {
            this.volumeStats = req.volumeStats;

            return this;
        }

        public ListVolumeStatsByAccountResult.Builder volumeStats(final VolumeStats[] volumeStats) {
            this.volumeStats = volumeStats;
            return this;
        }

    }

}
