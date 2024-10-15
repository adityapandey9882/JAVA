public class revarray {
    public static void reversearr(int []arr){
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        reversearr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
