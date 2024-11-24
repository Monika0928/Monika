//Reverse strings
package Stringss;

public class strings2 {
	
	
	public static void main(String[] args) {
		String s1 = "i love testyantra";
		
		
		String rev =" ";
		for (int i=0;i<s1.length();i++) {
		rev=s1.charAt(i)+rev;
			}
		System.out.println(rev);                                      // artnaytset evol i 
		
//*************************************************************************************************************		
//		String rev="";  
//		String[] var = s1.split(" ");
//		for (int i=0;i<var.length;i++) {
//			rev= var[i]+rev;
//			}
//		System.out.println(rev);                                     //testyantra love i

//**************************************************************************************************************		
//		String rev=" ";                                               //i evol testyantra 
//		String[] g = s1.split(" ");
//		for (int i=0;i<g.length;i++) {	
//			String var = g[i];
//			if(var.equals("love")) {
//				rev=rev +reverse(var);	
//			}	
//			else			
//			{
//				rev=rev+var+" ";
//			}
//		}
//		System.out.println(rev);	                                  
	//}	
	//public static String reverse( String s1) {
//		String rev="";
//		for (int i=0;i<s1.length();i++) {
//			rev=s1.charAt(i)+rev;
//				}
//		return rev;
//*************************************************************************************************************

//		String rev=" ";                                           //testyantra evol  i 
//		String[] g = s1.split(" ");
//		for (int i=0;i<g.length;i++) {	
//			String var = g[i];
//			if(var.equals("love")) {
//				rev=reverse(var)+ rev;	
//			}	
//			else			
//			{
//				rev=var+" "+rev;
//			}
//		}
		
//		System.out.println(rev);	                                      
	//}
	//public static String reverse( String s1) {
//		String rev="";
//		for (int i=0;i<s1.length();i++) {
//			rev=s1.charAt(i)+rev;
//				}
//		return rev;	
	}

	}
	
