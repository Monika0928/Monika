//single dimesnional array
package Practice1;

public class Arrays1 {

	public static void main(String[] args) {
//		int a[] =new int[5];
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
//		
		//apprach2
		int a[] = {10,20,30,40};
//		System.out.println(a.length);//4 
		
		//read single value from array 
//		System.out.println(a[2]);
		
		//Read al the value from array 
		//normal for loop
//		for(int i=0; i<=a.length-1; i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		//enganced for loop
		for(int x:a) // x is just a variable a value is assigned t x and printed 
		{
			System.out.println(x);
		}
		

	}

}
