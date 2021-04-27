package com.study.ch3;

public class Application {
    public static void main(String[] args) {
        // Stack<Integer> arrayStack = new ArrayStack();
        // 기존 ch2와 같이 배열로 구현한 스택
//        arrayStack.push(100);
//        arrayStack.push(200);
//
//        while(!arrayStack.isEmpty()){
//            System.out.println(arrayStack.pop());
//        }

        ListStack<Integer> listStack = new ListStack<>();
        // 새롭게 ch3에서 리스트로 구현한 스택
        listStack.push(100);
        listStack.push(200);
        listStack.push(400);


        while(!listStack.isEmpty()){
            System.out.println(listStack.pop());
        }

    }
}
