package Section_Three;

public class EvenOnly {
    public static void main(String[] args){
//        for(int i=0;i<10;i++){
//            if(i%2==0){
//                System.out.print(i+ "\t");
//            }
//        }
        int count=0;
        while (count<10){
            if(count % 2!=0){
                count++;
                continue;
            }
            System.out.println(count+ "\t");
            count++;
        }
    }
}
