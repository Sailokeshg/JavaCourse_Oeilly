package com.sectionthree;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int input;
        int sum=0;
        System.out.println("Enter  a non negative integer");
        input=keyBoard.nextInt();
        while(input >=0){
            sum+=input;
            System.out.println("Enter  a non negative integer");
            input=keyBoard.nextInt();
        }
        System.out.println("sum of inputs is "+sum);
        System.out.println("Wrong input");
    }
}
