package Looping;

import java.util.*;

public class forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, hour, over, time, bene;
        double pay, day, gross, net, amount;
        int ss = 285, pi = 45, ph = 175, nett;

        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.print("PAYROLL");
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }

        System.out.println("\n");
        System.out.print("Employee Number: ");
        num = input.nextInt();

        if (num != 0) {
            System.out.print("Input Daily Rate: ");
            pay = input.nextInt();
            System.out.print("Number of Days Rendered: ");
            day = input.nextInt();
            System.out.print("Additional Hours Rendered: ");
            hour = input.nextInt();

            gross = pay * day;

            bene = ss + ph + pi;
            net = gross - bene;

            for (int i = 0; i < 100; i++) {
                System.out.print("=");
            }
            System.out.println("\n");
            System.out.println("Employee " + num);
            System.out.println("Gross Salary: " + (pay / 8 * hour + gross));

            if (hour > 0) {
                System.out.print("Overtime Pay:" + pay / 8 * hour);
            } else {
                System.out.print("No overtime Rendered");
            }

            System.out.println("\nNet Salary: Php " + net);

            System.out.println("\n");
            for (int i = 0; i < 100; i++) {
                System.out.print("=");
            }
        }

        else {

            for (int i = 0; i < 100; i++) {
                System.out.print("=");
            }
            System.out.println("\n");
            System.out.println("INVALID INPUT!!");

            System.out.println("EMPLOYEE DOES NOT EXIST!!");

            for (int i = 0; i < 100; i++) {

                System.out.print("=");
            }

            for (int i = 0; i < 50; i++) {
                System.out.print("=");
            }

        }

    }
}
