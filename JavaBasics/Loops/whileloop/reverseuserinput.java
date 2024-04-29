package JavaBasics.Loops.whileloop;

import java.util.Scanner;

public class reverseuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input number: ");
        int num = sc.nextInt();
        int counter=0;

        while(num>counter){
            int Lastdigit = num%10;
            System.out.print(Lastdigit);
            num = num/10;
        }
        System.out.println();
    }
}
