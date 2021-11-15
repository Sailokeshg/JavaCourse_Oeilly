package sectiontwo.project1;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args){
        Double varOne;
        Double varTwo;
        Double varThree;
        System.out.println("Enter three real numbers");
        Scanner sc=new Scanner(System.in);
        varOne=sc.nextDouble();
        varTwo= sc.nextDouble();
        varThree= sc.nextDouble();
        Double average=(varOne+varTwo+varThree)/3;
        System.out.println("Average is " +average);

    }
}
