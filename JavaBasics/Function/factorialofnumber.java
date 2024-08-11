package JavaBasics.Function;

import java.util.Scanner;

public class factorialofnumber {
    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
