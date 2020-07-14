package com.collection.framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserLinkedHashSet {

	public static void main(String[] args) {
		
		 Set<String> set=new LinkedHashSet(); //creating object of LinkedHashSet with generic type
	        
	        //adding String elements in set
	        set.add("Manager");
	        set.add("Banker");
	        set.add("Engineer");
	        set.add("HR");
	        set.add("Accoutant");
	        set.add("ServiceMan");
	        set.add("Manager");
	        
	        //iterating set
	        for(String s:set)
	        {
	        	System.out.println(s);
	        }
	        
	        set.remove(1); //remove element
	        
	        System.out.println(set.size()); //get size of LinkedHashSet
	        
	        System.out.println(set.isEmpty()); //return true if empty
	        
		}

}
