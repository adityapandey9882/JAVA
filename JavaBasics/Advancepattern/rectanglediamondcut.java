package JavaBasics.Advancepattern;

public class rectanglediamondcut {
    public static void main(String[] args) {
        int star = 5;
        int space = -1;
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <=space; k++) {
                if(i==1 || i==9){
                    System.out.print("");
                }
                else{
                    System.out.print("- ");
                }    
            }
            for (int l = 1; l<=star; l++) {
                if(l==5){
                    System.out.print("");
                }
                else{
                    System.out.print("* ");
                }
            }
            if(i<=9/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
        }
        
    }
}

