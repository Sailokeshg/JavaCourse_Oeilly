package Section_Three;

import java.util.Scanner;

public class RepetetionFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("ENter a non negative integer");
        input=sc.nextInt();

        while (input>=0)
        {
            System.out.println(input);
            System.out.println("Enter a non negative integer");
            input=sc.nextInt();
        }
        System.out.println("Done!");
    }
}
