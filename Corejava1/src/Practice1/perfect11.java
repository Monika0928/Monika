package Practice1;

public class perfect11 {

	public static void main(String[] args) {
		int n=6;
		int sum = 0;
		for(int  i=1; i<n ; i++) {
			if(n%i==0) {
				sum = sum +i;
				
			}
		}
		if (sum == n) {
			System.out.println("perfect number ");
		}
		else
			System.out.println("not a perfect number");
		}
		
	}
