package JavaBasics.Function;

public class bintodeci {
    public static void bintodec(int binNum){
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum>0) {
            int lastdigint = binNum % 10;
            decNum = decNum + (lastdigint* (int)Math.pow(2, pow));

            pow++;
            binNum = binNum /10;
        }
        System.out.println("decimal number of " + Mynum +" = " + decNum);
    }
    public static void main(String[] args) {
        bintodec(101011);
        
    }
}
