package Constructor;

public class Product {
	
	String name;//Global Variable
	float price;
	
	Product (String name, float price){ //Local Variable
		this.name= name;
		this.price= price;
		
		System.out.println(name + " Created");
	}

}
