// import java.util.Scanner;
public class NbrIncPry {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println(" ");
    //     }
    // }


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
