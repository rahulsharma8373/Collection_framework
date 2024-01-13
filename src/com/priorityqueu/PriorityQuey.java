package com.priorityqueu;

import java.util.PriorityQueue;

public class PriorityQuey {

	public static void main(String[] args) {
		 PriorityQueue<Integer> pQueue
         = new PriorityQueue<Integer>();
		// adding the item yto priority Queu
		 pQueue.add(10);
		 pQueue.add(20);
		 pQueue.add(15);
		 // printing the top priority queu element
		 System.out.println(pQueue.peek());
		// Printing the top element and removing it
	        // from the PriorityQueue container
	        System.out.println(pQueue.poll());
	 
	        // Printing the top element again
	        System.out.println(pQueue.peek());
		 
		 
		 
		 
		 
		 
	}

}
