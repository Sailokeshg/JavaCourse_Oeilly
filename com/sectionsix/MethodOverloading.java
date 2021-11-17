package com.sectionsix;

public class MethodOverloading {
    public static void main(String[] args) {
        int resultOne = getResult(5);
        int resultTwo = getResult(2,3);
        int resultThree = getResult(2,"4");
        String resultFour =getResult("sai","lokesh");
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
    }
    public static int getResult(int value) {
        return value*2;
    }
    public static int getResult(int numOne,int numTwo){
        return numOne*numTwo;
    }
    public static int getResult(int value,String text){
        return value*Integer.parseInt(text);
    }
    public static String getResult(String stringOne,String stringTwo){
        return stringOne+stringTwo;
    }


}
