package com.sectionthree;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args){
        Random random = new Random();
        int myRandomNumber;
        myRandomNumber=random.nextInt();
        System.out.println("numbrer is " + myRandomNumber);

        myRandomNumber=random.nextInt(1000);
        System.out.println("0 through 999 is " + myRandomNumber);

        myRandomNumber=random.nextInt(1000)+1;
        System.out.println("1 through 1000 is \t" + myRandomNumber);
    }
}
