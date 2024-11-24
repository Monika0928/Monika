//String built in methods 
package Practice1;

import java.util.Arrays;

public class Stringss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Welcome";
		String s1= new String("Welcome"); // string class and its object
		
		// length()- return length of string********************
//		String s2="Monika";
//		System.out.println(s2.length()); //6
//		System.out.println("Monika".length());// 6
		
		//Concat************************************************
//		String s1="Moni";
//		String s2="ka";
//		String s3="pm";
//		System.out.println(s1+s2); // Monika
//		System.out.println(s1.concat(s2));//Monika
//		System.out.println(s1.concat(s2).concat(s3)); //Monikapm
//		System.out.println("Moni"+"ka");//Monika
		
		//trim() removes the left and right space***********************************************************
//		String s1="  Monika  ";
//		System.out.println(s1.trim().length());
		
		//charAt()- returns a character  from  a string based on index***************************************
//		String s="welcome";
//		System.out.println(s.charAt(3));
		
		//contains() methods returns value in true or false***************************************************
//		String s="monika";
//		System.out.println(s.contains("m")); // is case sensitive
		
		//equals() , equalsIgnorecase -- used for comparing the strings**************************************
//		String s1= "Welcome";
//		String s2= "elcome";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals("welcome"));
//		System.out.println(s1.equalsIgnoreCase("welcome")); //it ignores case sensitive
		
		//replace() - replace single /multiple(sequence)of characters  in a string******************************
//		String s1="welcome to selenium java  selenium python selenium c#";
//		System.out.println(s1.replace('c', 'e'));  //weleome to selenium java  selenium python selenium e#
//		System.out.println(s1.replace("selenium","python" )); //welcome to python java  python python python c#
		
		//Substring() -- extract substring from main string *******************************************************
		//starting index 0
		//ending index -1
//		String s="Selenium";
//		System.out.println(s.substring(1, 5));
		
		//replace**************************************************************************************************
		
//		String s1="xxaccndjjjcc";
//		System.out.println(s1.replace('a', 'k').replace('x', 'k'));
		
		//touppercase () tolowercase() *******************************************************************
//		String s1="MONIKA";
//		String s2="patne";
//		System.out.println(s2.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		//Split() ex1 Split string into multiple parts on delimeter************************(.,@,space is delimeters)
//		String s="abc@gmail.com";
//		System.out.println(s.substring(0,3)); // extract abc 
//		OR 
//		String a[] = s.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		
		//Spli() ex 2.......*********************************************************************8
//		String amount = "$15,20,55"; //exp 15 20 55
//		System.out.println(amount.replace("$", ""));//15,20,55
//		System.out.println(amount.replace("$", "").replace(",", ""));//152055
		
		//Split() ex3 .....*******************************************************************
//		String s1= "abc,123@xyz";
//		String arr[] =s1.split(",");
//		System.out.println(Arrays.toString(arr));//[abc, 123@xyz]
//		
//		String arr2[] =arr[1].split("@");
//		System.out.println(Arrays.toString(arr2));//123,xyz
//		
//		System.out.println(arr[0]);
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
		
		// * ()  %  ^  & -  we cannot use as delimeter 
		
		//Split ex4............
//		String name = "john kenedy";
//		System.out.println(name.contains("John"));//false 
//		//without changing john to lowercase how can we check if john is part of string
//		System.out.println(name.replace('j','J').contains("John"));
//		
//		System.out.println(name.toLowerCase().contains("john"));
		
		
		
		}

}
