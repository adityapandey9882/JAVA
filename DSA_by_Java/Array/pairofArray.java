package DSA_by_Java.Array;

import java.util.Scanner;

public class pairofArray {
    public static void PrintPair(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] numbers = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.print("Enter the value of array: ");
            int n = sc.nextInt();
            numbers[i] = n;
        }
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
        PrintPair(numbers);
    }
}
