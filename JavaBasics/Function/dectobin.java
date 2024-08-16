import java.util.Scanner;

public class dectobin {
    public static void decitobin (int decNum){
        int Mydecimal = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem *(int)Math.pow(10 ,pow));

            pow++;
            decNum = decNum/2;
        }
        System.err.println("Binary num of " + Mydecimal + " is" + " = " + binNum);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your decimal number: ");
    int decNum = sc.nextInt();
    decitobin(decNum);
    }
}
