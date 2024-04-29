package JavaBasics.Patterns;

import java.util.Scanner;

public class fullpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int n = sc.nextInt();
        // outerloop
//         for(int i=1; i<=n; i++){
            // innerloop
//             for(int space=1; space<=n-i; space++){
//                 System.out.print(" ");
//             }
//             for(int star=1; star <= i; star++){
//                 System.out.print(" *");
//                 // break;
//             }
        
//             System.out.println();
//         }
//     }
// }
                   // Inverted fullpyramid 
            // outerloop
            for(int i=1; i<=n; i++){
                // Inner loop
                for(int space=1; space<=i-1; space++){
                    System.out.print(" ");
                }
                for(int star=1; star<=n-i+1; star++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }