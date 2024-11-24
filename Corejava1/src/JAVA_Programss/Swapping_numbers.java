//Swapping of 2 numbers
package JAVA_Programss;

import java.util.Scanner;

public class Swapping_numbers {

	public static void main(String[] args){
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter first number ");
//		int a= sc.nextInt();
//		System.out.println("Enter second number ");
//		int b=sc.nextInt();
//		int t= a;
//		a=b;
//		b=t;
//		System.out.println("After swapping:"+ a+" "+b);
	 
//	OR************************************************************************************************
	 
	//Logic 1 third variable
		
		int a=10, b=20;
		System.out.println("Before swapping :"+ a+" "+b);
		//Logic 1 third variable--------------------------------------------
//		int t= a;
//		 a=b;
//		 b=t;
		
		//Logic 2 use + & _ Operator --------------------------------------------------
//		 a=a+b;
//		 b=a-b;
//		 a=a-b;
		
		// Logic 3 use * and /
		// here a and b value should not be zero 
		a=a*b;
		b=a/b;
		a=a/b; //use current value of a and b 
		 
		 
		 
		 
		 System.out.println("After swapping:"+ a+" "+b);

	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
