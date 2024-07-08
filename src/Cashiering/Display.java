package Cashiering;

import java.util.List;

public class Display {
    public static void displayCart(Cart cart) {
        List<Item> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Item item : items) {
                System.out.println(item.getName() + " x" + item.getQuantity() + " at $" + item.getCost() + " each");
            }
        }
    }
}
