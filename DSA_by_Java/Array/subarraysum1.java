package DSA_by_Java.Array;

public class subarraysum1 {
    public static void arraysum(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                System.out.print("[");
                for(int k=i; k<numbers.length; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.print("]");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [] numbers = {2,5,8,4,6};
        arraysum(numbers);

        
    }
}
