package JavaBasics.Conditionalstatement.Questiononconditional;

// Ques. What will be the value of x & y in thefollowing program:
public class valueofxandy {
    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;
        System.out.print(x + " , ");
        System.out.print(y);
        }
}
   
