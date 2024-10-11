

public class rightv {
    public static void main(String[] args) {
        int space = 0;
        int odd = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < space; j++) {
                if (odd == 0) {
                    
                    System.out.print("* ");
                }else{

                    System.out.print("  ");
                }

            } 
            System.out.println("* ");
            if(i<=9/2){
                space++;
            }
            
            else{
                space--;
            }
            System.out.println();
            if (i%2 == 0) {
                odd = 0;
            }else{
                odd = 1;
            }
        }
    }
}
