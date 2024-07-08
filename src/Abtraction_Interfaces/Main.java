package Abtraction_Interfaces;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Bird b = new Bird();
        Frog f = new Frog();

        d.makeSound();
        f.swim();
        f.walk();

    }
}
