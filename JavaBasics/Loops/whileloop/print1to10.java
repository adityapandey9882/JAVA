package JavaBasics.Loops.whileloop;


public class print1to10 {
    public static void main(String arg[]){
        int counter = 0;

        while(counter<10){
            System.out.println("Hello world" + counter);
            counter++;
        }
        System.out.println("program executed: "+counter +"Times");
    }
    
}
