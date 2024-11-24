//Two dimensional array 
package Practice1;

public class Arrays2 {

	public static void main(String[] args) {
		
//		Ap1
//		int a[] [] =new int[3][2];
//		a[0][0]=100;
//		a[0][1]=200;
//		
//		a[1][0]=300;
//		a[1][1]=400;
		
		
//		ap2
		int a[][]= {
				{100,200},
				{300,400},
				{500,500}
			};
		
		//size of array
		System.out.println(a.length); // return the rows
		System.out.println(a[0].length);//retunr the coulmns
		
//		readsingle value from array
//		System.out.println(a[0][1]);
		
		//read all the value  form row an dcolumn 
		//using normal for loop 
		for (int r=0; r<=2;r++) //0
		{
			for(int c=0;c<2;c++) //0 col 
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	//enhanced for loop 
		for(int arr[]:a) 
		{
			for(int x:arr) {
				System.out.println(x);
			}
		}
	
	}
	

}
