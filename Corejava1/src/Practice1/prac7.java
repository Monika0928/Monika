//Non static , static and constructor 
//St > Main > NST > const 

package Practice1;

public class prac7 {
	
	static {
		System.out.println("1");
	}
	static {
		System.out.println("2");
	}
	prac7(){
		System.out.println("3");
		
	}
	prac7(int a){
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	{
		System.out.println("6");
		
	}
		{
			System.out.println("7");
		}
		
		static {
			System.out.println("8");
		}
	public static void main (String[] args) {
	System.out.println("9");
		prac7 obj1 = new prac7();
		System.out.println("10");
		prac7 obj2 = new prac7(2);
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	

	
