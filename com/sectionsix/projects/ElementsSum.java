package com.sectionsix.projects;

import java.util.ArrayList;

public class ElementsSum {
    public static void main(String[] args) {
        ArrayList<Integer> elementsList = new ArrayList<>();
        elementsList.add(10);
        elementsList.add(20);
        elementsList.add(5);
        System.out.println("sum of elements in the list is "+sumofElements(elementsList));
    }

    public static int sumofElements(ArrayList<Integer> elementsList){
        int sum=0;
        for(int element:elementsList){
            sum+=element;
        }
        return sum;
    }
}
