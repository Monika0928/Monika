package Stringss;
 
public class strings1 {

	public static void main(String[] args) {
//		String s1 = "  abc123  !@#ABC *&  ";
		//replace evrything with empty string and except 0-9 
//		String numberonly = s1.replaceAll("[^0-9]","");              // number only 
//		System.out.println(numberonly); // ^- not the following character
		
//	****************************************************************************************	
//		replace evrything with empty string and except alpabets 

//		String alphabetonly = s1.replaceAll("[^a-zA-Z]","");           // alphabet only
//		System.out.println(alphabetonly);
//		
//		**********************************************************************************
	
//		String space = s1.replaceAll("\\s+","");
//       System.out.println(space);                          		 //without space 
//       
//   ******************************************************************************************
//	
//		for(int i =0; i <s1.length() ; i++){
//		char onlyspace = s1.charAt(i);
//		if(!Character.isLetterOrDigit(onlyspace) && !Character.isWhitespace(onlyspace)) {
//		
//			System.out.println(onlyspace);                  	// only special charcter 
//		
//		}}
//		*****************************************************************************************
//		String s1 = "NIKHIL";
//	String rev = " ";
//	for(int i = 0; i<s1.length(); i++) {             				//reverser string
//		rev = s1.charAt(i)+rev;
//		
//	}
//	System.out.println(rev);
//		
		
//	*****************************************************************************************
	
//	String s1 = "monika123 moni";
//	String rev ="";
//	String  var = s1.substring(5, s1.length());
//	for(int i =0; i<var.length();i++) {
//		rev = var.charAt(i)+rev;					//Sub string
//	}
//	System.out.println(rev);
//	
	
//******************************************************************************************
//		String rev=" "; // reverse only "abc123!@#ABC &"  >>  "& CBA#@!"
//		String var = s1.substring(8, s1.length());
//		for(int i=0;i<var.length();i++) {
//			rev=var.charAt(i)+rev;					//reverse part of string 
//		}
//		System.out.println(rev);
//		
//**********************************************************************************************
//		String s= "ankita123";				 //7. reverse "ankita123" >>  "ankita321"
//		String a = alpha(s);
//	    String b = num(s);	
//		System.out.println(a+b);
//	}
//		public static String alpha(String s) {
//			String var = s.replaceAll("[^a-zA-Z]", "");
//			return var;
//		}
//public static String num(String s) {
//	String var1 = s.replaceAll("[^0-9]", "");
//	String rev="";
//	for(int i=0;i<var1.length();i++) {
//		char var2 = var1.charAt(i);
//		if( Character.isDigit(var2)) {
//			rev= var2+rev;			
//		}		
//	}
//return rev;
//*************************************************************************************************		
//		String s1="abbabbcdd";                      //8. to remove duplicates
//		String s2="";
//		for(int i=0;i<s1.length();i++) {
//			{
//				char var = s1.charAt(i);
//				if(s2.indexOf(var)== -1) {
//					s2=s2+var;             
//				}				
//			}
//		} 
//		System.out.println(s2);
		//OR
		String str= "ABCABCABC";
		String result = "";
		
		for(int i=0; i <str.length(); i++) {
			String ch= ""+str.charAt(i);
			if(result.contains(ch)) {
				continue;
			}
			result += ch;
			
		}
		System.out.println(result);

//****************************************************************************************************
//	String s="apple$banana";                   //10.print apple banana seperately
//	 String var = s.replaceAll("[^a-zA-Z]", " ");	             
//	String[] abc = var.split(" ");
//	 for(String lmn: abc) {
//		 System.out.println(lmn); //apple banana
//	        }		



		}	}
	

