package com.example.design_patterns.creational_dp.prototype.game_example;

import com.example.design_patterns.creational_dp.prototype.game_example.enums.FruitType;
import com.example.design_patterns.creational_dp.prototype.game_example.fruits.Fruit;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Tree implements Cloneable {
    private TreeType treeType;
    private String name;
    private Color color;
    private double height;
    private double width;
    private FruitType fruitType;
    private int noOfFruits;
    private List<Fruit> fruits = new ArrayList<>();
    private Image image;

    public Tree() {}
    public Tree(TreeType type, FruitType fruitType, String name, Image image, int noOfFruits) {
        this.treeType = type;
        this.fruitType = fruitType;
        this.name = name;
        this.image = image;
        this.noOfFruits = noOfFruits;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Approach 1
//        simply doing super.clone() works fine if we only have primitive attributes, but if we have objects as attributes then this will not work as instead of making a copy of the object type super.clone() will set it to the original's reference.
//        return super.clone();

//        Approach 2
//        Tree copy = new Tree();
//        copy.name = this.name;
//        copy.type = this.type;
//        copy.image = this.image;

//        Approach 3 - solution
        Tree copy = (Tree)super.clone();
        copy.setImage((Image)this.image.clone());

        return copy;
    }
}
