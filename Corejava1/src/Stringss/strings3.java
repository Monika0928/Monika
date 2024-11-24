package Stringss;

public class strings3 {

	public static void main(String[] args) {

			String s1="I LOVE BANGALORE";   // lower a and i 
//			String s2="";
//			for(int i=0;i<s1.length();i++) {
//				char var=s1.charAt(i);
//				if (var=='A'|| var=='I') {
//					String s3="";
//					s3=s3+var;
//					s3=s3.toLowerCase();
//					s2=s2+s3;
//				}
//				else {
//					s2=s2+var;
//				}
//			}
//			System.out.println(s2);
//		}

//***********************************************************************************************

		//String s1="mangolover";       // upper a
		//String s2="";
		//for(int i=0; i<s1.length();i++) {
//			char var=s1.charAt(i);
//			if(var=='a') {
//				String s3="";
//				s3=s3+var;
//				s3=s3.toUpperCase();
//				s2=s2+s3;
//			}
//			else {
//			s2=s2+var;
		//}
		//}
		//System.out.println(s2);

//***********************************************************************************************
		//only testyantra upper
//		String s="i love testyantra";
//		String[] var = s.split(" ");
//		String s3="";
//		for (int i=0; i<var.length;i++) {
//			if(var[i].equals("testyantra")) {
//				var[i] = var[i].toUpperCase();
//				s3=s3+var[i]+ " ";
//			}
//			else {
//				s3= s3+var[i];
//			}
//		}
//		System.out.println(s3);
		
//************************************************************************************************
		for(int i=0; i < s1.length();i++) {                     //4. only Upper char
		char c = s1.charAt(i);
		if(Character.isUpperCase(c)) {
			System.out.println(c);
		}}				
		
//	
	}}


