package sectionthree;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        int sum=0;
        System.out.println("Enter  a non negative integer");
        input=sc.nextInt();
        while(input >=0){
            sum+=input;
            System.out.println("Enter  a non negative integer");
            input=sc.nextInt();
        }
        System.out.println("sum of inputs is "+sum);
        System.out.println("Wrong input");
    }
}
