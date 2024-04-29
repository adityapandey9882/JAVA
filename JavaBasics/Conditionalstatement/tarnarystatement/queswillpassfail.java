package JavaBasics.Conditionalstatement.tarnarystatement;

import java.util.Scanner;

public class queswillpassfail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks =  ");
        int marks = sc.nextInt();

        String type = (marks>=33)? "Pass":"Fail";
        System.out.println(type);
    }
}
