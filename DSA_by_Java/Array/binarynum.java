package DSA_by_Java.Array;
import java.util.Scanner;

public class binarynum {
    public static int binsearch(int numbers[], int search, int size){
        int l=0;
        int r=size;
        int add =0;
        for(int i = 0; i<size; i++){
        int m = (l+r)/2;
        // System.out.println("m"+m);

        if (numbers[i] == search) {
            // System.out.println("i"+ i);
            return i;
            
        }
        else if(numbers[i]>search){
            r=m-1;
            // System.out.println("r"+ r);
        }else if (numbers[i] <search) {
            l=m+1;
            // System.out.println("l"+ l);
            
        }
    }
    return -1;
}

public static void main(String[] args) {
    int [] numbers = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int size = sc.nextInt();
    for(int i=0; i<size; i++){
        System.out.println("enter the array value");
        int n = sc.nextInt();
        numbers[i] = n;
    }
    System.out.println("enter the search value");
    int search = sc.nextInt();
    for(int i=0; i<size; i++)
    System.out.print(numbers[i] + " ");
    System.out.println("");
        System.out.println("the search index value is:- "+binsearch(numbers,search,size));
    }
   
}

