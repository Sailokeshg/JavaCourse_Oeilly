package com.sectionsix;

import java.util.Random;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] twoDArray = new int[2][3];
        fillTwoDArray(twoDArray);
        printTwoDArray(twoDArray);
        System.out.println("\n");
        fillTwiceTwoDArray(twoDArray);
        printTwiceTwoDArray(twoDArray);
    }
    public static void fillTwoDArray(int[][] twoDArray){
        Random random = new Random();
        for(int row=0;row<twoDArray.length;row++){
            for(int column=0;column<twoDArray[row].length;column++){
                twoDArray[row][column] = random.nextInt(100);
            }
        }
    }
    public static void printTwoDArray(int[][] twoDArray){
          for(int[] array:twoDArray){
              for(int arrayValues:array){
                  System.out.print(arrayValues+" ");
              }
              System.out.println();
          }
    }
    public static void fillTwiceTwoDArray(int[][] twoDArray){
        Random random = new Random();
        for(int row=0;row<twoDArray.length;row++){
            for(int column=0;column<twoDArray[row].length;column++){
                twoDArray[row][column]=random.nextInt(100);
            }
        }
    }
    public static void printTwiceTwoDArray(int[][] twoDArray){
        for(int[] array:twoDArray){
            for(int arrayValue:array){
                System.out.print(arrayValue*2+" ");
            }
            System.out.println();
        }
    }
}
