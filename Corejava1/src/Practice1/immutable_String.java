package Practice1;

public class immutable_String {

	public static void main(String[] args) {
		//String immutable 
//		String s="welcome";
//		s.concat(s);
//		System.out.println(s); // immutable 
		
		// StringBuffer mutable
		
		StringBuffer s=new StringBuffer("Welcome");
		s.append("to java"); //in stringbuffer we use append 
		System.out.println(s);

		//StringBUilder - mutable
		String S2="Welcome";
		StringBuilder s2=new StringBuilder("welcome");
		s2.append("to python");
		System.out.println(s2);
	}

}
