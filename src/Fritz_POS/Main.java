package Fritz_POS;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDate tDate = LocalDate.now();
        LocalTime tTime = LocalTime.now();

        ArrayList<Item> itemList = new ArrayList<>();

        ArrayList<String> itemName = new ArrayList<>();

        System.out.println(tDate + "\n" + tTime);
        System.out.println("Turtosa");
        System.out.println("POS Prototyping 2022-23");
        System.out.println("********************************");
        int x = 1;
        while (x == 1) {
            System.out.print("Enter 1 to use program or any number to exit: ");
            x = scan.nextInt();
            if (x != 1) {
                break;
            }

            int x1 = 1;
            while (x1 == 1) {
                System.out.println("Choose an option: \n1.Add Item \n2.Display Items \n3.Delete item \n4.Exit\n");
                int option = scan.nextInt();
                scan.nextLine();
                if (option == 1) {
                    addItem(scan, itemList, itemName);
                    System.out.println("*****************************");
                    displayItems(itemList);
                } else if (option == 2) {
                    System.out.println("*****************************");
                    displayItems(itemList);
                    System.out.println("*****************************");
                } else if (option == 3) {
                    System.out.println("*****************************");
                    for (int i = 0; i < itemList.size(); i++) {
                        int lista = i + 1;
                        System.out.println(lista + "." + itemList.get(i));
                    }
                    System.out.println("*****************************");
                    deleteItems(itemList, itemName);
                } else if (option == 4) {
                    break;
                } else {
                    System.out.println("Option does not exist. Try again.");
                }

            }

        }
        exitProgram();

    }

    public static void exitConfirm() {
        System.out.print("Enter 1 to confirm exit: ");
    }

    public static void exitProgram() {
        System.out.println("Program execution finished.");
    }

    public static void addItem(Scanner scan, ArrayList<Item> itemList, ArrayList<String> itemName) {
        System.out.print("Enter Item name: ");
        String name = scan.nextLine();

        System.out.print("Enter Item cost: ");
        double cost = scan.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = scan.nextInt();

        double itemPartialcost = cost * qty;

        Item items = new Main().new Item(name, itemPartialcost, qty);
        itemList.add(items);
        itemName.add(name);

    }

    public static void displayItems(ArrayList<Item> itemList) {
        for (Item i : itemList) {
            System.out.println(i);
        }
    }

    public static void deleteItems(ArrayList<Item> itemList, ArrayList<String> itemName) {
        System.out.print("Enter the item number to delete: ");
        int execution = scan.nextInt();
        int bang = execution - 1;
        itemList.remove(bang);
        System.out.println("Item removed: " + itemName.get(bang));

    }

    class Item {
        private String name;
        private Double itemPartialcost;
        private int qty;

        public Item(String name, double itemPartialcost, int qty) {
            this.name = name;
            this.itemPartialcost = itemPartialcost;
            this.qty = qty;
        }

        public Double getCost() {
            return itemPartialcost;
        }

        public String getName() {
            return name;
        }

        public int getQty() {
            return qty;
        }

        public String toString() {
            return "Item name: " + name + " Cost: " + itemPartialcost + " Quantity: " + qty;
        }
    }
}
