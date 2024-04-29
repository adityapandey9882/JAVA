package JavaBasics.Conditionalstatement.ifelsestatement;

import java.util.*;

public class ifelse {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("adult : drive ,vote");
        }    
            else{
                System.out.println("not adult");
            }
    }
}
