//static memory allocation 
package Practice1;

public class prac2 {

	static int a=10;     //global var// a=30
	
	static {
		 int a=20;    //LOCAL VAR	
		 System.out.println(a);
		 a=78;    //20 will bcm 78
		 System.out.println(a);
		}

	static {
		 System.out.println(a);
		 a=30;    //LOCAL VAR	reinitializing the global variable as a=30 / o/p is 30
		 System.out.println(a);
		
		}
		public static void main(String[] args) {	
		System.out.println(a);
		}
	}
	
	


