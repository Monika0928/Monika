package Practice1;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("prgram started");
	System.out.println("Program executed");
	Thread.sleep(10); // can be handled using throws declaration
	
//	OR
//	try {
//		Thread.sleep(10);
//	}
//	catch(InterruptedException e) {
//		System.out.println("exception handled ");
//	}
	
	System.out.println("program finished");
	System.out.println("program exited");

	}

}
