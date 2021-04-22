package com.study.ch2;

public class Stack<T> {

    private int size;
    private T[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.top = 0;
        this.arr = (T[]) new Object[size];
    }

    public void push(T data) {
        this.arr[top++] = data;
    }

    public T pop() {
        return arr[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

}
