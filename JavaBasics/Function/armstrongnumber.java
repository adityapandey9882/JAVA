package JavaBasics.Function;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Is_Armstrong_Number(n));
    }
    public static int Countofdigit(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static boolean Is_Armstrong_Number(int n){
        int digit = Countofdigit(n);
        int sum = 0;
        int num = n;   // copy for comparision
        while(n>0){
           int  rem = n%10;
           sum = (int) (sum + Math.pow(rem, digit));
           n = n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
