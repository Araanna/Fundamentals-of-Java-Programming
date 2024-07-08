package Cashiering;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Receipt {
    private LocalDate currentDate;
    private LocalTime currentTime;

    public Receipt() {
        currentDate = LocalDate.now();
        currentTime = LocalTime.now();
    }

    public void generateReceipt(Cart cart) {
        List<Item> items = cart.getItems();
        double totalCost = cart.calculateTotalCost();

        if (items.isEmpty()) {
            System.out.println("Cart is empty. Cannot generate a receipt.");
        } else {
            System.out.println("Receipt - " + currentDate + " " + currentTime);
            for (Item item : items) {
                double itemCost = item.getCost() * item.getQuantity();
                System.out.println(item.getName() + " x" + item.getQuantity() + " at $" + item.getCost() +
                        " each = $" + itemCost);
            }
            System.out.println("Total Cost: $" + totalCost);
            for (int i = 0; i <= 20; i++) {
                System.out.println("-");
            }
        }
    }
}
