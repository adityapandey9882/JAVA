package JavaBasics.Variable;

import java.util.Scanner;

public class typecastinguserinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = (int) sc.nextFloat();
        System.out.println(a);
    }
}
