package com.study.ch3;

public class ArrayStack<T> implements Stack<T>{

    private T[] arr;
    private int top;

    public ArrayStack(int size) {
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
