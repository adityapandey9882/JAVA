package JavaBasics.Loops.forloop;

public class reversenumber {
    public static void main(String[] args) {
        int num =  52478;

        for(int i=0; i<num;){
            int Lastdigit = num%10;
            System.out.print(Lastdigit);
            num = num/10;
        }
        System.out.println();
    }
}
