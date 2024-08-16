package JavaBasics.Function;

import java.util.Scanner;

public class avgofthreenum {
    public static int avgofsum(int x, int y, int z){
        int average = ((x+y+z)/3);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter your value of y: ");
        int y = sc.nextInt();
        System.out.print("Enter your value of z: ");
        int z = sc.nextInt();
        System.out.println(avgofsum(x, y,  z));
    }
}
