package JavaBasics.Function;

public class callbyvalue {
    public static void main(String[] args) {
        //swap - values exchange
        int a = 10;
        int b = 18;

        //swap
        int temp = a;
        a = b;
        b = temp;
        
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
