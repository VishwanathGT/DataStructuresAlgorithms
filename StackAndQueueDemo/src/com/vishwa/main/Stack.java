package com.vishwa.main;

import java.util.Arrays;

public class Stack<T> implements IStack<T> {
	
	private Object[] list;
	private int MAX_LIMIT;
	private int index = 0;
	
	
	
	public Stack() {
	    this.MAX_LIMIT = 10;
	    this.list = new Object[MAX_LIMIT];
	}
	
	public Stack(int max) {
		this.MAX_LIMIT = max;
	    this.list = new Object[MAX_LIMIT];
	}

	
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IStack#push(T)
	 */
	@Override
	public void push(T obj) {
		if(list.length == MAX_LIMIT) {
			list[index++] = obj;
		} else {
			throw new ArrayIndexOutOfBoundsException("Stack is Full !!!");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IStack#pop()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T pop() {
		T obj = null;
		if(index == 0) {
			throw new ArrayIndexOutOfBoundsException("Stack is Empty !!!");
		} else {
			index = index -1;
			obj = (T) list[index];
			list[index] = null;
		}
		return obj;
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IStack#size()
	 */
	@Override
	public int size() {
		return index + 1;
	}
	
	/* (non-Javadoc)
	 * @see com.vishwa.main.IStack#peek()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T peek() {
		return (T) list[index-1];
	}
	
	@Override
	public String toString() {
		return "Stack [list=" + Arrays.toString(list) + ", MAX_LIMIT=" + MAX_LIMIT + ", Size=" + index+1 + "]";
	}
	
	
	

}
