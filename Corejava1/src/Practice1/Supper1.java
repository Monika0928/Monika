//Supper class access parent class variable using child class object reference 
package Practice1;

public class Supper1 {
	String color = "white" ;
}
class child extends Supper1{

String color = "pink";

void display() {
	System.out.println(color); //to just call parent variable directly use super keyword
		System.out.println(super.color);
}
		public static void main(String[] args) {
			child c1 = new child();
			c1.display();
		
	}

	}


