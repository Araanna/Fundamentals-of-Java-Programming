package DataStructureAlgorithms;

public class Main {

    public static void main(String[] args) {

        GardenPlantsCalculator calculator = new GardenPlantsCalculator();
        calculator.askUserForInputs();
        int plants = calculator.calculatePlants();
        System.out.println("You can fit " + plants + " plants in the garden.");

    }
}
