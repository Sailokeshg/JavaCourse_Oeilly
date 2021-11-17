package com.sectionseven;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse  = new House(1,2,"Black");

        myHouse.setNumberOfStories(2);
        myHouse.setNumberOfWindows(6);
        myHouse.setColor("blue");

        printHouseData(myHouse);
        printHouseData(yourHouse);
        System.out.println("\n");
        System.out.println("Your house is " + yourHouse.getColor() +
                " has " + yourHouse.getNumberOfStories() + " stories and " +
                yourHouse.getNumberOfWindows() + " Windows");
        System.out.println("My house is " + myHouse.getColor() +
                " has " + myHouse.getNumberOfStories() + " stories and " +
                myHouse.getNumberOfWindows() + " Windows");
    }

    public static  void printHouseData(House house){
        System.out.println("House is " + house.getColor() +
                " has " + house.getNumberOfStories() + " stories and " +
                house.getNumberOfWindows() + " Windows");
    }
}
