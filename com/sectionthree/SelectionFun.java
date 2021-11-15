package com.sectionthree;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args){
        Scanner keyBoard =new Scanner(System.in);
        int age;

        System.out.println("Welcome to the pub");

        System.out.println("Enter your age");
        age=keyBoard.nextInt();

        if(age>=21){
            System.out.println("You can have your drinks");
        }
        else if(age>=16){
            System.out.println("You can have your coke");
            System.out.println("Atleast you can drive");

        }
        else {
            System.out.println("You can have your coke");
        }

        System.out.println("Thanks for coming to the pub");
    }
}
