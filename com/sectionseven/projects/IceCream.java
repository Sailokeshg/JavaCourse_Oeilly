package com.sectionseven.projects;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numberOfScoops;
    private ArrayList<String> toppings = new ArrayList<>();

    public IceCream(String name, int cost, int numberOfScoops) {
        this.name = name;
        this.cost = cost;
        this.numberOfScoops = numberOfScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void printToppings() {
        for ( String topping : toppings ) {
            System.out.println("\t" + topping);
        }
    }
}
