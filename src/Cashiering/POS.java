package Cashiering;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class POS {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        LocalDate t = LocalDate.now();
        LocalTime m = LocalTime.now();

        String name;
        double cost;
        int qty;
        double item_cost;

        System.out.println("POS Prototyping 2022-23");
        System.out.println("Enter A to continue or X to exit");
        char x = i.next().charAt(0);

        while (x == 'a' || x == 'a') {
            System.out.println("Enter Item1: ");
            name = i.nextLine();
            System.out.println("Item1:" + " " + name);

            System.out.println("Enter cost: ");
            cost = i.nextDouble();

            System.out.println("Enter qty: ");
            qty = i.nextInt();

            item_cost = cost * qty;

            System.out.println("Details");

            System.out.println(name + " " + cost + " " + qty);
            System.out.println("Total: " + item_cost);

            System.out.println("Continue? enter any letter to exit.");
            name = i.nextLine();
            x = i.next().charAt(0);

            System.out.println("End");
        }

        _ReturnZero();
    }

    public static void _ReturnZero() {
        System.out.println("end");

    } // end of class

}
