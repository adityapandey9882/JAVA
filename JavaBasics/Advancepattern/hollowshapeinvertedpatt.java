package JavaBasics.Advancepattern;

public class hollowshapeinvertedpatt {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print("* ");
            }
            for (int k = 0; k <2*i-3; k++) {
                if(i==1){
                    System.out.print("");
                }
                else{
                    System.out.print("- ");
                }    
            }
            for (int l = 5; l >=i; l--) {
                if(l==1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        Spyramid();
    
    }
    

    public static void Spyramid () {
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
