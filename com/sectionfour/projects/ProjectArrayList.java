package com.sectionfour.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectArrayList {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        System.out.println("Enter non negative integers or -ve to exit");
        Scanner keyBoard = new Scanner(System.in);
        double input=keyBoard.nextDouble();

        while (input>=0){
            myList.add(input);
            System.out.println("Enter non negative integers or -ve to exit");
            input=keyBoard.nextDouble();
        }
        for(int i= myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
