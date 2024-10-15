package DSA_by_Java.Array;

public class swaptwoarray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50,60};
        int[]other = {100,200,300,400,500,606};
        System.out.println(arr[0] + " " + other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + " " + other[0]);
        addval(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Swap(int[]arr, int[]other){
        int []temp = arr;
        arr = other;
        other = arr;
    }

    public static void addval(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] +5;
        }
    }
}
