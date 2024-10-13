package JavaBasics.Function;

public class hollowdiamondpyra {
    public static void main(String[] args) {
        int value = 1;
        int space = 3;
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value  ; k++) {
                if(k==1 || k==value){
                    System.out.print("* ");
                    
                }
                else{
                    System.out.print("  ");
                }
                
            }
            if(i<=7/2){
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
