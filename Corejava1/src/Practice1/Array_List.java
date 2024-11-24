//ArrayList 
package Practice1;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
	//Declarartion 
//		ArrayList <String >mylist = new ArrayList <String>(); //it allows to store only string value 
		ArrayList mylist = new ArrayList();
		
		//adding data into arraylist
		mylist.add(100);
		mylist.add(10.8);
		mylist.add("Welcome");
		mylist.add('d');
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		//Size of arraylist  ********************************************************************8
		System.out.println("size of array list:"+mylist.size());
		System.out.println("data of array:"+mylist);//[100, 10.8, Welcome, d, 100, null]
		
		//Remove the data from arraylist***********************************************************
//		mylist.remove(4);
//		System.out.println(mylist);
		
		//insertion in arraylist**********************************************************************
//		mylist.add(2,"java"); // adding index and value will be a insertion of data in middle 
//		mylist.add("list"); // add just value by default it will be added at the end of the list 
//		System.out.println(mylist);
		
		//Modify element (modify/change/replace)*********************************************************
//		mylist.set(1, 200);
//		System.out.println(mylist);
//		
		//Access specific element form arraylist **********************************************************
//		System.out.println(mylist.get(2));
		
		//reading data from array list ******************************************************************
		//using for loop
		
//		for (int i=0; i<mylist.size(); i++) {
//			System.out.println(mylist.get(i));
//		}
//		OR 
		//using for each loop
//		for(Object x:mylist) {
//			System.out.println(x);
//		}
		
		// using iteratior _ its a return type ***************************************************************
//		Iterator it = mylist.iterator(); //iterator method will iterator type of object
//		while(it.hasNext()) //will check if the element is exist or no  it will go to next element if not value found hasnext() will exxist the loop 
//			{
//			System.out.println(it.next()); // next method will get the element form array 
//		}
		
//		//checking array list is empty or not************************************************************** 
//		System.out.println(mylist.isEmpty()); // false 
		
		//	remove elements form arraylist************************************************************
//		ArrayList mylist2 = new ArrayList(); // elements need to remove should be kept in seperate array list and remvoe 
//		mylist2.add(100);
//		mylist2.add("Welcome");
//		
//		mylist.removeAll(mylist2); 
//		System.out.println(mylist);
		
		//clear all elements
		mylist.clear();
		System.out.println(mylist.isEmpty()); //  true 
	
		
	}

}
