package Practice1;

import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		System.out.println("program started");
	Scanner sc= new Scanner(System.in);
//	Example1
//	System.out.println("enter numer :");  // enter 0
//	int num =sc.nextInt();
//	System.out.println(100/num);
//	
	
	int a[] =new int[5];
	System.out.println("Enter the position(0-4):"); // enter 5
	int pos = sc.nextInt();
	System.out.println("enter value"); //100
	int value = sc.nextInt();
	a[pos] =value;
	System.out.println(a[pos]);
	System.out.println("program exited");

	}

}
