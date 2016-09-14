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

package com.solidfire.element.api;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class represents the CHAP Secret
 */
@SuppressWarnings("serial")
public class CHAPSecret implements Serializable {

    private final String secret;

    public CHAPSecret(String secret) {
        this.secret = secret;
    }

    /**
     * Getter for property 'secret'.
     *
     * @return Value for property 'secret'.
     */
    public final String getSecret() {
        return secret;
    }

    public static CHAPSecret autoGenerate() {
        return AutoGenerate.getInstance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.secret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CHAPSecret that = (CHAPSecret) o;
        return Objects.equals(secret, that.secret);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }


    public static class Builder {

        private String secret;

        /**
         * Do not instantiate Builder.
         */
        private Builder() {
        }

        public CHAPSecret build() {
            return new CHAPSecret(this.secret);
        }

        private CHAPSecret.Builder buildFrom(final CHAPSecret req) {
            this.secret = req.secret;

            return this;
        }

        public CHAPSecret.Builder secret(final String secret) {
            this.secret = secret;
            return this;
        }
    }
}

/**
 * This class represents the AutoGenerate CHAP Secret.
 */
@SuppressWarnings("serial")
final class AutoGenerate extends CHAPSecret {
    private AutoGenerate() {
        super("AUTO-GENERATE-CHAP-SECRET");
    }

    private static class AutoGenerateHolder {
        private static final AutoGenerate INSTANCE = new AutoGenerate();
    }

    public static AutoGenerate getInstance() {
        return AutoGenerateHolder.INSTANCE;
    }
}
