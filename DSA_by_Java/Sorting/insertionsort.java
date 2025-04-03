package DSA_by_Java.Sorting;
import java.util.Scanner;

public class insertionsort {
    public static void sort(int []arr){
            for (int i = 1; i< arr.length; i++) {
                int picked = arr[i];
                int j = i-1;
                while(j>=0 && arr[j]>picked){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = picked;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
