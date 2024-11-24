package JAVA_Programss;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
//		Using concatination operator 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:" );
		String str = sc.nextLine();
		
//		String str = "Monika ";
		String rev= "";
		int len = str.length(); //4 
		
		for(int i=len-1; i >=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of string is :"+ rev);
	
//	Using string buffer 
		StringBuffer sb1= new StringBuffer(str);
		System.out.println(sb1.reverse());
		
	
	
	
	}

}
