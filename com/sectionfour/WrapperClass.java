package com.sectionfour;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args){
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(10);
        myArrayList.add(22);

        for(int listValues:myArrayList){
            System.out.println(listValues);
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
