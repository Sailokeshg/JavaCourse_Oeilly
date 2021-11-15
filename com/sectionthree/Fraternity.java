package com.sectionthree;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args){
        Scanner keyBoard=new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your age and gender");
        age=keyBoard.nextInt();
        gender=keyBoard.next().charAt(0);

        if (age>=19  && gender=='M'){
            System.out.println("You can join fraternity");
        }
        else{
            System.out.println("You can not join fraternity");
        }
    }

}
