package com.sectionsix;

public class MethodCalls {
    public static void main(String[] args) {
        System.out.println("sum of the values is "+showTheSum());
    }
    public static int showTheSum(){
        int result=getTheSum(2,3);
        return result;
    }
    public static int getTheSum(int valueOne,int valueTwo){
        return valueOne+valueOne;
    }
}
