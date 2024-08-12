package JavaBasics.Function;

public class funcOverloadingwithdatatype {

    //func to calc sum of 2 num
    public static int sum(int a, int b) {
        return a+b;
    }
    // func to calc sum of 3 num
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(8,15));
        System.out.println(sum(2.8f,3.2f));
    }
}
