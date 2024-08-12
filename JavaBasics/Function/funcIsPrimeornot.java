package JavaBasics.Function;

import java.util.Scanner;

public class funcIsPrimeornot {

    // check the number is prime or not
    public static boolean isPrime1(int n1) {
        boolean isPrime = true;
        for(int i= 2;  i<=n1-1; i++){
            if(n1 % i == 0){   //completely deviding
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //another way of writing function 
    public static boolean isPrime(int n){
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of isPrimen1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter your number of isPrime: ");
        int n = sc.nextInt();
        System.out.println(isPrime1(n1));
        System.out.println(isPrime(n));
        
    }
}
