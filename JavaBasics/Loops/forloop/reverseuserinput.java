package JavaBasics.Loops.forloop;

import java.util.Scanner;

public class reverseuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number please: ");
        int num = sc.nextInt();

        for(int i=0; i<num;){
            int Lastdigit = num%10;
            System.out.print(Lastdigit);
            num = num/10;
        }
        System.out.println();
    }
}
