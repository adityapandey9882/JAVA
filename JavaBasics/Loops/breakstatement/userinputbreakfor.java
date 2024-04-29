package JavaBasics.Loops.breakstatement;

import java.util.Scanner;

public class userinputbreakfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        for(int i=0; i<100; i++){
            if(i==num){
                continue;
                // break;
            }
            System.out.println(i);

        }
        System.out.println("Program executed");
        }

        
    }

