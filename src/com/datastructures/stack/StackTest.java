package com.datastructures.stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Size of stack: " + stack.getSize());
		
		System.out.println("Top element popped: " + stack.pop());
		
		System.out.println("Size of stack after pop: " + stack.getSize());
	}
}
