package com.example.design_patterns.creational_dp.prototype.game_example.registry;

import com.example.design_patterns.creational_dp.prototype.game_example.fruits.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitRegistry {
    private Map<String, Fruit> registry = new HashMap<>();

    public void register(String key, Fruit val) {
        registry.put(key, val);
    }

    public Fruit get(String key) throws IllegalArgumentException {
        if(!registry.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return registry.get(key);
    }
}
