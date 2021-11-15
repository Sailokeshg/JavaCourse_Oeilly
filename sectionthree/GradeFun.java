package sectionthree;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        char grade;
        System.out.println("Enter a  grade");
        grade=sc.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Grear job");
                break;
            case 'B':
            case  'b':
                System.out.println("Good job ");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better ");
                break;
            case 'D':
            case 'd':
                System.out.println("You may fail ");
                break;
            case 'E':
            case 'e':
                System.out.println("You've failed ");
                break;
            default:System.out.println("Invalid grade ");

        }
    }
}
