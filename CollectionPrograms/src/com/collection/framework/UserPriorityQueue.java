package com.collection.framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class UserPriorityQueue {

	public static void main(String[] args) {
		
		Queue<String> queue=new PriorityQueue();
		
        queue.add("apple");
        queue.add("orange");
        queue.add("mango");
        queue.add("strawberry");
        queue.add("Cherries");
        queue.add("banana");
        
        for(String fruit:queue)
        {
        	System.out.println(fruit);
        }
        
        // return size of queue
        System.out.println(queue.size());
        
        //return peek element ,if empty it return null
        System.out.println(queue.peek());
        
        //retrive head of queue and remove it,or it return null if queue is empty 
        queue.poll();
	}

}
