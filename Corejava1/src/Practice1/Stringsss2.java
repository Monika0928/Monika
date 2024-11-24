package Practice1;

public class Stringsss2 {

	public static void main(String[] args) {
		
		// Reverse String by using Length , charAt() *****************************************
//		String s= "welcome ";
//		String rev = "";
//		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev= rev+s.charAt(i);
//		}
//		System.out.println("reverse Strig is :"+rev);
//		}
		
		//Reverse by converting  String to char array type *******************************************
//		String s="Welcome";
//		String rev="";
//		char a[]=s.toCharArray();//will convert String into array 
//		
//		for (int i=a.length-1;i>=0;i--)
//		{
//			rev=rev+a[i];
//		}
//		System.out.println("Reverse string id :" +rev);
		
		
		//Approacvh 3 
//		StringBuffer  s =new StringBuffer("Welcome");
		StringBuilder s= new StringBuilder("Welcome");
		
		System.out.println(s.reverse());
	}
}

