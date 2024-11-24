package Practice1;

final class Test1{
	 final void m() {
		System.out.println("method from test1");
	}
}
class Test2 extends Test1 //Test1 is final we cannot extend to child class 
{
	void m(int a) //m() is final method we cannot override
	{
		System.out.println("method from test2 class ");
	}
}


public class final2 {

	public static void main(String[] args) {


	}

}
