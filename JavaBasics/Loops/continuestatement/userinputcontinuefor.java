package JavaBasics.Loops.continuestatement;

import java.util.Scanner;

public class userinputcontinuefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number that you want to skip: ");
        int skip = sc.nextInt();
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i=1;  i++){
            if(num%skip==0){
                continue;
            }
            System.out.print(num + ",");
        }
        System.out.println("Program Execution is completed successfully: " + num);
    }
}
