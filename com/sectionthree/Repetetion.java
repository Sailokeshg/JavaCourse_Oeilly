package com.sectionthree;

import java.util.Scanner;

public class Repetetion {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int input;
        System.out.println("Enter a non negative integer");
        input=keyBoard.nextInt();

        while (input>=0)
        {
            System.out.println(input);
            System.out.println("Enter a non negative integer");
            input=keyBoard.nextInt();
        }
        System.out.println("Done!");
    }
}
