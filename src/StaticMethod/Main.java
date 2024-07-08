package StaticMethod;

public class Main {
	// Use of Static
	static void sayHi() {
		System.out.println("Hi!");
	}

	// Use of void
	void sayPancake() {
		System.out.println("Pancake!");
	}

	public static void main(String[] args) {
		// Static Method : Class Itself
		sayHi();

		// Non-Static Method: Instance of Class
		Main m = new Main(); // Create an Objects
		m.sayPancake();

	}

}
