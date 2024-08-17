package Leetcode.DSA_Questions;

import java.util.Scanner;

public class sumofevenoddplace {
    public static int sumofoddevendigits(int n){
        int odd = 0;
        int even = 0;
        int ln = 0;
        int count = 1;

        while (n>0) {
            ln = n%10;
            if(count%2 == 0){
                even = even + ln;
            }else {
                odd = odd + ln;
            }
            n = n/10;
            count++;   
        }
        System.out.println("sum of digit at even place: " +even);
        System.out.println("sum of digit at odd place: " +odd);
    return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        sumofoddevendigits(n);     
    }
}
