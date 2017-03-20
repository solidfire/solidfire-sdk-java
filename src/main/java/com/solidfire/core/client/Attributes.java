package com.solidfire.core.client;

import com.solidfire.gson.internal.LinkedTreeMap;

import java.util.HashMap;

public class Attributes extends HashMap<String, Object> {
    public static final long serialVersionUID = 6182745512723579971L;

    public Attributes(LinkedTreeMap<String, Object> tree){
        this.putAll(tree);
    }
    public Attributes(){}
}
