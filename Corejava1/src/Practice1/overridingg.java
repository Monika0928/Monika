//Overriding 
package Practice1;

class bank{
	double ROi() {
		return 0;
	}
}
class icici extends bank // icici bank rate of interest is different so i will inherit and change implementation 
{
	double ROi() {
		return 10.5;
	}
}
class SBI extends bank{
	double ROi() {
		return 20.5;
	}
}


public class overridingg {

	public static void main(String[] args) {
		icici rt = new icici();
		System.out.println(rt.ROi());

	}

}
