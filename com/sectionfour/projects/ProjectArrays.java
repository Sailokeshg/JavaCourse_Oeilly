package com.sectionfour.projects;

import java.util.Scanner;

public class ProjectArrays {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Enter 5 integers");
        for(int i=0;i<myArray.length;i++){
            myArray[i]=keyBoard.nextInt();
        }
        for(int i:myArray){
            System.out.print(i*2+"\t");
        }
    }
}
