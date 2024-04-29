package JavaBasics.Variable.questiononvariable;

import java.util.Scanner;

public class costthesumthreeitem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen = ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser = ");
        float eraser = sc.nextFloat();
        float bill = (pencil+pen+eraser);
        System.out.print("Enter GST over products = ");
        float GST = sc.nextFloat();
        float tax = ((bill*GST)/100);
        float total = (bill + tax);
        System.out.print("Total bill of three item  = " + total);

    }
}
