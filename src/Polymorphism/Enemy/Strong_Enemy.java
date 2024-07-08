package Polymorphism.Enemy;

public class Strong_Enemy extends Enemy {

    Strong_Enemy() {
        name = "Strong Enemy";
        hp = 100;
    }

    void dialog() {
        System.out.println(name + " : I am Strong");
    }

}
