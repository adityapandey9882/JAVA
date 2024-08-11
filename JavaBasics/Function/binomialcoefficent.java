package JavaBasics.Function;

public class binomialcoefficent {
    public static int binfact(int n, int r){
        int f = 1;
        
        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        int n = 4;
        int r = 3;
        factorial = binfact(4);

    }
}
