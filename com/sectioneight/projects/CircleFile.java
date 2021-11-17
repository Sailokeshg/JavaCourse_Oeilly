package com.sectioneight.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        fillArrayList(circleList);
        printArrayList(circleList);
    }

    public static void fillArrayList(ArrayList<Circle> circles){
        Scanner infile;
        try {
            double radii;
            infile=new Scanner(new File("circle_data.txt"));
            while (infile.hasNext()){
                radii=infile.nextDouble();
                Circle circle = new Circle(radii);
                circles.add(circle);
            }
            infile.close();

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void printArrayList(ArrayList<Circle> circles){
        PrintWriter writer;
        try {
            writer = new PrintWriter("circles_ouput.txt");
            for ( Circle circle : circles ) {
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Circumference: " + String.format("%.3f", circle.circumference()));
                System.out.println("Area: " + String.format("%.3f", circle.area()));
                System.out.println("\n");

                writer.println("Radius: " + circle.getRadius());
                writer.println("Circumference: " + String.format("%.3f", circle.circumference()));
                writer.println("Area: " + String.format("%.3f", circle.area()));
                writer.println("\n");
            }
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
