package com.collection.framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserLinkedList {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList(); //creating LinkedList Object
		
		list.add("Apple");
		list.add("Samsung");
		list.add("Nokia");
		list.add("OnePlus");
		list.add("Motorola");
		list.add("Micromax");
		
		Iterator<String> it=list.iterator(); //getting Iterator
		while(it.hasNext()) //checking if iterator has element
		{
			System.out.println(it.next()); //printing data and move to next
		}
		
		System.out.println(list.get(2)); //get element by index
		
		list.remove(2); //remove element from Linked list by its index

	}

}
