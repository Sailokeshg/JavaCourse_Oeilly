package com.sectionseven;

public class BookDemo {
    public static void main(String[] args) {
        Book harryPotter = new Book("rowling", "HarryPotter", "Fictional", 830);
        Book letUsC = new Book("Yashavant", "Let Us C", "Programming", 400);

        harryPotter.printBookDetails();
        letUsC.printBookDetails();
//        printBookDetails(harryPotter);
//        printBookDetails(letUsC);
    }
//    public static void printBookDetails(Book bookName){
//        System.out.println(bookName.getTitle());
//        System.out.println("by "+bookName.getAuthor());
//        System.out.println("has "+bookName.getNumberOfPages()
//        + " pages and genre is "+bookName.getGenre());
//        System.out.println("\n");
//    }
}
