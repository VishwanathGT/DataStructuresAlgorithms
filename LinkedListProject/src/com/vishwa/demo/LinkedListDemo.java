package com.vishwa.demo;

import com.vishwa.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);
		
		linkedList.displayLinkedList();
		
		linkedList.addFirst(30);
		linkedList.addLast(50);
		System.out.println("After adding at First and Last position");
		linkedList.displayLinkedList();
		
		linkedList.remove(40);
		System.out.println("After removing 40");
		linkedList.displayLinkedList();
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println("After removing First and Last elements");
		linkedList.displayLinkedList();
		
		linkedList.reverseLinkedList();
		System.out.println("Reversed Linked List");
		linkedList.displayLinkedList();
		
		linkedList.swapPairwise();
		System.out.println("After swapping pairwise");
		linkedList.displayLinkedList();
		
	}

}
