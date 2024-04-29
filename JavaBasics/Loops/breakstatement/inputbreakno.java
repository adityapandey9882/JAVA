package JavaBasics.Loops.breakstatement;

import java.util.Scanner;

public class inputbreakno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loop value: ");
        int n = sc.nextInt();
        System.out.print("Enter break point number: ");
        int exit = sc.nextInt();
        
        // using for loop
        // for(int i=1; i<=n; i++){
            // if(i==exit){
                // break;
                // }
                // System.out.println(i);
                // }
                // System.out.println("i am out of loop");
                
                // using while loop.
        // int counter=1;
        //  while(counter<=n){
            // if(counter==exit){
                // break;
            // }
            // System.out.println(counter);
            // counter++;
        //  }
        //  System.out.println("i am out of the loop");

            // using do-while loop
            int counter=1;
            do{
                if(counter==exit){
                    break;
                }
                System.out.println(counter);
                counter++;
            }while(counter<=n);
            System.out.println("i am out of the loop");
    }
}
