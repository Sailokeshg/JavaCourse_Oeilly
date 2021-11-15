package sectionfour;

public class MoreArrayFun {
    public static void main(String[] args){
        int[] myArray = new int[10];
        for(int i=1;i<=10;i++){
            myArray[i-1]=i;
        }
        for(int i:myArray){
            System.out.print(i+"\t");
        }
    }
}
