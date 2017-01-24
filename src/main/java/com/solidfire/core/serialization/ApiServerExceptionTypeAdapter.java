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
 *
 */
package com.solidfire.core.serialization;

import com.solidfire.gson.TypeAdapter;
import com.solidfire.gson.stream.JsonReader;
import com.solidfire.gson.stream.JsonToken;
import com.solidfire.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The Type Adapter responsible for transforming JSON error objects into an ApiServierException
 */
public class ApiServerExceptionTypeAdapter extends TypeAdapter<com.solidfire.core.client.ApiServerException> {

    /**
     * Gets the Class that this adapter serializes.
     *
     * @return The serializable Class.
     */
    @SuppressWarnings("rawtypes")
    static public Class serializingClass() {
        return com.solidfire.core.client.ApiServerException.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(JsonWriter out, com.solidfire.core.client.ApiServerException value) throws IOException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public com.solidfire.core.client.ApiServerException read(JsonReader in) throws IOException {

        String name = null;
        String code = null;
        String message = null;

        in.beginObject();
        while (in.hasNext()) {
            if (in.peek() != JsonToken.NAME) {
                in.skipValue();
                continue;
            }

            switch (in.nextName()) {
                case "name":
                    name = in.nextString();
                    break;
                case "code":
                    code = in.nextString();
                    break;
                case "message":
                    message = in.nextString();
                    break;
            }
        }
        in.endObject();

        return new com.solidfire.core.client.ApiServerException(name, code, message);
    }
}
