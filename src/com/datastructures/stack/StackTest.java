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
		
		System.out.println("-----------------------");
		System.out.println("Stack Using Arraylist");
		StackUsingArrayList<Integer> arrayListStack = new StackUsingArrayList<Integer>();
		System.out.println("Initial arraylist stack size: " + arrayListStack.size());
		
		arrayListStack.push(70);
		arrayListStack.push(80);
		System.out.println("Size of arraylist stack: " + arrayListStack.size());
		System.out.println("Top element popped from arraylist stack: " + arrayListStack.pop());
		System.out.println("Size of arraylist stack after pop: " + arrayListStack.size());
	}
}
