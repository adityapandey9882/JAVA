package JavaBasics.Function;

import java.util.Scanner;

public class isEventest {
    public static boolean isEven(int n ){
       if(n%2==0){
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
