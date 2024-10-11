import java.util.*;
public class palindromnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int value = i;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print(value);
                if(k<=(i*2-1)/2){
                    value--;
                }
                else{
                    value++;
                }
            }
            System.out.println("");
        }
    }
}
