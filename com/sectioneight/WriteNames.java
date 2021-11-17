package com.sectioneight;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("sai");
        names.add("lokesh");
        names.add("shashi");
        names.add("arjun");
        names.add("soumya");

        try{
            PrintWriter writer = new PrintWriter("NamesList.txt");
            for(String name:names){
                writer.println(name);
            }
            writer.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("FIle not found");
            System.out.println(ex.getMessage());
        }
    }
}
