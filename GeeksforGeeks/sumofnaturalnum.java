package GeeksforGeeks;

import java.util.Scanner;

public class sumofnaturalnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int j = 0; j<=n; j++) {
            sum = sum+j;
        }
        System.out.print(sum);
    }
}
    