package JavaBasics.Advancepattern;

public class mirrorpyrimage {
    public static void main(String[] args) {
        int space = 0;
        int value = 5;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j< space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value; k++) {
                System.out.print("* ");
            }
            if(i<=9/2){
                space++;
                value--;
            }
            else{
                space--;
                value++;
            }
            System.out.println();
        }
    }
}
