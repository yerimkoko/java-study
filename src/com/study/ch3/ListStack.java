package com.study.ch3;

import java.util.ArrayList;

public class ListStack<T> implements Stack<T> {

    private ArrayList<T> arrayList;

    public ListStack() {
        arrayList = new ArrayList<>();
    }

    public void push(T inputData) {
        arrayList.add(inputData);
    }

    public T pop() {
        T t = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return t;
    }

    public boolean isEmpty() {
        return arrayList.size() == 0;
    }

}
