package com.sectionfour.projects;

import java.util.Scanner;

public class ProjectParallelArrays {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];
        for(int i=0;i<names.length;i++){
            System.out.println("Enter name of person:");
            String input =keyBoard.nextLine();
            names[i]=input;

            System.out.println("Enter an age");
            int age=keyBoard.nextInt();
            ages[i]=age;
            keyBoard.nextLine();
        }
        for(int i=0;i<names.length;i++){
            System.out.println("Age of "+names[i]+" is "+ages[i]);
        }
    }
}
