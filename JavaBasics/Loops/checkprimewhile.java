package JavaBasics.Loops;

import java.util.Scanner;

public class checkprimewhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int counter=2;
        int n = sc.nextInt();
        
        boolean isPrime= true;
        
        while (true) {
            if(n%2==0){
                System.out.println("n is not prime number");
                counter++;
            }
            else{
                System.out.println("n is a prime number");
            }
        }
        // System.out.println("program");
    }
}
