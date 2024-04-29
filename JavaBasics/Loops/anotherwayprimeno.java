package JavaBasics.Loops;

import java.util.Scanner;

public class anotherwayprimeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int i, m=0, flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n + "not a prime num");
        }else{
            for(i=2; i<=n-1; i++){
                if(n%i==0){
                    System.out.println("n is not prime number");
                }
                else{
                    System.out.println("number is a prime number");
                }
            }
        }
    }
}
