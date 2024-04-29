package JavaBasics.Conditionalstatement.Questiononconditional;

import java.util.Scanner;

public class leapyearornot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean x = (year%400==0);
        boolean y = (year%100!=0);
        boolean z = (year%4==0);
        
        if (x || (y && z)){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

    }
}
