package Inheritance;

public class Main {
    public static void main(String[] args) {

        Person P = new Person("Melanie", "Female", 20);
        Toddler t = new Toddler("Iris", "Male", 1, "Peek a Boo");
        Kid k = new Kid("Love", "Male", 4, "Mobile Legends", 6);
        // P.checkStatus();
        t.checkStatus();

        t.drink();
        t.drinking();

        k.checkStatus();

    }
}
