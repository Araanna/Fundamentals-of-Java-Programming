package Polymorphism.Enemy;

public class Enemy {

    String name;
    int hp;

    void showStats() {
        System.out.println("Name :" + name);
        System.out.println("HP : " + hp);
    }

    void dialog() {
         System.out.println (" Please override me.")
    }

}
