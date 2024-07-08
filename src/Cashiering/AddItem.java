package Cashiering;

import java.util.Scanner;

public class AddItem {
    public static void addItem(Cart cart, Scanner scanner) {
        System.out.print("\nEnter Item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Item cost: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter Item quantity: ");
        int quantity = scanner.nextInt();

        Item item = new Item(name, cost, quantity);
        cart.addItem(item);

        System.out.println("Item added to cart: " + item.getName());
    }
}
