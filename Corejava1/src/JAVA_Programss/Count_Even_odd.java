package JAVA_Programss;

public class Count_Even_odd {

	public static void main(String[] args) {
		int num =1234;
		int odd_count=0;
		int even_count=0;
		
		while(num>0) {
		int rem =num%10;
		if(rem%2==0) {
			even_count++;
		}
		else {
			odd_count++;
			
		}
		num = num/10;
	}
	System.out.println("Even count "+even_count);
	System.out.println("Odd count "+odd_count);
	
	}

}
