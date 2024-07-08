package Cashiering;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public boolean removeItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost() * item.getQuantity();
        }
        return totalCost;
    }
}
