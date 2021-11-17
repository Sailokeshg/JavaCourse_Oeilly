package com.sectionseven;

public class House {
    private int numberOfStories;
    private int numberOfWindows;
    private String color;

    public House(){
        numberOfStories=1;
        numberOfWindows=2;
        color="white";
    }

    public House(int numberOfStories,int numberOfWindows,String color){
        this.numberOfStories=numberOfStories;
        this.numberOfWindows=numberOfWindows;
        this.color=color;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public void setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
