package Practice1;

class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class child1 extends parent{
	void Show(int b) {
		System.out.println(b);
	}
}
class child2 extends parent{
	void print(int c) {
		System.out.println(c);
	}
}



public class inheritenc2 {

	public static void main(String[] args) {
//		child1 c1= new child1();
//		c1.Show(2);
//		c1.display(10);
		
		child2 c2 = new child2();
		c2.display(30);

	}

}
