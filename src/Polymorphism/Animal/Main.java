package Polymorphism.Animal;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        // Polymorphism
        Animal a = new Dog();

        a.makeSound();

        d.makeSound();
        c.makeSound();

    }

}
