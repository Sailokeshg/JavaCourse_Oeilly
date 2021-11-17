package com.sectioneight;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputDemo {
    public static void main(String[] args) {


        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello this is lokesh");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}