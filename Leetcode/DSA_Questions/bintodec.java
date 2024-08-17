package Leetcode.DSA_Questions;

import java.util.Scanner;

public class bintodec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        
        int pow=0;
        int decNum=0;
        int ln=0;

        while (binNum>0) {
        ln=binNum%10;
        decNum= decNum + ln*(int)Math.pow(2,pow); 
        pow++;
        binNum = binNum/10;

        }
        System.out.println(decNum);

    }
}
