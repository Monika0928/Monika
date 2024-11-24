//Non static block execution 
package Practice1;


	public class prac4 {
		{
			System.out.println("1");
		}
		{
			System.out.println("2");
		}
		{
			System.out.println("3");
		}
		public static void emain (String [] args) {
			System.out.println("Main mathod ");
			prac4 obj1 = new prac4();
			prac4 obj2 = new prac4();
			prac4 obj3 = new prac4();
			
		}
	}

