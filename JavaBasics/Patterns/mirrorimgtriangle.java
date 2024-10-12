

public class mirrorimgtriangle {
  public static void main(String[] args) {
    int space = 0;
    int value = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = value; k <= 4; k++) {
                System.out.print(k + " ");
            }
            if(i <= 7/2){
                space++;
                value++;
            }
            else{
                space--;
                value--;
            }
            System.out.println();
        }
      }
}  

