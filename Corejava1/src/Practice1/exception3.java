
package Practice1;

public class exception3 {

	public static void main(String[] args) {
		System.out.println("program is started ");
		
		String s = null;
		try {
			System.out.println(s.length());
		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled exception1");
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println("Handled exception2");
//			System.out.println(e.getMessage());
//		}
//		catch(NumberFormatException e){
//			System.out.println("Handled exception3"); // writing multiple catch block will increase the code so we can follow 
//			System.out.println(e.getMessage());
//		}
		catch(Exception e)// this will handle all type of exception
		{
			System.out.println("handled final exception");
		}
		System.out.println("program finished");
		

	}

}
