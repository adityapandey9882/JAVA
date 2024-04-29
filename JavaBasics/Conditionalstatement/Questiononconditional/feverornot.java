package JavaBasics.Conditionalstatement.Questiononconditional;

import java.util.Scanner;

public class feverornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");
        }

    }
}
