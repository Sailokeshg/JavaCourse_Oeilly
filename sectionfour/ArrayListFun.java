package sectionfour;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Sai");
        namesList.add("Lokesh");

//        for (String st : namesList) {
//            System.out.print(st+"\t");
//        }

        for(int i=0;i<namesList.size();i++){
            System.out.println(namesList.get(i));
        }
    }
}