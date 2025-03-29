package JavaBasics.Advancepattern;

public class diamondpatt {
    public static void main(String[] args) {
        int value = 1;
        int space = 4;
        for (int i = 1; i <=9; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value; k++) {
                System.out.print("* ");
            }
            if(i<=9/2){
                value++;
                space--;
            }
            else{
                value--;
                space++;
            }
            System.out.println();
        }
    }
}
