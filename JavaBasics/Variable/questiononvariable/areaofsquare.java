package JavaBasics.Variable.questiononvariable;

import java.util.Scanner;

public class areaofsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a  =  ");
        int a = sc.nextInt();
        int area = (a*a);
        System.out.print("Area of square is =  "+ area);
    }
}
