package Practice1;

public class wrappercls {

	public static void main(String[] args) {
		//String --- int
//		String s= "Welcome"; we cannot conver as it has characters
		String m= "123";
		int sint =Integer.parseInt(m);
		System.out.println(m);
		
		String s1="10";
		String s2 ="20";
		System.out.println("S1+s2"); // it will concatinate 
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // to add these we have to convert into wrapper class and add 
		
		String s="True"; // other then true if you pass anything that will return false 
		System.out.println(Boolean.parseBoolean(s));
		
		//int, char , double ----> String 
		int a=10;
		double d = 10.5;
		char C ='A';
		Boolean bool = false;
		
		String s10 = String.valueOf(a); // a is converted to string
		System.out.println(s10);
		
		String c1 = String.valueOf(C);
		System.out.println(c1);
	}

}
