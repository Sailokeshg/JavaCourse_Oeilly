package com.sectionfive;



public class StringMethodsTwo {
    public static void main(String[] args) {
        String myName = "Lokesh Reddy";

        String lower = myName.toLowerCase();
        String upper = myName.toUpperCase();

        int whereIsB = myName.indexOf("R");

        String lastName = myName.substring(7);

        System.out.println("Upper is "+upper);
        System.out.println("Lower is "+lower);
        System.out.println("B is at index  "+whereIsB);
        System.out.println("Last name is "+lastName);

    }
}
