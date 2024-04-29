package JavaBasics.Loops.continuestatement;

public class skipiteration {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==7){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("execution is successfully completed");
    }
}
