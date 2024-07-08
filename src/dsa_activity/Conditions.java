package dsa_activity;

import java.util.*;

public class Conditions

{
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value num1: ");
        double num1 = input.nextDouble();
        System.out.println("enter value num2: ");
        double num2 = input.nextDouble();
        double totalReturn = sum(num1, num2);
        oddeven(totalReturn);
    }

    public static double sum(double x, double y) {

        double total = x + y;
        System.out.println(total);
        return total;
    }

    public static void oddeven(double OE) {

        if (OE % 2 == 0) {
            System.out.println(OE + "is Even number");
        } else {
            System.out.println(OE + "is Odd number");
        }
    }

}
