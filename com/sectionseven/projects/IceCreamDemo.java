package com.sectionseven.projects;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream iceCreamOne = new IceCream("Chocolate", 30, 2);
        IceCream iceCreamTwo = new IceCream("Oreo", 30, 3);

        iceCreamOne.addTopping("nuts");
        iceCreamTwo.addTopping("cherries");

        printIceCream(iceCreamOne);
        printIceCream(iceCreamTwo);
    }

    public static void printIceCream(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $" + iceCream.getCost());
        System.out.println("Topped with:");
        iceCream.printToppings();
        System.out.println("\n");
    }
}
