package ClassesObjects;

public class Main {

	public static void main(String[] args) {

		// Objects
		Person p = new Person();

		// Writing Attribute
		p.firstName = "Melanie";
		p.lastName = "Abalde";
		p.sex = 'F';
		p.age = 20;

		Person p1 = new Person();
		p1.firstName = "Jason";
		p1.lastName = "Paraguya";
		p1.sex = 'M';
		p1.age = 20;

		// Reading Attributes
		System.out.println(p.firstName);

	}

}
