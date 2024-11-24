//finally block ***********************************************
package Practice1;

public class exception4 {

	public static void main(String[] args) {
System.out.println("program is started ");
		
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Handled exception1");
			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("finally block is executed");
		}
	}

}
