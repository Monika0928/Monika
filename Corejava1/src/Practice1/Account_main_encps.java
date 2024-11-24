package Practice1;

public class Account_main_encps {

	public static void main(String[] args) {
		Encapsulation1 acc= new Encapsulation1();
//		acc.Setaccno(1002);
//		System.out.println(acc.getaccno());
		
		acc.setAccno(1009);
		acc.setName("Monika");
		acc.setAmount(1000.03);
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	
	
	
	}

}
