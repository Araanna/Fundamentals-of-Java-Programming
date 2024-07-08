package Polymorphism.Enemy;

public class Main {
    public static void main(String[] args) {

        // PolymOrphism
        Enemy we = new WeakEnemy();
        Enemy se = new Strong_Enemy();

        we.showStats();
        we.dialog();
    }
}
