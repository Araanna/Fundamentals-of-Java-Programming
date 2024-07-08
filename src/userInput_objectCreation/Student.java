package userInput_objectCreation;

class Student {

	int population;
	String level;
	String room;

	public Student(int population, String level, String room) {
		this.population = population;
		this.level = level;
		this.room = room;

		System.out.println("Population: " + population);
		System.out.println("Level: " + level);
		System.out.println("Room: " + room);

	}

}
