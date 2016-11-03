package com.solidfire.core.client;

import com.solidfire.core.annotation.ConnectionType;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ConnectionTypeUtils {


    public static <T> boolean isValidConnectionType(final T object, final String methodName, final boolean isNode) {
        for (final Method method : object.getClass().getDeclaredMethods()) {
            if (Objects.equals(method.getName(), methodName.substring(0, 1).toLowerCase() + methodName.substring(1))){
                Annotation connectionTypeAnnotation = method.getAnnotation(ConnectionType.class);
                ConnectionType connectionType = (ConnectionType) connectionTypeAnnotation;
                String t = connectionType.value();
                return ((isNode && (Objects.equals(t, "Node") || Objects.equals(t, "Both"))) ||
                        (!isNode && (Objects.equals(t, "Cluster") || Objects.equals(t, "Both"))));
            }
        }
        throw new ApiException("Unable to determine ConnectionType of " + methodName);
    }
}
