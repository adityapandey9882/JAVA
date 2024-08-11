package JavaBasics.Function;

import java.util.Scanner;

public class productofnumber {

    public static int multiply(int a,  int b){
        int product = a*b;
        return product;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println(prod);
    }
}
