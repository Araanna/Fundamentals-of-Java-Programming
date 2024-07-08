package userInput_objectCreation;

import java.util.*;

public class Main {

	static void Age() {
		for (int i = 25; i >= 17; i--) {
			System.out.println("Age: " + i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Students' Population:");
		int population = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the Students' Level: ");
		String level = sc.nextLine();

		System.out.print("Enter the Students' Room:");
		String room = sc.nextLine();

		System.out.println("\n");

		Student IT2 = new Student(population, level, room);

		System.out.println("\n");

		Main.Age();

		sc.close();
	}

}
