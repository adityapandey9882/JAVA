package DSA_by_Java.Sorting;
public class bublesort {
    public static void bubblesort(int []arr){
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length-turn; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {35,41,-1,24,18,10};
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
}
