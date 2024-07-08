package dsa_activity;

import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator myCalculator = new Calculator();

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.println("+, -, /, *");
        System.out.print("Enter operator: ");
        String op = input.next();

        int result = 0;
        if (null != op)
            switch (op) {
                case "+":
                    result = myCalculator.add(first, second);
                    break;
                case "-":
                    result = myCalculator.subtract(first, second);
                    break;
                case "/":
                    result = myCalculator.divide(first, second);
                    break;
                case "*":
                    result = myCalculator.multiply(first, second);
                    break;
                default:
                    break;
            }
        System.out.println("Answer:" + result);

        if (result % 2 == 0) {
            System.out.println(result + " is Even number");
        } else {
            System.out.println(result + " is Odd number");
        }

    }
}
