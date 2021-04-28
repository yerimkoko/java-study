package com.study.ch5;

import java.lang.reflect.Array;

public class ArrayQueue<T> implements Queue<T>{
    private int size;
    private T[] arr;
    private int top;
    private int bottom;
    public ArrayQueue(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        top = 0;
        bottom = 0;
    }
    public void enqueue(T data) {
        arr[top++] = data;
    }

    public T dequeue() {
        return arr[bottom++];
    }


}
