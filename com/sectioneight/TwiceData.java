package com.sectioneight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner input;


        try {
            input = new Scanner(new File("nums.txt"));
            PrintWriter writer = new PrintWriter("twice_nums.txt");
            int numbers;
            while (input.hasNext()) {
                numbers = input.nextInt();
                writer.println(numbers * 2);
            }
            input.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
