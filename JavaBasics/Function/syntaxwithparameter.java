package JavaBasics.Function;

import java.util.Scanner;

public class syntaxwithparameter {

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}