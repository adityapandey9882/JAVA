package Leetcode.DSA_Questions;

public class factorize {
    public static void main(String[] args) {
        int n = 154;
        int n1 = 154;

        int mult = 1;
        int i = 2;
        // while (n>0) {
           
        
            
            while (n>0) {
                if (n%i ==0 || n1%i ==0) {
                   if(n==i)
                   {
                    break;
                   }else{

                       n = n/i;
                       mult= i*mult;
                    }
                }else {
                    i++;
                }
                
                
                
            }
            mult= n*mult;
            
            System.out.println(mult);
        }
    }

