package JavaBasics.Patterns;

public class hollowtrianglepatt {
    public static void main(String[] args) {
        int value = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value; k++) {
                if(k==1 || k==value || i==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            value++;
            System.out.println();
        }
    }
}
