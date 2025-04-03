package DSA_by_Java.Sorting;
import java.util.Scanner;

public class selectionsort {
    public static void selecsort(int []arr){
       for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of index num" + i + " : ");
            arr[i] = sc.nextInt();
        }
        selecsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }        

    }
}
