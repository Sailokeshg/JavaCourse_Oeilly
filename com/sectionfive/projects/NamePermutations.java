package com.sectionfive.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args) {

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner keyBoard = new Scanner(System.in);
        String firstName;
        String lastName;
        String fullName;
        int indexOfSpace;
        final int NUMBER_OF_NAMES=5;

        for(int i=0;i<NUMBER_OF_NAMES;i++){
            System.out.println("Enter  full names of person "+i+"\t");
            fullName=keyBoard.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0,indexOfSpace);
            lastName = fullName.substring(indexOfSpace+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i< firstNames.size();i++){
            for(int j=0;j< lastNames.size();j++){
                System.out.print(firstNames.get(i)+" ");
                System.out.println(lastNames.get(j));
            }
        }

    }
}
