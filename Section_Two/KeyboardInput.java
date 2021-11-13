package Section_Two;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double doubleinput;

        System.out.println("What is your name");
        name=keyboard.nextLine();

        System.out.println("What is your age");
        age=keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is your real number");
        doubleinput=keyboard.nextDouble();
        keyboard.nextLine();
        doubleinput*=2;

        System.out.println("Where do you live");
        String city=keyboard.nextLine();

        System.out.println("Hell0 "+ name);
        System.out.println("Age is  "+ age);
        System.out.println("City is "+ city);
        System.out.println("Twice your number is "+ doubleinput);

    }
}
