package com.sectionsix;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(4);
        System.out.println("sum of numbers is "+sumOfTwo(2,6));
        System.out.println("square of input is "+ squareOfInput(2.5));
    }
    public static  void printHello(){
        System.out.println("Hello");
    }
    public static  void printNumber(int numOne){
        System.out.println("Number is "+numOne);
    }
    public static int  sumOfTwo(int numOne,int numTwo){
        return numOne+numTwo;
    }
    public  static double squareOfInput(double input){
        return input*input;
    }
}
