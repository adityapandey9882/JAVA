package DSA_by_Java.Array;

public class largestnum {
    public static int largest(int numbers[]){
        int largestno = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largestno){
                largestno = numbers[i];
            }
        }
        return largestno;
    }
    public static void main(String[] args) {
        int [] numbers = {10, 105, 42, 12, 35,96};
        System.out.println(largest(numbers));
    }
}
