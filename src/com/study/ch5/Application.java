package com.study.ch5;

public class Application {
    public static void main(String[] args) {
        // 배열을 이용한 큐 구현
        Queue<String> queue = new ArrayQueue<>(10);
        queue.enqueue("고예리임");
        queue.enqueue("크크크크크");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        Queue<String> queue2 = new ListQueue<>();
        queue2.enqueue("고예리임");
        queue2.enqueue("크크크크크");

        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
    }
}


