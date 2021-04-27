package com.study.ch4;

import com.study.ch3.Stack;

public class Application {
    public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>(2);
        //arrayStack.push(100);
//        arrayStack.push(200);
//        arrayStack.push(300);

        while (!arrayStack.isEmpty()) {
            System.out.println(arrayStack.pop());
        }
        System.out.println(arrayStack.pop());



    }
}
