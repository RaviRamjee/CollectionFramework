package com.collection.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserTreeMap {

	public static void main(String[] args) {
		
		Map<String,String> map=new TreeMap(); //creating TreeMap Object
		
	       //Putting elements in TreeMap in the form of key and value
			map.put("One","Accountant");
			map.put("two","Engineer");
			map.put("three","HR");
			map.put("four","Cashier");
			map.put("five","Manager");
			map.put("six","Banker");
			map.put("seven","Executive");
			map.put("eight","DBA");
			
			/*
			 Iterating TreeMap object by 
			 converting object into set with the help of entryset() method
			 */
			for(Map.Entry<String,String> m:map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue()); //printing key and value
			}

			System.out.println(map.get("two")); //get elements by its key
			
			System.out.println(map.isEmpty()); //print true if map is empty
			
			System.out.println(map.size());  //return the size of TreeMap
			

	}

}
