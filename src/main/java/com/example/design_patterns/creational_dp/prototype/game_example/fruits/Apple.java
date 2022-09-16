package com.example.design_patterns.creational_dp.prototype.game_example.fruits;

import com.example.design_patterns.creational_dp.prototype.game_example.Color;
import com.example.design_patterns.creational_dp.prototype.game_example.enums.FruitType;

public class Apple extends Fruit {
    public Apple(FruitType fruitType, String name, Color color, int health, boolean isPoisonous) {
        super(fruitType, name, color, health, isPoisonous);
    }
}
