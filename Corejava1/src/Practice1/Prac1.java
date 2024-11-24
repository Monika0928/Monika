//Static memory allocation 
package Practice1;

public class Prac1 {
	static int a = 10;
	static int b=10;
	static {
		int a=30;
		Prac1.a=a;
		System.out.println(a);
	}
	static {
		int b =40;
		Prac1.b= Prac1.b+b;
		System.out.println(b);
	}

	public static void main(String[] args) {
	
System.out.println(a);
System.out.println(b);
	}

}
