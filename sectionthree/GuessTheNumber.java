package sectionthree;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int myRandomNumber;
        int generatedRandomNumber;
        boolean guessedNumber=false;
        generatedRandomNumber = random.nextInt(100) + 1;

        while (!guessedNumber) {
            System.out.println("Guess the number");
            myRandomNumber = sc.nextInt();
            if (myRandomNumber >= 1 && myRandomNumber <= 100) {
                if (myRandomNumber == generatedRandomNumber) {
                    System.out.println("Congrats you guessed it right");
                    guessedNumber=true;
                } else if (myRandomNumber > generatedRandomNumber) {
                    System.out.println("Your guess was too large");
                } else if (myRandomNumber < generatedRandomNumber) {
                    System.out.println("Your guess was too small");
                }
            } else {
                System.out.println("Your guess was wasted,try a number between 1 and 100 inclusive");
            }
        }
    }
}
