package Polymorphism.Enemy;

public class WeakEnemy extends Enemy {

    // Contructor for default values

    WeakEnemy() {
        name = "WeakEnemy";
        hp = 10;
    }

    WeakEnemy(String name, int hp)

    {
        this.name = name;
        this.hp = hp;

    }

    void dialog() {
        System.out.println(name + " :I am weak!");
    }

}
