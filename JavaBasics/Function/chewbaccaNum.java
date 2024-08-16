package JavaBasics.Function;

import java.util.Scanner;

public class chewbaccaNum {
    public static void chewbacca(int n) {
        int ans =n%10;
        int pow1 =0;
        int ln = 0;       //lastNumber
        int cn = 0;
        int mp = 0;

        while(n>0) {
             ln = n%10;
             
             if((9-ln)<(ln)){
                 cn = 9-(n%10);
                //  ans = cn;
                 ans = cn * mp + ans;
                 System.out.println("if "+ ans);
                }else{
                // ans = ln;
                ans =(ln * mp )  + ans;
                System.out.println("else  if "+ ans);
            }
            n = n/10;
            pow1++;
            mp = (int)Math.pow(10, pow1);
            // ln = ln * 10 + ln;
            // System.out.println("out if "+ ans);
            
        }    
        // System.out.println("Number is converted to inverting number: " + ln);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        chewbacca(n);
    }
}
