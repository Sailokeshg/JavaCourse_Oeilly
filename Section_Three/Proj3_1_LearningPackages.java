package Section_Three;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pkgno,courses,totalCost,costPerCourse,baseCost;
        int numIncluded;

        System.out.println("Enter your desired package");
        pkgno=sc.nextInt();

        System.out.println("No of courses enrolled in this month");
        courses=sc.nextInt();

        if(pkgno==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(pkgno==2){
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
