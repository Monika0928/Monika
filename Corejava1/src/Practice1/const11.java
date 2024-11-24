package Practice1;

public class const11 {

	int id ;
	double salary ;
	String designation ;
	
	const11(int id){
		this.id=id;
		System.out.println(id);
		}
	const11(double salary){
		this.salary=salary;
		System.out.println(salary);
	}
	const11(String designation){
		this.designation=designation;
		System.out.println(designation);
	}
	
	
	public static void main(String[] args) {
	const11 c1 = new const11(100.0);
	const11 c2 = new const11(10);
	const11 c3= new const11("engineer");
	 
	

	}

}
