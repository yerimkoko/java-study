package com.study.ch2;

public class Application {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack(10);
		stack.push(100);
		stack.push(200);
		stack.push(300);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		Stack<String> stack2 = new Stack(10);
		stack2.push("고예리임");
		stack2.push("강승호오");
		stack2.push("지짜");

		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}

	}

}
