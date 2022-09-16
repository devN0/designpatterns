package com.example.design_patterns.creational_dp.prototype.game_example.fruits;

import com.example.design_patterns.creational_dp.prototype.game_example.Color;
import com.example.design_patterns.creational_dp.prototype.game_example.enums.FruitType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Fruit implements Cloneable {
    private FruitType type;
    private String name;
    private Color color;
    private int health;
    private boolean isPoisonous;

    public Fruit(FruitType fruitType, String name, Color color, int health, boolean isPoisonous) {
        this.type = fruitType;
        this.name = name;
        this.color = color;
        this.health = health;
        this.isPoisonous = isPoisonous;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
