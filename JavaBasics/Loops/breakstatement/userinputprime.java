package JavaBasics.Loops.breakstatement;

import java.util.Scanner;

public class userinputprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();


//         if(n==1){
//             System.out.print("n is not  prime number");
//         }else{
//             boolean isPrime = true;
//             for(int i=2; i<=n-1; i++){
//                 if(n%i==0){
//                     isPrime=false;
//                 }
//             }
//             if(isPrime==true){
//                 System.out.println("n is a prime number");
//             }
//             else{
//                 System.out.println("n is not a prime number");
//             }
//         }
//         System.out.println("program executed successfully");
//     }
// }
         // while loop
        // int counter = 2;
//         if(n==1){
//            System.out.println("n is not a prime number");
//         }else{
//             boolean isPrime= true;
//             while(counter<=n-1){
//                 if(n%counter==0){
//                    isPrime=false;
//                 }
//                 counter++;
//             }
//             if(isPrime==true){
//                 System.out.println(n+" is the prime number ");
//             }else{
//                 System.out.println(n+"  is not the prime number");
//             }   
            
//         }
//         System.out.println("program executed successfully");
//     }
// }
            // do-while loop
          
        int counter=2;
        boolean isPrime=true;
        do{
            if(n%counter==0){
                isPrime=false;
            }
            counter++;
        }while(counter<=n-1);
        if(isPrime==true){
            System.out.println("n is prime");
        }else{
            System.out.println("n is not prime");
        }
        System.out.println("program is executed");
    }
    
}

