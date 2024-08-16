package JavaBasics.Function;

import java.util.Scanner;

public class palindrom {
    public static void ispalindrom(int n) {
        int Mynum= n;
           int lastnum = 0;

           while (n>0) {
               lastnum = (lastnum * 10)+n%10;
                n = n/10;
           }
           if(Mynum==lastnum){
            System.out.println("Number is palindrom: ");
           }else{
            System.out.println("Number is not palindrom: ");
           }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int n = sc.nextInt();
        ispalindrom(n);

    }
}
