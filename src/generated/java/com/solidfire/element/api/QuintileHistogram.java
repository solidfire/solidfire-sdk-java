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
 * QuintileHistogram  
 **/

public class QuintileHistogram implements Serializable {

    public static final long serialVersionUID = -7647425647282094506L;
    @SerializedName("Bucket0") private Optional<Long> bucket0;
    @SerializedName("Bucket1To19") private Long bucket1To19;
    @SerializedName("Bucket20To39") private Long bucket20To39;
    @SerializedName("Bucket40To59") private Long bucket40To59;
    @SerializedName("Bucket60To79") private Long bucket60To79;
    @SerializedName("Bucket80To100") private Long bucket80To100;
    @SerializedName("Bucket101Plus") private Optional<Long> bucket101Plus;

    
    // parameterized constructor
    @Since("7.0")
    public QuintileHistogram(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public QuintileHistogram(
        Optional<Long> bucket0,
        Long bucket1To19,
        Long bucket20To39,
        Long bucket40To59,
        Long bucket60To79,
        Long bucket80To100,
        Optional<Long> bucket101Plus
    )
    {
        this.bucket0 = (bucket0 == null) ? Optional.<Long>empty() : bucket0;
        this.bucket1To19 = bucket1To19;
        this.bucket20To39 = bucket20To39;
        this.bucket40To59 = bucket40To59;
        this.bucket60To79 = bucket60To79;
        this.bucket80To100 = bucket80To100;
        this.bucket101Plus = (bucket101Plus == null) ? Optional.<Long>empty() : bucket101Plus;
    }

    /** 
     * Number of samples measured at 0 percent.
     **/
    public Optional<Long> getBucket0() { return this.bucket0; }
   
    public void setBucket0(Optional<Long> bucket0) { 
        this.bucket0 = (bucket0 == null) ? Optional.<Long>empty() : bucket0;
    }
    /** 
     * Number of samples measured between 1 and 19 percent.
     **/
    public Long getBucket1To19() { return this.bucket1To19; }
   
    public void setBucket1To19(Long bucket1To19) { 
        this.bucket1To19 = bucket1To19;
    }
    /** 
     * Number of samples measured between 20 and 39 percent.
     **/
    public Long getBucket20To39() { return this.bucket20To39; }
   
    public void setBucket20To39(Long bucket20To39) { 
        this.bucket20To39 = bucket20To39;
    }
    /** 
     * Number of samples measured between 40 and 59 percent.
     **/
    public Long getBucket40To59() { return this.bucket40To59; }
   
    public void setBucket40To59(Long bucket40To59) { 
        this.bucket40To59 = bucket40To59;
    }
    /** 
     * Number of samples measured between 60 and 79 percent.
     **/
    public Long getBucket60To79() { return this.bucket60To79; }
   
    public void setBucket60To79(Long bucket60To79) { 
        this.bucket60To79 = bucket60To79;
    }
    /** 
     * Number of samples measured between 80 and 100 percent.
     **/
    public Long getBucket80To100() { return this.bucket80To100; }
   
    public void setBucket80To100(Long bucket80To100) { 
        this.bucket80To100 = bucket80To100;
    }
    /** 
     * Number of samples measured at greater than 100% percent.
     **/
    public Optional<Long> getBucket101Plus() { return this.bucket101Plus; }
   
    public void setBucket101Plus(Optional<Long> bucket101Plus) { 
        this.bucket101Plus = (bucket101Plus == null) ? Optional.<Long>empty() : bucket101Plus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuintileHistogram that = (QuintileHistogram) o;

        return 
            Objects.equals(bucket0, that.bucket0) && 
            Objects.equals(bucket1To19, that.bucket1To19) && 
            Objects.equals(bucket20To39, that.bucket20To39) && 
            Objects.equals(bucket40To59, that.bucket40To59) && 
            Objects.equals(bucket60To79, that.bucket60To79) && 
            Objects.equals(bucket80To100, that.bucket80To100) && 
            Objects.equals(bucket101Plus, that.bucket101Plus);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bucket0,bucket1To19,bucket20To39,bucket40To59,bucket60To79,bucket80To100,bucket101Plus );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bucket0", bucket0);
        map.put("bucket1To19", bucket1To19);
        map.put("bucket20To39", bucket20To39);
        map.put("bucket40To59", bucket40To59);
        map.put("bucket60To79", bucket60To79);
        map.put("bucket80To100", bucket80To100);
        map.put("bucket101Plus", bucket101Plus);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != bucket0 && bucket0.isPresent()){
            sb.append(" bucket0 : ").append(gson.toJson(bucket0)).append(",");
        }
        else{
            sb.append(" bucket0 : ").append("null").append(",");
        }
        sb.append(" bucket1To19 : ").append(gson.toJson(bucket1To19)).append(",");
        sb.append(" bucket20To39 : ").append(gson.toJson(bucket20To39)).append(",");
        sb.append(" bucket40To59 : ").append(gson.toJson(bucket40To59)).append(",");
        sb.append(" bucket60To79 : ").append(gson.toJson(bucket60To79)).append(",");
        sb.append(" bucket80To100 : ").append(gson.toJson(bucket80To100)).append(",");
        if(null != bucket101Plus && bucket101Plus.isPresent()){
            sb.append(" bucket101Plus : ").append(gson.toJson(bucket101Plus)).append(",");
        }
        else{
            sb.append(" bucket101Plus : ").append("null").append(",");
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
        private Optional<Long> bucket0;
        private Long bucket1To19;
        private Long bucket20To39;
        private Long bucket40To59;
        private Long bucket60To79;
        private Long bucket80To100;
        private Optional<Long> bucket101Plus;

        private Builder() { }

        public QuintileHistogram build() {
            return new QuintileHistogram (
                         this.bucket0,
                         this.bucket1To19,
                         this.bucket20To39,
                         this.bucket40To59,
                         this.bucket60To79,
                         this.bucket80To100,
                         this.bucket101Plus);
        }

        private QuintileHistogram.Builder buildFrom(final QuintileHistogram req) {
            this.bucket0 = req.bucket0;
            this.bucket1To19 = req.bucket1To19;
            this.bucket20To39 = req.bucket20To39;
            this.bucket40To59 = req.bucket40To59;
            this.bucket60To79 = req.bucket60To79;
            this.bucket80To100 = req.bucket80To100;
            this.bucket101Plus = req.bucket101Plus;

            return this;
        }

        public QuintileHistogram.Builder optionalBucket0(final Long bucket0) {
            this.bucket0 = (bucket0 == null) ? Optional.<Long>empty() : Optional.of(bucket0);
            return this;
        }

        public QuintileHistogram.Builder bucket1To19(final Long bucket1To19) {
            this.bucket1To19 = bucket1To19;
            return this;
        }

        public QuintileHistogram.Builder bucket20To39(final Long bucket20To39) {
            this.bucket20To39 = bucket20To39;
            return this;
        }

        public QuintileHistogram.Builder bucket40To59(final Long bucket40To59) {
            this.bucket40To59 = bucket40To59;
            return this;
        }

        public QuintileHistogram.Builder bucket60To79(final Long bucket60To79) {
            this.bucket60To79 = bucket60To79;
            return this;
        }

        public QuintileHistogram.Builder bucket80To100(final Long bucket80To100) {
            this.bucket80To100 = bucket80To100;
            return this;
        }

        public QuintileHistogram.Builder optionalBucket101Plus(final Long bucket101Plus) {
            this.bucket101Plus = (bucket101Plus == null) ? Optional.<Long>empty() : Optional.of(bucket101Plus);
            return this;
        }

    }
}
