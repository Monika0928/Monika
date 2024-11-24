package Practice1;

class Test{
	final int x=100;
}


public class final1 {
	

	public static void main(String[] args) {
		Test t= new Test();
//		t.x=200; // x is final we cannot change the value of variable 
		System.out.println(t.x);

	}

}
