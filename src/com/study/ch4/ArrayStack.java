package com.study.ch4;

import com.study.ch3.Stack;

public class ArrayStack<T> implements Stack<T> {

    private T[] arr;
    private int top;
    private int size;

    public ArrayStack(int size) {
        this.size = size;
        this.top = 0;
        this.arr = (T[]) new Object[size];
    }

    public void push(T data) {
        if (top > size - 1) {
            throw new IllegalArgumentException("더이상 넣을 수 없습니다!");
        }
        this.arr[top++] = data;
    }

    public T pop() {
        if (top == 0) {
            throw new IllegalArgumentException("스택이 비어있습니다.");
        }
        return arr[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }


}
