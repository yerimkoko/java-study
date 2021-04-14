package com.study.ch1;

public class Stack {

    private int size;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        top = 0;
    }

    public void push(int data) {
        System.out.println(arr[top++] = data);
    }

    public void pop() {
        System.out.println(arr[--top]);
    }

}
