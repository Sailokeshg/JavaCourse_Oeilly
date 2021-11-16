package com.sectionfive;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("sai");
        name.append("reddy");
        System.out.println(name);

        name.insert(3,"lokesh");
        System.out.println(name);

        name.replace(14,28,"is hardworking");
        System.out.println(name);

        name.delete(14,28);
        System.out.println(name);

        name.replace(0,3,"Dr.");
        System.out.println(name);


    }
}
