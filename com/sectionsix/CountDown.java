package com.sectionsix;

public class CountDown {
    public static void main(String[] args) {
   // countDownFrom(10);
    countUpTo(2,10);
    }
    public static void countDownFrom(int value){
        if(value>0){
            System.out.print(value+"\t");
            countDownFrom(value-1);
        }
    }
    public static void countUpTo(int from,int to){
        if(from<=to){
            System.out.print(from+"\t");
            countUpTo(from+1,to);
        }
    }
}
