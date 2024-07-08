package main;

import mathematics.*;

public class Main {

	public static void main(String[] args) {
		
		
	//Create an Object
		
		Arithmetic a = new Arithmetic();
		Constants c = new Constants ();
		 
		int sum1 = a.add(5, 9);
		System.out.println("Result: " + sum1);

	
		int sum2 = a.subtract(5, 9);
		System.out.println("Result: " + sum2);
	

		int sum3 = a.multiply(5, 9);
		System.out.println("Result: " + sum3);
		
		//Constants Classs
		System.out.println(c.pi);
		
		/*Non- Access Modifiers Part
		//final
		/c.pi_1= 500; (see that the value assigned to the variable pi_1 will return a value of error because of the final non-access modifiers
		*/
		
		System.out.println(c.pi_1);
		
		
		//Static
		
		//Static helps you to not necessarily make an instance of Arithmetic
		//Simply import the Arithmetic class
		int sum4 = Arithmetic.add_1(2,9);
		System.out.println("Static: " + sum4);
		//Add Static to the float method
		System.out.println(Constants.pi);
		
}

}
