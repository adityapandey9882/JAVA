package JavaBasics.Loops.continuestatement;

import java.util.Scanner;

public class skipadvanced {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = sc.nextInt();
        System.out.print("Enter input that you want to skip: ");
        int skip = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(i==skip){
                continue;
            }
            System.out.print(i + ",");
        }
        System.out.println("execution is successfully completed: " + skip);
    }
}


