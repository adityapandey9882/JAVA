package DSA_by_Java.Array;

public class linearsearch {
    public static int findout(int numbers[], int search){
        for(int i=0; i<numbers.length; i++){
            if(search==numbers[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] numbers = {15,14,19,32,78,20};
        int search = 19;
        int value = findout(numbers,search);
        if(value == -1){
            System.out.println("NOt found ");
        }else{
            System.out.println(value);
        }
    }
}

