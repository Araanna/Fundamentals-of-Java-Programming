package Abtraction_Interfaces;

public interface AirAnimal extends LandAnimal {

    // Can declare variables
    String name = "Bird";

    void fly();

    // Default can be all Animal say Hello!
    default void sayHello() {
        System.out.println("Hello");
    }

}
