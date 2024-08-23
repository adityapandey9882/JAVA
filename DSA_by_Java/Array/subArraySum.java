package DSA_by_Java.Array;

public class subArraySum {
    public static void subArray(int numbers[]){
        int max = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                System.out.print("[");
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+ " ");
                    sum = numbers[k]+sum;
                }
                if(sum>max){
                    max=sum;
                }
                System.out.print("]");
                System.out.println(" = " + sum);
            }
            System.out.println();
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        int [] numbers = {2,5,7,8,6,9};
        subArray(numbers);

    }
}
