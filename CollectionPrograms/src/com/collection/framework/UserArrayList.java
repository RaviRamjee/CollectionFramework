package com.collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserArrayList 
{
	public static void main(String args[])
	{
     List<String> list=new ArrayList<String>(); //creating arraylist object
     list.add("one");
     list.add("two");
     list.add("three");
     list.add("four");
     list.add("five");
     list.add("six");
     
     Iterator it=list.iterator(); //creating Iterator
     while(it.hasNext()) //checking if iterator has element
     {
    	 System.out.println(it.next()); //printing data and move to next
     }
     
     System.out.println("******* get data by index  *******");
     System.out.println(list.get(1));
     
     System.out.println("********* remove elements by index  **********");
     list.remove(1);
     
     System.out.println(list.size()); //getting list size
	} 
}
