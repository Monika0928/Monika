//Factorial of number 
package JAVA_Programss;

import java.util.Scanner;

public class Factoriall {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter factorial");
		int	n= in.nextInt();
		long f=1; //  
//		for(int i=n ; i>0; i--) 
		for(int i =1; i<=n; i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of number is :" +f);

	}

}
