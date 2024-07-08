package Array_of_Objects;

import java.util.*;

public class MainTWo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int x = s.nextInt();

        s.nextLine(); // must put this after to avoid problems

        System.out.print("Enter First Name: ");
        String fname = s.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = s.nextLine();

    }
}