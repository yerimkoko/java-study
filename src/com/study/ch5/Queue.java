package com.study.ch5;

public interface Queue<T> {
    void enqueue(T data);
    T dequeue();
}
