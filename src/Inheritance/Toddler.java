package Inheritance;

public class Toddler extends Person {

    // Declare New Attributes
    String favoriteGame; // Add more variable in the COnstructors

    // Overriding Constructor

    Toddler(String name, String sex, int age, String favoriteGame) {
        super(name, sex, age);
        this.favoriteGame = favoriteGame; // New Attribute in this class "TOddler"
    }

    void drink() {
        System.out.println("Drinking Milk");
    }

    // Can Inherit the properties of the person through the variable "name"
    void drinking() {
        System.out.println(name + " Is Drinking Milk");
    }

    // Override .checkStatus
    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite Game:" + favoriteGame);

    }
}
