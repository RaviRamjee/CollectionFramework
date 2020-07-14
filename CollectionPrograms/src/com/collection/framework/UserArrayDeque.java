package com.collection.framework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class UserArrayDeque {

	public static void main(String args[])
	{
		Queue<Integer> queue=new ArrayDeque(); //creating ArrayDeque Object
		
		//inserting elements by add method of ArrayDeque
		queue.add(10);
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		queue.add(16);
		queue.add(17);
		
		Iterator<Integer> it=queue.iterator(); //getting Iterator
		while(it.hasNext()) //checking if iterator has element
		{
			System.out.println(it.next()); //printing data and move to next
		}
		
		queue.remove(); //it remove the head element of ArrayDeque and occure exception when queue is empty
		
		//retrive head of queue and remove it,or it return null if queue is empty 
		System.out.println(queue.poll()); 
		
		System.out.println(queue.element()); //retrieve head of elements but does not remove
		
		System.out.println(queue.isEmpty()); //return true if ArrayDeque contains no elements
	}
}
