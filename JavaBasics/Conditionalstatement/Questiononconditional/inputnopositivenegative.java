package JavaBasics.Conditionalstatement.Questiononconditional;

import java.util.Scanner;

public class inputnopositivenegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}
