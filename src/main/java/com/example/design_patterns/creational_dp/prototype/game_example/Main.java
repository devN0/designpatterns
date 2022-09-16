package com.example.design_patterns.creational_dp.prototype.game_example;

import com.example.design_patterns.creational_dp.prototype.game_example.enums.FruitType;
import com.example.design_patterns.creational_dp.prototype.game_example.fruits.Apple;
import com.example.design_patterns.creational_dp.prototype.game_example.fruits.Fruit;
import com.example.design_patterns.creational_dp.prototype.game_example.fruits.Orange;
import com.example.design_patterns.creational_dp.prototype.game_example.registry.FruitRegistry;
import com.example.design_patterns.creational_dp.prototype.game_example.registry.TreeRegistry;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeRegistry treeRegistry = new TreeRegistry();
        FruitRegistry fruitRegistry = new FruitRegistry();

        Fruit apple = new Apple(FruitType.APPLE, "apple", Color.RED, 70, false);
        fruitRegistry.register("apple", apple);
        Fruit orange = new Orange(FruitType.ORANGE, "orange", Color.ORANGE, 90, false);
        fruitRegistry.register("orange", orange);

        List<Fruit> apples = new ArrayList<>();
        List<Fruit> oranges = new ArrayList<>();

        Tree canopy = new Tree(TreeType.CANOPY, FruitType.APPLE, "canopy", new Image("img1.jpg"), 25);
        treeRegistry.register("canopy", canopy);

        Tree tropical = new Tree(TreeType.TROPICAL, FruitType.PINEAPPLE, "tropical", new Image("img2.jpg"), 20);
        treeRegistry.register("tropical", tropical);

        Tree shrub = new Tree(TreeType.SHRUB, FruitType.ORANGE, "shrub", new Image("img3.jpg"), 30);
        treeRegistry.register("shrub", shrub);

//        for(int i = 0; i < canopy.getNoOfFruits(); i++) {
//            try{
//                apples.add((Fruit)apple.clone());
//            } catch(CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//        }

        String[] input = {"canopy", "tropical", "shrub"};
        int size = input.length;

        List<Tree> trees = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            int random = new Random().nextInt(size);
            String str = input[random];
            try{
                Tree tree = treeRegistry.get(str);
                Tree copy = (Tree)tree.clone();
                copy.setColor(Color.GREEN);
                trees.add(copy);
            } catch(IllegalArgumentException | CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        shrub.getImage().setName("new shrub");

        for(Tree tree: trees) {
            System.out.println(tree.getImage().getName());
        }
    }
}
