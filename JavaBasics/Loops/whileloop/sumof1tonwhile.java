package JavaBasics.Loops.whileloop;

import java.util.Scanner;

public class sumof1tonwhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n =sc.nextInt();
        int sum= 0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println("program executed: " + sum +" is total sum of natural number "+n);
    }
}
