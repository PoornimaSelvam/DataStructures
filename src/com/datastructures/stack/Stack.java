package com.datastructures.stack;

import java.util.Arrays;

/**
 * A linear data structure which stores newly added items at its top and retrieves newly added items from its top. 
 * push – An item is added to the stack. The newly added item is always placed at its top.
 * pop – Removing an item from the stack. Every pop operation returns the item at the top of the stack. 
 * The item popped out is removed from the stack when this operation is performed.
 */
public class Stack {
	private int size;
	//using array
	private int[] elements;
	private int top;
	
	/**
	 * Constructor to initialize the stack array.
	 */
	public Stack(int size){
		this.size = size;
		elements = new int[size];
		top = 0;
	}
	
	/**
	 * Push the items to stack, which insert from top of stack.
	 */
	public void push(int value){
		if(top == elements.length){
			//expandSize();
			throw new StackFullException("Cannot push " +value+ " stack is full.");
		}
		elements[top++] = value;	
	}
	
	/**
	 * Pop items from stack, which will remove from top of stack. 
	 */
	public int pop(){
		if(top==0){
			throw new StackEmptyException("Stack is empty");
		}
		return elements[--top];
	}

	private void expandSize() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public int getSize() {
		return top;
	}

}
