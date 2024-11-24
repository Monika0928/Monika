package JAVA_Programss;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
//	
//	int n1=0 , n2=1 , sum=0;
//	System.out.println(n1+ " " +n2 );
//	
//	for(int i=2; i<10;i++) {
//		sum= n1+n2;
//		n1=n2;
//		n2=sum;
//		System.out.println("  "+sum);
//	}
//		*********************OR******************************************************
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rthe number of terms");
		int n= sc.nextInt();
		
		int n1=0 , n2=1;
		System.out.println(n1+" "+n2);
		
		for(int i=0; i<n;i++) {
			int sum= n1+n2;
			n1=n2;
			n2=sum;
			System.out.println("  "+sum);
		}
	
	
	
	

	}

}
