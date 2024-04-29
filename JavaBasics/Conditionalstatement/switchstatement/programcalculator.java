package JavaBasics.Conditionalstatement.switchstatement;

import java.util.Scanner;

public class programcalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operand1:  ");
        int operand1 = sc.nextInt();
        System.out.print("Enter your operand2:  ");
        int operand2 = sc.nextInt();
        System.out.print("Enter your operator:  ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Yout Result is: " + (operand1+operand2));
                        break;
            case '-': System.out.println("Yout Result is: " + (operand1-operand2));
                        break;
            case '*': System.out.println("Yout Result is: " + (operand1*operand2));
                        break;
            case '/': System.out.println("Yout Result is: " + (float) (operand1/operand2));
                        break;
            case '%': System.out.println("Yout Result is: " + (operand1%operand2));
                        break;
        
            default: System.out.println("not perform due to limited progarm code");
                break;
        }
    }
}
