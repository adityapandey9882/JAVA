package JavaBasics.Loops.dowhileloop;

import java.util.Scanner;

public class inputuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int num = sc.nextInt();
        int counter=1;

        do{
            System.out.println("Hello world");
            counter++;
        }while(num>=counter);
        System.out.println("You input successfully executed: " + num  + "times");
    }
}
