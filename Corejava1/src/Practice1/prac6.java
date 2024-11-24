//Non static and constructor 

// main > NST > const -> all non static block will be loaded in constructor then
//constructor block wil be printe d
//****** when we have non static block with constructor when main method is caled and object is created all 
// the non static blocs are loaded then constructor block is printed 
package Practice1;

public class prac6 {
	{
		System.out.println("7");
	}
	  prac6(){
		System.out.println("const1");
	}
	
	prac6( int a)
	{
		System.out.println("const2");
	}
			
	{
	System.out.println("1");	
	}
	{
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		prac6 ob1 = new prac6();
		prac6 ob2 = new prac6(2);
		prac6 ob3 = new prac6(2);

	}

}
