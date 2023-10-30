package com.sunbeam;

public class DescStack {

	private int arr[];
	private int top ;
	private final int SIZE ;
	
	public DescStack(int size) {
      
		SIZE = size ;
		arr = new int[SIZE] ;
		top =  SIZE ;
	}
	
	public void push(int data) {
		top-- ;
		arr[top] = data ;
	}
	
	public int peek() {
		return arr[top] ;
	}
	
	public int pop() {
		int data = arr[top] ;
		top++;
		return data ;
	}
	
	public boolean isEmpty() {
		return top == SIZE-1 ;
	}
	
	public boolean isFUll() {
		return top == 0  ;
	}
}
