package JAVA_Programss;

import java.util.Scanner;

public class Unique_Strings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String  s= sc.nextLine();
		int count =0; // to see if the value is repeating then count value will be change to 1 so dt we get to know we have duplicates
		
		//ex COMPUTER
		//   01234567
		
		int l= s.length();
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) // to check if i am at 1 index furthur this alphabet is repeating or not 
			{
				if(s.charAt(i)==s.charAt(j))  //c==o
				{
					count = 1;
					break;
				}
			}
			if(count==1)
			{
				
		break;
	}	}
		if (count==0) {
			System.out.println("Unique string");
		}
		else
		{
			System.out.println("Not unique string");
		}
}}
