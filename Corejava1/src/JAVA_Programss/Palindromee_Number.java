package JAVA_Programss;

import java.util.Scanner;

public class Palindromee_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter any number ");
		Scanner ref= new Scanner(System.in);
		int num= ref.nextInt();
		
		int org_num= num;
		int rev= 0;
		 
		while(num !=0)
		{
			rev=rev*10+ num %10;
			num = num/10;
		}
		
		if(org_num == rev) {
			System.out.println("Is a palindrome ");
		}
		else 
			System.out.println("Not a palindrome ");
		}
	}