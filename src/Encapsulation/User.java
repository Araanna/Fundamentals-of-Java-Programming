package Encapsulation;

public class User {
 
	private int userID;
	private String userName;
	private String firstName, lastName;
	
	User(int userID, String userName, String firstName, String lastName){
		this.userID = userID;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setUserID (int userID) {
		this.userID = userID;
	}
	
	int getUserID() {
		return userID;
	}
	
	void setFirstName (String firstName) {
		this.firstName = firstName; 
	}
	
	void getLastName(String lastName) {
		this.lastName = lastName;
	}
	String getFirstName() {
		return firstName;
	}
	String getLastName() {
		return lastName = lastName;
	}
}
