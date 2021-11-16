package com.sectionfive;

public class StringMethodsOne {
    public static void main(String[] args) {
        String nameOne ="John doe";
        String nameTwo="John dow";
        for(int i=0;i<nameOne.length();i++){
            System.out.print(nameOne.charAt(i)+"\t");
        }
        System.out.println("\n");
        if(nameOne.equals(nameTwo)){
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are not equal");
        }

        if(nameOne.compareTo(nameTwo)>0){
            System.out.println("nameOne > nameTwo");
        }
        else {
            System.out.println("nameOne < nameTwo");
        }
    }
}
