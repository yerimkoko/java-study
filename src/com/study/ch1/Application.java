package com.study.ch1;

public class Application {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
