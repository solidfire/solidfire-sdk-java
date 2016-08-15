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

package com.solidfire.serialization;

import com.google.gson.*;
import com.solidfire.element.api.CHAPSecret;

import java.lang.reflect.Type;

/**
 * Handles serializing CHAPSecret objects.
 */
public class CHAPSecretAdaptor implements JsonSerializer<CHAPSecret>, JsonDeserializer<CHAPSecret> {

    /**
     * Gets the Class that this adapter serializes.
     *
     * @return The serializable Class.
     */
    @SuppressWarnings("rawtypes")
    static public Class serializingClass() {
        return CHAPSecret.class;
    }

    /**
     * Serializes a CHAPSecret object.
     *
     * @param chapSecret the value to serialize.
     * @param type       the type of the source object.
     * @param context    Context used for serialization.
     * @return A tree of JsonElements corresponding to the serialized form of optional.
     */
    public JsonElement serialize(CHAPSecret chapSecret, Type type, JsonSerializationContext context) {
        if (chapSecret == null ) {
            // Nothing to serialize
            return null;
        }

        return context.serialize(chapSecret.getSecret());
    }

    @Override
    public CHAPSecret deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new CHAPSecret(json.getAsString());
    }
}
