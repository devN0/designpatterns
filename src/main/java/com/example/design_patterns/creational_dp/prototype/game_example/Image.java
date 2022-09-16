package com.example.design_patterns.creational_dp.prototype.game_example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image implements Cloneable {
    private String name;
    public Image(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
