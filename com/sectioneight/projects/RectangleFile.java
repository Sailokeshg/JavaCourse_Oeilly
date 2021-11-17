package com.sectioneight.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectangleList) {
        Scanner infile;
        try {
            infile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;
            while (infile.hasNext()) {
                length = infile.nextDouble();
                width = infile.nextDouble();
                temp = new Rectangle(length, width);
                rectangleList.add(temp);
            }
            infile.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printRectangles(ArrayList<Rectangle> rectangle) {

        for ( Rectangle rect : rectangle ) {
            System.out.println("length: " + rect.getLength());
            System.out.println("width: " + rect.getWidth());
            System.out.println("Area: " + rect.area());
            System.out.println("Perimeter: " + rect.perimeter());
            System.out.println("\n");
        }
    }
}
