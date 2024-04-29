package JavaBasics.Variable;

import java.util.*;
public class typeconversionuserinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();
        // System.out.println(number);  // output error due to float to int is not possible.
        float number = sc.nextInt();
        System.out.println(number);  // output is possiblel due to int to float is possible.
    }
}
