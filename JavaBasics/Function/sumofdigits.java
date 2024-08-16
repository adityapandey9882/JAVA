package JavaBasics.Function;

import java.util.Scanner;

public class sumofdigits {
    public static void sumdigi(int n){
        int ln = 0;

        while (n>0) {
            ln = ln+(n%10);
            n = n/10;
        }
        System.out.println("Total sum of number: " + ln);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        sumdigi(n);

    }
}
