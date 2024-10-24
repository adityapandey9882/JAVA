public class hollowrectangle {
    public static void main(String[] args) {
        int space = 8/2;
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j <= 8; j++) {
                if(j>=space && j<= 8-space &&!(i == 1 ) && !(i == 7) ){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
            if(i < 8/2){

                space--;
            }
            else{
                space ++;
            }

        }
        
    }
}
