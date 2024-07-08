package Method;

public class OverloadingMethod {

	public static void main(String[] args) {
		System.out.println(add(5,2));
		System.out.println(add(5,2,3));
		System.out.println(add(5.5,2.5));
		}
	
		static double add (double num1, double num2) { 
				return num1 + num2;
		}
		static int add(int num1, int num2) { 
				return num1 + num2;
		}
		
		static int add(int num1, int num2, int num3) { 
				return num1 + num2 + num3;

	}

}
