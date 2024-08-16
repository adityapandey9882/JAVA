package JavaBasics.Function;

import java.util.Scanner;

public class bintodeci {
    public static void bintodec(int binNum){
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum>0) {
            int lastdigint = binNum % 10;
            decNum = decNum + (lastdigint* (int)Math.pow(2, pow));

            pow++;
            binNum = binNum /10;
        }
        System.out.println("decimal number of " + Mynum +" = " + decNum);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your binary number: ");
    int binNum = sc.nextInt();
    bintodec(binNum);      
    }
}
