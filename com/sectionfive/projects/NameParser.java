package com.sectionfive.projects;
import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("What is your full name");
        String fullName =keyBoard.nextLine();
        String firstName;
        String lastName;
        int indexOfSpace =fullName.indexOf(" ");
        firstName = fullName.substring(0, indexOfSpace);
        lastName=fullName.substring(indexOfSpace+1);
        System.out.println("Upper case of first name is "+firstName.toUpperCase());
        System.out.println("Lower case of last name is "+lastName.toLowerCase());
    }
}
