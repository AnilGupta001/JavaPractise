package com.masai;

import java.util.Arrays;

class MyStack implements Stack{
	  private int stack[];
	  private int top;
	  final static int MAX_SIZE = 5;
	  MyStack(){
	    stack = new int[MAX_SIZE];
	    top=-1;
	  }
 @Override

public void push(int element) throws OverflowException{
	 if( top==-1 && top>MAX_SIZE) {
stack[++top]=element;
 }
	 else {
	 throw new OverflowException("Stack is already full......");
	 }
 
 }
 @Override
public
	  int pop() throws UnderflowException{
	 if(top>-1 && top>=MAX_SIZE){
	 return stack[top--];
	 }
	 else {
		 throw new UnderflowException("Stack are Empty OR Full...............");
		 }
 }
 @Override
public
	  int peek() throws UnderflowException{
	 if(top>-1 && top>=MAX_SIZE){
		 return stack[top-1];
		 }
	 else {
		 throw new UnderflowException("Stack are Empty.. OR Full...........");
		 }
 }
@Override
public String toString() {
	return Arrays.toString(stack);
}
}


