package sectionfour;

public class ArrayFun {
    public static void main(String[] args){
        int[] myArray =new int[5];
        myArray[0]=10;
        myArray[1]=22;
//        for(int i=0;i<myArray.length;i++){
//            System.out.print(myArray[i]+"\t");
//        }
        for(int num:myArray){
            System.out.println(num);
        }
    }
}
