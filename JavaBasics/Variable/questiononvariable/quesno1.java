package JavaBasics.Variable.questiononvariable;

import java.util.Scanner;

public class quesno1 {
    public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a = ");
      float a = sc.nextFloat();
      System.out.print("Enter the value of b =" );
      float b = sc.nextFloat();
      System.out.print("Enter the value of c =" );
      float c = sc.nextFloat();
        float avg = ((a+b+c)/3);
      System.out.print("Average Input of three number is = " + avg);  
    }
    
}
