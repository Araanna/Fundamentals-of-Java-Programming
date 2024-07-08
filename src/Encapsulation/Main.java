package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		
		User u = new User(32131,"Mel", "Melanie", "Abalde" );
		u.setUserID(234324);
		int id = u.getUserID();
		
		System.out.println(id);
	}


}
