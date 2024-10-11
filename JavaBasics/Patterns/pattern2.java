public class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int value = 1;
            for (int j = 1; j <= (i*2-1); j++) {
                System.out.print(value);
                if(j<=(i*2-1)/2){
                    value++;
                }
                else{
                    value--;
                }
            }
            
            System.out.println(" ");
        }
    }
}
