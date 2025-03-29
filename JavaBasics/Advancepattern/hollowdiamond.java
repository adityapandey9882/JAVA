package JavaBasics.Advancepattern;

public class hollowdiamond {
    public static void main(String[] args) {
        int space = 4;
        int inspace = 0;
        for (int i = 1; i <=9; i++) {
           for (int j = 1; j<=space; j++) {
            System.out.print(" ");
           }
           for (int k = 1; k <=1; k++) {
            System.out.print("* ");
           }
           for (int l = 1; l <inspace; l++) {
               if(i==1 || i==2 || i==8 || i==9){
                   System.out.print("");
                }
                else{
                System.out.print("- ");
                }
            }

            for (int m = 1; m <=1; m++) {
                if(i==1 || i==9){
                    System.out.print("");
                }
                else{
                    System.out.print("* ");
                }
            }

            if(i<=9/2){
                space--;
                inspace++;
            }
            else{
                space++;
                inspace--;
            }
            System.out.println();
        }
    }
}
