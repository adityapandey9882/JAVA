  // Rule no 1 of typePromoting expression.

package JavaBasics.Variable;

public class typepromoting {
    public static void main(String arg[]) {
        char a = 'a';
        char b = 'b';
        // char c = a+b;       // not promoting and give output error
        System.out.println((int)a);
        System.out.println((int)b);
        // System.out.println((int)c);  // error
        System.out.println(b-a);  // promoting expression and output is found
    }
}
