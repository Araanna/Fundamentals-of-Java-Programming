package Abtraction_Interfaces;

public class Frog implements Animal, WaterAnimal, LandAnimal {

    public void makeSound() {
        System.out.println("Ribbit!");
    }

    public void swim() {
        System.out.println("Swimming!");
    }

    public void walk() {
        System.out.println("Walking!");
    }

}
