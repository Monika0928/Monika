//static memory allocation 
package Practice1;

public class prac3 {
	static int a=20;
	static int b=20;

	static {
		prac3.a=40;
		int a=50;
		System.out.println(a);
	}
	static {
		int b=40;
		prac3.a=b;
		prac3.b=prac3.a;
		System.out.println(b);
	}
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(b);
		}

	}
