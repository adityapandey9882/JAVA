package JavaBasics.Loops.quesonloop;

import java.util.Scanner;

public class integersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        // int choice;
        int evensum = 0;
        int oddsum = 0;
        
//         do{
//             System.out.print("Enter your integer number: ");
//             num = sc.nextInt();

//             if(num%2==0){
//                 evensum=evensum+num;
//             }else{
//                 oddsum=oddsum+num;
//             }
//             System.out.println("do you want to continue? press 1 for yes or 0 for no: ");
//             choice = sc.nextInt();

//         }while(choice==1);
//         System.out.println("Sum of evensum integers: "+ evensum);
//         System.out.println("Sum of oddsum integers: "+ oddsum);
//     }
// }
            // using for loop 
            for(int i=1; i<=num; i++){
                if(num%2==0){
                    evensum= evensum+num;
                }else{
                    oddsum= oddsum+num;
                }
                System.out.println("total output of input: "+ evensum);
            }
    }
}
