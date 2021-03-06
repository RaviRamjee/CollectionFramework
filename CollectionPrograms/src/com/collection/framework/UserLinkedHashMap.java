package com.collection.framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserLinkedHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new LinkedHashMap(); //creating LinkedHashMap Object
		
	       //Putting elements in LinkedHashMap in the form of key and value
			map.put(1,"One");
			map.put(2,"two");
			map.put(3,"three");
			map.put(4,"four");
			map.put(5,"five");
			map.put(6,"six");
			map.put(7,"seven");
			map.put(8,"eight");
			
			/*
			 Iterating LinkedHashMap object by 
			 converting object into set with the help of entryset() method
			 */
			for(Map.Entry<Integer,String> m:map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue()); //printing key and value
			}

			System.out.println(map.get(1)); //get elements by its key
			
			System.out.println(map.isEmpty()); //print true if map is empty
			
			System.out.println(map.size());  //return the size of LinkedHashMap
			
			map.replace(8,"zero"); //replace the elements by key

	}

}
