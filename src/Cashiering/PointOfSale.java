package Cashiering;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class PointOfSale {

    static void space() {
        for (int i = 0; i <= 5; ++i) {
            System.out.println();
        }
    }

    private Cart cart = new Cart();
    private Receipt receipt = new Receipt();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        char choice;

        do {
            displayMenu();
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case '1':
                    AddItem.addItem(cart, scanner);
                    break;
                case '2':
                    DeleteItem.deleteItem(cart, scanner);
                    break;
                case '3':
                    Display.displayCart(cart);
                    break;
                case '4':
                    receipt.generateReceipt(cart);
                    break;
                case '5':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != '5');

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nEnter an option:");
        System.out.println("1. Add Item");
        System.out.println("2. Delete Item");
        System.out.println("3. Display Cart");
        System.out.println("4. Generate Receipt");
        System.out.println("5. Exit\n");
        System.out.print("Enter a Number: ");
    }

    public static void main(String[] args) {

        // For date and time the data has used
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter myObj = DateTimeFormatter.ofPattern("\nE, MMM dd, yyyy \nHH:mm:ss");
        String dtf = datetime.format(myObj);
        System.out.println(dtf);
        space();
        PointOfSale pos = new PointOfSale();
        System.out.println("Welcome to Point Of Sale!");

        pos.run();
    }
}
