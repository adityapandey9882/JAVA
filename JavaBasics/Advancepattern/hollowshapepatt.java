package JavaBasics.Advancepattern;
public class hollowshapepatt {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (2 *(5 - i) -1); k++) {
                System.out.print("- ");
            }
            for (int l = 1; l <= i; l++) {
                if(l==5){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
