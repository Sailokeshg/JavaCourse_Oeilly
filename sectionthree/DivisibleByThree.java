package sectionthree;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter an integer");
        input=sc.nextInt();
        if(input%3==0){
            System.out.println(input+ " is divisible by 3");
        }
        else {
            System.out.println(input+ " is not  divisible by 3");
        }
    }
}
