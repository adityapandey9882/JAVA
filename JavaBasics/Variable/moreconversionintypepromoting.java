package JavaBasics.Variable;

public class moreconversionintypepromoting {
    public static void main(String arg []) {
        byte a = 5;
        // a = a*2;       // worng
         a = (byte) (a*2);   // need to explicit conversion int to byte.
        System.out.println(a);
    }
}
