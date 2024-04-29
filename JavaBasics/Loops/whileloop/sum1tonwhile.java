package JavaBasics.Loops.whileloop;

import java.util.Scanner;

public class sum1tonwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;

        while(counter<=n){
            sum=sum+counter;
            System.out.println(sum);
            counter++;
        }
        System.out.println("program executed: "+sum +" is total sum of natural number "+ n);
    }
}
