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
 * The object returned by the "ModifySchedule" API Service call.
 **/
public class ModifyScheduleResult  implements Serializable  {

    private static final long serialVersionUID = 46176850L;

    @SerializedName("schedule") private final Schedule schedule;

    /**
     * The object returned by the "ModifySchedule" API Service call.
     * @param schedule [required] Schedule attributes with modifications.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyScheduleResult(Schedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Schedule attributes with modifications.
     **/
    public Schedule getSchedule() {
        return this.schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyScheduleResult that = (ModifyScheduleResult) o;
        

        return Objects.equals( schedule , that.schedule );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) schedule );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" schedule : ").append(schedule);
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
        private Schedule schedule;

        private Builder() { }

        public ModifyScheduleResult build() {
            return new ModifyScheduleResult (
                         this.schedule            );
        }

        private ModifyScheduleResult.Builder buildFrom(final ModifyScheduleResult req) {
            this.schedule = req.schedule;

            return this;
        }

        public ModifyScheduleResult.Builder schedule(final Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

    }

}
