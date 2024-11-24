//type casting for primitive
package Practice1;

public class Typecasting {

	// int -- long
	// float --
	public static void main(String[] args) {
//		Upcasting small to larger 
//		int intvalue=100;
//		long longvalue= intvalue;
//		System.out.println(longvalue);
//		
//		float floatvalue=10.9F; // need to add literal for float value
//		double doublevalue=floatvalue;
//		System.out.println(doublevalue);
		
		//downcasting - manually larger ... smaller
		long longvalue= 1000000;
		int intvalue= (int)longvalue; // convert long into lower value int and store 
		
		double doublevalue=10.99;
		float value = (float)doublevalue;
		
		
		

	}

}
