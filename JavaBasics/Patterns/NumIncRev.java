import java.util.Scanner;
public class NumIncRev {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) 
    //             System.out.print(j + " ");
    //         System.out.println();
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j = 1; j <= (n+1)-i; j++) {
                System.out.print(j + " " );
            }
            System.out.println(" ");
        }
    }
}
