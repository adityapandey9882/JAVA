package DSA_by_Java.Array;

public class reverseArray {
    public static int[] reverse(int numbers[]){
        int numbers1[] = new int [20];
        int first = 0;
        int last = numbers.length-1;
        int j=0;

        for (int i=last ; i>=0;i--) {
            //swap
          numbers1[j] = numbers[i];
          j++;
        }
        return numbers1;
        
    }
    public static void main(String[] args) {
        int [] numbers = {5,4,8,41,2};
        int [] numbers1 = reverse(numbers);
        
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers1[i]+ " ");
        }
    }

}
