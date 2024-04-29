package JavaBasics.Loops.continuestatement;

import java.util.Scanner;

public class skipuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input that you want to skip: ");
        int num = sc.nextInt();
        for(int i=1; i<=100; i++){
            if(i==num){
                continue;
            }
            System.out.print(i + ",");
        }
        System.out.println("execution is successfully completed: " + num);
    }
}
