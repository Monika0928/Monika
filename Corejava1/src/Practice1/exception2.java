//how to handle the try catch block 
package Practice1;

import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner sc= new Scanner(System.in);
//		Example1
		System.out.println("enter numer :");  // enter 0
		int num =sc.nextInt();
		try {
			System.out.println(100/num);	
		}
	catch(ArithmeticException e) // if we get the exception only then catch block is executed
		{
			System.out.println("invalid data");
		}
		System.out.println("program completed");
	}

}
