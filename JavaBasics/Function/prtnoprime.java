package JavaBasics.Function;
import java.util.Scanner;

public class prtnoprime {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isPrimeRange(int n){
        int count = 0;
        for(int i=2; i<=n-1; i++){
            if(isPrime(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Total Prime number: "+ count);
    }
 public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<2){
        System.out.println("Enter the value greater than 2 ");
    }else{
        isPrimeRange(n) ;
    }
 }   
}
