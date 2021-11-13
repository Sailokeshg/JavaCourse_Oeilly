package Section_Two.project1;

import java.util.Scanner;

public class Proj2_1_AverageofThree {
    public static void main(String[] args){
        Double n1,n2,n3;
        System.out.println("Enter three real numbers");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextDouble();
        n2= sc.nextDouble();
        n3= sc.nextDouble();
        Double average=(n1+n2+n3)/3;
        System.out.println("Average is " +average);


    }
}
