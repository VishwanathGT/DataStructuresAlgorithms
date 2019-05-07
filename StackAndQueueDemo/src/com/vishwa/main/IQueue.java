package com.vishwa.main;

public interface IQueue<T> {

	void enqueue(T obj);

	T dequeue();

	int size();

	boolean isEmpty();

	boolean isFull();

	T peek();

}