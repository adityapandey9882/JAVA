package JavaBasics.Loops.whileloop;

import java.util.Scanner;

public class sum1tondowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=1;
        System.out.println("Enter your no: ");
        int n = sc.nextInt();
        int sum=0;
        
        do{
            sum = sum+counter;
            System.out.println(sum);
            counter++;
        }while(counter<=n);
    }
}
