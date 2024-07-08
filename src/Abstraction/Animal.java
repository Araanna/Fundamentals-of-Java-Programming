package Abstraction;

public abstract class Animal {

    abstract void makeSound();

    // Can still make methods that are not abstract

    public void walk() {
        System.out.println("This animal is Walking");
    }

    public void eat() {
        System.out.println("This animal is Eating");

        for (

                int i = 0; i < 5; i++) {
            System.out.println("");

        }
    }

}