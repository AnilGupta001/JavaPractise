package com.masai;

interface Stack {

	void push(int element) throws OverflowException;
	  int pop() throws UnderflowException;
	  int peek() throws UnderflowException;
	  static String displayStackElements(int stack[]){
	   return stack.toString().replace("[", "").replace(",", " ").replace("]", "");
	  }
	

}
