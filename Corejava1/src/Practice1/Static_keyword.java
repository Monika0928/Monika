package Practice1;

public class Static_keyword {
	
	static int a=10; // static variable
	int b =20;//non static variable
	
	
	static void m1() //static method
	{
		System.out.println("this is m1 static method");
	}
	void m2() //non static method
	{
		System.out.println("this is non static method");
	}
	
	void m() // nS method can access everything they dont have any restrictions
	{
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
	}
public static void main(String[] args) //since its a static ,method we can access static stuff directly
	{
		System.out.println(a);
		m1();
		Static_keyword ns= new Static_keyword();
		System.out.println(ns.b);
		ns.m2();
	
	}

}
