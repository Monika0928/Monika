//Hashsett************************
package Practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HAshsett {

	public static void main(String[] args) {
	
		//declaration 
		HashSet myset = new HashSet();
//		Set  myset2 = new HashSet();
//		HashSet<String> myset3 = new HashSet<String>();
	
		//Adding element into hashet 
		myset.add(100);
		myset.add(10.0);
		myset.add("MOnika");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		System.out.println(myset); // [null, MOnika, A, 100, 10.0, true]
		
		System.out.println("SIze is :"+myset.size());
		
		//Removing element****************************************************************************
		myset.remove("MOnika"); // here we pass the vlaue in remove method 
		System.out.println("After removing :"+myset);
		
		//Insertion Not possible in set collection*******
		
		//Access specific element ************************************
		
//		convert hashset to arraylist**************
		
		ArrayList al = new ArrayList(myset); //coverting set into arraylist by passing hashet object
		System.out.println(al);
		System.out.println(al.get(2));
		
		//read all elements using looping statement possible only by for each loop 
		
		
//		for(Object x: myset) {
//			System.out.println(x);
//		}
		
		//iterator 
	Iterator <Object> it = myset.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
		}
	
	//clear
	myset.clear();
	System.out.println(myset);
//	OR
	System.out.println(myset.isEmpty());
	
		
		
	
	
	}

}
