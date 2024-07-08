package objectMethods;

public class Character {

	String name, dialog;
	int hp, mp, lvl;
	
	
	Character(String name, String dialog, int hp, int mp, int lvl) {
		this.name = name;
		this.dialog = dialog;
		this.hp = hp; 
		this.mp = mp;
		this.lvl=lvl;
	}
	void introduce() {
		System.out.println("I' am " + name);
	}
	void sayDialog() {
		System.out.println(name + " : " + dialog);
	}
	void talkTo(String firstName) {
		System.out.println(name + " : Hello, " + firstName);
	}
	void talkToMe(Character x) {
		System.out.println(name + " : Hello, " + x.name);
	}
	//Return Type 
	//return a the value of String
	String  talkToMe2 (Character y) {
		return name + " : Hello, " + y.name;
	}

}
