package Practice1;

public class pracnew1 {

	
	int id ;
	String name ;
	
	void employe() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		pracnew1 emp1 = new pracnew1();
		emp1.id=10;
		emp1.name="Monika";
	emp1.employe();

	}

}
