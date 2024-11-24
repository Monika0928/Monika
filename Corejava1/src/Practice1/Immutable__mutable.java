package Practice1;

import java.util.Arrays;

public class Immutable__mutable {

	public static void main(String[] args) {
	
		//mutable - can change 
		int a[] = {50,30,20,10,};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//immutable- Cannot change
//		String s = new String ("Welcome");
//		System.out.println(s);
//		s.concat("java");
//		System.out.println(s); // welcome // cannot change .... . > immutable 
		
		String s = new String ("Welcome");
		System.out.println(s);
		String concatstring=s.concat("java");
		System.out.println(concatstring); // welcome // cannot change .... . > immutable
		

	}

}
