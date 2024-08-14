package JavaBasics.Function;

public class bintodec {
    int dec;
    static int pow1;
    public static void bintoodec(int n){
        int bin;
        int binv = 0;

        while (n>0) {
         binv = binv +n%10*(int)Math.pow(2, pow1); 
         pow1++;
         n = n/10;
         
        }
        System.out.println(binv);
    }
    public static void main(String args[]){
        bintoodec(10101);

    }
}
