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
 * Created by Jason Ryan Womack on 7/18/16.
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

    @Override
    public String toString() {
        return this.secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CHAPSecret that = (CHAPSecret) o;
        return Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret);
    }
}

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
