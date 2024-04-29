package JavaBasics.Loops.whileloop;

public class reversenumber {
    public static void main(String[] args) {
        int num = 10899;
        int counter = 0;

        while (num>counter) {
            int Lastdigit = num % 10;
            System.out.print(Lastdigit);
            num = num/10;
        }
        System.out.println();
    }
}
