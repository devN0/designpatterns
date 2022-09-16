package com.example.design_patterns.creational_dp.prototype.game_example.registry;

import com.example.design_patterns.creational_dp.prototype.game_example.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeRegistry {
    private Map<String, Tree> registry = new HashMap();

    public void register(String key, Tree val) {
        registry.put(key, val);
    }

    public Tree get(String key) throws IllegalArgumentException {
        if(!registry.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return registry.get(key);
    }
}
