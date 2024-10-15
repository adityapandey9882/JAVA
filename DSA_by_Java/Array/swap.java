// package DSA_by_Java.Array;

public class swap {
    public static void Swap(int []arr, int a, int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
