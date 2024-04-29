package JavaBasics.Conditionalstatement.tarnarystatement;

import java.util.Scanner;

public class Tarnaryoperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = sc.nextInt();
        String type = ((num%2==0)? "even":"odd");
        System.out.println(type);
    }
}
