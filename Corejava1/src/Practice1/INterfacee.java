package Practice1;

	interface Shape{
		int length=10; //length is  by default static an final variable 
		int width =20;
		
		void circle();// abstract method doesnt support implementation 
		default void square () //default method
		{
		}
		static void rectangle()//static method 
		{
		}
}
	public class INterfacee implements Shape
	{
		@Override
	public void circle() // we should implement abstract method in child class 
		{
			// TODO Auto-generated method stub
			
		}
	public static void main(String[] args) {
//		Scenario 1
		INterfacee iobj = new INterfacee();
		iobj.circle();
		iobj.square();
		Shape.rectangle();// static method since its not directly created in inteerface class we need to call from interface name
//		
//		Scenario 2
		Shape sh = new INterfacee();//we are creating object and storing in interface variable
		sh.circle(); //abstract
		sh.square(); // default
		Shape.rectangle(); // static method directly accessd from interface name 
		
	
	}

	
}