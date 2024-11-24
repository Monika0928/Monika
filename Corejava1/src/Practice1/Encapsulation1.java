//go to account_main_encps class 
package Practice1;

public class Encapsulation1 {

	
		private int accno;
		private String name ;
		private double amount;
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno)//it will assign data into acc no
		{
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}

//		void  Setaccno(int akno)
//		{
//			this.accno = akno; // this is refereng class variable
//		}
//		int getaccno()
//		{
//			return accno;
//		}
		
		public static  void main(String[] args) {
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


