

public class kpattern {
    public static void main(String[] args) {
        int value = 4;
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= value; k++) {
                System.out.print("* " );
            }
            if(i <= 7/2){
                value--;
            }
            else{
                value++;
            }
            System.out.println();
        }
    }
}
