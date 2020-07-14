package com.collection.framework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UserTreeSet {

	public static void main(String[] args) {

		 Set<String> set=new TreeSet(); //creating object of TreeSet with generic type
	        
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
	        
	        System.out.println(set.size()); //get size of TreeSet
	        
	        System.out.println(set.isEmpty()); //return true if empty
	        
	        Iterator<String> it=set.iterator(); //creating Iterator
	        
	        while(it.hasNext()) 
	        {
	        	System.out.println(it.next());
	        }
	        

	}

}
