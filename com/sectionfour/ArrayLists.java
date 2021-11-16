package com.sectionfour;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Sai");
        namesList.add("Lokesh");

        for(int i=0;i<namesList.size();i++){
            System.out.println(namesList.get(i));
        }
    }
}