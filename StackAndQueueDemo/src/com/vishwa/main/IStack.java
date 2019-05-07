package com.vishwa.main;

public interface IStack<T> {

	void push(T obj);

	T pop();

	int size();

	T peek();

}