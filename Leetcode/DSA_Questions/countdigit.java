package Leetcode.DSA_Questions;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int find = sc.nextInt();
        int ln = 0;

        int arr[] = new int[10];

        while (n>0) {
            ln = n%10;
            arr[ln] = arr[ln]+1;
            n= n/10;
        }
        System.out.println(arr[find]);

    }
}
