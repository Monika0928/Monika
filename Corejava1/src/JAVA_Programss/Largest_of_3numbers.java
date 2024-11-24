// largest of 3 number s
package JAVA_Programss;

import java.util.Scanner;

public class Largest_of_3numbers {

//	a>b , a > c .. a is largest
//	b>a , b>c ..b is largest 
//	c>a , c> b .. c is largest 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		System.out.println("ENter b ");
		int b= sc.nextInt();
		
		System.out.println("Enter c ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a +"a is largest");
		}
		else if (b>a && b>c ) {
			System.out.println(b+"is largest");
		}
		else {
			System.out.println(c+"is largest");
		}
			
	
	
	
	
	}

}
