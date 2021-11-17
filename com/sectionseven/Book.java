package com.sectionseven;

public class Book {
    private String author;
    private String title;
    private String genre;
    private int numberOfPages;

    public Book(String author,String title,String genre,int numberOfPages){
        this.author=author;
        this.title=title;
        this.genre=genre;
        this.numberOfPages=numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public  void printBookDetails(){
        System.out.println(title);
        System.out.println("by "+author);
        System.out.println("has "+numberOfPages
                + " pages and genre is "+genre);
        System.out.println("\n");
    }
}
