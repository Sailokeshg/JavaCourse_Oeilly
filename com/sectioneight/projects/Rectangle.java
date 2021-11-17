package com.sectioneight.projects;

public class Rectangle {
    private double length;
    private double width;

    private static int numberOfRectangles;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numberOfRectangles++;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
