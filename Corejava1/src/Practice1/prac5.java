//Non static and static block 
//static > main > nonstatic > constructor 
package Practice1;

public class prac5 {

	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	static {
		System.out.println("3");
	}
	static {
		System.out.println("4");
		
	}
	{
		System.out.println("5");
		
	}
	{
		System.out.println("6");
	}
		
	public static void main(String[] args) {
		System.out.println("main method starts");
		prac5 obj = new prac5();
		System.out.println("main method ends");
		prac5 obje = new prac5();

	}

}