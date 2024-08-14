package JavaBasics.Function;

import java.util.Scanner;

public class funcIsPrimeornot {
         // function-1==function2==function==3 same but way of writing code is different
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i=2; i<= n-1; i++){
    //         if(n%i==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
        //function-2
    // public static boolean isPrime(int n){
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
        //function-3 
    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Please Enter the value greater than 2");
        }else{
            System.out.println(isPrime(n));
     
        }

    }
}
