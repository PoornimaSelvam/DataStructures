package com.datastructures.stack;

import java.util.ArrayList;

/**
 * As there are already methods in the java api ArrayList to add and remove elements which automatically manages resizing.
 *
 */
public class StackUsingArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;
	
	public void push(T t){
		add(t);
	}
	
	public T pop(){
		int currentSize = size();
		T t = get(currentSize-1);
		remove(currentSize-1);
		return t;
	}
}
