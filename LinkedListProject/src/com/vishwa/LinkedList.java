package com.vishwa;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
	}
	
	Node head;
	
	public LinkedList() {
	}
	
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node temp = head;
		if(head == null) {
			this.head = node;
		} else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void addLast(int data) {
		add(data);
	}
	
	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public int removeFirst() {
		int data = head.data;
		head = head.next;
		return data;
	}
	
	public int removeLast() {
		Node p = head;
		Node q = p.next;
		if(q == null) {
			return removeFirst();
		} 
		
		while(q.next != null) {
			p = p.next;
			q = q.next;
		}
		p.next = null;
		return q.data;
	}
	
	
	
	public boolean remove(int data) {
		if(head.data == data) {
			removeFirst();
			return true;
		}
		Node p = head;
		Node q = p.next;
		while(q !=null ) {
			if(q.data == data) {
				q = q.next;
				p.next = q;
				return true;
			}
			p = p.next;
			q = q.next;
		}
		return false;
	}

	public void displayLinkedList() {
		Node node = head;
		while(node != null ) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println("null");
	}
	
	public void reverseLinkedList() {
		Node current = head;
		Node prev = null, next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void swapPairwise() {
		Node p = head;
		Node q = null,  temp = null;
		Node newHead = p.next;
		
		while(true) {
			q = p.next;
			temp = q.next;
			q.next = p;
			
			if( temp == null || temp.next == null) {
				p.next = temp;
				break;
			}
			
			p.next = temp.next;
			p = temp;
		}
		
		head = newHead;
	}
	
}
