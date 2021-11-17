package com.sectionseven;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        Rectangle rectangleTwo = new Rectangle(5, 10);

        System.out.println("No of rectangles " + Rectangle.getNumberOfRectangles());

        Rectangle rectangleThree;

        System.out.println("After declaring third rectangle " + Rectangle.getNumberOfRectangles());

        rectangleThree = new Rectangle(2, 5);
        System.out.println("After Instantiating third rectangle " + Rectangle.getNumberOfRectangles());

        System.out.println("Area of rectangleone is " + rectangleOne.area());
        System.out.println("Area of rectangletwo is " + rectangleTwo.area());
        System.out.println("Area of rectanglethree is " + rectangleThree.area());
        System.out.println("Perimeter of rectanglethree is " + rectangleThree.perimeter());
    }
}
