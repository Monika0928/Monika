//multilevel  inheritence
package Practice1;
 
class A{

	int a=10;
	void mt1() {
		System.out.println(a);
	}
}

	class B extends A {

		int b=20;
		void mt1() {
		System.out.println(b);
	}
	}
	//untill here its single inheritance
//	class c extends B //// multilevel inheritence
//	{
//		int c=0;
//		void m4() {
//			System.out.println(c);
//		} // multilevel inheritence
//	}
	
	
	public class inheritence {
		
	public static void main(String[] args) {
		B obj= new B();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
//		c obj = new c();
//		System.out.println(obj.b);
	}

}
