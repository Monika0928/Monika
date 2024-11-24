package JAVA_Programss;

import java.util.Scanner;

public class Reversse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= sc.nextInt(); // accept value from user so writing ths stat.
		
		//1. USing algorithm 
//		int rev= 0;
//		while(num!=0)
//		{
//	 		rev=rev*10 + num %10; //0+1234%10 =4  40+3=43
//			num = num /10; //1234/10 =123/10 =12/10 =1
//		}
//*****************************************************************************************		
		// using logic 2 Using string buffer class method  
		
//		StringBuffer SB = new StringBuffer(String.valueOf(1234));
//		StringBuffer rev =SB.reverse();
//*****************************************************************************************
		
		//Using String builder class
		
		StringBuilder SB1 =new StringBuilder(num);
		SB1.append(num);
		StringBuilder rev  = SB1.reverse();
	System.out.println("Rever of string is :"+rev);
	
			
			
			
		}
	
	
	
	
	
	
	}


