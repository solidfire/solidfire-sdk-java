package com.solidfire.core.client;

import java.util.HashMap;
import java.util.Map;

public class Attributes extends HashMap<String, Object> {
    public static final long serialVersionUID = 6182745512723579971L;

    public Attributes(Map<String, Object> tree){
        this.putAll(tree);
    }
    public Attributes(){}
}
