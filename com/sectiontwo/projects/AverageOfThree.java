package com.sectiontwo.projects;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args){
        Double varOne;
        Double varTwo;
        Double varThree;
        System.out.println("Enter three real numbers");
        Scanner keyBoard=new Scanner(System.in);

        varOne=keyBoard.nextDouble();
        varTwo= keyBoard.nextDouble();
        varThree= keyBoard.nextDouble();

        Double average=(varOne+varTwo+varThree)/3;
        System.out.println("Average is " +average);

    }
}
