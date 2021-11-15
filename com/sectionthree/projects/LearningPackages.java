package com.sectionthree.projects;

import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int packageNo;
        int courses;
        int totalCost;
        int costPerCourse;
        int baseCost;
        int numIncluded;

        System.out.println("Enter your desired package");
        packageNo=keyBoard.nextInt();

        System.out.println("No of courses enrolled in this month");
        courses=keyBoard.nextInt();

        if(packageNo==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNo==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else{
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }
        if(courses>numIncluded){
           totalCost=baseCost+(courses-numIncluded)*costPerCourse;
        }
        else {
            totalCost=baseCost;
        }
     System.out.println("total cost is $"+totalCost);

    }
}
