package JavaBasics.Loops.breakstatement;
   // Already input is given
public class breakprogram {
   public static void main(String[] args) {
    for(int i=1; i<=10; i++){
        if(i==5){
            break;
        }
        System.out.println(i);
    }
    System.out.println("i am now out of the loop");
   }
    
}
