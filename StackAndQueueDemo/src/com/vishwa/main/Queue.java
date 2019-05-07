package com.vishwa.main;

import java.util.Arrays;

public class Queue<T> implements IQueue<T> {
	
	private Object[] list;
	private int MAX_QUEUE_SIZE = 10;
	int size = 0;
	
	
	public Queue() {
		list = new Object[MAX_QUEUE_SIZE];
	}
	
	public Queue(int maxSize) {
		this.MAX_QUEUE_SIZE = maxSize;
		list = new Object[MAX_QUEUE_SIZE];
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#enqueue(T)
	 */
	@Override
	public void enqueue(T obj) {
		if(size == MAX_QUEUE_SIZE) {
			throw new ArrayIndexOutOfBoundsException("Queue is Full...");
		} else {
			list[size++] = obj;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#dequeue()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T dequeue() {
		T obj = null;
		if(size == 0) {
			throw new ArrayIndexOutOfBoundsException("Queue is Empty...");
		} else {
			obj = (T) list[0];
			shiftLeft();
		}
		return obj;
	}
	

	private void shiftLeft() {
		for(int i = 0 ; i < size - 1 ; i++) {
			list[i] = list[i+1];
		}
		list[size - 1] = null; 
		size = size - 1;
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#size()
	 */
	@Override
	public int size() {
		return size;
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return size == MAX_QUEUE_SIZE;
	}

	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#isFull()
	 */
	@Override
	public boolean isFull() {
		return size == 0;
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IQueue#peek()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T peek() {
		return (T) list[0];
	}

	@Override
	public String toString() {
		return "Queue [list=" + Arrays.toString(list) + ", MAX_QUEUE_SIZE=" + MAX_QUEUE_SIZE + ", size=" + size + "]";
	}
	
	
	

}
