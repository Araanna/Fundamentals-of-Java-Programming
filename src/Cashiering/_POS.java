package Cashiering;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class _POS {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        LocalDate t = LocalDate.now();
        LocalTime m = LocalTime.now();
        System.out.println(t + " " + m);

        String name;
        double cost;
        int qty;
        double item_cost;

        System.out.println("POS Prototyping 2022-23");
        System.out.println("Enter A to continue or X to exit");

        char x = i.next().charAt(0);

        while (x == 'a' || x == 'X') {
            System.out.println("Enter Item1:");
            i.nextLine();
            name = i.nextLine();
            System.out.println("Item 1: " + name);

            System.out.println("Enter cost");
            cost = i.nextDouble();

            System.out.println("Enter qty");
            qty = i.nextInt();

            item_cost = cost * qty;

            System.out.println("Details:");
            System.out.println(name + " " + cost + " " + qty);
            System.out.println("Total: " + item_cost);

            System.out.println("Continue? Enter any letter to exit.");
            i.nextLine();
            x = i.next().charAt(0);
            break;
        }

        System.out.println("END");
    }
}
