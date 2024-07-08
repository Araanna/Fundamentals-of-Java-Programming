package objectMethods;

public class Main {

	public static void main(String[] args) {
		
		
		Character ch = new Character ("Melanie", "Hello!", 90, 50, 5);
		Character ch1= new Character ("Jason", "Hello!", 90, 50, 5);
		
		
		System.out.println(ch.dialog);
		
		
		ch.introduce();
		ch1.introduce();
		
		ch.sayDialog();
		ch.talkTo("Jason");
		
		ch.talkToMe(ch); 
		
		//Return Type of a String Value
		System.out.println(ch1.talkToMe2(ch)); 
		
		
	}

}
