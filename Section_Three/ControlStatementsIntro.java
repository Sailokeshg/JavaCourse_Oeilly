package Section_Three;

public class ControlStatementsIntro {
    public static void main(String[] args){
        int age=19;
        if(age>=18){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You can not drive");
        }
        System.out.println();
        for(int i=1;i<=age;i++){
            System.out.println("Happy birthday "+i);
        }
    }
}
