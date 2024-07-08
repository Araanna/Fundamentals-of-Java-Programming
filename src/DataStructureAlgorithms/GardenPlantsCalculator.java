package DataStructureAlgorithms;

import java.util.Scanner;

public class GardenPlantsCalculator {
    private double gardenLength;
    private double gardenWidth;
    private double areaPerPlant;

    public static void main(String[] args) {
        GardenPlantsCalculator calculator = new GardenPlantsCalculator();
        calculator.askUserForInputs();
        int plants = calculator.calculatePlants();
        System.out.println("You can fit " + plants + " plants in the garden.");
    }

    public void askUserForInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the garden (in meters): ");
        gardenLength = scanner.nextDouble();

        System.out.print("Enter the width of the garden (in meters): ");
        gardenWidth = scanner.nextDouble();

        System.out.print("Enter the area per plant (in square meters): ");
        areaPerPlant = scanner.nextDouble();

        scanner.close();
    }

    public int calculatePlants() {
        double gardenArea = gardenLength * gardenWidth;
        System.out.println("Area of the Garden: " + gardenArea);
        int plants = (int) (gardenArea / areaPerPlant);
        return plants;
    }
}
