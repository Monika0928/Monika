package Practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapp {

	public static void main(String[] args) {
		//declaration
		
		HashMap hm1 = new HashMap();
		HashMap<Integer , String > hm = new HashMap<Integer , String >(); // All the key should be integer and value shoud be string 
		
		//adding pairs 
		hm.put(101, "John");
		hm.put(102, "john");
		hm.put(103, "Mary");
		hm.put(104, "scot");
		hm.put(101, "moni");
		hm.put(103, "cherry"); // here 103 value is replaced and printed ass cherry
		System.out.println(hm);//{101=John, 102=john, 103=cherry, 104=scot}
		System.out.println(hm.size()); // 4 
		
		//remove one pair **********************************
		hm.remove(103);
		System.out.println("After removing pair:"+hm);
		
		//acceess value of key*********************************
		System.out.println(hm.get(102)); //john 
		
		//get all the keys 
		System.out.println(hm.keySet());
		
		//get all the values ****************************************
		System.out.println(hm.values());
		
		//get keys along with values******************************
		System.out.println(hm.entrySet());
		
		//Reading data from hashmap
		//using for each loop
		
		for(int k: hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		//using itarator 
		Iterator<Entry<Integer, String>>  it = hm.entrySet().iterator();
		while(it.hasNext())
		{
				System.out.println( it.next()); // it return an key and value 
		}
		
		hm.clear();
		System.out.println(hm.isEmpty()); // true 
	}

}
