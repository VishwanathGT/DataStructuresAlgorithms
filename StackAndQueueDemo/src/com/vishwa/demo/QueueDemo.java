package com.vishwa.demo;

import com.vishwa.main.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		// queue.enqueue(60); throws Exception
		System.out.println(queue);
		System.out.println("Peek : "+queue.peek());
		System.out.println("Size : "+queue.size());

		System.out.println("Removing 2 elements");
		
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);
		System.out.println("Peek : "+queue.peek());
		System.out.println("Size : "+queue.size());
	}

}
