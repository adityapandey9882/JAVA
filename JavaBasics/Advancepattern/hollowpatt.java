package JavaBasics.Advancepattern;

public class hollowpatt {
    public static void main(String[] args) {
        int space = 4; 
        int start = 5;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("- ");
            }
            for (int k = 1; k <=start; k++) {
                System.out.print("* ");
            }
            if(i<=9/2){
                start--;
                space--;
            }
            else{
                start++;
                space++;
            }
            System.out.println();
        }
    }
}
