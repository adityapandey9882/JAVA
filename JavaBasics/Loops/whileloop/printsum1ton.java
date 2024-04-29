package JavaBasics.Loops.whileloop;

import java.util.Scanner;

public class printsum1ton {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;

        while(i<=num){
            System.out.println(i +" ");
            i++;
        }
        System.out.println("program executed: "+num +"times");
    }
}
