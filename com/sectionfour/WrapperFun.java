package com.sectionfour;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args){
        ArrayList<Integer> myAl = new ArrayList<>();

        myAl.add(10);
        myAl.add(22);

        for(int i:myAl){
            System.out.println(i);
        }
        String someValue="120";
        int numericValue = Integer.parseInt(someValue);
        numericValue+=10;
        System.out.println(numericValue);

        String doubleString = "3.14159";
        Double converted = Double.parseDouble(doubleString);
        System.out.println(converted+1);
    }
}
