package DSA_by_Java.Array;

import java.util.Scanner;

public class lenearsearch1 {
    public static int lenearsearch(int []arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void Display(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        Display(arr);
        
        System.out.print("Enter the search elment: ");
        int key = sc.nextInt();
        System.out.print(lenearsearch(arr , key));  
    }
    
}
