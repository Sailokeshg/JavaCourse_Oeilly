package com.sectiontwo;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double doubleInput;

        System.out.println("What is your name");
        name=keyboard.nextLine();

        System.out.println("What is your age");
        age=keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is your real number");
        doubleInput=keyboard.nextDouble();
        keyboard.nextLine();
        doubleInput*=2;

        System.out.println("Where do you live");
        String city=keyboard.nextLine();

        System.out.println("Hell0 "+ name);
        System.out.println("Age is  "+ age);
        System.out.println("City is "+ city);
        System.out.println("Twice your number is "+ doubleInput);

    }
}
