package Practice1;

public class NIk1 {

	
	static int a=10; // static v
	int b=20; // NOn S variable 
	
	static void m1()  //SM
	{
		System.out.println("Method1");
	}
	void  m2() //NS  M 
	{
		 System.out.println("method2");
	 }
	
	
	public static void main(String[] args) {
		NIk1 s1= new NIk1();
		s1.m2();
		m1();

	}

}
