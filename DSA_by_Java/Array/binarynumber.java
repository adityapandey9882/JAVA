package DSA_by_Java.Array;

import java.util.Scanner;

public class binarynumber {
    public static int binsearch(int numbers[], int search, int size){
        int l=0;
        int r=size;
        for(int i=0; i<size; i++){
        int m = (l+r)/2;

        if(numbers[i]==search){
            return i;
        }else if(numbers[i]>search){
            m = l+1;
        }else if(numbers[i]<search){
            m= r-1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[100];
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.println("Enter the array value: ");
            int n = sc.nextInt();
            numbers[i] = n;
        }
        System.out.println("Enter the search value: ");
        int search = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        System.out.println(binsearch(numbers, search, size));
    }
}
