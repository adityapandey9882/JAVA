package JavaBasics.Patterns;

public class hollowrevtrianglepatt {
    public static void main(String[] args) {
        int value = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value; k++){
                if(k==1 || k == value || i == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            value--;
            System.out.println();
        }
    }   
}
