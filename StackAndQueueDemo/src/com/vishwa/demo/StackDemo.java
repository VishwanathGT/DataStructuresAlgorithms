package com.vishwa.demo;

import com.vishwa.main.IStack;
import com.vishwa.main.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		IStack<Integer> stack = new Stack<>(5);
	
		System.out.println("Adding 5 elements into stack");
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		
		System.out.println("Removed 2 elements from stack");
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println("Stack peek : "+stack.peek());
	}

}
