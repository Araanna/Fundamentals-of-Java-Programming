package dsa_activity;

import java.util.*;

public class Calculator {
    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return a / b;
        }
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
        } else {
            return a % b;
        }
        return 0;
    }

}
