package JavaBasics.Function;

import java.util.Scanner;

public class armstrongnum {
    public static int Countofdigit(int n) {

        int count = 0;
        while(n>0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean  Is_Armstrong_Number(int n){
        int d = Countofdigit(n);
        int sum=0;
        int p = n;
        while(n > 0){
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, d));
            n = n / 10;
        }
        if(sum==p) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Is_Armstrong_Number(n));
        
    }
}
