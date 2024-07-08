package DataStructureAlgorithms;

import java.util.Scanner;

public class P2Exam {
    private double gardenLength;
    private double gardenWidth;
    private double areaPerPlant;

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
        int plants = (int) (gardenArea / areaPerPlant);
        return plants;
    }
}
