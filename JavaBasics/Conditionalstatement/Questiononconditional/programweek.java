package JavaBasics.Conditionalstatement.Questiononconditional;

import java.util.Scanner;

public class programweek {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        
            default: System.out.println("Sorry in a week only 7days so please enter number between between 1 to 7.");
                break;
        }
    }
}
