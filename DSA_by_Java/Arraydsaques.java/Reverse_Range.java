
import java.util.Scanner;

public class Reverse_Range {
    public static void reverse(int []arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the array of Index num " + index + ": " );
            arr[i] = sc.nextInt();
            index++;
        }
        System.out.print("Enter the starting index: ");
        int i = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int j = sc.nextInt();
        reverse(arr, i, j);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
