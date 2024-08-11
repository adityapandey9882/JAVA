package JavaBasics.Function;

public class callbyvaluefunction {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

        public static void main(String args[]){
            int a = 80;
            int b = 100;
            swap(a, b);
    }
}

