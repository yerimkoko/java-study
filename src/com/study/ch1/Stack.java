package com.study.ch1;

public class Stack {

    private int[] arr;
    private int top;

    public Stack() {
        this.arr = new int[100];
        this.top = 0;
    }

    public Stack(int size) {
        this.arr = new int[size];
        this.top = 0;
    }

    public void push(int data) {
        arr[top++] = data;
    }

    public int pop() {
        return arr[--top];
    }

}
