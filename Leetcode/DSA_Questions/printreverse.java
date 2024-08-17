package Leetcode.DSA_Questions;

import java.util.Scanner;

public class printreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        int ln = 0;
        int sum = 0;

        while (n>0) {
            ln = n%10;
            rev = rev*10+ln;
            sum = sum+ln;
            // System.out.println(sum);
            n=n/10;
        }
        System.out.println(rev);
        System.out.println(sum);
    }
}
