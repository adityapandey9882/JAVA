package DSA_by_Java.Array;

import java.util.Scanner;

public class reverseArray {
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while (first<last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[15];
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.print("Enter value of array: ");
            int n = sc.nextInt();
            numbers[i] = n;
        }
        for(int i=0; i<size; i++)
        System.out.print(numbers[i]+ " ");
        reverse(numbers);
    }

}
