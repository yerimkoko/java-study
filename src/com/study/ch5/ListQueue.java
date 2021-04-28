package com.study.ch5;

import java.util.ArrayList;

public class ListQueue<T> implements Queue<T> {
    private ArrayList<T> arrayList;
    private int size;
    public ListQueue() {
        arrayList = new ArrayList<>();
        size = 0;
    }
    public void enqueue(T data) {
        arrayList.add(data);
    }
    public T dequeue() {
        return arrayList.get(size++);
    }
}
