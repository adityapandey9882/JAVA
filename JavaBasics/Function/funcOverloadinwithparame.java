package JavaBasics.Function;
import java.util.Scanner;

public class funcOverloadinwithparame {

    //func to calculate sum of 2 num
    public static int sum(int a, int b){
        return a+b;
    }
    //func to calc sum of 3 num
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
        
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter your value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter your value of c: ");
        int c = sc.nextInt();
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
    }
}
