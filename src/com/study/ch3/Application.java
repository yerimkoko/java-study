package com.study.ch3;

public class Application {
    public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>(100);
        arrayStack.push(100);
        arrayStack.push(200);
        arrayStack.push(300);

        while (!arrayStack.isEmpty()) {
            System.out.println(arrayStack.pop());
        }

        Stack<String> listStack = new ListStack<>();
        // 새롭게 ch3에서 리스트로 구현한 스택
        listStack.push("크로와상");
        listStack.push("크로플");
        listStack.push("와플");

        while (!listStack.isEmpty()) {
            System.out.println(listStack.pop());
        }

        Stack<Integer> listStack2 = new ListStack<>();
        listStack2.push(1000);
        listStack2.push(2000);
        listStack2.push(3000);

        while (!listStack2.isEmpty()) {
            System.out.println(listStack2.pop());
        }



    }
}
