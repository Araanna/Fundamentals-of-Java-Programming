package Cashiering;

import java.util.Scanner;

public class DeleteItem {
    public static void deleteItem(Cart cart, Scanner scanner) {
        System.out.print("Enter Item name to delete: ");
        String nameToDelete = scanner.next();

        if (cart.removeItem(nameToDelete)) {
            System.out.println(nameToDelete + " removed from the cart.");
        } else {
            System.out.println(nameToDelete + " not found in the cart.");
        }
    }
}
