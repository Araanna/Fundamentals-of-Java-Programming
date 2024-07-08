package Abstraction;

public class Main {

    public static void main(String[] args) {
        // ABSTRACT IDEA - useless| it cannot be instantiated
        /* Animal a = new Animal(); */
    
        // CONCRETE IDEA
        Dog d = new Dog();
        Cat c = new Cat();
        Pig p = new Pig();
        Horse h = new Horse();
        Cow a = new Cow();

        d.makeSound();
        d.walk();
        d.eat();

        c.makeSound();
        c.walk();
        c.eat();

        p.makeSound();
        p.walk();
        p.eat();

        h.makeSound();
        h.walk();
        h.eat();

        a.makeSound();
        a.walk();
        a.eat();

        while (true) {

    }

}
