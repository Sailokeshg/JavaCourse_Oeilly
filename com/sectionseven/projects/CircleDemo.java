package com.sectionseven.projects;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circleOne = new Circle(5);
        Circle circleTwo = new Circle(10);
        printCircleData(circleOne);
        printCircleData(circleTwo);
    }
    public static void printCircleData(Circle circle){
        System.out.println("Radius is "+circle.getRadius()+
                " Circumference is "+String.format("%.2f",circle.circumference())+
                " And area is "+String.format("%.3f",circle.area()));

    }
}
